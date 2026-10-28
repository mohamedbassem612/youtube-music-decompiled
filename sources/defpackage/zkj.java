package defpackage;

import android.util.Pair;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zkj {
    public static final zkj a = new zkj(-1, -1, false);
    public final boolean b;
    public final int c;
    public final int d;

    public zkj(Pair pair) {
        this(((Integer) pair.first).intValue(), ((Integer) pair.second).intValue(), false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zkj) {
            zkj zkjVar = (zkj) obj;
            if (this.c == zkjVar.c && this.d == zkjVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.c * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.c);
        sb.append('x');
        sb.append(this.d);
        sb.append('x');
        sb.append(this.b);
        return sb.toString();
    }

    public zkj(int i, int i2, boolean z) {
        this.c = i;
        this.d = i2;
        this.b = z;
    }
}
