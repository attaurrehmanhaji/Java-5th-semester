/**
 * The class AppointmentSchedulerProject allows users to schedule, view, and cancel appointments using
 * a simple console-based interface.
 */
// The statement `import java.util.ArrayList;` is importing the `ArrayList` class from the `java.util`
// package. This allows the code to use the `ArrayList` class in the program without having to specify
// the full package name every time `ArrayList` is used.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Appointment {
    private String name;
    private String date;
    private String time;

    public Appointment(String name, String date, String time) {
        this.name = name;
        this.date = date;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}

class AppointmentScheduler {
    private List<Appointment> appointments;

    public AppointmentScheduler() {
        this.appointments = new ArrayList<>();
    }

    public void scheduleAppointment(String name, String date, String time) {
        Appointment appointment = new Appointment(name, date, time);
        appointments.add(appointment);
        System.out.println("Appointment scheduled successfully.");
    }

    public void viewAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments scheduled.");
        } else {
            System.out.println("Scheduled Appointments:");
            for (Appointment appointment : appointments) {
                System.out.println(appointment);
            }
        }
    }

    public void cancelAppointment(String name, String date, String time) {
        Appointment appointmentToRemove = null;
        for (Appointment appointment : appointments) {
            if (appointment.getName().equals(name) && appointment.getDate().equals(date)
                    && appointment.getTime().equals(time)) {
                appointmentToRemove = appointment;
                break;
            }
        }

        if (appointmentToRemove != null) {
            appointments.remove(appointmentToRemove);
            System.out.println("Appointment cancelled successfully.");
        } else {
            System.out.println("Appointment not found.");
        }
    }
}

public class AppointmentSchedulerProject {
    public static void main(String[] args) {
        AppointmentScheduler scheduler = new AppointmentScheduler();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Schedule Appointment");
            System.out.println("2. View Appointments");
            System.out.println("3. Cancel Appointment");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter date (YYYY-MM-DD): ");
                    String date = scanner.nextLine();
                    System.out.print("Enter time (HH:MM): ");
                    String time = scanner.nextLine();
                    scheduler.scheduleAppointment(name, date, time);
                    break;
                case 2:
                    scheduler.viewAppointments();
                    break;
                case 3:
                    System.out.print("Enter name: ");
                    String cancelName = scanner.nextLine();
                    System.out.print("Enter date (YYYY-MM-DD): ");
                    String cancelDate = scanner.nextLine();
                    System.out.print("Enter time (HH:MM): ");
                    String cancelTime = scanner.nextLine();
                    scheduler.cancelAppointment(cancelName, cancelDate, cancelTime);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
