public class Owner 
{
    public static String firstName = "Samuel";
    public static String lastName = "Ramdial";
    public static String quote = "\"Trust the process\"";
    public static String caption = "Standing in front of Woodward Hall during my summer tour.";
    public static String personal = "My name is Samuel Ramdial, and I was born and raised in Fayetteville, North Carolina. Some of my personal hobbies include playing video games, watching netflix, and sleeping.";
    public static String professional = "pass";
    public static String academic = "Pine Forest High School, North Carolina School of Science and Math, Fayetteville Technical Community College";
    public static String programmingSoftware = "Beginner level experience with Python, HTML, as well as CSS.";
    public static String class1 = "ITSC 1600 Computing Professionals";
    public static String class2 = "ITSC 1212 Introduction to Computer Science";
    public static String class3 = "Math 1241 Calculus 1";
    public static String class4 = "PSYC 1101 General Psychology";
    public static String class5 = "PSYC 1101L General Psychology Lab";
    public static String class6 = "SOCY 1101 Intro to Sociology";
    public static int graduationYear = 2025; 
    public static String story = "pass";
    public static Boolean fromNC = true;

    public String toString()
    {
        String objectSummary = "Owner Information"
        + "\n" + 
                               "-----------------------------" 
        + "\n" + 
                               firstName + " " + lastName 
        + "\n" + 
                               "Quote: " + quote 
        + "\n" + 
                               "Photo Caption: " + caption 
        + "\n" + 
                               "Personal: " + personal 
        + "\n" + 
                               "Professional: " + professional 
        + "\n" + 
                               "Academic: " + academic 
        + "\n" + 
                               "Programming experience: " + programmingSoftware 
        + "\n" + 
                               "Class 1: " + class1 
        + "\n" + 
                               "Class 2: " + class2 
        + "\n" + 
                               "Class 3: " + class3 
        + "\n" + 
                               "Class 4: " + class4 
        + "\n" + 
                               "Class 5: " + class5 
        + "\n" + 
                               "Class 6: " + class6
        + "\n" +
                               "Graduation Year: " + graduationYear + 
        "\n" +
                               "Story: " + story 
        + "\n" + 
                               "From NC: " + fromNC + 
        "\n" + 
                               "---------------------------";
        return objectSummary;
    }
    
} //end class
