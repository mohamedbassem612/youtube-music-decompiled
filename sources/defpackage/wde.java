package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class wde implements aheh {
    final /* synthetic */ wdf a;

    public wde(wdf wdfVar) {
        this.a = wdfVar;
    }

    @Override // defpackage.aheh
    public final void a(Throwable th) {
        this.a.e.a("ISPES", "commit failed:".concat(String.valueOf(String.valueOf(th))));
    }

    @Override // defpackage.aheh
    public final /* synthetic */ void b(Object obj) {
        List<weo> list = (List) obj;
        if (list != null) {
            wdf wdfVar = this.a;
            for (weo weoVar : list) {
                wdfVar.x(weoVar.a).kk(weoVar);
                wdfVar.w(((weh) ahno.ad(weoVar.c, weoVar.b)).getClass()).kk(weoVar);
            }
        }
    }
}
