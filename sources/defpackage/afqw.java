package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afqw {
    public final int a;
    public final int b;

    public afqw(int i) {
        this.a = i;
        this.b = 2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof afqw) {
            afqw afqwVar = (afqw) obj;
            if (this.a == afqwVar.a && this.b == afqwVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return a.ch((byte) 125, this.b != 1 ? "CREDENTIAL" : "DEVICE", this.a != 1 ? "CACHE" : "FILES", "StorageSpec{type=", ", directBoot=");
    }

    public afqw() {
        throw null;
    }
}
