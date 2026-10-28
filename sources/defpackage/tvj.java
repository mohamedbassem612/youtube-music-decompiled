package defpackage;

import android.content.Context;
import androidx.preference.EditTextPreference;
import androidx.preference.SeekBarPreference;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.common.ui.preferences.ProtoDataStoreSwitchPreference;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Optional;
import java.util.HashMap;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class tvj implements twi {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ tvj(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, ttm] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, ttm] */
    /* JADX WARN: Type inference failed for: r11v29, types: [java.lang.Object, twi] */
    /* JADX WARN: Type inference failed for: r11v30, types: [java.lang.Object, twi] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, ttm] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, ttm] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object, ttm] */
    @Override // defpackage.twi
    public final void a(Object obj) {
        aiie aiieVar;
        int i = 1;
        switch (this.$cid) {
            case 0:
                this.a.e((Throwable) obj);
                return;
            case 1:
                this.a.e((Throwable) obj);
                return;
            case 2:
                ((EditTextPreference) this.a).i((String) obj);
                return;
            case 3:
                this.a.e((Throwable) obj);
                return;
            case 4:
                this.a.e((Throwable) obj);
                return;
            case 5:
                ((SeekBarPreference) this.a).k(((Integer) obj).intValue(), true);
                return;
            case 6:
                this.a.e((Throwable) obj);
                return;
            case 7:
                tvl tvlVar = ((ProtoDataStoreSwitchPreference) this.a).c;
                if (tvlVar != null) {
                    tvlVar.a();
                    return;
                }
                return;
            case 8:
                ((uiv) this.a).o();
                return;
            case 9:
                ((uiv) this.a).o();
                return;
            case 10:
                ((uiv) this.a).o();
                return;
            case 11:
                uiv uivVar = (uiv) this.a;
                awmd awmdVar = uivVar.s;
                if (((ujd) awmdVar.io()).b()) {
                    ujd ujdVar = (ujd) awmdVar.io();
                    HashMap map = new HashMap();
                    ujdVar.g.a(map).addListener(afwl.i(new sxk(ujdVar, map, 20)), MoreExecutors.directExecutor());
                }
                uivVar.o();
                return;
            case 12:
                ((ulp) this.a).m((Throwable) obj, "Error loading async shorts video metadata");
                return;
            case 13:
                ((ulp) this.a).m((Throwable) obj, "Error loading async editor project state");
                return;
            case 14:
                ulb ulbVar = (ulb) obj;
                ulbVar.getClass();
                Object obj2 = this.a;
                ulp ulpVar = (ulp) obj2;
                boolean zD = ulpVar.D.d(vbd.b);
                usd usdVar = ulbVar.b;
                if (!zD) {
                    vat vatVar = ulpVar.G;
                    usdVar.g();
                    synchronized (usdVar.a) {
                        aiieVar = usdVar.c.b.g;
                        break;
                    }
                    agke agkeVarN = agke.n(aiieVar);
                    int size = agkeVarN.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        aufd aufdVar = (aufd) agkeVarN.get(i2);
                        if (((aufdVar.e == 1000 ? (auff) aufdVar.f : auff.a).b & 1) != 0) {
                            ajwo ajwoVar = (aufdVar.e == 1000 ? (auff) aufdVar.f : auff.a).c;
                            if (ajwoVar == null) {
                                ajwoVar = ajwo.a;
                            }
                            aihl aihlVarCheckIsLite = aihn.checkIsLite(ajfz.b);
                            ajwoVar.c(aihlVarCheckIsLite);
                            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                                ajwo ajwoVar2 = (aufdVar.e == 1000 ? (auff) aufdVar.f : auff.a).c;
                                if (ajwoVar2 == null) {
                                    ajwoVar2 = ajwo.a;
                                }
                                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajfz.b);
                                ajwoVar2.c(aihlVarCheckIsLite2);
                                Object objK = ajwoVar2.j.k(aihlVarCheckIsLite2.d);
                                vatVar.q((ajfz) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK)));
                            } else {
                                zvp.a(zvn.b, zvm.M, "[ShortsCreation][Android][Effect]CreationEffect.EffectPickerConfiguration.SelectCommand missing AssetItemSelectCommand extension.");
                            }
                        } else {
                            zvp.a(zvn.b, zvm.M, "[ShortsCreation][Android][Effect]CreationEffect.EffectPickerConfiguration missing selectCommand.");
                        }
                    }
                }
                ulpVar.r = usdVar;
                ulpVar.q();
                ulpVar.p();
                final uks uksVar = ulpVar.e.a;
                ukq ukqVarA = uksVar.a();
                usc uscVar = uksVar.d;
                if (ukqVarA != null && uscVar != null) {
                    ukqVarA.a.m(uscVar);
                    uksVar.d = null;
                }
                ukq ukqVar = ulbVar.c;
                uksVar.b.kk(Optional.of(ukqVar));
                awli awliVar = uksVar.c;
                usd usdVar2 = ukqVar.a;
                awliVar.kk(Optional.of(usdVar2.c()));
                usc uscVar2 = new usc() { // from class: ukr
                    @Override // defpackage.usc
                    public final void g(auhs auhsVar) {
                        auhsVar.getClass();
                        uksVar.c.kk(Optional.of(auhsVar));
                    }
                };
                usdVar2.e.h(uscVar2);
                uksVar.d = uscVar2;
                ulpVar.u.addAll(ulbVar.a);
                ulpVar.l = avlr.z().ag(new uln(obj2, i), new jeh(14));
                return;
            case 15:
                Throwable th = (Throwable) obj;
                ((agrc) ((agrc) ((agrc) unn.a.b()).j(th)).k("com/google/android/libraries/youtube/creation/editor/image/ImageEditorFragmentPeer", "hasUncommittedEdits", (char) 592, "ImageEditorFragmentPeer.java")).t("Error comparing snapshot");
                if (th != null) {
                    zvp.b(zvn.b, zvm.z, "[Creation][Android][ImageEditor] Error comparing snapshot", th);
                }
                this.a.a(Boolean.TRUE);
                return;
            case 16:
                this.a.a((Boolean) obj);
                return;
            case 17:
                Throwable th2 = (Throwable) obj;
                Object obj3 = this.a;
                if (th2 != null && !(th2 instanceof CancellationException)) {
                    zvl zvlVar = ((uoa) obj3).g;
                    zvj zvjVarA = zvk.a();
                    zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
                    zvjVarA.j = 70;
                    zvjVarA.i = 278;
                    zvjVarA.d("Error saving edits");
                    zvjVarA.f(th2);
                    zvlVar.a(zvjVarA.a());
                }
                ((uoa) obj3).v = false;
                return;
            case 18:
                Throwable th3 = (Throwable) obj;
                zvj zvjVarA2 = zvk.a();
                zvjVarA2.c(ajtv.ERROR_LEVEL_ERROR);
                zvjVarA2.j = 70;
                zvjVarA2.i = 278;
                zvjVarA2.d("Error creating snapshot");
                if (th3 != null) {
                    zvjVarA2.f(th3);
                }
                ((uoa) this.a).g.a(zvjVarA2.a());
                return;
            case 19:
                Boolean bool = (Boolean) obj;
                Object obj4 = this.a;
                if (bool != null && !bool.booleanValue()) {
                    uoa uoaVar = (uoa) obj4;
                    if (uoaVar.i() && uoaVar.E.h(1, 45851797L).b.size() > 0) {
                        uoaVar.r.isPresent();
                    }
                    unz unzVar = uoaVar.A;
                    if (unzVar != null) {
                        ((vea) unzVar).f();
                    }
                    uoaVar.u = false;
                    return;
                }
                uoa uoaVar2 = (uoa) obj4;
                qcb qcbVar = uoaVar2.I;
                unj unjVarB = uoaVar2.b();
                unjVarB.getClass();
                dd childFragmentManager = unjVarB.getChildFragmentManager();
                qcb qcbVar2 = new qcb(obj4);
                uho uhoVarA = uhp.a();
                uhoVarA.d(false);
                uhoVarA.f(R.string.shorts_editor_close_confirmation_reshoot);
                uhoVarA.e(R.drawable.yt_outline_trash_can_black_24);
                uhp uhpVarA = uhoVarA.a();
                gif gifVar = (gif) qcbVar.a;
                Context context = (Context) gifVar.d.aW.io();
                ght ghtVar = gifVar.a;
                new uhq(context, childFragmentManager, qcbVar2, uhpVarA, (adxj) ghtVar.Ad.io(), (aaok) ghtVar.a.iz.io()).e();
                uoaVar2.u = false;
                return;
            default:
                Boolean bool2 = (Boolean) obj;
                Object obj5 = this.a;
                if (bool2 != null) {
                    ((aqi) obj5).b(bool2);
                    return;
                } else {
                    ((aqi) obj5).d(new IllegalStateException("hasUncommittedEdits returned null"));
                    return;
                }
        }
    }
}
