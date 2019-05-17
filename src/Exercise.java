/*(20) Create a Java class Exercise containing following parameters:
        Exercise´s name
        Description
        Duration (in sec)
        Position (floor or standup)*/

//research: https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html
//http://tutorials.jenkov.com/java/enums.html
//https://stackoverflow.com/questions/32733084/pass-a-simple-enum-into-a-constructor-in-java

//By the convention all the self defined types (class names, interface names, enum names)
// should begin with a capital letter.

public class Exercise {
    private String name;
    private String description;
    private int second;
    private Position aPosition;// field of type for position
    public enum Position {
        STAND_UP,
        FLOOR
    }
    //take a reference to an object of type position
    public Exercise (String name, String description, int second, Position aPosition){
        this.name= name;
        this.description= description;
        this.second = second;
        this.aPosition = aPosition;//assign the parameter in the field


    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public int getSecond(){
        return second;
    }

    public Position getaPosition(){
        return aPosition;
    }
// research: string formatting/https://dzone.com/articles/java-string-format-examples

    public void showExercise(){

        System.out.format("%-60s" + "DURATION: " + "%d" + " seconds" + "%n", this.name, this.second);
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("DESCRIPTION: " + this.description + "\n\n");


    }


}
