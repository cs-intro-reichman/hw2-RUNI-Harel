public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        // Does the same with the minutes part of the input.
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));

        int timeToAdd = Integer.parseInt(args[1]);

        // System.out.println("Hours: " + hours);
        // System.out.println("Minutes: " + minutes);
        // System.out.println("Time to add: " + timeToAdd);

        int totalMinutes = (hours * 60) + minutes + timeToAdd;
        int totalHours = totalMinutes / 60;
        int newHours = totalHours % 24;
        int newMinutes = totalMinutes - totalHours * 60;

        // System.out.println("New Hours: " + newHours);
        // System.out.println("Minutes: " + newMinutes);

        String hoursToPrint;
        String minutesToPrint;

        if (newHours >= 0 && newHours < 10) {
            hoursToPrint = "0" + String.valueOf(newHours);
        } else {
            hoursToPrint = String.valueOf(newHours);
        }

        if (newMinutes >= 0 && newMinutes < 10) {
            minutesToPrint = "0" + String.valueOf(newMinutes);
        } else {
            minutesToPrint = String.valueOf(newMinutes);
        }

        System.out.println(hoursToPrint + ":" + minutesToPrint);
    }
}