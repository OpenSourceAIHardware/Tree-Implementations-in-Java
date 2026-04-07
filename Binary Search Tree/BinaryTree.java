public class BinaryTree {

    public BinaryTree(int[] Data, int treeInput) {
        //Initialize fields and variables
        int n = Data.length;
        boolean foundInData = false;
        int r = 0;
        int normalizedN = 0;
        //Initializing the array to store all the Nodes
        Node[] NodeList = new Node[n];
        //We find logarithm base 2 of the array length, n, and we take the ceiling of the logarithm
        int P = (int) Math.ceil(Math.log(n)/(Math.log(2)));
        double Q = (Math.log(n)/(Math.log(2)));
        //To find the length of the array to be used by the tree, we take 2 to the power of P. We need to find the nearest power of 2 that is greater than or equal to the length of the original array.
        boolean Pint = false;
        if (Q%1 == 0) {
            normalizedN = (1<<P);
            Pint = true;
        } else if (Q%1 != 0) {
            normalizedN = ((1<<P)-1);
            Pint = false;
        }
        //Arrays to collect Node outputs
        int[] NodeLeftOutput = new int[normalizedN];
        int[] NodeRightOutput = new int[normalizedN];
        //Variable to determine if the tree synthesis loop should continue
        boolean breakInnerLoop = false;
        //Initial Node
        if(Pint == false) {
        NodeList[(normalizedN-1)/2] = new Node(treeInput, Data[(normalizedN-1)/2]);
        NodeLeftOutput[(normalizedN-1)/2] = NodeList[(normalizedN-1)/2].LeftOutput();
        NodeRightOutput[(normalizedN-1)/2] = NodeList[(normalizedN-1)/2].RightOutput();
        r = 2;
        if(NodeList[(normalizedN-1)/2].LeftOutput() == -1 && NodeList[(normalizedN-1)/2].RightOutput() == -1) {
            System.out.println("The item has been found! It is located in array index: "+(normalizedN-1)/2);
            foundInData = true;
            breakInnerLoop = true;
        }
        } else if(Pint == true) {
        NodeList[(normalizedN-1)] = new Node(treeInput, Data[(normalizedN-1)]);
        NodeLeftOutput[(normalizedN-1)] = NodeList[(normalizedN-1)].LeftOutput();
        NodeRightOutput[(normalizedN-1)] = NodeList[(normalizedN-1)].RightOutput();
        r = 1;
        if(NodeList[(normalizedN-1)].LeftOutput() == -1 && NodeList[(normalizedN-1)].RightOutput() == -1) {
            System.out.println("The item has been found! It is located in array index: "+(normalizedN-1));
            foundInData = true;
            breakInnerLoop = true;
        }
        }
        int k = 0;
        for(int i = r; i<=P; i++) {
            if(breakInnerLoop == true) {
                break;
            }
            int jStep = ((normalizedN-1)/(1<<(i-1))+1);
            int l = (normalizedN-1)/(1<<(i-1));
            int lStep = 2*jStep;
            k = 0;
            for(int j = (jStep-1)/2; (j < n)&&(l < n); j = j + jStep) {
                k++;
                if(k%2 == 1) {
                    if(r == 2 && NodeList[l] == null) {
                        NodeList[l] = new Node(NodeRightOutput[(normalizedN-1)/2], Data[l]);
                        if((NodeList[l].LeftOutput() == -1) && (NodeList[l].RightOutput() == -1)) {
                            System.out.println("The item has been found! It is located in array index: "+l);
                            foundInData = true;
                            breakInnerLoop = true;
                            break;
                        }
                        NodeLeftOutput[l] = NodeList[l].LeftOutput();
                        NodeRightOutput[l] = NodeList[l].RightOutput();
                    }
                    NodeList[j] = new Node(NodeLeftOutput[l], Data[j]);
                    //Checks if the Node outputs at index j are both equal to -1
                    if((NodeList[j].LeftOutput() == -1) && (NodeList[j].RightOutput() == -1)) {
                        System.out.println("The item has been found! It is located in array index: "+j);
                        foundInData = true;
                        breakInnerLoop = true;
                        break;
                    }
                    NodeLeftOutput[j] = NodeList[j].LeftOutput();
                    NodeRightOutput[j] = NodeList[j].RightOutput();
                } else if(k%2 == 0) {
                    NodeList[j] = new Node(NodeRightOutput[l], Data[j]);
                    //Checks if the Node outputs at index j are both equal to -1
                    if((NodeList[j].LeftOutput() == -1) && (NodeList[j].RightOutput() == -1)) {
                        System.out.println("The item has been found! It is located in array index: "+j);
                        foundInData = true;
                        breakInnerLoop = true;
                        break;
                    }
                    NodeLeftOutput[j] = NodeList[j].LeftOutput();
                    NodeRightOutput[j] = NodeList[j].RightOutput();
                    l = l + lStep;
                }
            }
        }
        if(foundInData == false) {
        System.out.println("The item is not in the list!");
        }
    }

}