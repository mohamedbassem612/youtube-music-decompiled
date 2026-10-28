package defpackage;

import android.view.View;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class xsg extends xrw {
    final /* synthetic */ xvq a;
    final /* synthetic */ cf b;
    final /* synthetic */ xsh c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xsg(xsh xshVar, dii diiVar, xre xreVar, Boolean bool, dov dovVar, xrd xrdVar, tbt tbtVar, xvq xvqVar, cf cfVar) {
        super(diiVar, xreVar, bool, dovVar, xrdVar, tbtVar);
        this.a = xvqVar;
        this.b = cfVar;
        this.c = xshVar;
    }

    @Override // defpackage.xrw
    public final void a() {
        xgx xgxVar;
        xsh xshVar = this.c;
        xsj xsjVar = xshVar.c;
        xvq xvqVar = this.a;
        int iA = xshVar.a();
        xgn xgnVar = xsjVar.x;
        if (xgnVar != null) {
            HashMap map = xsjVar.y;
            dii diiVar = xvqVar.a;
            if (map.containsKey(xrx.a(diiVar)) && (xgxVar = (xgx) map.get(xrx.a(diiVar))) != null) {
                ameb amebVar = ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK;
                aihf aihfVarCreateBuilder = amdd.a.createBuilder();
                aihf aihfVarCreateBuilder2 = amdg.a.createBuilder();
                int iW = xsjVar.w(xvqVar);
                aihfVarCreateBuilder2.copyOnWrite();
                amdg amdgVar = (amdg) aihfVarCreateBuilder2.instance;
                amdgVar.c = iW - 1;
                amdgVar.b |= 1;
                int iBU = zik.bU(iA);
                aihfVarCreateBuilder2.copyOnWrite();
                amdg amdgVar2 = (amdg) aihfVarCreateBuilder2.instance;
                amdgVar2.d = iBU - 1;
                amdgVar2.b |= 4;
                aihf aihfVarCreateBuilder3 = amdf.a.createBuilder();
                int iBU2 = zik.bU(iA);
                aihfVarCreateBuilder3.copyOnWrite();
                amdf amdfVar = (amdf) aihfVarCreateBuilder3.instance;
                amdfVar.c = iBU2 - 1;
                amdfVar.b |= 1;
                int iBU3 = zik.bU(xsjVar.M.b);
                aihfVarCreateBuilder3.copyOnWrite();
                amdf amdfVar2 = (amdf) aihfVarCreateBuilder3.instance;
                amdfVar2.d = iBU3 - 1;
                amdfVar2.b |= 2;
                afha afhaVarO = xvq.o();
                dij dijVar = xsjVar.l;
                afhaVarO.g(dij.j());
                boolean zL = afhaVarO.d().l();
                aihfVarCreateBuilder3.copyOnWrite();
                amdf amdfVar3 = (amdf) aihfVarCreateBuilder3.instance;
                amdfVar3.b |= 4;
                amdfVar3.e = zL;
                amdf amdfVar4 = (amdf) aihfVarCreateBuilder3.build();
                aihfVarCreateBuilder2.copyOnWrite();
                amdg amdgVar3 = (amdg) aihfVarCreateBuilder2.instance;
                amdfVar4.getClass();
                amdgVar3.f = amdfVar4;
                amdgVar3.b |= 16;
                amdg amdgVar4 = (amdg) aihfVarCreateBuilder2.build();
                aihfVarCreateBuilder.copyOnWrite();
                amdd amddVar = (amdd) aihfVarCreateBuilder.instance;
                amdgVar4.getClass();
                amddVar.f = amdgVar4;
                amddVar.b |= 4;
                xgnVar.o(amebVar, xgxVar, (amdd) aihfVarCreateBuilder.build());
            }
        }
        if (xvqVar.k() && !xsjVar.p(xvqVar)) {
            xshVar.b.h(true);
        } else {
            if (xsjVar.t() || !xvqVar.b) {
                return;
            }
            xshVar.b.a(xvqVar.a);
        }
    }

    @Override // defpackage.xrw, android.view.View.OnClickListener
    public final void onClick(View view) {
        super.onClick(view);
        if (this.a.b) {
            this.c.h(this.b, 3);
        }
    }
}
