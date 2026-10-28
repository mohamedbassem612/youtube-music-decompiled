package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cwa {
    public static final cwa a = new cwa(0, 0);
    public final long b;
    public final long c;

    public cwa(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cwa cwaVar = (cwa) obj;
            if (this.b == cwaVar.b && this.c == cwaVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.b) * 31) + ((int) this.c);
    }

    public final String toString() {
        return "[timeUs=" + this.b + ", position=" + this.c + ']';
    }
}
