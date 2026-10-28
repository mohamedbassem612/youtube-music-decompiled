package defpackage;

import com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit;
import j$.time.Duration;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.function.Predicate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jor implements Predicate {
    private final /* synthetic */ int $cid;

    public /* synthetic */ jor(int i) {
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
                agsn agsnVar = joz.a;
                anpv anpvVar = ((ajkc) obj).d;
                if (anpvVar == null) {
                    anpvVar = anpv.b;
                }
                return new aihx(anpvVar.f, anpv.a).contains(anpu.MUSIC_INLINE_BADGE_DISPLAY_MODE_PLAYER);
            case 1:
                agsn agsnVar2 = joz.a;
                aqof aqofVar = ((alvq) obj).e;
                if (aqofVar == null) {
                    aqofVar = aqof.a;
                }
                return aqofVar.l.equals("player-page-assistive-cast-btn");
            case 2:
                return Objects.nonNull((CharSequence) obj);
            case 3:
                if (((PaintUnit) obj).r() == null) {
                    return false;
                }
                break;
            case 4:
                break;
            case 5:
                int i = quc.c;
                return ((qvu) obj) instanceof qvs;
            case 6:
                int i2 = quc.c;
                return ((qvu) obj) instanceof qvs;
            case 7:
                rbm rbmVar = qxm.z;
                return ((qvu) obj) instanceof qvq;
            case 8:
                return ((qvu) obj).o;
            case 9:
                int i3 = qzf.f;
                return ((Optional) ((Map.Entry) obj).getValue()).isPresent();
            case 10:
                ijt ijtVar = (ijt) obj;
                if (!ijtVar.e(rjd.d) && !ijtVar.e(rjd.b) && !ijtVar.e(rjd.a)) {
                    return false;
                }
                break;
            case 11:
                return ((ijt) obj).e(rjd.c);
            case 12:
                return ((qvc) obj) instanceof qvk;
            case 13:
                qvk qvkVar = (qvk) obj;
                int i4 = qzj.b;
                if (!(qvkVar instanceof qyw) && !(qvkVar instanceof qzh)) {
                    return false;
                }
                break;
            case 14:
                return ((qvu) obj) instanceof qvs;
            case 15:
                return ((qvu) obj) instanceof qvs;
            case 16:
                return ((qvu) obj) instanceof qwm;
            case 17:
                return ((qvu) obj) instanceof qwm;
            case 18:
                return ((qvu) obj) instanceof rcj;
            case 19:
                int i5 = rdl.c;
                if (((ConcurrentLinkedDeque) obj).isEmpty()) {
                    return false;
                }
                break;
            default:
                Duration duration = rdr.a;
                return ((qvu) obj) instanceof qvs;
        }
        return true;
    }
}
