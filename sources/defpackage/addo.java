package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.elements.adl.UpbMessageValueUtils;
import com.google.android.libraries.elements.converters.layout.FlowLayoutManager;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class addo implements nrw {
    public final vxe a;
    public final aunn b;
    public final vxz c;
    private final nuc d;
    private final ci e;

    public addo(vxe vxeVar, adbv adbvVar, vxz vxzVar, vxz vxzVar2, ci ciVar, Context context, aunn aunnVar, Optional optional, nuc nucVar) {
        this.a = vxeVar;
        this.e = ciVar;
        this.d = nucVar;
        this.b = aunnVar;
        this.c = vxzVar2;
        if (vxzVar.l(215, 45646579L, false)) {
            return;
        }
        boolean zBooleanValue = ((Boolean) optional.orElse(Boolean.FALSE)).booleanValue();
        adce adceVarA = adbvVar.a();
        atot atotVar = atot.a;
        fna.b = atotVar.c;
        fna.i = atotVar.d;
        fna.c = atotVar.e;
        if (!vxzVar.l(215, 45646579L, false)) {
            int iA = fnc.a();
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            long j = 0;
            if (activityManager != null) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                try {
                    activityManager.getMemoryInfo(memoryInfo);
                    j = memoryInfo.totalMem / 1048576;
                } catch (NullPointerException unused) {
                }
            }
            int i = iA > 6 ? 2 : 1;
            if (j > 6144 && iA > 6) {
                i = 3;
            }
            fjf fjfVar = new fjf(i, i, -2);
            fna.Q = fjfVar;
            fle.c = fjfVar;
        }
        fna.p = vxzVar.l(162, 45532131L, false);
        fna.f = false;
        fna.u = vxzVar.l(439, 45787186L, false);
        fna.v = vxzVar.l(450, 45795830L, false);
        fna.L = vxzVar.l(472, 45811748L, false);
        fna.M = vxzVar.l(518, 45841771L, false);
        fna.h = vxzVar.l(221, 45650902L, false);
        adbt adbtVar = (adbt) adceVarA;
        fox.a = adbtVar.e || vxzVar.l(281, 45684364L, false);
        fna.j = adbtVar.g;
        fwc.a = vxzVar.l(2, 45360801L, false);
        fna.t = vxzVar.l(73, 45389455L, false);
        fna.w = zBooleanValue;
        fvn.b = zBooleanValue;
        fna.x = (int) vxzVar.c(23, 45631131L, 0L);
        fna.y = (int) vxzVar.c(24, 45634826L, 0L);
        fna.D = vxzVar.l(181, 45622447L, false);
        fna.E = vxzVar.l(222, 45652204L, false);
        fna.z = (float) vxzVar.a(5, 45670359L, 0.0d);
        fna.A = (float) vxzVar.a(6, 45670360L, 0.0d);
        fna.B = (int) vxzVar.c(37, 45673320L, 0L);
        fna.F = vxzVar.l(288, 45687340L, false);
        fna.G = vxzVar.l(305, 45706461L, false);
        fna.H = vxzVar.l(309, 45708674L, false);
        fna.J = vxzVar.l(458, 45799063L, false);
        fna.I = vxzVar.l(448, 45795775L, false);
        fna.K = vxzVar.l(468, 45807884L, false);
        fna.N = vxzVar.l(498, 45828375L, false);
        fna.O = vxzVar.l(531, 45852816L, false);
        if (vxzVar.l(308, 45707128L, false)) {
            UpbMessageValueUtils.jniSetUseZeroCopyDirectBuffers(true);
        }
        if (vxzVar.l(376, 45743441L, false)) {
            UpbMessageValueUtils.a = true;
        }
        FlowLayoutManager.a = vxzVar.l(412, 45771860L, false);
        FlowLayoutManager.b = vxzVar.l(416, 45774140L, false);
        FlowLayoutManager.c = vxzVar.l(418, 45776197L, false);
        FlowLayoutManager.d = vxzVar.l(419, 45777259L, false);
        FlowLayoutManager.e = vxzVar.l(422, 45778183L, false);
        FlowLayoutManager.f = vxzVar.l(394, 45763000L, false);
        FlowLayoutManager.g = vxzVar.l(442, 45788981L, false);
        FlowLayoutManager.j = vxzVar.l(425, 45781115L, false);
        FlowLayoutManager.k = vxzVar.l(428, 45782308L, false);
        FlowLayoutManager.l = vxzVar.l(435, 45784701L, false);
        FlowLayoutManager.i = vxzVar.l(436, 45784754L, false);
        FlowLayoutManager.p = vxzVar.l(460, 45799402L, false);
        FlowLayoutManager.m = vxzVar.l(462, 45802384L, false);
        FlowLayoutManager.o = vxzVar.l(478, 45817358L, false);
        FlowLayoutManager.n = vxzVar.l(479, 45817359L, false);
        FlowLayoutManager.q = vxzVar.l(474, 45816905L, false);
        FlowLayoutManager.t = vxzVar.l(481, 45819304L, false);
        FlowLayoutManager.r = vxzVar.l(487, 45824779L, false);
        FlowLayoutManager.h = vxzVar.l(497, 45828360L, false);
        FlowLayoutManager.s = vxzVar.l(508, 45833509L, false);
        FlowLayoutManager.u = vxzVar.l(521, 45847465L, false);
        FlowLayoutManager.v = vxzVar.l(540, 45857380L, false);
    }

    private static View d(View view) {
        if (view.getTag(R.id.elements_image) instanceof asnm) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View viewD = d(viewGroup.getChildAt(i));
                if (viewD != null) {
                    return viewD;
                }
            }
        }
        return null;
    }

    @Override // defpackage.nrx
    public final aigw a() {
        return almz.a;
    }

    @Override // defpackage.nrx
    public final aslz b() {
        return a.r();
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0229  */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.nrw
    public final /* synthetic */ avlb c(Object obj, nrv nrvVar) {
        int i;
        int i2;
        nuc nucVar;
        asnu asnuVarD;
        int iA;
        int iAbs;
        View viewD;
        aqmh aqmhVar;
        Object obj2;
        ajwo ajwoVar = (ajwo) obj;
        View viewB = nrvVar.b();
        HashMap map = new HashMap();
        Object obj3 = nrvVar.d;
        if ((obj3 instanceof adaq) && (obj2 = ((adaq) obj3).a) != null) {
            map.put("com.google.android.libraries.youtube.innertube.endpoint.tag", obj2);
        }
        if (viewB != null) {
            map.put("com.google.android.libraries.youtube.rendering.elements.sender_view", viewB);
            if (nrvVar.m != -1 && this.c.l(410, 45834423L, false)) {
                SenderStateOuterClass$SenderState senderStateOuterClass$SenderState = nrvVar.f;
                if (senderStateOuterClass$SenderState != null) {
                    aihl aihlVar = asme.b;
                    aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
                    senderStateOuterClass$SenderState.c(aihlVarCheckIsLite);
                    if (senderStateOuterClass$SenderState.j.n(aihlVarCheckIsLite.d)) {
                        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                        senderStateOuterClass$SenderState.c(aihlVarCheckIsLite2);
                        Object objK = senderStateOuterClass$SenderState.j.k(aihlVarCheckIsLite2.d);
                        String str = ((asme) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).c;
                        if (!TextUtils.isEmpty(str)) {
                            map.put("com.google.android.libraries.youtube.rendering.elements.sender_continuity_key", str);
                            ((mfu) this.b.io()).b(viewB);
                        }
                    }
                }
            } else if (this.c.l(335, 45780147L, false)) {
                int i3 = bac.a;
                String transitionName = viewB.getTransitionName();
                if (transitionName != null && transitionName.startsWith("source-")) {
                    ((mfu) this.b.io()).a(viewB);
                }
            }
        }
        aihh aihhVar = (aihh) ajwoVar.toBuilder();
        if (viewB != null && aihhVar.c(arik.a) && (viewD = d(viewB)) != null) {
            map.put("VideoPresenterConstants.VIDEO_THUMBNAIL_VIEW_KEY", viewD);
            Object tag = viewD.getTag(R.id.elements_image);
            if (tag instanceof asnm) {
                aihh aihhVar2 = (aihh) aqmh.a.createBuilder();
                for (asno asnoVar : ((asnm) tag).c) {
                    aihf aihfVarCreateBuilder = aqmg.a.createBuilder();
                    String str2 = "";
                    String str3 = true != (asnoVar.c == 1 ? (String) asnoVar.d : "").startsWith("//") ? "" : "https:";
                    if (asnoVar.c == 1) {
                        str2 = (String) asnoVar.d;
                    }
                    String strConcat = str3.concat(String.valueOf(str2));
                    aihfVarCreateBuilder.copyOnWrite();
                    aqmg aqmgVar = (aqmg) aihfVarCreateBuilder.instance;
                    aqmgVar.b |= 1;
                    aqmgVar.c = strConcat;
                    int i4 = asnoVar.e;
                    aihfVarCreateBuilder.copyOnWrite();
                    aqmg aqmgVar2 = (aqmg) aihfVarCreateBuilder.instance;
                    aqmgVar2.b |= 2;
                    aqmgVar2.d = i4;
                    int i5 = asnoVar.f;
                    aihfVarCreateBuilder.copyOnWrite();
                    aqmg aqmgVar3 = (aqmg) aihfVarCreateBuilder.instance;
                    aqmgVar3.b |= 4;
                    aqmgVar3.e = i5;
                    aihhVar2.x(aihfVarCreateBuilder);
                }
                aqmhVar = (aqmh) aihhVar2.build();
            } else {
                aqmhVar = null;
            }
            if (aqmhVar != null) {
                map.put("VideoPresenterConstants.VIDEO_THUMBNAIL_DETAILS_KEY", aqmhVar);
            }
        }
        if (viewB != null) {
            for (ViewParent parent = viewB.getParent(); parent instanceof View; parent = parent.getParent()) {
                Map map2 = (Map) ((View) parent).getTag(R.id.elements_navigation_args);
                if (map2 != null) {
                    map.putAll(map2);
                    break;
                }
            }
        }
        ntq ntqVar = nrvVar.g;
        if (ntqVar instanceof adau) {
            String strI = ((adau) ntqVar).a.i();
            aihl aihlVar2 = appx.b;
            aihf builder = aihhVar.c(aihlVar2) ? ((appw) aihhVar.b(aihlVar2)).toBuilder() : appw.a.createBuilder();
            builder.copyOnWrite();
            appw appwVar = (appw) builder.instance;
            strI.getClass();
            appwVar.b |= 1;
            appwVar.c = strI;
            aihhVar.e(aihlVar2, (appw) builder.build());
        }
        nuc nucVar2 = this.d;
        nsl nslVar = nrvVar.i;
        if (nslVar == null || nslVar.i() == null) {
            agfr agfrVar = nrvVar.k;
            if (agfrVar != null) {
                adfs adfsVar = (adfs) agfrVar.io();
                if (adfsVar instanceof adfs) {
                    int i6 = nrvVar.n;
                    if (i6 == -1) {
                        i6 = nrvVar.m;
                    }
                    if (i6 != -1) {
                        SparseArray sparseArray = nrvVar.l;
                        String strI2 = adfsVar.a.i();
                        if (strI2 != null) {
                            aihl aihlVar3 = appx.b;
                            aihf builder2 = aihhVar.c(aihlVar3) ? ((appw) aihhVar.b(aihlVar3)).toBuilder() : appw.a.createBuilder();
                            builder2.copyOnWrite();
                            i = 2;
                            appw appwVar2 = (appw) builder2.instance;
                            i2 = 1;
                            appwVar2.b |= 1;
                            appwVar2.c = strI2;
                            aihhVar.e(aihlVar3, (appw) builder2.build());
                        } else {
                            i = 2;
                            i2 = 1;
                            nuc nucVar3 = adfsVar.b;
                            if (nucVar3 != null) {
                                nucVar3.a(aslh.LOG_TYPE_COMMAND_EXECUTION_ERROR, "Failed to decorate service endpoint because CSN is null", new Object[0]);
                            }
                        }
                        xgz xgzVarD = adfsVar.d(i6, sparseArray);
                        if (xgzVarD != null) {
                            int i7 = xgzVarD.c().d;
                            if (i7 > 0) {
                                int i8 = xgzVarD.c().f;
                                aecm.B(aihhVar, i7, i8);
                                aihl aihlVar4 = appx.b;
                                aihf builder3 = aihhVar.c(aihlVar4) ? ((appw) aihhVar.b(aihlVar4)).toBuilder() : appw.a.createBuilder();
                                aihf aihfVarCreateBuilder2 = argn.a.createBuilder();
                                aihfVarCreateBuilder2.copyOnWrite();
                                argn argnVar = (argn) aihfVarCreateBuilder2.instance;
                                argnVar.b |= 2;
                                argnVar.d = i7;
                                aihfVarCreateBuilder2.copyOnWrite();
                                argn argnVar2 = (argn) aihfVarCreateBuilder2.instance;
                                argnVar2.b |= 8;
                                argnVar2.f = i8;
                                argn argnVar3 = (argn) aihfVarCreateBuilder2.build();
                                builder3.copyOnWrite();
                                appw appwVar3 = (appw) builder3.instance;
                                argnVar3.getClass();
                                appwVar3.d = argnVar3;
                                appwVar3.b |= 2;
                                aihhVar.e(aihlVar4, (appw) builder3.build());
                            } else if (i7 == -1 && (nucVar = adfsVar.b) != null) {
                                aslh aslhVar = aslh.LOG_TYPE_COMMAND_EXECUTION_ERROR;
                                Object[] objArr = new Object[i2];
                                objArr[0] = Integer.valueOf(i6);
                                nucVar.a(aslhVar, "Failed to decorate command because veType was invalid for nodeId: %d", objArr);
                            }
                        }
                    } else {
                        i = 2;
                        nucVar2.a(aslh.LOG_TYPE_COMMAND_EXECUTION_ERROR, "Failed to decorate command because RenderNext nodeId and viewKey are invalid (-1)", new Object[0]);
                    }
                } else {
                    i = 2;
                    if (adfsVar == null) {
                        nucVar2.a(aslh.LOG_TYPE_COMMAND_EXECUTION_ERROR, "Failed to decorate command because RenderNext ElementsInteractionLogger is null", new Object[0]);
                    } else {
                        nucVar2.a(aslh.LOG_TYPE_COMMAND_EXECUTION_ERROR, "Failed to decorate command because RenderNext ElementsInteractionLogger is of unexpected type: %s", adfsVar.getClass().getName());
                    }
                }
            } else {
                i = 2;
                if (nslVar != null && !nslVar.equals(nsl.a)) {
                    nucVar2.c(aslh.LOG_TYPE_COMMAND_EXECUTION_ERROR, nslVar, "Failed to decorate command because ElementsInteractionLogger is null in ConversionContext", new Object[0]);
                }
            }
        } else {
            asnu asnuVarD2 = nslVar.d();
            if (asnuVarD2 != null && (iA = adfx.a(asnuVarD2)) != -1) {
                if (adfx.f(asnuVarD2)) {
                    asnw asnwVar = asnuVarD2.c;
                    if (asnwVar == null) {
                        asnwVar = asnw.a;
                    }
                    aihl aihlVarCheckIsLite3 = aihn.checkIsLite(arns.b);
                    asnwVar.c(aihlVarCheckIsLite3);
                    Object objK2 = asnwVar.j.k(aihlVarCheckIsLite3.d);
                    amud amudVar = ((arns) (objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2))).e;
                    if (amudVar == null) {
                        amudVar = amud.b;
                    }
                    ajuz ajuzVar = amudVar.h;
                    if (ajuzVar == null) {
                        ajuzVar = ajuz.a;
                    }
                    if ((ajuzVar.b & 2) != 0) {
                        amud amudVar2 = adfx.d(asnuVarD2).e;
                        if (amudVar2 == null) {
                            amudVar2 = amud.b;
                        }
                        ajuz ajuzVar2 = amudVar2.h;
                        if (ajuzVar2 == null) {
                            ajuzVar2 = ajuz.a;
                        }
                        iAbs = ajuzVar2.d;
                    } else {
                        iAbs = Math.abs(asnuVarD2.d);
                    }
                } else {
                    iAbs = Math.abs(asnuVarD2.d);
                }
                aecm.B(aihhVar, iA, iAbs);
            }
            i = 2;
        }
        if (nslVar != null && (asnuVarD = nslVar.d()) != null) {
            asnw asnwVar2 = asnuVarD.c;
            if (asnwVar2 == null) {
                asnwVar2 = asnw.a;
            }
            aihl aihlVar5 = arns.b;
            aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aihlVar5);
            asnwVar2.c(aihlVarCheckIsLite4);
            if (asnwVar2.j.n(aihlVarCheckIsLite4.d)) {
                asnw asnwVar3 = asnuVarD.c;
                if (asnwVar3 == null) {
                    asnwVar3 = asnw.a;
                }
                aihl aihlVarCheckIsLite5 = aihn.checkIsLite(aihlVar5);
                asnwVar3.c(aihlVarCheckIsLite5);
                Object objK3 = asnwVar3.j.k(aihlVarCheckIsLite5.d);
                arns arnsVar = (arns) (objK3 == null ? aihlVarCheckIsLite5.b : aihlVarCheckIsLite5.c(objK3));
                amud amudVar3 = arnsVar.e;
                if (amudVar3 == null) {
                    amudVar3 = amud.b;
                }
                if ((amudVar3.c & 8) != 0) {
                    aihf aihfVarCreateBuilder3 = argn.a.createBuilder();
                    amud amudVar4 = arnsVar.e;
                    if (amudVar4 == null) {
                        amudVar4 = amud.b;
                    }
                    ajuz ajuzVar3 = amudVar4.h;
                    if (ajuzVar3 == null) {
                        ajuzVar3 = ajuz.a;
                    }
                    aoar aoarVar = (aoar) aihhVar.b(aoaq.b);
                    int i9 = ajuzVar3.b & 1;
                    int i10 = aoarVar.b & 4;
                    if (i9 != 0 && i10 != 0) {
                        int i11 = ajuzVar3.c;
                        aihfVarCreateBuilder3.copyOnWrite();
                        argn argnVar4 = (argn) aihfVarCreateBuilder3.instance;
                        argnVar4.b |= 2;
                        argnVar4.d = i11;
                        int i12 = aoarVar.e;
                        aihfVarCreateBuilder3.copyOnWrite();
                        argn argnVar5 = (argn) aihfVarCreateBuilder3.instance;
                        argnVar5.b |= 8;
                        argnVar5.f = i12;
                        aihl aihlVar6 = appx.b;
                        aihf builder4 = aihhVar.c(aihlVar6) ? ((appw) aihhVar.b(aihlVar6)).toBuilder() : appw.a.createBuilder();
                        argn argnVar6 = (argn) aihfVarCreateBuilder3.build();
                        builder4.copyOnWrite();
                        appw appwVar4 = (appw) builder4.instance;
                        argnVar6.getClass();
                        appwVar4.d = argnVar6;
                        appwVar4.b |= 2;
                        aihhVar.e(aihlVar6, (appw) builder4.build());
                    }
                }
            }
        }
        nwf nwfVarF = nrvVar.f();
        ajwp ajwpVar = ((ajwo) aihhVar.instance).e;
        if (ajwpVar == null) {
            ajwpVar = ajwp.a;
        }
        aihh aihhVar3 = (aihh) ajwpVar.toBuilder();
        nxg nxgVar = nwfVarF.a;
        if (viewB != null && nxgVar != null) {
            float f = viewB.getResources().getDisplayMetrics().density;
            if (f != 0.0f) {
                int[] iArr = new int[i];
                viewB.getLocationOnScreen(iArr);
                aihf aihfVarCreateBuilder4 = amcy.a.createBuilder();
                float f2 = nxgVar.a / f;
                aihfVarCreateBuilder4.copyOnWrite();
                amcy amcyVar = (amcy) aihfVarCreateBuilder4.instance;
                amcyVar.c |= 1;
                amcyVar.d = (int) f2;
                float f3 = nxgVar.b / f;
                aihfVarCreateBuilder4.copyOnWrite();
                amcy amcyVar2 = (amcy) aihfVarCreateBuilder4.instance;
                amcyVar2.c |= 2;
                amcyVar2.e = (int) f3;
                float measuredWidth = viewB.getMeasuredWidth() / f;
                aihfVarCreateBuilder4.copyOnWrite();
                amcy amcyVar3 = (amcy) aihfVarCreateBuilder4.instance;
                amcyVar3.c |= 4;
                amcyVar3.f = (int) measuredWidth;
                float measuredHeight = viewB.getMeasuredHeight() / f;
                aihfVarCreateBuilder4.copyOnWrite();
                amcy amcyVar4 = (amcy) aihfVarCreateBuilder4.instance;
                amcyVar4.c |= 8;
                amcyVar4.g = (int) measuredHeight;
                float f4 = iArr[0] / f;
                aihfVarCreateBuilder4.copyOnWrite();
                amcy amcyVar5 = (amcy) aihfVarCreateBuilder4.instance;
                amcyVar5.c |= SemanticState.Hidden;
                amcyVar5.l = (int) f4;
                float f5 = iArr[1] / f;
                aihfVarCreateBuilder4.copyOnWrite();
                amcy amcyVar6 = (amcy) aihfVarCreateBuilder4.instance;
                amcyVar6.c |= SemanticState.LiveRegion;
                amcyVar6.m = (int) f5;
                int i13 = viewB.getResources().getConfiguration().orientation;
                if (i13 == 1) {
                    aihfVarCreateBuilder4.copyOnWrite();
                    amcy amcyVar7 = (amcy) aihfVarCreateBuilder4.instance;
                    amcyVar7.n = 1;
                    amcyVar7.c |= SemanticState.Modal;
                } else if (i13 == 2) {
                    aihfVarCreateBuilder4.copyOnWrite();
                    amcy amcyVar8 = (amcy) aihfVarCreateBuilder4.instance;
                    amcyVar8.n = 5;
                    amcyVar8.c |= SemanticState.Modal;
                } else if (i13 != 3) {
                    aihfVarCreateBuilder4.copyOnWrite();
                    amcy amcyVar9 = (amcy) aihfVarCreateBuilder4.instance;
                    amcyVar9.n = 0;
                    amcyVar9.c |= SemanticState.Modal;
                } else {
                    aihfVarCreateBuilder4.copyOnWrite();
                    amcy amcyVar10 = (amcy) aihfVarCreateBuilder4.instance;
                    amcyVar10.n = 6;
                    amcyVar10.c |= SemanticState.Modal;
                }
                while (viewB != null && !(viewB instanceof fjw) && !(viewB instanceof ooy)) {
                    ViewParent parent2 = viewB.getParent();
                    viewB = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
                }
                if ((viewB instanceof fjw) || (viewB instanceof ooy)) {
                    int[] iArr2 = new int[2];
                    viewB.getLocationOnScreen(iArr2);
                    float measuredWidth2 = viewB.getMeasuredWidth() / f;
                    aihfVarCreateBuilder4.copyOnWrite();
                    amcy amcyVar11 = (amcy) aihfVarCreateBuilder4.instance;
                    amcyVar11.c |= 64;
                    amcyVar11.j = (int) measuredWidth2;
                    float measuredHeight2 = viewB.getMeasuredHeight() / f;
                    aihfVarCreateBuilder4.copyOnWrite();
                    amcy amcyVar12 = (amcy) aihfVarCreateBuilder4.instance;
                    amcyVar12.c |= SemanticState.Focused;
                    amcyVar12.k = (int) measuredHeight2;
                    float f6 = (iArr[0] - iArr2[0]) / f;
                    aihfVarCreateBuilder4.copyOnWrite();
                    amcy amcyVar13 = (amcy) aihfVarCreateBuilder4.instance;
                    amcyVar13.c |= 16;
                    amcyVar13.h = (int) f6;
                    float f7 = (iArr[1] - iArr2[1]) / f;
                    aihfVarCreateBuilder4.copyOnWrite();
                    amcy amcyVar14 = (amcy) aihfVarCreateBuilder4.instance;
                    amcyVar14.c |= 32;
                    amcyVar14.i = (int) f7;
                }
                aihhVar3.e(amcy.b, (amcy) aihfVarCreateBuilder4.build());
            }
        }
        Object obj4 = nwfVarF.b;
        amdd amddVar = obj4 instanceof adaq ? ((adaq) obj4).b : null;
        if (amddVar == null) {
            aihl aihlVar7 = amdx.a;
            if (aihhVar3.c(aihlVar7)) {
                amddVar = (amdd) aihhVar3.b(aihlVar7);
            }
        }
        aihl aihlVar8 = amcy.b;
        amcy amcyVar15 = aihhVar3.c(aihlVar8) ? (amcy) aihhVar3.b(aihlVar8) : null;
        if (amddVar != null || amcyVar15 != null) {
            if (amcyVar15 != null) {
                aihf builder5 = amddVar != null ? amddVar.toBuilder() : amdd.a.createBuilder();
                builder5.copyOnWrite();
                amdd amddVar2 = (amdd) builder5.instance;
                amddVar2.r = amcyVar15;
                amddVar2.c |= SemanticState.Multiline;
                amddVar = (amdd) builder5.build();
            }
            if (amddVar != null) {
                aihhVar3.e(amdx.a, amddVar);
            }
        }
        ajwp ajwpVar2 = (ajwp) aihhVar3.build();
        aihhVar.copyOnWrite();
        ajwo ajwoVar2 = (ajwo) aihhVar.instance;
        ajwpVar2.getClass();
        ajwoVar2.e = ajwpVar2;
        ajwoVar2.b |= 2;
        agev agevVarA = aecm.A(nrvVar.f());
        if (agevVarA.g()) {
            map.put("com.google.android.libraries.youtube.logging.interaction_logger", agevVarA.c());
        }
        ci ciVar = this.e;
        MotionEvent motionEvent = nrvVar.j;
        if (motionEvent != null) {
            String string = UUID.randomUUID().toString();
            ciVar.a.put(string, motionEvent);
            ajwp ajwpVar3 = ((ajwo) aihhVar.instance).e;
            if (ajwpVar3 == null) {
                ajwpVar3 = ajwp.a;
            }
            aihh aihhVar4 = (aihh) ajwpVar3.toBuilder();
            aihl aihlVar9 = aniz.b;
            aihf aihfVarCreateBuilder5 = aniz.a.createBuilder();
            aihfVarCreateBuilder5.copyOnWrite();
            aniz anizVar = (aniz) aihfVarCreateBuilder5.instance;
            string.getClass();
            anizVar.c |= 1;
            anizVar.d = string;
            aihhVar4.e(aihlVar9, (aniz) aihfVarCreateBuilder5.build());
            ajwp ajwpVar4 = (ajwp) aihhVar4.build();
            aihhVar.copyOnWrite();
            ajwo ajwoVar3 = (ajwo) aihhVar.instance;
            ajwpVar4.getClass();
            ajwoVar3.e = ajwpVar4;
            ajwoVar3.b |= 2;
        }
        return avlb.g(new wbs(this, map, nrvVar, aihhVar, 2));
    }

    @Override // defpackage.nrw
    public final /* synthetic */ avlb e(mew mewVar, nrv nrvVar) {
        return nqw.a(this, mewVar, nrvVar);
    }
}
