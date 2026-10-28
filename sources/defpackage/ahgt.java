package defpackage;

import java.math.BigInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahgt {
    static final ahgt a = new ahgt(BigInteger.ONE, BigInteger.ONE, BigInteger.ZERO);
    public final BigInteger b;
    public final BigInteger c;
    public final BigInteger d;

    public ahgt(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.b = bigInteger;
        this.c = bigInteger2;
        this.d = bigInteger3;
    }

    public final boolean a() {
        return this.d.equals(BigInteger.ZERO);
    }
}
