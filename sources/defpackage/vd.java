package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class vd extends vm {
    public final int a;

    public vd(int i) {
        super((byte[]) null);
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof vd) && this.a == ((vd) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return aie.e(Integer.valueOf(this.a));
    }

    public final String toString() {
        return "{indexingType: " + this.a + '}';
    }
}
