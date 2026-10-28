package defpackage;

import android.os.AsyncTask;
import android.text.Spanned;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.research.xeno.effect.Effect;
import com.google.research.xeno.effect.RemoteAssetManager;
import j$.util.Collection;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class uyp extends AsyncTask {
    private final WeakReference a;
    private final aqhu b;

    public uyp(uys uysVar, aqhu aqhuVar) {
        this.a = new WeakReference(uysVar);
        this.b = aqhuVar;
    }

    /* JADX WARN: Code duplicated, block: B:393:0x0621 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:450:0x0624 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0152  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v126 */
    /* JADX WARN: Type inference failed for: r0v142, types: [atul] */
    /* JADX WARN: Type inference failed for: r0v162 */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v201 */
    /* JADX WARN: Type inference failed for: r0v202 */
    /* JADX WARN: Type inference failed for: r0v88, types: [atty] */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [short[]] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2, types: [ackf, android.content.Context] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r41v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r41v2 */
    /* JADX WARN: Type inference failed for: r41v3 */
    /* JADX WARN: Type inference failed for: r41v4 */
    /* JADX WARN: Type inference failed for: r41v5 */
    /* JADX WARN: Type inference failed for: r41v6 */
    /* JADX WARN: Type inference failed for: r41v7 */
    /* JADX WARN: Type inference failed for: r7v18, types: [aihf, jrq] */
    @Override // android.os.AsyncTask
    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        ?? r41;
        HashMap map;
        HashMap map2;
        Iterator it;
        int i;
        int i2;
        ?? r42;
        aiik aiikVar;
        String str;
        String str2;
        int i3;
        ?? r0;
        alex alexVar;
        aiik e;
        int i4;
        ?? r1;
        aigj aigjVar;
        int i5;
        final uys uysVar = (uys) this.a.get();
        ?? r2 = 0;
        if (uysVar == null) {
            return null;
        }
        aipg aipgVar = this.b.b;
        if (aipgVar == null) {
            aipgVar = aipg.a;
        }
        HashMap map3 = new HashMap();
        for (aiph aiphVar : aipgVar.d) {
            map3.put(aiphVar.c, aiphVar);
        }
        HashMap map4 = new HashMap();
        for (aipf aipfVar : aipgVar.c) {
            map4.put(aipfVar.c, aipfVar);
        }
        Iterator it2 = aipgVar.b.iterator();
        while (it2.hasNext()) {
            aipi aipiVar = (aipi) it2.next();
            int i6 = 4;
            if ((aipiVar.b & 4) != 0 && !aipiVar.e.isEmpty()) {
                String str3 = aipiVar.e;
            }
            int i7 = 8;
            if ((aipiVar.b & 8) != 0 && !aipiVar.f.isEmpty()) {
                String str4 = aipiVar.f;
            }
            zf zfVar = new zf((short[]) r2);
            apji apjiVar = aipiVar.d;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(akri.a);
            apjiVar.c(aihlVarCheckIsLite);
            Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
            for (apji apjiVar2 : ((akrh) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).b) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(akrg.a);
                apjiVar2.c(aihlVarCheckIsLite2);
                Object objK2 = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                akrf akrfVar = (akrf) (objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2));
                final String str5 = akrfVar.b;
                uxp uxpVarA = uxp.a(uysVar.f, str5);
                if (uxpVarA == null) {
                    alay alayVar = akrfVar.c;
                    if (alayVar == null) {
                        alayVar = alay.a;
                    }
                    Spanned spannedK = ackj.k(r2, alayVar, r2, false);
                    ?? string = spannedK == null ? r2 : spannedK.toString();
                    if (TextUtils.isEmpty(str5) || TextUtils.isEmpty(string)) {
                        r42 = r2;
                        map = map3;
                        map2 = map4;
                        it = it2;
                        i = i6;
                        i2 = i7;
                        String strCa = a.ca(string, str5, "Invalid effect from server: ID: ", " Label: ");
                        zvp.b(zvn.b, zvm.j, strCa, new Exception());
                        ((agrc) ((agrc) uys.a.b()).k("com/google/android/libraries/youtube/creation/effects/innertube/XenoEffectsLoader", "internalSetSwazzleEffectsSettings", 429, "XenoEffectsLoader.java")).w("%s", strCa);
                        r2 = r42;
                        i7 = i2;
                        i6 = i;
                        map3 = map;
                        map4 = map2;
                        it2 = it;
                    } else {
                        final uxp uxpVar = new uxp(str5, string, true, false);
                        aqmh aqmhVar = akrfVar.d;
                        if (aqmhVar == null) {
                            aqmhVar = aqmh.a;
                        }
                        if (aqmhVar.c.size() > 0) {
                            aqmg aqmgVar = (aqmg) aqmhVar.c.get(0);
                            if ((aqmgVar.b & 1) != 0) {
                                String str6 = aqmgVar.c;
                                uysVar.m.put(str5, new File(RemoteAssetManager.nativeGetExpectedCachedAssetPath(uysVar.c.d, str6)));
                                uysVar.n.add(str6);
                            }
                        }
                        aipf aipfVar2 = (aipf) map4.get(str5);
                        if (aipfVar2 == null) {
                            ((agrc) ((agrc) uys.a.b()).k("com/google/android/libraries/youtube/creation/effects/innertube/XenoEffectsLoader", "internalSetSwazzleEffectsSettings", 445, "XenoEffectsLoader.java")).w("Missing effect definition with id: %s", str5);
                        } else {
                            uxpVar.b = aipfVar2.d;
                            aiph aiphVar2 = (aiph) map3.get(aipfVar2.e);
                            if (aiphVar2 == null) {
                                ((agrc) ((agrc) uys.a.b()).k("com/google/android/libraries/youtube/creation/effects/innertube/XenoEffectsLoader", "internalSetSwazzleEffectsSettings", 451, "XenoEffectsLoader.java")).w("Missing graph for effect: %s", str5);
                            } else {
                                try {
                                    aihh aihhVar = (aihh) atte.a.createBuilder();
                                    i2 = i7;
                                    try {
                                        ahnl ahnlVar = (ahnl) aihn.parseFrom(ahnl.a, aiphVar2.h);
                                        aihhVar.copyOnWrite();
                                        atte atteVar = (atte) aihhVar.instance;
                                        ahnlVar.getClass();
                                        atteVar.c = ahnlVar;
                                        atteVar.b |= 1;
                                        if ((aiphVar2.b & 2) != 0) {
                                            try {
                                                str = aiphVar2.d;
                                            } catch (aiik e2) {
                                                aiikVar = e2;
                                                map = map3;
                                                map2 = map4;
                                                it = it2;
                                                i = i6;
                                            }
                                        } else {
                                            str = "video_input";
                                        }
                                        aihhVar.copyOnWrite();
                                        int i8 = 1;
                                        atte atteVar2 = (atte) aihhVar.instance;
                                        str.getClass();
                                        i = i6;
                                        try {
                                            atteVar2.b |= 2;
                                            atteVar2.d = str;
                                            if ((aiphVar2.b & 4) != 0) {
                                                try {
                                                    str2 = aiphVar2.f;
                                                } catch (aiik e3) {
                                                    aiikVar = e3;
                                                    map = map3;
                                                    map2 = map4;
                                                    it = it2;
                                                }
                                            } else {
                                                str2 = "video_output";
                                            }
                                            aihhVar.copyOnWrite();
                                            atte atteVar3 = (atte) aihhVar.instance;
                                            str2.getClass();
                                            atteVar3.b |= 8;
                                            atteVar3.f = str2;
                                            aihhVar.u(aiphVar2.e);
                                            int i9 = (aiphVar2.b & 8) != 0 ? aiphVar2.g : 2;
                                            aihhVar.copyOnWrite();
                                            atte atteVar4 = (atte) aihhVar.instance;
                                            atteVar4.b |= SemanticState.Hidden;
                                            atteVar4.m = i9;
                                            try {
                                                if ((aipfVar2.b & 16) != 0) {
                                                    try {
                                                        alfb alfbVar = aipfVar2.g;
                                                        if (alfbVar == null) {
                                                            alfbVar = alfb.a;
                                                        }
                                                        alfb alfbVar2 = alfbVar;
                                                        ?? r7 = (jrq) atup.a.createBuilder();
                                                        try {
                                                            for (alfa alfaVar : alfbVar2.b) {
                                                                try {
                                                                    aihf aihfVarCreateBuilder = atul.a.createBuilder();
                                                                    map = map3;
                                                                    try {
                                                                        if ((alfaVar.b & 1) != 0) {
                                                                            try {
                                                                                String str7 = alfaVar.e;
                                                                                aihfVarCreateBuilder.copyOnWrite();
                                                                                map2 = map4;
                                                                                try {
                                                                                    atul atulVar = (atul) aihfVarCreateBuilder.instance;
                                                                                    str7.getClass();
                                                                                    it = it2;
                                                                                    try {
                                                                                        atulVar.b |= 1;
                                                                                        atulVar.e = str7;
                                                                                    } catch (aiik e4) {
                                                                                        e = e4;
                                                                                        aiikVar = e;
                                                                                        ((agrc) ((agrc) ((agrc) uys.a.b()).j(aiikVar)).k("com/google/android/libraries/youtube/creation/effects/innertube/XenoEffectsLoader", "internalSetSwazzleEffectsSettings", (char) 458, "XenoEffectsLoader.java")).w("Couldn't construct Effect %s", str5);
                                                                                        r42 = r2;
                                                                                        r2 = r42;
                                                                                        i7 = i2;
                                                                                        i6 = i;
                                                                                        map3 = map;
                                                                                        map4 = map2;
                                                                                        it2 = it;
                                                                                    }
                                                                                } catch (aiik e5) {
                                                                                    e = e5;
                                                                                    it = it2;
                                                                                    aiikVar = e;
                                                                                    ((agrc) ((agrc) ((agrc) uys.a.b()).j(aiikVar)).k("com/google/android/libraries/youtube/creation/effects/innertube/XenoEffectsLoader", "internalSetSwazzleEffectsSettings", (char) 458, "XenoEffectsLoader.java")).w("Couldn't construct Effect %s", str5);
                                                                                    r42 = r2;
                                                                                    r2 = r42;
                                                                                    i7 = i2;
                                                                                    i6 = i;
                                                                                    map3 = map;
                                                                                    map4 = map2;
                                                                                    it2 = it;
                                                                                }
                                                                            } catch (aiik e6) {
                                                                                e = e6;
                                                                                map2 = map4;
                                                                                it = it2;
                                                                                aiikVar = e;
                                                                                ((agrc) ((agrc) ((agrc) uys.a.b()).j(aiikVar)).k("com/google/android/libraries/youtube/creation/effects/innertube/XenoEffectsLoader", "internalSetSwazzleEffectsSettings", (char) 458, "XenoEffectsLoader.java")).w("Couldn't construct Effect %s", str5);
                                                                                r42 = r2;
                                                                                r2 = r42;
                                                                                i7 = i2;
                                                                                i6 = i;
                                                                                map3 = map;
                                                                                map4 = map2;
                                                                                it2 = it;
                                                                            }
                                                                        } else {
                                                                            map2 = map4;
                                                                            it = it2;
                                                                        }
                                                                        try {
                                                                            int i10 = alfaVar.c;
                                                                            if (i10 == 0) {
                                                                                i4 = 6;
                                                                            } else if (i10 == 2) {
                                                                                i4 = i8;
                                                                            } else if (i10 == 3) {
                                                                                i4 = 2;
                                                                            } else if (i10 == i) {
                                                                                i4 = 3;
                                                                            } else if (i10 != 5) {
                                                                                i4 = i10 != 6 ? 0 : 5;
                                                                            } else {
                                                                                i4 = 4;
                                                                            }
                                                                            int i11 = i4 - 1;
                                                                            if (i4 == 0) {
                                                                                throw r2;
                                                                            }
                                                                            if (i11 == 0) {
                                                                                int iIntValue = i10 == 2 ? ((Integer) alfaVar.d).intValue() : 0;
                                                                                aihfVarCreateBuilder.copyOnWrite();
                                                                                atul atulVar2 = (atul) aihfVarCreateBuilder.instance;
                                                                                atulVar2.c = 2;
                                                                                atulVar2.d = Integer.valueOf(iIntValue);
                                                                            } else if (i11 == i8) {
                                                                                float fFloatValue = i10 == 3 ? ((Float) alfaVar.d).floatValue() : 0.0f;
                                                                                aihfVarCreateBuilder.copyOnWrite();
                                                                                atul atulVar3 = (atul) aihfVarCreateBuilder.instance;
                                                                                atulVar3.c = 3;
                                                                                atulVar3.d = Float.valueOf(fFloatValue);
                                                                            } else if (i11 == 2) {
                                                                                boolean zBooleanValue = i10 == 4 ? ((Boolean) alfaVar.d).booleanValue() : false;
                                                                                aihfVarCreateBuilder.copyOnWrite();
                                                                                atul atulVar4 = (atul) aihfVarCreateBuilder.instance;
                                                                                atulVar4.c = 4;
                                                                                atulVar4.d = Boolean.valueOf(zBooleanValue);
                                                                            } else if (i11 == 3) {
                                                                                String str8 = i10 == 5 ? (String) alfaVar.d : "";
                                                                                aihfVarCreateBuilder.copyOnWrite();
                                                                                atul atulVar5 = (atul) aihfVarCreateBuilder.instance;
                                                                                str8.getClass();
                                                                                atulVar5.c = 5;
                                                                                atulVar5.d = str8;
                                                                            } else if (i11 != 4) {
                                                                                ((agrc) ((agrc) uys.a.b()).k("com/google/android/libraries/youtube/creation/effects/innertube/XenoEffectsLoader", "convertSwazzleInput", 943, "XenoEffectsLoader.java")).t("Unset or unknown Input OneOf case");
                                                                            } else {
                                                                                if (i10 == 6) {
                                                                                    try {
                                                                                        aigjVar = (aigj) alfaVar.d;
                                                                                    } catch (aiik e7) {
                                                                                        ((agrc) ((agrc) ((agrc) uys.a.b()).j(e7)).k("com/google/android/libraries/youtube/creation/effects/innertube/XenoEffectsLoader", "convertSwazzleInput", (char) 939, "XenoEffectsLoader.java")).t("Invalid Calculator Options ");
                                                                                        r1 = r2;
                                                                                    }
                                                                                } else {
                                                                                    aigjVar = aigj.d;
                                                                                }
                                                                                ahnj ahnjVar = (ahnj) aihn.parseFrom(ahnj.a, aigjVar, ExtensionRegistryLite.getGeneratedRegistry());
                                                                                aihfVarCreateBuilder.copyOnWrite();
                                                                                atul atulVar6 = (atul) aihfVarCreateBuilder.instance;
                                                                                ahnjVar.getClass();
                                                                                atulVar6.d = ahnjVar;
                                                                                atulVar6.c = 6;
                                                                            }
                                                                            r1 = (atul) aihfVarCreateBuilder.build();
                                                                            if (r1 != 0) {
                                                                                r7.m(r1);
                                                                            }
                                                                            map3 = map;
                                                                            map4 = map2;
                                                                            it2 = it;
                                                                            i8 = 1;
                                                                            i = 4;
                                                                        } catch (aiik e8) {
                                                                            e = e8;
                                                                        }
                                                                    } catch (aiik e9) {
                                                                        e = e9;
                                                                        map2 = map4;
                                                                        it = it2;
                                                                        aiikVar = e;
                                                                        i = 4;
                                                                        ((agrc) ((agrc) ((agrc) uys.a.b()).j(aiikVar)).k("com/google/android/libraries/youtube/creation/effects/innertube/XenoEffectsLoader", "internalSetSwazzleEffectsSettings", (char) 458, "XenoEffectsLoader.java")).w("Couldn't construct Effect %s", str5);
                                                                        r42 = r2;
                                                                        r2 = r42;
                                                                        i7 = i2;
                                                                        i6 = i;
                                                                        map3 = map;
                                                                        map4 = map2;
                                                                        it2 = it;
                                                                    }
                                                                } catch (aiik e10) {
                                                                    e = e10;
                                                                    map = map3;
                                                                }
                                                                e = e8;
                                                                aiikVar = e;
                                                                i = 4;
                                                                ((agrc) ((agrc) ((agrc) uys.a.b()).j(aiikVar)).k("com/google/android/libraries/youtube/creation/effects/innertube/XenoEffectsLoader", "internalSetSwazzleEffectsSettings", (char) 458, "XenoEffectsLoader.java")).w("Couldn't construct Effect %s", str5);
                                                                r42 = r2;
                                                                r2 = r42;
                                                                i7 = i2;
                                                                i6 = i;
                                                                map3 = map;
                                                                map4 = map2;
                                                                it2 = it;
                                                            }
                                                            Iterator it3 = alfbVar2.c.iterator();
                                                            while (it3.hasNext()) {
                                                                alez alezVar = (alez) it3.next();
                                                                aihf aihfVarCreateBuilder2 = atty.a.createBuilder();
                                                                if ((alezVar.b & 1) != 0) {
                                                                    String str9 = alezVar.e;
                                                                    aihfVarCreateBuilder2.copyOnWrite();
                                                                    atty attyVar = (atty) aihfVarCreateBuilder2.instance;
                                                                    str9.getClass();
                                                                    attyVar.b |= 1;
                                                                    attyVar.e = str9;
                                                                }
                                                                int i12 = alezVar.c;
                                                                if (i12 != 0) {
                                                                    switch (i12) {
                                                                        case 2:
                                                                            i3 = 2;
                                                                            break;
                                                                        case 3:
                                                                            i3 = 3;
                                                                            break;
                                                                        case 4:
                                                                            i3 = 4;
                                                                            break;
                                                                        case 5:
                                                                            i3 = 5;
                                                                            break;
                                                                        case 6:
                                                                            i3 = 6;
                                                                            break;
                                                                        case 7:
                                                                            i3 = 1;
                                                                            break;
                                                                        default:
                                                                            i3 = 0;
                                                                            break;
                                                                    }
                                                                } else {
                                                                    i3 = 7;
                                                                }
                                                                int i13 = i3 - 1;
                                                                if (i3 == 0) {
                                                                    i = 4;
                                                                    throw r2;
                                                                }
                                                                if (i13 != 0) {
                                                                    if (i13 == 1) {
                                                                        aleu aleuVar = i12 == 2 ? (aleu) alezVar.d : aleu.a;
                                                                        aihf aihfVarCreateBuilder3 = attp.a.createBuilder();
                                                                        float f = aleuVar.c;
                                                                        aihfVarCreateBuilder3.copyOnWrite();
                                                                        attp attpVar = (attp) aihfVarCreateBuilder3.instance;
                                                                        attpVar.b |= 1;
                                                                        attpVar.c = f;
                                                                        if ((aleuVar.b & 2) != 0) {
                                                                            float f2 = aleuVar.d;
                                                                            aihfVarCreateBuilder3.copyOnWrite();
                                                                            attp attpVar2 = (attp) aihfVarCreateBuilder3.instance;
                                                                            attpVar2.b |= 2;
                                                                            attpVar2.d = f2;
                                                                        }
                                                                        if ((aleuVar.b & 4) != 0) {
                                                                            float f3 = aleuVar.e;
                                                                            aihfVarCreateBuilder3.copyOnWrite();
                                                                            attp attpVar3 = (attp) aihfVarCreateBuilder3.instance;
                                                                            attpVar3.b |= 4;
                                                                            attpVar3.e = f3;
                                                                        }
                                                                        aihfVarCreateBuilder2.copyOnWrite();
                                                                        atty attyVar2 = (atty) aihfVarCreateBuilder2.instance;
                                                                        attp attpVar4 = (attp) aihfVarCreateBuilder3.build();
                                                                        attpVar4.getClass();
                                                                        attyVar2.d = attpVar4;
                                                                        attyVar2.c = 3;
                                                                    } else if (i13 == 2) {
                                                                        aley aleyVar = i12 == 3 ? (aley) alezVar.d : aley.a;
                                                                        jrq jrqVar = (jrq) attx.a.createBuilder();
                                                                        String str10 = aleyVar.b;
                                                                        jrqVar.copyOnWrite();
                                                                        attx attxVar = (attx) jrqVar.instance;
                                                                        str10.getClass();
                                                                        attxVar.b |= 1;
                                                                        attxVar.c = str10;
                                                                        jrqVar.k(aleyVar.c);
                                                                        aihfVarCreateBuilder2.copyOnWrite();
                                                                        atty attyVar3 = (atty) aihfVarCreateBuilder2.instance;
                                                                        attx attxVar2 = (attx) jrqVar.build();
                                                                        attxVar2.getClass();
                                                                        attyVar3.d = attxVar2;
                                                                        attyVar3.c = 5;
                                                                    } else if (i13 == 3) {
                                                                        alet aletVar = i12 == 4 ? (alet) alezVar.d : alet.a;
                                                                        aihf aihfVarCreateBuilder4 = attm.a.createBuilder();
                                                                        boolean z = aletVar.b;
                                                                        aihfVarCreateBuilder4.copyOnWrite();
                                                                        attm attmVar = (attm) aihfVarCreateBuilder4.instance;
                                                                        attmVar.b |= 1;
                                                                        attmVar.c = z;
                                                                        aihfVarCreateBuilder2.copyOnWrite();
                                                                        atty attyVar4 = (atty) aihfVarCreateBuilder2.instance;
                                                                        attm attmVar2 = (attm) aihfVarCreateBuilder4.build();
                                                                        attmVar2.getClass();
                                                                        attyVar4.d = attmVar2;
                                                                        attyVar4.c = 4;
                                                                    } else if (i13 != 4) {
                                                                        if (i13 != 5) {
                                                                            ((agrc) ((agrc) uys.a.b()).k("com/google/android/libraries/youtube/creation/effects/innertube/XenoEffectsLoader", "convertSwazzleGraphInput", 914, "XenoEffectsLoader.java")).t("unknown ControlInput OneOf case");
                                                                            r0 = r2;
                                                                            i = 4;
                                                                        } else {
                                                                            if (i12 == 6) {
                                                                                try {
                                                                                    alexVar = (alex) alezVar.d;
                                                                                } catch (aiik e11) {
                                                                                    zvp.b(zvn.b, zvm.y, "[ShortsCreation][Android][Effect]runtime options setting parse failed.", e11);
                                                                                    ((agrc) ((agrc) ((agrc) uys.a.b()).j(e11)).k("com/google/android/libraries/youtube/creation/effects/innertube/XenoEffectsLoader", "convertSwazzleGraphInput", (char) 910, "XenoEffectsLoader.java")).w("%s", "runtime options setting parse failed.");
                                                                                }
                                                                            } else {
                                                                                alexVar = alex.a;
                                                                            }
                                                                            attw attwVar = (attw) aihn.parseFrom(attw.a, alexVar.b, ExtensionRegistryLite.getGeneratedRegistry());
                                                                            aihfVarCreateBuilder2.copyOnWrite();
                                                                            atty attyVar5 = (atty) aihfVarCreateBuilder2.instance;
                                                                            attwVar.getClass();
                                                                            attyVar5.d = attwVar;
                                                                            attyVar5.c = 7;
                                                                        }
                                                                        if (r0 != 0) {
                                                                            try {
                                                                                r7.l(r0);
                                                                            } catch (aiik e12) {
                                                                                e = e12;
                                                                            }
                                                                        }
                                                                        it3 = it3;
                                                                        i2 = 8;
                                                                    } else {
                                                                        try {
                                                                            attq attqVar = attq.a;
                                                                            aihfVarCreateBuilder2.copyOnWrite();
                                                                            atty attyVar6 = (atty) aihfVarCreateBuilder2.instance;
                                                                            attqVar.getClass();
                                                                            attyVar6.d = attqVar;
                                                                            attyVar6.c = i2;
                                                                        } catch (aiik e13) {
                                                                            aiikVar = e13;
                                                                            i2 = 8;
                                                                        }
                                                                    }
                                                                    i = 4;
                                                                } else {
                                                                    alew alewVar = i12 == 7 ? (alew) alezVar.d : alew.a;
                                                                    aihf aihfVarCreateBuilder5 = atts.a.createBuilder();
                                                                    int i14 = alewVar.c;
                                                                    aihfVarCreateBuilder5.copyOnWrite();
                                                                    atts attsVar = (atts) aihfVarCreateBuilder5.instance;
                                                                    attsVar.b |= 1;
                                                                    attsVar.c = i14;
                                                                    if ((alewVar.b & 2) != 0) {
                                                                        int i15 = alewVar.d;
                                                                        aihfVarCreateBuilder5.copyOnWrite();
                                                                        atts attsVar2 = (atts) aihfVarCreateBuilder5.instance;
                                                                        attsVar2.b |= 2;
                                                                        attsVar2.d = i15;
                                                                    }
                                                                    if ((alewVar.b & 4) != 0) {
                                                                        int i16 = alewVar.e;
                                                                        aihfVarCreateBuilder5.copyOnWrite();
                                                                        atts attsVar3 = (atts) aihfVarCreateBuilder5.instance;
                                                                        i = 4;
                                                                        attsVar3.b |= 4;
                                                                        attsVar3.e = i16;
                                                                    } else {
                                                                        i = 4;
                                                                    }
                                                                    aihfVarCreateBuilder2.copyOnWrite();
                                                                    atty attyVar7 = (atty) aihfVarCreateBuilder2.instance;
                                                                    atts attsVar4 = (atts) aihfVarCreateBuilder5.build();
                                                                    attsVar4.getClass();
                                                                    attyVar7.d = attsVar4;
                                                                    attyVar7.c = 2;
                                                                }
                                                                r0 = (atty) aihfVarCreateBuilder2.build();
                                                                if (r0 != 0) {
                                                                    r7.l(r0);
                                                                }
                                                                it3 = it3;
                                                                i2 = 8;
                                                                e = e12;
                                                                aiikVar = e;
                                                                i2 = 8;
                                                                ((agrc) ((agrc) ((agrc) uys.a.b()).j(aiikVar)).k("com/google/android/libraries/youtube/creation/effects/innertube/XenoEffectsLoader", "internalSetSwazzleEffectsSettings", (char) 458, "XenoEffectsLoader.java")).w("Couldn't construct Effect %s", str5);
                                                                r42 = r2;
                                                                r2 = r42;
                                                                i7 = i2;
                                                                i6 = i;
                                                                map3 = map;
                                                                map4 = map2;
                                                                it2 = it;
                                                            }
                                                            i = 4;
                                                            atup atupVar = (atup) r7.build();
                                                            aihhVar.copyOnWrite();
                                                            atte atteVar5 = (atte) aihhVar.instance;
                                                            atupVar.getClass();
                                                            atteVar5.o = atupVar;
                                                            atteVar5.b |= SemanticState.ReadOnly;
                                                        } catch (aiik e14) {
                                                            e = e14;
                                                            i = 4;
                                                        }
                                                        map = map3;
                                                        map2 = map4;
                                                        it = it2;
                                                    } catch (aiik e15) {
                                                        e = e15;
                                                        map = map3;
                                                        map2 = map4;
                                                        it = it2;
                                                    }
                                                } else {
                                                    map = map3;
                                                    map2 = map4;
                                                    it = it2;
                                                }
                                                i2 = 8;
                                                if ((aipfVar2.b & 8) != 0) {
                                                    ajgo ajgoVar = aipfVar2.f;
                                                    if (ajgoVar == null) {
                                                        ajgoVar = ajgo.a;
                                                    }
                                                    jrr jrrVar = (jrr) atsf.a.createBuilder();
                                                    for (ajgk ajgkVar : ajgoVar.b) {
                                                        aihf aihfVarCreateBuilder6 = atsa.a.createBuilder();
                                                        String str11 = ajgkVar.b;
                                                        aihfVarCreateBuilder6.copyOnWrite();
                                                        atsa atsaVar = (atsa) aihfVarCreateBuilder6.instance;
                                                        str11.getClass();
                                                        atsaVar.b |= 1;
                                                        atsaVar.e = str11;
                                                        aihf aihfVarCreateBuilder7 = atse.a.createBuilder();
                                                        ajgn ajgnVar = ajgkVar.c;
                                                        if (ajgnVar == null) {
                                                            ajgnVar = ajgn.a;
                                                        }
                                                        if ((ajgnVar.b & 1) != 0) {
                                                            aihf aihfVarCreateBuilder8 = atsb.a.createBuilder();
                                                            ajgl ajglVar = ajgnVar.e;
                                                            if (ajglVar == null) {
                                                                ajglVar = ajgl.a;
                                                            }
                                                            String str12 = ajglVar.b;
                                                            aihfVarCreateBuilder8.copyOnWrite();
                                                            atsb atsbVar = (atsb) aihfVarCreateBuilder8.instance;
                                                            str12.getClass();
                                                            atsbVar.c = 5;
                                                            atsbVar.d = str12;
                                                            aihfVarCreateBuilder7.copyOnWrite();
                                                            atse atseVar = (atse) aihfVarCreateBuilder7.instance;
                                                            atsb atsbVar2 = (atsb) aihfVarCreateBuilder8.build();
                                                            atsbVar2.getClass();
                                                            atseVar.e = atsbVar2;
                                                            atseVar.b |= 1;
                                                        }
                                                        int i17 = ajgnVar.c;
                                                        if (i17 == 0) {
                                                            i5 = 3;
                                                        } else if (i17 != 2) {
                                                            i5 = i17 != 3 ? 0 : 2;
                                                        } else {
                                                            i5 = 1;
                                                        }
                                                        int i18 = i5 - 1;
                                                        if (i5 == 0) {
                                                            throw r2;
                                                        }
                                                        if (i18 == 0) {
                                                            String str13 = i17 == 2 ? (String) ajgnVar.d : "";
                                                            aihfVarCreateBuilder7.copyOnWrite();
                                                            atse atseVar2 = (atse) aihfVarCreateBuilder7.instance;
                                                            str13.getClass();
                                                            atseVar2.c = 1;
                                                            atseVar2.d = str13;
                                                        } else if (i18 == 1) {
                                                            aihf aihfVarCreateBuilder9 = atsc.a.createBuilder();
                                                            aiie aiieVar = (ajgnVar.c == 3 ? (ajgm) ajgnVar.d : ajgm.a).b;
                                                            aihfVarCreateBuilder9.copyOnWrite();
                                                            atsc atscVar = (atsc) aihfVarCreateBuilder9.instance;
                                                            aiie aiieVar2 = atscVar.b;
                                                            if (!aiieVar2.c()) {
                                                                atscVar.b = aihn.mutableCopy(aiieVar2);
                                                            }
                                                            aifs.addAll(aiieVar, atscVar.b);
                                                            aihfVarCreateBuilder7.copyOnWrite();
                                                            atse atseVar3 = (atse) aihfVarCreateBuilder7.instance;
                                                            atsc atscVar2 = (atsc) aihfVarCreateBuilder9.build();
                                                            atscVar2.getClass();
                                                            atseVar3.d = atscVar2;
                                                            atseVar3.c = 2;
                                                        }
                                                        aihfVarCreateBuilder6.copyOnWrite();
                                                        atsa atsaVar2 = (atsa) aihfVarCreateBuilder6.instance;
                                                        atse atseVar4 = (atse) aihfVarCreateBuilder7.build();
                                                        atseVar4.getClass();
                                                        atsaVar2.d = atseVar4;
                                                        atsaVar2.c = 2;
                                                        jrrVar.b(aihfVarCreateBuilder6);
                                                    }
                                                    atsf atsfVar = (atsf) jrrVar.build();
                                                    aihhVar.copyOnWrite();
                                                    atte atteVar6 = (atte) aihhVar.instance;
                                                    atsfVar.getClass();
                                                    atteVar6.n = atsfVar;
                                                    atteVar6.b |= SemanticState.LiveRegion;
                                                }
                                                final atte atteVar7 = (atte) aihhVar.build();
                                                Effect.f(atteVar7, uysVar.c, new atta() { // from class: uym
                                                    @Override // defpackage.atta
                                                    public final void a(Effect effect, String str14) {
                                                        if (effect == null) {
                                                            ((agrc) ((agrc) uys.a.b()).k("com/google/android/libraries/youtube/creation/effects/innertube/XenoEffectsLoader", "handleSwazzleEffectLoad", 585, "XenoEffectsLoader.java")).B("Error creating Effect %s: %s", str5, str14);
                                                            return;
                                                        }
                                                        uys uysVar2 = uysVar;
                                                        uxp uxpVar2 = uxpVar;
                                                        atte atteVar8 = atteVar7;
                                                        uxpVar2.b();
                                                        uysVar2.h.put(ahno.af(uxpVar2.a), new uyr(effect, null, null, agpi.a, atteVar8, null));
                                                        synchronized (uysVar2.l) {
                                                            Collection.EL.stream(uysVar2.j).forEach(new ulo(8));
                                                        }
                                                    }
                                                });
                                                uysVar.f.add(uxpVar);
                                                uxpVarA = uxpVar;
                                                r41 = r2;
                                            } catch (aiik e16) {
                                                e = e16;
                                                i2 = 8;
                                                aiikVar = e;
                                                ((agrc) ((agrc) ((agrc) uys.a.b()).j(aiikVar)).k("com/google/android/libraries/youtube/creation/effects/innertube/XenoEffectsLoader", "internalSetSwazzleEffectsSettings", (char) 458, "XenoEffectsLoader.java")).w("Couldn't construct Effect %s", str5);
                                                r42 = r2;
                                            }
                                        } catch (aiik e17) {
                                            e = e17;
                                            map = map3;
                                        }
                                    } catch (aiik e18) {
                                        e = e18;
                                        map = map3;
                                        map2 = map4;
                                        it = it2;
                                        i = i6;
                                    }
                                } catch (aiik e19) {
                                    e = e19;
                                    map = map3;
                                    map2 = map4;
                                    it = it2;
                                    i = i6;
                                    i2 = i7;
                                }
                            }
                        }
                        r2 = r2;
                    }
                } else {
                    r41 = r2;
                    map = map3;
                    map2 = map4;
                    it = it2;
                    i = i6;
                    i2 = i7;
                }
                zfVar.N(uxpVarA);
                r42 = r41;
                r2 = r42;
                i7 = i2;
                i6 = i;
                map3 = map;
                map4 = map2;
                it2 = it;
            }
            ?? r43 = r2;
            HashMap map5 = map3;
            HashMap map6 = map4;
            Iterator it4 = it2;
            if (!agke.n(zfVar.a).isEmpty()) {
                uysVar.g.add(zfVar);
            }
            r2 = r43;
            map3 = map5;
            map4 = map6;
            it2 = it4;
        }
        ?? r44 = r2;
        synchronized (uysVar.e) {
        }
        return r44;
    }
}
