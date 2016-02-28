// Michael Benson
// Section 10
// homework1

import java.awt.*;

public class SceneV2 extends Animator {

	// ---------------------------------------------------
	// Main draw method SceneV2
	// sun created from DayStar class
	// tree created from Tree class
	// cloud created from Cloud class
	// saucer created from UFO clas
	// ---------------------------------------------------

	
	
		private DayStar sun = new DayStar();
		private Tree tree = new Tree();
		private Cloud cloud = new Cloud();
		private UFO saucer = new UFO();
	
	public void draw(int clock,int x,int y,Graphics g) {
	
		sun.draw(g);
		tree.draw(g);
		cloud.draw(clock,g);
		saucer.draw(clock,x,y,g);

	} // end of draw method
	
} // end of homework1 class
	
	// -------------------------------------------------
	// DayStar clas
	// sunW = width of sun
	// sunH = height of sun
	// sunX = horizontal position of sun
	// sunY = vertical position of sun
	// -------------------------------------------------


	class DayStar {

		private final int sunW = 60;
		private final int sunH = 60;
		private final int sunX = -30;
		private final int sunY = -30;

	// DayStar draw method
		
		public void draw(Graphics g) {
	
			g.setColor(Color.yellow);
			g.fillOval(sunX,sunY,sunW,sunH);
	
	} // End of draw method

} // End of DayStar class

	// --------------------------------------------
	// treeH = tree trunk height
	// treeW = tree trunk width
	// treeTopW = width of top of tree
	// treeTopH = height of top of tree
	// --------------------------------------------

	class Tree {
		
		private final int treeH = 40;
		private final int treeW = 5;
		private final int treeTopW = 30;
		private final int treeTopH = 10;
		
	// Begin tree draw method

		public void draw(Graphics g) {
		
		// --------------------------------------------------
		// Instance variabl declarations
		// 
		// sceneW = width of window
		// sceneH = Height of window
		// sceneS = vertical height of scene
		// trunkX = horizontal position of the tree trunk
		// trunkY = vertical position of the tree turnk
		// topX = horizontal position of tree top
		// topY = vertical position of tree top
		// ---------------------------------------------------

			
			int sceneW = Animator.getSceneWidth();
			int sceneH = Animator.getSceneHeight();
			int sceneS = Animator.getSurface();

			int trunkX = 100;
			int trunkY = sceneS-treeH;
			int topX = trunkX-(treeTopW/2)+1;
			int topY = trunkY-treeTopH;
		
		// Draw Call
			
			g.setColor(Color.black);
			g.fillRect(trunkX,trunkY,treeW,treeH);
			
			g.setColor(Color.green);
			g.fillOval(topX,topY,treeTopW,treeTopH);


		} // End of draw method

	} // end of tree class


	// Cloud class

	class Cloud {
		
		// -------------------------------------------
		// cloudW = Cloud width
		// cloudH = cloud height
		// -------------------------------------------
		
		private final int cloudW = 30;
		private final int cloudH = 20;
		
	// Cloud draw method
		
		public void draw(int clock,Graphics g) {
			
			// --------------------------------------
			// Instance variable declarations
			// sceneW = width of scene window
			// cloudX = inital horizontal cloud position and movement function
			// cloudY = inital vertical cloud position
			// -------------------------------------------------------------
			
			int sceneW = Animator.getSceneWidth();
			
			int cloudX = -30+(clock%(sceneW+60));
			int cloudY = 20;

		// Begin cloud draw call
			
			g.setColor(Color.gray);
			g.fillOval(cloudX,cloudY,cloudW,cloudH);
		
		} // end draw method

	} // end class cloud


	// UFO Class

	class UFO {	
		
		// ----------------------------------------------------
		// ufoX = initial horizontal ufo position
		// ufoY = initial vertical ufo position
		// ufoW = width of the ufo
		// ufoH = height of the ufo
		// ufoLightW = width of ufo lights
		// ufoLightH = height of ufo lights
		// ----------------------------------------------------
		
		private final int ufoX = 40;
		private final int ufoY = 40;
		private final int ufoW = 35;
		private final int ufoH = 11;
		private final int ufoLightW = 3;
		private final int ufoLightH = 3;
		
	// Draw a UFO with lights
		
		public void draw(int clock,int x,int y,Graphics g) {
		
			g.setColor(Color.gray);
			g.fillOval(ufoX+x+(ufoW/2)-4,ufoY+y-3,10,5);
			g.setColor(Color.black);
			g.fillOval(ufoX+x,ufoY+y,ufoW,ufoH);

		// draw UFO light calls
		// each light has its own call due to the variable starting colors for each light
		
			//light 1
		
			if (clock%30 <= 10) {
				g.setColor(Color.blue);
				}
			else {
				if (clock%30 > 10) {
					g.setColor(Color.yellow);
					}
				if (clock%30 > 20) {
					g.setColor(Color.red);
					}
				};
	
			g.fillOval(ufoX+x+2,ufoY+y+4,ufoLightW,ufoLightH);
	
			// light 2
			
        	        if (clock%30 <= 10) {
			       g.setColor(Color.red);
		       		}       
		        else {          
			        if (clock%30 > 10) {
				        g.setColor(Color.blue);
				        }
		        if (clock%30 > 20) {
			                g.setColor(Color.yellow);
		        	        }
		       		  };

			g.fillOval(ufoX+x+9,ufoY+y+4,ufoLightW,ufoLightH);
		
			// light 3
			
	       		if (clock%30 <= 10) {
		       		g.setColor(Color.yellow);
				}		       
			else {
			        if (clock%30 > 10) {
			                g.setColor(Color.red);
			                }
			        if (clock%30 > 20) {
			                g.setColor(Color.blue);
			                }
				};
	
	                g.fillOval(ufoX+x+16,ufoY+y+4,ufoLightW,ufoLightH);
			
			// light 4
			
			if (clock%30 <= 10) {    
				 g.setColor(Color.blue);
		       		}                      
	                else {
		               if (clock%30 > 10) {
	        	               g.setColor(Color.yellow);
			      	       }	
			       if (clock%30 > 20) {
	                               g.setColor(Color.red);
	                      	        }
				};

           	     g.fillOval(ufoX+x+23,ufoY+y+4,ufoLightW,ufoLightH);
		
             	       // light 5
		
		  	if (clock%30 <= 10) {
		                g.setColor(Color.red);
			        }
	                else {
		                if (clock%30 > 10) {
		                        g.setColor(Color.blue);
	                                }
	                        if (clock%30 > 20) {
	                                g.setColor(Color.yellow);
	                                }
	                        };
		
		 	g.fillOval(ufoX+x+30,ufoY+y+4,ufoLightW,ufoLightH);                                                                                                                                                                                                                                                                    
		
		} // end of draw method

	} // end of ufo class


