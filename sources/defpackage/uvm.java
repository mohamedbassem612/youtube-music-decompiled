package defpackage;

import android.text.TextUtils;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uvm implements Predicate {
    private final /* synthetic */ int $cid;

    public /* synthetic */ uvm(int i) {
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
                return yno.gb((augy) obj, augf.INVALID_SOURCE);
            case 1:
                if (((augy) obj).c != 111) {
                    return false;
                }
                break;
            case 2:
                arft arftVarA = arft.a(((apxf) obj).c);
                if (arftVarA == null) {
                    arftVarA = arft.TOOLBELT_BUTTON_TYPE_UNSPECIFIED;
                }
                if (arftVarA == arft.TOOLBELT_BUTTON_TYPE_UNSPECIFIED) {
                    return false;
                }
                break;
            case 3:
                int iAS = a.aS(((aphw) obj).i);
                if (iAS == 0 || iAS != 2) {
                    return false;
                }
                break;
            case 4:
                throw null;
            case 5:
                int i = ((augy) obj).c;
                if (i != 101 && i != 110) {
                    return false;
                }
                break;
            case 6:
                String str = vjx.a;
                arft arftVarA2 = arft.a(((apxf) obj).c);
                if (arftVarA2 == null) {
                    arftVarA2 = arft.TOOLBELT_BUTTON_TYPE_UNSPECIFIED;
                }
                if (arftVarA2 != arft.TOOLBELT_BUTTON_TYPE_PROMPT_STICKER) {
                    return false;
                }
                break;
            case 7:
                if ((((apxf) obj).b & 2) == 0) {
                    return false;
                }
                break;
            case 8:
                String str2 = vjx.a;
                apji apjiVar = ((apxf) obj).d;
                if (apjiVar == null) {
                    apjiVar = apji.a;
                }
                aihl aihlVarCheckIsLite = aihn.checkIsLite(ajnp.a);
                apjiVar.c(aihlVarCheckIsLite);
                return apjiVar.j.n(aihlVarCheckIsLite.d);
            case 9:
                augy augyVar = (augy) obj;
                if (yno.fe(augyVar)) {
                    auhv auhvVar = augyVar.c == 107 ? (auhv) augyVar.d : auhv.a;
                    auih auihVar = auhvVar.c == 2 ? (auih) auhvVar.d : auih.a;
                    if (((auihVar.c == 10 ? (auhx) auihVar.d : auhx.a).b & 2) == 0) {
                        return false;
                    }
                }
                break;
            case 10:
                if (TextUtils.isEmpty(vmx.h((ajwo) obj))) {
                    return false;
                }
                break;
            case 11:
                return ((vrp) obj).b();
            case 12:
                return afxw.c((apji) obj);
            case 13:
                return afxw.c((apji) obj);
            case 14:
                return afxw.c((apji) obj);
            case 15:
                apji apjiVar2 = (apji) obj;
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aopo.a);
                apjiVar2.c(aihlVarCheckIsLite2);
                return apjiVar2.j.n(aihlVarCheckIsLite2.d);
            case 16:
                wgs wgsVar = (wgs) obj;
                agrf agrfVar = wja.a;
                if (!wgsVar.W() || !wgsVar.b.f.contains("/pudl")) {
                    return false;
                }
                break;
            case 17:
                return ((wgs) obj).I();
            case 18:
                int iAS2 = a.aS(((alyq) obj).e);
                if (iAS2 == 0 || iAS2 != 2) {
                    return false;
                }
                break;
            case 19:
                return wvv.h((ajwo) obj);
            default:
                if (wvv.h((ajwo) obj)) {
                    return false;
                }
                break;
        }
        return true;
    }
}
