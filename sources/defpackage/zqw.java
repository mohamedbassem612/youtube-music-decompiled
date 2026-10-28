package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zqw implements zrb, zqv {
    public final zqg a;

    public zqw(zqg zqgVar) {
        this.a = zqgVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof zqw) && awrc.c(this.a, ((zqw) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NavigatedBackward(from=" + this.a + ')';
    }
}
