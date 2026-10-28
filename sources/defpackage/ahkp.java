package defpackage;

import app.rive.semantics.SemanticState;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahkp {
    private static final BigInteger d;
    private static final BigInteger e;
    private Integer f = null;
    public BigInteger a = ahks.a;
    public ahkq b = null;
    public ahkr c = ahkr.d;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        d = bigIntegerValueOf;
        e = bigIntegerValueOf.pow(SemanticState.Hidden);
    }

    public final ahks a() throws GeneralSecurityException {
        Integer num = this.f;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.a == null) {
            throw new GeneralSecurityException("publicExponent is not set");
        }
        if (this.b == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (this.c == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (num.intValue() < 2048) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 2048 bits", this.f));
        }
        BigInteger bigInteger = this.a;
        int iCompareTo = bigInteger.compareTo(ahks.a);
        if (iCompareTo != 0) {
            if (iCompareTo < 0) {
                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(d).equals(BigInteger.ZERO)) {
                throw new InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(e) > 0) {
                throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }
        return new ahks(this.f.intValue(), this.a, this.c, this.b);
    }

    public final void b(int i) {
        this.f = Integer.valueOf(i);
    }
}
