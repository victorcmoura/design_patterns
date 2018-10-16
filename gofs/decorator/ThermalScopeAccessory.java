public class ThermalScopeAccessory extends WeaponAccessory {
    public ThermalScopeAccessory(MilitaryHardware core) {
        super(core);
    }

    public void whatAreYou() {
        super.whatAreYou();
        System.out.print(" I also have a thermal scope.");
    }
}