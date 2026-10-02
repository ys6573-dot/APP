public class HospitalMonitoring {
    public static void main(String[] args) {
        Thread emergencyAlert = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " | Priority: " + Thread.currentThread().getPriority());
        }, "EmergencyAlert");

        Thread vitalMonitor = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " | Priority: " + Thread.currentThread().getPriority());
        }, "VitalMonitor");

        Thread reportGenerator = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " | Priority: " + Thread.currentThread().getPriority());
        }, "ReportGenerator");

        emergencyAlert.setPriority(Thread.MAX_PRIORITY);
        vitalMonitor.setPriority(Thread.NORM_PRIORITY);
        reportGenerator.setPriority(Thread.MIN_PRIORITY);

        emergencyAlert.start();
        vitalMonitor.start();
        reportGenerator.start();
    }
}
