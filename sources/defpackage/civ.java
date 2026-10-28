package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class civ {
    public final long a;
    public final long b;
    private final String c;
    private int d;

    public civ(String str, long j, long j2) {
        this.c = str == null ? "" : str;
        this.a = j;
        this.b = j2;
    }

    public final Uri a(String str) {
        return atv.c(str, this.c);
    }

    public final civ b(civ civVar, String str) {
        String strC = c(str);
        if (civVar != null && strC.equals(civVar.c(str))) {
            long j = this.b;
            if (j != -1) {
                long j2 = this.a;
                if (j2 + j == civVar.a) {
                    long j3 = civVar.b;
                    return new civ(strC, j2, j3 != -1 ? j + j3 : -1L);
                }
            }
            long j4 = civVar.b;
            if (j4 != -1) {
                long j5 = civVar.a;
                if (j5 + j4 == this.a) {
                    return new civ(strC, j5, j != -1 ? j4 + j : -1L);
                }
            }
        }
        return null;
    }

    public final String c(String str) {
        return atv.d(str, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            civ civVar = (civ) obj;
            if (this.a == civVar.a && this.b == civVar.b && this.c.equals(civVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((int) this.a) + 527) * 31) + ((int) this.b)) * 31) + this.c.hashCode();
        this.d = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        return "RangedUri(referenceUri=" + this.c + ", start=" + this.a + ", length=" + this.b + ')';
    }
}
