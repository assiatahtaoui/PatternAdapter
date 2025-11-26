package computer.adapter;

import computer.Hdmi;
import computer.Tv;
import computer.Vga;

public class HdmiVgaAdapterH extends Tv implements Vga {
    private Hdmi hdmi;
    @Override
    public void print(String msg) {
        System.out.println("*********adapter*******");
        byte [] data = msg.getBytes();
        super.view(data);
        System.out.println("*********/adapter*******");

    }

}
