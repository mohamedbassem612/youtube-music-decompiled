package defpackage;

import android.graphics.Bitmap;
import androidx.preference.Preference;
import com.google.android.apps.youtube.music.ui.preference.SliderPreference;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class iii implements agek {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ iii(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.agek
    public final Object apply(Object obj) {
        Object ijtVar = null;
        switch (this.$cid) {
            case 0:
                return new iht((Bitmap) obj, (anzs) this.a);
            case 1:
                Bitmap bitmap = (Bitmap) obj;
                taq.c();
                Optional optionalB = ((ihk) this.a).a.b(bitmap);
                return new ihj(bitmap, optionalB.isPresent() ? atqo.x((ahwp) optionalB.get()) : iwm.a);
            case 2:
                afyh afyhVar = (afyh) obj;
                Object obj2 = this.a;
                synchronized (obj2) {
                    if (((ikn) obj2).j) {
                        afyhVar.close();
                    } else {
                        ((ikn) obj2).i = afyhVar;
                        ijtVar = new ijt(avlr.F(new huo(afyhVar, 4)));
                    }
                }
                return ijtVar;
            case 3:
                Optional optional = (Optional) obj;
                if (optional.isPresent()) {
                    apcq apcqVar = (apcq) optional.get();
                    if ((apcqVar.c.b & 2) != 0) {
                        if (((ahbw) ((ilp) this.a).i.io()).a().isBefore(Instant.ofEpochSecond(apcqVar.getSnoozeExpirationTimestampSeconds().longValue()))) {
                            return ilo.b;
                        }
                    }
                }
                return ilo.a;
            case 4:
                return ((iln) aguu.aw(((ilp) this.a).b, iln.class, (affd) obj)).E();
            case 5:
                anjx anjxVar = (anjx) obj;
                Object obj3 = this.a;
                if (anjxVar == null) {
                    return (amto) ((aihf) obj3).build();
                }
                alay alayVarC = ackj.c(anjxVar.getTitle());
                aihf aihfVar = (aihf) obj3;
                aihfVar.copyOnWrite();
                amto amtoVar = (amto) aihfVar.instance;
                amto amtoVar2 = amto.a;
                alayVarC.getClass();
                amtoVar.g = alayVarC;
                amtoVar.b |= 32;
                return (amto) aihfVar.build();
            case 6:
                Integer num = (Integer) obj;
                int iIntValue = num.intValue();
                Object obj4 = this.a;
                SliderPreference sliderPreference = (SliderPreference) obj4;
                sliderPreference.l(iIntValue);
                sliderPreference.e = num;
                ((Preference) obj4).y = num;
                return obj4;
            case 7:
                return ((ipj) aguu.aw(((ipk) this.a).b.getContext(), ipj.class, (affd) obj)).f();
            case 8:
                return ((ipq) aguu.aw(((ipr) this.a).a.getContext(), ipq.class, (affd) obj)).e();
            case 9:
                ailp ailpVar = (ailp) obj;
                Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(ailpVar.b);
                Object obj5 = this.a;
                if (!mapUnmodifiableMap.containsKey(obj5)) {
                    return ailn.EMPTY;
                }
                int i = ((ailo) DesugarCollections.unmodifiableMap(ailpVar.b).get(obj5)).d;
                if (i == 0) {
                    ijtVar = ailn.UNKNOWN_STATE;
                } else if (i == 1) {
                    ijtVar = ailn.EMPTY;
                } else if (i == 2) {
                    ijtVar = ailn.GRANTED;
                } else if (i == 3) {
                    ijtVar = ailn.DENIED;
                }
                return ijtVar == null ? ailn.UNRECOGNIZED : ijtVar;
            case 10:
                aimb aimbVar = (aimb) obj;
                if ((aimbVar.b & 1) != 0) {
                    return Boolean.valueOf(aimbVar.c);
                }
                xsc xscVar = (xsc) this.a;
                boolean z = ((jkp) xscVar.c).getBoolean(gzj.DONT_PLAY_VIDEO_SETTING, false);
                xscVar.ay(z);
                return Boolean.valueOf(z);
            case 11:
                return ((iqo) aguu.aw(((iqp) this.a).b, iqo.class, (affd) obj)).N();
            case 12:
                return ((iqu) aguu.aw(((iqv) this.a).b, iqu.class, (affd) obj)).h();
            case 13:
                return ((iqz) aguu.aw(((ira) this.a).b, iqz.class, (affd) obj)).f();
            case 14:
                return ((ird) aguu.aw(((ire) this.a).b, ird.class, (affd) obj)).N();
            case 15:
                int i2 = ((aimq) obj).e;
                ((klc) this.a).a = i2;
                return Integer.valueOf(i2);
            case 16:
                aihf builder = ((aimq) obj).toBuilder();
                builder.copyOnWrite();
                aimq aimqVar = (aimq) builder.instance;
                aimqVar.c = ((aimp) this.a).e;
                aimqVar.b |= 1;
                return (aimq) builder.build();
            case 17:
                try {
                    return (List) ((itj) this.a).c.x((List) obj).get();
                } catch (Exception unused) {
                    return agpi.a;
                }
            case 18:
                return (List) Collection.EL.stream((List) obj).map(new hqs(this.a, 19)).collect(Collectors.toList());
            case 19:
                try {
                    return (List) ((itj) this.a).c.s((List) obj).get();
                } catch (Exception unused2) {
                    return agpi.a;
                }
            default:
                return (List) Collection.EL.stream((List) obj).map(new hqs(this.a, 18)).collect(Collectors.toList());
        }
    }
}
