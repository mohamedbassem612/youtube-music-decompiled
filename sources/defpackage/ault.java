package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ault {
    public static final ault a;
    public static final ault b;
    public final String c;

    static {
        ault aultVar = auln.a;
        a = auln.a;
        int i = aulo.a;
        ault aultVar2 = aulp.a;
        b = aulp.a;
        int i2 = aulq.a;
        int i3 = aulr.a;
        int i4 = auls.a;
    }

    public ault(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ault) {
            return this.c.equals(((ault) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " name=" + this.c + '>';
    }
}
