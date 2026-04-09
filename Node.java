public class Node {
private int leftOutput;
private int rightOutput;
private int input;

    public Node(int Input, int key) {
        input = Input;
        if(input<key) {
            leftOutput = input;
            rightOutput = 0;
        }
        if(input>key) {
            rightOutput = input;
            leftOutput = 0;
        }
        if(input == key) {
            leftOutput = -1;
            rightOutput = -1;
        }
    }
    public int LeftOutput() {
        return leftOutput;
    }
    public int RightOutput() {
        return rightOutput;
    }
    public int Input() {
        return input;
    }

}