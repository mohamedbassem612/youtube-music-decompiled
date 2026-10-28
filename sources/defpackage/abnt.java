package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abnt {
    public final long a;
    public final abns b;
    public final int c;

    public abnt(long j, abns abnsVar, int i) {
        this.a = j;
        this.b = abnsVar;
        this.c = i;
    }

    public static ahsk a() {
        ahsk ahskVar = new ahsk();
        ahskVar.e(0L);
        ahskVar.f(abns.b().c());
        ahskVar.d(1);
        return ahskVar;
    }

    public static ahsk b(abnt abntVar) {
        ahsk ahskVar = new ahsk();
        ahskVar.e(abntVar.a);
        ahskVar.f(abntVar.b);
        ahskVar.d(abntVar.c);
        return ahskVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof abnt) {
            abnt abntVar = (abnt) obj;
            if (this.a == abntVar.a && this.b.equals(abntVar.b)) {
                int i = this.c;
                int i2 = abntVar.c;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int iHashCode = ((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode();
        int i = this.c;
        a.bj(i);
        return ((iHashCode * 1000003) ^ i) * 1000003;
    }

    public final String toString() {
        String str;
        int i = this.c;
        String strValueOf = String.valueOf(this.b);
        if (i == 1) {
            str = "UNSPECIFIED";
        } else if (i != 2) {
            str = i != 3 ? "null" : "IMMEDIATE_PREFETCH";
        } else {
            str = "PREFETCH";
        }
        return "PrefetchPrebufferParameters{mediaDurationMs=" + this.a + ", prefetchPlaybackContextWrapper=" + strValueOf + ", fetchMode=" + str + ", expectedViewport=null}";
    }

    public abnt() {
        throw null;
    }
}
