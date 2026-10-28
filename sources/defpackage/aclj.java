package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aclj {
    public final ajuj a;
    public final int b;
    public final int c;

    public aclj(int i, ajuj ajujVar, int i2) {
        this.b = i;
        this.a = ajujVar;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aclj) {
            aclj acljVar = (aclj) obj;
            if (this.b == acljVar.b && awrc.c(this.a, acljVar.a) && this.c == acljVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        ajuj ajujVar = this.a;
        return (((this.b * 31) + (ajujVar == null ? 0 : ajujVar.hashCode())) * 31) + this.c;
    }

    public final String toString() {
        return "State(statsCardType=" + ((Object) Integer.toString(this.b - 1)) + ", clientRecapOccasion=" + this.a + ", artistRecapPage=" + ((Object) Integer.toString(this.c - 2)) + ')';
    }

    public aclj() {
        this(1, null, 2);
    }
}
