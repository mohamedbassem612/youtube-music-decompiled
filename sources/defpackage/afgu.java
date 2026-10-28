package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afgu {
    public final int a;
    public int b;

    public afgu(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof afgu) {
            afgu afguVar = (afgu) obj;
            if (this.a == afguVar.a && this.b == afguVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "ActiveCallbacks(callbacksId=" + this.a + ", callbacksState=" + this.b + ')';
    }
}
