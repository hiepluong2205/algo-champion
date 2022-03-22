/*
 * Name: Hiep Tuan Luong
 * Class & Section: CIS 35A-36Y
 * Assignment Number:
 * Due Date: 02/02/2022
 * Date Submitted: 02/02/2022
 * https://deanza.instructure.com/courses/23660/assignments
 */

package io.github.hiepluong2205.exercism;

// https://exercism.org/tracks/java/exercises/blackjack/edit
public class Blackjack {

    /*
ace 	11 	eight 	8
two 	2 	nine 	9
three 	3 	ten 	10
four 	4 	jack 	10
five 	5 	queen 	10
six 	6 	king 	10
seven 	7 	other 	0
     */
    public int parseCard(String card) {
        int value = 0;
        switch (card) {
            case "one":
                value = 1;
                break;
            case "two":
                value = 2;
                break;
            case "three":
                value = 3;
                break;
            case "four":
                value = 4;
                break;
            case "five":
                value = 5;
                break;
            case "six":
                value = 6;
                break;
            case "seven":
                value = 7;
                break;
            case "eight":
                value = 8;
                break;
            case "nine":
                value = 9;
                break;
            case "jack":
            case "queen":
            case "ten":
            case "king":
                value = 10;
                break;
            case "ace":
                value = 11;
                break;
            default:
                value = 0;
                break;
        }
        return value;
    }

    public boolean isBlackjack(String card1, String card2) {
        if (parseCard(card1) + parseCard(card2) == 21) {
            return true;
        } else {
            return false;
        }
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {
        if (isBlackjack == true) {

        }
        String decision = "";
        decision = "W";
        decision = "S";
        return decision;
    }

    public String smallHand(int handScore, int dealerScore) {
        String decision = "";
        decision = "W";
        decision = "H";
        return decision;
    }

    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}
