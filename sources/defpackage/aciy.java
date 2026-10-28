package defpackage;

import j$.util.Optional;
import j$.util.function.Predicate$CC;
import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class aciy implements Predicate {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ aciy(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
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
            default:
                break;
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, java.util.function.Predicate] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v29, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v30, types: [java.lang.Object, java.util.Set] */
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.$cid) {
            case 0:
                return ((Class) this.a).isInstance((acjd) obj);
            case 1:
                return ((Class) this.a).isInstance((acjd) obj);
            case 2:
                acjd acjdVar = (acjd) obj;
                Optional optional = (Optional) this.a;
                if (!optional.isEmpty() && !a$$ExternalSyntheticApiModelOutline0.m9m(optional.get()).test(acjdVar)) {
                    return false;
                }
                break;
            case 3:
                acjd acjdVar2 = (acjd) obj;
                Optional optional2 = (Optional) this.a;
                if (!optional2.isEmpty() && !optional2.get().test(acjdVar2)) {
                    return false;
                }
                break;
            case 4:
                return this.a.contains(((apfp) obj).U);
            case 5:
                if (((Map.Entry) obj).getValue() != this.a) {
                    return false;
                }
                break;
            case 6:
                if (((Map.Entry) obj).getValue() != this.a) {
                    return false;
                }
                break;
            case 7:
                if (((Map.Entry) obj).getValue() == this.a) {
                    return false;
                }
                break;
            case 8:
                if (((Map.Entry) obj).getValue() == this.a) {
                    return false;
                }
                break;
            case 9:
                return ((abwf) this.a).m((abun) obj, null);
            case 10:
                if (((agke) this.a).contains((String) obj)) {
                    return false;
                }
                break;
            case 11:
                if (((agke) this.a).contains((String) obj)) {
                    return false;
                }
                break;
            case 12:
                atxp atxpVar = adxz.a;
                return ((String) this.a).equals(((advj) obj).q());
            case 13:
                agrf agrfVar = aegn.a;
                return aeho.f((String) obj, this.a);
            default:
                agrf agrfVar2 = aegn.a;
                return aeho.f((String) obj, this.a);
        }
        return true;
    }
}
