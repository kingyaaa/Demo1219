public class Creature {
    private int x;
    private int y;
    private Dir dir;
    public Creature(int x,int y){
        this.x = x;
        this.y = y;
        this.dir = Dir.UP;
    }
    public void moveBy(int mx, int my,Dir dir){
        this.setX(x + mx);
        this.setY(y + my);
        this.setDir(dir);
    }
    public void setDir(Dir dir){
        this.dir = dir;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public Dir getDir(){
        return this.dir;
    }

}
