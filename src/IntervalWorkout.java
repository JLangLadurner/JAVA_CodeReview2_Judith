/*(20) Create new class IntervalWorkout that can contain:
Several Exercises
Number of repetitions
Breaktime (in seconds)
 */

public class IntervalWorkout {

    private Exercise[] exercise; //'use' Exercise array
    private int reps;
    private int breakT;

    public IntervalWorkout(Exercise[] exercise, int reps, int breakT) {

        this.exercise = exercise;
        this.reps = reps;
        this.breakT = breakT;
    }

    public void createIntervall() {
        System.out.println("****************************");
        System.out.println("Interval Workout STARTS !!!!");
        System.out.println("****************************");


        for (int i = 1; i < reps; i++) {

            System.out.println("============================");
            System.out.println("Round " + i + " : ");

            for (Exercise ex : exercise) // reminder: do not use curlies
                System.out.println(ex.getName());

                if (i < reps) {
                    System.out.println("============================");
                    System.out.println("DO THE BREAK (" + breakT + " SECONDS)");
                }
        }
        System.out.println("****************************");
        System.out.println(" CONGRATS - YOU ARE DONE !!!");
        System.out.println("****************************");

    }
}
