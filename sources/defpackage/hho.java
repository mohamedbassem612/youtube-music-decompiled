package defpackage;

import androidx.window.extensions.layout.WindowLayoutInfo;
import j$.lang.Iterable$EL;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hho extends awrb implements awqg {
    private final /* synthetic */ int $cid;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hho(Object obj, int i, byte[] bArr) {
        super(1, obj, qf$$ExternalSyntheticApiModelOutline0.m944m(), "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0);
        this.$cid = i;
    }

    /* JADX WARN: Type inference failed for: r13v76, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.awqg
    public final /* synthetic */ Object invoke(Object obj) {
        AtomicBoolean atomicBoolean;
        awwd awwdVar;
        String str;
        aeno aenoVarV;
        int i = 3;
        byte[] bArr = null;
        switch (this.$cid) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                hhr hhrVar = (hhr) this.receiver;
                boolean zI = ((tfq) hhrVar.h.io()).i();
                Object[] objArr = {Integer.valueOf(iIntValue), Boolean.valueOf(zI)};
                Object[] objArrCopyOf = Arrays.copyOf(objArr, 2);
                String.format("MBS: onConnectivityChangedEvent(). connectivityChangedEvent: %d, isNetworkConnected: %b", Arrays.copyOf(objArrCopyOf, objArrCopyOf.length)).getClass();
                hhrVar.c("MBS: onConnectivityChangedEvent(). connectivityChangedEvent: %d, isNetworkConnected: %b", Arrays.copyOf(objArr, 2));
                if (zI) {
                    AtomicBoolean atomicBoolean2 = hhrVar.m;
                    if (!atomicBoolean2.get()) {
                        atomicBoolean2.set(true);
                        try {
                            agkz agkzVarC = ((hfy) hhrVar.g.io()).c();
                            agkzVarC.getClass();
                            hir hirVar = (hir) hhrVar.b.io();
                            agkx agkxVar = new agkx();
                            synchronized (hirVar.b) {
                                Iterable$EL.forEach(agkzVarC, new hfo(hirVar, agkxVar, i, bArr));
                                break;
                            }
                            agkz agkzVarG = agkxVar.g();
                            agkzVarG.getClass();
                            if (agkzVarG.isEmpty()) {
                                atomicBoolean = hhrVar.m;
                            } else {
                                agqr it = agkzVarG.iterator();
                                it.getClass();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    next.getClass();
                                    zne zneVar = (zne) next;
                                    ConcurrentHashMap concurrentHashMap = ((hiv) hhrVar.c.io()).y;
                                    if (concurrentHashMap.containsKey(zneVar)) {
                                        concurrentHashMap.remove(zneVar);
                                    }
                                    ((isw) hhrVar.e.io()).h(zneVar.a());
                                    ((agrc) hhr.a.c().k("com/google/android/apps/youtube/music/mediabrowser/content/ContentSupplier", "refreshAllOfflineBrowseClients", 284, "ContentSupplier.kt")).w("MBS: Media Client '%s' has been refreshed.", zneVar);
                                }
                                atomicBoolean = hhrVar.m;
                            }
                            atomicBoolean.set(false);
                        } catch (Throwable th) {
                            hhrVar.m.set(false);
                            throw th;
                        }
                    }
                }
                return awmy.a;
            case 1:
                WindowLayoutInfo windowLayoutInfo = (WindowLayoutInfo) obj;
                windowLayoutInfo.getClass();
                qf$$ExternalSyntheticApiModelOutline0.m(this.receiver).accept(windowLayoutInfo);
                return awmy.a;
            case 2:
                anzs anzsVar = (anzs) obj;
                anzsVar.getClass();
                hhr hhrVar2 = (hhr) this.receiver;
                zne zneVarA = ((hfy) hhrVar2.g.io()).a();
                zneVarA.getClass();
                ((hir) hhrVar2.b.io()).a(zneVarA).p(anzsVar);
                return awmy.a;
            case 3:
                ((awku) this.receiver).kk((Optional) obj);
                return awmy.a;
            case 4:
                ibv ibvVar = (ibv) obj;
                ibvVar.getClass();
                ift iftVar = (ift) this.receiver;
                if (iftVar.k != null) {
                    boolean z = ibvVar == ibv.LOOP_ONE;
                    if (iftVar.m.l(13, 45627362L, false)) {
                        iftVar.j.H(z);
                    }
                    iftVar.g(null, false, z);
                }
                return awmy.a;
            case 5:
                final Optional optional = (Optional) obj;
                optional.getClass();
                uwv uwvVar = (uwv) this.receiver;
                uww uwwVar = uwv.b;
                uwvVar.c.h(new awqg() { // from class: uwt
                    @Override // defpackage.awqg
                    public final Object invoke(Object obj2) {
                        Set setAw;
                        boolean z2;
                        aiie aiieVar;
                        uww uwwVar2 = uwv.b;
                        ((uww) obj2).getClass();
                        auhs auhsVar = (auhs) awrc.f(optional);
                        if (auhsVar == null) {
                            return uwv.b;
                        }
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        agrf agrfVar = usj.a;
                        if (!((agkz) Collection.EL.stream(((aufx) yno.gx(auhsVar, aufx.b)).c).filter(new sde(17)).map(new ush(4)).collect(aghu.b)).isEmpty()) {
                            linkedHashSet.add(arfu.VOLUME_TYPE_ORIGINAL);
                        }
                        if (yno.gm(auhsVar) != null) {
                            linkedHashSet.add(arfu.VOLUME_TYPE_ADDED_MUSIC);
                        }
                        aiie aiieVar2 = auhsVar.f;
                        aiieVar2.getClass();
                        aihl aihlVar = augp.b;
                        aihlVar.getClass();
                        augp augpVar = (augp) yno.gh(aiieVar2, aihlVar);
                        if (augpVar == null || (aiieVar = augpVar.c) == null) {
                            setAw = awnq.a;
                        } else {
                            ArrayList arrayList = new ArrayList(atqq.N(aiieVar, 10));
                            Iterator<E> it2 = aiieVar.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(Long.valueOf(((augo) it2.next()).b));
                            }
                            setAw = atqq.aw(arrayList);
                        }
                        aiie aiieVar3 = auhsVar.e;
                        aiieVar3.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : aiieVar3) {
                            if (setAw.contains(Long.valueOf(((aufa) obj3).e))) {
                                arrayList2.add(obj3);
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            linkedHashSet.add(arfu.VOLUME_TYPE_VOICEOVER);
                        }
                        int i2 = 1;
                        if (arrayList2.isEmpty()) {
                            z2 = false;
                            break;
                        }
                        Iterator it3 = arrayList2.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                z2 = false;
                                break;
                            }
                            aiie aiieVar4 = ((aufa) it3.next()).k;
                            aiieVar4.getClass();
                            aihl aihlVar2 = aufu.b;
                            aihlVar2.getClass();
                            if (yno.gh(aiieVar4, aihlVar2) != null) {
                                z2 = true;
                                break;
                            }
                        }
                        aiie<aufa> aiieVar5 = auhsVar.e;
                        aiieVar5.getClass();
                        ArrayList arrayList3 = new ArrayList();
                        for (aufa aufaVar : aiieVar5) {
                            aiie aiieVar6 = aufaVar.k;
                            aiieVar6.getClass();
                            aihl aihlVar3 = augn.b;
                            aihlVar3.getClass();
                            augn augnVar = (augn) yno.gh(aiieVar6, aihlVar3);
                            awml awmlVar = augnVar != null ? new awml(aufaVar, augnVar) : null;
                            if (awmlVar != null) {
                                arrayList3.add(awmlVar);
                            }
                        }
                        if (!arrayList3.isEmpty()) {
                            int iA = atqo.A(((augn) ((awml) arrayList3.get(0)).b).c);
                            i2 = iA != 0 ? iA : 1;
                            linkedHashSet.add(arfu.VOLUME_TYPE_VISUAL_REMIX);
                        }
                        aiie<auhr> aiieVar7 = auhsVar.k;
                        uxb uxbVar = new uxb();
                        for (auhr auhrVar : aiieVar7) {
                            float f = auhrVar.c;
                            arfu arfuVarA = arfu.a(auhrVar.b);
                            if (arfuVarA == null) {
                                arfuVarA = arfu.VOLUME_TYPE_UNKNOWN;
                            }
                            uxbVar.c(f, arfuVarA);
                        }
                        return new uww(linkedHashSet, uxbVar, z2, i2);
                    }
                });
                return awmy.a;
            case 6:
                ury uryVar = (ury) obj;
                uryVar.getClass();
                ((agjz) this.receiver).h(uryVar);
                return awmy.a;
            case 7:
                Optional optional2 = (Optional) obj;
                optional2.getClass();
                uzt uztVar = (uzt) this.receiver;
                if (optional2.isPresent()) {
                    aiie<aufd> aiieVar = ((auhs) optional2.get()).g;
                    aiieVar.getClass();
                    ArrayList arrayList = new ArrayList();
                    for (aufd aufdVar : aiieVar) {
                        apsr apsrVar = aufdVar.g;
                        if (apsrVar == null) {
                            apsrVar = apsr.a;
                        }
                        if (apsrVar.b == 4) {
                            apsr apsrVar2 = aufdVar.g;
                            if (apsrVar2 == null) {
                                apsrVar2 = apsr.a;
                            }
                            str = (apsrVar2.b == 4 ? (apse) apsrVar2.c : apse.a).c;
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            arrayList.add(str);
                        }
                    }
                    if (!awrc.c(uztVar.h, arrayList) && (!awrc.c(uztVar.g, arrayList) || ((awwdVar = uztVar.f) != null && awwdVar.q()))) {
                        awwd awwdVar2 = uztVar.f;
                        if (awwdVar2 != null) {
                            awwdVar2.p(null);
                        }
                        usd usdVarB = ((ukp) uztVar.b.io()).b();
                        if (usdVarB == null) {
                            twu.d("CompEffectsReconciler", 5, "Reconciler: media composition manager is null", null);
                        } else {
                            uztVar.h = arrayList;
                            uztVar.f = awro.t(uztVar.e, null, 0, new uzn(uztVar, aiieVar, usdVarB, arrayList, null), 3);
                        }
                    }
                }
                return awmy.a;
            case 8:
                weo weoVar = (weo) obj;
                weoVar.getClass();
                ((awly) this.receiver).kk(weoVar);
                return awmy.a;
            case 9:
                agev agevVar = (agev) obj;
                agevVar.getClass();
                ((awly) this.receiver).kk(agevVar);
                return awmy.a;
            case 10:
                Iterable iterable = (Iterable) obj;
                iterable.getClass();
                aigm aigmVarA = ((wmo) this.receiver).a(iterable);
                albe albeVar = albe.a;
                Object objF = aihn.getParserForClass(albe.class).f(aigmVarA, wmo.a);
                objF.getClass();
                return (albe) objF;
            case 11:
                akvx akvxVar = (akvx) obj;
                akvxVar.getClass();
                xed xedVar = (xed) this.receiver;
                int i2 = akvxVar.b;
                xedVar.b = (i2 & 1) != 0 ? akvxVar.c : true;
                xedVar.c = (i2 & 2) != 0 ? akvxVar.d : 1;
                xedVar.d = (i2 & 8) != 0 ? akvxVar.f : false;
                return awmy.a;
            case 12:
                abei abeiVar = (abei) obj;
                abeiVar.getClass();
                abek abekVar = (abek) this.receiver;
                Objects.checkIndex(0, 5);
                if (abeiVar instanceof abeg) {
                    acip acipVar = ((abeg) abeiVar).a;
                    String strAu = acipVar.au();
                    strAu.getClass();
                    if (strAu.length() != 0) {
                        abnl abnlVarN = acipVar.n();
                        ajwo ajwoVar = abnlVarN != null ? abnlVarN.b : null;
                        abekVar.b();
                        if (ajwoVar == null || (aenoVarV = aeno.n.s(ajwoVar)) == null) {
                            aenoVarV = aewo.v(3, null, null, null, 5, 14);
                        }
                        aeno aenoVarA = aenoVarV.a(new pge(strAu, abekVar, 18));
                        aenu aenuVar = abekVar.a;
                        aenr aenrVarD = aenuVar.d(aenoVarA);
                        abekVar.e = aenrVarD;
                        abekVar.c = ajwoVar;
                        abekVar.d = strAu;
                        abed abedVar = abekVar.b;
                        abedVar.a = aenrVarD.a();
                        aenuVar.h(new aens(aenrVarD.c, aent.ACTIVE), aenrVarD);
                        abekVar.g.a(abedVar, ajwoVar, abekVar.f);
                        abekVar.g(abdy.b);
                        abekVar.f = null;
                    }
                } else if (abeiVar instanceof abef) {
                    abed abedVar2 = abekVar.b;
                    aawo.b(abedVar2, abedVar2, new abbj(abekVar, 6), ((abef) abeiVar).a, abekVar.d, abekVar.c);
                } else if (abeiVar instanceof abeh) {
                    abed abedVar3 = abekVar.b;
                    aawo.c(abedVar3, abedVar3, new abbj(abekVar, 7), ((abeh) abeiVar).a, abekVar.d, abekVar.c);
                } else {
                    if (!(abeiVar instanceof abee)) {
                        throw new awmj();
                    }
                    abekVar.c(false);
                }
                return awmy.a;
            case 13:
                ((awku) this.receiver).kk((abik) obj);
                return awmy.a;
            case 14:
                tnw tnwVar = (tnw) obj;
                tnwVar.getClass();
                return ((abqh) this.receiver).e(tnwVar);
            case 15:
                acip acipVar2 = (acip) obj;
                acipVar2.getClass();
                abxu abxuVar = (abxu) this.receiver;
                twu.c(4, "PlayerSettingsEventHandler:handleActiveSingleVideoChangedEvent(activeComponent=" + acipVar2 + ')', null);
                Object objIo = abxuVar.c.io();
                objIo.getClass();
                abyg abygVar = (abyg) objIo;
                String strAu2 = acipVar2.au();
                strAu2.getClass();
                ijt ijtVar = abygVar.d;
                wjf wjfVarF = acipVar2.f();
                abyd abydVarM = ijtVar.m(strAu2);
                if (abydVarM == null) {
                    twu.d(abyg.a, 4, "No settings for active CPN, returning.", null);
                } else {
                    Set setO = aavv.o(abydVarM, abyd.b.keySet());
                    twu.d(abyg.a, 4, "Applying settings to active CPN " + strAu2 + ": " + setO, null);
                    abygVar.b.a().a(strAu2, wjfVarF, setO);
                    abygVar.c.kk(new abxd(strAu2, abydVarM));
                }
                return awmy.a;
            case 16:
                aazq aazqVar = (aazq) obj;
                aazqVar.getClass();
                return awrc.c(aazqVar, aazq.a) ? Optional.empty() : Optional.of(aazqVar.b.p());
            case 17:
                aazt aaztVar = (aazt) obj;
                aaztVar.getClass();
                acmo acmoVar = (acmo) this.receiver;
                acuo acuoVar = acmoVar.c;
                if (acuoVar != null && !aaztVar.c) {
                    zdk zdkVar = aaztVar.b;
                    if (zdkVar == null) {
                        acmoVar.a();
                    } else {
                        float f = zdkVar.f();
                        float fE = zdkVar.e();
                        float fB = zdkVar.b();
                        float fA = zdkVar.a();
                        if (f == 0.0f || fE == 0.0f) {
                            acmoVar.a();
                        } else {
                            acuoVar.h(zdkVar.c() / f, zdkVar.d() / fE, fB / f, fA / fE);
                        }
                    }
                }
                return awmy.a;
            case 18:
                acvn acvnVar = (acvn) obj;
                acvnVar.getClass();
                acmt acmtVar = (acmt) this.receiver;
                acvn acvnVar2 = acvn.b;
                boolean z2 = acmtVar.c;
                boolean z3 = acvnVar == acvnVar2;
                if (z2 != z3) {
                    acmtVar.c = z3;
                    acmtVar.g();
                }
                return awmy.a;
            case 19:
                ((acmt) this.receiver).b((alqc) obj);
                return awmy.a;
            default:
                ((acmt) this.receiver).b((alqc) obj);
                return awmy.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hho(Object obj, int i) {
        super(1, obj, hhr.class, "onConnectivityChangedEvent", "onConnectivityChangedEvent(I)V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hho(Object obj, int i, byte[] bArr, byte[] bArr2) {
        super(1, obj, acmt.class, "onResponse", "onResponse(Lcom/google/protos/youtube/api/innertube/InnertubeGetReelItemWatchService$ReelItemWatchResponse;)V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hho(Object obj, int i, char[] cArr) {
        super(1, obj, hhr.class, "onRecentlyPlayedItemsAdded", "onRecentlyPlayedItemsAdded(Lcom/google/protos/youtube/api/innertube/MusicUpdateRecentlyPlayedWidgetCommandOuterClass$MusicWidgetItemMetadata;)V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hho(Object obj, int i, float[] fArr) {
        super(1, obj, agjz.class, "add", "add(Ljava/lang/Object;)Lcom/google/common/collect/ImmutableList$Builder;", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hho(Object obj, int i, int[] iArr) {
        super(1, obj, ift.class, "onLoopStateChanged", "onLoopStateChanged(Lcom/google/android/apps/youtube/music/player/queue/LoopMode;)V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hho(Object obj, int i, short[] sArr) {
        super(1, obj, awku.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hho(Object obj, int i, boolean[] zArr) {
        super(1, obj, uwv.class, "handleCompositionChange", "handleCompositionChange(Ljava/util/Optional;)V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hho(Object obj, int i, byte[][] bArr) {
        super(1, obj, uzt.class, "handleCompositionChange", "handleCompositionChange(Ljava/util/Optional;)V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hho(Object obj, int i, char[][] cArr) {
        super(1, obj, awly.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hho(Object obj, int i, float[][] fArr) {
        super(1, obj, abek.class, "handleWatchPlaybackEvent", "handleWatchPlaybackEvent(Lcom/google/android/libraries/youtube/player/features/il/shell/PageManagerWatchInteractionLoggingController$WatchPlaybackEvent;)V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hho(Object obj, int i, int[][] iArr) {
        super(1, obj, wmo.class, "parseFutAsync", "parseFutAsync$java_com_google_android_libraries_youtube_innertube_request_response_splitter(Ljava/lang/Iterable;)Lcom/google/protos/youtube/api/innertube/FrameworkUpdateTransportOuterClass$FrameworkUpdateTransport;", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hho(Object obj, int i, boolean[][] zArr) {
        super(1, obj, xed.class, "updateErrorConfig", "updateErrorConfig(Lcom/google/protos/youtube/api/innertube/ErrorLoggingConfigOuterClass$ErrorLoggingConfig;)V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hho(Object obj, int i, char[][][] cArr) {
        super(1, obj, abqh.class, "mapResponse", "mapResponse(Lcom/google/android/libraries/youtube/common/network/fromvolley/Response$Success;)Ljava/lang/Object;", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hho(Object obj, int i, float[][][] fArr) {
        super(1, obj, acmt.class, "onPipStateChanged", "onPipStateChanged(Lcom/google/android/libraries/youtube/reel/pip/PipPlayerObserver$PipState;)V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hho(Object obj, int i, int[][][] iArr) {
        super(1, obj, achh.class, "getPlaybackClientManager", "getPlaybackClientManager(Lcom/google/android/libraries/youtube/player/event/global/SingleVideoChangedEvent;)Ljava/util/Optional;", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hho(Object obj, int i, short[][][] sArr) {
        super(1, obj, abxu.class, "handleActiveSingleVideoChangedEvent", "handleActiveSingleVideoChangedEvent(Lcom/google/android/libraries/youtube/player/video/playbackstate/SingleVideoComponent;)V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hho(Object obj, int i, boolean[][][] zArr) {
        super(1, obj, acmo.class, "onAutoCropDataUpdated", "onAutoCropDataUpdated(Lcom/google/android/libraries/youtube/player/features/autocrop/AutoCropController$AutoCropData;)V", 0);
        this.$cid = i;
    }
}
