package defpackage;

import app.rive.semantics.SemanticState;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class sqj implements avno {
    private final /* synthetic */ int $cid;

    public /* synthetic */ sqj(int i) {
        this.$cid = i;
    }

    @Override // defpackage.avno
    public final boolean a(Object obj) {
        switch (this.$cid) {
            case 0:
                return ((agev) obj).g();
            case 1:
                if (((aayt) obj).a == abnv.h) {
                    return true;
                }
                break;
            case 2:
                return a.w((weo) obj);
            case 3:
                if (tzk.t(((Long) obj).longValue(), SemanticState.Focused) == 2) {
                    return true;
                }
                break;
            case 4:
                long jLongValue = ((Long) obj).longValue();
                int i = trd.x;
                int iT = tzk.t(jLongValue, 209);
                if (iT == 2 || iT == 3) {
                    return true;
                }
                break;
            case 5:
                return ((Optional) obj).isPresent();
            case 6:
                apji apjiVar = (apji) obj;
                aihl aihlVarCheckIsLite = aihn.checkIsLite(akrs.a);
                apjiVar.c(aihlVarCheckIsLite);
                return apjiVar.j.n(aihlVarCheckIsLite.d);
            case 7:
                if (((Integer) obj).intValue() <= 0) {
                    return true;
                }
                break;
            case 8:
                return ((vun) obj).equals(vun.d);
            case 9:
                return ((vvl) obj).c.g();
            case 10:
                int i2 = vpf.d;
                return a.w((weo) obj);
            case 11:
                amwf amwfVar = (amwf) obj;
                int i3 = vpf.d;
                if (amwfVar.g() && amwfVar.getSyncEnabled().booleanValue() && (amwfVar.c.c & 4) != 0 && amwfVar.e()) {
                    return true;
                }
                break;
            case 12:
                return ((vun) obj).equals(vun.c);
            case 13:
                return ((Boolean) obj).booleanValue();
            case 14:
                return ((Boolean) obj).booleanValue();
            case 15:
                return ((vvl) obj).c.g();
            case 16:
                xgz xgzVar = vum.a;
                return ((Boolean) obj).booleanValue();
            case 17:
                return a.w((weo) obj);
            case 18:
                ajvu ajvuVar = (ajvu) obj;
                if ((ajvuVar.b & 4194304) != 0) {
                    amuc amucVar = ajvuVar.p;
                    if (amucVar == null) {
                        amucVar = amuc.a;
                    }
                    if ((amucVar.b & 64) != 0) {
                        return true;
                    }
                }
                break;
            case 19:
                return ((Boolean) obj).booleanValue();
            default:
                return ((Boolean) obj).booleanValue();
        }
        return false;
    }
}
