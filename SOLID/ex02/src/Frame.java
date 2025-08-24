public class Frame { 
    byte[] data; 
    Frame(byte[] d)
    { 
        this.data=d; 
    } 

    void drawUI(){
       System.out.println("\u25B6 Playing " + data.length + " bytes"); 
    }
}
