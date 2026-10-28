package defpackage;

import j$.util.Collection;
import j$.util.Objects;
import j$.util.function.Predicate$CC;
import java.util.HashSet;
import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class aajl implements Predicate {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ aajl(Object obj, int i) {
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

    /* JADX WARN: Type inference failed for: r4v36, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v46, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, java.util.List] */
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.$cid) {
            case 0:
                return ((Class) this.a).isInstance((aaiz) obj);
            case 1:
                if (!((agkj) this.a).containsKey((String) obj)) {
                    return true;
                }
                break;
            case 2:
                if (!this.a.contains(aaka.b(((aamo) obj).d()))) {
                    return true;
                }
                break;
            case 3:
                if (!this.a.contains(aaka.a(((aamh) obj).a))) {
                    return true;
                }
                break;
            case 4:
                return ((String) ((Map.Entry) obj).getKey()).startsWith((String) this.a);
            case 5:
                return ((HashSet) this.a).add(((aamj) obj).a.a);
            case 6:
                return ((HashSet) this.a).add(((aamt) obj).b());
            case 7:
                return ((HashSet) this.a).add(((aoei) ((aihf) obj).instance).c);
            case 8:
                return ((HashSet) this.a).add(((aoeg) ((aihf) obj).instance).c);
            case 9:
                aamb aambVar = ((aaro) obj).e;
                String strE = aarq.e(aambVar);
                int iB = aambVar.b("transfer_type", 0);
                if (!((agkz) this.a).contains(strE) && aarq.k(iB)) {
                    return true;
                }
                break;
            case 10:
                return ((aofh) obj).d.equals(this.a);
            case 11:
                return ((ajhl) obj).d.equals(((wgs) this.a).v());
            case 12:
                return agkz.n(((asgy) obj).f).equals(this.a);
            case 13:
                acca accaVar = (acca) obj;
                int i = abaa.a;
                ajoj ajojVar = ((asgd) this.a).c;
                if (ajojVar == null) {
                    ajojVar = ajoj.a;
                }
                if (typ.b(accaVar.p).toString().equals(ajojVar.c) && typ.c(accaVar.k).equals(ajojVar.d) && typ.c(accaVar.a).equals(ajojVar.e)) {
                    return true;
                }
                break;
            case 14:
                return Collection.EL.stream(this.a).anyMatch(new aajl((wgo) obj, 15));
            case 15:
                return ((akcs) obj).b.equals(((wgo) this.a).a);
            case 16:
                return ((agkz) this.a).contains(((aret) obj).b());
            case 17:
                return Objects.equals(((abmk) obj).a, this.a);
            case 18:
                return ((abwf) this.a).m((abun) obj, null);
            case 19:
                return this.a.contains(((Map.Entry) obj).getKey());
            default:
                acfd acfdVar = acfg.a;
                if (!((agke) this.a).contains((String) obj)) {
                    return true;
                }
                break;
        }
        return false;
    }
}
