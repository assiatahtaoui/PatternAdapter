package computer;

import computer.adapter.HdmiVgaAdapter;
import computer.adapter.HdmiVgaAdapterH;

public class Test {
    public static void main(String[] args) {
        UniteCentral uc = new UniteCentral();
        uc.setVga(new Ecran());
        uc.print("hi");
        uc.setVga(new VedioProjct());
        uc.print("Bye");
        HdmiVgaAdapter hvga = new HdmiVgaAdapter();
        hvga.setHdmi(new Tv());
        uc.setVga(hvga);
        hvga.print("bonsoir");

        HdmiVgaAdapterH hdmiVgaAdapterH = new HdmiVgaAdapterH();
        uc.setVga(hdmiVgaAdapterH);
        hdmiVgaAdapterH.print("test");

        uc.setVga(new SuperVP());
        uc.print("hello");

        HdmiVgaAdapter hvga2 = new HdmiVgaAdapter();
        hvga2.setHdmi(new SuperVP());
        uc.setVga(hvga2);
        uc.print("hello");
    }
}
