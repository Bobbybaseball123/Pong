package ponggame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class PongGame extends JComponent implements MouseMotionListener
{
	final int width = 1000;
	final int height = 1000;
	// 1.  Declare a JFrame field variable and name it pongTable
    JFrame pongGame;
	// 9.  Declare integer field variables for frameWidth and frameHeight and initialize to 500 each
	// 10. Declare a String field variable for the title of the JFrame
    String title =  "pong";
	int ballx = 100;
    int bally = 100;
	int bxspeed = 3;
    int byspeed = 3;
	int ballsize = 50;
    int paddlex = 25;
	int paddley = 500;
	int paddleWidth = 25;
	int paddleHeight = 100;
	// 13. Declare 2 new integer variables.  One for the ball's x position and one for the y.  Initialize them both to 100
    // 14. Declare 2 more integer variables for the ball x speed and y speed.  Initialize them both to 10
    // 15. Declare an integer variable for the ball size and initialize it to 50
    // 16. Declare 2 integer variables for the paddle with and height.  Initialize the width to 25 and the height to 100
    // 17. Declare 2 more integer variables for the paddle x and y positions.  Initialize the x position to 25 and the y to 1000
    
    // 27. Declare an integer variable for the score and initialize it to 0
    // 28. Create an Ellipse2D.Double variable called ball
    // 29. Create a Rectangle2D.Double variable called paddle
    // 30. Create an Image variable called sailboatImage
    // 31. implement the MouseMotionListener class next to where the Main class was declared

    // 48. Lets add sound!  use URL pingSoundAddress = getClass().getResources("fire.wav");
    // 49. AudioClip pingSoundFile = JApplet.newAudioClip(pingSoundAddress);
	public static void main(String[] args)
	{
    		new PongGame().startTheGame();
	}

	private void startTheGame()
	{
    	// 2.  Make the JFrame "real" (instantiate it) with:  pongTable = new JFrame();
    	pongGame = new JFrame();
		// 3.  Run the program...do you see a JFrame?
    	pongGame.setVisible(true);
    	pongGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	pongGame.setSize(width,height);
    	pongGame.setTitle(title);
    	pongGame.add(this);
    	// 4.  Make the JFrame visible with pongTable.setVisible(true);
    	// 5.  Run the program...do you see a JFrame?
   	 // 6.  Make it so the program stops running when we close the JFrame with pongTable.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	// 7.  Set the size of the JFrame with pongTable.setSize(frameWidth, frameHeight);
    	// 11. Put a title on the JFrame by sending it the JFrame title parameter in the "new JFrame() statement above
   	 // 12. Add the JFrame with pongTable.add(this);
   	 // 32. Instantiate sailboatImage with new ImageIcon(this.getClass().getResource("sailboat-218697.jpg")).getImage();
	}
    
	public void paint(Graphics g)
	{
   	 // 18. Create a Graphics2D object named g2 and set it equal to g.  Cast the g variable with (Graphics2D) g
   	 Graphics2D g2 = (Graphics2D) g;
   	 // 33. Draw the sailboat image with g2.drawImage(sailboatImage, 0, 0, null);
   	 // 34. Set the Ellipse2D.Double variable ball to = new Ellipse2D.Double(ballx, bally, ballSize, ballSize); Use the variables created in steps 13 and 15
   	 // 35. Create an oval with g2.fill(ball);
   	 // 36. Set the color to blue with g2.setColor(Color.BLUE);
   	 // 37. Instantiate the paddle Ellipse2D.Double variable ball with = new Ellipse2D.Double(paddleX, paddleY, paddleWidth, paddleHeight); use parameters from steps 17 and 16
   	 // 38. paint the paddle with g2.fill(paddle);
   	 // 39. Since we created the Ellipse2D.Double objects, g2.FillOval() and g2.fillRect() are no longer needed.
   	 // 40. Set the color to black with g2.setColor(Color.BLACK);
   	 // 41. Draw a string to the screen that will display the score with g2.drawString("SCORE", width - 500, 100);
   	 // 42. Change the font with g2.setFont(new Font("Bank Gothic", Font.BOLD, 99));
   	 // 43. Add the score with g2.drawString(score + "", width - 500, 200);  use the score variable set up in step 27
   	 g2.setColor(Color.GREEN);
   	 g2.fillOval(ballx,bally,ballsize,ballsize);
   	 g2.setColor(Color.BLUE);
   	 g2.fillRect(paddlex, paddley, paddleWidth, paddleHeight);
   	ballx += bxspeed;
   bally += byspeed;
   // 19. Set the color to green with g2.setColor(Color.GREEN);
   	 // 20. Create the ball with g2.fillOval((int)ballx, bally, ballSize, ballSize); Pass in the parameters that were set up in steps 13 and 15
   	 // 21. Change the color to blue with g2.seColor(Color.BLUE);
   	 // 22. Create a rectangle for the paddle with g2.fillRect(paddleX, paddleY, paddleWidth, paddleHeight); use the parameters created in steps 17 and 16
   	 // 23. Make the ball move by incrementing the ball's x position by the ball's x speed
   	 // 24. Do the same as step 23 for the ball's y position
   	 // 25. Create four if statements:
   	if (ballx > width) 
   	{ 
   		bxspeed = -bxspeed;
    
   		
   	}
   	if(bally > height){
   	byspeed = -byspeed;	
   	}
   	
   if(ballx < 0)
   {
	bxspeed = -bxspeed;   
   }
   if (bally < 0)
   {
	   byspeed = -byspeed; 
   }
   // 1. if the ball's x position is greater than the width of the JFrame minus the ball size,
   		 //	then the ball's x speed will equal the negative of the ball's x speed
   		 // 2. if the ball's y position is greater than the height of the JFrame minus the ball size,
   		 //	then the ball's y speed will equal the negative of the ball's y speed
   		 // 3. if the ball's x position is less than 0,
   		 //	then the ball's x speed is equal to the negative of the ball's x speed
   		 // 4. if the ball's y position is less than 0,
   		 //	then the ball's y speed is equal to the negative of the ball's y speed
   	 
   	 // 44. add the following conditions to the last if statement:
   		 // set the color to red with g2.setColor(Color.RED);
   		 // g2.scale(9, 9);
   		 // draw as string to g2.drawString("Loser", 0, 99);
   	 
   	 // 45. Add a fifth if statement
   		 // if the ball intersects the paddle (ball.intersects(paddle))
   	 // 46. Add another if statement inside this one
   		 // if the ball speed is less than 0
   		 // then the ball's x speed will equal the negative of the ball's x speed
   		 // increment the ball's x position by 10
   	 // 47. Inside the parent if statement, increment the score by 1
   	 
   	 // 50. Add the sound with pingSoundFile.play();
   		 
   	 
   	 // 26. call the repaint(); method
   	repaint();
	}
    
	public void mouseDragged(MouseEvent me)
	{
	}
    
	public void mouseMoved(MouseEvent me)
	{
   	 //51. Lock the paddle to the mouse's y position with paddleY = me.getY();
	}

	
}
