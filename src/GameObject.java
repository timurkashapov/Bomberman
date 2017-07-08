/**
*
* Общий класс для работы с игровыми объектами. </br>
* Commom class for work with game objects. </br>
*
*/
class GameObject {

	/** Reference to a game board space area */
	private GameBoard gmBoard;

	/** Default view of game object */
	private final String view = ":?:";

	/**
	*
	* Коструктор игрового объекта. </br>
	* Constructor of a game object. </br>
	*
	*/
	GameObject(GameBoard gmBoard) {

		this.gmBoard = gmBoard;
	} // GameObject

	/**
	*
	* Отрисовка игрового объекта. </br>
	* Rendring a game object. </br>
	*
	*/
	void render() {

		System.out.print( this.getView() );
	} // render()

	/**
	*
	* Получить представление игрового объекта. </br>
	* Get a view of game object. </br>
	*
	*/
	String getView() {

		return this.view;
	}// getView()
}