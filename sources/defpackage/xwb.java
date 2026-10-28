package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xwb {
    public final xwa a;
    public final String b;
    public final String c;

    public xwb(xwa xwaVar, String str, String str2) {
        this.a = xwaVar;
        this.b = str;
        this.c = str2;
    }

    public final String a() {
        return this.a.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xwb) {
            return this.a.equals(((xwb) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
