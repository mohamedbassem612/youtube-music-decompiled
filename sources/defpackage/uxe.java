package defpackage;

import android.graphics.Rect;
import app.rive.semantics.SemanticState;
import j$.util.Collection;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class uxe implements avnn {
    private final /* synthetic */ int $cid;

    public /* synthetic */ uxe(int i) {
        this.$cid = i;
    }

    @Override // defpackage.avnn
    public final Object a(Object obj) {
        Object vqcVar;
        int iBc;
        int iBc2;
        boolean z = false;
        switch (this.$cid) {
            case 0:
                apji apjiVar = (apji) obj;
                aihl aihlVarCheckIsLite = aihn.checkIsLite(akrs.a);
                apjiVar.c(aihlVarCheckIsLite);
                Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
                return (akrn) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
            case 1:
                apji apjiVar2 = ((alqr) obj).f;
                if (apjiVar2 == null) {
                    apjiVar2 = apji.a;
                }
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apxh.b);
                apjiVar2.c(aihlVarCheckIsLite2);
                Object objK2 = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                apji apjiVar3 = ((apxh) (objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2))).c;
                return apjiVar3 == null ? apji.a : apjiVar3;
            case 2:
                return (agke) Collection.EL.stream((agke) obj).map(new ush(13)).filter(new uvm(2)).collect(aghu.a);
            case 3:
                return Boolean.valueOf(((agev) obj).g());
            case 4:
                vne vneVar = (vne) obj;
                return new vnd(vneVar.b, vneVar.d, vqb.a);
            case 5:
                return ((vnd) obj).c;
            case 6:
                int i = vpf.d;
                weh wehVar = ((weo) obj).c;
                wehVar.getClass();
                return wehVar;
            case 7:
                amwf amwfVar = (amwf) obj;
                int i2 = vpf.d;
                Optional.empty();
                Optional optionalEmpty = Optional.empty();
                String panelId = amwfVar.getPanelId();
                if (panelId == null) {
                    throw new NullPointerException("Null panelId");
                }
                int iIntValue = amwfVar.getActiveItemIndex().intValue();
                if ((amwfVar.c.c & SemanticState.Focused) != 0) {
                    optionalEmpty = Optional.of(amwfVar.getActiveSyncId());
                }
                vqcVar = new vqc(panelId, iIntValue, optionalEmpty);
                break;
                break;
            case 8:
                return !((Boolean) obj).booleanValue() ? avlr.J(Boolean.FALSE) : avlr.J(Boolean.TRUE);
            case 9:
                return Optional.of((agew) obj);
            case 10:
                return Optional.of((weo) obj);
            case 11:
                vqcVar = new vtl(((Integer) obj).intValue(), 0);
                break;
            case 12:
                return (avlh) obj;
            case 13:
                return Integer.valueOf(((Rect) obj).height());
            case 14:
                agev agevVar = (agev) obj;
                if (((vob) agevVar.c()).u() != null && (((iBc = a.bc(((vob) agevVar.c()).u().p)) != 0 && iBc == 4) || ((iBc2 = a.bc(((vob) agevVar.c()).u().p)) != 0 && iBc2 == 5))) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 15:
                weh wehVar2 = (weh) ((agev) obj).f();
                return wehVar2 != null ? agev.i(wehVar2.c()) : agdf.a;
            case 16:
                return agev.h(((weo) obj).c);
            case 17:
                wep wepVarA = ((wff) obj).a();
                return wepVarA == null ? avlm.l() : avlm.q(wepVarA);
            case 18:
                return (wej) ((Optional) obj).orElse(wej.a);
            case 19:
                agkx agkxVar = new agkx();
                agqr it = ((agkz) obj).iterator();
                while (it.hasNext()) {
                    wep wepVarA2 = ((wff) it.next()).a();
                    if (wepVarA2 != null) {
                        agkxVar.c(wepVarA2);
                    }
                }
                return agkxVar.g();
            default:
                return agev.i((alzm) obj);
        }
        return vqcVar;
    }
}
