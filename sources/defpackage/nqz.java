package defpackage;

import android.content.Context;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.research.xeno.effect.Effect;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nqz {
    public static /* synthetic */ String a(int i) {
        switch (i) {
            case 1:
                return "TAP";
            case 2:
                return "DOUBLE_TAP";
            case 3:
                return "LONG_PRESS";
            case 4:
                return "CONTEXT_CLICK";
            case 5:
                return "DRAG";
            case 6:
                return "DRAG_ENDED";
            case 7:
                return "SWIPE";
            case 8:
                return "SCALE";
            case 9:
                return "SCALE_ENDED";
            case 10:
                return "ROTATE";
            case 11:
                return "ROTATE_ENDED";
            case 12:
                return "FIRST_VISIBLE";
            case 13:
                return "VISIBLE";
            case 14:
                return "HIDDEN";
            case 15:
                return "TOUCH_UP";
            case 16:
                return "TOUCH_DOWN";
            case 17:
                return "TOUCH_MOVED";
            case 18:
                return "TOUCH_CANCELLED";
            case 19:
                return "FOCUS_CHANGED";
            case 20:
                return "DETACHED";
            case 21:
                return "KEYBOARD_ACTION";
            case 22:
                return "HOVER_ENTER";
            case 23:
                return "HOVER_EXIT";
            default:
                return "null";
        }
    }

    public static final /* synthetic */ pzn b(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (pzn) aihnVarBuild;
    }

    public static final void c(aihf aihfVar) {
        List listUnmodifiableList = DesugarCollections.unmodifiableList(((pzn) aihfVar.instance).b);
        listUnmodifiableList.getClass();
        new aikl(listUnmodifiableList);
    }

    public static final boolean d(String str, String str2) {
        return str.length() > 0 && awrc.c(str, str2);
    }

    public static final awml e(Context context, aidx aidxVar) {
        int i;
        double d;
        double dC;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.enlarged_image_notification_icon_size);
        float f = aidxVar.d;
        if (f == 0.0f) {
            d = dimensionPixelSize;
            dC = auuw.a.io().a();
        } else {
            if (f <= auuw.b()) {
                if (aidxVar.d < auuw.c()) {
                    d = dimensionPixelSize;
                    dC = auuw.c();
                } else {
                    i = (int) (aidxVar.d * dimensionPixelSize);
                }
                return new awml(Integer.valueOf(i), Integer.valueOf(dimensionPixelSize));
            }
            d = dimensionPixelSize;
            dC = auuw.b();
        }
        i = (int) (dC * d);
        return new awml(Integer.valueOf(i), Integer.valueOf(dimensionPixelSize));
    }

    public static final boolean f(aieg aiegVar, float f, aidg aidgVar) {
        aidf aidfVar = aidgVar.h;
        if (aidfVar == null) {
            aidfVar = aidf.a;
        }
        if (a.aS(aidfVar.b) == 3) {
            return false;
        }
        boolean z = f != 0.0f;
        if (f != 0.0f && f < 1.0f) {
            return false;
        }
        aidf aidfVar2 = aidgVar.h;
        if (aidfVar2 == null) {
            aidfVar2 = aidf.a;
        }
        float f2 = (aidfVar2.b == 1 ? (aidd) aidfVar2.c : aidd.a).b;
        if (aidgVar.d.size() != 1) {
            return false;
        }
        aiie aiieVar = aidgVar.d;
        aiieVar.getClass();
        Object objAd = atqq.ad(aiieVar);
        objAd.getClass();
        aieg aiegVar2 = (aieg) objAd;
        String str = aiegVar.b;
        str.getClass();
        String str2 = aiegVar2.b;
        str2.getClass();
        if (!d(str, str2)) {
            String str3 = aiegVar.d;
            str3.getClass();
            String str4 = aiegVar2.d;
            str4.getClass();
            if (!d(str3, str4)) {
                return false;
            }
        }
        return !z || f == f2;
    }

    public static List g(List list, boolean z, qua quaVar) {
        if (list.size() < 2 || !z) {
            return list;
        }
        int i = 1;
        for (int i2 = 1; i2 < list.size(); i2++) {
            if (quaVar.T && !((clo) list.get(i2)).i) {
                i = i2;
                break;
            }
        }
        return list.subList(i, list.size());
    }

    public static asjv h(agke agkeVar) {
        if (agkeVar.isEmpty()) {
            return asjv.a;
        }
        Stream map = Collection.EL.stream(agkeVar).map(new qzp(5));
        Collector collector = aghu.a;
        agke agkeVar2 = (agke) map.collect(collector);
        aihf aihfVarCreateBuilder = asjv.a.createBuilder();
        Iterable iterable = (Iterable) Collection.EL.stream(agkeVar2).flatMap(new qzp(6)).collect(collector);
        aihfVarCreateBuilder.copyOnWrite();
        asjv asjvVar = (asjv) aihfVarCreateBuilder.instance;
        asjvVar.a();
        aifs.addAll(iterable, asjvVar.d);
        return (asjv) aihfVarCreateBuilder.build();
    }

    public static Effect i(Set set, AtomicReference atomicReference) {
        jrq jrqVar = (jrq) atup.a.createBuilder();
        aihf aihfVarCreateBuilder = atty.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        atty attyVar = (atty) aihfVarCreateBuilder.instance;
        attyVar.b |= 1;
        attyVar.e = "gl_skia_stickers_calculator_runtime_options";
        aihf aihfVarCreateBuilder2 = attw.a.createBuilder();
        aihh aihhVar = (aihh) atwa.a.createBuilder();
        aihhVar.e(atrc.b, atrc.a);
        aihfVarCreateBuilder2.copyOnWrite();
        attw attwVar = (attw) aihfVarCreateBuilder2.instance;
        atwa atwaVar = (atwa) aihhVar.build();
        atwaVar.getClass();
        attwVar.c = atwaVar;
        attwVar.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        atty attyVar2 = (atty) aihfVarCreateBuilder.instance;
        attw attwVar2 = (attw) aihfVarCreateBuilder2.build();
        attwVar2.getClass();
        attyVar2.d = attwVar2;
        attyVar2.c = 7;
        jrqVar.n(aihfVarCreateBuilder);
        jrqVar.copyOnWrite();
        atup atupVar = (atup) jrqVar.instance;
        atupVar.b();
        aifs.addAll(set, atupVar.b);
        aihh aihhVar2 = (aihh) atte.a.createBuilder();
        aihhVar2.copyOnWrite();
        atte atteVar = (atte) aihhVar2.instance;
        atteVar.b |= 2;
        atteVar.d = "input_frames";
        aihhVar2.copyOnWrite();
        atte atteVar2 = (atte) aihhVar2.instance;
        atteVar2.b |= 4;
        atteVar2.e = "presentation_timestamps";
        aihhVar2.copyOnWrite();
        atte atteVar3 = (atte) aihhVar2.instance;
        atteVar3.b |= 8;
        atteVar3.f = "output_frames";
        aihhVar2.copyOnWrite();
        atte atteVar4 = (atte) aihhVar2.instance;
        atteVar4.d();
        atteVar4.l.add("gl_skia_stickers_calculator_output_info");
        atsf atsfVar = atsf.a;
        aihhVar2.copyOnWrite();
        atte atteVar5 = (atte) aihhVar2.instance;
        atsfVar.getClass();
        atteVar5.n = atsfVar;
        atteVar5.b |= SemanticState.LiveRegion;
        aihhVar2.copyOnWrite();
        atte atteVar6 = (atte) aihhVar2.instance;
        atup atupVar2 = (atup) jrqVar.build();
        atupVar2.getClass();
        atteVar6.o = atupVar2;
        atteVar6.b |= SemanticState.ReadOnly;
        aihf aihfVarCreateBuilder3 = ahnl.a.createBuilder();
        aihfVarCreateBuilder3.ao("input_frames");
        aihfVarCreateBuilder3.ao("presentation_timestamps");
        aihfVarCreateBuilder3.ao("gl_skia_stickers_calculator_runtime_options");
        aihfVarCreateBuilder3.an("options");
        aihfVarCreateBuilder3.copyOnWrite();
        ahnl ahnlVar = (ahnl) aihfVarCreateBuilder3.instance;
        aiie aiieVar = ahnlVar.d;
        if (!aiieVar.c()) {
            ahnlVar.d = aihn.mutableCopy(aiieVar);
        }
        ahnlVar.d.add("gl_skia_stickers_calculator_output_info");
        aihf aihfVarCreateBuilder4 = ahnk.a.createBuilder();
        aihfVarCreateBuilder4.copyOnWrite();
        ((ahnk) aihfVarCreateBuilder4.instance).c = "GlSkiaStickersCalculator";
        aihfVarCreateBuilder4.aq("IMAGE:input_frames");
        aihfVarCreateBuilder4.aq("PRESENTATION_TIME_MICROSECONDS:presentation_timestamps");
        aihfVarCreateBuilder4.aq("RUNTIME_OPTIONS:gl_skia_stickers_calculator_runtime_options");
        aihfVarCreateBuilder4.ap("OPTIONS:options");
        aihfVarCreateBuilder4.ar("OUTPUT_IMAGE:output_frames");
        aihfVarCreateBuilder4.ar("OUTPUT_INFO:gl_skia_stickers_calculator_output_info");
        aihfVarCreateBuilder3.bm(aihfVarCreateBuilder4);
        aihhVar2.copyOnWrite();
        atte atteVar7 = (atte) aihhVar2.instance;
        ahnl ahnlVar2 = (ahnl) aihfVarCreateBuilder3.build();
        ahnlVar2.getClass();
        atteVar7.c = ahnlVar2;
        atteVar7.b |= 1;
        atte atteVar8 = (atte) aihhVar2.build();
        ahub ahubVar = Effect.d;
        AtomicReference atomicReference2 = new AtomicReference();
        Effect.nativeLoadLocal(atteVar8.toByteArray(), new atsy(atomicReference2, atomicReference, 1));
        return (Effect) atomicReference2.get();
    }

    public static final rar j(qup qupVar, int i, raq raqVar) {
        quu quuVar = (quu) qupVar.b;
        if (quuVar instanceof quv) {
            return new ras(qupVar, i, raqVar);
        }
        if (quuVar instanceof quy) {
            return new rax(qupVar, i, raqVar);
        }
        if (quuVar instanceof qux) {
            return new rau(qupVar, i, raqVar);
        }
        if (quuVar instanceof quw) {
            return new rat(qupVar, i, raqVar);
        }
        throw new IllegalArgumentException("Unsupported GraphicalSegment type for GraphicalSegmentSkiaConverterFactory.");
    }
}
