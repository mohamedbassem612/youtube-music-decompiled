package defpackage;

import android.text.TextUtils;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jmy implements Predicate {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ jmy(int i) {
        this.$cid = i;
        this.a = "audio";
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

    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v46, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v49, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v50, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        Instant instantAx;
        switch (this.$cid) {
            case 0:
                String strA = xrx.a((dii) obj);
                amyl amylVar = ((ajsy) ((jnc) this.a).m.get()).o;
                if (amylVar == null) {
                    amylVar = amyl.a;
                }
                return strA.equals(amylVar.f);
            case 1:
                return this.a.contains((String) obj);
            case 2:
                agsn agsnVar = joz.a;
                return ((dii) obj).d.equals(this.a);
            case 3:
                return ((String) this.a).contains((String) obj);
            case 4:
                return ((String) this.a).contentEquals((CharSequence) obj);
            case 5:
                return ((String) this.a).contentEquals((CharSequence) obj);
            case 6:
                axia axiaVar = (axia) obj;
                int i = axiaVar.b;
                if (i == 1) {
                    aijp aijpVar = ((axha) axiaVar.c).b;
                    if (aijpVar == null) {
                        aijpVar = aijp.a;
                    }
                    instantAx = ahng.ax(aijpVar);
                } else {
                    aijp aijpVar2 = (i == 3 ? (axie) axiaVar.c : axie.a).c;
                    if (aijpVar2 == null) {
                        aijpVar2 = aijp.a;
                    }
                    instantAx = ahng.ax(aijpVar2);
                }
                return instantAx.isAfter((Instant) this.a);
            case 7:
                return ((qwz) obj).a.startsWith(((String) this.a).concat("/"));
            case 8:
                qwm qwmVar = (qwm) obj;
                if (((agkz) this.a).contains(qwmVar.m) || !a.y(qwmVar.iu())) {
                    return false;
                }
                break;
            case 9:
                return ((qvu) obj).m.equals(((quh) this.a).a);
            case 10:
                qup qupVar = (qup) obj;
                rbm rbmVar = rco.g;
                Duration duration = qupVar.c;
                Duration duration2 = (Duration) this.a;
                if (duration2.compareTo(duration) < 0 || duration2.compareTo(qupVar.b()) >= 0) {
                    return false;
                }
                break;
            case 11:
                Duration duration3 = rdr.a;
                return ((qvu) obj).m.equals(((rfp) this.a).a);
            case 12:
                return Objects.equals((rfr) obj, ((rgm) this.a).b.c);
            case 13:
                return ((agkj) this.a).containsKey((qvc) obj);
            case 14:
                return ((String) this.a).equals(((rlt) obj).b);
            case 15:
                return ((afhq) obj).c.equals(this.a);
            case 16:
                if (Collection.EL.stream(this.a).anyMatch(new jmy(((afhq) obj).c, 15))) {
                    return false;
                }
                break;
            case 17:
                return TextUtils.equals(((slb) obj).o, this.a);
            case 18:
                return TextUtils.equals(((slb) obj).o, this.a);
            case 19:
                aivu aivuVar = ((aivt) obj).e;
                if (aivuVar == null) {
                    aivuVar = aivu.a;
                }
                apji apjiVar = aivuVar.b;
                if (apjiVar == null) {
                    apjiVar = apji.a;
                }
                return nrj.k((aopn) aavv.s(apjiVar, aopo.a), (vyo) this.a);
            default:
                return ((Class) obj).isInstance(this.a);
        }
        return true;
    }

    public /* synthetic */ jmy(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
