package defpackage;

import android.util.Pair;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hud implements Predicate {
    private final /* synthetic */ int $cid;

    public /* synthetic */ hud(int i) {
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

    /* JADX WARN: Type inference failed for: r5v35, types: [java.lang.Object, weh] */
    /* JADX WARN: Type inference failed for: r5v41, types: [java.lang.Object, weh] */
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int iBc;
        int iBc2;
        ajwo ajwoVar;
        switch (this.$cid) {
            case 0:
                aofh aofhVar = (aofh) obj;
                if (aofhVar.d.equals(kro.ay("PPSE")) && (iBc = a.bc(aofhVar.c)) != 0 && iBc == 5) {
                    aofg aofgVar = aofhVar.e;
                    if (aofgVar == null) {
                        aofgVar = aofg.b;
                    }
                    aihl aihlVarCheckIsLite = aihn.checkIsLite(anue.b);
                    aofgVar.c(aihlVarCheckIsLite);
                    Object objK = aofgVar.j.k(aihlVarCheckIsLite.d);
                    if (((anue) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).d == 6) {
                        return true;
                    }
                }
                break;
            case 1:
                return ((hcg) obj).a.isPresent();
            case 2:
                aofh aofhVar2 = (aofh) obj;
                if (aofhVar2.d.equals(kro.ay("PPSV")) && (iBc2 = a.bc(aofhVar2.c)) != 0 && iBc2 == 5) {
                    aofg aofgVar2 = aofhVar2.e;
                    if (aofgVar2 == null) {
                        aofgVar2 = aofg.b;
                    }
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(anue.b);
                    aofgVar2.c(aihlVarCheckIsLite2);
                    Object objK2 = aofgVar2.j.k(aihlVarCheckIsLite2.d);
                    if (((anue) (objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2))).d == 6) {
                        return true;
                    }
                }
                break;
            case 3:
                agrf agrfVar = hur.a;
                return ((hcg) obj).a.isPresent();
            case 4:
                return ((Optional) obj).isPresent();
            case 5:
                hcg hcgVar = (hcg) obj;
                agrf agrfVar2 = hur.a;
                Optional optional = hcgVar.a;
                if (optional.isPresent() && (hpb.s(optional.get()) || hcgVar.f.equals("SE"))) {
                    return true;
                }
                break;
            case 6:
                hcg hcgVar2 = (hcg) obj;
                agrf agrfVar3 = hur.a;
                Optional optional2 = hcgVar2.a;
                if (optional2.isEmpty()) {
                    return true;
                }
                if (!hpb.s(optional2.get()) && !hcgVar2.f.equals("SE")) {
                    return true;
                }
                break;
            case 7:
                agrf agrfVar4 = hwm.a;
                if (!((String) obj).isEmpty()) {
                    return true;
                }
                break;
            case 8:
                return jnm.j((hyz) obj);
            case 9:
                if (((ajtb) obj).b == 91394224) {
                    return true;
                }
                break;
            case 10:
                return Objects.isNull((hyz) obj);
            case 11:
                return Objects.nonNull((hyz) obj);
            case 12:
                return ((Optional) obj).isPresent();
            case 13:
                hyz hyzVar = (hyz) obj;
                if (gzj.X(hyzVar.n())) {
                    return true;
                }
                abnl abnlVarN = hyzVar.n();
                if (abnlVarN != null && (ajwoVar = abnlVarN.b) != null) {
                    aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aohu.a);
                    ajwoVar.c(aihlVarCheckIsLite3);
                    if (ajwoVar.j.n(aihlVarCheckIsLite3.d)) {
                        return true;
                    }
                }
                break;
            case 14:
                return hna.aj((aftj) obj);
            case 15:
                return Objects.nonNull((iik) obj);
            case 16:
                return Objects.nonNull((iik) obj);
            case 17:
                return Objects.nonNull((anyx) obj);
            case 18:
                return Objects.nonNull((ankr) obj);
            case 19:
                return Objects.nonNull((anjx) obj);
            default:
                return Objects.isNull((Pair) obj);
        }
        return false;
    }
}
