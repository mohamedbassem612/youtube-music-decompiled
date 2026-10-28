package defpackage;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abqs implements tgs {
    private final tbt a;
    private final WeakReference b;
    private final vzo c = new vzo();
    private final vzn d = new vzn();

    public abqs(tbt tbtVar, xir xirVar) {
        this.a = tbtVar;
        this.b = new WeakReference(xirVar);
    }

    @Override // defpackage.tgs
    public final void b() {
        tbt tbtVar = this.a;
        vzn vznVar = this.d;
        tbtVar.c(vznVar);
        xir xirVar = (xir) this.b.get();
        if (xirVar != null) {
            xirVar.n(vznVar.d);
        }
    }

    @Override // defpackage.tgs
    public final void c() {
        tbt tbtVar = this.a;
        vzo vzoVar = this.c;
        tbtVar.c(vzoVar);
        xir xirVar = (xir) this.b.get();
        if (xirVar != null) {
            xirVar.n(vzoVar.d);
        }
    }

    @Override // defpackage.tgs
    public final void a() {
    }

    @Override // defpackage.tgs
    public final void d() {
    }

    @Override // defpackage.tgs
    public final /* synthetic */ void e() {
    }
}
