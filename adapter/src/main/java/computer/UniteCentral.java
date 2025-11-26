package computer;

public class UniteCentral {
    private Vga vga;

    public void print(String msg) {
        System.out.println("**********");
        vga.print(msg);
        System.out.println("***********");
    };

    public void setVga(Vga vga) {
        this.vga = vga;
    }
}
