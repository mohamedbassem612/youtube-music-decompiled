package defpackage;

import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class aaep implements Predicate {
    private final /* synthetic */ int $cid;

    public /* synthetic */ aaep(int i) {
        this.$cid = i;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public final /* synthetic */ Predicate mo841negate() {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.$cid) {
            case 0:
                return ((aamt) obj).g();
            case 1:
                return ((wgs) obj).z().startsWith("text");
            case 2:
                int iAV = a.aV(((aqdp) obj).f);
                if (iAV != 0 && iAV == 3) {
                    return false;
                }
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                weh wehVar = (weh) obj;
                if (!(wehVar instanceof amtc) || ((amtc) wehVar).getLocalImageUrl().isEmpty()) {
                    return false;
                }
                break;
            case 6:
                aofh aofhVar = ((aanq) obj).c;
                int iBc = a.bc(aofhVar.c);
                if (iBc == 0 || iBc != 4) {
                    return false;
                }
                aofg aofgVar = aofhVar.e;
                if (aofgVar == null) {
                    aofgVar = aofg.b;
                }
                aihl aihlVar = aphe.b;
                aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
                aofgVar.c(aihlVarCheckIsLite);
                if (!aofgVar.j.n(aihlVarCheckIsLite.d)) {
                    return false;
                }
                aofg aofgVar2 = aofhVar.e;
                if (aofgVar2 == null) {
                    aofgVar2 = aofg.b;
                }
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                aofgVar2.c(aihlVarCheckIsLite2);
                Object objK = aofgVar2.j.k(aihlVarCheckIsLite2.d);
                if (!((aphe) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).d) {
                    return false;
                }
                break;
            case 7:
                acca accaVar = (acca) obj;
                if (accaVar.g() || accaVar.e()) {
                    return false;
                }
                break;
            case 8:
                if (((acca) obj).i == -1) {
                    return false;
                }
                break;
            case 9:
                return ((abqh) obj) instanceof abpg;
            case 10:
                return ((acjd) obj) instanceof aciw;
            case 11:
                return ((wgs) obj).I();
            case 12:
                return ((wgs) obj).O();
            case 13:
                return ((wgs) obj).af();
            case 14:
                return ((wgs) obj).I();
            case 15:
                return ((wgs) obj).O();
            case 16:
                if (((acca) obj).g()) {
                    return false;
                }
                break;
            case 17:
                if (((acca) obj).g()) {
                    return false;
                }
                break;
            case 18:
                return aecm.as((ajwo) obj);
            case 19:
                return ((acrk) obj).a;
            default:
                agrf agrfVar = acuu.a;
                return ((abnv) obj).a(abnv.f, abnv.h);
        }
        return true;
    }
}
