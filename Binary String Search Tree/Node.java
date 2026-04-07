public class Node {
private String leftOutput;
private String rightOutput;

    public Node(String input, String key) {
        int n = input.length();
        int keyLength = key.length();
        int referenceLength = 0;
        if(keyLength > n){
            referenceLength = n;
        } else if(n > keyLength) {
            referenceLength = keyLength;
        } else if(n == keyLength) {
            referenceLength = n;
        }
        for(int i = 0; i < referenceLength; i++) {
            if(input.charAt(i) < (key.charAt(i))) {
                leftOutput = input;
                rightOutput = "----";
                break;
            } else if(input.charAt(i) > (key.charAt(i))) {
                rightOutput = input;
                leftOutput = "----";
                break;
            }
        }
        if(input.equals(key)) {
            leftOutput = "****";
            rightOutput = "****";
        }
    }
    public String LeftOutput() {
        return leftOutput;
    }
    public String RightOutput() {
        return rightOutput;
    }

}