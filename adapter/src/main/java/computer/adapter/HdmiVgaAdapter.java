package computer.adapter;

import computer.Hdmi;
import computer.Tv;
import computer.Vga;

public class HdmiVgaAdapter implements Vga {
    private Hdmi hdmi;
    @Override
    public void print(String msg) {
        System.out.println("*********adapter*******");
        byte [] data = msg.getBytes();
        hdmi.view(data);
        System.out.println("*********/adapter*******");

    }

    public void setHdmi(Hdmi hdmi) {
        this.hdmi = hdmi;
    }
}
