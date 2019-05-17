/*You need to create a basis for a fitness application! For the start, you need to take care of following 6 exercises,
that have a description, and that are done in for a certain amount of time.*/

public class Main {

    public static void main(String[] args) {
        Exercise type1 = new Exercise ("Push-up","Place your hands on the floor. Raise up onto your toes so that all of your body weight is on your hands and your feet. Bend your elbows and lower your chest down toward the floor. Then, push off the floor and extend them so that you return to " +
                "starting position. Do this for 30 seconds.",30, Exercise.Position.FLOOR);
        Exercise type2 = new Exercise("Planks", "Start on the floor on your hands and knees. Lower your forearms to the floor with elbows positioned under your shoulders and your hands shoulder-width apart. Maintain a straight line from heels through the top of your head, looking down at the floor. " +
                "Now, tighten your abs and hold. Do this for 90 seconds.", 90, Exercise.Position.FLOOR);
        Exercise type3 = new Exercise("Squats", "Stand with feet a little wider than shoulder-width apart, hips stacked over knees, and knees over ankles. Extend arms out straight so they are parallel with the ground, palms facing down.  Goto a squat and exhale, then explode back up to standing, " +
                "driving through heels. Do this for 45 seconds.",45,Exercise.Position.STAND_UP);
        Exercise type4 = new Exercise ("Backward Kick", "Get in an all-fours position with your knees and hands on the floor. Your back is straight. Lift your leg up, and straighten it. Form a 90 degree angle in the ankle.  Raise your leg with your heel pushing up and constantly forming a 90 degree " +
                "angle in between the legs. Return to the starting position and repeat. Do this for 60 seconds.\n" +
                "\n", 60, Exercise.Position.FLOOR);
        Exercise type5 = new Exercise("Leg Curl", "Stand up on, shift your weight to  one feet and pull another heel toward your buttocks. Stay for 15 seconds, then repeat with your other leg.   Do this for 90 seconds.\n" +
                "\n", 90, Exercise.Position.STAND_UP);
        Exercise type6 = new Exercise ("Sidewards Back Stretch ", " Go into standing position, put your hands on your hips and then stretch with one hand over your head to the opposite side. Repeat with other hand. Do this for 60 seconds.", 60, Exercise.Position.STAND_UP);




    }
}
