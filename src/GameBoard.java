/**
*
* Основное игровое поле игры.
* Main game board space of a game.
*
*/
class GameBoard {

	/** Minimal width and height of game board space. */
	private static final int MIN_WIDTH = 25;
	private static final int MIN_HEIGHT = 25;

	/** Maximal width and height of game board space. */
	private static final int MAX_WIDTH = 50;
	private static final int MAX_HEIGHT = 50;

	/** Compute the minimal and maximal size of game board space area */
	private static final int MIN_SIZE = MIN_WIDTH * MIN_HEIGHT;
	private static final int MAX_SIZE = MAX_WIDTH * MAX_HEIGHT;

	/**
	* 
	* Массив всех игровых объектов. </br>
	* Array of an all game objects. </br>
	*
	*/
	GameObject[][] gmObjects = new GameObject[MIN_HEIGHT][MIN_WIDTH];

	/**
	*
	* Конструктор игрового поля. </br>
	* Constructor of the game board. </br>
	*
	*/
	GameBoard() {

		init();
	} // GameBoard()

	/**
	*
	* Инициализация игрового поля. </br>
	* Initialize the game board. </br>
	*
	*/
	private void init() {

		for(int i = 0; i < gmObjects.length; i++) {

			for(int j = 0; j < gmObjects[i].length; j++) {

				gmObjects[i][j] = new GameObject(this);
			}
		}
	} // init()


	/**
	*
	* Обновление состояния всех игровых объектов на игровом поле. </br>
	* Updating the all states of game objects on a game board. </br>
	*
	*/
	public void update() {
		// TO-DO
	} // update()

	/**
	*
	* Отрисовка всех объектов на игровом поле. </br>
	* Rendering the all game objects on a game board. </br>
	*
	*/
	public void render() {

		for(int i = 0; i < gmObjects.length; i++) {

			for(int j = 0; j < gmObjects[i].length; j++) {
				gmObjects[i][j].render();
			}

			System.out.println();
		}
	} // render()
}
