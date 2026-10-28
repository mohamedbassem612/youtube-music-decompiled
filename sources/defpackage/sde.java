package defpackage;

import j$.util.Objects;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sde implements Predicate {
    private final /* synthetic */ int $cid;

    public /* synthetic */ sde(int i) {
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
        int iBi;
        int iAS;
        int iAV;
        switch (this.$cid) {
            case 0:
                return afxw.c((apji) obj);
            case 1:
                if ((((aisv) obj).b & 2) != 0) {
                    return false;
                }
                break;
            case 2:
                apji apjiVar = (apji) obj;
                aihl aihlVarCheckIsLite = aihn.checkIsLite(aopo.a);
                apjiVar.c(aihlVarCheckIsLite);
                return apjiVar.j.n(aihlVarCheckIsLite.d);
            case 3:
                aivs aivsVar = ((aivt) obj).c;
                if (aivsVar == null) {
                    aivsVar = aivs.a;
                }
                int iBf = a.bf(aivsVar.g);
                if (iBf == 0 || iBf != 3) {
                    return false;
                }
                break;
            case 4:
                aisu aisuVar = (aisu) obj;
                if (aisuVar != null && (iBi = a.bi(aisuVar.f)) != 0 && iBi == 8) {
                    return false;
                }
                break;
            case 5:
                return afxw.c((apji) obj);
            case 6:
                int i = sdi.a;
                return ((smr) obj).e(sjg.class);
            case 7:
                return ((aivk) obj).c.contains("label=video_skip_shown");
            case 8:
                if ((((arcg) obj).b & 1) == 0) {
                    return false;
                }
                break;
            case 9:
                aivk aivkVar = (aivk) obj;
                if ((aivkVar.b & 32) == 0 || aivkVar.i == 0) {
                    return false;
                }
                break;
            case 10:
                aivk aivkVar2 = (aivk) obj;
                if ((aivkVar2.b & 32) == 0 || aivkVar2.i == 0) {
                    return false;
                }
                break;
            case 11:
                akgz akgzVar = (akgz) obj;
                if (!akgzVar.c || (iAS = a.aS(akgzVar.d)) == 0 || iAS != 3) {
                    return false;
                }
                break;
            case 12:
                qvu qvuVar = (qvu) obj;
                agrf agrfVar = uld.a;
                if (!(qvuVar instanceof qvs) || (qvuVar instanceof qwm)) {
                    return false;
                }
                break;
            case 13:
                return ((auak) obj).g;
            case 14:
                if (((augy) obj).c != 109) {
                    return false;
                }
                break;
            case 15:
                agrf agrfVar2 = uql.a;
                if (yno.gb((augy) obj, augf.NOT_SHOW_IN_TIMELINE)) {
                    return false;
                }
                break;
            case 16:
                return Objects.nonNull((auip) obj);
            case 17:
                if ((((aufw) obj).b & 2) == 0) {
                    return false;
                }
                break;
            case 18:
                augi augiVar = (augi) obj;
                agrf agrfVar3 = usj.a;
                if ((augiVar.b & 64) == 0 || (iAV = a.aV(augiVar.i)) == 0 || iAV != 3) {
                    return false;
                }
                break;
            case 19:
                agrf agrfVar4 = usj.a;
                int i2 = ((augy) obj).c;
                if (i2 != 101 && i2 != 102 && i2 != 103 && i2 != 104 && i2 != 105 && i2 != 106 && i2 != 107) {
                    return false;
                }
                break;
            default:
                return yno.gb((augy) obj, augf.INVALID_SOURCE_UNSUPPORTED);
        }
        return true;
    }
}
