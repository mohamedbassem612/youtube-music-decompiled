package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class tet {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final Integer e;

    public tet(int i, int i2, int i3, int i4, Integer num) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tet) {
            tet tetVar = (tet) obj;
            if (this.a == tetVar.a && this.b == tetVar.b && this.c == tetVar.c && this.d == tetVar.d && awrc.c(this.e, tetVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.e;
        int iHashCode = num == null ? 0 : num.hashCode();
        int i = this.a;
        return (((((((i * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + iHashCode;
    }

    public final String toString() {
        return "Result(anonRssMb=" + this.a + ", swapMb=" + this.b + ", dmaBufMb=" + this.c + ", totalFootprintMb=" + this.d + ", availMemMb=" + this.e + ')';
    }
}
