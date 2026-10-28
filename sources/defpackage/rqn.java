package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class rqn implements rjx {
    final /* synthetic */ rqo a;

    public rqn(rqo rqoVar) {
        this.a = rqoVar;
    }

    @Override // defpackage.rjx
    public final void a(String str, int i) {
        rqs rqsVar = (rqs) ((rqq) this.a.a).e.f.get(str);
        if (rqsVar != null) {
            rqsVar.b(i);
        }
    }

    @Override // defpackage.rjx
    public final void b(String str, ovo ovoVar) {
        rqq rqqVar = (rqq) this.a.a;
        rqt rqtVar = rqqVar.e;
        rqs rqsVar = (rqs) rqtVar.f.get(str);
        if (rqsVar != null) {
            ArrayList arrayList = new ArrayList();
            wns wnsVarG = ovoVar.g();
            if (wnsVarG != null) {
                for (Object obj : wnsVarG.d()) {
                    if (obj instanceof wnq) {
                        arrayList.add((wnq) obj);
                    }
                }
            }
            rqsVar.a.addAll(agke.n(arrayList));
            rqtVar.h.d(new xgj(ovoVar.k()));
        }
        rqqVar.f.b();
    }
}
