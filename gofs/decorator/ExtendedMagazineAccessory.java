public class ExtendedMagazineAccessory extends WeaponAccessory {
    public ExtendedMagazineAccessory(MilitaryHardware core) {
        super(core);
    }

    public void whatAreYou() {
        super.whatAreYou();
        System.out.print(" I have an extended magazine.");
    }
}