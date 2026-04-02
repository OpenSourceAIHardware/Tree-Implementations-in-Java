public class NANDGate {
private boolean Output;

        public NANDGate(boolean InputA, boolean InputB) {
            Output = !(InputA && InputB);
        }
        public boolean output() {
            return Output;
        }
}