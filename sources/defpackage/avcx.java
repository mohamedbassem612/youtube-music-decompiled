package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avcx implements Runnable {
    final avcw a;
    final /* synthetic */ String b;
    final /* synthetic */ avbe c;
    final /* synthetic */ avbh d;
    final /* synthetic */ avjz e;
    final /* synthetic */ auyq f;
    final /* synthetic */ avcy g;

    public avcx(avcy avcyVar, String str, avbe avbeVar, avbh avbhVar, avjz avjzVar, auyq auyqVar) {
        this.b = str;
        this.c = avbeVar;
        this.d = avbhVar;
        this.e = avjzVar;
        this.f = auyqVar;
        this.g = avcyVar;
        this.a = new avcw(str, avcyVar.a, avcyVar.e, avbeVar, avcyVar, this, avcyVar.c, avcyVar.f, avbhVar, avjzVar, auyqVar, avcyVar.g);
    }

    @Override // java.lang.Runnable
    public final void run() {
        avcy avcyVar = this.g;
        synchronized (avcyVar.c) {
            if (avcyVar.i) {
                this.a.q.e(avcyVar.j, true, new avbe());
            } else {
                if (!avcyVar.k) {
                    throw new AssertionError("Transport is not started");
                }
                avcw avcwVar = this.a;
                avcyVar.d.add(avcwVar);
                avcwVar.q.A.r = avcyVar.l;
            }
        }
    }
}
