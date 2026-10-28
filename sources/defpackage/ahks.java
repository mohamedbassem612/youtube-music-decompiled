package defpackage;

import j$.util.Objects;
import java.math.BigInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahks extends afyd {
    public static final BigInteger a = BigInteger.valueOf(65537);
    public final int b;
    public final BigInteger c;
    public final ahkr d;
    public final ahkq e;

    public ahks(int i, BigInteger bigInteger, ahkr ahkrVar, ahkq ahkqVar) {
        this.b = i;
        this.c = bigInteger;
        this.d = ahkrVar;
        this.e = ahkqVar;
    }

    public final boolean S() {
        return this.d != ahkr.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ahks)) {
            return false;
        }
        ahks ahksVar = (ahks) obj;
        return ahksVar.b == this.b && Objects.equals(ahksVar.c, this.c) && ahksVar.d == this.d && ahksVar.e == this.e;
    }

    public final int hashCode() {
        return Objects.hash(ahks.class, Integer.valueOf(this.b), this.c, this.d, this.e);
    }

    public final String toString() {
        BigInteger bigInteger = this.c;
        ahkq ahkqVar = this.e;
        return "RSA SSA PKCS1 Parameters (variant: " + String.valueOf(this.d) + ", hashType: " + String.valueOf(ahkqVar) + ", publicExponent: " + String.valueOf(bigInteger) + ", and " + this.b + "-bit modulus)";
    }
}
