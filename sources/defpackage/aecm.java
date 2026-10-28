package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.rastermill.FrameSequence;
import android.support.rastermill.FrameSequenceDrawable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.util.Size;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.ImageView;
import app.rive.semantics.SemanticState;
import com.facebook.litho.ComponentTree;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.blocks.Container;
import com.google.android.libraries.elements.converters.layout.FlowLayoutManager;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import internal.org.jni_zero.CommonApis;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public /* synthetic */ class aecm {
    public aecm() {
    }

    public static agev A(nwf nwfVar) {
        return aN(nwfVar.d, nwfVar.b, nwfVar.e, nwfVar.g);
    }

    public static void B(aihh aihhVar, final int i, final int i2) {
        if (aihhVar.c(ajwm.b)) {
            aihf builder = ((ajwm) aihhVar.b(ajwm.b)).toBuilder();
            agke agkeVar = (agke) Collection.EL.stream(DesugarCollections.unmodifiableList(((ajwm) builder.instance).c)).map(new Function() { // from class: adfq
                @Override // java.util.function.Function
                /* JADX INFO: renamed from: andThen */
                public final /* synthetic */ Function mo840andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    aihh aihhVar2 = (aihh) ((ajwo) obj).toBuilder();
                    aecm.C(aihhVar2, i, i2);
                    return (ajwo) aihhVar2.build();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(aghu.a);
            aihl aihlVar = ajwm.b;
            builder.copyOnWrite();
            ((ajwm) builder.instance).c = ajwm.emptyProtobufList();
            builder.aO(agkeVar);
            aihhVar.e(aihlVar, (ajwm) builder.build());
        }
        if (aihhVar.c(ajvq.b)) {
            aihf builder2 = ((ajvq) aihhVar.b(ajvq.b)).toBuilder();
            ajwo ajwoVar = ((ajvq) builder2.instance).d;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
            aihh aihhVar2 = (aihh) ajwoVar.toBuilder();
            C(aihhVar2, i, i2);
            aihl aihlVar2 = ajvq.b;
            ajwo ajwoVar2 = (ajwo) aihhVar2.build();
            builder2.copyOnWrite();
            ajvq ajvqVar = (ajvq) builder2.instance;
            ajwoVar2.getClass();
            ajvqVar.d = ajwoVar2;
            ajvqVar.c |= 1;
            aihhVar.e(aihlVar2, (ajvq) builder2.build());
        }
        aihl aihlVar3 = alkm.b;
        if (aihhVar.c(aihlVar3)) {
            aihf builder3 = ((alkm) aihhVar.b(aihlVar3)).toBuilder();
            ajwo ajwoVar3 = ((alkm) builder3.instance).d;
            if (ajwoVar3 == null) {
                ajwoVar3 = ajwo.a;
            }
            aihh aihhVar3 = (aihh) ajwoVar3.toBuilder();
            C(aihhVar3, i, i2);
            ajwo ajwoVar4 = (ajwo) aihhVar3.build();
            builder3.copyOnWrite();
            alkm alkmVar = (alkm) builder3.instance;
            ajwoVar4.getClass();
            alkmVar.d = ajwoVar4;
            alkmVar.c |= 1;
            aihhVar.e(aihlVar3, (alkm) builder3.build());
        }
        C(aihhVar, i, i2);
    }

    public static void C(aihh aihhVar, int i, int i2) {
        aihl aihlVar = aoaq.b;
        aihf builder = aihhVar.c(aihlVar) ? ((aoar) aihhVar.b(aihlVar)).toBuilder() : aoar.a.createBuilder();
        builder.copyOnWrite();
        aoar aoarVar = (aoar) builder.instance;
        aoarVar.b |= 2;
        aoarVar.d = i;
        builder.copyOnWrite();
        aoar aoarVar2 = (aoar) builder.instance;
        aoarVar2.b |= 4;
        aoarVar2.e = i2;
        aihhVar.e(aihlVar, (aoar) builder.build());
    }

    public static ajwo D(mfx mfxVar) {
        nrv nrvVar = mfxVar.g;
        if (nrvVar != null) {
            Object obj = nrvVar.d;
            if (obj instanceof adaq) {
                obj.getClass();
                return ((adaq) obj).d;
            }
        }
        return null;
    }

    public static Drawable E(asnm asnmVar, Context context) {
        agev agevVarE = nqv.e(asnmVar);
        if (agevVarE.g()) {
            return nqv.a(context, (byte[]) agevVarE.c());
        }
        return null;
    }

    public static FrameSequenceDrawable F(int i, Context context) {
        return new FrameSequenceDrawable(FrameSequence.decodeStream(context.getResources().openRawResource(i)));
    }

    public static void G(FrameSequenceDrawable frameSequenceDrawable, asnm asnmVar, ImageView imageView, nry nryVar) {
        nxs nxsVar = new nxs(null, null, nryVar, asnmVar);
        nxsVar.c(frameSequenceDrawable);
        imageView.setImageDrawable(frameSequenceDrawable);
        nxsVar.e();
    }

    public static void H(asnm asnmVar, ImageView imageView, Context context, nry nryVar) {
        int iBt;
        if (asnmVar.c.isEmpty() && (asnmVar.b & 2) != 0) {
            imageView.setImageBitmap(Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8));
            return;
        }
        int iD = npy.d(context, asnmVar);
        if (iD <= 0) {
            imageView.setImageDrawable(E(asnmVar, context));
            return;
        }
        int iBt2 = a.bt(asnmVar.f);
        if ((iBt2 != 0 && iBt2 == 5) || ((iBt = a.bt(asnmVar.f)) != 0 && iBt == 4)) {
            G(F(iD, context), asnmVar, imageView, nryVar);
            return;
        }
        Resources resources = context.getResources();
        int i = avt.a;
        imageView.setImageDrawable(resources.getDrawable(iD, null));
    }

    public static void I(adfc adfcVar, asnm asnmVar, final Context context, nry nryVar, boolean z, Executor executor, final Executor executor2, boolean z2) {
        int iBt;
        int iBc = a.bc(asnmVar.d);
        final int i = 1;
        if (iBc == 0) {
            iBc = 1;
        }
        adfcVar.B = iBc;
        final int i2 = 0;
        if (!z2) {
            if (!z) {
                H(asnmVar, adfcVar, context, nryVar);
                return;
            }
            adfcVar.w = true;
            H(asnmVar, adfcVar, context, nryVar);
            adfcVar.w = false;
            return;
        }
        if (asnmVar.c.isEmpty() && (asnmVar.b & 2) != 0) {
            if (!z) {
                adfcVar.setImageBitmap(Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8));
                return;
            }
            adfcVar.w = true;
            adfcVar.setImageBitmap(Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8));
            adfcVar.w = false;
            return;
        }
        final int iD = npy.d(context, asnmVar);
        int i3 = 4;
        if (iD <= 0) {
            taf.n(ape.f(new qzb(executor2, asnmVar, context, i3)), executor, new adfh(asnmVar, adfcVar, z, 1, null));
            return;
        }
        int iBt2 = a.bt(asnmVar.f);
        if ((iBt2 == 0 || iBt2 != 5) && ((iBt = a.bt(asnmVar.f)) == 0 || iBt != 4)) {
            taf.n(ape.f(new aqk() { // from class: adfd
                @Override // defpackage.aqk
                public final Object a(aqi aqiVar) {
                    int i4 = i2;
                    Context context2 = context;
                    if (i4 != 0) {
                        executor2.execute(afwl.i(new adff(iD, context2, aqiVar, 1, null)));
                        return "LocalImageLoader.DecodeAnimatedDrawableTask";
                    }
                    executor2.execute(afwl.i(new adff(iD, context2, aqiVar, 0)));
                    return "LocalImageLoader.DecodeStaticDrawableTask";
                }
            }), executor, new adfh(asnmVar, adfcVar, z, 0));
        } else {
            taf.n(ape.f(new aqk() { // from class: adfd
                @Override // defpackage.aqk
                public final Object a(aqi aqiVar) {
                    int i4 = i;
                    Context context2 = context;
                    if (i4 != 0) {
                        executor2.execute(afwl.i(new adff(iD, context2, aqiVar, 1, null)));
                        return "LocalImageLoader.DecodeAnimatedDrawableTask";
                    }
                    executor2.execute(afwl.i(new adff(iD, context2, aqiVar, 0)));
                    return "LocalImageLoader.DecodeStaticDrawableTask";
                }
            }), executor, new adfg(asnmVar, adfcVar, nryVar, z));
        }
    }

    public static void J(adfc adfcVar, asnt asntVar) {
        if (asntVar.p) {
            return;
        }
        adfcVar.o = true;
    }

    public static void K(@fmu final adhv adhvVar, final aqmg aqmgVar, final int i, final int i2, @fmu nuc nucVar, @fmu nsl nslVar, @fmu Executor executor) {
        try {
            executor.execute(new Runnable() { // from class: adeu
                @Override // java.lang.Runnable
                public final void run() {
                    aihh aihhVar = (aihh) aqmh.a.createBuilder();
                    aihhVar.r(aqmgVar);
                    adhvVar.n((aqmh) aihhVar.build(), i, i2);
                }
            });
        } catch (RejectedExecutionException e) {
            nucVar.f(aslh.LOG_TYPE_INTERNAL_ERROR, nslVar, e, "Image preload rejected", new Object[0]);
        }
    }

    public static nrv L(adgo adgoVar) {
        nrt nrtVarD = nrv.d();
        nrtVarD.d(adgoVar.a);
        aihh aihhVar = (aihh) SenderStateOuterClass$SenderState.a.createBuilder();
        aihl aihlVar = asta.b;
        aihf aihfVarCreateBuilder = asta.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        asta astaVar = (asta) aihfVarCreateBuilder.instance;
        astaVar.c |= 1;
        astaVar.d = adgoVar.b;
        aihf aihfVarCreateBuilder2 = asob.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        asob asobVar = (asob) aihfVarCreateBuilder2.instance;
        asobVar.b |= 1;
        asobVar.c = adgoVar.c;
        aihfVarCreateBuilder2.copyOnWrite();
        asob asobVar2 = (asob) aihfVarCreateBuilder2.instance;
        asobVar2.b |= 2;
        asobVar2.d = 0.0f;
        aihfVarCreateBuilder.copyOnWrite();
        asta astaVar2 = (asta) aihfVarCreateBuilder.instance;
        asob asobVar3 = (asob) aihfVarCreateBuilder2.build();
        asobVar3.getClass();
        astaVar2.e = asobVar3;
        astaVar2.c |= 2;
        aihf aihfVarCreateBuilder3 = ason.a.createBuilder();
        aihfVarCreateBuilder3.copyOnWrite();
        ason asonVar = (ason) aihfVarCreateBuilder3.instance;
        asonVar.b |= 1;
        asonVar.c = adgoVar.d;
        aihfVarCreateBuilder3.copyOnWrite();
        ason asonVar2 = (ason) aihfVarCreateBuilder3.instance;
        asonVar2.b |= 2;
        asonVar2.d = adgoVar.e;
        aihfVarCreateBuilder.copyOnWrite();
        asta astaVar3 = (asta) aihfVarCreateBuilder.instance;
        ason asonVar3 = (ason) aihfVarCreateBuilder3.build();
        asonVar3.getClass();
        astaVar3.f = asonVar3;
        astaVar3.c |= 4;
        aihhVar.e(aihlVar, (asta) aihfVarCreateBuilder.build());
        nrtVarD.e = (SenderStateOuterClass$SenderState) aihhVar.build();
        return nrtVarD.a();
    }

    public static adel M(String str, mlf mlfVar) {
        mqt mqtVarA;
        if (mlfVar != null && (mqtVarA = mlfVar.a(str)) != null) {
            aihl aihlVar = adel.b;
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
            mqtVarA.c(aihlVarCheckIsLite);
            if (mqtVarA.j.n(aihlVarCheckIsLite.d)) {
                mlfVar.e(str, mqt.a);
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                mqtVarA.c(aihlVarCheckIsLite2);
                Object objK = mqtVarA.j.k(aihlVarCheckIsLite2.d);
                return (adel) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            }
        }
        return null;
    }

    public static String N(assm assmVar, boolean z) {
        if (z) {
            assmVar.getClass();
            aiie aiieVar = assmVar.d;
            aiieVar.getClass();
            return atqq.aD(aiieVar, ":", null, null, new actf(4), 30);
        }
        aqhl aqhlVar = assmVar.c;
        if (aqhlVar == null) {
            aqhlVar = aqhl.a;
        }
        return aqhlVar.h;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0012  */
    public static boolean O(assm assmVar, boolean z) {
        boolean z2;
        if (z) {
            z2 = false;
        } else {
            aqhl aqhlVar = assmVar.c;
            if (aqhlVar == null) {
                aqhlVar = aqhl.a;
            }
            if ((aqhlVar.b & 8) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        return z2 || (z && acfz.W(assmVar));
    }

    public static /* synthetic */ aigj P(apji apjiVar) {
        adal adalVar = new adal();
        aihl aihlVarCheckIsLite = aihn.checkIsLite(akrs.a);
        apjiVar.c(aihlVarCheckIsLite);
        Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
        return aigj.v(adalVar.a((akrn) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).c);
    }

    public static agke Q(List list) {
        return (agke) Collection.EL.stream(list).map(new accu(7)).collect(aghu.a);
    }

    public static agke R(List list) {
        agjz agjzVar = new agjz(4);
        for (int i = 0; i < list.size(); i++) {
            apji apjiVar = (apji) list.get(i);
            aihl aihlVarCheckIsLite = aihn.checkIsLite(ajnp.a);
            apjiVar.c(aihlVarCheckIsLite);
            Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
            agjzVar.h((ajnf) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK)));
        }
        return agjzVar.g();
    }

    public static ajnf S(boolean z, apji apjiVar) {
        if (z && apjiVar != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(ajnp.a);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajnp.a);
                apjiVar.c(aihlVarCheckIsLite2);
                Object objK = apjiVar.j.k(aihlVarCheckIsLite2.d);
                return (ajnf) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            }
        }
        return null;
    }

    public static ajwo T(ajwo ajwoVar) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
        ajwoVar.c(aihlVarCheckIsLite);
        if (!ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            return ajwoVar;
        }
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apfp.b);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        if (((apfp) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).i != 44) {
            return ajwoVar;
        }
        aihh aihhVar = (aihh) ajwoVar.toBuilder();
        aihl aihlVar = apfp.b;
        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar);
        ajwoVar.c(aihlVarCheckIsLite3);
        Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite3.d);
        aihh aihhVar2 = (aihh) ((apfp) (objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2))).toBuilder();
        aihhVar2.copyOnWrite();
        apfp apfpVar = (apfp) aihhVar2.instance;
        if (apfpVar.i == 44) {
            apfpVar.i = 0;
            apfpVar.k = null;
        }
        aihhVar.e(aihlVar, (apfp) aihhVar2.build());
        return (ajwo) aihhVar.build();
    }

    public static ajwo U(ajwo ajwoVar) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
        ajwoVar.c(aihlVarCheckIsLite);
        if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apfp.b);
            ajwoVar.c(aihlVarCheckIsLite2);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
            apfp apfpVar = (apfp) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            if (!apfpVar.U.isEmpty()) {
                return ajwoVar;
            }
            aihh aihhVar = (aihh) ajwoVar.toBuilder();
            aihl aihlVar = apfp.b;
            aihh aihhVar2 = (aihh) apfpVar.toBuilder();
            String string = UUID.randomUUID().toString();
            aihhVar2.copyOnWrite();
            apfp apfpVar2 = (apfp) aihhVar2.instance;
            string.getClass();
            apfpVar2.d |= 262144;
            apfpVar2.U = string;
            aihhVar.e(aihlVar, (apfp) aihhVar2.build());
            return (ajwo) aihhVar.build();
        }
        aihl aihlVar2 = apef.b;
        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar2);
        ajwoVar.c(aihlVarCheckIsLite3);
        if (!ajwoVar.j.n(aihlVarCheckIsLite3.d)) {
            return ajwoVar;
        }
        aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aihlVar2);
        ajwoVar.c(aihlVarCheckIsLite4);
        Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite4.d);
        apef apefVar = (apef) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2));
        if (!apefVar.e.isEmpty()) {
            return ajwoVar;
        }
        aihh aihhVar3 = (aihh) ajwoVar.toBuilder();
        aihf builder = apefVar.toBuilder();
        String string2 = UUID.randomUUID().toString();
        builder.copyOnWrite();
        apef apefVar2 = (apef) builder.instance;
        string2.getClass();
        apefVar2.c |= 8;
        apefVar2.e = string2;
        aihhVar3.e(aihlVar2, (apef) builder.build());
        return (ajwo) aihhVar3.build();
    }

    public static aoar V(ajwo ajwoVar) {
        aoar aoarVar;
        aihl aihlVar = aoaq.b;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        ajwoVar.c(aihlVarCheckIsLite);
        if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
            ajwoVar.c(aihlVarCheckIsLite2);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
            aoarVar = (aoar) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        } else {
            aoarVar = aoar.a;
        }
        if (!aD(ajwoVar)) {
            return aoarVar;
        }
        String strAd = ad(ajwoVar);
        if (aoarVar.k.equals(strAd)) {
            return aoarVar;
        }
        aihf builder = aoarVar.toBuilder();
        builder.copyOnWrite();
        aoar aoarVar2 = (aoar) builder.instance;
        strAd.getClass();
        aoarVar2.b |= SemanticState.ReadOnly;
        aoarVar2.k = strAd;
        return (aoar) builder.build();
    }

    public static aoqt W(alqc alqcVar) {
        if (alqcVar != null && (alqcVar.b & 32768) != 0) {
            apji apjiVar = alqcVar.p;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aoqu.a);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                apji apjiVar2 = alqcVar.p;
                if (apjiVar2 == null) {
                    apjiVar2 = apji.a;
                }
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aoqu.a);
                apjiVar2.c(aihlVarCheckIsLite2);
                Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                return (aoqt) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            }
        }
        return null;
    }

    public static apey X(apfp apfpVar) {
        if (apfpVar != null) {
            apji apjiVar = apfpVar.w;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aihl aihlVar = apfb.a;
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                apji apjiVar2 = apfpVar.w;
                if (apjiVar2 == null) {
                    apjiVar2 = apji.a;
                }
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                apjiVar2.c(aihlVarCheckIsLite2);
                Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                return (apey) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            }
        }
        return null;
    }

    public static apfp Y(apfp apfpVar) {
        if (apfpVar.i != 44) {
            return apfpVar;
        }
        aihh aihhVar = (aihh) apfpVar.toBuilder();
        aihhVar.copyOnWrite();
        apfp apfpVar2 = (apfp) aihhVar.instance;
        if (apfpVar2.i == 44) {
            apfpVar2.i = 0;
            apfpVar2.k = null;
        }
        return (apfp) aihhVar.build();
    }

    public static apfp Z(abnl abnlVar) {
        ajwo ajwoVar;
        if (abnlVar != null && (ajwoVar = abnlVar.b) != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
            ajwoVar.c(aihlVarCheckIsLite);
            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apfp.b);
                ajwoVar.c(aihlVarCheckIsLite2);
                Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                return (apfp) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            }
        }
        return null;
    }

    public static int aA(apfp apfpVar) {
        apey apeyVarX = X(apfpVar);
        if (apeyVarX == null || (apeyVarX.b & SemanticState.Multiline) == 0) {
            return 0;
        }
        int iBq = acfz.bq(apeyVarX.i);
        if (iBq == 0) {
            return 1;
        }
        return iBq;
    }

    public static int aB(ajwo ajwoVar) {
        if (ajwoVar != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
            ajwoVar.c(aihlVarCheckIsLite);
            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apfp.b);
                ajwoVar.c(aihlVarCheckIsLite2);
                Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                int iF = CommonApis.f(((apfp) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).l);
                if (iF != 0) {
                    return iF;
                }
            }
        }
        return 1;
    }

    public static /* synthetic */ aqhx aC(apji apjiVar) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aqhx.b);
        apjiVar.c(aihlVarCheckIsLite);
        Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
        return (aqhx) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
    }

    public static /* synthetic */ boolean aD(ajwo ajwoVar) {
        if (ajwoVar == null) {
            return false;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
        ajwoVar.c(aihlVarCheckIsLite);
        if (!ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apef.b);
            ajwoVar.c(aihlVarCheckIsLite2);
            if (!ajwoVar.j.n(aihlVarCheckIsLite2.d)) {
                return false;
            }
        }
        return true;
    }

    public static Optional aE(awmd awmdVar, awmd awmdVar2) {
        mav mavVar = new mav((Container) awmdVar.io());
        mavVar.b((agbq) awmdVar2.io());
        return Optional.of(mavVar);
    }

    public static fjw aF(Context context, mlo mloVar, aigj aigjVar, xgn xgnVar, Object obj, Map map, akrn akrnVar, avmm avmmVar, afip afipVar) {
        fjw fjwVar = new fjw(context);
        fhd fhdVar = fjwVar.y;
        nsk nskVarB = nsl.b();
        nskVarB.b(fjwVar);
        nskVarB.p(false);
        nskVarB.o(agke.q(aawb.ad(obj, null, map)));
        nskVarB.n(xgnVar != null ? afipVar.f(xgnVar, akrnVar) : null);
        fhm fhmVarC = ComponentTree.c(fhdVar, mloVar.a(fhdVar, nskVarB.a(), aigjVar.G(), xgnVar != null ? new adat(xgnVar) : null, avmmVar), null);
        fhmVarC.d = false;
        fjwVar.K(fhmVarC.a(), true);
        return fjwVar;
    }

    public static aebp aG(List list, RecyclerView recyclerView, mlo mloVar, vxz vxzVar, xgn xgnVar, awmd awmdVar, afip afipVar, awmd awmdVar2, tqj tqjVar) {
        ntw ntwVarA = ntx.a(mloVar.a);
        ntwVarA.c(false);
        aebi aebiVar = new aebi(mloVar, ntwVarA.a(), vxzVar, xgnVar, ntu.a, afipVar, awmdVar, awmdVar2, aecs.b);
        admo admoVar = new admo(new admq(), tym.ap(tqjVar));
        admu admuVar = new admu();
        admuVar.addAll(list);
        admoVar.D(admuVar, null);
        aebp aebpVarB = aebiVar.a(recyclerView, admoVar, null);
        aebpVarB.a(recyclerView);
        return aebpVarB;
    }

    public static aebp aH(List list, RecyclerView recyclerView, mlo mloVar, vxz vxzVar, xgn xgnVar, awmd awmdVar, afip afipVar, awmd awmdVar2, tqj tqjVar) {
        return aG(Q(list), recyclerView, mloVar, vxzVar, xgnVar, awmdVar, afipVar, awmdVar2, tqjVar);
    }

    public static aetk aI(acwa acwaVar, agbq agbqVar, hno hnoVar, avmb avmbVar) {
        boolean zL = ((vxz) hnoVar.i).l(252, 45799110L, false);
        boolean zN = hnoVar.N();
        if (true != hnoVar.N()) {
            avmbVar = null;
        }
        return new aetk(acwaVar, agbqVar, zL, zN, avmbVar);
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, java.util.Map] */
    public static aigj aJ(aqhl aqhlVar, axlj axljVar, adel adelVar, boolean z) {
        int i;
        String str;
        String str2 = (aqhlVar.b & 8) != 0 ? aqhlVar.h : aqhlVar.e;
        int i2 = 1;
        if (adelVar != null) {
            for (adek adekVar : adelVar.e) {
                int i3 = adekVar.b;
                if ((i3 & 1) != 0 && (i3 & 2) != 0 && !axljVar.r(str2).contains(adekVar.c)) {
                    axljVar.C(str2, adekVar.c, adekVar.d, false);
                }
            }
            if (axljVar.w(str2) == null && (adelVar.c & 1) != 0) {
                axljVar.z(str2, adelVar.d, false);
            }
            if (z) {
                for (adej adejVar : adelVar.j) {
                    String str3 = adejVar.c;
                    aijp aijpVar = adejVar.d;
                    if (aijpVar == null) {
                        aijpVar = aijp.a;
                    }
                    acfz.ao(axljVar, aqhlVar, str3, aijpVar);
                }
            }
            if ((adelVar.c & 2) != 0) {
                aqhn aqhnVar = adelVar.f;
                if (aqhnVar == null) {
                    aqhnVar = aqhn.a;
                }
                axljVar.A(str2, aqhnVar);
            }
        }
        if (axljVar.w(str2) == null) {
            adct adctVar = new adct(i2);
            axljVar.getClass();
            acfz.an(axljVar, aqhlVar, adctVar, false);
        }
        adrr adrrVar = (adrr) axljVar.b.get(str2);
        Object obj = null;
        if (adrrVar != null && (str = adrrVar.b) != null) {
            obj = adrrVar.a.get(str);
        }
        aigj aigjVarA = (aigj) obj;
        if (aigjVarA == null) {
            aigjVarA = adcw.a(aqhlVar, axljVar.w(str2));
        }
        if (axljVar.t(str2) == null && (i = aqhlVar.c) == 5) {
            axljVar.A(str2, i == 5 ? (aqhn) aqhlVar.d : aqhn.a);
        }
        if (axljVar.s(str2) == null && aqhlVar.g.size() > 0) {
            axljVar.B(str2, agke.n(aqhlVar.g));
        }
        return aigjVarA;
    }

    private static Point aK(View view, int i, int i2) {
        int i3;
        int i4;
        int i5 = bac.a;
        bbn bbnVarA = azt.a(view);
        if (bbnVarA != null) {
            i3 = bbnVarA.f(519).c;
            i4 = bbnVarA.f(519).e;
        } else {
            i3 = 0;
            i4 = 0;
        }
        return new Point(Math.max(i, i3), i2 + i4);
    }

    private static void aL(agjz agjzVar, anfv anfvVar) {
        if (anfvVar != null) {
            agjzVar.h(anfvVar);
        }
    }

    private static agke aM(anfv anfvVar, Object obj, hef hefVar, jnj jnjVar) {
        agjz agjzVar = new agjz(4);
        if (s(anfvVar)) {
            if (hefVar != null && hefVar.n(t(anfvVar) - 1)) {
                aL(agjzVar, anfvVar);
            }
        } else if (acfz.al(anfvVar)) {
            agjzVar.j(jnjVar.E(anfvVar));
        } else if (acfz.aj(anfvVar)) {
            aL(agjzVar, jnjVar.D(anfvVar));
        } else if (acfz.ak(anfvVar)) {
            aL(agjzVar, jnjVar.C(anfvVar, obj));
        } else {
            aL(agjzVar, anfvVar);
        }
        return agjzVar.g();
    }

    private static agev aN(ntq ntqVar, Object obj, ntx ntxVar, agfr agfrVar) {
        adfx adfxVar = ntxVar == null ? null : ntxVar.i;
        xgn xgnVar = ntqVar instanceof adau ? ((adau) ntqVar).a : null;
        if (xgnVar == null && (adfxVar instanceof adfx)) {
            xgnVar = adfxVar.a;
        }
        if (xgnVar == null && agfrVar != null) {
            adfs adfsVar = (adfs) agfrVar.io();
            if (adfsVar instanceof adfs) {
                xgnVar = adfsVar.a;
            }
        }
        if (xgnVar == null && (obj instanceof adaq)) {
            xgnVar = ((adaq) obj).c;
        }
        return agev.h(xgnVar);
    }

    public static apfp aa(ajwo ajwoVar) {
        if (ajwoVar != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
            ajwoVar.c(aihlVarCheckIsLite);
            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apfp.b);
                ajwoVar.c(aihlVarCheckIsLite2);
                Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                return (apfp) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            }
        }
        return null;
    }

    public static Optional ab(alqc alqcVar) {
        Optional optionalOfNullable = Optional.ofNullable(alqcVar);
        if (true == optionalOfNullable.isPresent()) {
            apji apjiVar = ((alqc) optionalOfNullable.get()).y;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            optionalOfNullable = Optional.ofNullable(apjiVar);
        }
        if (true == optionalOfNullable.isPresent()) {
            apji apjiVar2 = (apji) optionalOfNullable.get();
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aqhx.b);
            apjiVar2.c(aihlVarCheckIsLite);
            if (true != apjiVar2.j.n(aihlVarCheckIsLite.d)) {
                optionalOfNullable = Optional.empty();
            }
        }
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = Optional.ofNullable(aC((apji) optionalOfNullable.get()));
        }
        if (optionalOfNullable.isPresent()) {
            return optionalOfNullable;
        }
        apvk apvkVar = null;
        if (alqcVar != null) {
            apez apezVar = alqcVar.d;
            if (apezVar == null) {
                apezVar = apez.a;
            }
            if (apezVar.b == 1001) {
                apez apezVar2 = alqcVar.d;
                if (apezVar2 == null) {
                    apezVar2 = apez.a;
                }
                apvkVar = apezVar2.b == 1001 ? (apvk) apezVar2.c : apvk.a;
            }
        }
        if (apvkVar == null) {
            Optional optionalOfNullable2 = Optional.ofNullable(alqcVar);
            if (true == optionalOfNullable2.isPresent()) {
                apez apezVar3 = ((alqc) optionalOfNullable2.get()).d;
                if (apezVar3 == null) {
                    apezVar3 = apez.a;
                }
                optionalOfNullable2 = Optional.ofNullable(apezVar3);
            }
            if (true == optionalOfNullable2.isPresent()) {
                apez apezVar4 = (apez) optionalOfNullable2.get();
                optionalOfNullable2 = Optional.ofNullable(apezVar4.b == 139970731 ? (apey) apezVar4.c : apey.a);
            }
            if (true == optionalOfNullable2.isPresent()) {
                apey apeyVar = (apey) optionalOfNullable2.get();
                optionalOfNullable2 = Optional.ofNullable(apeyVar.e == 40 ? (apji) apeyVar.f : apji.a);
            }
            if (true == optionalOfNullable2.isPresent()) {
                apji apjiVar3 = (apji) optionalOfNullable2.get();
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aqhx.b);
                apjiVar3.c(aihlVarCheckIsLite2);
                if (true != apjiVar3.j.n(aihlVarCheckIsLite2.d)) {
                    optionalOfNullable2 = Optional.empty();
                }
            }
            Optional optional = optionalOfNullable2;
            return true == optional.isPresent() ? Optional.ofNullable(aC((apji) optional.get())) : optional;
        }
        Optional optionalOfNullable3 = Optional.ofNullable(alqcVar);
        if (true == optionalOfNullable3.isPresent()) {
            apez apezVar5 = ((alqc) optionalOfNullable3.get()).d;
            if (apezVar5 == null) {
                apezVar5 = apez.a;
            }
            optionalOfNullable3 = Optional.ofNullable(apezVar5);
        }
        if (true == optionalOfNullable3.isPresent()) {
            apez apezVar6 = (apez) optionalOfNullable3.get();
            optionalOfNullable3 = Optional.ofNullable(apezVar6.b == 1001 ? (apvk) apezVar6.c : apvk.a);
        }
        if (true == optionalOfNullable3.isPresent()) {
            apji apjiVar4 = ((apvk) optionalOfNullable3.get()).b;
            if (apjiVar4 == null) {
                apjiVar4 = apji.a;
            }
            optionalOfNullable3 = Optional.ofNullable(apjiVar4);
        }
        if (true == optionalOfNullable3.isPresent()) {
            apji apjiVar5 = (apji) optionalOfNullable3.get();
            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(apvj.b);
            apjiVar5.c(aihlVarCheckIsLite3);
            if (true != apjiVar5.j.n(aihlVarCheckIsLite3.d)) {
                optionalOfNullable3 = Optional.empty();
            }
        }
        if (true == optionalOfNullable3.isPresent()) {
            apji apjiVar6 = (apji) optionalOfNullable3.get();
            aihl aihlVarCheckIsLite4 = aihn.checkIsLite(apvj.b);
            apjiVar6.c(aihlVarCheckIsLite4);
            Object objK = apjiVar6.j.k(aihlVarCheckIsLite4.d);
            optionalOfNullable3 = Optional.ofNullable((apvj) (objK == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK)));
        }
        if (true == optionalOfNullable3.isPresent()) {
            apji apjiVar7 = ((apvj) optionalOfNullable3.get()).c;
            if (apjiVar7 == null) {
                apjiVar7 = apji.a;
            }
            optionalOfNullable3 = Optional.ofNullable(apjiVar7);
        }
        if (true == optionalOfNullable3.isPresent()) {
            apji apjiVar8 = (apji) optionalOfNullable3.get();
            aihl aihlVarCheckIsLite5 = aihn.checkIsLite(aqhx.b);
            apjiVar8.c(aihlVarCheckIsLite5);
            if (true != apjiVar8.j.n(aihlVarCheckIsLite5.d)) {
                optionalOfNullable3 = Optional.empty();
            }
        }
        Optional optional2 = optionalOfNullable3;
        return true == optional2.isPresent() ? Optional.ofNullable(aC((apji) optional2.get())) : optional2;
    }

    public static Optional ac(apef apefVar) {
        apji apjiVar = apefVar.d;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        aihl aihlVar = apei.a;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        apjiVar.c(aihlVarCheckIsLite);
        if (!apjiVar.j.n(aihlVarCheckIsLite.d)) {
            return Optional.empty();
        }
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
        apjiVar.c(aihlVarCheckIsLite2);
        Object objK = apjiVar.j.k(aihlVarCheckIsLite2.d);
        return Optional.of((apeh) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK)));
    }

    public static String ad(ajwo ajwoVar) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
        ajwoVar.c(aihlVarCheckIsLite);
        if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apfp.b);
            ajwoVar.c(aihlVarCheckIsLite2);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
            return ((apfp) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).U;
        }
        aihl aihlVar = apef.b;
        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar);
        ajwoVar.c(aihlVarCheckIsLite3);
        if (!ajwoVar.j.n(aihlVarCheckIsLite3.d)) {
            return "";
        }
        aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aihlVar);
        ajwoVar.c(aihlVarCheckIsLite4);
        Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite4.d);
        return ((apef) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2))).e;
    }

    public static boolean ae(ajwo ajwoVar) {
        if (ajwoVar == null) {
            return false;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
        ajwoVar.c(aihlVarCheckIsLite);
        if (!ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            return false;
        }
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apfp.b);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        apfp apfpVar = (apfp) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        return ((apfpVar.c & 131072) == 0 || apfpVar.A.isEmpty()) ? false : true;
    }

    public static boolean af(ajwo ajwoVar) {
        apfp apfpVarAa = aa(ajwoVar);
        if (apfpVarAa != null) {
            if (((apfpVarAa.i == 44 ? (apfq) apfpVarAa.k : apfq.a).b & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean ag(apfp apfpVar) {
        if (apfpVar == null) {
            return false;
        }
        if ((apfpVar.c & 1) != 0) {
            int iF = CommonApis.f(apfpVar.l);
            if (iF == 0 || iF != 4) {
                return false;
            }
        } else {
            if ((apfpVar.c & 4194304) == 0) {
                return false;
            }
            apdm apdmVar = apfpVar.C;
            if (apdmVar == null) {
                apdmVar = apdm.a;
            }
            if ((apdmVar.b & 1) == 0) {
                return false;
            }
            apdm apdmVar2 = apfpVar.C;
            if (apdmVar2 == null) {
                apdmVar2 = apdm.a;
            }
            if (!apdmVar2.c) {
                return false;
            }
        }
        return true;
    }

    public static boolean ah(apfp apfpVar) {
        int iF;
        return (apfpVar == null || (apfpVar.c & 1) == 0 || (iF = CommonApis.f(apfpVar.l)) == 0 || iF != 12) ? false : true;
    }

    public static boolean ai(ajwo ajwoVar) {
        if (!aj(ajwoVar)) {
            if (ajwoVar != null) {
                aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
                ajwoVar.c(aihlVarCheckIsLite);
                Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
                if (!al((apfp) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK)))) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean aj(ajwo ajwoVar) {
        if (ajwoVar != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
            ajwoVar.c(aihlVarCheckIsLite);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
            if (ak((apfp) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK)))) {
                return true;
            }
        }
        return false;
    }

    public static boolean ak(apfp apfpVar) {
        int iF;
        return (apfpVar == null || (iF = CommonApis.f(apfpVar.l)) == 0 || iF != 5) ? false : true;
    }

    public static boolean al(apfp apfpVar) {
        int iF;
        return (apfpVar == null || (iF = CommonApis.f(apfpVar.l)) == 0 || iF != 8) ? false : true;
    }

    public static boolean am(apfp apfpVar) {
        int iF;
        return (apfpVar == null || (apfpVar.c & 1) == 0 || (iF = CommonApis.f(apfpVar.l)) == 0 || iF != 9) ? false : true;
    }

    public static boolean an(apfx apfxVar) {
        if (apfxVar == null || (apfxVar.b & 8) == 0) {
            return false;
        }
        int iAV = a.aV(apfxVar.f);
        if (iAV == 0) {
            iAV = 1;
        }
        return iAV == 3 || iAV == 4;
    }

    public static boolean ao(apfp apfpVar) {
        int iF;
        return (apfpVar == null || (apfpVar.c & 1) == 0 || (iF = CommonApis.f(apfpVar.l)) == 0 || iF != 11) ? false : true;
    }

    public static boolean ap(ajwo ajwoVar) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        return aq((apfp) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK)));
    }

    public static boolean aq(apfp apfpVar) {
        int iAV;
        return (apfpVar == null || (iAV = a.aV(apfpVar.n)) == 0 || iAV != 3) ? false : true;
    }

    public static boolean ar(ajwo ajwoVar) {
        int iAV;
        apfp apfpVarAa = aa(ajwoVar);
        return (apfpVarAa == null || (iAV = a.aV(apfpVarAa.n)) == 0 || iAV != 4) ? false : true;
    }

    public static boolean as(ajwo ajwoVar) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        return at((apfp) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK)));
    }

    public static boolean at(apfp apfpVar) {
        int iAV;
        return apfpVar != null && (iAV = a.aV(apfpVar.n)) != 0 && iAV == 4 && apfpVar.o.isEmpty();
    }

    public static boolean au(abnl abnlVar) {
        return av(Z(abnlVar));
    }

    public static boolean av(apfp apfpVar) {
        int iAV;
        return (apfpVar == null || (iAV = a.aV(apfpVar.n)) == 0 || iAV != 4 || (apfpVar.c & 64) == 0) ? false : true;
    }

    public static boolean aw(ajwo ajwoVar) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        return ax((apfp) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK)));
    }

    public static boolean ax(apfp apfpVar) {
        int iBq;
        if (apfpVar == null || (apfpVar.c & 1) == 0) {
            apey apeyVarX = X(apfpVar);
            if (apeyVarX == null || (apeyVarX.b & SemanticState.Multiline) == 0) {
                iBq = 0;
            } else {
                iBq = acfz.bq(apeyVarX.i);
                if (iBq == 0) {
                    iBq = 1;
                }
            }
            if (iBq != 5 && iBq != 9 && iBq != 12) {
                return false;
            }
        } else {
            int iF = CommonApis.f(apfpVar.l);
            if (iF == 0 || iF != 3) {
                return false;
            }
        }
        return true;
    }

    public static boolean ay(apef apefVar) {
        Optional optionalAc = ac(apefVar);
        if (true == optionalAc.isPresent()) {
            apmn apmnVar = ((apeh) optionalAc.get()).c;
            if (apmnVar == null) {
                apmnVar = apmn.a;
            }
            optionalAc = Optional.ofNullable(Integer.valueOf(apmnVar.c));
        }
        if (true == optionalAc.isPresent() && ((Integer) optionalAc.get()).intValue() != 141121) {
            optionalAc = Optional.empty();
        }
        return optionalAc.isPresent();
    }

    public static boolean az(ajwo ajwoVar) {
        if (ajwoVar != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
            ajwoVar.c(aihlVarCheckIsLite);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
            if (ag((apfp) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK)))) {
                return true;
            }
        }
        return false;
    }

    public static int b(Context context) {
        try {
            int iR = tzk.r(context);
            if (iR == 0) {
                return 1;
            }
            if (iR == 1) {
                return 2;
            }
            throw new aedp(iR);
        } catch (Resources.NotFoundException e) {
            throw new aedo(e);
        }
    }

    public static int c(WindowInsets windowInsets) {
        int i = windowInsets.getInsets(WindowInsets.Type.systemBars()).bottom;
        int i2 = windowInsets.getInsets(WindowInsets.Type.ime()).bottom;
        if (i2 > i) {
            return i2 - i;
        }
        return 0;
    }

    public static Activity d(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public static Rect e(View view) {
        Rect rect;
        Activity activityD = d(view.getContext());
        if (activityD != null) {
            rect = dxc.a.a().a(activityD).a();
        } else {
            DisplayMetrics displayMetrics = view.getContext().getResources().getDisplayMetrics();
            rect = new Rect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        int i = bac.a;
        bbn bbnVarA = azt.a(view);
        avw avwVarF = bbnVarA != null ? bbnVarA.f(655) : avw.a;
        return new Rect(rect.left + avwVarF.b, rect.top + avwVarF.c, rect.right - avwVarF.d, rect.bottom - avwVarF.e);
    }

    public static adzo f(View view, int i) {
        Rect rectE;
        view.getClass();
        Activity activityD = d(view.getContext());
        if (view.getWindowToken() != null || activityD == null) {
            rectE = e(view);
        } else {
            View decorView = activityD.getWindow().getDecorView();
            decorView.getClass();
            rectE = e(decorView);
        }
        rectE.inset(i, i);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i2 = iArr[0];
        return new adzo(rectE, new Rect(i2, iArr[1], view.getWidth() + i2, iArr[1] + view.getHeight()));
    }

    public static Size g(adzp adzpVar, adzo adzoVar, int i) {
        Size size;
        Size size2;
        adzpVar.getClass();
        Rect rect = adzoVar.b;
        int i2 = rect.top - i;
        Rect rect2 = adzoVar.a;
        int i3 = i2 - rect2.top;
        int i4 = rect2.bottom - (rect.bottom + i);
        int i5 = (rect.left - i) - rect2.left;
        int i6 = rect2.right - (rect.right + i);
        int iWidth = rect2.width();
        int iHeight = rect2.height();
        switch (adzpVar.ordinal()) {
            case 0:
            case 1:
            case 2:
                size = new Size(iWidth, awro.f(i4, 0));
                return size;
            case 3:
            case 4:
            case 5:
                size = new Size(iWidth, awro.f(i3, 0));
                return size;
            case 6:
                size2 = new Size(awro.f(i6, 0), iHeight);
                return size2;
            case 7:
                size2 = new Size(awro.f(i5, 0), iHeight);
                return size2;
            case 8:
                return new Size(iWidth, iHeight);
            default:
                throw new awmj();
        }
    }

    public static adzp h(adzo adzoVar) {
        Rect rect = adzoVar.a;
        Rect rect2 = adzoVar.b;
        if (rect2.width() >= rect.width() && rect2.height() >= rect.height()) {
            return adzp.i;
        }
        int iCenterX = rect2.centerX();
        int iCenterY = rect2.centerY();
        int iCenterX2 = rect.centerX();
        int iCenterY2 = rect.centerY();
        if (iCenterX == iCenterX2) {
            return iCenterY <= iCenterY2 ? adzp.b : adzp.e;
        }
        if (iCenterY <= iCenterY2) {
            return iCenterX <= iCenterX2 ? adzp.a : adzp.c;
        }
        return iCenterX <= iCenterX2 ? adzp.d : adzp.f;
    }

    public static adzp i(View view) {
        view.getClass();
        return view.getWindowToken() == null ? adzp.i : h(f(view, 0));
    }

    public static int j(Context context, View view) {
        Point pointK = k(context);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int width = iArr[0] + (view.getWidth() / 2);
        int height = iArr[1] + (view.getHeight() / 2);
        int i = pointK.y / 2;
        int i2 = pointK.x / 2;
        if (width == pointK.x / 2) {
            return height > i ? 5 : 2;
        }
        if (height <= i) {
            return width <= i2 ? 1 : 3;
        }
        return width <= i2 ? 4 : 6;
    }

    public static Point k(Context context) {
        Point point = new Point();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getSize(point);
        return point;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x00bc  */
    public static Point l(Context context, View view, int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2) {
        int i7;
        int iMax;
        int i8;
        int height;
        int i9 = i5;
        if (z2) {
            Point pointAK = aK(view, i9, i4);
            int i10 = pointAK.x;
            i7 = pointAK.y;
            i9 = i10;
        } else {
            i7 = i4;
        }
        Point pointK = k(context);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i11 = 0;
        int iMax2 = Math.max(iArr[0], i4);
        int iMin = Math.min(iArr[0] + view.getWidth(), pointK.x - i4) - i2;
        int iMin2 = Math.min(iArr[1] - i6, pointK.y - i7) - i3;
        int iMax3 = Math.max(iArr[1] + view.getHeight() + i6, i9);
        switch (i) {
            case 1:
                i11 = iMax3;
                break;
            case 2:
                iMax2 = iArr[0] + ((view.getWidth() - i2) / 2);
                i11 = iMax3;
                break;
            case 3:
                iMax2 = iMin;
                i11 = iMax3;
                break;
            case 4:
                i11 = iMin2;
                break;
            case 5:
                iMax2 = iArr[0] + ((view.getWidth() - i2) / 2);
                i11 = iMin2;
                break;
            case 6:
                iMax2 = iMin;
                i11 = iMin2;
                break;
            case 7:
                iMax = Math.max(iArr[0] + view.getWidth() + i6, i4);
                i8 = iArr[1];
                height = (view.getHeight() - i3) / 2;
                iMax2 = iMax;
                i11 = height + i8;
                break;
            case 8:
                iMax = Math.min(iArr[0] - i6, pointK.x - i4) - i2;
                i8 = iArr[1];
                height = (view.getHeight() - i3) / 2;
                iMax2 = iMax;
                i11 = height + i8;
                break;
            default:
                iMax2 = 0;
                break;
        }
        if (i != 7 && i != 8) {
            i9 = i11;
        } else if (i11 >= i9) {
            int i12 = i11 + i3;
            int i13 = pointK.y - i7;
            if (i12 > i13) {
                i9 = i11 - (i12 - i13);
            } else {
                i9 = i11;
            }
        }
        if (z && (iMax2 > pointK.x || iMax2 < 0 || i9 > pointK.y || i9 < 0)) {
            iMax2 = ((pointK.x / 2) - (i2 / 2)) - i4;
            i9 = (pointK.y - i3) - i7;
        }
        return new Point(iMax2, i9);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Size m(Context context, View view, int i, int i2, int i3, int i4, boolean z) {
        int i5;
        if (z) {
            Point pointAK = aK(view, i3, i2);
            int i6 = pointAK.x;
            i5 = pointAK.y;
            i3 = i6;
        } else {
            i5 = i2;
        }
        Point pointK = k(context);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i7 = iArr[1];
        int i8 = i7 - i4;
        int height = i7 + view.getHeight() + i4;
        int i9 = iArr[0];
        int i10 = i9 - i4;
        int width = i9 + view.getWidth() + i4;
        int i11 = pointK.y - height;
        int i12 = pointK.y - i3;
        int i13 = (pointK.x - width) - i2;
        int i14 = i10 - i2;
        int i15 = pointK.x - (i2 << 1);
        int i16 = pointK.x;
        int i17 = iArr[0];
        int i18 = (i16 - i17) - i2;
        int width2 = (i17 + view.getWidth()) - i2;
        int i19 = i12 - i5;
        int i20 = i11 - i5;
        int i21 = i8 - i3;
        switch (i) {
            case 1:
                i13 = i18;
                return new Size(Math.min(i13, i15), Math.min(i20, i19));
            case 2:
                i13 = i15;
                return new Size(Math.min(i13, i15), Math.min(i20, i19));
            case 3:
                i13 = width2;
                return new Size(Math.min(i13, i15), Math.min(i20, i19));
            case 4:
                i13 = i18;
                i20 = i21;
                return new Size(Math.min(i13, i15), Math.min(i20, i19));
            case 5:
                i20 = i21;
                i13 = i15;
                return new Size(Math.min(i13, i15), Math.min(i20, i19));
            case 6:
                i13 = width2;
                i20 = i21;
                return new Size(Math.min(i13, i15), Math.min(i20, i19));
            case 7:
                i20 = i19;
                return new Size(Math.min(i13, i15), Math.min(i20, i19));
            case 8:
                i20 = i19;
                i13 = i14;
                return new Size(Math.min(i13, i15), Math.min(i20, i19));
            default:
                throw new IllegalStateException();
        }
    }

    public static Drawable n(Context context, aduv aduvVar, alja aljaVar) {
        if (aljaVar != null && aduvVar != null && (aljaVar.b & 1) != 0) {
            aliz alizVarA = aliz.a(aljaVar.c);
            if (alizVarA == null) {
                alizVarA = aliz.UNKNOWN;
            }
            int iA = aduvVar.a(alizVarA);
            if (iA != 0) {
                return context.getDrawable(iA);
            }
        }
        return null;
    }

    public static Drawable o(Context context, arqz arqzVar, int i, adxj adxjVar) {
        context.getClass();
        adxjVar.getClass();
        Drawable drawableD = adxjVar.d(context, arqzVar);
        if (drawableD == null) {
            return null;
        }
        Drawable drawableMutate = drawableD.mutate();
        drawableMutate.getClass();
        drawableMutate.setTint(i);
        return drawableMutate;
    }

    public static Drawable p(Context context, arqz arqzVar, int i, adxj adxjVar) {
        context.getClass();
        adxjVar.getClass();
        return o(context, arqzVar, tzk.i(context, i), adxjVar);
    }

    public static float q(Context context, vxz vxzVar) {
        return vxzVar.a(0, 45374966L, 0.0d) != 0.0d ? twm.a(context.getResources().getDisplayMetrics(), (float) vxzVar.a(0, 45374966L, 0.0d)) : context.getResources().getDimensionPixelSize(R.dimen.panel_corner_radius);
    }

    public static float[] r(Context context, vxz vxzVar) {
        float fQ = q(context, vxzVar);
        return new float[]{fQ, fQ, fQ, fQ, 0.0f, 0.0f, 0.0f, 0.0f};
    }

    public static boolean s(anfv anfvVar) {
        return t(anfvVar) != 1;
    }

    public static int t(anfv anfvVar) {
        int iBi;
        int i = anfvVar.b;
        if (i == 77262503) {
            int iBi2 = a.bi(((anfs) anfvVar.c).g);
            if (iBi2 != 0) {
                return iBi2;
            }
        } else if (i == 77258115 && (iBi = a.bi(((anft) anfvVar.c).g)) != 0) {
            return iBi;
        }
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:91:0x019f A[Catch: Exception -> 0x020e, TryCatch #0 {Exception -> 0x020e, blocks: (B:3:0x000b, B:6:0x0014, B:10:0x001e, B:11:0x0021, B:12:0x0024, B:13:0x0027, B:14:0x002a, B:91:0x019f, B:93:0x01b5, B:94:0x01d6, B:97:0x01e3, B:83:0x0167, B:86:0x0178, B:88:0x017c, B:89:0x018b), top: B:106:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01b5 A[Catch: Exception -> 0x020e, TryCatch #0 {Exception -> 0x020e, blocks: (B:3:0x000b, B:6:0x0014, B:10:0x001e, B:11:0x0021, B:12:0x0024, B:13:0x0027, B:14:0x002a, B:91:0x019f, B:93:0x01b5, B:94:0x01d6, B:97:0x01e3, B:83:0x0167, B:86:0x0178, B:88:0x017c, B:89:0x018b), top: B:106:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:94:0x01d6 A[Catch: Exception -> 0x020e, TryCatch #0 {Exception -> 0x020e, blocks: (B:3:0x000b, B:6:0x0014, B:10:0x001e, B:11:0x0021, B:12:0x0024, B:13:0x0027, B:14:0x002a, B:91:0x019f, B:93:0x01b5, B:94:0x01d6, B:97:0x01e3, B:83:0x0167, B:86:0x0178, B:88:0x017c, B:89:0x018b), top: B:106:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:96:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:99:0x020c  */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x001e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x0021. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0024. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0027. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x002a. Please report as an issue. */
    public static Integer u(Context context, amzi amziVar) {
        int i;
        Integer numValueOf;
        aihl aihlVar;
        aihl aihlVarCheckIsLite;
        int iV;
        amziVar.getClass();
        try {
            int iV2 = atqn.V(amziVar.b);
            if (iV2 == 0) {
                iV2 = 1;
            }
            int i2 = iV2 - 1;
            if (i2 == 39) {
                i = R.attr.yt_sys_measurement_feed_col_gap_small;
            } else {
                if (i2 != 40) {
                    switch (i2) {
                        case 1:
                            i = R.attr.yt_sys_measurement_action_height_compact;
                            break;
                        case 2:
                            i = R.attr.yt_sys_measurement_action_height_hero;
                            break;
                        case 3:
                            i = R.attr.yt_sys_measurement_action_height_prominent;
                            break;
                        case 4:
                            i = R.attr.yt_sys_measurement_action_height_standard;
                            break;
                        case 5:
                            i = R.attr.yt_sys_measurement_action_height_tiny;
                            break;
                        case 6:
                            i = R.attr.yt_sys_measurement_feed_col_gap_med;
                            break;
                        case 7:
                            i = R.attr.yt_sys_measurement_feed_col_gap_wide;
                            break;
                        case 8:
                            i = R.attr.yt_sys_measurement_feed_margin_med;
                            break;
                        case 9:
                            i = R.attr.yt_sys_measurement_feed_margin_small;
                            break;
                        case 10:
                            i = R.attr.yt_sys_measurement_feed_margin_wide;
                            break;
                        case 11:
                            i = R.attr.yt_sys_measurement_feed_max_width_med;
                            break;
                        case 12:
                            i = R.attr.yt_sys_measurement_feed_max_width_wide;
                            break;
                        case 13:
                            i = R.attr.yt_sys_measurement_feed_row_gap_med;
                            break;
                        case 14:
                            i = R.attr.yt_sys_measurement_feed_row_gap_small;
                            break;
                        case 15:
                            i = R.attr.yt_sys_measurement_feed_row_gap_wide;
                            break;
                        case 16:
                            i = R.attr.yt_sys_measurement_shelf_item_gap_med;
                            break;
                        case 17:
                            i = R.attr.yt_sys_measurement_shelf_item_gap_small;
                            break;
                        case 18:
                            i = R.attr.yt_sys_measurement_shelf_item_gap_wide;
                            break;
                        case 19:
                            i = R.attr.yt_sys_measurement_shelf_peek_med;
                            break;
                        case 20:
                            i = R.attr.yt_sys_measurement_shelf_peek_small;
                            break;
                        case 21:
                            i = R.attr.yt_sys_measurement_shelf_peek_wide;
                            break;
                        default:
                            switch (i2) {
                                case 50:
                                    i = R.attr.yt_sys_measurement_size_comfortable;
                                    break;
                                case 51:
                                    i = R.attr.yt_sys_measurement_size_compact;
                                    break;
                                case 52:
                                    i = R.attr.yt_sys_measurement_size_cozy;
                                    break;
                                case 53:
                                    i = R.attr.yt_sys_measurement_size_expanded;
                                    break;
                                case 54:
                                    i = R.attr.yt_sys_measurement_size_hairline;
                                    break;
                                case 55:
                                    i = R.attr.yt_sys_measurement_size_hero;
                                    break;
                                case 56:
                                    i = R.attr.yt_sys_measurement_size_prominent;
                                    break;
                                default:
                                    switch (i2) {
                                        case 68:
                                            i = R.attr.yt_sys_measurement_avatar_size_comfortable;
                                            break;
                                        case 69:
                                            i = R.attr.yt_sys_measurement_avatar_size_compact;
                                            break;
                                        case 70:
                                            i = R.attr.yt_sys_measurement_avatar_size_condensed;
                                            break;
                                        case 71:
                                            i = R.attr.yt_sys_measurement_avatar_size_cozy;
                                            break;
                                        case 72:
                                            i = R.attr.yt_sys_measurement_avatar_size_expanded;
                                            break;
                                        case 73:
                                            i = R.attr.yt_sys_measurement_avatar_size_hero;
                                            break;
                                        case 74:
                                            i = R.attr.yt_sys_measurement_avatar_size_huge;
                                            break;
                                        case 75:
                                            i = R.attr.yt_sys_measurement_avatar_size_legend;
                                            break;
                                        case 76:
                                            i = R.attr.yt_sys_measurement_avatar_size_max;
                                            break;
                                        case 77:
                                            i = R.attr.yt_sys_measurement_avatar_size_mini;
                                            break;
                                        case 78:
                                            i = R.attr.yt_sys_measurement_avatar_size_prominent;
                                            break;
                                        default:
                                            switch (i2) {
                                                case 82:
                                                    i = R.attr.yt_sys_measurement_icon_size_comfortable;
                                                    break;
                                                case 83:
                                                    i = R.attr.yt_sys_measurement_icon_size_compact;
                                                    break;
                                                case 84:
                                                    i = R.attr.yt_sys_measurement_icon_size_condensed;
                                                    break;
                                                case 85:
                                                    i = R.attr.yt_sys_measurement_icon_size_cozy;
                                                    break;
                                                case 86:
                                                    i = R.attr.yt_sys_measurement_icon_size_expanded;
                                                    break;
                                                case 87:
                                                    i = R.attr.yt_sys_measurement_icon_size_mini;
                                                    break;
                                                case 88:
                                                    i = R.attr.yt_sys_measurement_radius_comfortable;
                                                    break;
                                                case 89:
                                                    i = R.attr.yt_sys_measurement_radius_compact;
                                                    break;
                                                case 90:
                                                    i = R.attr.yt_sys_measurement_radius_condensed;
                                                    break;
                                                case 91:
                                                    i = R.attr.yt_sys_measurement_radius_cozy;
                                                    break;
                                                case 92:
                                                    i = R.attr.yt_sys_measurement_radius_expanded;
                                                    break;
                                                case 93:
                                                    i = R.attr.yt_sys_measurement_radius_hero;
                                                    break;
                                                case 94:
                                                    i = R.attr.yt_sys_measurement_radius_huge;
                                                    break;
                                                case 95:
                                                    i = R.attr.yt_sys_measurement_radius_prominent;
                                                    break;
                                                case 96:
                                                    i = R.attr.yt_sys_measurement_size_condensed;
                                                    break;
                                                default:
                                                    switch (i2) {
                                                        case 98:
                                                            i = R.attr.yt_sys_measurement_stroke_comfortable;
                                                            break;
                                                        case 99:
                                                            i = R.attr.yt_sys_measurement_stroke_expanded;
                                                            break;
                                                        case 100:
                                                            i = R.attr.yt_sys_measurement_size_huge;
                                                            break;
                                                        case 101:
                                                            i = R.attr.yt_sys_measurement_size_legend;
                                                            break;
                                                        case 102:
                                                            i = R.attr.yt_sys_measurement_size_mini;
                                                            break;
                                                        case 103:
                                                            i = R.attr.yt_sys_measurement_size_tiny;
                                                            break;
                                                        case 104:
                                                            i = R.attr.yt_sys_measurement_stroke_cozy;
                                                            break;
                                                        case 105:
                                                            i = R.attr.yt_sys_measurement_radius_max;
                                                            break;
                                                        case 106:
                                                            i = R.attr.yt_sys_measurement_radius_min;
                                                            break;
                                                        case 107:
                                                            i = R.attr.yt_sys_measurement_icon_size_hero;
                                                            break;
                                                        case 108:
                                                            i = R.attr.yt_sys_measurement_size_min;
                                                            break;
                                                        default:
                                                            numValueOf = null;
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    if (numValueOf == null) {
                        return numValueOf;
                    }
                    aihlVar = amzj.a;
                    aihlVar.getClass();
                    aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
                    amziVar.c(aihlVarCheckIsLite);
                    if (amziVar.j.n(aihlVarCheckIsLite.d)) {
                        aihlVar.getClass();
                        return Integer.valueOf(Math.round(((Float) aext.x(amziVar, aihlVar)).floatValue() * context.getResources().getDisplayMetrics().density));
                    }
                    zvj zvjVarA = zvk.a();
                    iV = atqn.V(amziVar.b);
                    if (iV == 0) {
                        iV = 1;
                    }
                    zvjVarA.d("Exception resolving measurement token: " + atqn.U(iV) + '.');
                    zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
                    zvjVarA.j = 75;
                    zvjVarA.i = 428;
                    zvs.a(zvjVarA.a());
                    return null;
                }
                i = R.attr.yt_sys_measurement_icon_size_prominent;
            }
            TypedValue typedValue = new TypedValue();
            if (context.getTheme().resolveAttribute(i, typedValue, true)) {
                numValueOf = typedValue.resourceId != 0 ? Integer.valueOf(context.getResources().getDimensionPixelSize(typedValue.resourceId)) : Integer.valueOf(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
            } else {
                numValueOf = null;
            }
            if (numValueOf == null) {
                return numValueOf;
            }
            aihlVar = amzj.a;
            aihlVar.getClass();
            aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
            amziVar.c(aihlVarCheckIsLite);
            if (amziVar.j.n(aihlVarCheckIsLite.d)) {
                aihlVar.getClass();
                return Integer.valueOf(Math.round(((Float) aext.x(amziVar, aihlVar)).floatValue() * context.getResources().getDisplayMetrics().density));
            }
            zvj zvjVarA2 = zvk.a();
            iV = atqn.V(amziVar.b);
            if (iV == 0) {
                iV = 1;
            }
            zvjVarA2.d("Exception resolving measurement token: " + atqn.U(iV) + '.');
            zvjVarA2.c(ajtv.ERROR_LEVEL_ERROR);
            zvjVarA2.j = 75;
            zvjVarA2.i = 428;
            zvs.a(zvjVarA2.a());
            return null;
        } catch (Exception e) {
            zvj zvjVarA3 = zvk.a();
            int iV3 = atqn.V(amziVar.b);
            int i3 = iV3 != 0 ? iV3 : 1;
            zvjVarA3.d("Exception resolving measurement token: " + atqn.U(i3) + ". Failed with exception: " + e.getMessage());
            zvjVarA3.c(ajtv.ERROR_LEVEL_ERROR);
            zvjVarA3.j = 75;
            zvjVarA3.i = 428;
            zvjVarA3.f(e);
            zvs.a(zvjVarA3.a());
            return null;
        }
    }

    public static Integer v(Context context, int i) {
        int i2 = i - 1;
        if (i2 == 112) {
            return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_mobile_dark_outline_rim));
        }
        switch (i2) {
            case 1:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_additive_background));
            case 2:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_additive_background_inverse));
            case 3:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_mobile_dark_default_base_background));
            case 4:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_brand_red_contrast));
            case 5:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_button_chip_background_hover));
            case 6:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_call_to_action));
            case 7:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_call_to_action_hover));
            case 8:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_call_to_action_inverse));
            case 9:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_error_background_red));
            case 10:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_error_indicator));
            case 11:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_error_indicator_inverse));
            case 12:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_default_genai_1));
            case 13:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_default_genai_1_additive));
            case 14:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_default_genai_2));
            case 15:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_default_genai_2_additive));
            case 16:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_default_genai_3));
            case 17:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_default_genai_3_additive));
            case 18:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_default_genai_4));
            case 19:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_default_genai_4_additive));
            case 20:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_inverted_background));
            case 21:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_inverted_background_hover));
            case 22:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_keyboard_background));
            case 23:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_keyboard_background_action));
            case 24:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_keyboard_background_bar));
            case 25:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_keyboard_background_emoji));
            case 26:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_keyboard_background_key));
            case 27:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_keyboard_background_key_alt));
            case 28:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_keyboard_background_switch));
            case 29:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_keyboard_divider));
            case 30:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_keyboard_text_action));
            case 31:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_keyboard_text_character));
            case 32:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_keyboard_text_chevron));
            case 33:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_keyboard_text_icon));
            case 34:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_keyboard_text_symbol));
            case 35:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_menu_background));
            case 36:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_mobile_dark_default_default_default_outline));
            case 37:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_default_outline_inverse));
            case 38:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_overlay_additive_background));
            case 39:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_mobile_dark_default_overlay_background_brand));
            case 40:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_overlay_background_extra_light));
            case 41:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_mobile_dark_default_default_overlay_background_heavy));
            case 42:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_mobile_dark_default_default_overlay_background_light));
            case 43:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_mobile_dark_default_default_overlay_background_medium));
            case 44:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_mobile_dark_default_default_overlay_background_medium_light));
            case 45:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_overlay_background_solid));
            case 46:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_mobile_dark_default_default_overlay_button_primary));
            case 47:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_mobile_dark_default_default_overlay_button_secondary));
            case 48:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_overlay_call_to_action));
            case 49:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_overlay_green));
            case 50:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_mobile_dark_default_default_overlay_text_disabled));
            case 51:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_overlay_text_primary));
            case 52:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_mobile_dark_default_default_overlay_text_secondary));
            case 53:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_mobile_dark_default_raised_background));
            case 54:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_red_indicator));
            case 55:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_static_black));
            case 56:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_static_brand_black));
            case 57:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_static_brand_red));
            case 58:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_static_brand_white));
            case 59:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_static_clear_black));
            case 60:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_static_clear_color));
            case 61:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_static_grey));
            case 62:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_static_white_background));
            case 63:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_status_bar));
            case 64:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_suggested_action));
            case 65:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_suggested_action_hover));
            case 66:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_suggested_action_inverse));
            case 67:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_system_bar));
            case 68:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_text_disabled));
            case 69:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_text_disabled_inverse));
            case 70:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_text_primary));
            case 71:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_mobile_dark_default_default_text_primary_inverse));
            case 72:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_text_secondary));
            case 73:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_mobile_dark_default_text_secondary_inverse));
            case 74:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_themed_green));
            case 75:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_themed_green_inverse));
            case 76:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_themed_overlay_background));
            case 77:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_touch_response));
            case 78:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_touch_response_inverse));
            case 79:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_wordmark_text));
            case 80:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_background_complete));
            case 81:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_background_warning));
            case 82:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_frosted_glass_desktop));
            case 83:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_frosted_glass_mobile));
            case 84:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_mono_filled_hover));
            case 85:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_mono_filled_hover_inverse));
            case 86:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_mono_tonal_hover));
            case 87:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_mono_tonal_hover_inverse));
            case 88:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_default_outline_inverse_opaque));
            case 89:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_outline_opaque));
            case 90:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_overlay_background_medium_heavy));
            case 91:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_overlay_button_secondary_darker));
            case 92:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_overlay_call_to_action_hover));
            case 93:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_overlay_filled_hover));
            case 94:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_default_overlay_text_primary_inverse));
            case 95:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_overlay_tonal_hover));
            case 96:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_overlay_touch_response));
            case 97:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_overlay_touch_response_inverse));
            case 98:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_shadow_medium));
            case 99:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_text_complete));
            case 100:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_text_error));
            case 101:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_text_warning));
            case 102:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_feed_vibrant_gradient1));
            case 103:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_feed_vibrant_gradient2));
            case 104:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_feed_vibrant_gradient3));
            case 105:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_static_ad_yellow));
            case 106:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_static_magenta));
            case 107:
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_static_medium_magenta));
            default:
                switch (i2) {
                    case 117:
                        return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_overlay_outline_rim));
                    case 118:
                        return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_outline_rim_inverse));
                    case 119:
                        return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_overlay_outline));
                    case 120:
                        return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_overlay_outline_inverse));
                    case 121:
                        return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_overlay_outline_rim_inverse));
                    case 122:
                        return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_default_overlay_solid_background));
                    case 123:
                        return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_overlay_solid_background_inverse));
                    case com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                        return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_overlay_solid_rim));
                    case com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                        return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_overlay_solid_rim_inverse));
                    case com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                        return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_overlay_solid_wash));
                    case 127:
                        return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_overlay_solid_wash_inverse));
                    case SemanticState.Focused /* 128 */:
                        return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_overlay_tonal_background));
                    case 129:
                        return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_overlay_tonal_background_inverse));
                    case 130:
                        return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_overlay_tonal_rim));
                    case 131:
                        return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_overlay_tonal_rim_inverse));
                    case 132:
                        return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_overlay_tonal_wash));
                    case 133:
                        return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_overlay_tonal_wash_inverse));
                    case 134:
                        return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_default_solid_background));
                    case 135:
                        return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_default_solid_background_inverse));
                    case 136:
                        return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_mobile_dark_solid_rim));
                    case 137:
                        return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_solid_rim_inverse));
                    case 138:
                        return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_mobile_dark_solid_wash));
                    case 139:
                        return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_solid_wash_inverse));
                    case 140:
                        return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_tonal_background));
                    case 141:
                        return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_tonal_background_inverse));
                    case 142:
                        return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_mobile_dark_tonal_rim));
                    case 143:
                        return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_tonal_rim_inverse));
                    case 144:
                        return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_mobile_dark_tonal_wash));
                    case 145:
                        return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_tonal_wash_inverse));
                    case 146:
                        return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_static_dark_grey));
                    case 147:
                        return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_icon_warning));
                    case 148:
                        return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_blue_4));
                    case 149:
                        return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_green_6));
                    case 150:
                        return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_grey_4));
                    case 151:
                        return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_grey_6));
                    case 152:
                        return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_purple_6));
                    case 153:
                        return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_red_3));
                    case 154:
                        return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_red_4));
                    case 155:
                        return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_blue_1));
                    case 156:
                        return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_blue_2));
                    case 157:
                        return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_blue_3));
                    case 158:
                        return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_blue_5));
                    case 159:
                        return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_blue_6));
                    case 160:
                        return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_dark_blue_7));
                    default:
                        return null;
                }
        }
    }

    public static agke w(anfy anfyVar, Object obj, hef hefVar, jnj jnjVar) {
        agjz agjzVar = new agjz(4);
        Iterator it = anfyVar.c.iterator();
        while (it.hasNext()) {
            agjzVar.j(aM((anfv) it.next(), obj, hefVar, jnjVar));
        }
        return agjzVar.g();
    }

    public static boolean x(anfy anfyVar, Object obj, hef hefVar, jnj jnjVar) {
        Iterator it = anfyVar.c.iterator();
        while (it.hasNext()) {
            if (!aM((anfv) it.next(), obj, hefVar, jnjVar).isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public static opg y(RecyclerView recyclerView) {
        boolean z;
        ovi adgdVar;
        np npVar = recyclerView.n;
        if (npVar == null || !(((z = npVar instanceof FlowLayoutManager)) || (npVar instanceof GridLayoutManager) || (npVar instanceof LinearLayoutManager))) {
            return null;
        }
        boolean z2 = npVar instanceof GridLayoutManager;
        int i = 0;
        if (z2) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) npVar;
            recyclerView.getClass();
            int iE = recyclerView.e();
            for (int i2 = 0; i2 < iE; i2++) {
                qa qaVarAF = recyclerView.aF(i2);
                qaVarAF.getClass();
                if (qaVarAF instanceof adus) {
                    i = ((adus) qaVarAF).a;
                    break;
                }
            }
            adgdVar = new adgd(gridLayoutManager, i);
        } else if (z) {
            adgdVar = new adgc((FlowLayoutManager) npVar, 0);
        } else {
            adgdVar = z2 ? new adgd((GridLayoutManager) npVar, 0) : nus.a(npVar);
        }
        return adgdVar.a();
    }

    public static agev z(nrv nrvVar) {
        return aN(nrvVar.g, nrvVar.d, nrvVar.h, nrvVar.k);
    }

    public void a(wgd wgdVar, boolean z) {
        throw null;
    }

    public aecm(byte[] bArr) {
    }
}
