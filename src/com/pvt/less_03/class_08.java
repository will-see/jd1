package com.pvt.less_03;

/**
 * Created by W510 on 30.11.2017.
 */
public class class_08 {
    public static void main(String[] args) {
        String cards [][] = new String[4][13];
        for (int i=0; i<cards.length; i++){
            for (int j=0;j<cards[i].length;j++){
                switch (j) {
                    case 0:
                        cards[i][j] = "2";
                        break;
                    case 1:
                        cards[i][j] = "3";
                        break;
                    case 2:
                        cards[i][j] = "4";
                        break;
                    case 3:
                        cards[i][j] = "5";
                        break;
                    case 4:
                        cards[i][j] = "6";
                        break;
                    case 5:
                        cards[i][j] = "7";
                        break;
                    case 6:
                        cards[i][j] = "8";
                        break;
                    case 7:
                        cards[i][j] = "9";
                        break;
                    case 8:
                        cards[i][j] = "10";
                        break;
                    case 9:
                        cards[i][j] = "Jack";
                        break;
                    case 10:
                        cards[i][j] = "Queen";
                        break;
                    case 11:
                        cards[i][j] = "King";
                        break;
                    case 12:
                        cards[i][j] = "Ace";
                        break;
                }

                switch (i){
                  case 0:
                        cards[i][j] += " of Hearts";
                      break;
                  case 1:
                        cards[i][j] += " of Spades";
                      break;
                  case 2:
                        cards[i][j] += " of Clubs";
                      break;
                  case 3:
                        cards[i][j] += " of Diamonds";
                      break;
                }
            }
        }
        for (int i=0; i<cards.length; i++) {
            for (int j = 0; j < cards[i].length; j++) {
                System.out.print(cards[i][j] + " ");
            }
        }
        for (int i =0; i<30;i++) {
            int cardNumber1 = (int) (Math.random() * 51);
            int card1 = cardNumber1 % 13;
            int tipe1 = (cardNumber1 - card1) / 13;
            int cardNumber2 = (int) (Math.random() * 51);
            int card2 = cardNumber2 % 13;
            int tipe2 = (cardNumber2 - card2) / 13;
            String temp = cards[tipe1][card1];
            cards[tipe1][card1] = cards[tipe2][card2];
            cards[tipe2][card2] = temp;
        }
        System.out.println();
        for (int i=0; i<cards.length; i++) {
            for (int j = 0; j < cards[i].length; j++) {
                System.out.print(cards[i][j] + " ");
            }
        }
    }
}