package defpackage;

import android.view.Surface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zeq implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Surface a;
    public final /* synthetic */ zsf b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ywn d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Object f;

    public /* synthetic */ zeq(Object obj, Surface surface, zsf zsfVar, boolean z, ywn ywnVar, long j, int i) {
        this.$cid = i;
        this.f = obj;
        this.a = surface;
        this.b = zsfVar;
        this.c = z;
        this.d = ywnVar;
        this.e = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.$cid != 0) {
            zen zenVar = this.c ? zen.t : zen.s;
            long j = this.e;
            ywn ywnVar = this.d;
            zsf zsfVar = this.b;
            Surface surface = this.a;
            zek zekVar = (zek) this.f;
            zekVar.t(zenVar, zsfVar, System.identityHashCode(surface), zlo.NONE, null, Long.valueOf(j));
            zekVar.b(ywnVar);
            return;
        }
        zet zetVar = (zet) this.f;
        if (zetVar.a) {
            zen zenVar2 = this.c ? zen.t : zen.s;
            long j2 = this.e;
            ywn ywnVar2 = this.d;
            zetVar.t(zenVar2, this.b, System.identityHashCode(this.a), zlo.NONE, null, Long.valueOf(j2));
            zetVar.b(ywnVar2);
        }
    }
}
