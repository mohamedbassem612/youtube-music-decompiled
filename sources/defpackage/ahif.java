package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum ahif implements aihr {
    CLASSICAL_ALGORITHM_UNKNOWN(0),
    CLASSICAL_ALGORITHM_ED25519(1),
    CLASSICAL_ALGORITHM_ECDSA_P256(2),
    CLASSICAL_ALGORITHM_ECDSA_P384(3),
    CLASSICAL_ALGORITHM_ECDSA_P521(4),
    CLASSICAL_ALGORITHM_RSA3072_PSS(5),
    CLASSICAL_ALGORITHM_RSA4096_PSS(6),
    CLASSICAL_ALGORITHM_RSA3072_PKCS1(7),
    CLASSICAL_ALGORITHM_RSA4096_PKCS1(8),
    UNRECOGNIZED(-1);

    private final int l;

    ahif(int i) {
        this.l = i;
    }

    public static ahif a(int i) {
        switch (i) {
            case 0:
                return CLASSICAL_ALGORITHM_UNKNOWN;
            case 1:
                return CLASSICAL_ALGORITHM_ED25519;
            case 2:
                return CLASSICAL_ALGORITHM_ECDSA_P256;
            case 3:
                return CLASSICAL_ALGORITHM_ECDSA_P384;
            case 4:
                return CLASSICAL_ALGORITHM_ECDSA_P521;
            case 5:
                return CLASSICAL_ALGORITHM_RSA3072_PSS;
            case 6:
                return CLASSICAL_ALGORITHM_RSA4096_PSS;
            case 7:
                return CLASSICAL_ALGORITHM_RSA3072_PKCS1;
            case 8:
                return CLASSICAL_ALGORITHM_RSA4096_PKCS1;
            default:
                return null;
        }
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this == UNRECOGNIZED ? aiif.a() : this.l;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.l);
    }
}
