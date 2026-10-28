package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cyr extends cys {
    public final long a;
    public final long b;

    public cyr(long j, long j2) {
        this.a = j2;
        this.b = j;
    }

    @Override // defpackage.cys
    public final String toString() {
        return "SCTE-35 PrivateCommand { ptsAdjustment=" + this.a + ", identifier= " + this.b + " }";
    }
}
