import java.awt.Image;

public class BlockImages {
	public static Image getBlockImages(BlockTypes type){
		if(type == BlockTypes.DIRT){
			return BlockDirt.getDirt();
		}else if(type == BlockTypes.DIRTGRASS){
			return BlockDirt.getDirtGrass();
		}
		
		else if(type == BlockTypes.STONE){
			return BlockStone.getStone();
		}
		
		return null;
	}
}
