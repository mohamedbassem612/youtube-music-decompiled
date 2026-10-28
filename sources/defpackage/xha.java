package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xha {
    private final Object a;
    private final int b;
    private final int c;

    public xha(Object obj, int i, int i2) {
        this.a = obj;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof xha) {
            xha xhaVar = (xha) obj;
            if (this.c == xhaVar.c && ((obj2 = this.a) == null ? xhaVar.a == null : obj2.equals(xhaVar.a)) && this.b == xhaVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        return (this.b * 31) + this.c + (obj != null ? obj.hashCode() : 0);
    }
}
