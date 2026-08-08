import java.util.Scanner;

public class AttendanceCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Create an array to store attendance for 7 days
        int[] attendance = new int[7];
        int presentCount = 0;

        // Step 2: Read attendance values (1 = Present, 0 = Absent)
        System.out.println("Enter attendance for 7 days (1 for Present, 0 for Absent):");
        for (int i = 0; i < attendance.length; i++) {
            attendance[i] = sc.nextInt();
            if (attendance[i] == 1) {
                presentCount++;  // Count present days
            }
        }

        // Step 3: Calculate percentage
        double percentage = (presentCount / 7.0) * 100;

        // Step 4: Display result
        System.out.println("Total Present Days: " + presentCount);
        System.out.println("Attendance Percentage: " + percentage + "%");

        if (percentage >= 75) {
            System.out.println("Eligible for Exam");
        } else {
            System.out.println("Not Eligible");
        }

        sc.close();
    }
}
