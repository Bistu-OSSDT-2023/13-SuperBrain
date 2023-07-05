package SuperBrain;

import java.awt.Color;

public class Constant {
	public static final int GAME_WIDTH = 900;
	public static final int GAME_HEIGHT = 850;

	public static final int BACK_X = 150;
	public static final int BACK_Y = 150;

	public static final int BACK_WIDTH = 600;
	public static final int BACK_HEIGHT = 600;
	
	public static final int BLOCK_SPACE = 20;
	public static final int BLOCK_WIDTH = (BACK_WIDTH - 5 * BLOCK_SPACE) / 4;
	public static final int BLOCK_HEIGHT = (BACK_HEIGHT - 5 * BLOCK_SPACE) / 4;
	
	public static final int BACK_UP_IN_Y = BACK_Y+BLOCK_SPACE;
	public static final int BACK_DOWN_IN_Y = BACK_Y + BACK_HEIGHT-BLOCK_SPACE;
	public static final int BACK_LEFT_IN_X = BACK_X +BLOCK_SPACE;
	public static final int BACK_RIGHT_IN_X = BACK_X + BACK_WIDTH-BLOCK_SPACE;

	

	public static final String IMG_PRE = "SuperBrain/img/";
	public static final Color COLOR_BACK = new Color(187,173, 160);//格子边框
	public static final Color COLOR_BLOCK_BACK = new Color(205, 192, 180);//格子
	public static final Color COLOR_BLOCK_FRAME = new Color(221,200,163);//背景
	public static final Color COLOR_BLOCK_Client1 = new Color(143,75,44);
	public static final Color COLOR_BLOCK_Client2 = new Color(176,122,44);

	public static final Color COLOR_BLOCKS_ACTIVE[] = new Color[] { 
	
      new Color(0xeee4da),
      new Color(0xede0c8),
      new Color(0xf2b179),
      new Color(0xf59563),
      new Color(0xf67c5f),
      new Color(0xf65e3b),
      new Color(0xedcf72),
      new Color(0xedcc61),
      new Color(0xedc850),
      new Color(0xedc53f),
      new Color(0xedc22e),
      new Color(0x248c51),
	};

}
