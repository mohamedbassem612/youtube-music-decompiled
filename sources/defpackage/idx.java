package defpackage;

import android.util.Base64;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class idx implements ids {
    public static final agrf b = agrf.h("com/google/android/apps/youtube/music/player/queue/persistence/PersistentQueueStoreProtoDataStore");
    public final mbc c;
    public final hwz d;
    public final kjc e;
    public final hfn f;
    private final Executor g;
    private final qrx h;
    private final qrx i;
    private final qrx j;

    public idx(mbc mbcVar, Executor executor, hwz hwzVar, hfn hfnVar, kjc kjcVar, qrx qrxVar, qrx qrxVar2, qrx qrxVar3) {
        this.c = mbcVar;
        this.h = qrxVar;
        this.i = qrxVar2;
        this.j = qrxVar3;
        this.g = executor;
        this.d = hwzVar;
        this.f = hfnVar;
        this.e = kjcVar;
    }

    public static final void j(Throwable th, String str) {
        ((agrc) ((agrc) ((agrc) b.c().i(agso.a, "PersistentQueuePDS")).j(th)).k("com/google/android/apps/youtube/music/player/queue/persistence/PersistentQueueStoreProtoDataStore", "logFailure", (char) 568, "PersistentQueueStoreProtoDataStore.java")).w("Action failed: %s.", str);
    }

    private final void k(final Function function) {
        taf.j(this.h.a(new agek() { // from class: idt
            @Override // defpackage.agek
            public final Object apply(Object obj) {
                aimg aimgVar = (aimg) obj;
                Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(aimgVar.c);
                kjc kjcVar = this.a.e;
                aily ailyVar = (aily) j$.util.Map.EL.getOrDefault(mapUnmodifiableMap, kjcVar.o(), aily.a);
                aihf builder = aimgVar.toBuilder();
                builder.ax(kjcVar.o(), (aily) function.apply(ailyVar));
                return (aimg) builder.build();
            }
        }, MoreExecutors.directExecutor()), new hou(16));
    }

    @Override // defpackage.ids
    public final ListenableFuture a() {
        ListenableFuture listenableFutureC = this.h.c();
        gqq gqqVar = new gqq(this, 8);
        long j = afwl.a;
        afwi afwiVar = new afwi(afty.c(false), gqqVar);
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        int i = ahcs.c;
        final ahcr ahcrVar = new ahcr(listenableFutureC, afwiVar);
        listenableFutureC.addListener(ahcrVar, MoreExecutors.c(executorDirectExecutor, ahcrVar));
        hmb hmbVar = new hmb(7);
        Executor executor = taf.a;
        Executor executorDirectExecutor2 = MoreExecutors.directExecutor();
        tae taeVar = taf.c;
        ahcrVar.addListener(new ahei(ahcrVar, new afwj(afty.c(false), new taa(taeVar, null, hmbVar), 0)), executorDirectExecutor2);
        String strO = this.e.o();
        ListenableFuture listenableFutureC2 = this.i.c();
        final ahcr ahcrVar2 = new ahcr(listenableFutureC2, new afwi(afty.c(false), new idv(this, strO, 0)));
        Executor executor2 = this.g;
        listenableFutureC2.addListener(ahcrVar2, MoreExecutors.c(executor2, ahcrVar2));
        ahcrVar2.addListener(new ahei(ahcrVar2, new afwj(afty.c(false), new taa(taeVar, null, new hmb(5)), 0)), MoreExecutors.directExecutor());
        ListenableFuture listenableFutureC3 = this.j.c();
        final ahcr ahcrVar3 = new ahcr(listenableFutureC3, new afwi(afty.c(false), new gqq(this, 7)));
        listenableFutureC3.addListener(ahcrVar3, MoreExecutors.c(executor2, ahcrVar3));
        ahcrVar3.addListener(new ahei(ahcrVar3, new afwj(afty.c(false), new taa(taeVar, null, new hmb(6)), 0)), MoreExecutors.directExecutor());
        ListenableFuture listenableFutureA = new ahek(false, agke.p(new ListenableFuture[]{ahcrVar, ahcrVar2, ahcrVar3})).a(new ahcz(afty.c(false), new Callable() { // from class: idu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                abnl abnlVarN;
                ajwo ajwoVar;
                ListenableFuture listenableFuture = ahcrVar;
                ahno.R(listenableFuture.isDone(), "Future was expected to be done: %s", listenableFuture);
                aily ailyVar = (aily) a.i(listenableFuture);
                ListenableFuture listenableFuture2 = ahcrVar2;
                ahno.R(listenableFuture2.isDone(), "Future was expected to be done: %s", listenableFuture2);
                List list = (List) a.i(listenableFuture2);
                ListenableFuture listenableFuture3 = ahcrVar3;
                ahno.R(listenableFuture3.isDone(), "Future was expected to be done: %s", listenableFuture3);
                aimd aimdVar = (aimd) a.i(listenableFuture3);
                long j2 = ailyVar.c;
                idx idxVar = this.a;
                if (idxVar.c.f().toEpochMilli() - j2 >= idx.a) {
                    ((agrc) ((agrc) idx.b.c().i(agso.a, "PersistentQueuePDS")).k("com/google/android/apps/youtube/music/player/queue/persistence/PersistentQueueStoreProtoDataStore", "createMusicPlaybackQueueState", 329, "PersistentQueueStoreProtoDataStore.java")).t("Restored queue exceeds expiry, clearing storage.");
                    idxVar.b();
                    return null;
                }
                if (list == null || list.isEmpty()) {
                    ((agrc) ((agrc) idx.b.c().i(agso.a, "PersistentQueuePDS")).k("com/google/android/apps/youtube/music/player/queue/persistence/PersistentQueueStoreProtoDataStore", "createMusicPlaybackQueueState", 335, "PersistentQueueStoreProtoDataStore.java")).v("Restored queue is empty and dismiss queue refactor is enabled, returning dismissed queue with timestamp %d.", j2);
                    ief iefVarA = ieg.a();
                    iefVarA.k(j2);
                    return iefVarA.a();
                }
                ief iefVarA2 = ieg.a();
                iefVarA2.k(j2);
                aiie<String> aiieVar = ailyVar.k;
                if (!aiieVar.isEmpty()) {
                    for (String str : aiieVar) {
                        if (iefVarA2.g == null) {
                            if (iefVarA2.h == null) {
                                iefVarA2.g = new agjz(4);
                            } else {
                                iefVarA2.g = new agjz(4);
                                iefVarA2.g.j(iefVarA2.h);
                                iefVarA2.h = null;
                            }
                        }
                        iefVarA2.g.h(Base64.decode(str, 0));
                    }
                }
                iefVarA2.i = ailyVar.v;
                int i2 = ailyVar.j;
                agkj agkjVar = ibh.f;
                Integer numValueOf = Integer.valueOf(i2);
                if (!agkjVar.containsKey(numValueOf)) {
                    throw new IllegalArgumentException();
                }
                ibh ibhVar = (ibh) agkjVar.get(numValueOf);
                ibhVar.getClass();
                iefVarA2.a = Optional.of(ibhVar);
                Optional optionalOf = Optional.of(ibhVar);
                iefVarA2.i(ailyVar.d);
                agrx agrxVar = agso.a;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    abke abkeVar = (abke) list.get(i3);
                    if (abkeVar instanceof hzf) {
                        hzf hzfVar = (hzf) abkeVar;
                        aoun aounVar = hzfVar.a;
                        if (aounVar != null && (aounVar.b & SemanticState.Hidden) != 0) {
                            aihh aihhVar = (aihh) aounVar.toBuilder();
                            ajwo ajwoVar2 = aounVar.l;
                            if (ajwoVar2 == null) {
                                ajwoVar2 = ajwo.a;
                            }
                            aihh aihhVar2 = (aihh) ajwoVar2.toBuilder();
                            aihhVar2.d(aoaq.b);
                            aihhVar.copyOnWrite();
                            aoun aounVar2 = (aoun) aihhVar.instance;
                            ajwo ajwoVar3 = (ajwo) aihhVar2.build();
                            ajwoVar3.getClass();
                            aounVar2.l = ajwoVar3;
                            aounVar2.b |= SemanticState.Hidden;
                            hzfVar.u((aoun) aihhVar.build());
                        }
                    } else if (abkeVar instanceof hzg) {
                        hzg hzgVar = (hzg) abkeVar;
                        ibh[] ibhVarArr = {ibh.ATV_PREFERRED, ibh.OMV_PREFERRED, ibh.DONT_PLAY_VIDEO_OVERRIDE};
                        for (int i4 = 0; i4 < 3; i4++) {
                            ibh ibhVar2 = ibhVarArr[i4];
                            aoun aounVarV = hzgVar.v(ibhVar2);
                            if ((aounVarV.b & SemanticState.Hidden) != 0) {
                                aihh aihhVar3 = (aihh) aounVarV.toBuilder();
                                ajwo ajwoVar4 = aounVarV.l;
                                if (ajwoVar4 == null) {
                                    ajwoVar4 = ajwo.a;
                                }
                                aihh aihhVar4 = (aihh) ajwoVar4.toBuilder();
                                aihhVar4.d(aoaq.b);
                                aihhVar3.copyOnWrite();
                                aoun aounVar3 = (aoun) aihhVar3.instance;
                                ajwo ajwoVar5 = (ajwo) aihhVar4.build();
                                ajwoVar5.getClass();
                                aounVar3.l = ajwoVar5;
                                aounVar3.b |= SemanticState.Hidden;
                                aoun aounVar4 = (aoun) aihhVar3.build();
                                if (hwz.k(ibhVar2)) {
                                    hzgVar.d = aounVar4;
                                } else {
                                    hzgVar.e = aounVar4;
                                }
                            }
                        }
                        hzgVar.w((ibh) optionalOf.get());
                    } else if (abkeVar != null && abkeVar.n() != null && abkeVar.n().b != null && (ajwoVar = (abnlVarN = abkeVar.n()).b) != null) {
                        aihh aihhVar5 = (aihh) ajwoVar.toBuilder();
                        aihhVar5.d(aoaq.b);
                        abnlVarN.b = (ajwo) aihhVar5.build();
                    }
                }
                int i5 = ailyVar.e;
                if (i5 == -1) {
                    iefVarA2.j(list);
                    iefVarA2.g(false);
                } else if (i5 > list.size()) {
                    iefVarA2.j(list);
                    iefVarA2.g(true);
                } else {
                    iefVarA2.j(list.subList(0, i5));
                    iefVarA2.f(list.subList(i5, list.size()));
                    iefVarA2.g(true);
                }
                iefVarA2.b = ailyVar.g;
                iefVarA2.c = ailyVar.h;
                if ((aimdVar.b & 1) != 0) {
                    aobx aobxVar = aimdVar.c;
                    if (aobxVar == null) {
                        aobxVar = aobx.a;
                    }
                    iefVarA2.d = aobxVar;
                }
                if ((aimdVar.b & 2) != 0) {
                    aoyh aoyhVar = aimdVar.d;
                    if (aoyhVar == null) {
                        aoyhVar = aoyh.a;
                    }
                    iefVarA2.e = aoyhVar;
                }
                if ((aimdVar.b & 4) != 0) {
                    aobz aobzVar = aimdVar.e;
                    if (aobzVar == null) {
                        aobzVar = aobz.a;
                    }
                    iefVarA2.f = aobzVar;
                }
                iefVarA2.h(ailyVar.f);
                iefVarA2.m(ailyVar.i);
                ajwo ajwoVar6 = ailyVar.l;
                if (ajwoVar6 == null) {
                    ajwoVar6 = ajwo.a;
                }
                iefVarA2.j = ajwoVar6;
                anvl anvlVar = ailyVar.m;
                if (anvlVar == null) {
                    anvlVar = anvl.a;
                }
                iefVarA2.k = anvlVar;
                if ((ailyVar.b & SemanticState.ReadOnly) != 0) {
                    anvo anvoVar = ailyVar.n;
                    if (anvoVar == null) {
                        anvoVar = anvo.a;
                    }
                    iefVarA2.l = Optional.of(anvoVar);
                }
                if ((ailyVar.b & SemanticState.Modal) != 0) {
                    ajta ajtaVar = ailyVar.o;
                    if (ajtaVar == null) {
                        ajtaVar = ajta.a;
                    }
                    iefVarA2.m = Optional.of(ajtaVar);
                }
                if ((ailyVar.b & SemanticState.Multiline) != 0) {
                    ajta ajtaVar2 = ailyVar.p;
                    if (ajtaVar2 == null) {
                        ajtaVar2 = ajta.a;
                    }
                    iefVarA2.n = Optional.of(ajtaVar2);
                }
                if ((ailyVar.b & 32768) != 0) {
                    iefVarA2.o = Optional.of(ailyVar.q);
                }
                if ((ailyVar.b & 65536) != 0) {
                    ajwo ajwoVar7 = ailyVar.r;
                    if (ajwoVar7 == null) {
                        ajwoVar7 = ajwo.a;
                    }
                    iefVarA2.p = Optional.of(ajwoVar7);
                }
                if ((ailyVar.b & 131072) != 0) {
                    ajwo ajwoVar8 = ailyVar.s;
                    if (ajwoVar8 == null) {
                        ajwoVar8 = ajwo.a;
                    }
                    iefVarA2.q = Optional.of(ajwoVar8);
                }
                aimm aimmVar = ailyVar.t;
                if (aimmVar == null) {
                    aimmVar = aimm.a;
                }
                iefVarA2.l(aimmVar);
                if ((ailyVar.b & 524288) != 0) {
                    apla aplaVar = ailyVar.u;
                    if (aplaVar == null) {
                        aplaVar = apla.a;
                    }
                    iefVarA2.r = Optional.of(aplaVar);
                }
                return iefVarA2.a();
            }
        }, 1), MoreExecutors.directExecutor());
        listenableFutureA.addListener(new ahei(listenableFutureA, new afwj(afty.c(false), new taa(taeVar, null, new hmb(4)), 0)), MoreExecutors.directExecutor());
        return listenableFutureA;
    }

    @Override // defpackage.ids
    public final void b() {
        agrx agrxVar = agso.a;
        taf.j(this.h.a(new rwf(this, this.c.f().toEpochMilli(), 1), MoreExecutors.directExecutor()), new hou(18));
        taf.j(this.i.a(new iat(this, 12), this.g), new hou(20));
        acjw acjwVar = acjw.b;
        acjx acjxVarAe = aawb.ae(aobx.a);
        acjxVarAe.getClass();
        acjw acjwVar2 = acjw.c;
        acjx acjxVarAe2 = aawb.ae(aoyh.a);
        acjxVarAe2.getClass();
        acjw acjwVar3 = acjw.h;
        acjx acjxVarAe3 = aawb.ae(aobz.a);
        acjxVarAe3.getClass();
        d(agkj.l(acjwVar, acjxVarAe, acjwVar2, acjxVarAe2, acjwVar3, acjxVarAe3));
    }

    @Override // defpackage.ids
    public final void c() {
        k(new iaa(13));
    }

    @Override // defpackage.ids
    public final void d(Map map) {
        aihf aihfVarCreateBuilder = aimd.a.createBuilder();
        acjw acjwVar = acjw.b;
        if (map.containsKey(acjwVar)) {
            aobx aobxVar = (aobx) aawb.ag((acjx) map.get(acjwVar), aobx.class);
            aobxVar.getClass();
            aihfVarCreateBuilder.copyOnWrite();
            aimd aimdVar = (aimd) aihfVarCreateBuilder.instance;
            aimdVar.c = aobxVar;
            aimdVar.b |= 1;
        }
        acjw acjwVar2 = acjw.c;
        if (map.containsKey(acjwVar2)) {
            aoyh aoyhVar = (aoyh) aawb.ag((acjx) map.get(acjwVar2), aoyh.class);
            aoyhVar.getClass();
            aihfVarCreateBuilder.copyOnWrite();
            aimd aimdVar2 = (aimd) aihfVarCreateBuilder.instance;
            aimdVar2.d = aoyhVar;
            aimdVar2.b |= 2;
        }
        acjw acjwVar3 = acjw.h;
        if (map.containsKey(acjwVar3)) {
            aobz aobzVar = (aobz) aawb.ag((acjx) map.get(acjwVar3), aobz.class);
            aobzVar.getClass();
            aihfVarCreateBuilder.copyOnWrite();
            aimd aimdVar3 = (aimd) aihfVarCreateBuilder.instance;
            aimdVar3.e = aobzVar;
            aimdVar3.b |= 4;
        }
        taf.j(this.j.a(new idw(this, aihfVarCreateBuilder, 0), this.g), new ihw(1));
    }

    @Override // defpackage.ids
    public final void e(ibh ibhVar) {
        k(new hqs(ibhVar, 15));
    }

    @Override // defpackage.ids
    public final void f(int i, int i2) {
        agrx agrxVar = agso.a;
        k(new xfu(i, i2, 1));
    }

    @Override // defpackage.ids
    public final void g(iej iejVar) {
        agke agkeVar = iejVar.a;
        if (agkeVar.isEmpty()) {
            agrx agrxVar = agso.a;
            b();
            return;
        }
        agrx agrxVar2 = agso.a;
        iejVar.a();
        aihf aihfVarCreateBuilder = aily.a.createBuilder();
        long epochMilli = this.c.f().toEpochMilli();
        aihfVarCreateBuilder.copyOnWrite();
        aily ailyVar = (aily) aihfVarCreateBuilder.instance;
        int i = 1;
        ailyVar.b |= 1;
        ailyVar.c = epochMilli;
        int i2 = iejVar.b;
        aihfVarCreateBuilder.copyOnWrite();
        aily ailyVar2 = (aily) aihfVarCreateBuilder.instance;
        ailyVar2.b |= 2;
        ailyVar2.d = i2;
        int i3 = iejVar.c;
        aihfVarCreateBuilder.copyOnWrite();
        aily ailyVar3 = (aily) aihfVarCreateBuilder.instance;
        ailyVar3.b |= 4;
        ailyVar3.e = i3;
        boolean z = iejVar.d;
        aihfVarCreateBuilder.copyOnWrite();
        aily ailyVar4 = (aily) aihfVarCreateBuilder.instance;
        ailyVar4.b |= 8;
        ailyVar4.f = z;
        aihfVarCreateBuilder.aw(iejVar.g);
        long j = ((aily) aihfVarCreateBuilder.instance).c;
        aigj aigjVar = iejVar.h;
        if (aigjVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            aily ailyVar5 = (aily) aihfVarCreateBuilder.instance;
            ailyVar5.b |= 1048576;
            ailyVar5.v = aigjVar;
        }
        ajwo ajwoVar = iejVar.i;
        if (ajwoVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            aily ailyVar6 = (aily) aihfVarCreateBuilder.instance;
            ailyVar6.l = ajwoVar;
            ailyVar6.b |= SemanticState.Hidden;
        }
        String str = iejVar.e;
        if (str != null) {
            aihfVarCreateBuilder.copyOnWrite();
            aily ailyVar7 = (aily) aihfVarCreateBuilder.instance;
            ailyVar7.b |= 16;
            ailyVar7.g = str;
        }
        String str2 = iejVar.f;
        if (str2 != null) {
            aihfVarCreateBuilder.copyOnWrite();
            aily ailyVar8 = (aily) aihfVarCreateBuilder.instance;
            ailyVar8.b |= 32;
            ailyVar8.h = str2;
        }
        anvl anvlVar = iejVar.j;
        if (anvlVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            aily ailyVar9 = (aily) aihfVarCreateBuilder.instance;
            ailyVar9.m = anvlVar;
            ailyVar9.b |= SemanticState.LiveRegion;
        }
        Optional optional = iejVar.k;
        hun hunVar = new hun(aihfVarCreateBuilder, 11);
        if (true == optional.isPresent()) {
            Object obj = optional.get();
            aihf aihfVar = (aihf) hunVar.a;
            aihfVar.copyOnWrite();
            aily ailyVar10 = (aily) aihfVar.instance;
            ailyVar10.n = (anvo) obj;
            ailyVar10.b |= SemanticState.ReadOnly;
        }
        Optional optional2 = iejVar.l;
        hun hunVar2 = new hun(aihfVarCreateBuilder, 12);
        if (true == optional2.isPresent()) {
            Object obj2 = optional2.get();
            aihf aihfVar2 = (aihf) hunVar2.a;
            aihfVar2.copyOnWrite();
            aily ailyVar11 = (aily) aihfVar2.instance;
            ailyVar11.o = (ajta) obj2;
            ailyVar11.b |= SemanticState.Modal;
        }
        Optional optional3 = iejVar.m;
        hun hunVar3 = new hun(aihfVarCreateBuilder, 13);
        if (true == optional3.isPresent()) {
            Object obj3 = optional3.get();
            aihf aihfVar3 = (aihf) hunVar3.a;
            aihfVar3.copyOnWrite();
            aily ailyVar12 = (aily) aihfVar3.instance;
            ailyVar12.p = (ajta) obj3;
            ailyVar12.b |= SemanticState.Multiline;
        }
        Optional optional4 = iejVar.n;
        hun hunVar4 = new hun(aihfVarCreateBuilder, 14);
        if (true == optional4.isPresent()) {
            Object obj4 = optional4.get();
            aihf aihfVar4 = (aihf) hunVar4.a;
            aihfVar4.copyOnWrite();
            aily ailyVar13 = (aily) aihfVar4.instance;
            ailyVar13.b |= 32768;
            ailyVar13.q = (aigj) obj4;
        }
        Optional optional5 = iejVar.o;
        hun hunVar5 = new hun(aihfVarCreateBuilder, 15);
        if (true == optional5.isPresent()) {
            Object obj5 = optional5.get();
            aihf aihfVar5 = (aihf) hunVar5.a;
            aihfVar5.copyOnWrite();
            aily ailyVar14 = (aily) aihfVar5.instance;
            ailyVar14.r = (ajwo) obj5;
            ailyVar14.b |= 65536;
        }
        Optional optional6 = iejVar.p;
        hun hunVar6 = new hun(aihfVarCreateBuilder, 16);
        if (true == optional6.isPresent()) {
            Object obj6 = optional6.get();
            aihf aihfVar6 = (aihf) hunVar6.a;
            aihfVar6.copyOnWrite();
            aily ailyVar15 = (aily) aihfVar6.instance;
            ailyVar15.s = (ajwo) obj6;
            ailyVar15.b |= 131072;
        }
        aimm aimmVar = iejVar.q;
        aihfVarCreateBuilder.copyOnWrite();
        aily ailyVar16 = (aily) aihfVarCreateBuilder.instance;
        aimmVar.getClass();
        ailyVar16.t = aimmVar;
        ailyVar16.b |= 262144;
        Optional optional7 = iejVar.r;
        hun hunVar7 = new hun(aihfVarCreateBuilder, 10);
        if (true == optional7.isPresent()) {
            Object obj7 = optional7.get();
            aihf aihfVar7 = (aihf) hunVar7.a;
            aihfVar7.copyOnWrite();
            aily ailyVar17 = (aily) aihfVar7.instance;
            ailyVar17.u = (apla) obj7;
            ailyVar17.b |= 524288;
        }
        taf.j(this.h.a(new idw(this, (aily) aihfVarCreateBuilder.build(), i), MoreExecutors.directExecutor()), new hou(19));
        agkeVar.size();
        taf.j(this.i.a(new gqa(this, agkeVar, 20), this.g), new hou(17));
    }

    @Override // defpackage.ids
    public final void h(aimm aimmVar) {
        k(new hqs(aimmVar, 16));
    }

    @Override // defpackage.ids
    public final void i(long j) {
        k(new adis(j, 1));
    }
}
