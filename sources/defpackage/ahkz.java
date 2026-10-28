package defpackage;

import j$.util.Objects;
import java.math.BigInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahkz extends afyd {
    public static final BigInteger a = BigInteger.valueOf(65537);
    public final int b;
    public final BigInteger c;
    public final ahky d;
    public final ahkx e;
    public final ahkx f;
    public final int g;

    public ahkz(int i, BigInteger bigInteger, ahky ahkyVar, ahkx ahkxVar, ahkx ahkxVar2, int i2) {
        this.b = i;
        this.c = bigInteger;
        this.d = ahkyVar;
        this.e = ahkxVar;
        this.f = ahkxVar2;
        this.g = i2;
    }

    public final boolean S() {
        return this.d != ahky.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ahkz)) {
            return false;
        }
        ahkz ahkzVar = (ahkz) obj;
        return ahkzVar.b == this.b && Objects.equals(ahkzVar.c, this.c) && Objects.equals(ahkzVar.d, this.d) && Objects.equals(ahkzVar.e, this.e) && Objects.equals(ahkzVar.f, this.f) && ahkzVar.g == this.g;
    }

    public final int hashCode() {
        return Objects.hash(ahkz.class, Integer.valueOf(this.b), this.c, this.d, this.e, this.f, Integer.valueOf(this.g));
    }

    public final String toString() {
        BigInteger bigInteger = this.c;
        ahkx ahkxVar = this.f;
        ahkx ahkxVar2 = this.e;
        return "RSA SSA PSS Parameters (variant: " + String.valueOf(this.d) + ", signature hashType: " + String.valueOf(ahkxVar2) + ", mgf1 hashType: " + String.valueOf(ahkxVar) + ", saltLengthBytes: " + this.g + ", publicExponent: " + String.valueOf(bigInteger) + ", and " + this.b + "-bit modulus)";
    }
}
