package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wlt {
    public static final /* synthetic */ int d = 0;

    @Deprecated
    private static final twq e = new twq(100, 10000, 3, -1, 2.0d);
    private static final agex f = new idn(4);
    public final agex a;
    public final twi b;
    public final twq c;

    public wlt(agex agexVar, twi twiVar, twq twqVar) {
        this.a = agexVar;
        this.b = twiVar;
        this.c = twqVar;
    }

    public static ahfi b(long j) {
        if (j == 0) {
            j = 120000;
        }
        twq twqVar = new twq(1000L, 30000L, 2147483647L, j, 2.0d);
        ahfi ahfiVar = new ahfi(null);
        ahfiVar.h(twqVar);
        ahfiVar.i(f);
        return ahfiVar;
    }

    @Deprecated
    public static ahfi c() {
        ahfi ahfiVar = new ahfi(null);
        ahfiVar.h(e);
        ahfiVar.i(f);
        return ahfiVar;
    }

    public final boolean a() {
        return this.b != null;
    }

    public final boolean equals(Object obj) {
        twi twiVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof wlt) {
            wlt wltVar = (wlt) obj;
            if (this.a.equals(wltVar.a) && ((twiVar = this.b) != null ? twiVar.equals(wltVar.b) : wltVar.b == null) && this.c.equals(wltVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        twi twiVar = this.b;
        return (((iHashCode * 1000003) ^ (twiVar == null ? 0 : twiVar.hashCode())) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        twq twqVar = this.c;
        twi twiVar = this.b;
        return "InnerTubeRetryPolicy{isErrorRetryable=" + String.valueOf(this.a) + ", uriMutator=" + String.valueOf(twiVar) + ", exponentialBackoffPolicy=" + String.valueOf(twqVar) + '}';
    }

    public wlt() {
        throw null;
    }
}
