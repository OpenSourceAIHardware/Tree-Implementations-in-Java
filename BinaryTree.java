import java.util.ArrayList;

public class BinaryTree {
private int treeInput;
public Node[] NodeList;
//private SinglyLinkedList<Integer> PathList;

    public BinaryTree(ArrayList<Integer> Data, int TreeInput) {
        treeInput = TreeInput;
        //Initialize fields and variables
        int n = Data.size();
        int r = 0;
        int normalizedN = 0;
        //Initializing the array to store all the Nodes
        NodeList = new Node[n];
        Node[] nodeswithnoRightEdge = new Node[n];
        //Singly linked list of the NodeList array indices of the path from the root of the tree to the desired element.
        //PathList = new SinglyLinkedList<Integer>();
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
        //Initial Node
        if(Pint == false) {
        NodeList[(normalizedN-1)/2] = new Node(treeInput, Data.get((normalizedN-1)/2));
        // if(((NodeList[(normalizedN-1)/2].LeftOutput() == 0 ^ NodeList[(normalizedN-1)/2].RightOutput() == 0) && !(NodeList[(normalizedN-1)/2].LeftOutput() == -1 || NodeList[(normalizedN-1)/2].RightOutput() == -1)) || (NodeList[(normalizedN-1)/2].LeftOutput() == -1 && NodeList[(normalizedN-1)/2].RightOutput() == -1)) {
        //     PathList.addLast((normalizedN-1)/2);
        // }
        NodeLeftOutput[(normalizedN-1)/2] = NodeList[(normalizedN-1)/2].LeftOutput();
        NodeRightOutput[(normalizedN-1)/2] = NodeList[(normalizedN-1)/2].RightOutput();
        r = 2;
        } else if(Pint == true) {
        NodeList[(normalizedN-1)] = new Node(treeInput, Data.get(normalizedN-1));
        // if(((NodeList[(normalizedN-1)].LeftOutput() == 0 ^ NodeList[(normalizedN-1)].RightOutput() == 0) && !(NodeList[(normalizedN-1)].LeftOutput() == -1 || NodeList[(normalizedN-1)].RightOutput() == -1)) || (NodeList[(normalizedN-1)].LeftOutput() == -1 && NodeList[(normalizedN-1)].RightOutput() == -1)) {
        //     PathList.addLast(normalizedN-1);
        // }
        NodeLeftOutput[(normalizedN-1)] = NodeList[(normalizedN-1)].LeftOutput();
        NodeRightOutput[(normalizedN-1)] = NodeList[(normalizedN-1)].RightOutput();
        r = 1;
        }
        if(Pint == false && (Math.log(n+1)/(Math.log(2)))%1 != 0) {
            nodeswithnoRightEdge[(normalizedN-1)/2] = NodeList[(normalizedN-1)/2];
        }
        int k = 0;
        int s = 0;
        int t = 0;
        for(int i = r; i<=P; i++) {
            int jStep = ((normalizedN-1)/(1<<(i-1))+1);
            int l = (normalizedN-1)/(1<<(i-1));
            int lStep = 2*jStep;
            int sStep = ((jStep-1)/2)+1;
            k = 0;
            for(int j = (jStep-1)/2; (j < n)&&(l < n); j = j + jStep) {
                s = j/2;
                k++;
                if(k%2 == 1) {
                    if(r == 2 && NodeList[l] == null) {
                        for(int o = n-1; o >= 0 ; o--) {
                            if(nodeswithnoRightEdge[o] != null) {
                                t = o;
                                break;
                            }
                        }
                        NodeList[l] = new Node(nodeswithnoRightEdge[t].RightOutput(), Data.get(l));
                        NodeLeftOutput[l] = NodeList[l].LeftOutput();
                        NodeRightOutput[l] = NodeList[l].RightOutput();
                    }
                    NodeList[j] = new Node(NodeLeftOutput[l], Data.get(j));
                    // if(((NodeList[j].LeftOutput() == 0 ^ NodeList[j].RightOutput() == 0) && !(NodeList[j].LeftOutput() == -1 || NodeList[j].RightOutput() == -1)) || (NodeList[j].LeftOutput() == -1 && NodeList[j].RightOutput() == -1)) {
                    //     PathList.addLast(j);
                    // }
                    NodeLeftOutput[j] = NodeList[j].LeftOutput();
                    if((s+sStep) > n-1) {
                        nodeswithnoRightEdge[j] = NodeList[j];
                    } else {
                    NodeRightOutput[j] = NodeList[j].RightOutput();
                    }
                } else if(k%2 == 0) {
                    NodeList[j] = new Node(NodeRightOutput[l], Data.get(j));
                    // if(((NodeList[j].LeftOutput() == 0 ^ NodeList[j].RightOutput() == 0) && !(NodeList[j].LeftOutput() == -1 || NodeList[j].RightOutput() == -1)) || (NodeList[j].LeftOutput() == -1 && NodeList[j].RightOutput() == -1)) {
                    //     PathList.addLast(j);
                    // }
                    NodeLeftOutput[j] = NodeList[j].LeftOutput();
                    if((s+sStep) > n-1) {
                        nodeswithnoRightEdge[j] = NodeList[j];
                    } else {
                    NodeRightOutput[j] = NodeList[j].RightOutput();
                    }
                    l = l + lStep;
                }
            }
        }
    }

    public void TreeScanner() {
        // System.out.println("Path of the search through the binary tree: ");
        // for(int i = 0; i < PathList.size(); i++) {
        //     System.out.println(PathList.first());
        //     PathList.removeFirst();
        // }
        // System.out.println(PathList.last());
        // if(NodeList[PathList.last()].LeftOutput() == -1 && NodeList[PathList.last()].LeftOutput() == -1) {
        //     System.out.println("Element found at array index: "+PathList.last());
        // } else {
        //     System.out.println("The element was not found in the array!");
        // }
    }

}