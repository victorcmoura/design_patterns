public class MultiplierProxy implements MultiplierInterface {
    private Multiplier multiplier;
    // Caches multipliers up to 99*99
    private Integer[][] cache = new Integer[100][100];

    public MultiplierProxy() {
        this.multiplier = new Multiplier();
    }

    public Integer multiply(Integer a, Integer b) {
        if ( (a < 100 && b < 100) && (a >= 0 && b >= 0) ) {
            // If it is possible to cache this multiplication
            if (this.cache[a][b] == null) {
                Integer result = multiplier.multiply(a, b);
                cache[a][b] = result;
                cache[b][a] = result;
            }
            return cache[a][b];
        }
        return multiplier.multiply(a, b);
    }
}