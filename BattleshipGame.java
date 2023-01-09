public interface BattleshipGame {
  void setUpGame();

  void startPlaying();

  void checkUserGuess(String guess);

  void finishGame();
}
