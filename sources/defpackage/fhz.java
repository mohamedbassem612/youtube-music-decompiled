package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import app.rive.semantics.SemanticState;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.widget.LithoScrollView;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class fhz {
    public static yw a;
    public static abk b;
    public static yx c;
    public static acv d;
    public static acb e;
    public static fsz f;
    public static isw g;
    public static volatile fmb h;
    public static isw i;
    public static isw j;
    public static isw k;
    private static isw l;

    public fhz() {
    }

    public static boolean A(ajwo ajwoVar) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(araw.a);
        ajwoVar.c(aihlVarCheckIsLite);
        return ajwoVar.j.n(aihlVarCheckIsLite.d);
    }

    public static boolean B(ajwo ajwoVar) {
        if (ajwoVar != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aqrr.b);
            ajwoVar.c(aihlVarCheckIsLite);
            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                return true;
            }
        }
        return false;
    }

    public static anpv C(Context context, aliz alizVar, int i2, anpu... anpuVarArr) {
        aihf aihfVarCreateBuilder = anpv.b.createBuilder();
        for (anpu anpuVar : anpuVarArr) {
            aihfVarCreateBuilder.copyOnWrite();
            anpv anpvVar = (anpv) aihfVarCreateBuilder.instance;
            anpuVar.getClass();
            aihv aihvVar = anpvVar.f;
            if (!aihvVar.c()) {
                anpvVar.f = aihn.mutableCopy(aihvVar);
            }
            anpvVar.f.h(anpuVar.d);
        }
        aihh aihhVar = (aihh) alja.a.createBuilder();
        aihhVar.copyOnWrite();
        alja aljaVar = (alja) aihhVar.instance;
        aljaVar.c = alizVar.yN;
        aljaVar.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        anpv anpvVar2 = (anpv) aihfVarCreateBuilder.instance;
        alja aljaVar2 = (alja) aihhVar.build();
        aljaVar2.getClass();
        anpvVar2.d = aljaVar2;
        anpvVar2.c |= 4;
        aihf aihfVarCreateBuilder2 = aiqe.a.createBuilder();
        aihf aihfVarCreateBuilder3 = aiqd.a.createBuilder();
        String string = context.getString(i2);
        aihfVarCreateBuilder3.copyOnWrite();
        aiqd aiqdVar = (aiqd) aihfVarCreateBuilder3.instance;
        string.getClass();
        aiqdVar.b |= 2;
        aiqdVar.c = string;
        aihfVarCreateBuilder2.copyOnWrite();
        aiqe aiqeVar = (aiqe) aihfVarCreateBuilder2.instance;
        aiqd aiqdVar2 = (aiqd) aihfVarCreateBuilder3.build();
        aiqdVar2.getClass();
        aiqeVar.c = aiqdVar2;
        aiqeVar.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        anpv anpvVar3 = (anpv) aihfVarCreateBuilder.instance;
        aiqe aiqeVar2 = (aiqe) aihfVarCreateBuilder2.build();
        aiqeVar2.getClass();
        anpvVar3.e = aiqeVar2;
        anpvVar3.c |= 8;
        return (anpv) aihfVarCreateBuilder.build();
    }

    public static anpv D(Context context) {
        return C(context, aliz.MUSIC_EXPLICIT_BADGE, R.string.explicit_badge_content_desc, new anpu[0]);
    }

    public static anpv E(Context context) {
        return C(context, aliz.RSS, R.string.explicit_badge_content_desc, anpu.MUSIC_INLINE_BADGE_DISPLAY_MODE_PLAYBACK_QUEUE, anpu.MUSIC_INLINE_BADGE_DISPLAY_MODE_PLAYER);
    }

    public static apji F(anpv anpvVar) {
        aihh aihhVar = (aihh) apji.a.createBuilder();
        aihhVar.e(anpw.a, anpvVar);
        return (apji) aihhVar.build();
    }

    public static apji G(Context context) {
        return F(D(context));
    }

    public static apji H(Context context) {
        return F(E(context));
    }

    public static alay I(Context context, int i2) {
        return ackj.d(context.getString(i2));
    }

    public static akyo J(ajwo ajwoVar) {
        ahno.F(K(ajwoVar));
        aihl aihlVarCheckIsLite = aihn.checkIsLite(akyq.a);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        return (akyo) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
    }

    public static boolean K(ajwo ajwoVar) {
        if (ajwoVar != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(akyq.a);
            ajwoVar.c(aihlVarCheckIsLite);
            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                return true;
            }
        }
        return false;
    }

    public static Object L(ajwo ajwoVar, aigw aigwVar) {
        ahno.F(M(ajwoVar, aigwVar));
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aigwVar);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        return objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK);
    }

    public static boolean M(ajwo ajwoVar, aigw aigwVar) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aigwVar);
        ajwoVar.c(aihlVarCheckIsLite);
        return ajwoVar.j.n(aihlVarCheckIsLite.d);
    }

    public static ajnf N(String str, ajwo ajwoVar) {
        aihh aihhVar = (aihh) ajnf.a.createBuilder();
        alay alayVarC = ackj.c(str);
        aihhVar.copyOnWrite();
        ajnf ajnfVar = (ajnf) aihhVar.instance;
        alayVarC.getClass();
        ajnfVar.m = alayVarC;
        ajnfVar.b |= 64;
        aihhVar.copyOnWrite();
        ajnf ajnfVar2 = (ajnf) aihhVar.instance;
        ajwoVar.getClass();
        ajnfVar2.s = ajwoVar;
        ajnfVar2.b |= SemanticState.Multiline;
        return (ajnf) aihhVar.build();
    }

    public static aiwz O(ajwo ajwoVar) {
        ahno.F(R(ajwoVar));
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aiwz.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        return (aiwz) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
    }

    public static ajwo P(String str) {
        aihf aihfVarCreateBuilder = aiwz.a.createBuilder();
        aihf aihfVarCreateBuilder2 = aixa.a.createBuilder();
        aihh aihhVar = (aihh) aoda.a.createBuilder();
        alay alayVarC = ackj.c(str);
        aihhVar.copyOnWrite();
        aoda aodaVar = (aoda) aihhVar.instance;
        alayVarC.getClass();
        aodaVar.c = alayVarC;
        aodaVar.b |= 1;
        aoda aodaVar2 = (aoda) aihhVar.build();
        aihfVarCreateBuilder2.copyOnWrite();
        aixa aixaVar = (aixa) aihfVarCreateBuilder2.instance;
        aodaVar2.getClass();
        aixaVar.c = aodaVar2;
        aixaVar.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        aiwz aiwzVar = (aiwz) aihfVarCreateBuilder.instance;
        aixa aixaVar2 = (aixa) aihfVarCreateBuilder2.build();
        aixaVar2.getClass();
        aiwzVar.d = aixaVar2;
        aiwzVar.c |= 1;
        return aF((aiwz) aihfVarCreateBuilder.build());
    }

    public static ajwo Q(String str, String str2, ajwo ajwoVar) {
        aihf aihfVarCreateBuilder = aiwz.a.createBuilder();
        aihf aihfVarCreateBuilder2 = aixa.a.createBuilder();
        aihf aihfVarCreateBuilder3 = aocd.a.createBuilder();
        alay alayVarC = ackj.c(str);
        aihfVarCreateBuilder3.copyOnWrite();
        aocd aocdVar = (aocd) aihfVarCreateBuilder3.instance;
        alayVarC.getClass();
        aocdVar.c = alayVarC;
        aocdVar.b |= 1;
        aihf aihfVarCreateBuilder4 = ajng.a.createBuilder();
        ajnf ajnfVarN = N(str2, ajwoVar);
        aihfVarCreateBuilder4.copyOnWrite();
        ajng ajngVar = (ajng) aihfVarCreateBuilder4.instance;
        ajnfVarN.getClass();
        ajngVar.c = ajnfVarN;
        ajngVar.b |= 1;
        aihfVarCreateBuilder3.copyOnWrite();
        aocd aocdVar2 = (aocd) aihfVarCreateBuilder3.instance;
        ajng ajngVar2 = (ajng) aihfVarCreateBuilder4.build();
        ajngVar2.getClass();
        aocdVar2.d = ajngVar2;
        aocdVar2.b |= 4;
        aocd aocdVar3 = (aocd) aihfVarCreateBuilder3.build();
        aihfVarCreateBuilder2.copyOnWrite();
        aixa aixaVar = (aixa) aihfVarCreateBuilder2.instance;
        aocdVar3.getClass();
        aixaVar.d = aocdVar3;
        aixaVar.b |= 2;
        aihfVarCreateBuilder.copyOnWrite();
        aiwz aiwzVar = (aiwz) aihfVarCreateBuilder.instance;
        aixa aixaVar2 = (aixa) aihfVarCreateBuilder2.build();
        aixaVar2.getClass();
        aiwzVar.d = aixaVar2;
        aiwzVar.c |= 1;
        return aF((aiwz) aihfVarCreateBuilder.build());
    }

    public static boolean R(ajwo ajwoVar) {
        if (ajwoVar != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aiwz.b);
            ajwoVar.c(aihlVarCheckIsLite);
            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                return true;
            }
        }
        return false;
    }

    public static ajnf S(wgi wgiVar) {
        aorw aorwVarZ = Z(wgiVar);
        if (aorwVarZ != null && (aorwVarZ.c & 1073741824) != 0) {
            apji apjiVar = aorwVarZ.n;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(ajnp.a);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                apji apjiVar2 = aorwVarZ.n;
                if (apjiVar2 == null) {
                    apjiVar2 = apji.a;
                }
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajnp.a);
                apjiVar2.c(aihlVarCheckIsLite2);
                Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                return (ajnf) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x0038  */
    public static ajwo T(String str, boolean z) {
        String str2;
        typ.f(str);
        switch (str) {
            case "PPAD":
                str2 = "FEmusic_offline_songs";
                break;
            case "PPOM":
                str2 = "FEoffline_mixtape";
                break;
            case "PPSE":
                str2 = "FEoffline_nma_tracks";
                break;
            case "PPSV":
                str2 = "FEoffline_songs";
                break;
            default:
                str2 = String.format("VL%s", str);
                break;
        }
        aihh aihhVar = (aihh) vxh.b(str2).toBuilder();
        aihf builder = ((ajmf) aihhVar.b(ajmj.a)).toBuilder();
        aihf aihfVarCreateBuilder = ajmh.a.createBuilder();
        aihf aihfVarCreateBuilder2 = ajmg.a.createBuilder();
        int i2 = true != z ? 4 : 2;
        aihfVarCreateBuilder2.copyOnWrite();
        ajmg ajmgVar = (ajmg) aihfVarCreateBuilder2.instance;
        ajmgVar.c = i2 - 1;
        ajmgVar.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        ajmh ajmhVar = (ajmh) aihfVarCreateBuilder.instance;
        ajmg ajmgVar2 = (ajmg) aihfVarCreateBuilder2.build();
        ajmgVar2.getClass();
        ajmhVar.c = ajmgVar2;
        ajmhVar.b |= 16;
        builder.copyOnWrite();
        ajmf ajmfVar = (ajmf) builder.instance;
        ajmh ajmhVar2 = (ajmh) aihfVarCreateBuilder.build();
        ajmhVar2.getClass();
        ajmfVar.g = ajmhVar2;
        ajmfVar.b |= 32;
        aihhVar.e(ajmj.a, (ajmf) builder.build());
        return (ajwo) aihhVar.build();
    }

    public static ajwo U(String str) {
        aihh aihhVar = (aihh) ajwo.a.createBuilder();
        aihl aihlVar = apni.a;
        aihh aihhVar2 = (aihh) apng.a.createBuilder();
        aihhVar2.copyOnWrite();
        apng apngVar = (apng) aihhVar2.instance;
        str.getClass();
        apngVar.b |= 1;
        apngVar.c = str;
        aihhVar.e(aihlVar, (apng) aihhVar2.build());
        return (ajwo) aihhVar.build();
    }

    public static ajwo V(String str, String str2, int i2) {
        aihh aihhVar = (aihh) U(str).toBuilder();
        aihl aihlVar = aoaq.b;
        aihf aihfVarCreateBuilder = aoar.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aoar aoarVar = (aoar) aihfVarCreateBuilder.instance;
        str2.getClass();
        aoarVar.b |= 1;
        aoarVar.c = str2;
        aihfVarCreateBuilder.copyOnWrite();
        aoar aoarVar2 = (aoar) aihfVarCreateBuilder.instance;
        aoarVar2.b |= 2;
        aoarVar2.d = i2;
        aihhVar.e(aihlVar, (aoar) aihfVarCreateBuilder.build());
        return (ajwo) aihhVar.build();
    }

    public static amks W(wgi wgiVar) {
        aorw aorwVarZ = Z(wgiVar);
        if (aorwVarZ != null) {
            for (aorn aornVar : aorwVarZ.d) {
                if ((aornVar.b & 4) != 0) {
                    amks amksVar = aornVar.d;
                    return amksVar == null ? amks.a : amksVar;
                }
            }
        }
        return null;
    }

    public static aoia X(Context context) {
        aihf aihfVarCreateBuilder = aoia.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aoia aoiaVar = (aoia) aihfVarCreateBuilder.instance;
        aoiaVar.b |= 1;
        aoiaVar.c = true;
        int i2 = 0;
        while (true) {
            List list = gzm.b;
            if (i2 >= list.size()) {
                return (aoia) aihfVarCreateBuilder.build();
            }
            aihf aihfVarCreateBuilder2 = aohw.a.createBuilder();
            aohx aohxVar = (aohx) list.get(i2);
            int iB = aaus.b(aohxVar);
            alay alayVarD = ackj.d(iB == -1 ? "" : context.getString(iB));
            aihfVarCreateBuilder2.copyOnWrite();
            aohw aohwVar = (aohw) aihfVarCreateBuilder2.instance;
            alayVarD.getClass();
            aohwVar.c = alayVarD;
            aohwVar.b |= 1;
            aihfVarCreateBuilder2.copyOnWrite();
            aohw aohwVar2 = (aohw) aihfVarCreateBuilder2.instance;
            aohwVar2.e = aohxVar.l;
            aohwVar2.b |= 4;
            aihfVarCreateBuilder.copyOnWrite();
            aoia aoiaVar2 = (aoia) aihfVarCreateBuilder.instance;
            aohw aohwVar3 = (aohw) aihfVarCreateBuilder2.build();
            aohwVar3.getClass();
            aiie aiieVar = aoiaVar2.e;
            if (!aiieVar.c()) {
                aoiaVar2.e = aihn.mutableCopy(aiieVar);
            }
            aoiaVar2.e.add(aohwVar3);
            i2++;
        }
    }

    public static aoia Y(Object obj) {
        if (obj instanceof aoun) {
            aoun aounVar = (aoun) obj;
            aoum aoumVar = aounVar.u;
            if (aoumVar == null) {
                aoumVar = aoum.a;
            }
            if (aoumVar.b != 60572968) {
                return null;
            }
            aoum aoumVar2 = aounVar.u;
            if (aoumVar2 == null) {
                aoumVar2 = aoum.a;
            }
            return aoumVar2.b == 60572968 ? (aoia) aoumVar2.c : aoia.a;
        }
        if (obj instanceof wjf) {
            wjf wjfVar = (wjf) obj;
            if (wjfVar.t() == null) {
                return null;
            }
            alvh alvhVar = wjfVar.t().p;
            if (alvhVar == null) {
                alvhVar = alvh.a;
            }
            if (alvhVar.b != 60572968) {
                return null;
            }
            alvh alvhVar2 = wjfVar.t().p;
            if (alvhVar2 == null) {
                alvhVar2 = alvh.a;
            }
            return alvhVar2.b == 60572968 ? (aoia) alvhVar2.c : aoia.a;
        }
        if (obj instanceof anzn) {
            anzn anznVar = (anzn) obj;
            apji apjiVar = anznVar.o;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aoic.a);
            apjiVar.c(aihlVarCheckIsLite);
            if (!apjiVar.j.n(aihlVarCheckIsLite.d)) {
                return null;
            }
            apji apjiVar2 = anznVar.o;
            if (apjiVar2 == null) {
                apjiVar2 = apji.a;
            }
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aoic.a);
            apjiVar2.c(aihlVarCheckIsLite2);
            Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
            return (aoia) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        }
        if (!(obj instanceof anzi)) {
            if (obj instanceof hyw) {
                return ((hyw) obj).d();
            }
            return null;
        }
        anzi anziVar = (anzi) obj;
        apji apjiVar3 = anziVar.s;
        if (apjiVar3 == null) {
            apjiVar3 = apji.a;
        }
        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aoic.a);
        apjiVar3.c(aihlVarCheckIsLite3);
        if (!apjiVar3.j.n(aihlVarCheckIsLite3.d)) {
            return null;
        }
        apji apjiVar4 = anziVar.s;
        if (apjiVar4 == null) {
            apjiVar4 = apji.a;
        }
        aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aoic.a);
        apjiVar4.c(aihlVarCheckIsLite4);
        Object objK2 = apjiVar4.j.k(aihlVarCheckIsLite4.d);
        return (aoia) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2));
    }

    public static aorw Z(wgi wgiVar) {
        if (wgiVar == null) {
            return null;
        }
        return wgiVar.g;
    }

    public static void a(fip fipVar, View view, MotionEvent motionEvent) {
        gzj.aS();
        isw iswVar = l;
        if (iswVar == null) {
            iswVar = new isw();
            l = iswVar;
        }
        iswVar.a = motionEvent;
        iswVar.b = view;
        fipVar.b.n().z(fipVar, l);
        isw iswVar2 = l;
        iswVar2.a = null;
        iswVar2.b = null;
    }

    public static fyo aA(fyo fyoVar, kwq kwqVar, fys fysVar, Boolean bool, Boolean bool2) {
        fyo fyoVar2 = new fyo();
        Iterator itK = fyoVar.k();
        while (itK.hasNext()) {
            int iIntValue = ((Integer) itK.next()).intValue();
            if (fyoVar.s(iIntValue)) {
                fyy fyyVarA = fysVar.a(kwqVar, Arrays.asList(fyoVar.e(iIntValue), new fyr(Double.valueOf(iIntValue)), fyoVar));
                if (fyyVarA.g().equals(bool)) {
                    break;
                }
                if (bool2 == null || fyyVarA.g().equals(bool2)) {
                    fyoVar2.q(iIntValue, fyyVarA);
                }
            }
        }
        return fyoVar2;
    }

    public static fyy aB(fyo fyoVar, kwq kwqVar, List list, boolean z) {
        fyy fyyVarA;
        int i2;
        fxw.k("reduce", 1, list);
        fxw.l("reduce", 2, list);
        fyy fyyVarV = kwqVar.v((fyy) list.get(0));
        if (!(fyyVarV instanceof fys)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (list.size() == 2) {
            fyyVarA = kwqVar.v((fyy) list.get(1));
            if (fyyVarA instanceof fyq) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (fyoVar.c() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            fyyVarA = null;
        }
        fys fysVar = (fys) fyyVarV;
        int iC = fyoVar.c() - 1;
        if (z) {
            i2 = 0;
        } else {
            i2 = iC;
            iC = 0;
        }
        int i3 = true == z ? 1 : -1;
        if (fyyVarA == null) {
            fyyVarA = fyoVar.e(i2);
            i2 += i3;
        }
        while ((iC - i2) * i3 >= 0) {
            if (fyoVar.s(i2)) {
                fyyVarA = fysVar.a(kwqVar, Arrays.asList(fyyVarA, fyoVar.e(i2), new fyr(Double.valueOf(i2)), fyoVar));
                if (fyyVarA instanceof fyq) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i2 += i3;
            } else {
                i2 += i3;
            }
        }
        return fyyVarA;
    }

    public static fyy aC(fyu fyuVar, fyy fyyVar, kwq kwqVar, List list) {
        String str = ((fzb) fyyVar).a;
        if (fyuVar.t(str)) {
            fyy fyyVarF = fyuVar.f(str);
            if (fyyVarF instanceof fys) {
                return ((fys) fyyVarF).a(kwqVar, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", str));
        }
        if (!"hasOwnProperty".equals(str)) {
            throw new IllegalArgumentException(String.format("Object has no function %s", str));
        }
        fxw.i("hasOwnProperty", 1, list);
        return fyuVar.t(kwqVar.v((fyy) list.get(0)).i()) ? fyy.k : fyy.l;
    }

    private static void aD(fhu fhuVar, int i2, StringBuilder sb) {
        if (fhuVar != null) {
            sb.append(fhuVar.c().c());
            sb.append('{');
            fjw fjwVarH = fhuVar.h();
            kyr kyrVarO = fhuVar.o();
            sb.append((fjwVarH == null || fjwVarH.getVisibility() != 0) ? "H" : "V");
            if (kyrVarO != null && kyrVarO.G() != null) {
                sb.append(" [clickable]");
            }
            if (kyrVarO != null) {
                sb.append(' ');
                fwo fwoVar = ((fji) kyrVarO.a).e;
                sb.append(fwoVar.a());
                sb.append('x');
                sb.append(fwoVar.b());
            }
            sb.append('}');
            for (fhu fhuVar2 : fhuVar.m()) {
                sb.append('\n');
                for (int i3 = 0; i3 <= i2; i3++) {
                    sb.append("  ");
                }
                aD(fhuVar2, i2 + 1, sb);
            }
        }
    }

    private static boolean aE(int i2, int i3, ByteBuffer byteBuffer) {
        return byteBuffer.remaining() - i2 >= i3;
    }

    private static ajwo aF(aiwz aiwzVar) {
        aihh aihhVar = (aihh) ajwo.a.createBuilder();
        aihhVar.e(aiwz.b, aiwzVar);
        return (ajwo) aihhVar.build();
    }

    private static String aG(ajwo ajwoVar) {
        if (ajwoVar == null) {
            return null;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(arik.a);
        ajwoVar.c(aihlVarCheckIsLite);
        if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(arik.a);
            ajwoVar.c(aihlVarCheckIsLite2);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
            return ((arij) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).e;
        }
        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(arix.a);
        ajwoVar.c(aihlVarCheckIsLite3);
        if (ajwoVar.j.n(aihlVarCheckIsLite3.d)) {
            aihl aihlVarCheckIsLite4 = aihn.checkIsLite(arix.a);
            ajwoVar.c(aihlVarCheckIsLite4);
            Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite4.d);
            return ((ariw) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2))).c;
        }
        aihl aihlVarCheckIsLite5 = aihn.checkIsLite(aohu.a);
        ajwoVar.c(aihlVarCheckIsLite5);
        if (ajwoVar.j.n(aihlVarCheckIsLite5.d)) {
            aihl aihlVarCheckIsLite6 = aihn.checkIsLite(aohu.a);
            ajwoVar.c(aihlVarCheckIsLite6);
            Object objK3 = ajwoVar.j.k(aihlVarCheckIsLite6.d);
            String str = ((aoht) (objK3 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK3))).d;
            if (TextUtils.isEmpty(str) || "PPSV".equals(str)) {
                return null;
            }
            return str;
        }
        aihl aihlVarCheckIsLite7 = aihn.checkIsLite(ajmj.a);
        ajwoVar.c(aihlVarCheckIsLite7);
        if (!ajwoVar.j.n(aihlVarCheckIsLite7.d)) {
            return null;
        }
        aihl aihlVarCheckIsLite8 = aihn.checkIsLite(ajmj.a);
        ajwoVar.c(aihlVarCheckIsLite8);
        Object objK4 = ajwoVar.j.k(aihlVarCheckIsLite8.d);
        String str2 = ((ajmf) (objK4 == null ? aihlVarCheckIsLite8.b : aihlVarCheckIsLite8.c(objK4))).c;
        if (str2.startsWith("VL")) {
            return str2.substring(2);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        if (r2.j.n(r0.d) == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String aH(defpackage.ajwo r2) {
        /*
            if (r2 == 0) goto L28
            aihl r0 = defpackage.aohu.a
            aihl r0 = defpackage.aihn.m61$$Nest$smcheckIsLite(r0)
            r2.c(r0)
            aiha r1 = r2.j
            aihk r0 = r0.d
            boolean r0 = r1.n(r0)
            if (r0 != 0) goto L2a
            aihl r0 = defpackage.arik.a
            aihl r0 = defpackage.aihn.m61$$Nest$smcheckIsLite(r0)
            r2.c(r0)
            aiha r1 = r2.j
            aihk r0 = r0.d
            boolean r0 = r1.n(r0)
            if (r0 != 0) goto L2a
        L28:
            r2 = 0
            goto L7a
        L2a:
            aihl r0 = defpackage.aohu.a
            aihl r0 = defpackage.aihn.m61$$Nest$smcheckIsLite(r0)
            r2.c(r0)
            aiha r1 = r2.j
            aihk r0 = r0.d
            boolean r0 = r1.n(r0)
            if (r0 == 0) goto L5c
            aihl r0 = defpackage.aohu.a
            aihl r0 = defpackage.aihn.m61$$Nest$smcheckIsLite(r0)
            r2.c(r0)
            aiha r2 = r2.j
            aihk r1 = r0.d
            java.lang.Object r2 = r2.k(r1)
            if (r2 != 0) goto L53
            java.lang.Object r2 = r0.b
            goto L57
        L53:
            java.lang.Object r2 = r0.c(r2)
        L57:
            aoht r2 = (defpackage.aoht) r2
            java.lang.String r2 = r2.c
            goto L7a
        L5c:
            aihl r0 = defpackage.arik.a
            aihl r0 = defpackage.aihn.m61$$Nest$smcheckIsLite(r0)
            r2.c(r0)
            aiha r2 = r2.j
            aihk r1 = r0.d
            java.lang.Object r2 = r2.k(r1)
            if (r2 != 0) goto L72
            java.lang.Object r2 = r0.b
            goto L76
        L72:
            java.lang.Object r2 = r0.c(r2)
        L76:
            arij r2 = (defpackage.arij) r2
            java.lang.String r2 = r2.d
        L7a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhz.aH(ajwo):java.lang.String");
    }

    private static int aI(np npVar, View view) {
        if (view == null) {
            return -1;
        }
        return npVar.getPosition(view);
    }

    public static aouj aa(amae amaeVar) {
        for (aftj aftjVar : ah(amaeVar)) {
            aqjg aqjgVar = ((aqjj) aftjVar.b).i;
            if (aqjgVar == null) {
                aqjgVar = aqjg.a;
            }
            anvq anvqVar = aqjgVar.e;
            if (anvqVar == null) {
                anvqVar = anvq.a;
            }
            apji apjiVar = anvqVar.c;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aouq.a);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                aqjg aqjgVar2 = ((aqjj) aftjVar.b).i;
                if (aqjgVar2 == null) {
                    aqjgVar2 = aqjg.a;
                }
                anvq anvqVar2 = aqjgVar2.e;
                if (anvqVar2 == null) {
                    anvqVar2 = anvq.a;
                }
                apji apjiVar2 = anvqVar2.c;
                if (apjiVar2 == null) {
                    apjiVar2 = apji.a;
                }
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aouq.a);
                apjiVar2.c(aihlVarCheckIsLite2);
                Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                return (aouj) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            }
        }
        return null;
    }

    public static aouj ab(amae amaeVar) {
        if (amaeVar == null) {
            return null;
        }
        aouj aoujVarAa = aa(amaeVar);
        return aoujVarAa == null ? ac(amaeVar) : aoujVarAa;
    }

    public static aouj ac(amae amaeVar) {
        amaf amafVar = amaeVar.e;
        if (amafVar == null) {
            amafVar = amaf.a;
        }
        alzp alzpVar = (amafVar.b == 125354411 ? (alzq) amafVar.c : alzq.a).c;
        if (alzpVar == null) {
            alzpVar = alzp.a;
        }
        if (alzpVar.b != 50631000) {
            return null;
        }
        amaf amafVar2 = amaeVar.e;
        if (amafVar2 == null) {
            amafVar2 = amaf.a;
        }
        alzp alzpVar2 = (amafVar2.b == 125354411 ? (alzq) amafVar2.c : alzq.a).c;
        if (alzpVar2 == null) {
            alzpVar2 = alzp.a;
        }
        return alzpVar2.b == 50631000 ? (aouj) alzpVar2.c : aouj.a;
    }

    public static Optional ad(wgi wgiVar, String str) {
        if (wgiVar != null) {
            amae amaeVar = wgiVar.a;
            if ((amaeVar.b & SemanticState.LiveRegion) != 0) {
                amab amabVar = amaeVar.m;
                if (amabVar == null) {
                    amabVar = amab.a;
                }
                if (amabVar.b == 152873793) {
                    amab amabVar2 = amaeVar.m;
                    if (amabVar2 == null) {
                        amabVar2 = amab.a;
                    }
                    aqof aqofVar = amabVar2.b == 152873793 ? (aqof) amabVar2.c : aqof.a;
                    return str.equals(aqofVar.l) ? Optional.of(aqofVar) : Optional.empty();
                }
            }
        }
        return Optional.empty();
    }

    public static String ae(Object obj) {
        anfy anfyVar;
        if (obj instanceof wgi) {
            return aG(((wgi) obj).d);
        }
        if (obj instanceof aouj) {
            return ((aouj) obj).i;
        }
        if (obj instanceof aosu) {
            aosu aosuVar = (aosu) obj;
            if ((aosuVar.b & 1) != 0) {
                return aosuVar.c;
            }
        } else if (obj instanceof anne) {
            anne anneVar = (anne) obj;
            apji apjiVar = anneVar.i;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(angi.a);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                apji apjiVar2 = anneVar.i;
                if (apjiVar2 == null) {
                    apjiVar2 = apji.a;
                }
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(angi.a);
                apjiVar2.c(aihlVarCheckIsLite2);
                Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                anfyVar = (anfy) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            } else {
                anfyVar = null;
            }
            if (anfyVar != null) {
                for (anfv anfvVar : anfyVar.c) {
                    anga angaVar = anfvVar.b == 66441155 ? (anga) anfvVar.c : anga.a;
                    ajwo ajwoVar = angaVar.e;
                    if (ajwoVar == null) {
                        ajwoVar = ajwo.a;
                    }
                    aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aofx.b);
                    ajwoVar.c(aihlVarCheckIsLite3);
                    if (ajwoVar.j.n(aihlVarCheckIsLite3.d)) {
                        ajwo ajwoVar2 = angaVar.e;
                        if (ajwoVar2 == null) {
                            ajwoVar2 = ajwo.a;
                        }
                        aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aofx.b);
                        ajwoVar2.c(aihlVarCheckIsLite4);
                        Object objK2 = ajwoVar2.j.k(aihlVarCheckIsLite4.d);
                        return ((aofx) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2))).d;
                    }
                }
                Iterator it = anfyVar.d.iterator();
                while (it.hasNext()) {
                    ajnf ajnfVar = ((angf) it.next()).c;
                    if (ajnfVar == null) {
                        ajnfVar = ajnf.a;
                    }
                    ajwo ajwoVar3 = ajnfVar.q;
                    if (ajwoVar3 == null) {
                        ajwoVar3 = ajwo.a;
                    }
                    aihl aihlVarCheckIsLite5 = aihn.checkIsLite(aofx.b);
                    ajwoVar3.c(aihlVarCheckIsLite5);
                    if (ajwoVar3.j.n(aihlVarCheckIsLite5.d)) {
                        aihl aihlVarCheckIsLite6 = aihn.checkIsLite(aofx.b);
                        ajwoVar3.c(aihlVarCheckIsLite6);
                        Object objK3 = ajwoVar3.j.k(aihlVarCheckIsLite6.d);
                        return ((aofx) (objK3 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK3))).d;
                    }
                }
            }
        } else if (obj instanceof anzi) {
            ajwo ajwoVar4 = ((anzi) obj).i;
            if (ajwoVar4 == null) {
                ajwoVar4 = ajwo.a;
            }
            return aG(ajwoVar4);
        }
        return null;
    }

    public static String af(ajwo ajwoVar) {
        if (!aj(ajwoVar)) {
            return "";
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apni.a);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        return ((apng) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).c;
    }

    public static String ag(Object obj) {
        if (obj instanceof aoun) {
            ajwo ajwoVar = ((aoun) obj).l;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
            return aH(ajwoVar);
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof wjf) {
            return ((wjf) obj).G();
        }
        if (!(obj instanceof anzi)) {
            return null;
        }
        ajwo ajwoVar2 = ((anzi) obj).i;
        if (ajwoVar2 == null) {
            ajwoVar2 = ajwo.a;
        }
        return aH(ajwoVar2);
    }

    public static List ah(amae amaeVar) {
        ArrayList arrayList = new ArrayList();
        amaf amafVar = amaeVar.e;
        if (amafVar == null) {
            amafVar = amaf.a;
        }
        apji apjiVar = (amafVar.b == 125354411 ? (alzq) amafVar.c : alzq.a).d;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(amaj.a);
        apjiVar.c(aihlVarCheckIsLite);
        Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
        for (amah amahVar : ((amai) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).b) {
            int i2 = amahVar.b;
            if (i2 == 58174010) {
                arrayList.add(new aftj(i2 == 58174010 ? (aqjj) amahVar.c : aqjj.a));
            }
        }
        return arrayList;
    }

    public static boolean ai(ajwo ajwoVar) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aoaq.b);
        ajwoVar.c(aihlVarCheckIsLite);
        return ajwoVar.j.n(aihlVarCheckIsLite.d);
    }

    public static boolean aj(ajwo ajwoVar) {
        if (ajwoVar != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(apni.a);
            ajwoVar.c(aihlVarCheckIsLite);
            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean ak(int i2, int[] iArr, boolean[] zArr) {
        if (!zArr[0]) {
            try {
                iArr[0] = 3;
            } catch (Throwable unused) {
            }
            zArr[0] = true;
        }
        return iArr != null && i2 == iArr[0];
    }

    public static vxc al(aunn aunnVar) {
        return new rnn((vxe) aunnVar.io(), 13);
    }

    public static Intent am(zwa zwaVar) {
        return new Intent("com.google.android.gms.accountsettings.action.VIEW_SETTINGS").setPackage("com.google.android.gms").putExtra("extra.screenId", 212).putExtra("extra.utmSource", "YouTubeMusic").putExtra("extra.accountName", zwaVar instanceof rlt ? ((rlt) zwaVar).b : "");
    }

    public static String an(ajmf ajmfVar) {
        return String.format("%s%s%s%s", goa.PLAYLIST.j, ajmfVar.c, ajmfVar.d, Boolean.valueOf(ajmfVar.f));
    }

    public static /* synthetic */ List ao(wfy wfyVar) {
        almd almdVar;
        ArrayList arrayList = new ArrayList();
        if (wfyVar != null && (almdVar = wfyVar.a) != null && !almdVar.r.isEmpty()) {
            arrayList.addAll(almdVar.r);
        }
        return arrayList;
    }

    public static void ap(gfp gfpVar, ajwo ajwoVar) {
        ajwoVar.getClass();
        gnl gnlVar = gnl.a;
        gnlVar.getClass();
        gfpVar.e(ajwoVar, null, gnlVar);
    }

    public static void aq(int i2, String str) {
        zvp.a(zvn.b, zvm.n, str + " This happened " + i2 + " times. ");
    }

    public static Iterator ar(Map map) {
        return new fyt(map.keySet().iterator());
    }

    public static fyy as(ljb ljbVar) {
        fyy fzbVar;
        if (ljbVar == null) {
            return fyy.f;
        }
        int iBc = a.bc(ljbVar.c);
        if (iBc == 0) {
            iBc = 1;
        }
        int i2 = iBc - 1;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
                    }
                    aiie aiieVar = ljbVar.d;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = aiieVar.iterator();
                    while (it.hasNext()) {
                        arrayList.add(as((ljb) it.next()));
                    }
                    fzbVar = new fyz(ljbVar.e, arrayList);
                } else {
                    if ((ljbVar.b & 8) == 0) {
                        return new fyp(null);
                    }
                    fzbVar = new fyp(Boolean.valueOf(ljbVar.g));
                }
            } else {
                if ((ljbVar.b & 16) == 0) {
                    return new fyr(null);
                }
                fzbVar = new fyr(Double.valueOf(ljbVar.h));
            }
        } else {
            if ((ljbVar.b & 4) == 0) {
                return fyy.m;
            }
            fzbVar = new fzb(fxw.f(ljbVar.f));
        }
        return fzbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [fyp] */
    /* JADX WARN: Type inference failed for: r0v11, types: [fyr] */
    /* JADX WARN: Type inference failed for: r0v12, types: [fyr] */
    /* JADX WARN: Type inference failed for: r0v13, types: [fyr] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15, types: [fzb] */
    /* JADX WARN: Type inference failed for: r0v8, types: [fyo] */
    /* JADX WARN: Type inference failed for: r0v9, types: [fyv] */
    /* JADX WARN: Type inference failed for: r5v11, types: [fyy] */
    public static fyy at(Object obj) {
        ?? fyoVar;
        if (obj == null) {
            return fyy.g;
        }
        if (obj instanceof String) {
            fyoVar = new fzb(fxw.f((String) obj));
        } else if (obj instanceof Double) {
            fyoVar = new fyr((Double) obj);
        } else if (obj instanceof Long) {
            fyoVar = new fyr(Double.valueOf(((Long) obj).doubleValue()));
        } else if (obj instanceof Integer) {
            fyoVar = new fyr(Double.valueOf(((Integer) obj).doubleValue()));
        } else if (obj instanceof Boolean) {
            fyoVar = new fyp((Boolean) obj);
        } else if (obj instanceof Map) {
            fyoVar = new fyv();
            Map map = (Map) obj;
            for (Object string : map.keySet()) {
                fyy fyyVarAt = at(map.get(string));
                if (string != null) {
                    if (!(string instanceof String)) {
                        string = string.toString();
                    }
                    fyoVar.r((String) string, fyyVarAt);
                }
            }
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            fyoVar = new fyo();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                fyoVar.n(at(it.next()));
            }
        }
        return fyoVar;
    }

    public static String au(int i2) {
        String str;
        int size = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            str = "AT_MOST";
        } else if (mode == 1073741824) {
            str = "EXACTLY";
        } else {
            str = mode == 0 ? "UNSPECIFIED" : "INVALID";
        }
        return String.format(Locale.US, "[%d, %s]", Integer.valueOf(size), str);
    }

    public static void av(fhd fhdVar, int i2, int i3, fkw fkwVar, ComponentTree componentTree, fgy fgyVar, boolean z, boolean z2) {
        if (z && (!z2 || View.MeasureSpec.getMode(i3) != Integer.MIN_VALUE)) {
            fmc fmcVarAE = fmd.aE(fhdVar);
            fmcVarAE.c(fgyVar);
            fmcVarAE.R(View.MeasureSpec.getSize(i3));
            fgyVar = fmcVarAE.a();
        }
        componentTree.u(fgyVar, i2, 0, fkwVar);
        int mode = View.MeasureSpec.getMode(i3);
        if (mode == Integer.MIN_VALUE) {
            fkwVar.b = Math.max(0, Math.min(View.MeasureSpec.getSize(i3), fkwVar.b));
        } else if (mode == 1073741824) {
            fkwVar.b = View.MeasureSpec.getSize(i3);
        }
        fkwVar.a = Math.max(0, fkwVar.a);
        fkwVar.b = Math.max(0, fkwVar.b);
    }

    public static boolean ax(np npVar, RecyclerView recyclerView) {
        if (npVar.getItemCount() == 0 || npVar.getChildCount() == 0 || recyclerView == null) {
            return false;
        }
        return ((recyclerView.canScrollHorizontally(-1) || aI(npVar, npVar.getChildAt(0)) == -1) && (recyclerView.canScrollHorizontally(1) || aI(npVar, npVar.getChildAt(npVar.getChildCount() - 1)) == -1)) ? false : true;
    }

    public static vxe ay(vxa vxaVar, jnm jnmVar, Map map, xgm xgmVar) {
        ArrayList arrayList = new ArrayList();
        tzk.T(map, arrayList);
        return new hdv(jnmVar.E(tzk.S(arrayList, vxaVar)), xgmVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v10, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [awmd, java.lang.Object] */
    public static hct az(aehs aehsVar) {
        ?? r0 = aehsVar.e;
        Uri uri = hcu.a;
        cf cfVar = (cf) r0.io();
        cfVar.getClass();
        omj omjVar = (omj) aehsVar.a.io();
        omjVar.getClass();
        zwb zwbVar = (zwb) aehsVar.d.io();
        zwbVar.getClass();
        aeql aeqlVar = (aeql) aehsVar.f.io();
        aeqlVar.getClass();
        hef hefVar = (hef) aehsVar.b.io();
        hefVar.getClass();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) aehsVar.c.io();
        scheduledExecutorService.getClass();
        Executor executor = (Executor) aehsVar.i.io();
        executor.getClass();
        vxz vxzVar = (vxz) aehsVar.g.io();
        vxzVar.getClass();
        uri.getClass();
        return new hct(cfVar, omjVar, zwbVar, aeqlVar, hefVar, aehsVar.h, scheduledExecutorService, executor, vxzVar, uri);
    }

    public static String b(fhd fhdVar) {
        if (fhdVar == null) {
            return "ComponentContext is null";
        }
        fhu fhuVarF = fhu.f(fhdVar.g);
        if (fhuVarF == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        aD(fhuVarF, 0, sb);
        return sb.toString();
    }

    public static double c(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        return ((double) (((((bArr[0] << 24) & (-16777216)) | ((bArr[1] << 16) & 16711680)) | ((bArr[2] << 8) & 65280)) | (bArr[3] & 255))) / 1.073741824E9d;
    }

    public static double d(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        return ((double) (((((bArr[0] << 24) & (-16777216)) | ((bArr[1] << 16) & 16711680)) | ((bArr[2] << 8) & 65280)) | (bArr[3] & 255))) / 65536.0d;
    }

    public static long e(ByteBuffer byteBuffer) {
        long j2 = byteBuffer.getInt();
        return j2 < 0 ? j2 + 4294967296L : j2;
    }

    public static long f(ByteBuffer byteBuffer) {
        long jE = e(byteBuffer) << 32;
        if (jE >= 0) {
            return jE + e(byteBuffer);
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }

    public static void g(ByteBuffer byteBuffer) {
        byteBuffer.get();
        byteBuffer.get();
    }

    public static int i(int i2, ByteBuffer byteBuffer) {
        if (aE(i2, 4, byteBuffer)) {
            return byteBuffer.getInt(i2);
        }
        return -1;
    }

    public static short j(int i2, ByteBuffer byteBuffer) {
        if (aE(i2, 2, byteBuffer)) {
            return byteBuffer.getShort(i2);
        }
        return (short) -1;
    }

    public static String k(List list, fou fouVar) {
        ListIterator listIterator = list.listIterator();
        int i2 = 0;
        while (listIterator.hasNext()) {
            int iNextIndex = listIterator.nextIndex() + 1;
            Object next = listIterator.next();
            ListIterator listIterator2 = list.listIterator(iNextIndex);
            while (listIterator2.hasNext()) {
                Object next2 = listIterator2.next();
                if (fouVar.f(next, next2)) {
                    String simpleName = next != null ? next.getClass().getSimpleName() : "NULL";
                    gzj.br(2, "Detected duplicates in data passed to DataDiffSection. Read more here: https://fblitho.com/docs/sections/best-practices/#avoiding-indexoutofboundsexception, type: " + simpleName + ", hash: " + System.identityHashCode(next));
                    return "Duplicates are [type:" + simpleName + " hash:" + System.identityHashCode(next) + " position:" + i2 + "] and [type:" + simpleName + " hash:" + System.identityHashCode(next2) + " position:" + iNextIndex + ']';
                }
                iNextIndex++;
            }
            i2++;
        }
        return null;
    }

    public static float l(DisplayMetrics displayMetrics, int i2) {
        return (i2 / displayMetrics.density) + 0.5f;
    }

    public static int m(DisplayMetrics displayMetrics, float f2) {
        return (int) (((double) (f2 * displayMetrics.density)) + 0.5d);
    }

    public static fgy n(fhd fhdVar, List list, int i2, int i3, float f2, int i4, int i5, int i6, int i7, int i8) {
        DisplayMetrics displayMetrics = fhdVar.c().getDisplayMetrics();
        ArrayList arrayList = new ArrayList(list);
        if (i2 > i3) {
            ftm ftmVarAE = ftn.aE(fhdVar);
            ftmVarAE.d();
            ftmVarAE.m(0.0f);
            arrayList.add(((ftm) ftmVarAE.k(l(displayMetrics, i2 - i3))).a());
        } else {
            ftm ftmVarAE2 = ftn.aE(fhdVar);
            ftmVarAE2.d();
            ftmVarAE2.m(0.0f);
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            arrayList.add(((ftm) ftmVarAE2.k(f2)).a());
        }
        arrayList.addAll(list);
        if (i2 > i3) {
            ftm ftmVarAE3 = ftn.aE(fhdVar);
            ftmVarAE3.d();
            ftmVarAE3.m(0.0f);
            arrayList.add(((ftm) ftmVarAE3.k(l(displayMetrics, i2 - i3))).a());
        }
        fkr fkrVarF = fks.f(fhdVar);
        fkrVarF.d(i5);
        fkrVarF.h(i6);
        fkrVarF.g(i7);
        fkrVarF.c(i8);
        if (i4 == 4) {
            fkrVarF.aa();
        }
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            fkrVarF.f(((fgy) arrayList.get(i9)).l());
        }
        return fkrVarF.a;
    }

    public static int p(int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), Integer.MIN_VALUE);
        }
        if (mode == 0) {
            return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 0);
        }
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824);
        }
        throw new IllegalStateException("Unexpected size spec mode");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        if (r1 > r7) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        if (r1 > r7) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void q(int r6, int r7, float r8, defpackage.fkw r9) {
        /*
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            float r1 = (float) r6
            float r1 = r1 / r8
            double r1 = (double) r1
            int r3 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            double r1 = java.lang.Math.ceil(r1)
            int r1 = (int) r1
            float r2 = (float) r7
            float r2 = r2 * r8
            double r4 = (double) r2
            double r4 = java.lang.Math.ceil(r4)
            int r8 = (int) r4
            if (r0 != 0) goto L2a
            r0 = 0
            if (r3 != 0) goto L2a
            r9.a = r0
            r9.b = r0
            goto L59
        L2a:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L33
            if (r3 != r2) goto L33
            if (r1 <= r7) goto L4e
            goto L55
        L33:
            r4 = 1073741824(0x40000000, float:2.0)
            if (r0 != r4) goto L3e
            r9.a = r6
            if (r3 == 0) goto L50
            if (r1 > r7) goto L57
            goto L50
        L3e:
            if (r3 != r4) goto L4c
            r9.b = r7
            if (r0 == 0) goto L49
            if (r8 <= r6) goto L49
            r9.a = r6
            goto L59
        L49:
            r9.a = r8
            goto L59
        L4c:
            if (r0 != r2) goto L53
        L4e:
            r9.a = r6
        L50:
            r9.b = r1
            goto L59
        L53:
            if (r3 != r2) goto L59
        L55:
            r9.a = r8
        L57:
            r9.b = r7
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhz.q(int, int, float, fkw):void");
    }

    public static int r(ajwo ajwoVar) {
        if (ajwoVar == null) {
            return 6827;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(ajmj.a);
        ajwoVar.c(aihlVarCheckIsLite);
        if (!ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            return 6827;
        }
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajmj.a);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        ajmh ajmhVar = ((ajmf) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).g;
        if (ajmhVar == null) {
            ajmhVar = ajmh.a;
        }
        ajmg ajmgVar = ajmhVar.c;
        if (ajmgVar == null) {
            ajmgVar = ajmg.a;
        }
        int iJ = atqp.J(ajmgVar.c);
        if (iJ == 0) {
            iJ = 1;
        }
        int i2 = iJ - 1;
        if (i2 != 6) {
            return i2 == 7 ? 95101 : 6827;
        }
        return 95102;
    }

    public static xhc s(ajwo ajwoVar) {
        return xhb.a(r(ajwoVar));
    }

    public static amlg t(amlg amlgVar, amlg amlgVar2) {
        int iOrdinal = amlgVar2.ordinal();
        if (iOrdinal == 0) {
            amlg amlgVar3 = amlg.DISLIKE;
            if (amlgVar == amlgVar3) {
                return amlgVar3;
            }
        } else {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new RuntimeException(null, null);
                }
                amlg amlgVar4 = amlg.LIKE;
                return amlgVar != amlgVar4 ? amlg.DISLIKE : amlgVar4;
            }
            amlg amlgVar5 = amlg.LIKE;
            if (amlgVar == amlgVar5) {
                return amlgVar5;
            }
        }
        return amlg.INDIFFERENT;
    }

    public static void u(List list, agex agexVar, Map map, vxe vxeVar) {
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ajwo ajwoVar = (ajwo) it.next();
            if (agexVar.a(ajwoVar)) {
                arrayList.add(ajwoVar);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        vxeVar.d(arrayList, map);
    }

    public static boolean v(amlh amlhVar) {
        return (amlhVar == null || amlhVar.d.isEmpty()) ? false : true;
    }

    public static boolean w(amlh amlhVar) {
        return (amlhVar == null || amlhVar.c.isEmpty()) ? false : true;
    }

    public static void x(List list, List list2, Map map, vxe vxeVar, vxz vxzVar) {
        if (!vxzVar.m(8, 45661900L)) {
            u(list, new bym(10), map, vxeVar);
        }
        if (!vxzVar.l(53, 45856011L, false)) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                ajwo ajwoVar = (ajwo) it.next();
                aihl aihlVarCheckIsLite = aihn.checkIsLite(aiwz.b);
                ajwoVar.c(aihlVarCheckIsLite);
                if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                }
            }
            return;
        }
        if (list2.isEmpty()) {
            return;
        }
        vxeVar.d(list2, map);
    }

    public static String y(ajwo ajwoVar) {
        z(ajwoVar);
        aihl aihlVarCheckIsLite = aihn.checkIsLite(araw.a);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        return ((arav) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).c;
    }

    public static void z(ajwo ajwoVar) {
        ahno.F(A(ajwoVar));
    }

    public fhz(short[] sArr, char[] cArr) {
    }

    public void aw(LithoScrollView lithoScrollView) {
    }

    public void o(frc frcVar) {
    }
}
