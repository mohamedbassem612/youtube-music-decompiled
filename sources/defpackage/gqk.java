package defpackage;

import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gqk implements Predicate {
    private final /* synthetic */ int $cid;

    public /* synthetic */ gqk(int i) {
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
                return ((Optional) obj).isPresent();
            case 1:
                apji apjiVar = (apji) obj;
                agrf agrfVar = gpl.U;
                aihl aihlVarCheckIsLite = aihn.checkIsLite(anrx.b);
                apjiVar.c(aihlVarCheckIsLite);
                return apjiVar.j.n(aihlVarCheckIsLite.d);
            case 2:
                ajwo ajwoVar = (ajwo) obj;
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apte.b);
                ajwoVar.c(aihlVarCheckIsLite2);
                return ajwoVar.j.n(aihlVarCheckIsLite2.d);
            case 3:
                return ((Optional) obj).isPresent();
            case 4:
                zne zneVar = (zne) obj;
                if (awrc.c(zneVar, zmf.a) || awrc.c(zneVar, zmh.a) || awrc.c(zneVar, zmm.a) || awrc.c(zneVar, zlv.a) || awrc.c(zneVar, zma.a) || awrc.c(zneVar, zmb.a) || awrc.c(zneVar, zmw.a)) {
                    return false;
                }
                break;
            case 5:
                return ((Optional) obj).isPresent();
            case 6:
                apji apjiVar2 = (apji) obj;
                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(ajnp.a);
                apjiVar2.c(aihlVarCheckIsLite3);
                return apjiVar2.j.n(aihlVarCheckIsLite3.d);
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                return ((Optional) obj).isPresent();
            case 11:
                return ((aaiz) obj) instanceof hmw;
            case 12:
                return Objects.nonNull((anyx) obj);
            case 13:
                return ((Optional) obj).isPresent();
            case 14:
                return ((Optional) obj).isPresent();
            case 15:
                return ((Optional) obj).isPresent();
            case 16:
                if ((((allo) obj).b & 1) == 0) {
                    return false;
                }
                break;
            case 17:
                if ((((allo) obj).b & 2) == 0) {
                    return false;
                }
                break;
            case 18:
                return ((Optional) obj).isPresent();
            case 19:
                allo alloVar = (allo) obj;
                if ((alloVar.b & 2) == 0) {
                    return false;
                }
                allp allpVar = alloVar.d;
                if (allpVar == null) {
                    allpVar = allp.a;
                }
                if (!afxw.u(allpVar).isPresent()) {
                    return false;
                }
                break;
            default:
                aofh aofhVar = (aofh) obj;
                int iBc = a.bc(aofhVar.c);
                if (iBc == 0 || iBc != 5 || !aofhVar.d.equals(kro.ay("PPSDST"))) {
                    return false;
                }
                aofg aofgVar = aofhVar.e;
                if (aofgVar == null) {
                    aofgVar = aofg.b;
                }
                aihl aihlVarCheckIsLite4 = aihn.checkIsLite(anue.b);
                aofgVar.c(aihlVarCheckIsLite4);
                Object objK = aofgVar.j.k(aihlVarCheckIsLite4.d);
                aogf aogfVarA = aogf.a(((anue) (objK == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK))).j);
                if (aogfVarA == null) {
                    aogfVarA = aogf.OFFLINE_REQUEST_SOURCE_UNKNOWN;
                }
                if (aogfVarA != aogf.OFFLINE_REQUEST_SOURCE_AUTO_OFFLINE) {
                    return false;
                }
                break;
        }
        return true;
    }
}
