package defpackage;

import android.util.Pair;
import j$.util.Objects;
import j$.util.function.Predicate$CC;
import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xdn implements Predicate {
    private final /* synthetic */ int $cid;

    public /* synthetic */ xdn(int i) {
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
                return ((zs) obj).r();
            case 1:
                return ((zs) ((Map.Entry) obj).getValue()).r();
            case 2:
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getValue() != amec.INTERACTION_LOGGING_VISIBILITY_EVENT_TYPE_LOG_WHEN_SHOWN && entry.getValue() != amec.INTERACTION_LOGGING_VISIBILITY_EVENT_TYPE_LOG_WHEN_FIRST_SHOWN) {
                    return false;
                }
                break;
            case 3:
                Map.Entry entry2 = (Map.Entry) obj;
                if (((xho) entry2.getValue()).e != amec.INTERACTION_LOGGING_VISIBILITY_EVENT_TYPE_LOG_WHEN_SHOWN && ((xho) entry2.getValue()).e != amec.INTERACTION_LOGGING_VISIBILITY_EVENT_TYPE_LOG_WHEN_FIRST_SHOWN) {
                    return false;
                }
                break;
            case 4:
                akwf akwfVar = ((aloy) obj).b;
                if (akwfVar == null) {
                    akwfVar = akwf.a;
                }
                if (akwfVar.d) {
                    return false;
                }
                break;
            case 5:
                return ((tfq) obj).j(1);
            case 6:
                return ((tfq) obj).j(0);
            case 7:
                return ((tfq) obj).j(9);
            case 8:
                agkj agkjVar = xom.a;
                if (((tfq) obj).l() != 118) {
                    return false;
                }
                break;
            case 9:
                return xrx.j(((xvq) obj).a);
            case 10:
                return Objects.nonNull((Pair) obj);
            case 11:
                return ((xvq) obj).m();
            case 12:
                if (((xvr) obj) instanceof xvp) {
                    return false;
                }
                break;
            case 13:
                return ((wgs) obj).af();
            case 14:
                wgs wgsVar = (wgs) obj;
                if (!wgsVar.af() || !wgsVar.ab()) {
                    return false;
                }
                break;
            case 15:
                return ((wgs) obj).I();
            case 16:
                wgs wgsVar2 = (wgs) obj;
                if (!wgsVar2.I() || !wgsVar2.ab()) {
                    return false;
                }
                break;
            case 17:
                if (((wgs) obj).b() <= 2) {
                    return false;
                }
                break;
            case 18:
                if (((Integer) obj).intValue() == 0) {
                    return false;
                }
                break;
            case 19:
                return Objects.nonNull((wgs) obj);
            default:
                agkz agkzVar = yos.a;
                return wir.b().contains((Integer) obj);
        }
        return true;
    }
}
