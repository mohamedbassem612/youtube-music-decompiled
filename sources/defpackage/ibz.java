package defpackage;

import android.view.View;
import j$.util.DesugarArrays;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ibz implements Predicate {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ ibz(Object obj, int i) {
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

    /* JADX WARN: Type inference failed for: r3v45, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v51, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v55, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, java.util.List] */
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.$cid) {
            case 0:
                hyz hyzVar = (hyz) obj;
                icj icjVar = (icj) this.a;
                if (icjVar.D(0, hyzVar) || icjVar.D(1, hyzVar)) {
                    return false;
                }
                break;
            case 1:
                if (((agkz) this.a).contains(((aret) obj).b())) {
                    return false;
                }
                break;
            case 2:
                return this.a.contains((String) obj);
            case 3:
                agkj agkjVar = irf.a;
                return ((String) obj).equals(this.a);
            case 4:
                return ((agjw) this.a).contains((Long) obj);
            case 5:
                if (((agkz) this.a).contains((Long) obj)) {
                    return false;
                }
                break;
            case 6:
                return ((agke) this.a).contains(Long.valueOf(((iuz) obj).c));
            case 7:
                if (((agkz) this.a).contains((Long) obj)) {
                    return false;
                }
                break;
            case 8:
                return ((agke) this.a).contains(Long.valueOf(((iuz) obj).c));
            case 9:
                return ((agjw) this.a).contains((Long) obj);
            case 10:
                if (this.a != ((View) obj)) {
                    return false;
                }
                break;
            case 11:
                return DesugarArrays.stream((Object[]) this.a).noneMatch(new ibz((View) obj, 10));
            case 12:
                return isi.r((String) this.a, (apji) obj);
            case 13:
                return isi.r((String) this.a, (apji) obj);
            case 14:
                anop anopVar = (anop) ((jfb) this.a).e.a(((anrv) obj).f);
                if (anopVar == null || !anopVar.getSelected().booleanValue()) {
                    return false;
                }
                break;
            case 15:
                return ((anrv) obj).f.equals(((weo) this.a).a);
            case 16:
                if (((jjp) this.a).f.V((jjv) obj)) {
                    return false;
                }
                break;
            case 17:
                aqjv aqjvVar = ((jjv) obj).a;
                if ((aqjvVar.b & 1) != 0 && !this.a.add(aqjvVar.c)) {
                    return false;
                }
                break;
            case 18:
                return ((ahgb) this.a).V((jjv) obj);
            case 19:
                if (((ahgb) this.a).e.contains((String) obj)) {
                    return false;
                }
                break;
            default:
                if (((ahgb) this.a).c.contains((String) obj)) {
                    return false;
                }
                break;
        }
        return true;
    }
}
