package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class etx {
    public static final etw a = new etv();
    public final Object b;
    public final etw c;
    public final String d;
    public volatile byte[] e;

    public etx(String str, Object obj, etw etwVar) {
        gzj.bK(str);
        this.d = str;
        this.b = obj;
        this.c = etwVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof etx) {
            return this.d.equals(((etx) obj).d);
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return "Option{key='" + this.d + "'}";
    }
}
