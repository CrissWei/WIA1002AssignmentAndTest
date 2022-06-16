package WIA1002LabAssignment.Lab9Recursion.Lab9;

public class Q2x {
    public static void main(String[] args) {
        permuteString("排列组合情况：","XYZ");
    }
    public static void permuteString(String candidate, String permuteSTR) {
        // base case
        if (permuteSTR == null) {
            // if the loop terminate index out of bound will pass permuteSTR = null
            return;
        }
        if (permuteSTR.length() == 0) {
            // the string to permute is 0
            System.out.println(candidate);
        }

        for (int i = 0; i < permuteSTR.length(); i++) {
            String newCandidate = candidate + permuteSTR.charAt(i);
            String newPermuteSTR = permuteSTR.substring(0, i) + permuteSTR.substring(i + 1);

            //递归调用
            permuteString(newCandidate, newPermuteSTR);

        }

    }
}
