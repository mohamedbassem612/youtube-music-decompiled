package defpackage;

import android.content.Intent;
import android.os.Bundle;
import androidx.preference.Preference;
import androidx.preference.TwoStatePreference;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.common.ui.preferences.ProtoDataStorePreferenceFragment;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hcq implements twi {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hcq(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v55, types: [java.lang.Object, ttm] */
    /* JADX WARN: Type inference failed for: r0v64, types: [java.lang.Object, ttm] */
    /* JADX WARN: Type inference failed for: r1v35, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r7v74, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r7v91, types: [java.lang.Object, vxe] */
    @Override // defpackage.twi
    public final void a(Object obj) {
        Object obj2;
        akrn akrnVar = null;
        zh zhVar = null;
        zh zhVar2 = null;
        boolean z = false;
        z = false;
        z = false;
        switch (this.$cid) {
            case 0:
                ((hct) this.a).a((String) this.b, new Bundle());
                break;
            case 1:
                ((get) this.b).g((Intent) this.a, (gft) obj);
                break;
            case 2:
                Bundle bundle = (Bundle) obj;
                if (bundle == null) {
                    bundle = new Bundle();
                }
                ((hct) this.a).a((String) this.b, bundle);
                break;
            case 3:
                Throwable th = (Throwable) obj;
                if (th != null) {
                    ((hdj) this.a).t(th, Optional.of(this.b));
                }
                break;
            case 4:
                Optional optional = (Optional) obj;
                if (optional != null && optional.isPresent() && (optional.get() instanceof anjx)) {
                    z = true;
                }
                ((hmn) this.a).c.a(fhz.T((String) this.b, z));
                break;
            case 5:
                hth hthVar = (hth) obj;
                if (hthVar != null && !hthVar.a().isEmpty() && !hthVar.b().isEmpty()) {
                    hmt hmtVar = (hmt) this.a;
                    if (!hmtVar.e.o(hthVar.d())) {
                        hmtVar.o.az(R.string.readd_to_offline_video, Integer.valueOf(R.string.offline_file_not_found_dialog_message), new hml(new hmp(hmtVar, (String) this.b), 6), R.string.confirm_download, 295765);
                    }
                    break;
                }
                break;
            case 6:
                Optional optional2 = (Optional) obj;
                if (optional2 != null) {
                    gtr gtrVar = new gtr(this.a, this.b, 5);
                    if (true == optional2.isPresent()) {
                        Object obj3 = optional2.get();
                        Object obj4 = gtrVar.a;
                        Object obj5 = gtrVar.b;
                        annv annvVar = (annv) ((weh) obj3);
                        List listH = annvVar.h();
                        String str = (String) obj5;
                        if (listH.contains(kro.aH(str))) {
                            ((hmt) obj4).a(str, "PPSV", listH.size() == 1);
                        } else if (!annvVar.k().contains(kro.aH(str))) {
                            List listF = annvVar.f();
                            if (listF.contains(kro.aH(str))) {
                                ((hmt) obj4).a(str, "PPSE", listF.size() == 1);
                            }
                        } else {
                            ((hmt) obj4).a(str, "PPSDST", false);
                        }
                    }
                }
                break;
            case 7:
                Optional optional3 = (Optional) obj;
                if (optional3 != null) {
                    hmr hmrVar = new hmr((hmt) this.a, (String) this.b, z ? 1 : 0);
                    if (true == optional3.isPresent()) {
                        Object obj6 = optional3.get();
                        Object obj7 = hmrVar.a;
                        Object obj8 = hmrVar.b;
                        Object obj9 = hmrVar.c;
                        if (true == ((annv) ((weh) obj6)).f().contains(obj8)) {
                            obj2 = obj9;
                            obj2 = "FEoffline_nma_tracks";
                        }
                        obj2 = obj9;
                        gmj gmjVar = ((hmt) obj7).n;
                        ajwo ajwoVarB = vxh.b((String) obj2);
                        jio jioVarE = jin.e();
                        cf cfVar = (cf) gmjVar.f;
                        ((jik) jioVarE).k(cfVar.getText(R.string.snackbar_adding_to_offline));
                        jioVarE.l(cfVar.getText(R.string.action_view), new gdp(gmjVar, ajwoVarB, 7));
                        ((jin) gmjVar.b).d(jioVarE.b());
                    }
                }
                break;
            case 8:
                boolean z2 = ((ailn) obj) == ailn.GRANTED;
                Object obj10 = this.a;
                Preference preference = (Preference) obj10;
                preference.J(Boolean.valueOf(z2));
                ((TwoStatePreference) obj10).k(z2);
                ((ProtoDataStorePreferenceFragment) this.b).addPreference(preference);
                break;
            case 9:
                iqg iqgVar = (iqg) obj;
                if (iqgVar == null) {
                    ((agrc) ((agrc) iqr.a.c()).k("com/google/android/apps/youtube/music/settings/utils/MusicBrowserConsentSettingsUtil", "setUpConsentPreference", 99, "MusicBrowserConsentSettingsUtil.java")).t("Null MusicBrowserClientsPrefsStore during consent preference update.");
                } else {
                    iqgVar.b((String) this.b, ((Boolean) this.a).booleanValue() ? ailn.GRANTED : ailn.DENIED);
                }
                break;
            case 10:
                iqk iqkVar = (iqk) obj;
                if (iqkVar != null) {
                    Object obj11 = this.a;
                    ((Preference) obj11).n = new iqw((ira) this.b, iqkVar, (TwoStatePreference) obj11, 2);
                }
                break;
            case 11:
                wfy wfyVar = (wfy) obj;
                if (wfyVar != null) {
                    jjm jjmVar = (jjm) this.b;
                    if (!jjmVar.z) {
                        ((hej) this.a).h = wfyVar;
                        jjmVar.v();
                    }
                }
                break;
            case 12:
                Optional optional4 = (Optional) obj;
                if (optional4 != null && optional4.isPresent()) {
                    Object obj12 = this.b;
                    jnw jnwVar = (jnw) this.a;
                    if (!jnwVar.g((String) obj12)) {
                        joa joaVar = jnwVar.c;
                        if ((((asfp) optional4.get()).b & 1) != 0) {
                            aihh aihhVar = (aihh) akrn.a.createBuilder();
                            asmv asmvVar = ((asfp) optional4.get()).c;
                            if (asmvVar == null) {
                                asmvVar = asmv.a;
                            }
                            acxu.b(aihhVar, asmvVar);
                            akrnVar = (akrn) aihhVar.build();
                        }
                        if (akrnVar == null) {
                            joaVar.c();
                        } else {
                            jnwVar.d(joaVar, akrnVar);
                        }
                    }
                    break;
                }
                break;
            case 13:
                ((joj) this.a).a.f(((ttm) ((jol) this.b).k.io()).b((Throwable) obj), true, false, false);
                break;
            case 14:
                ((rkm) this.a).k((ajqf) this.b, (almo) obj);
                break;
            case 15:
                Throwable th2 = (Throwable) obj;
                sum sumVar = (sum) this.a;
                sumVar.b.i();
                xeu xeuVar = sumVar.c;
                Object obj13 = this.b;
                if (xeuVar.b) {
                    xff xffVarA = xeuVar.a(((acb) obj13).o(), alot.TRANSACTION_FLOW_FAILED);
                    ztf ztfVar = xffVarA.k.e;
                    xffVarA.l = ztfVar.a();
                    ztfVar.k(xffVarA);
                } else {
                    xeuVar.b(((acb) obj13).h());
                }
                sumVar.d(th2);
                break;
            case 16:
                Throwable th3 = (Throwable) obj;
                sus susVar = (sus) this.a;
                susVar.f.i();
                Iterator it = susVar.g.a.iterator();
                while (it.hasNext()) {
                    ((sva) it.next()).a();
                }
                Object obj14 = this.b;
                susVar.d.e(th3);
                susVar.d((zh) obj14);
                break;
            case 17:
                Throwable th4 = (Throwable) obj;
                aguu.ak(th4);
                Object obj15 = this.b;
                if (!((aigj) obj15).E()) {
                    zh zhVar3 = new zh((byte[]) null);
                    zhVar3.b = obj15;
                    zhVar3.a = 3;
                    zhVar2 = zhVar3;
                }
                sve sveVar = (sve) this.a;
                ((sud) sveVar.f).i();
                sveVar.e.e(th4);
                if (zhVar2 != null) {
                    xeu xeuVar2 = (xeu) sveVar.g;
                    if (!xeuVar2.b) {
                        alos alosVar = (alos) alou.a.createBuilder();
                        arog arogVarP = zhVar2.p();
                        alosVar.copyOnWrite();
                        alou alouVar = (alou) alosVar.instance;
                        arogVarP.getClass();
                        alouVar.d = arogVarP;
                        alouVar.c = 191;
                        xeuVar2.b((alou) alosVar.build());
                    } else {
                        xff xffVarA2 = xeuVar2.a(zhVar2.q(), alot.YPC_PAUSE_FLOW_FAILED);
                        ztf ztfVar2 = xffVarA2.k.e;
                        xffVarA2.l = ztfVar2.a();
                        ztfVar2.k(xffVarA2);
                    }
                }
                break;
            case 18:
                aluj alujVar = (aluj) obj;
                aguu.ak(alujVar);
                sve sveVar2 = (sve) this.b;
                ((sud) sveVar2.f).i();
                ((vwt) sveVar2.d).U();
                Object obj16 = this.a;
                if (obj16 != null) {
                    xeu xeuVar3 = (xeu) sveVar2.g;
                    if (xeuVar3.b) {
                        xff xffVarA3 = xeuVar3.a(((zh) obj16).q(), alot.YPC_PAUSE_FLOW_SUCCEEDED);
                        ztf ztfVar3 = xffVarA3.k.e;
                        xffVarA3.l = ztfVar3.a();
                        ztfVar3.k(xffVarA3);
                    } else {
                        alos alosVar2 = (alos) alou.a.createBuilder();
                        arog arogVarP2 = ((zh) obj16).p();
                        alosVar2.copyOnWrite();
                        alou alouVar2 = (alou) alosVar2.instance;
                        arogVarP2.getClass();
                        alouVar2.d = arogVarP2;
                        alouVar2.c = 190;
                        xeuVar3.b((alou) alosVar2.build());
                    }
                }
                if (!alujVar.c.isEmpty()) {
                    sveVar2.b.b(alujVar.c);
                }
                break;
            case 19:
                Object obj17 = this.b;
                Throwable th5 = (Throwable) obj;
                if (!((aigj) obj17).E()) {
                    zh zhVar4 = new zh((byte[]) null);
                    zhVar4.b = obj17;
                    zhVar4.a = 3;
                    zhVar = zhVar4;
                }
                sxc sxcVar = (sxc) this.a;
                sxcVar.a.i();
                sxcVar.b.e(th5);
                if (zhVar != null) {
                    xeu xeuVar4 = (xeu) sxcVar.e;
                    if (!xeuVar4.b) {
                        alos alosVar3 = (alos) alou.a.createBuilder();
                        aroj arojVarN = zhVar.n();
                        alosVar3.copyOnWrite();
                        alou alouVar3 = (alou) alosVar3.instance;
                        arojVarN.getClass();
                        alouVar3.d = arojVarN;
                        alouVar3.c = 196;
                        xeuVar4.b((alou) alosVar3.build());
                    } else {
                        xff xffVarA4 = xeuVar4.a(zhVar.o(), alot.YPC_RESUME_FLOW_FAILED);
                        ztf ztfVar4 = xffVarA4.k.e;
                        xffVarA4.l = ztfVar4.a();
                        ztfVar4.k(xffVarA4);
                    }
                }
                break;
            default:
                alxb alxbVar = (alxb) obj;
                sxc sxcVar2 = (sxc) this.b;
                sxcVar2.a.i();
                ((vwt) sxcVar2.d).U();
                Object obj18 = this.a;
                if (obj18 != null) {
                    xeu xeuVar5 = (xeu) sxcVar2.e;
                    if (xeuVar5.b) {
                        xff xffVarA5 = xeuVar5.a(((zh) obj18).o(), alot.YPC_RESUME_FLOW_SUCCEEDED);
                        ztf ztfVar5 = xffVarA5.k.e;
                        xffVarA5.l = ztfVar5.a();
                        ztfVar5.k(xffVarA5);
                    } else {
                        alos alosVar4 = (alos) alou.a.createBuilder();
                        aroj arojVarN2 = ((zh) obj18).n();
                        alosVar4.copyOnWrite();
                        alou alouVar4 = (alou) alosVar4.instance;
                        arojVarN2.getClass();
                        alouVar4.d = arojVarN2;
                        alouVar4.c = 195;
                        xeuVar5.b((alou) alosVar4.build());
                    }
                }
                if (alxbVar != null && !alxbVar.c.isEmpty()) {
                    sxcVar2.c.d(alxbVar.c, null);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ hcq(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
