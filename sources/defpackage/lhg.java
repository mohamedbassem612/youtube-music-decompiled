package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class lhg implements Runnable {
    final /* synthetic */ lhf a;
    final /* synthetic */ lhf b;
    final /* synthetic */ long c;
    final /* synthetic */ boolean d;
    final /* synthetic */ lhh e;

    public lhg(lhh lhhVar, lhf lhfVar, lhf lhfVar2, long j, boolean z) {
        this.a = lhfVar;
        this.b = lhfVar2;
        this.c = j;
        this.d = z;
        this.e = lhhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.v(this.a, this.b, this.c, this.d, null);
    }
}
