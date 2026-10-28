package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ve extends vm {
    public final int a;
    public final int b;

    public ve(int i, int i2) {
        super((byte[]) null);
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ve) {
            ve veVar = (ve) obj;
            if (Objects.equals(Integer.valueOf(this.a), Integer.valueOf(veVar.a)) && this.b == veVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b));
    }

    public final String toString() {
        return "{joinableValueType: " + this.a + ", deletePropagationType: " + this.b + '}';
    }
}
