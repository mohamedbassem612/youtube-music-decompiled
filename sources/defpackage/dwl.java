package defpackage;

import java.math.BigInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dwl implements Comparable {
    public static final dwl a = new dwl(0, 1, 0, "");
    public final int b;
    public final int c;
    public final int d;
    private final String e;
    private final awmi f = new awmp(new qf(this, 4));

    public dwl(int i, int i2, int i3, String str) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = str;
    }

    private final BigInteger b() {
        Object objA = this.f.a();
        objA.getClass();
        return (BigInteger) objA;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(dwl dwlVar) {
        dwlVar.getClass();
        return b().compareTo(dwlVar.b());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dwl)) {
            return false;
        }
        dwl dwlVar = (dwl) obj;
        return this.b == dwlVar.b && this.c == dwlVar.c && this.d == dwlVar.d;
    }

    public final int hashCode() {
        return ((((this.b + 527) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        String str = this.e;
        String strConcat = !awrc.v(str) ? "-".concat(str) : "";
        return this.b + '.' + this.c + '.' + this.d + strConcat;
    }
}
