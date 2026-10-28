package defpackage;

import android.util.Pair;
import app.rive.semantics.SemanticState;
import j$.util.Objects;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class iui implements Predicate {
    private final /* synthetic */ int $cid;

    public /* synthetic */ iui(int i) {
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
                return Objects.isNull((Pair) obj);
            case 1:
                return Objects.nonNull((ankr) obj);
            case 2:
                return Objects.nonNull((anyx) obj);
            case 3:
                return Objects.nonNull((anjx) obj);
            case 4:
                if (((aqge) obj) != aqge.SURVEY_DISPLAY_TRIGGER_UI_EVENT_UNSPECIFIED) {
                    return true;
                }
                break;
            case 5:
                return ((hcg) obj).a.isPresent();
            case 6:
                return ((ajsy) obj).k;
            case 7:
                return obj instanceof anwj;
            case 8:
                return ((advc) obj) instanceof iyn;
            case 9:
                return ((ajsy) obj).k;
            case 10:
                return obj instanceof ajsy;
            case 11:
                apji apjiVar = (apji) obj;
                aihl aihlVarCheckIsLite = aihn.checkIsLite(anzo.a);
                apjiVar.c(aihlVarCheckIsLite);
                if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(anzo.a);
                    apjiVar.c(aihlVarCheckIsLite2);
                    Object objK = apjiVar.j.k(aihlVarCheckIsLite2.d);
                    int iAS = a.aS(((anzn) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).d);
                    if (iAS != 0 && iAS == 3) {
                        return true;
                    }
                }
                break;
            case 12:
                apji apjiVar2 = (apji) obj;
                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(anrx.b);
                apjiVar2.c(aihlVarCheckIsLite3);
                return apjiVar2.j.n(aihlVarCheckIsLite3.d);
            case 13:
                if (!((adhg) obj).a) {
                    return true;
                }
                break;
            case 14:
                return afxw.q(obj);
            case 15:
                return afxw.q(obj);
            case 16:
                return afxw.q(obj);
            case 17:
                return ((jkk) obj).c;
            case 18:
                return ((jla) obj).b;
            case 19:
                if ((((alba) obj).b & SemanticState.Modal) != 0) {
                    return true;
                }
                break;
            default:
                if ((((alvq) obj).b & 4) != 0) {
                    return true;
                }
                break;
        }
        return false;
    }
}
