import java.util.Random;
public class Stone_paper_scissor{
    private  int count=1;
    private  String [] options={"paper","Scissors","Rock"};

    public Stone_paper_scissor(int c){
     this.count=c;
    }

    public void setplayers(){
        Random rand=new Random();
        int player1=rand.nextInt(3);
        int player2=rand.nextInt(3);
        int  player3=rand.nextInt(3);
        int player4=rand.nextInt(3);
        display(player1,player2,player3,player4);
        }

        public  int getscore(int player1,int player2){
            String str1=options[player1];
            String str2=options[player2];
            if(str1.equals("paper")&&str2.equals("Rock")){
                return 1;
            }
            else if(str1.equals("Scissors")&&str2.equals("paper")){
                return 1;
            }
            else if(str1.equals("Rock")&&str2.equals("Scissors")){
                return 1;
            }
            return 0;
        }

        public  void display(int player1,int player2,int player3,int player4){
            while(count<=50){
            int [] player={player1,player2,player3,player4};
            System.out.println(count+" Iteration");
            System.out.println("player1  "+"player2  "+"player3  "+"player4  ");
            System.out.println(options[player1]+"     "+options[player2]+"     "+options[player3]+"     "+options[player4]+"  ");
            System.out.println();
            System.out.println();
            System.out.println("Totals"+"  "+"player1  "+"player2  "+"player3  "+"player4  ");
            for(int i=0;i<player.length;i++){
                System.out.print("player"+(i+1)+"  ");
                for(int j=0;j<player.length;j++){
                if(i==j){
                    System.out.print("-        ");
                }else{
                    int val=getscore(player[i],player[j]);
                    System.out.print(val+"        ");
                }
                }
                System.out.println();
            }
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            count++;
            setplayers();
        }
                }
 
}