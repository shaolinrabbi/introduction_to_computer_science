package unit_08_objects_and_classes;

public class CreatingFootballPlayer {

	public static void main(String[] args) {
		FootballPlayer footballPlayer = new FootballPlayer();
		
		footballPlayer.name = "Jared Goff";
		footballPlayer.superbowlWins = 0;
		footballPlayer.team = "Los Angeles Rams";
		footballPlayer.yearOfBirth = 1996;
		
		footballPlayer.run();
		footballPlayer.jump();
		footballPlayer.throwBall();
	}
}