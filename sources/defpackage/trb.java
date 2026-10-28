package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class trb {
    public avlb a;
    public final int b;
    public tra c;
    tra d;
    public int e;

    public trb(int i, avlb avlbVar) {
        this.b = i;
        this.a = avlbVar;
    }

    public final void a(trk trkVar, Runnable runnable) {
        tra traVar = new tra(trkVar, runnable);
        tra traVar2 = this.d;
        if (traVar2 == null) {
            this.c = traVar;
        } else {
            traVar2.f = traVar;
        }
        this.d = traVar;
        traVar.f = null;
        this.e++;
    }

    public final void b(trk trkVar, Runnable runnable, boolean z) {
        if (z) {
            a(trkVar, runnable);
        }
    }
}
