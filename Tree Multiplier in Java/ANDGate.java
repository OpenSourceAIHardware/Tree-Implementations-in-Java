public class ANDGate{

private boolean Output;

          public ANDGate(boolean InputA, boolean InputB) {
             Output = InputA && InputB;
          }

          public boolean output() {
             return Output;
          }

}