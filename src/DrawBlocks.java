
public class DrawBlocks extends Board {
	private static final long serialVersionUID = 5343140251053561244L;

	public static void drawBlocks(){
		for(int x = Player.getBlockX(); x != Player.getBlockX() + 60; x++){
			for(int y = Player.getBlockY(); y != Player.getBlockY() + 30; y++){
				if (x < 0){
					x = 0;
				}
				if (y<0){
					continue;
				}
				if (x >= Creation.CHUNKX){
					continue;
				}
				if (y >= Creation.CHUNKY){
					continue;
				}
				Drawer.drawImage(Creation.blocks[x][y].getImage(), 
						Creation.blocks[x][y].getX(), 
						Creation.blocks[x][y].getY(), null);
			}
		}
	}
}
