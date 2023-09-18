package onboarding.problem2;

public class Cryptograph {
    private String cryptogram;

    public Cryptograph(String cryptogram) {
        this.cryptogram = cryptogram;
    }

    private String deleteDuplication(String cryptogram) {
        int i;
        int j = 0;
        boolean isDuplicated = false;
        int length = cryptogram.length();
        for (i = 0; i < length; i++) {
            for (j = i+1; j < length; j++) {
                if (cryptogram.charAt(i) == cryptogram.charAt(j)) {
                    isDuplicated = true;
                    continue;
                }
                break;
            }
            if (isDuplicated) {
                break;
            }
        }
        if (isDuplicated) {
            return delete(cryptogram, i, j);
        }
        return cryptogram;
    }

    private String delete(String cryptogram, int start, int end) {
        return cryptogram.substring(0, start) + cryptogram.substring(end);
    }
}
