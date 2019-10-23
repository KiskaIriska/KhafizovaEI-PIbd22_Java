import java.awt.Color;
import java.awt.Graphics;
import java.util.Set;

public class AttackAircrafts {
	
	
	public AttackAircrafts(int maxSpeed, float weight, Color mainColor, Color dopColor, boolean turbines,
			boolean propeller, boolean flag) {
		MaxSpeed = maxSpeed;
		Weight = weight;
		MainColor = mainColor;
		DopColor = dopColor;
		Turbines = turbines;
		Propeller = propeller;
		Flag = flag;
	}

	// Левая координата отрисовки штурмовика
	static int _startPosX;

	// Правая кооридната отрисовки штурмовика
	 static int  _startPosY;

	// Ширина окна отрисовки
	private int _pictureWidth;

	// Высота окна отрисовки
	private int _pictureHeight;

	// Ширина отрисовки штурмовика
	private final int AttackAircraftWidth = 100;

	// Ширина отрисовки штурмовика
	private final int AttackAircraftHeight = 60;

	// Максимальная скорость
	public int MaxSpeed;
	{
		Set get;
	}

	// Вес штурмовика
	public float Weight;
	{
		Set get;
	}

	// Основной цвет 
	public static Color MainColor;
	{
		Set get;
	}

	// Дополнительный цвет
	public static Color DopColor;
	{
		Set get;
	}

	// Признак наличия турбин
	private static boolean Turbines;
	{
		Set get;
	}

	public boolean setTurbines;
	{
		Set get;
	}

	// Признак наличия пропеллера
	private static boolean Propeller;
	{
		Set get;
	}

	private static boolean Flag;
	{
		Set get;
	}
	
	// <summary>
	// Конструктор
	// </summary>
	// <param name="maxSpeed">Максимальная скорость</param>
	// <param name="weight">Вес штурмовика</param>
	// <param name="mainColor">Основной цвет</param>
	// <param name="dopColor">Дополнительный цвет</param>
	// <param name="turbines">Признак наличия турбин</param>
	// <param name="propeller">Признак наличия пропеллера</param>
	//

	/// <summary>
	/// Установка позиции штурмовика
	/// </summary>
	/// <param name="x">Координата X</param>
	/// <param name="y">Координата Y</param>
	/// <param name="width">Ширина картинки</param>
	/// <param name="height">Высота картинки</param>
	public void SetPosition(int x, int y, int width, int height) {
		_startPosX = x;
		_startPosY = y;
		_pictureWidth = width;
		_pictureHeight = height; 
	}

	/// <summary>
	/// Изменение направления пермещения
	/// </summary>
	/// <param name="direction">Направление</param>
	public void MoveTransport(Direction direction) {
		float step = MaxSpeed * 100 / Weight;
		switch (direction) {
		// вправо
		case Right:
			if (_startPosX + 100 + step < 630) {
				_startPosX += step;
			}
			break;
		// влево
		case Left:
			if (_startPosX - step > 0)

			{
				_startPosX -= step;
			}
			break;
		// вверх
		case Up:
			if (_startPosY - step > 0) {
				_startPosY -= step;
			}
			break;
		// вниз
		case Down:
			if (_startPosY + step + 60 < 380) {
				_startPosY += step;
			}
			break;
		}
	}

	/// <summary>
	/// Отрисовка штурмовика
	/// </summary>
	/// <param name="g"></param>
	public static void DrawAttackAircraft(Graphics g) {
		/*
		// границы штурмовика
		g.setColor(MainColor);
		g.drawRect((int) _startPosX - 50, (int) _startPosY, 70, 10);
		g.drawRect((int) _startPosX, (int) _startPosY - 20, 10, 50);
		g.drawOval((int) _startPosX + 15, (int) _startPosY, 10, 10);
		g.drawRect((int) _startPosX - 45, (int) _startPosY - 15, 10, 40);
		g.setColor(DopColor);
		g.drawOval((int) _startPosX - 10, (int) _startPosY + 2, 25, 5);

		if (Propeller) {
			g.drawOval((int) _startPosX + 25, (int) _startPosY - 5, 5, 20);
		}

		if (Turbines) {
			g.setColor(Color.darkGray);
			g.fillRect((int) _startPosX - 50, (int) _startPosY - 10, 20, 5);
			g.fillRect((int) _startPosX - 50, (int) _startPosY + 15, 20, 5);
		}*/

		if (Propeller) {
			g.setColor(DopColor);
			g.fillOval(_startPosX + 93, _startPosY+ 13 ,5 ,18 );
			g.fillOval(_startPosX + 93, _startPosY+ 31 ,5 ,18 );
			g.setColor(Color.BLACK);
			g.fillOval(_startPosX + 90, _startPosY+ 27 ,10 ,5 );
		}

		if (Turbines) {
			g.setColor(Color.darkGray);
			g.fillRect( _startPosX + 5, _startPosY +15, 20, 5);
			g.fillRect( _startPosX + 5, _startPosY + 40, 20, 5);
		}
		
		g.setColor(MainColor);
		g.fillRect(_startPosX + 5, _startPosY+ 25,85 ,10 );
		g.fillOval(_startPosX, _startPosY+ 25,10 ,10 );
		g.fillOval(_startPosX + 85, _startPosY+ 25,10 ,10 );
		
		
		g.fillRect(_startPosX + 10, _startPosY+ 15, 10 , 30 );
		g.fillOval(_startPosX + 10, _startPosY+ 10 ,10 ,10 );
		g.fillOval(_startPosX + 10, _startPosY+ 40 ,10 ,10 );
		
		g.fillRect(_startPosX + 60, _startPosY+ 5, 15 , 50 );
		g.fillOval(_startPosX + 60, _startPosY ,15 ,10 );
		g.fillOval(_startPosX + 60, _startPosY+ 50 ,15 ,10 );
		
		g.fillRect(_startPosX + 50, _startPosY+ 20,25 ,20 );
		g.fillOval(_startPosX + 65, _startPosY+ 20,20 ,20 );
		g.fillOval(_startPosX + 40, _startPosY+ 20 ,20 ,20 );
		
		g.setColor(DopColor);
		g.fillOval(_startPosX + 60, _startPosY+ 25 ,20 ,10 );
		
		if (Flag) {
			g.setColor(Color.RED);
			g.fillOval( _startPosX + 65, _startPosY +10, 5, 5);		
			g.fillOval( _startPosX + 65, _startPosY +45, 5, 5);	
		}
		/*
		final static Random random = new Random();
		int number = 4 + (int) (Math.random() * 3);
		switch (number)
		{
		case 4:
			AircraftsGuns.NumberGuns(Number.Four, g, AttackAircrafts._startPosX, AttackAircrafts._startPosY);
			break;
		case 5:
			AircraftsGuns.NumberGuns(Number.Five, g, AttackAircrafts._startPosX, AttackAircrafts._startPosY);
			break;
		case 6:
			AircraftsGuns.NumberGuns(Number.Six, g, AttackAircrafts._startPosX, AttackAircrafts._startPosY);
			break;          
		}
		
		*/
		
	}
}

enum Direction {
	Up, Down, Left, Right
}