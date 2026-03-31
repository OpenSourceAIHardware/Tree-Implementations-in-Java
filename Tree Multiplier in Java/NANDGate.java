public class NANDGate {
private boolean inputA;
private boolean inputB;
private boolean Output;

        public NANDGate(boolean InputA, boolean InputB) {
            inputA = InputA;
            inputB = InputB;
            Output = !(inputA && inputB);
        }
        public boolean output() {
            return Output;
        }
}