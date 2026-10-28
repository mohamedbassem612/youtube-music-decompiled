package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
abstract class cxf {
    protected final cwj d;

    protected cxf(cwj cwjVar) {
        this.d = cwjVar;
    }

    protected abstract boolean a(bwb bwbVar);

    protected abstract boolean b(bwb bwbVar, long j);

    public final boolean c(bwb bwbVar, long j) {
        return a(bwbVar) && b(bwbVar, j);
    }
}
