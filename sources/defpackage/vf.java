package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class vf extends vm {
    public final int a;
    public final int b;

    public vf(int i, int i2) {
        super((byte[]) null);
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vf) {
            vf vfVar = (vf) obj;
            if (this.a == vfVar.a && Objects.equals(Integer.valueOf(this.b), Integer.valueOf(vfVar.b))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b));
    }

    public final String toString() {
        return "{indexingType: " + this.a + ", tokenizerType: " + this.b + '}';
    }
}
