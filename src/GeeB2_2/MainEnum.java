

package GeeB2_2;

public class MainEnum {
    public static void main(String[] args) {
        int a = DayOfWeek.MONDAY.getJobHour(DayOfWeek.FRIDAY);
        System.out.println(a);
    }

    public enum DayOfWeek{
        MONDAY(8),
        TUESDAY(8),
        WEDNESDAY(8),
        THURSDAY(8),
        FRIDAY(7),
        SATURDAY(0),
        SUNDAY(0);
        public int hour;

        DayOfWeek(int hour){
            this.hour = hour;
        }

        public int getJobHour(DayOfWeek dayOfWeek){
            boolean isDo = false;
            int jobHours = 0;
            for (DayOfWeek d: DayOfWeek.values()) {
                if (d == dayOfWeek || isDo == true){
                    isDo = true;
                    jobHours += d.hour;
                }
            }

            return jobHours;
        }
    }

    }

