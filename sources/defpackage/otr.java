package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class otr implements ote {
    private final fce a;
    private dta b;

    public otr(fce fceVar) {
        this.a = fceVar;
        fceVar.d();
    }

    @Override // defpackage.ote
    public final void a(Runnable runnable) {
        dta dtaVar = this.b;
        if (dtaVar != null) {
            List list = this.a.e;
            if (list != null) {
                list.remove(dtaVar);
            }
            this.b = null;
        }
        if (runnable != null) {
            otq otqVar = new otq(runnable);
            this.b = otqVar;
            this.a.c(otqVar);
        }
    }

    @Override // defpackage.ote
    public final void b() {
        boolean zG = qpj.g();
        fce fceVar = this.a;
        if (zG) {
            fceVar.start();
        } else {
            qpj.e(new ooz(fceVar, 9));
        }
    }

    @Override // defpackage.ote
    public final void c() {
        boolean zG = qpj.g();
        fce fceVar = this.a;
        if (zG) {
            fceVar.stop();
        } else {
            qpj.e(new ooz(fceVar, 8));
        }
    }
}
