package defpackage;

import android.content.Context;
import app.rive.semantics.SemanticState;
import com.google.mediapipe.framework.AndroidAssetUtil;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protos.youtube.api.innertube.InnertubeGetAssetService$GetAssetResponse;
import com.google.research.xeno.effect.AssetDownloader;
import com.google.research.xeno.effect.CapabilitiesManifest;
import com.google.research.xeno.effect.Effect;
import com.google.research.xeno.effect.RemoteAssetManager;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uys {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/creation/effects/innertube/XenoEffectsLoader");
    public static final agkj b = agkj.l("PRESETS", ardj.EFFECT_SUBPACKAGE_ID_PRESET, "EXPRESSIVE", ardj.EFFECT_SUBPACKAGE_ID_EXPRESSIVE, "UNSPECIFIED", ardj.EFFECT_SUBPACKAGE_ID_UNSPECIFIED);
    public final RemoteAssetManager c;
    public final RemoteAssetManager d;
    public final Object e = new Object();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();
    public final ConcurrentHashMap h = new ConcurrentHashMap();
    final HashSet i = new HashSet();
    public final Set j = new HashSet();
    public final awku k = new awku();
    public final Object l = new Object();
    public final HashMap m = new HashMap();
    public final HashSet n = new HashSet();
    public final uyt o;
    public final aaok p;
    private final uyj q;
    private final ahex r;
    private final zvl s;
    private final boolean t;
    private final zf u;

    static {
        vbw.a();
    }

    public uys(Context context, tgg tggVar, uyt uytVar, zwh zwhVar, ahgb ahgbVar, zf zfVar, aaok aaokVar, vxz vxzVar, zvl zvlVar, ahex ahexVar) {
        AssetDownloader uyyVar;
        if (((vxz) aaokVar.b).l(294, 45659298L, false)) {
            File cacheDir = context.getCacheDir();
            tggVar.d();
            uyyVar = new uyx(tggVar, cacheDir, vxzVar);
        } else {
            tggVar.d();
            uyyVar = new uyy(tggVar, context, vxzVar);
        }
        if (vxzVar.m(14, 45627566L)) {
            uyyVar.downloadAsset("https://www.gstatic.com/asset.txt", new uyw());
        }
        atvx atvxVarA = atvy.a();
        File file = new File(context.getFilesDir(), vcb.b);
        if (!file.exists()) {
            file.mkdirs();
        }
        atvxVarA.c(file.getPath());
        atvxVarA.d(vcb.j);
        atvxVarA.a = uyyVar;
        atvxVarA.b(vcb.d);
        RemoteAssetManager remoteAssetManagerA = RemoteAssetManager.a(context, atvxVarA.a());
        this.c = remoteAssetManagerA;
        uyj uyjVar = new uyj(ahgbVar, context.getApplicationContext(), ((vxz) aaokVar.c).m(23, 45622346L) ? Optional.of(zwhVar.hw()) : Optional.empty());
        this.q = uyjVar;
        atvx atvxVarA2 = atvy.a();
        File file2 = new File(context.getFilesDir(), String.valueOf(vcb.c).concat(String.valueOf(uyjVar.b)));
        if (!file2.exists() && !file2.mkdirs()) {
            zvp.a(zvn.b, zvm.y, "Failed to make cache directory");
        }
        atvxVarA2.c(file2.getPath());
        atvxVarA2.d(vcb.k);
        atvxVarA2.a = uyjVar;
        RemoteAssetManager remoteAssetManagerA2 = RemoteAssetManager.a(context, atvxVarA2.a());
        this.d = remoteAssetManagerA2;
        if (!remoteAssetManagerA.c() || !remoteAssetManagerA2.c()) {
            ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/creation/effects/innertube/XenoEffectsLoader", "<init>", 241, "XenoEffectsLoader.java")).t("RemoteAssetManager could not create sandboxBasePath.");
            zvp.a(zvn.b, zvm.M, "RemoteAssetManager could not create sandboxBasePath.");
        }
        this.u = zfVar;
        this.o = uytVar;
        ahexVar.getClass();
        this.r = ahexVar;
        zvlVar.getClass();
        this.s = zvlVar;
        if (!AndroidAssetUtil.a(context)) {
            ((agrc) ((agrc) uyt.a.c()).k("com/google/android/libraries/youtube/creation/effects/innertube/XenoInterfaceImpl", "initializeNativeAssetManager", 36, "XenoInterfaceImpl.java")).t("Failed to initialize the native asset manager!");
        }
        this.t = ((vxz) aaokVar.c).l(79, 45756170L, false);
        this.p = aaokVar;
    }

    public final uyr a(String str) {
        return (uyr) this.h.get(ahno.af(str));
    }

    public final avlh b() {
        return this.k.p();
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.Map] */
    public final void c(String str, InnertubeGetAssetService$GetAssetResponse innertubeGetAssetService$GetAssetResponse, agkj agkjVar, Consumer consumer) {
        int i;
        if (innertubeGetAssetService$GetAssetResponse.c.size() == 0) {
            consumer.r(Optional.empty());
            return;
        }
        ajhv ajhvVar = (ajhv) innertubeGetAssetService$GetAssetResponse.c.get(0);
        int i2 = 5;
        arlj arljVar = ajhvVar.b == 5 ? (arlj) ajhvVar.c : arlj.a;
        ajht ajhtVar = innertubeGetAssetService$GetAssetResponse.e.size() > 0 ? (ajht) innertubeGetAssetService$GetAssetResponse.e.get(0) : null;
        char c = 4;
        if ((arljVar.b & SemanticState.ReadOnly) != 0) {
            if (!this.t) {
                consumer.r(Optional.empty());
                return;
            }
            atso atsoVarFT = yno.fT(arljVar);
            ajfr ajfrVar = innertubeGetAssetService$GetAssetResponse.f;
            if (ajfrVar == null) {
                ajfrVar = ajfr.a;
            }
            aihf aihfVarCreateBuilder = atsu.a.createBuilder();
            int iBt = a.bt(ajfrVar.b);
            if (iBt == 0) {
                iBt = 1;
            }
            int i3 = iBt - 1;
            if (i3 == 1) {
                i2 = 3;
            } else if (i3 == 2) {
                i2 = 4;
            } else if (i3 != 3) {
                i2 = i3 != 4 ? i3 != 5 ? 2 : 7 : 6;
            }
            aihfVarCreateBuilder.copyOnWrite();
            atsu atsuVar = (atsu) aihfVarCreateBuilder.instance;
            atsuVar.c = i2 - 2;
            atsuVar.b |= 1;
            e(str, null, atsoVarFT, ajhvVar, ajhtVar, ((agpl) agkjVar.keySet()).a, consumer);
            return;
        }
        zf zfVar = this.u;
        aihh aihhVar = (aihh) atte.a.createBuilder();
        try {
            arma armaVar = arljVar.c;
            if (armaVar == null) {
                armaVar = arma.a;
            }
            ahnl ahnlVar = (ahnl) aihn.parseFrom(ahnl.a, armaVar.k, ExtensionRegistryLite.getGeneratedRegistry());
            aihhVar.copyOnWrite();
            atte atteVar = (atte) aihhVar.instance;
            ahnlVar.getClass();
            atteVar.c = ahnlVar;
            atteVar.b |= 1;
        } catch (aiik e) {
            uyl.c("CalculatorGraphConfig parse failed.", e);
        }
        arma armaVar2 = arljVar.c;
        if (armaVar2 == null) {
            armaVar2 = arma.a;
        }
        if ((armaVar2.b & SemanticState.Hidden) != 0) {
            arma armaVar3 = arljVar.c;
            if (armaVar3 == null) {
                armaVar3 = arma.a;
            }
            i = armaVar3.j;
        } else {
            i = 2;
        }
        aihhVar.copyOnWrite();
        atte atteVar2 = (atte) aihhVar.instance;
        atteVar2.b |= SemanticState.Hidden;
        atteVar2.m = i;
        arma armaVar4 = arljVar.c;
        if (((armaVar4 == null ? arma.a : armaVar4).b & 4) != 0) {
            if (armaVar4 == null) {
                armaVar4 = arma.a;
            }
            String str2 = armaVar4.c;
            aihhVar.copyOnWrite();
            atte atteVar3 = (atte) aihhVar.instance;
            str2.getClass();
            atteVar3.b |= 2;
            atteVar3.d = str2;
        }
        arma armaVar5 = arljVar.c;
        if (((armaVar5 == null ? arma.a : armaVar5).b & 16) != 0) {
            if (armaVar5 == null) {
                armaVar5 = arma.a;
            }
            String str3 = armaVar5.e;
            aihhVar.copyOnWrite();
            atte atteVar4 = (atte) aihhVar.instance;
            str3.getClass();
            atteVar4.b |= 8;
            atteVar4.f = str3;
        }
        arma armaVar6 = arljVar.c;
        if (((armaVar6 == null ? arma.a : armaVar6).b & 32) != 0) {
            if (armaVar6 == null) {
                armaVar6 = arma.a;
            }
            String str4 = armaVar6.f;
            aihhVar.copyOnWrite();
            atte atteVar5 = (atte) aihhVar.instance;
            str4.getClass();
            atteVar5.b |= 16;
            atteVar5.g = str4;
        }
        arma armaVar7 = arljVar.c;
        if (((armaVar7 == null ? arma.a : armaVar7).b & SemanticState.Focused) != 0) {
            if (armaVar7 == null) {
                armaVar7 = arma.a;
            }
            String str5 = armaVar7.h;
            aihhVar.copyOnWrite();
            atte atteVar6 = (atte) aihhVar.instance;
            str5.getClass();
            atteVar6.b |= 64;
            atteVar6.i = str5;
        }
        arma armaVar8 = arljVar.c;
        if (((armaVar8 == null ? arma.a : armaVar8).b & 8) != 0) {
            if (armaVar8 == null) {
                armaVar8 = arma.a;
            }
            String str6 = armaVar8.d;
            aihhVar.copyOnWrite();
            atte atteVar7 = (atte) aihhVar.instance;
            str6.getClass();
            atteVar7.b |= 4;
            atteVar7.e = str6;
        }
        arma armaVar9 = arljVar.c;
        if (((armaVar9 == null ? arma.a : armaVar9).b & 64) != 0) {
            if (armaVar9 == null) {
                armaVar9 = arma.a;
            }
            String str7 = armaVar9.g;
            aihhVar.copyOnWrite();
            atte atteVar8 = (atte) aihhVar.instance;
            str7.getClass();
            atteVar8.b |= 32;
            atteVar8.h = str7;
        }
        arma armaVar10 = arljVar.c;
        if (((armaVar10 == null ? arma.a : armaVar10).b & SemanticState.ReadOnly) != 0) {
            if (armaVar10 == null) {
                armaVar10 = arma.a;
            }
            armg armgVar = armaVar10.l;
            if (armgVar == null) {
                armgVar = armg.a;
            }
            aihf aihfVarCreateBuilder2 = atsh.a.createBuilder();
            arll arllVar = armgVar.b;
            if (arllVar == null) {
                arllVar = arll.a;
            }
            atsg atsgVarFS = yno.fS(arllVar);
            aihfVarCreateBuilder2.copyOnWrite();
            atsh atshVar = (atsh) aihfVarCreateBuilder2.instance;
            atsgVarFS.getClass();
            atshVar.c = atsgVarFS;
            atshVar.b |= 1;
            Iterator it = armgVar.c.iterator();
            while (it.hasNext()) {
                atsg atsgVarFS2 = yno.fS((arll) it.next());
                aihfVarCreateBuilder2.copyOnWrite();
                atsh atshVar2 = (atsh) aihfVarCreateBuilder2.instance;
                atsgVarFS2.getClass();
                aiie aiieVar = atshVar2.d;
                if (!aiieVar.c()) {
                    atshVar2.d = aihn.mutableCopy(aiieVar);
                }
                atshVar2.d.add(atsgVarFS2);
            }
            atsh atshVar3 = (atsh) aihfVarCreateBuilder2.build();
            aihhVar.copyOnWrite();
            atte atteVar9 = (atte) aihhVar.instance;
            atshVar3.getClass();
            atteVar9.k = atshVar3;
            atteVar9.b |= SemanticState.Focused;
        }
        arma armaVar11 = arljVar.c;
        if (armaVar11 == null) {
            armaVar11 = arma.a;
        }
        aihhVar.u(armaVar11.i);
        if ((arljVar.b & 2) != 0) {
            armm armmVar = arljVar.d;
            if (armmVar == null) {
                armmVar = armm.a;
            }
            jrr jrrVar = (jrr) atsf.a.createBuilder();
            for (armk armkVar : armmVar.b) {
                aihf aihfVarCreateBuilder3 = atsa.a.createBuilder();
                String str8 = armkVar.b;
                aihfVarCreateBuilder3.copyOnWrite();
                atsa atsaVar = (atsa) aihfVarCreateBuilder3.instance;
                str8.getClass();
                char c2 = c;
                atsaVar.b |= 1;
                atsaVar.e = str8;
                aihf aihfVarCreateBuilder4 = atse.a.createBuilder();
                arml armlVar = armkVar.c;
                if (armlVar == null) {
                    armlVar = arml.a;
                }
                String str9 = armlVar.b;
                aihfVarCreateBuilder4.copyOnWrite();
                atse atseVar = (atse) aihfVarCreateBuilder4.instance;
                str9.getClass();
                atseVar.c = 1;
                atseVar.d = str9;
                atse atseVar2 = (atse) aihfVarCreateBuilder4.build();
                aihfVarCreateBuilder3.copyOnWrite();
                atsa atsaVar2 = (atsa) aihfVarCreateBuilder3.instance;
                atseVar2.getClass();
                atsaVar2.d = atseVar2;
                atsaVar2.c = 2;
                atsa atsaVar3 = (atsa) aihfVarCreateBuilder3.build();
                jrrVar.copyOnWrite();
                atsf atsfVar = (atsf) jrrVar.instance;
                atsaVar3.getClass();
                atsfVar.a();
                atsfVar.b.add(atsaVar3);
                c = c2;
            }
            atsf atsfVar2 = (atsf) jrrVar.build();
            aihhVar.copyOnWrite();
            atte atteVar10 = (atte) aihhVar.instance;
            atsfVar2.getClass();
            atteVar10.n = atsfVar2;
            atteVar10.b |= SemanticState.LiveRegion;
        }
        if ((arljVar.b & 4) != 0) {
            arlz arlzVar = arljVar.e;
            if (arlzVar == null) {
                arlzVar = arlz.a;
            }
            atup atupVarB = uyl.b(arlzVar);
            aihhVar.copyOnWrite();
            atte atteVar11 = (atte) aihhVar.instance;
            atupVarB.getClass();
            atteVar11.o = atupVarB;
            atteVar11.b |= SemanticState.ReadOnly;
        }
        if (!agkjVar.isEmpty()) {
            atup atupVar = ((atte) aihhVar.instance).o;
            if (atupVar == null) {
                atupVar = atup.a;
            }
            agqr it2 = agkjVar.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (((yno) zfVar.a.get(ajgh.a(((ajgi) entry.getKey()).b))) != null) {
                    ajgi ajgiVar = (ajgi) entry.getKey();
                    vay vayVar = (vay) entry.getValue();
                    if ((vayVar instanceof vbc) && ajgiVar.b == 1) {
                        String strJ = agyg.e.j(((vbc) vayVar).a().G());
                        jrq jrqVar = (jrq) atupVar.toBuilder();
                        agkz agkzVarN = agkz.n((ajgiVar.b == 1 ? (ajgj) ajgiVar.c : ajgj.a).b);
                        for (int i4 = 0; i4 < atupVar.b.size(); i4++) {
                            atul atulVar = (atul) atupVar.b.get(i4);
                            aihf builder = atulVar.toBuilder();
                            if (agkzVarN.contains(atulVar.e)) {
                                builder.copyOnWrite();
                                atul atulVar2 = (atul) builder.instance;
                                atulVar2.c = 5;
                                atulVar2.d = strJ;
                            }
                            jrqVar.copyOnWrite();
                            atup atupVar2 = (atup) jrqVar.instance;
                            atul atulVar3 = (atul) builder.build();
                            atulVar3.getClass();
                            atupVar2.b();
                            atupVar2.b.set(i4, atulVar3);
                        }
                        atupVar = (atup) jrqVar.build();
                    }
                }
            }
            aihhVar.copyOnWrite();
            atte atteVar12 = (atte) aihhVar.instance;
            atupVar.getClass();
            atteVar12.o = atupVar;
            atteVar12.b |= SemanticState.ReadOnly;
        }
        e(str, (atte) aihhVar.build(), null, ajhvVar, ajhtVar, ((agpl) agkjVar.keySet()).a, consumer);
    }

    public final void d(aqhu aqhuVar) {
        new uyp(this, aqhuVar).execute(new Void[0]);
    }

    public final void e(final String str, final atte atteVar, final atso atsoVar, final ajhv ajhvVar, final ajht ajhtVar, final agke agkeVar, final Consumer consumer) {
        if (atsoVar == null && atteVar == null) {
            return;
        }
        if (this.h.containsKey(ahno.af(str))) {
            consumer.r(Optional.of(str));
            return;
        }
        arlj arljVar = ajhvVar.b == 5 ? (arlj) ajhvVar.c : arlj.a;
        if ((arljVar.b & 2) != 0) {
            armm armmVar = arljVar.d;
            if (armmVar == null) {
                armmVar = armm.a;
            }
            for (armk armkVar : armmVar.b) {
                uyj uyjVar = this.q;
                arml armlVar = armkVar.c;
                if (armlVar == null) {
                    armlVar = arml.a;
                }
                String str2 = armlVar.b;
                armn armnVar = armkVar.d;
                if (armnVar == null) {
                    armnVar = armn.a;
                }
                aigj aigjVar = armnVar.b;
                armn armnVar2 = armkVar.d;
                if (armnVar2 == null) {
                    armnVar2 = armn.a;
                }
                aigj aigjVar2 = armnVar2.c;
                String strA = uyjVar.a(str2);
                HashMap map = uyjVar.a;
                if (aigjVar == null) {
                    throw new NullPointerException("Null signature");
                }
                if (aigjVar2 == null) {
                    throw new NullPointerException("Null certificate");
                }
                map.put(strA, new uyi(aigjVar, aigjVar2));
            }
        }
        final atta attaVar = new atta() { // from class: uyo
            @Override // defpackage.atta
            public final void a(Effect effect, String str3) {
                uyr uyrVar;
                uys uysVar = this.a;
                Consumer consumer2 = consumer;
                String str4 = str;
                String strAf = ahno.af(str4);
                if (effect == null) {
                    zvp.a(zvn.b, zvm.y, a.ca(str3, str4, "[ShortsCreation][Android][Effect]Error loading Effect ", ": "));
                    uysVar.k.kk(agpr.a);
                    consumer2.r(Optional.empty());
                    return;
                }
                ConcurrentHashMap concurrentHashMap = uysVar.h;
                if (concurrentHashMap.containsKey(strAf)) {
                    zvp.a(zvn.a, zvm.y, "[ShortsCreation][Android][Effect]Attempt to load already loaded effect.");
                    consumer2.r(Optional.of(str4));
                    return;
                }
                agke agkeVar2 = agkeVar;
                ajht ajhtVar2 = ajhtVar;
                ajhv ajhvVar2 = ajhvVar;
                atte atteVar2 = atteVar;
                if (atteVar2 != null) {
                    uyrVar = new uyr(effect, ajhvVar2, ajhtVar2, agkeVar2, atteVar2, null);
                } else {
                    atso atsoVar2 = atsoVar;
                    uyrVar = atsoVar2 != null ? new uyr(effect, ajhvVar2, ajhtVar2, agkeVar2, null, atsoVar2) : null;
                }
                if (uyrVar != null) {
                    concurrentHashMap.put(strAf, uyrVar);
                }
                synchronized (uysVar.l) {
                    uysVar.i.add(str4);
                }
                uysVar.k.kk(new agqj(str4));
                consumer2.r(Optional.of(str4));
            }
        };
        if (atteVar != null) {
            Effect.f(atteVar, this.d, attaVar);
        } else {
            this.r.execute(afwl.i(new Runnable() { // from class: uyn
                @Override // java.lang.Runnable
                public final void run() {
                    CapabilitiesManifest capabilitiesManifest;
                    uys uysVar = this.a;
                    String str3 = str;
                    Consumer consumer2 = consumer;
                    atso atsoVar2 = atsoVar;
                    int i = 1;
                    try {
                        aihf aihfVarCreateBuilder = atwv.a.createBuilder();
                        boolean zL = ((vxz) uysVar.p.d).l(0, 45820147L, false);
                        aihfVarCreateBuilder.copyOnWrite();
                        atwv atwvVar = (atwv) aihfVarCreateBuilder.instance;
                        atwvVar.b |= 1;
                        atwvVar.c = zL;
                        atwv atwvVar2 = (atwv) aihfVarCreateBuilder.build();
                        aihf aihfVarCreateBuilder2 = aifv.a.createBuilder();
                        aihfVarCreateBuilder2.copyOnWrite();
                        ((aifv) aihfVarCreateBuilder2.instance).b = "type.googleapis.com/xeno.effect.capabilities.PersonSegmentationExperimentsProto";
                        aigj byteString = atwvVar2.toByteString();
                        aihfVarCreateBuilder2.copyOnWrite();
                        ((aifv) aihfVarCreateBuilder2.instance).c = byteString;
                        agke.q((aifv) aihfVarCreateBuilder2.build());
                        capabilitiesManifest = new CapabilitiesManifest(0L);
                    } catch (RuntimeException e) {
                        ((agrc) ((agrc) ((agrc) uys.a.b()).j(e)).k("com/google/android/libraries/youtube/creation/effects/innertube/XenoEffectsLoader", "createCapabilitiesManifest", (char) 707, "XenoEffectsLoader.java")).t("Failed to create CapabilitiesManifest");
                        uysVar.f("[ShortsCreation][Android][Effect]Failed to create CapabilitiesManifest for effect " + str3 + ": " + e.getMessage(), ajtv.ERROR_LEVEL_ERROR, e);
                        consumer2.r(Optional.empty());
                        uysVar.k.kk(agpr.a);
                        capabilitiesManifest = null;
                    }
                    CapabilitiesManifest capabilitiesManifest2 = capabilitiesManifest;
                    if (capabilitiesManifest2 != null) {
                        try {
                            Effect.d(atsoVar2, uysVar.d, capabilitiesManifest2, uysVar.o.b, new attb(attaVar, capabilitiesManifest2, i));
                        } catch (RuntimeException e2) {
                            capabilitiesManifest2.b();
                            ((agrc) ((agrc) ((agrc) uys.a.b()).j(e2)).k("com/google/android/libraries/youtube/creation/effects/innertube/XenoEffectsLoader", "loadCapabilityDrivenEffectWithManifest", (char) 752, "XenoEffectsLoader.java")).t("Unexpected error during XenoCapabilityDrivenEffect loading.");
                            uysVar.f("[ShortsCreation][Android][Effect]Unexpected error loading CapabilityDrivenEffect " + str3 + ": " + e2.getMessage(), ajtv.ERROR_LEVEL_ERROR, e2);
                            uysVar.k.kk(agpr.a);
                            consumer2.r(Optional.empty());
                        }
                    }
                }
            }));
        }
    }

    public final void f(String str, ajtv ajtvVar, Throwable th) {
        zvj zvjVarA = zvk.a();
        zvjVarA.c(ajtvVar);
        zvjVarA.j = 23;
        zvjVarA.i = 68;
        typ.f(str);
        zvjVarA.d(str);
        zvjVarA.f(th);
        this.s.a(zvjVarA.a());
    }
}
