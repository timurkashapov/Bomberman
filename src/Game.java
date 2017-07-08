/**
*
* Игра.  </br>
* Game. </br>
*
*/
class Game {

	/**
	*
	* игровое поле.
	* Game board space.
	*/
	private GameBoard gmBoard;

	/**
	*
	* Конструктор игры. </br>
	* Constructor of a game. </br>
	*
	*/
	Game() {

		gmBoard = new GameBoard();
	} // Game()


	/**
	*
	* Запуск игры. </br>
	* Start a game </br>
	*
	*/
    public void start() {

    	if ( init() ) {

    		run();
    	} else {
    		// throw new Initialization not success !
    	}
	} // start()

	/**
	*
	* Инициализация игры. </br>
	* Initialize a game. </br>
	*
	*/
    private boolean init() {

    	return true;
	} // init()

	/**
	*
	* Запуск основного игрового цикла. </br>
	* Run a main game loop. </br>
	*
	*/
    private void run() {

    	// while(true) {
    		
    		System.out.println(" * GAME RUNNING * ");

    		// gmBoard.update();

    		gmBoard.render();

    		stop();
    		exit();
    	// }

	} // run()

	/**
	*
	* Остановка основного цикла игры. </br>
	* Stop a main game loop. </br>
	*
	*/
    private void stop() {
    	// TO-DO
	} // stop()

	/**
	*
	* Выход из игры и завершение работы игрового приложения. </br>
	* Exit form a game and terminated the game application. </br>
 	*
	*/
	private void exit() {

		System.exit(0);
	} // exit()


}