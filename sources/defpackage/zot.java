package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class zot {
    public final String b;

    public zot(String str) {
        this.b = str;
    }

    public final boolean a(String str) {
        return awrc.c(this.b, str);
    }

    public final boolean b() {
        return awrc.c(this, zol.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zot) {
            return a(((zot) obj).b);
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
