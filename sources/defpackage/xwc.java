package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class xwc {
    public final String b;

    public xwc(String str) {
        str.getClass();
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xwc) {
            return this.b.equals(((xwc) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b;
    }
}
