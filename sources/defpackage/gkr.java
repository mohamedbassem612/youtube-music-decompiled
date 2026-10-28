package defpackage;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.ui.components.chipcloud.ChipCloudChipLoadingIndicator;
import com.google.android.apps.youtube.music.ui.components.chipcloud.ChipCloudChipView;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gkr implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gkr(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r12v37, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.lang.Object, nuc] */
    @Override // defpackage.avni
    public final void a(Object obj) {
        anld anldVar;
        anld anldVar2;
        ajwo ajwoVar = null;
        anld anldVar3 = null;
        boolean z = true;
        boolean z2 = false;
        switch (this.$cid) {
            case 0:
                long j = gkt.a;
                if (!((gmu) obj).a()) {
                    ((awlk) this.b).kn();
                } else {
                    ((awlk) this.a).kn();
                }
                break;
            case 1:
                ((gef) this.b).b((View) this.a);
                break;
            case 2:
                Integer num = (Integer) obj;
                Resources resources = (Resources) this.a;
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mini_player_height);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.item_extra_extra_large_spacing);
                gpl gplVar = (gpl) this.b;
                if (gplVar.am != null) {
                    aihf aihfVarCreateBuilder = ailj.a.createBuilder();
                    int iIntValue = dimensionPixelSize2 + dimensionPixelSize + num.intValue();
                    aihfVarCreateBuilder.copyOnWrite();
                    ailj ailjVar = (ailj) aihfVarCreateBuilder.instance;
                    ailjVar.b |= 4;
                    ailjVar.e = iIntValue;
                    jle.b((ailj) aihfVarCreateBuilder.build(), gplVar.am);
                    gplVar.am.requestLayout();
                }
                break;
            case 3:
                if (!((Boolean) obj).booleanValue()) {
                    Object obj2 = this.b;
                    Object obj3 = this.a;
                    ajih ajihVar = (ajih) obj2;
                    if (!ajihVar.c) {
                        algt algtVar = ajihVar.e;
                        if (algtVar == null) {
                            algtVar = algt.a;
                        }
                        amyv amyvVarA = amyv.a(ajihVar.f);
                        if (amyvVarA == null) {
                            amyvVarA = amyv.MDX_SESSION_SOURCE_UNKNOWN;
                        }
                        ((gsw) obj3).h(algtVar, amyvVarA);
                    } else {
                        ((gsw) obj3).g(ajihVar);
                    }
                }
                break;
            case 4:
                if (((xpe) obj).a) {
                    ((gsw) this.a).e((ajih) this.b);
                }
                break;
            case 5:
                ((hgq) this.a).w((hjy) this.b, "onPlayFromUri()", (anaf) obj, null);
                break;
            case 6:
                ((hgq) this.a).w((hjy) this.b, "onPlayFromSearch()", (anaf) obj, null);
                break;
            case 7:
                ((hmt) this.a).b(((aanv) obj).b, (String) this.b);
                break;
            case 8:
                ((agrc) ((agrc) ((agrc) hmt.a.b()).j((Throwable) obj)).k("com/google/android/apps/youtube/music/offline/actionscontroller/MusicOfflineTrackEntityActionsController", "retryTrackInternal", (char) 540, "MusicOfflineTrackEntityActionsController.java")).t("Failure to save track.");
                ((hmt) this.a).b(aanu.f, (String) this.b);
                break;
            case 9:
                ((hmt) this.a).b(((aanv) obj).b, (String) this.b);
                break;
            case 10:
                ((agrc) ((agrc) ((agrc) hmt.a.b()).j((Throwable) obj)).k("com/google/android/apps/youtube/music/offline/actionscontroller/MusicOfflineTrackEntityActionsController", "saveTrackInternal", (char) 424, "MusicOfflineTrackEntityActionsController.java")).t("Failure to save track.");
                ((hmt) this.a).b(aanu.f, (String) this.b);
                break;
            case 11:
                ((hqg) this.a).k(this.b, (aahb) obj);
                break;
            case 12:
                ((iet) this.a).d((wsx) this.b);
                break;
            case 13:
                gsk gskVar = (gsk) obj;
                String str = gskVar.a;
                aqen aqenVar = (aqen) this.b;
                if (TextUtils.equals(str, aqenVar.c)) {
                    Object obj4 = this.a;
                    if (!gskVar.c) {
                        ((iyr) obj4).c(!gskVar.b);
                    } else {
                        boolean z3 = aqenVar.g;
                        boolean z4 = gskVar.b;
                        if (z3 != z4) {
                            ((iyr) obj4).c(z4);
                        }
                    }
                }
                break;
            case 14:
                weh wehVar = ((weo) obj).c;
                boolean z5 = wehVar instanceof ajwk;
                Object obj5 = this.a;
                Object obj6 = this.b;
                if (!z5) {
                    jav javVar = (jav) obj5;
                    ExtendedFloatingActionButton extendedFloatingActionButton = javVar.f;
                    ajnf ajnfVar = (ajnf) obj6;
                    if ((ajnfVar.b & SemanticState.Multiline) != 0 && (ajwoVar = ajnfVar.s) == null) {
                        ajwoVar = ajwo.a;
                    }
                    javVar.q(extendedFloatingActionButton, ajwoVar, ajnfVar);
                } else {
                    jav javVar2 = (jav) obj5;
                    javVar2.q(javVar2.f, ((ajwk) wehVar).getCommand(), (ajnf) obj6);
                }
                break;
            case 15:
                if (!((Boolean) obj).booleanValue()) {
                    ChipCloudChipView chipCloudChipView = ((jbo) this.a).a;
                    aedf aedfVar = chipCloudChipView.d;
                    if (aedfVar != null) {
                        aedfVar.b();
                        aedfVar.setVisible(false, false);
                    } else {
                        ChipCloudChipLoadingIndicator chipCloudChipLoadingIndicator = chipCloudChipView.e;
                        ValueAnimator valueAnimator = chipCloudChipLoadingIndicator.e;
                        if (valueAnimator != null) {
                            valueAnimator.end();
                            chipCloudChipLoadingIndicator.e.removeAllUpdateListeners();
                            chipCloudChipLoadingIndicator.e = null;
                        }
                        chipCloudChipLoadingIndicator.setVisibility(8);
                    }
                    this.b.run();
                }
                break;
            case 16:
                Object[] objArr = (Object[]) obj;
                Optional optional = (Optional) objArr[0];
                Optional optional2 = (Optional) objArr[1];
                Optional optional3 = (Optional) objArr[2];
                Optional optional4 = (Optional) objArr[3];
                jdf jdfVar = (jdf) this.a;
                if (!jdfVar.m()) {
                    jdfVar.h(optional, optional2, optional3, optional4, false);
                } else {
                    jdfVar.h(optional, optional2, optional3, optional4, !((agke) objArr[4]).contains(kro.aH((String) this.b)));
                }
                break;
            case 17:
                boolean z6 = ((antp) this.b).j;
                int iOrdinal = ((jei) obj).ordinal();
                Object obj7 = this.a;
                if (iOrdinal == 0) {
                    jdx jdxVar = (jdx) obj7;
                    ixt.i(jdxVar.g, jdxVar.c, null, false);
                    View view = jdxVar.e;
                    if (view != null) {
                        ixt.i(jdxVar.g, view, null, false);
                    }
                } else if (iOrdinal == 1) {
                    jdx jdxVar2 = (jdx) obj7;
                    adly adlyVar = jdxVar2.g;
                    RelativeLayout relativeLayout = jdxVar2.c;
                    long[] jArr = {jdxVar2.a.getColor(R.color.ytm_color_black_at_10pct)};
                    aihf aihfVarCreateBuilder2 = anld.a.createBuilder();
                    aihf aihfVarCreateBuilder3 = anlc.a.createBuilder();
                    ahbs ahbsVar = new ahbs(jArr, 0, 1);
                    aihfVarCreateBuilder3.copyOnWrite();
                    anlc anlcVar = (anlc) aihfVarCreateBuilder3.instance;
                    anlcVar.a();
                    aifs.addAll(ahbsVar, anlcVar.b);
                    aihfVarCreateBuilder2.copyOnWrite();
                    anld anldVar4 = (anld) aihfVarCreateBuilder2.instance;
                    anlc anlcVar2 = (anlc) aihfVarCreateBuilder3.build();
                    anlcVar2.getClass();
                    anldVar4.c = anlcVar2;
                    anldVar4.b = 1;
                    ixt.i(adlyVar, relativeLayout, (anld) aihfVarCreateBuilder2.build(), false);
                    View view2 = jdxVar2.e;
                    if (view2 != null) {
                        ixt.i(jdxVar2.g, view2, null, false);
                    }
                } else if (iOrdinal == 2) {
                    if (z6) {
                        jdx jdxVar3 = (jdx) obj7;
                        adly adlyVar2 = jdxVar3.g;
                        RelativeLayout relativeLayout2 = jdxVar3.c;
                        anpz anpzVar = jdxVar3.h;
                        if ((anpzVar.b & 64) != 0) {
                            anldVar2 = anpzVar.h;
                            if (anldVar2 == null) {
                                anldVar2 = anld.a;
                            }
                        } else {
                            anldVar2 = null;
                        }
                        ixt.i(adlyVar2, relativeLayout2, anldVar2, jdxVar3.a.getResources().getConfiguration().getLayoutDirection() == 1);
                    } else {
                        jdx jdxVar4 = (jdx) obj7;
                        adly adlyVar3 = jdxVar4.g;
                        RelativeLayout relativeLayout3 = jdxVar4.c;
                        anpz anpzVar2 = jdxVar4.h;
                        if ((anpzVar2.b & 1) != 0) {
                            anldVar = anpzVar2.c;
                            if (anldVar == null) {
                                anldVar = anld.a;
                            }
                        } else {
                            anldVar = null;
                        }
                        ixt.i(adlyVar3, relativeLayout3, anldVar, false);
                    }
                    jdx jdxVar5 = (jdx) obj7;
                    View view3 = jdxVar5.e;
                    if (view3 != null) {
                        adly adlyVar4 = jdxVar5.g;
                        anpz anpzVar3 = jdxVar5.h;
                        if ((anpzVar3.b & 16) != 0 && (anldVar3 = anpzVar3.g) == null) {
                            anldVar3 = anld.a;
                        }
                        ixt.i(adlyVar4, view3, anldVar3, false);
                    }
                }
                break;
            case 18:
                aazn aaznVar = (aazn) obj;
                hzc hzcVar = (hzc) this.a;
                float fFloatValue = 1.0f;
                if (hzcVar.a().isPresent() && (hzcVar.a().get() instanceof hyw) && ((hyw) hzcVar.a().get()).f().isPresent()) {
                    fFloatValue = ((Float) ((hyw) hzcVar.a().get()).f().get()).floatValue();
                }
                Object obj8 = this.b;
                if (aaznVar.c()) {
                    jej jejVar = (jej) obj8;
                    jejVar.c.kk(jei.c);
                    awku awkuVar = jejVar.d;
                    antp antpVar = jejVar.f;
                    int i = antpVar.c;
                    if (i == 11 || (i == 20 && ((Boolean) antpVar.d).booleanValue())) {
                        z2 = true;
                    }
                    awkuVar.kk(Boolean.valueOf(z2));
                    antp antpVar2 = jejVar.f;
                    if (antpVar2.c == 20 && ((Boolean) antpVar2.d).booleanValue()) {
                        jejVar.g(true, fFloatValue);
                    } else {
                        antp antpVar3 = jejVar.f;
                        int i2 = antpVar3.c;
                        jejVar.d(i2 == 11 ? i2 == 11 ? (alja) antpVar3.d : alja.a : null);
                    }
                } else if (aaznVar.b() || aaznVar.a == 4) {
                    jej jejVar2 = (jej) obj8;
                    jejVar2.c.kk(jei.c);
                    awku awkuVar2 = jejVar2.d;
                    antp antpVar4 = jejVar2.f;
                    int i3 = antpVar4.e;
                    if (i3 != 18 && (i3 != 21 || !((Boolean) antpVar4.f).booleanValue())) {
                        z = false;
                    }
                    awkuVar2.kk(Boolean.valueOf(z));
                    antp antpVar5 = jejVar2.f;
                    if (antpVar5.e == 21 && ((Boolean) antpVar5.f).booleanValue()) {
                        jejVar2.g(false, fFloatValue);
                    } else {
                        antp antpVar6 = jejVar2.f;
                        int i4 = antpVar6.e;
                        jejVar2.d(i4 == 18 ? i4 == 18 ? (alja) antpVar6.f : alja.a : null);
                    }
                } else {
                    ((jej) obj8).f();
                }
                break;
            case 19:
                if (((Boolean) obj).booleanValue()) {
                    byte[] bArr = (byte[]) this.b;
                    if (bArr.length > 0) {
                        ((xhg) this.a).b.w(new xgj(bArr), null);
                    }
                }
                break;
            default:
                Throwable th = (Throwable) obj;
                String str2 = mkh.a;
                this.b.f(aslh.LOG_TYPE_COMMAND_EXECUTION_ERROR, (nsl) this.a, th, "Failed to handle rich content command.", new Object[0]);
                break;
        }
    }

    public /* synthetic */ gkr(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
