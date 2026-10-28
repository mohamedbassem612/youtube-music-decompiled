package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zqx implements zrb, zqv {
    public final zqg a;

    public zqx(zqg zqgVar) {
        this.a = zqgVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof zqx) && awrc.c(this.a, ((zqx) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NavigatedForward(from=" + this.a + ')';
    }
}
