package defpackage;

import android.content.Context;
import android.widget.EditText;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.ui.components.loading.LoadingFrameLayout;
import com.google.android.libraries.youtube.common.ui.preferences.ProtoDataStoreCheckBoxPreference;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jlz implements twi {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ jlz(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00a0  */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, twi] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object, ttm] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object, svn] */
    /* JADX WARN: Type inference failed for: r0v58, types: [java.lang.Object, svn] */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, xgn] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object, svp] */
    @Override // defpackage.twi
    public final void a(Object obj) {
        jmg jmgVar;
        aefv aefvVar;
        ImageView imageView;
        akdd akddVar;
        int iAV;
        int i = 3;
        int i2 = 8;
        switch (this.$cid) {
            case 0:
                allk allkVar = (allk) obj;
                if (allkVar != null) {
                    ((jmg) this.a).t(allkVar);
                }
                break;
            case 1:
                allk allkVar2 = (allk) obj;
                jmg jmgVar2 = (jmg) this.a;
                EditText editText = jmgVar2.ad;
                if (editText != null) {
                    editText.setText("");
                }
                jmgVar2.I(true);
                LottieAnimationView lottieAnimationView = jmgVar2.ai;
                if (lottieAnimationView != null) {
                    lottieAnimationView.d();
                    jmgVar2.ai.setVisibility(8);
                }
                if (allkVar2 != null) {
                    jmgVar2.t(allkVar2);
                }
                if (!jmgVar2.O.E()) {
                    jmgVar2.F(R.string.multi_turn_input_prompt);
                }
                break;
            case 2:
                ((Throwable) obj).getCause();
                jmg jmgVar3 = (jmg) this.a;
                LoadingFrameLayout loadingFrameLayout = jmgVar3.am;
                if (loadingFrameLayout != null) {
                    loadingFrameLayout.h(1);
                    jmgVar3.am.setVisibility(8);
                }
                jmgVar3.v("");
                break;
            case 3:
                Throwable th = (Throwable) obj;
                jmg jmgVar4 = (jmg) this.a;
                EditText editText2 = jmgVar4.ad;
                if (editText2 != null) {
                    editText2.setText("");
                }
                jmgVar4.I(true);
                if (!(th.getCause() instanceof CancellationException)) {
                    jmgVar4.K();
                }
                break;
            case 4:
                allk allkVar3 = (allk) obj;
                jmg jmgVar5 = (jmg) this.a;
                EditText editText3 = jmgVar5.ad;
                if (editText3 != null) {
                    editText3.setText("");
                    if (allkVar3 != null && (allkVar3.b & 8) != 0) {
                        jmgVar5.F(R.string.multi_turn_input_prompt);
                    }
                }
                jmgVar5.I(true);
                LottieAnimationView lottieAnimationView2 = jmgVar5.ai;
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.d();
                    jmgVar5.ai.setVisibility(8);
                }
                if (allkVar3 != null) {
                    jmgVar5.t(allkVar3);
                }
                break;
            case 5:
                this.a.a("");
                break;
            case 6:
                if (Objects.equals((Boolean) obj, Boolean.FALSE) && (aefvVar = (jmgVar = (jmg) this.a).I) != null && (imageView = jmgVar.aj) != null) {
                    aefvVar.h(imageView.getRootView());
                    if (!jmgVar.I.l() && jmgVar.ak != null) {
                        aefk aefkVarB = aefl.b();
                        aefkVarB.b = jmgVar.getString(R.string.select_voice_language_promo);
                        aefkVarB.a = jmgVar.ak;
                        aefkVarB.l(2);
                        aefkVarB.e(1);
                        aefkVarB.k(0.6f);
                        jmgVar.I.c(aefkVarB.c());
                        ((qrx) ((lqa) jmgVar.x.io()).a).a(new aeiw(i2), MoreExecutors.directExecutor());
                        break;
                    }
                }
                break;
            case 7:
                allk allkVar4 = (allk) obj;
                if (allkVar4 != null) {
                    jml jmlVar = (jml) this.a;
                    if (jmlVar.m.m(270, 45835641L)) {
                        jmlVar.k = true;
                        jmlVar.i = null;
                        twi twiVar = jmlVar.h;
                        if (twiVar != null) {
                            twiVar.a(allkVar4);
                        }
                    }
                }
                break;
            case 8:
                ((jnw) this.a).j = null;
                ((agrc) ((agrc) ((agrc) jnw.a.b()).j((Throwable) obj)).k("com/google/android/apps/youtube/music/watchpage/VideoActionBarPresenter", "maybeRenderClientGeneratedVideoActionBar", (char) 336, "VideoActionBarPresenter.java")).t("Failed to get VideoActionBarFillerBlock.");
                break;
            case 9:
                Boolean bool = (Boolean) obj;
                if (bool != null && bool.booleanValue()) {
                    Object obj2 = this.a;
                    jqo jqoVar = (jqo) obj2;
                    jqoVar.r.d(new igt(15));
                    avlb.x(700L, TimeUnit.MILLISECONDS, jqoVar.i).E(new hoi(obj2, i));
                    break;
                }
                break;
            case 10:
                ((rkm) this.a).j((Throwable) obj);
                break;
            case 11:
                ((rkm) this.a).l((Throwable) obj);
                break;
            case 12:
                zs zsVar = (zs) obj;
                zsVar.getClass();
                zs zsVar2 = new zs((almq) zsVar.a);
                rkm rkmVar = (rkm) this.a;
                if (rkmVar.t != null && zsVar.w() != null) {
                    rkmVar.t.d(new xgj(zsVar.w()));
                }
                rkmVar.l = zsVar2.u();
                rkmVar.u = zsVar2.v();
                rkmVar.o(rkmVar.l);
                break;
            case 13:
                rkt rktVar = (rkt) this.a;
                rktVar.b();
                rktVar.d.e((Throwable) obj);
                break;
            case 14:
                wyk wykVar = (wyk) this.a;
                Throwable th2 = (Throwable) obj;
                ((sud) wykVar.b).i();
                wykVar.a();
                if (wykVar.b()) {
                    vxe vxeVar = (vxe) wykVar.a.io();
                    ajwn ajwnVar = ((arom) wykVar.f).e;
                    if (ajwnVar == null) {
                        ajwnVar = ajwn.a;
                    }
                    nsh.f(vxeVar, ajwnVar);
                }
                ?? r0 = wykVar.k;
                r0.d(r0.b(th2));
                break;
            case 15:
                amax amaxVar = (amax) obj;
                wyk wykVar2 = (wyk) this.a;
                ((sud) wykVar2.b).i();
                if (amaxVar == null) {
                    amaxVar = amax.a;
                }
                if (amaxVar == null) {
                    akddVar = null;
                } else {
                    amar amarVar = amaxVar.d;
                    if (amarVar == null) {
                        amarVar = amar.a;
                    }
                    if (amarVar.b == 64099105) {
                        amar amarVar2 = amaxVar.d;
                        if (amarVar2 == null) {
                            amarVar2 = amar.a;
                        }
                        akddVar = amarVar2.b == 64099105 ? (akdd) amarVar2.c : akdd.a;
                    } else {
                        akddVar = null;
                    }
                }
                if (akddVar == null) {
                    if (!amaxVar.f.isEmpty()) {
                        ((vxe) wykVar2.a.io()).b(amaxVar.f);
                    }
                    ?? r3 = wykVar2.i;
                    if (r3 != 0) {
                        r3.x(amaxVar);
                    } else {
                        ((vwt) wykVar2.c).V(amaxVar);
                    }
                    if (wykVar2.b()) {
                        vxe vxeVar2 = (vxe) wykVar2.a.io();
                        ajwn ajwnVar2 = ((arom) wykVar2.f).e;
                        if (ajwnVar2 == null) {
                            ajwnVar2 = ajwn.a;
                        }
                        nsh.h(vxeVar2, ajwnVar2);
                    }
                    if ((amaxVar.b & 32) == 0 || (iAV = a.aV(amaxVar.h)) == 0 || iAV != 2) {
                        acb acbVar = new acb((char[]) null);
                        arom aromVar = (arom) wykVar2.f;
                        if (!aromVar.d.E()) {
                            acbVar.d = aromVar.d;
                        }
                        xeu xeuVar = (xeu) wykVar2.g;
                        if (!xeuVar.b) {
                            xeuVar.b(acbVar.l());
                        } else {
                            xff xffVarA = xeuVar.a(acbVar.o(), alot.TRANSACTION_FLOW_SUCCEEDED);
                            ztf ztfVar = xffVarA.k.e;
                            xffVarA.l = ztfVar.a();
                            ztfVar.k(xffVarA);
                        }
                    } else {
                        wykVar2.a();
                    }
                } else {
                    Object obj3 = wykVar2.e;
                    awmd awmdVar = wykVar2.a;
                    acwl.i((Context) obj3, akddVar, (vxe) awmdVar.io(), wykVar2.j, null, true, true, null, null, null, null, (abfv) wykVar2.l, false);
                    wykVar2.a();
                    if (wykVar2.b()) {
                        vxe vxeVar3 = (vxe) awmdVar.io();
                        ajwn ajwnVar3 = ((arom) wykVar2.f).e;
                        if (ajwnVar3 == null) {
                            ajwnVar3 = ajwn.a;
                        }
                        nsh.h(vxeVar3, ajwnVar3);
                    }
                }
                break;
            case 16:
                ttm ttmVar = ((suz) this.a).b;
                ttmVar.d(ttmVar.b((Throwable) obj));
                break;
            case 17:
                alpu alpuVar = (alpu) obj;
                if (alpuVar != null) {
                    Object obj4 = this.a;
                    int i3 = alpuVar.b;
                    if (i3 == 3) {
                        ((suz) obj4).a.a((ajwo) alpuVar.c);
                    } else if (i3 == 4) {
                        ((suz) obj4).a.a((ajwo) alpuVar.c);
                    }
                }
                break;
            case 18:
                this.a.a((Throwable) obj);
                break;
            case 19:
                this.a.b((byte[]) obj);
                break;
            default:
                ((ProtoDataStoreCheckBoxPreference) this.a).ae((Boolean) obj);
                break;
        }
    }
}
