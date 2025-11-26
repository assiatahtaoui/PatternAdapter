package computer;

public class SuperVP implements Hdmi , Vga{
    @Override
    public void view(byte[] data) {
        String s = new String(data);
        System.out.println("********SuperVP hdmi ********");
        System.out.println(s);
        System.out.println("********SuperVP hdmi ********");
    }

    @Override
    public void print(String msg) {
        System.out.println("******SuperVP vga*******");
        System.out.println(msg);
        System.out.println("******SuperVP vga*******");

    }
}
