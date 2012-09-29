import java.awt.Image;


public class Block {
	private int type;
	private Image BlockImage;
	private int x, y;
	
	public Block(int setX, int setY){
		x = setX * 20;
		y = setY * 20;
	}
	
	public int getType(){
		return type;
	}
	
	public Image getImage(){
		return BlockImage;
	}
	
	public void setType(BlockTypes type){
		BlockImage = BlockImages.getBlockImages(type);
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}


}
