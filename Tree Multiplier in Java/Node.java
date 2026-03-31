public class Node {

private boolean inputA;
private boolean inputB;
private boolean inputC;
private boolean Sum;
private boolean Carry;

            public Node(boolean InputA, boolean InputB, boolean InputC) {
                inputA = InputA;
                inputB = InputB;
                inputC = InputC;
                Sum = inputA ^ inputB ^ inputC;
                Carry = (inputA && inputB) || (inputB && inputC) || (inputA && inputC);
            }

            public boolean sum() {
                return Sum;
            }

            public boolean carry() {
                return Carry;
            }

}