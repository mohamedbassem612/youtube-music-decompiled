package defpackage;

import android.net.Uri;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hod implements Predicate {
    private final /* synthetic */ int $cid;

    public /* synthetic */ hod(int i) {
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
                hcg hcgVar = (hcg) obj;
                int i = hoe.d;
                Optional optional = hcgVar.a;
                if (optional.isPresent() && hcgVar.b.isPresent() && ((optional.get() instanceof anjx) || (optional.get() instanceof anuk))) {
                    return true;
                }
                break;
            case 1:
                aofh aofhVar = (aofh) obj;
                int iBc = a.bc(aofhVar.c);
                if (iBc == 0 || iBc != 5) {
                    aofg aofgVar = aofhVar.e;
                    if (aofgVar == null) {
                        aofgVar = aofg.b;
                    }
                    aihl aihlVarCheckIsLite = aihn.checkIsLite(anue.b);
                    aofgVar.c(aihlVarCheckIsLite);
                    Object objK = aofgVar.j.k(aihlVarCheckIsLite.d);
                    aogf aogfVarA = aogf.a(((anue) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).j);
                    if (aogfVarA == null) {
                        aogfVarA = aogf.OFFLINE_REQUEST_SOURCE_UNKNOWN;
                    }
                    if (aogfVarA == aogf.OFFLINE_REQUEST_SOURCE_AUTO_OFFLINE) {
                        return true;
                    }
                }
                break;
            case 2:
                return ((Optional) obj).isPresent();
            case 3:
                Optional optional2 = (Optional) obj;
                aigj aigjVar = hpb.a;
                if (!optional2.isEmpty()) {
                    aoop aoopVar = (aoop) optional2.get();
                    if (aoopVar.i() && !hpb.a.equals(aoopVar.getPlayerResponseBytes())) {
                        return true;
                    }
                }
                break;
            case 4:
                return ((Optional) obj).isPresent();
            case 5:
                if (((anyx) obj).getMusicVideoType() == anzw.MUSIC_VIDEO_TYPE_PODCAST_EPISODE) {
                    return true;
                }
                break;
            case 6:
                return ((hth) obj).a().isPresent();
            case 7:
                return ((Optional) obj).isPresent();
            case 8:
                Optional optional3 = (Optional) obj;
                if (optional3.isPresent() && ((aqph) optional3.get()).getTransferState() != aqpc.TRANSFER_STATE_UNKNOWN) {
                    return true;
                }
                break;
            case 9:
                Uri uriA = ((wgg) obj).a();
                if (uriA != null && tyu.f(uriA)) {
                    return true;
                }
                break;
            case 10:
                return hlz.m((aamh) obj);
            case 11:
                return Objects.nonNull((aamt) obj);
            case 12:
                return hlz.m((aamh) obj);
            case 13:
                int iBc2 = a.bc(((aofh) obj).c);
                if (iBc2 != 0 && iBc2 == 4) {
                    return true;
                }
                break;
            case 14:
                aofh aofhVar2 = (aofh) obj;
                int iBc3 = a.bc(aofhVar2.c);
                if (iBc3 != 0 && iBc3 == 2 && hsj.i(aofhVar2)) {
                    return true;
                }
                break;
            case 15:
                if ((((allo) obj).b & 2) != 0) {
                    return true;
                }
                break;
            case 16:
                allo alloVar = (allo) obj;
                agrf agrfVar = hsn.a;
                if ((alloVar.b & 2) != 0) {
                    allp allpVar = alloVar.d;
                    if (allpVar == null) {
                        allpVar = allp.a;
                    }
                    if (afxw.u(allpVar).isPresent()) {
                        return true;
                    }
                }
                break;
            case 17:
                if ((((allo) obj).b & 1) != 0) {
                    return true;
                }
                break;
            case 18:
                return ((Optional) obj).isPresent();
            case 19:
                return Objects.nonNull((anyx) obj);
            default:
                return ((Optional) obj).isPresent();
        }
        return false;
    }
}
