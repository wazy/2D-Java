
public class WorldGen {
	public static void genFlat(){
		for(int x = 0; x != Creation.CHUNKX; x++){
			for(int y = 0; y != 18; y++){
				Creation.blocks[x][y].setType(BlockTypes.AIR);
			}
			
			Creation.blocks[x][18].setType(BlockTypes.DIRT);
			
			for(int y = 19; y != 21; y++){
				Creation.blocks[x][y].setType(BlockTypes.DIRTGRASS);
			}
			
			for(int y = 21; y != Creation.CHUNKY; y++){
				Creation.blocks[x][y].setType(BlockTypes.STONE);
			}
		}
	}

}
