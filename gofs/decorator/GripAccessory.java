public class GripAccessory extends WeaponAccessory {
    public GripAccessory(MilitaryHardware core) {
        super(core);
    }

    public void whatAreYou() {
        super.whatAreYou();
        System.out.print(" I have a grip for my users.");
    }
}