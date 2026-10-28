package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xvv {
    public final boolean a;
    public final int b;

    public xvv(int i, boolean z) {
        this.b = i;
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xvv)) {
            return false;
        }
        xvv xvvVar = (xvv) obj;
        return this.b == xvvVar.b && this.a == xvvVar.a;
    }

    public final int hashCode() {
        return this.b;
    }
}
