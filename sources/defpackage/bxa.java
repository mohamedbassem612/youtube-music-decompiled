package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bxa implements bsw {
    public final long a;
    public final long b;
    public final long c;

    public bxa(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
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
        if (obj instanceof bxa) {
            bxa bxaVar = (bxa) obj;
            if (this.a == bxaVar.a && this.b == bxaVar.b && this.c == bxaVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((a.ak(this.a) + 527) * 31) + a.ak(this.b)) * 31) + a.ak(this.c);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.a + ", modification time=" + this.b + ", timescale=" + this.c;
    }

    @Override // defpackage.bsw
    public final /* synthetic */ void b(bsu bsuVar) {
    }
}
