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

	// ����� ���������� ��������� ����������
	static int _startPosX;

	// ������ ���������� ��������� ����������
	 static int  _startPosY;

	// ������ ���� ���������
	private int _pictureWidth;

	// ������ ���� ���������
	private int _pictureHeight;

	// ������ ��������� ����������
	private final int AttackAircraftWidth = 100;

	// ������ ��������� ����������
	private final int AttackAircraftHeight = 60;

	// ������������ ��������
	public int MaxSpeed;
	{
		Set get;
	}

	// ��� ����������
	public float Weight;
	{
		Set get;
	}

	// �������� ���� 
	public static Color MainColor;
	{
		Set get;
	}

	// �������������� ����
	public static Color DopColor;
	{
		Set get;
	}

	// ������� ������� ������
	private static boolean Turbines;
	{
		Set get;
	}

	public boolean setTurbines;
	{
		Set get;
	}

	// ������� ������� ����������
	private static boolean Propeller;
	{
		Set get;
	}

	private static boolean Flag;
	{
		Set get;
	}
	
	// <summary>
	// �����������
	// </summary>
	// <param name="maxSpeed">������������ ��������</param>
	// <param name="weight">��� ����������</param>
	// <param name="mainColor">�������� ����</param>
	// <param name="dopColor">�������������� ����</param>
	// <param name="turbines">������� ������� ������</param>
	// <param name="propeller">������� ������� ����������</param>
	//

	/// <summary>
	/// ��������� ������� ����������
	/// </summary>
	/// <param name="x">���������� X</param>
	/// <param name="y">���������� Y</param>
	/// <param name="width">������ ��������</param>
	/// <param name="height">������ ��������</param>
	public void SetPosition(int x, int y, int width, int height) {
		_startPosX = x;
		_startPosY = y;
		_pictureWidth = width;
		_pictureHeight = height; 
	}

	/// <summary>
	/// ��������� ����������� ����������
	/// </summary>
	/// <param name="direction">�����������</param>
	public void MoveTransport(Direction direction) {
		float step = MaxSpeed * 100 / Weight;
		switch (direction) {
		// ������
		case Right:
			if (_startPosX + 100 + step < 630) {
				_startPosX += step;
			}
			break;
		// �����
		case Left:
			if (_startPosX - step > 0)

			{
				_startPosX -= step;
			}
			break;
		// �����
		case Up:
			if (_startPosY - step > 0) {
				_startPosY -= step;
			}
			break;
		// ����
		case Down:
			if (_startPosY + step + 60 < 380) {
				_startPosY += step;
			}
			break;
		}
	}

	/// <summary>
	/// ��������� ����������
	/// </summary>
	/// <param name="g"></param>
	public static void DrawAttackAircraft(Graphics g) {
		/*
		// ������� ����������
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