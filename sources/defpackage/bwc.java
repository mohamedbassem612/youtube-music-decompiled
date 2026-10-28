package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bwc {
    public static final bwc a = new bwc(-1, -1);
    public final int b;
    public final int c;

    static {
        new bwc(0, 0);
        int i = bwp.a;
    }

    public bwc(int i, int i2) {
        if ((i != -1 && i < 0) || (i2 != -1 && i2 < 0)) {
            throw new IllegalArgumentException();
        }
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this != obj) {
            if (!(obj instanceof bwc)) {
                return false;
            }
            bwc bwcVar = (bwc) obj;
            if (this.b != bwcVar.b || this.c != bwcVar.c) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = this.b;
        return this.c ^ ((i << 16) | (i >>> 16));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append('x');
        sb.append(this.c);
        return sb.toString();
    }
}
