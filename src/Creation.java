public class Creation {
	protected static Block[][] blocks;
	
	protected static int CHUNKX = 60;
	protected static int CHUNKY = 60;
	public static void create(){
		
		blocks = new Block[CHUNKX][CHUNKY];
		
		for(int x = 0; x != CHUNKX; x++){
			for(int y =0; y!= CHUNKY; y++){
				blocks[x][y] = new Block(x, y);
			}
		}
		
		WorldGen.genFlat();
	}
}
