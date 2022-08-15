public class FootballPlayerTest {
    public static void main(String[] args) {
        FootballPlayer player = new FootballPlayer();
        player.no = 10;
        player.name = "Zehra";
        player.inPlay = true;
        player.minutes = 40;
        player.numberOfGoals = 0;

        player.play(40);
        player.score();

        System.out.println("Player Name:" + player.name + " Number of Goals:" + player.numberOfGoals);

    }
}
