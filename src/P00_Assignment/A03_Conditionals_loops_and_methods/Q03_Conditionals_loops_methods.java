package P00_Assignment.A03_Conditionals_loops_and_methods;

// 03. Calculate CGPA and average marks.

public class Q03_Conditionals_loops_methods {
    public static void main(String[] args) {
        float[] marks = {93.5f, 80f, 90.0f, 86f, 88f};
        float totalMarks = 0;
        for (int i = 0; i < marks.length; i++) {
            totalMarks = totalMarks + marks[i];
        }
        float avgMarks = (totalMarks) / (marks.length);
        System.out.println("Average marks : " + avgMarks);
        System.out.println("CGPA : "+ avgMarks / 9.5);
    }
}
