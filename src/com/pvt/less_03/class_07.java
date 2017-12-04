package com.pvt.less_03;

/**
 * Created by W510 on 30.11.2017.
 */
public class class_07 {
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
        int cardNumber = (int)(Math.random()*51);
        int card = cardNumber%13;
        int tipe = (cardNumber-card)/13;
        System.out.println(cardNumber);
        System.out.println(cards[tipe][card]);
    }
}
              /*0 if (j==0){
                    cards[i][j]="2";
                }else if (j==1){
                    cards[i][j]="3";
                }else if (j==2){
                    cards[i][j]="4";
                }else if (j==3){
                    cards[i][j]="5";
                }else if (j==4){
                    cards[i][j]="6";
                }else if (j==5){
                    cards[i][j]="7";
                }else if (j==6){
                    cards[i][j]="8";
                }else if (j==7){
                    cards[i][j]="9";
                }else if (j==8){
                    cards[i][j]="10";
                }else if (j==9){
                    cards[i][j]="Jack";
                }else if (j==10){
                    cards[i][j]="Queen";
                }else if (j==11){
                    cards[i][j]="King";
                }else if (j==12){
                    cards[i][j]="Ace";
                }*/
