abstract class WeaponAccessory implements MilitaryHardware {
    private MilitaryHardware core;
    
    public WeaponAccessory(MilitaryHardware core) {
        this.core = core;
    }

    public void whatAreYou() {
        core.whatAreYou();
    }
}