public class Main {
    public static void main(String[] args) {
        // Simple M4A4
        System.out.println("Simple Rifle");
        MilitaryHardware myRifle = new M4A4Weapon();
        myRifle.whatAreYou();
        System.out.println("\n--------");

        // Decorated M4A4
        System.out.println("Decorated Rifle");
        MilitaryHardware myDecoratedRifle = new ThermalScopeAccessory(
            new GripAccessory(
                new ExtendedMagazineAccessory(
                    new M4A4Weapon()
                )
            )
        );
        myDecoratedRifle.whatAreYou();
        System.out.println("\n--------");

    }
}