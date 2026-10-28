package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import app.rive.semantics.SemanticState;
import j$.util.Collection;
import j$.util.Optional;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class dzx implements aqk {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dzx(awuz awuzVar, int i) {
        this.$cid = i;
        this.b = awuzVar;
        this.a = "Deferred.asListenableFuture";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r11v12, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v2, types: [awuz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r4v10, types: [adxv] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.view.ViewGroup] */
    @Override // defpackage.aqk
    public final Object a(final aqi aqiVar) {
        ?? r4;
        Object obj;
        int i = 9;
        int i2 = 2;
        final int i3 = 1;
        ?? r5 = 0;
        final int iIndexOfChild = 0;
        switch (this.$cid) {
            case 0:
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                aqiVar.a(new dxk(atomicBoolean, i2), dyu.INSTANCE);
                this.a.execute(new bf(atomicBoolean, aqiVar, this.b, 17, (char[]) null));
                return awmy.a;
            case 1:
                ?? r11 = this.b;
                r11.kJ(new apm(aqiVar, r11, 4, r5));
                return this.a;
            case 2:
                rht rhtVar = (rht) this.a;
                rhj rhjVar = new rhj(rhtVar, aqiVar, i3);
                ?? r10 = this.b;
                rhtVar.d.d((agke) Collection.EL.stream(r10).flatMap(new rcs(17)).collect(aghu.a), new attj(rhtVar, (agke) r10, rhjVar, i3));
                return "XenoEffectTextureProcessor.setEffect()";
            case 3:
                ((uql) this.b).m.K((Bitmap) this.a, new vbs() { // from class: uqi
                    @Override // defpackage.vbs
                    public final void a(vbu vbuVar) {
                        aqiVar.b(vbuVar);
                    }
                });
                return "Saving text sticker bitmap to file as StickerAsset";
            case 4:
                final vjj vjjVar = (vjj) this.b;
                View viewI = vjjVar.i();
                if (viewI == null) {
                    Log.e(vjj.c, "Unable to get the preview view to generate sticker model");
                    aqiVar.b(Boolean.FALSE);
                    return "addStickerToVideoEffect failed";
                }
                ViewGroup.LayoutParams layoutParams = viewI.getLayoutParams();
                layoutParams.getClass();
                ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(layoutParams);
                ViewParent parent = viewI.getParent();
                if (parent != null && !(parent instanceof ViewGroup)) {
                    Log.e(vjj.c, "Expected a parent that is type ViewGroup");
                    aqiVar.b(Boolean.FALSE);
                    return "addStickerToVideoEffect failed";
                }
                Object obj2 = this.a;
                if (viewI.getMeasuredWidth() == 0 || viewI.getMeasuredHeight() == 0) {
                    if (obj2 != null) {
                        Rect rect = (Rect) obj2;
                        viewI.measure(View.MeasureSpec.makeMeasureSpec(rect.width(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(rect.height(), Integer.MIN_VALUE));
                        viewI.layout(0, 0, viewI.getMeasuredWidth(), viewI.getMeasuredHeight());
                    } else {
                        Log.e(vjj.c, "Unable to layout the view!");
                    }
                }
                final Rect rectFd = yno.fd(viewI);
                if (parent != null) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    iIndexOfChild = viewGroup.indexOfChild(viewI);
                    viewGroup.removeView(viewI);
                    r5 = viewGroup;
                }
                Activity activity = vjjVar.d;
                Bitmap bitmapFu = yno.fu(activity, viewI);
                if (r5 != 0) {
                    r5.addView(viewI, iIndexOfChild, layoutParams2);
                } else {
                    viewI.setLayoutParams(layoutParams2);
                }
                zf zfVar = vjjVar.f;
                jrr jrrVar = (jrr) vjjVar.j().toBuilder();
                jrrVar.copyOnWrite();
                augy augyVar = (augy) jrrVar.instance;
                augyVar.b &= -2;
                augyVar.e = 0L;
                final Rect rect2 = (Rect) obj2;
                yno.fI(activity, zfVar, bitmapFu, jrrVar, new vih() { // from class: vji
                    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
                    @Override // defpackage.vih
                    public final void a(jrr jrrVar2, vbu vbuVar) {
                        Rect rect3;
                        aimy aimyVar;
                        float f;
                        int i4 = ((augy) jrrVar2.instance).b & SemanticState.Modal;
                        vjj vjjVar2 = vjjVar;
                        int i5 = 2;
                        if (i4 != 0 || (rect3 = rect2) == null) {
                            i5 = 2;
                        } else {
                            augy augyVarJ = vjjVar2.j();
                            augyVarJ.getClass();
                            auhv auhvVar = augyVarJ.c == 107 ? (auhv) augyVarJ.d : auhv.a;
                            ameh amehVar = (auhvVar.c == 2 ? (auih) auhvVar.d : auih.a).e;
                            if (amehVar == null) {
                                amehVar = ameh.a;
                            }
                            Rect rect4 = rectFd;
                            xpl xplVar = vjjVar2.g;
                            amehVar.getClass();
                            if ((amehVar.c & SemanticState.LiveRegion) != 0) {
                                aqcy aqcyVar = amehVar.i;
                                if (aqcyVar == null) {
                                    aqcyVar = aqcy.a;
                                }
                                if ((aqcyVar.b & 8) != 0) {
                                    f = aqcyVar.f;
                                    if (f <= 0.0f || f > 1.0f) {
                                        f = 1.0f;
                                    }
                                } else {
                                    f = 1.0f;
                                }
                                float degrees = (float) Math.toDegrees(aqcyVar.e);
                                float f2 = aqcyVar.c;
                                float f3 = aqcyVar.d;
                                ahno.G(f2 >= 0.0f && f2 <= 1.0f, "translateX must be between 0.0 and 1.0");
                                ahno.G(f3 >= r15 && f3 <= 1.0f, "translateY must be between 0.0 and 1.0");
                                ahno.G(f >= 0 && yno.G(f), "serverScaleMultiplier must be non-negative and finite");
                                ahno.F(rect3.width() > 0 && rect3.height() > 0);
                                PointF pointFGI = yno.gI(rect3, rect4, xplVar);
                                Matrix matrix = new Matrix();
                                float f4 = pointFGI.x;
                                float f5 = pointFGI.y;
                                if (xplVar.o()) {
                                    f4 *= f;
                                    f5 *= f;
                                }
                                matrix.postScale(f4, f5, 0.5f, 0.5f);
                                matrix.postRotate(degrees, 0.5f, 0.5f);
                                matrix.postTranslate(f2 - 0.5f, f3 - 0.5f);
                                float[] fArr = new float[9];
                                matrix.getValues(fArr);
                                aihf aihfVarCreateBuilder = aimy.a.createBuilder();
                                aihfVarCreateBuilder.copyOnWrite();
                                aimy aimyVar2 = (aimy) aihfVarCreateBuilder.instance;
                                aimyVar2.b |= 1;
                                aimyVar2.c = 3;
                                aihfVarCreateBuilder.copyOnWrite();
                                aimy aimyVar3 = (aimy) aihfVarCreateBuilder.instance;
                                aimyVar3.b |= 2;
                                aimyVar3.d = 3;
                                aihfVarCreateBuilder.copyOnWrite();
                                aimy aimyVar4 = (aimy) aihfVarCreateBuilder.instance;
                                aimyVar4.f = 1;
                                aimyVar4.b |= 4;
                                for (int i6 = 0; i6 < 9; i6++) {
                                    aihfVarCreateBuilder.aA(fArr[i6]);
                                }
                                aimyVar = (aimy) aihfVarCreateBuilder.build();
                            } else {
                                if (xplVar.n()) {
                                    ahno.F(rect3.width() > 0 && rect3.height() > 0);
                                }
                                PointF pointFGI2 = yno.gI(rect3, rect4, xplVar);
                                Matrix matrix2 = new Matrix();
                                matrix2.preScale(pointFGI2.x, pointFGI2.y, 0.5f, 0.5f);
                                float[] fArr2 = new float[9];
                                matrix2.getValues(fArr2);
                                aihf aihfVarCreateBuilder2 = aimy.a.createBuilder();
                                aihfVarCreateBuilder2.copyOnWrite();
                                aimy aimyVar5 = (aimy) aihfVarCreateBuilder2.instance;
                                aimyVar5.b |= 1;
                                aimyVar5.c = 3;
                                aihfVarCreateBuilder2.copyOnWrite();
                                aimy aimyVar6 = (aimy) aihfVarCreateBuilder2.instance;
                                aimyVar6.b |= 2;
                                aimyVar6.d = 3;
                                aihfVarCreateBuilder2.copyOnWrite();
                                aimy aimyVar7 = (aimy) aihfVarCreateBuilder2.instance;
                                aimyVar7.f = 1;
                                aimyVar7.b |= 4;
                                for (int i7 = 0; i7 < 9; i7++) {
                                    aihfVarCreateBuilder2.aA(fArr2[i7]);
                                }
                                aimyVar = (aimy) aihfVarCreateBuilder2.build();
                            }
                            jrrVar2.copyOnWrite();
                            augy augyVar2 = (augy) jrrVar2.instance;
                            aimyVar.getClass();
                            augyVar2.q = aimyVar;
                            augyVar2.b |= SemanticState.Modal;
                        }
                        augy augyVar3 = (augy) jrrVar2.build();
                        uxk uxkVar = new uxk(augyVar3);
                        Optional.empty();
                        vjw.a(augyVar3);
                        augy augyVar4 = uxkVar.a;
                        auhv auhvVar2 = augyVar4.c == 107 ? (auhv) augyVar4.d : auhv.a;
                        ameh amehVar2 = (auhvVar2.c == i5 ? (auih) auhvVar2.d : auih.a).e;
                        if (amehVar2 == null) {
                            amehVar2 = ameh.a;
                        }
                        if (amehVar2.h) {
                            aihf aihfVarCreateBuilder3 = aufp.a.createBuilder();
                            aihfVarCreateBuilder3.copyOnWrite();
                            aufp aufpVar = (aufp) aihfVarCreateBuilder3.instance;
                            aufpVar.b |= 1;
                            aufpVar.c = true;
                            Optional.of((aufp) aihfVarCreateBuilder3.build());
                        } else {
                            Optional.empty();
                        }
                        aqi aqiVar2 = aqiVar;
                        vjjVar2.e.isPresent();
                        aqiVar2.b(Boolean.TRUE);
                    }
                });
                return "addStickerToVideoEffect success";
            case 5:
                ((Executor) ((elq) this.a).a.io()).execute(afwl.i(new zgc(this.b, aqiVar, 5, r5)));
                return "ThreadManager.ensureMainThreadExecution";
            case 6:
                Object obj3 = this.b;
                acur acurVar = (acur) this.a;
                ajwo ajwoVar = (ajwo) obj3;
                acurVar.a.k(ajwoVar, new acuq(acurVar, ajwoVar, aqiVar), zzd.a);
                return "prefetchReelNonVideoItemFuture";
            case 7:
                adeo adeoVar = (adeo) this.a;
                Optional optional = adeoVar.f;
                Optional optional2 = adeoVar.e;
                adeoVar.g.execute(new adem((byte[]) this.b, adeoVar.a, adeoVar.b, adeoVar.c, adeoVar.d, optional2, optional, aqiVar));
                return "DecodeImageBytesTask";
            case 8:
                Object obj4 = this.a;
                synchronized (obj4) {
                    r4 = ((auym) obj4).f() ? 0 : ((auym) obj4).b;
                    break;
                }
                if (r4 != 0) {
                    apok apokVar = ((ashy) this.b).b;
                    if (apokVar == null) {
                        apokVar = apok.a;
                    }
                    r4.a(apokVar, new adxo(new adxt() { // from class: adxs
                        @Override // defpackage.adxt
                        public final void a(atxp atxpVar) {
                            if (i3 != 0) {
                                aihf aihfVarCreateBuilder = ashz.a.createBuilder();
                                aihfVarCreateBuilder.copyOnWrite();
                                ashz ashzVar = (ashz) aihfVarCreateBuilder.instance;
                                atxpVar.getClass();
                                ashzVar.c = atxpVar;
                                ashzVar.b |= 1;
                                aqiVar.b((ashz) aihfVarCreateBuilder.build());
                                return;
                            }
                            aihf aihfVarCreateBuilder2 = ashx.a.createBuilder();
                            aihfVarCreateBuilder2.copyOnWrite();
                            ashx ashxVar = (ashx) aihfVarCreateBuilder2.instance;
                            atxpVar.getClass();
                            ashxVar.c = atxpVar;
                            ashxVar.b |= 1;
                            aqiVar.b((ashx) aihfVarCreateBuilder2.build());
                        }
                    }, 2));
                    return "SectionListMutationControllerBlock applyMutationOperations";
                }
                aihf aihfVarCreateBuilder = ashz.a.createBuilder();
                aihf aihfVarCreateBuilder2 = atxp.a.createBuilder();
                aihfVarCreateBuilder2.copyOnWrite();
                ((atxp) aihfVarCreateBuilder2.instance).b = 9;
                aihfVarCreateBuilder2.copyOnWrite();
                ((atxp) aihfVarCreateBuilder2.instance).c = "Section list is disposed.";
                atxp atxpVar = (atxp) aihfVarCreateBuilder2.build();
                aihfVarCreateBuilder.copyOnWrite();
                ashz ashzVar = (ashz) aihfVarCreateBuilder.instance;
                atxpVar.getClass();
                ashzVar.c = atxpVar;
                ashzVar.b |= 1;
                aqiVar.b((ashz) aihfVarCreateBuilder.build());
                return "SectionListMutationControllerBlock applyMutationOperations";
            default:
                Object obj5 = this.a;
                synchronized (obj5) {
                    obj = ((auym) obj5).f() ? null : ((auym) obj5).b;
                    break;
                }
                if (obj == null) {
                    aihf aihfVarCreateBuilder3 = ashx.a.createBuilder();
                    aihf aihfVarCreateBuilder4 = atxp.a.createBuilder();
                    aihfVarCreateBuilder4.copyOnWrite();
                    ((atxp) aihfVarCreateBuilder4.instance).b = 9;
                    aihfVarCreateBuilder4.copyOnWrite();
                    ((atxp) aihfVarCreateBuilder4.instance).c = "Section list is disposed.";
                    atxp atxpVar2 = (atxp) aihfVarCreateBuilder4.build();
                    aihfVarCreateBuilder3.copyOnWrite();
                    ashx ashxVar = (ashx) aihfVarCreateBuilder3.instance;
                    atxpVar2.getClass();
                    ashxVar.c = atxpVar2;
                    ashxVar.b |= 1;
                    aqiVar.b((ashx) aihfVarCreateBuilder3.build());
                } else {
                    ((adxz) obj).c.e(new adab(obj, ((ashw) this.b).b, new adxo(new adxt() { // from class: adxs
                        @Override // defpackage.adxt
                        public final void a(atxp atxpVar3) {
                            if (iIndexOfChild != 0) {
                                aihf aihfVarCreateBuilder5 = ashz.a.createBuilder();
                                aihfVarCreateBuilder5.copyOnWrite();
                                ashz ashzVar2 = (ashz) aihfVarCreateBuilder5.instance;
                                atxpVar3.getClass();
                                ashzVar2.c = atxpVar3;
                                ashzVar2.b |= 1;
                                aqiVar.b((ashz) aihfVarCreateBuilder5.build());
                                return;
                            }
                            aihf aihfVarCreateBuilder6 = ashx.a.createBuilder();
                            aihfVarCreateBuilder6.copyOnWrite();
                            ashx ashxVar2 = (ashx) aihfVarCreateBuilder6.instance;
                            atxpVar3.getClass();
                            ashxVar2.c = atxpVar3;
                            ashxVar2.b |= 1;
                            aqiVar.b((ashx) aihfVarCreateBuilder6.build());
                        }
                    }, 2), i));
                }
                return "SectionListMutationControllerBlock applyComparableOperations";
        }
    }

    public /* synthetic */ dzx(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ dzx(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
