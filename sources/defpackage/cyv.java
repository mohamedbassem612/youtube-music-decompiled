package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cyv extends cys {
    public final long a;
    public final long b;

    public cyv(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    static long d(bwb bwbVar, long j) {
        long jN = bwbVar.n();
        if ((128 & jN) != 0) {
            return ((((jN & 1) << 32) | bwbVar.w()) + j) & 8589934591L;
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.cys
    public final String toString() {
        return "SCTE-35 TimeSignalCommand { ptsTime=" + this.a + ", playbackPositionUs= " + this.b + " }";
    }
}
