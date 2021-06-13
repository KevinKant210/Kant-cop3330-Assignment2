/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  *  Copyright 2021 first_name last_name
 *
 */

package E_35Test;

import E_35.E_35App;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class E_35Tester {

    @Test
    public void ensure_we_grab_winner(){

        E_35App.players.add("Joe Momma");
        E_35App.players.add("Ligma Ballz");

        String winner = E_35App.grabWinner();

        assertTrue(winner.compareTo("Joe Momma") == 0|| winner.compareTo("Ligma Ballz") == 0);


    }
}
