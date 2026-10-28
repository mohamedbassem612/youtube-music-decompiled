package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import androidx.preference.Preference;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.settings.fragment.PrivacyPrefsFragmentCompat;
import com.google.android.apps.youtube.music.ui.preference.SwitchCompatPreference;
import com.google.android.libraries.youtube.common.ui.swipelayout.SwipeLayout;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hsk implements Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ hsk(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(Object obj) {
        Optional optionalOf;
        int i = 10;
        switch (this.$cid) {
            case 0:
                Object obj2 = this.a;
                agrf agrfVar = hsn.a;
                rpi.R((wog) obj2, (String) obj);
                break;
            case 1:
                aapu aapuVar = (aapu) obj;
                aihf aihfVarCreateBuilder = alug.a.createBuilder();
                String strAH = kro.aH(aapuVar.a);
                aihfVarCreateBuilder.copyOnWrite();
                alug alugVar = (alug) aihfVarCreateBuilder.instance;
                strAH.getClass();
                alugVar.b |= 1;
                alugVar.c = strAH;
                aihf aihfVarCreateBuilder2 = aluh.a.createBuilder();
                long j = aapuVar.b;
                aihfVarCreateBuilder2.copyOnWrite();
                aluh aluhVar = (aluh) aihfVarCreateBuilder2.instance;
                aluhVar.b |= 1;
                aluhVar.c = j;
                aihfVarCreateBuilder.copyOnWrite();
                alug alugVar2 = (alug) aihfVarCreateBuilder.instance;
                aluh aluhVar2 = (aluh) aihfVarCreateBuilder2.build();
                aluhVar2.getClass();
                alugVar2.d = aluhVar2;
                alugVar2.b |= 2;
                ((aapv) this.a).e((alug) aihfVarCreateBuilder.build());
                break;
            case 2:
                Object obj3 = this.a;
                agrf agrfVar2 = hsn.a;
                rpi.S((wog) obj3, (String) obj);
                break;
            case 3:
                Object obj4 = this.a;
                agrf agrfVar3 = hsn.a;
                rpi.S((wog) obj4, (String) obj);
                break;
            case 4:
                agrf agrfVar4 = hsn.a;
                aihf aihfVarCreateBuilder3 = aoie.a.createBuilder();
                aihf aihfVarCreateBuilder4 = aoid.a.createBuilder();
                String strH = wfs.h((String) obj);
                aihfVarCreateBuilder4.copyOnWrite();
                aoid aoidVar = (aoid) aihfVarCreateBuilder4.instance;
                aoidVar.b |= 1;
                aoidVar.c = strH;
                aihfVarCreateBuilder3.copyOnWrite();
                aoie aoieVar = (aoie) aihfVarCreateBuilder3.instance;
                aoid aoidVar2 = (aoid) aihfVarCreateBuilder4.build();
                aoidVar2.getClass();
                aoieVar.c = aoidVar2;
                aoieVar.b |= 1;
                ((wog) this.a).e((aoie) aihfVarCreateBuilder3.build());
                break;
            case 5:
                avnr.b((AtomicReference) ((hsn) this.a).m.a((String) obj, "PPSDST").ae());
                break;
            case 6:
                Object obj5 = this.a;
                agrf agrfVar5 = hsn.a;
                rpi.R((wog) obj5, (String) obj);
                break;
            case 7:
                String str = (String) obj;
                try {
                    Object obj6 = ((hfb) this.a).a;
                    if (((huf) obj6).e.v()) {
                        ((huf) obj6).b.d(new gnh(str, 18));
                    }
                    aany aanyVar = ((huf) obj6).b;
                    aihf aihfVarCreateBuilder5 = aofh.a.createBuilder();
                    aihfVarCreateBuilder5.copyOnWrite();
                    aofh aofhVar = (aofh) aihfVarCreateBuilder5.instance;
                    aofhVar.c = 2;
                    aofhVar.b |= 1;
                    String strAy = kro.ay(wfs.h(str));
                    aihfVarCreateBuilder5.copyOnWrite();
                    aofh aofhVar2 = (aofh) aihfVarCreateBuilder5.instance;
                    strAy.getClass();
                    aofhVar2.b |= 2;
                    aofhVar2.d = strAy;
                    aofg aofgVarI = ((huf) obj6).i(aogf.OFFLINE_REQUEST_SOURCE_MANUAL_OFFLINE, 10);
                    aihfVarCreateBuilder5.copyOnWrite();
                    aofh aofhVar3 = (aofh) aihfVarCreateBuilder5.instance;
                    aofgVarI.getClass();
                    aofhVar3.e = aofgVarI;
                    aofhVar3.b |= 4;
                    aanyVar.a((aofh) aihfVarCreateBuilder5.build());
                } catch (aaob e) {
                    ((agrc) ((agrc) ((agrc) huf.a.b().i(agso.a, "Offline")).j(e)).k("com/google/android/apps/youtube/music/offline/orchestration/MusicPlaylistDownloadController$1", "onSuccess", (char) 227, "MusicPlaylistDownloadController.java")).w("Couldn't delete playlist through orchestration: %s", wfs.h(str));
                    return;
                }
                break;
            case 8:
                String str2 = (String) obj;
                try {
                    Object obj7 = ((hfb) this.a).a;
                    if (((huf) obj7).e.v()) {
                        ((huf) obj7).b.d(new gnh(str2, 19));
                    }
                    aany aanyVar2 = ((huf) obj7).b;
                    aihf aihfVarCreateBuilder6 = aofh.a.createBuilder();
                    aihfVarCreateBuilder6.copyOnWrite();
                    aofh aofhVar4 = (aofh) aihfVarCreateBuilder6.instance;
                    aofhVar4.c = 2;
                    aofhVar4.b |= 1;
                    aihfVarCreateBuilder6.copyOnWrite();
                    aofh aofhVar5 = (aofh) aihfVarCreateBuilder6.instance;
                    str2.getClass();
                    aofhVar5.b |= 2;
                    aofhVar5.d = str2;
                    aofg aofgVarI2 = ((huf) obj7).i(aogf.OFFLINE_REQUEST_SOURCE_MANUAL_OFFLINE, 10);
                    aihfVarCreateBuilder6.copyOnWrite();
                    aofh aofhVar6 = (aofh) aihfVarCreateBuilder6.instance;
                    aofgVarI2.getClass();
                    aofhVar6.e = aofgVarI2;
                    aofhVar6.b |= 4;
                    aanyVar2.a((aofh) aihfVarCreateBuilder6.build());
                } catch (aaob e2) {
                    ((agrc) ((agrc) ((agrc) huf.a.b().i(agso.a, "Offline")).j(e2)).k("com/google/android/apps/youtube/music/offline/orchestration/MusicPlaylistDownloadController$1", "onSuccess", (char) 255, "MusicPlaylistDownloadController.java")).w("Couldn't delete playlist through orchestration: %s", wfs.h(str2));
                    return;
                }
                break;
            case 9:
                String strH2 = wfs.h((String) obj);
                Object obj8 = ((hfb) this.a).a;
                ((aatx) obj8).j(strH2, aogf.OFFLINE_REQUEST_SOURCE_MANUAL_OFFLINE, ((huf) obj8).d.intValue());
                break;
            case 10:
                String strH3 = wfs.h((String) obj);
                Object obj9 = ((hfb) this.a).a;
                ((aatx) obj9).j(strH3, aogf.OFFLINE_REQUEST_SOURCE_MANUAL_OFFLINE, ((huf) obj9).d.intValue());
                break;
            case 11:
                ((hzq) this.a).a = (amlg) obj;
                break;
            case 12:
                ((hzr) this.a).a = (amlg) obj;
                break;
            case 13:
                hyz hyzVar = (hyz) obj;
                if (hyzVar instanceof hzg) {
                    ((hzg) hyzVar).w((ibh) this.a);
                }
                break;
            case 14:
                hyz hyzVar2 = (hyz) obj;
                if (hyzVar2 instanceof hzg) {
                    ((hzg) hyzVar2).w((ibh) this.a);
                }
                break;
            case 15:
                zot zotVar = (zot) obj;
                Object obj10 = this.a;
                PrivacyPrefsFragmentCompat privacyPrefsFragmentCompat = ((ipr) obj10).a;
                Context context = privacyPrefsFragmentCompat.getContext();
                PackageManager packageManager = privacyPrefsFragmentCompat.getContext().getPackageManager();
                String str3 = zotVar.b;
                String strA = hgm.a(packageManager, zik.aO(str3));
                if (strA.equals(str3)) {
                    optionalOf = Optional.empty();
                } else {
                    SwitchCompatPreference switchCompatPreference = new SwitchCompatPreference(context);
                    switchCompatPreference.y = Boolean.FALSE;
                    switchCompatPreference.M(str3);
                    switchCompatPreference.Q(context.getString(R.string.pref_mbs_consent_title, strA));
                    switchCompatPreference.n(context.getString(R.string.pref_mbs_consent_summary, strA));
                    switchCompatPreference.x = false;
                    optionalOf = Optional.of(switchCompatPreference);
                }
                hqc hqcVar = new hqc(obj10, zotVar, i);
                if (true == optionalOf.isPresent()) {
                    Object obj11 = optionalOf.get();
                    Object obj12 = hqcVar.a;
                    Object obj13 = hqcVar.b;
                    int i2 = 8;
                    gpa gpaVar = new gpa(obj12, i2);
                    afxd afxdVarF = afxd.f((ListenableFuture) gpaVar.get());
                    String str4 = ((zot) obj13).b;
                    ipr iprVar = (ipr) obj12;
                    afxd afxdVarH = afxdVarF.h(new hqj(str4, 16), iprVar.e);
                    igt igtVar = new igt(11);
                    PrivacyPrefsFragmentCompat privacyPrefsFragmentCompat2 = iprVar.a;
                    taf.k(privacyPrefsFragmentCompat2, afxdVarH, igtVar, new hcq(obj11, privacyPrefsFragmentCompat2, i2));
                    ((Preference) obj11).n = new iqq(privacyPrefsFragmentCompat2, gpaVar, str4);
                }
                break;
            case 16:
                ((adlq) this.a).m(0, (adkz) obj, true);
                break;
            case 17:
                ((SwipeLayout) this.a).m((ColorDrawable) obj);
                break;
            case 18:
                ((SwipeLayout) this.a).k((ColorDrawable) obj);
                break;
            case 19:
                ((jhg) this.a).b((oh) obj);
                break;
            default:
                GradientDrawable gradientDrawable = (GradientDrawable) obj;
                Object obj14 = this.a;
                if (Build.VERSION.SDK_INT >= 29) {
                    gradientDrawable.setColors(gradientDrawable.getColors(), joz.b);
                    ((joz) obj14).z.setBackground(gradientDrawable);
                    break;
                } else {
                    joz jozVar = (joz) obj14;
                    if (jozVar.ao != null && gradientDrawable.getColors() != null) {
                        jqh jqhVar = jozVar.ao;
                        int[] colors = gradientDrawable.getColors();
                        colors.getClass();
                        int[] iArrCopyOf = Arrays.copyOf(colors, colors.length);
                        iArrCopyOf.getClass();
                        jqhVar.a = iArrCopyOf;
                        jqhVar.b();
                        jqhVar.invalidateSelf();
                        break;
                    }
                }
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
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
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
