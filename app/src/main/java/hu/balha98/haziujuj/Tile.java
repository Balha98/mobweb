package hu.balha98.haziujuj;

public class Tile {
    private int posx,posy;
    private int imageid;

    public Tile(int posx, int posy, int imageid){
        this.posx = posx;
        this.posy = posy;
        this.imageid = imageid;
    }

    public void setImageid(int imageid) {
        this.imageid = imageid;
    }
}
