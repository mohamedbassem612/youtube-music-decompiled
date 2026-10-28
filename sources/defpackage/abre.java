package defpackage;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abre implements tgs {
    private final tbt a;
    private final WeakReference b;
    private final vzm c = new vzm();
    private final vzl d = new vzl();
    private final vzk e = new vzk();
    private final vzj f = new vzj();

    public abre(tbt tbtVar, xir xirVar) {
        this.a = tbtVar;
        this.b = new WeakReference(xirVar);
    }

    @Override // defpackage.tgs
    public final void a() {
        tbt tbtVar = this.a;
        vzm vzmVar = this.c;
        tbtVar.c(vzmVar);
        xir xirVar = (xir) this.b.get();
        if (xirVar != null) {
            xirVar.n(vzmVar.d);
        }
    }

    @Override // defpackage.tgs
    public final void b() {
        tbt tbtVar = this.a;
        vzj vzjVar = this.f;
        tbtVar.c(vzjVar);
        xir xirVar = (xir) this.b.get();
        if (xirVar != null) {
            xirVar.n(vzjVar.d);
        }
    }

    @Override // defpackage.tgs
    public final void c() {
        tbt tbtVar = this.a;
        vzk vzkVar = this.e;
        tbtVar.c(vzkVar);
        xir xirVar = (xir) this.b.get();
        if (xirVar != null) {
            xirVar.n(vzkVar.d);
        }
    }

    @Override // defpackage.tgs
    public final void d() {
        tbt tbtVar = this.a;
        vzl vzlVar = this.d;
        tbtVar.c(vzlVar);
        xir xirVar = (xir) this.b.get();
        if (xirVar != null) {
            xirVar.n(vzlVar.d);
        }
    }

    @Override // defpackage.tgs
    public final /* synthetic */ void e() {
        d();
    }
}
