package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cxo implements bsw {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public cxo(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    @Override // defpackage.bsw
    public final /* synthetic */ bse a() {
        return null;
    }

    @Override // defpackage.bsw
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cxo cxoVar = (cxo) obj;
            if (this.a == cxoVar.a && this.b == cxoVar.b && this.c == cxoVar.c && this.d == cxoVar.d && this.e == cxoVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iAk = a.ak(this.a) + 527;
        long j = this.e;
        long j2 = this.d;
        return (((((((iAk * 31) + a.ak(this.b)) * 31) + a.ak(this.c)) * 31) + a.ak(j2)) * 31) + a.ak(j);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.a + ", photoSize=" + this.b + ", photoPresentationTimestampUs=" + this.c + ", videoStartPosition=" + this.d + ", videoSize=" + this.e;
    }

    @Override // defpackage.bsw
    public final /* synthetic */ void b(bsu bsuVar) {
    }
}
