package defpackage;

import app.rive.semantics.SemanticState;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahkw {
    private static final BigInteger e;
    private static final BigInteger f;
    private Integer g = null;
    public BigInteger a = ahkz.a;
    public ahkx b = null;
    public ahkx c = null;
    private Integer h = null;
    public ahky d = ahky.d;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        e = bigIntegerValueOf;
        f = bigIntegerValueOf.pow(SemanticState.Hidden);
    }

    public final ahkz a() throws GeneralSecurityException {
        Integer num = this.g;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.a == null) {
            throw new GeneralSecurityException("publicExponent is not set");
        }
        if (this.b == null) {
            throw new GeneralSecurityException("signature hash type is not set");
        }
        if (this.c == null) {
            throw new GeneralSecurityException("mgf1 hash type is not set");
        }
        if (this.d == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (this.h == null) {
            throw new GeneralSecurityException("salt length is not set");
        }
        if (num.intValue() < 2048) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least %d bits", this.g, Integer.valueOf(SemanticState.Modal)));
        }
        if (this.b != this.c) {
            throw new GeneralSecurityException("MGF1 hash is different from signature hash");
        }
        BigInteger bigInteger = this.a;
        int iCompareTo = bigInteger.compareTo(ahkz.a);
        if (iCompareTo != 0) {
            if (iCompareTo < 0) {
                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(e).equals(BigInteger.ZERO)) {
                throw new InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(f) > 0) {
                throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }
        return new ahkz(this.g.intValue(), this.a, this.d, this.b, this.c, this.h.intValue());
    }

    public final void b(int i) {
        this.g = Integer.valueOf(i);
    }

    public final void c(int i) throws GeneralSecurityException {
        if (i < 0) {
            throw new GeneralSecurityException(String.format("Invalid salt length in bytes %d; salt length must be positive", Integer.valueOf(i)));
        }
        this.h = Integer.valueOf(i);
    }
}
