public class SecondsInADay {
        public static void main(String[] args) {
            int currentHours = 14;
            int currentMinutes = 34;
            int currentSeconds = 42;
            int totalSecInADay = 86400;
            int currentSecSpent = (currentHours * 3600) + (currentMinutes * 60) + currentSeconds;
            int remainingSec = totalSecInADay - currentSecSpent;
            System.out.println(remainingSec);

            // Write a program that prints the remaining seconds (as an integer) from a
            // day if the current time is represented bt the variables
        }
}

