package defpackage;

import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class acwb implements Predicate {
    private final /* synthetic */ int $cid;

    public /* synthetic */ acwb(int i) {
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
            default:
                break;
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.$cid) {
            case 0:
                return afxw.c((apji) obj);
            case 1:
                agrf agrfVar = acuu.a;
                break;
            case 2:
                apji apjiVar = (apji) obj;
                aihl aihlVarCheckIsLite = aihn.checkIsLite(alaf.a);
                apjiVar.c(aihlVarCheckIsLite);
                return apjiVar.j.n(aihlVarCheckIsLite.d);
            case 3:
                if (((acjx) obj).a() != acjw.d) {
                    return false;
                }
                break;
            case 4:
                return ((Optional) obj).isPresent();
            case 5:
                atxp atxpVar = adxz.a;
                return ((advc) obj) instanceof advj;
            case 6:
                if (((apsr) obj).b != 4) {
                    return false;
                }
                break;
            case 7:
                return Objects.nonNull(obj);
            default:
                Map.Entry entry = (Map.Entry) obj;
                entry.getKey();
                return ((Optional) entry.getValue()).isPresent();
        }
        return true;
    }
}
