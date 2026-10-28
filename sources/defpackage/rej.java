package defpackage;

import com.google.research.xeno.effect.Effect;
import j$.time.Duration;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import java.util.HashSet;
import java.util.function.Predicate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class rej implements Predicate {
    private final /* synthetic */ int $cid;

    public /* synthetic */ rej(int i) {
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
                qxj qxjVar = (qxj) obj;
                Duration duration = rek.a;
                if (qxjVar.c() || !(qxjVar instanceof qxi) || !qxjVar.d) {
                    return false;
                }
                break;
            case 1:
                qvu qvuVar = (qvu) obj;
                Duration duration2 = rek.a;
                if (!(qvuVar instanceof qvs) || !qvuVar.o) {
                    return false;
                }
                break;
            case 2:
                return ((qvc) obj).f;
            case 3:
                rbm rbmVar = rgw.j;
                Effect effect = ((qvk) obj).a;
                break;
            case 4:
                attk attkVar = rht.c;
                break;
            case 5:
                if (((HashSet) ((ijt) obj).a).isEmpty()) {
                    return false;
                }
                break;
            case 6:
                int i = rjo.a;
                return ((qvu) obj) instanceof qvq;
            case 7:
                return ((wnq) obj).k();
            case 8:
                return rmp.c((zwa) obj).equals("youtube-delegated");
            case 9:
                return Objects.nonNull((zwa) obj);
            case 10:
                return rmp.c((zwa) obj).equals("youtube-incognito");
            case 11:
                return rmp.c((zwa) obj).equals("youtube-direct");
            case 12:
                return ((Optional) obj).isPresent();
            case 13:
                snk snkVar = (snk) obj;
                if (snkVar.a() != aixr.TRIGGER_TYPE_ACTIVE_VIEW_AUDIO_AUDIBLE_CRITERIA_SATISFIED && snkVar.a() != aixr.TRIGGER_TYPE_ACTIVE_VIEW_AUDIO_MEASURABLE_CRITERIA_SATISFIED && snkVar.a() != aixr.TRIGGER_TYPE_ACTIVE_VIEW_GROUPM_VIEWABLE_CRITERIA_SATISFIED && snkVar.a() != aixr.TRIGGER_TYPE_ACTIVE_VIEW_MEASURABLE_CRITERIA_SATISFIED && snkVar.a() != aixr.TRIGGER_TYPE_ACTIVE_VIEW_VIEWABLE_CRITERIA_SATISFIED) {
                    return false;
                }
                break;
            case 14:
                return sdc.b((aivt) obj);
            case 15:
                return ((akxv) obj).b.matches("player_overlay_product_in_video");
            case 16:
                apji apjiVar = (apji) obj;
                aihl aihlVarCheckIsLite = aihn.checkIsLite(aori.a);
                apjiVar.c(aihlVarCheckIsLite);
                return apjiVar.j.n(aihlVarCheckIsLite.d);
            case 17:
                apji apjiVar2 = (apji) obj;
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(akxw.a);
                apjiVar2.c(aihlVarCheckIsLite2);
                return apjiVar2.j.n(aihlVarCheckIsLite2.d);
            case 18:
                aizs aizsVar = ((aivt) obj).f;
                if (aizsVar == null) {
                    aizsVar = aizs.a;
                }
                if (aizsVar.b != 34) {
                    return false;
                }
                break;
            case 19:
                aivs aivsVar = ((aivt) obj).c;
                if (aivsVar == null) {
                    aivsVar = aivs.a;
                }
                aixo aixoVarA = aixo.a(aivsVar.d);
                if (aixoVarA == null) {
                    aixoVarA = aixo.SLOT_TYPE_UNSPECIFIED;
                }
                if (aixoVarA != aixo.SLOT_TYPE_PLAYER_BYTES) {
                    return false;
                }
                break;
            default:
                if (sdc.b((aivt) obj)) {
                    return false;
                }
                break;
        }
        return true;
    }
}
