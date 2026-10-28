package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.preference.SwitchPreferenceCompat;
import androidx.preference.TwoStatePreference;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.youtube.music.ui.preference.SliderPreference;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Optional;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uf implements Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uf(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v62, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r12v25, types: [adwm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v27, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v28, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r12v37, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r12v45, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r12v48, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r12v52, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r12v61, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r12v70, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r12v73, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r3v26, types: [java.lang.Object, java.util.Set] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        tw twVar;
        uq uqVar;
        Object hzwVar;
        int i = 0;
        z = false;
        z = false;
        boolean z = false;
        int i2 = 1;
        switch (this.$cid) {
            case 0:
                ug ugVar = (ug) this.a;
                String str = ugVar.d;
                up upVar = new up(str);
                Object obj = this.b;
                tv tvVar = ugVar.a;
                tvVar.p(str, (tl) obj, null, upVar);
                tw twVar2 = ugVar.c;
                tvVar.q(luv.LITE, twVar2);
                ugVar.f = true;
                ugVar.f();
                twVar2.d(new uq(upVar));
                return null;
            case 1:
                eob eobVar = new eob(null, null);
                Object obj2 = this.a;
                ug ugVar2 = (ug) obj2;
                String str2 = ugVar2.d;
                up upVar2 = new up(str2);
                Object obj3 = this.b;
                td tdVar = (td) obj3;
                if (tdVar.a().isEmpty()) {
                    Log.w("AppSearchSessionImpl", "Request to delete items in namespace " + tdVar.a + " specified no ids!");
                    return eobVar.c();
                }
                try {
                    Map afvVar = new afv();
                    tk tkVar = new tk();
                    Set setA = ((td) obj3).a();
                    azs.l(setA);
                    tkVar.b();
                    tkVar.c.addAll(setA);
                    String str3 = ((td) obj3).a;
                    tkVar.e(str3);
                    tkVar.b();
                    List listAsList = Arrays.asList(str2);
                    azs.l(listAsList);
                    tkVar.b();
                    tkVar.b.addAll(listAsList);
                    ((ug) obj2).a.p(str2, tkVar.a(), afvVar, upVar2);
                    Set set = (Set) afvVar.get(str3);
                    for (String str4 : ((td) obj3).a()) {
                        if (set == null || !set.contains(str4)) {
                            eobVar.e(str4, new ry(6, null, null));
                        } else {
                            eobVar.f(str4, null);
                        }
                        break;
                    }
                    twVar = ugVar2.c;
                    uqVar = new uq(upVar2);
                } catch (Throwable th) {
                    try {
                        ry ryVarA = ry.a(th);
                        Iterator it = ((td) obj3).a().iterator();
                        while (it.hasNext()) {
                            eobVar.e((String) it.next(), ryVarA);
                        }
                        twVar = ugVar2.c;
                        uqVar = new uq(upVar2);
                    } catch (Throwable th2) {
                        ugVar2.c.d(new uq(upVar2));
                        throw th2;
                    }
                }
                twVar.d(uqVar);
                ugVar2.a.q(luv.LITE, ugVar2.c);
                ugVar2.f = true;
                ugVar2.f();
                return eobVar.c();
            case 2:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.b;
                boolean z2 = lottieAnimationView.e;
                Object obj4 = this.a;
                Context context = lottieAnimationView.getContext();
                if (z2) {
                    return ehd.a(context, (String) obj4, "asset_".concat(String.valueOf(obj4)));
                }
                return ehd.a(context, (String) obj4, null);
            case 3:
                return ehd.l((InputStream) this.b, (String) this.a);
            case 4:
                return ((gao) this.a).b((Context) this.b);
            case 5:
                anvz anvzVar = (anvz) this.a;
                return ((gvg) this.b).a.d(anvzVar.e, anvzVar.d, anvzVar.c);
            case 6:
                return Boolean.valueOf(this.b.v(((anwc) this.a).e, 0, null));
            case 7:
                wcn wcnVar = ((hcc) this.b).b;
                ?? r12 = this.a;
                wer werVarE = wcnVar.e();
                r12.invoke(werVarE);
                return werVarE.b();
            case 8:
                Object obj5 = this.b;
                return tzk.c(((syn) ((hef) obj5).b).n(this.a)).u(new hbn(new ank(obj5, 15), 3));
            case 9:
                return Boolean.valueOf(((hhr) this.b).g((hjn) this.a));
            case 10:
                return Boolean.valueOf(((hhr) this.b).g((hjn) this.a));
            case 11:
                Optional optional = (Optional) ahng.v(this.b);
                if (((Optional) ahng.v(this.a)).isPresent() && optional.isPresent() && ((ansx) optional.get()).getAutoSyncType() == aofs.OFFLINE_PLAYLIST_AUTO_SYNC_TYPE_METADATA_AND_STREAMS) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 12:
                ?? r0 = this.a;
                ?? r13 = this.b;
                agrf agrfVar = hnl.a;
                return new kyr(ahng.v(r13), ahng.v(r0), (byte[]) null);
            case 13:
                ?? r1 = this.a;
                ?? r14 = this.b;
                aigj aigjVar = hpb.a;
                Optional optional2 = (Optional) ahng.v(r14);
                hzwVar = (Optional) ahng.v(r1);
                if (optional2.isPresent()) {
                    return optional2;
                }
                return hzwVar;
            case 14:
                ?? r2 = this.a;
                ?? r15 = this.b;
                aigj aigjVar2 = hpb.a;
                Optional optional3 = (Optional) ahng.v(r15);
                hzwVar = (Optional) ahng.v(r2);
                if (optional3.isPresent()) {
                    return optional3;
                }
                return hzwVar;
            case 15:
                pkt pktVar = new pkt();
                pktVar.d(((hrz) this.a).e);
                pktVar.e(((hrx) this.b).a.d(false));
                return pktVar.c();
            case 16:
                while (true) {
                    ?? r3 = this.b;
                    Object obj6 = this.a;
                    if (i >= ((agpi) r3).d) {
                        return obj6;
                    }
                    Optional optional4 = (Optional) ahng.v((ListenableFuture) r3.get(i));
                    hge hgeVar = new hge(obj6, 14);
                    if (true == optional4.isPresent()) {
                        hgeVar.a.add((aamo) optional4.get());
                    }
                    i++;
                }
                break;
            case 17:
                Optional optional5 = (Optional) ahng.v(this.b);
                Optional optional6 = (Optional) ahng.v(this.a);
                hzwVar = new hzw(optional6.isPresent() ? Duration.ofMillis(((anyx) optional6.get()).getLengthMs().longValue()).toSeconds() : 0L, optional5.isPresent() ? ((aret) optional5.get()).getLastPlaybackPositionSeconds().longValue() : 0L);
                return hzwVar;
            case 18:
                Iterator it2 = this.a.iterator();
                while (true) {
                    Object obj7 = this.b;
                    if (!it2.hasNext()) {
                        return (aouj) ((aihf) obj7).build();
                    }
                    ListenableFuture listenableFuture = (ListenableFuture) it2.next();
                    aihf aihfVarCreateBuilder = aoui.a.createBuilder();
                    aoun aounVar = (aoun) ahng.v(listenableFuture);
                    aihfVarCreateBuilder.copyOnWrite();
                    aoui aouiVar = (aoui) aihfVarCreateBuilder.instance;
                    aounVar.getClass();
                    aouiVar.c = aounVar;
                    aouiVar.b |= 1;
                    ((aihh) obj7).p((aoui) aihfVarCreateBuilder.build());
                }
                break;
            case 19:
                ?? r4 = this.a;
                ?? r16 = this.b;
                agrf agrfVar2 = ipo.a;
                SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) ahng.v(r16);
                SliderPreference sliderPreference = (SliderPreference) ahng.v(r4);
                switchPreferenceCompat.n = new iqx(switchPreferenceCompat.n, sliderPreference, i2);
                sliderPreference.R(((TwoStatePreference) switchPreferenceCompat).a);
                return agke.r(switchPreferenceCompat, sliderPreference);
            default:
                return Boolean.valueOf(((Boolean) ahng.v(this.b)).booleanValue() || ((Boolean) ahng.v(this.a)).booleanValue());
        }
    }

    public /* synthetic */ uf(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
