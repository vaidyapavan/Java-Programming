package Basic_java;

import java.io.*;

class Sports {
    String getName() {
        return "Generic Sports";
    }

    void getNumberOfTeamMembers() {
        System.out.println("Each team has n players in " + getName());
    }
}

class Soccer extends Sports {
    @Override
    String getName() {
        return "Soccer Class";
    }

    // Overriding the getNumberOfTeamMembers method
    @Override
    void getNumberOfTeamMembers() {
        System.out.println("Each team has 11 players in " + getName());
    }
}

public class Object_creation {
    public static void main(String[] args) {
        // Creating instances of Sports and Soccer classes
        Sports sports = new Sports();
        Soccer soccer = new Soccer();

        // Printing results
        System.out.println(sports.getName());
        sports.getNumberOfTeamMembers();

        System.out.println(soccer.getName());
        soccer.getNumberOfTeamMembers();
    }
}
