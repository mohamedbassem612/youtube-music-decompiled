package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;
import j$.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wma implements wkd {
    public final mbc a;
    private final awmd d;
    private ListenableFuture e;
    private final wjr g;
    public final Map b = new HashMap();
    public final Object c = new Object();
    private boolean f = false;

    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, tqj] */
    public wma(mbc mbcVar, wjr wjrVar, awmd awmdVar) {
        ListenableFuture listenableFutureM;
        this.e = aher.a;
        this.a = mbcVar;
        this.g = wjrVar;
        this.d = awmdVar;
        try {
            Object obj = wjrVar.b;
            int i = tqr.a;
            ?? r4 = ((dov) obj).a;
            boolean zK = r4.k(1073820224);
            int iA = r4.a(1074475585);
            if (zK) {
                throw new trp("Token store overflowed when trying to read.");
            }
            alys alysVar = (alys) aihn.parseFrom(alys.a, iA == 0 ? new byte[0] : r4.n(1342186048, iA), ExtensionRegistryLite.getGeneratedRegistry());
            alysVar.getClass();
            listenableFutureM = new aher(alysVar);
            vzs vzsVar = new vzs(this, 4);
            Executor executorDirectExecutor = MoreExecutors.directExecutor();
            long j = afwl.a;
            afwi afwiVar = new afwi(afty.c(false), vzsVar);
            int i2 = ahcs.c;
            ahcr ahcrVar = new ahcr(listenableFutureM, afwiVar);
            listenableFutureM.addListener(ahcrVar, MoreExecutors.c(executorDirectExecutor, ahcrVar));
            this.e = ahcrVar;
            vzs vzsVar2 = new vzs(this, 5);
            Executor executorDirectExecutor2 = MoreExecutors.directExecutor();
            afwi afwiVar2 = new afwi(afty.c(false), vzsVar2);
            int i3 = ahbz.d;
            ahby ahbyVar = new ahby(ahcrVar, Exception.class, afwiVar2);
            ahcrVar.addListener(ahbyVar, MoreExecutors.c(executorDirectExecutor2, ahbyVar));
            this.e = ahbyVar;
        } catch (Exception e) {
            listenableFutureM = ahng.m(e);
        }
    }

    @Override // defpackage.wkd
    public final aihf a(aihf aihfVar) {
        try {
            ListenableFuture listenableFuture = this.e;
            ahno.R(listenableFuture.isDone(), "Future was expected to be done: %s", listenableFuture);
            a.i(listenableFuture);
        } catch (IllegalArgumentException | IllegalStateException | ExecutionException e) {
            c(e);
        }
        if (aihfVar == null) {
            return null;
        }
        aloo alooVar = ((InnertubeContext$InnerTubeContext) aihfVar.instance).f;
        if (alooVar == null) {
            alooVar = aloo.a;
        }
        alyr alyrVar = alooVar.f;
        if (alyrVar == null) {
            alyrVar = alyr.a;
        }
        aihf builder = alyrVar.toBuilder();
        builder.copyOnWrite();
        ((alyr) builder.instance).b = alyr.emptyProtobufList();
        synchronized (this.c) {
            builder.bt(zik.ci(this.a, this.b));
            aloo alooVar2 = ((InnertubeContext$InnerTubeContext) aihfVar.instance).f;
            if (alooVar2 == null) {
                alooVar2 = aloo.a;
            }
            aihf builder2 = alooVar2.toBuilder();
            builder2.copyOnWrite();
            aloo alooVar3 = (aloo) builder2.instance;
            alyr alyrVar2 = (alyr) builder.build();
            alyrVar2.getClass();
            alooVar3.f = alyrVar2;
            alooVar3.b |= 1048576;
            aihfVar.copyOnWrite();
            InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext = (InnertubeContext$InnerTubeContext) aihfVar.instance;
            aloo alooVar4 = (aloo) builder2.build();
            alooVar4.getClass();
            innertubeContext$InnerTubeContext.f = alooVar4;
            innertubeContext$InnerTubeContext.b |= 16;
        }
        return aihfVar;
    }

    /* JADX WARN: Type inference failed for: r12v15, types: [java.lang.Object, tqj] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, tqj] */
    @Override // defpackage.wkd
    public final void b(aihf aihfVar, alop alopVar) {
        List list;
        ListenableFuture listenableFutureM;
        if (alopVar != null) {
            synchronized (this.c) {
                mbc mbcVar = this.a;
                if (aihfVar != null) {
                    aloo alooVar = ((InnertubeContext$InnerTubeContext) aihfVar.instance).f;
                    if (alooVar == null) {
                        alooVar = aloo.a;
                    }
                    alyr alyrVar = alooVar.f;
                    if (alyrVar == null) {
                        alyrVar = alyr.a;
                    }
                    list = alyrVar.b;
                } else {
                    list = agpi.a;
                }
                alyr alyrVar2 = alopVar.k;
                if (alyrVar2 == null) {
                    alyrVar2 = alyr.a;
                }
                aiie aiieVar = alyrVar2.b;
                Map map = this.b;
                zik.cj(mbcVar, list, aiieVar, map);
                agke agkeVar = (agke) Collection.EL.stream(map.keySet()).filter(new uvm(18)).collect(aghu.a);
                aihf aihfVarCreateBuilder = alys.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                alys alysVar = (alys) aihfVarCreateBuilder.instance;
                aiie aiieVar2 = alysVar.c;
                if (!aiieVar2.c()) {
                    alysVar.c = aihn.mutableCopy(aiieVar2);
                }
                aifs.addAll(agkeVar, alysVar.c);
                long epochSecond = mbcVar.f().getEpochSecond();
                aihfVarCreateBuilder.copyOnWrite();
                alys alysVar2 = (alys) aihfVarCreateBuilder.instance;
                alysVar2.b |= 1;
                alysVar2.d = epochSecond;
                alys alysVar3 = (alys) aihfVarCreateBuilder.build();
                try {
                    wjr wjrVar = this.g;
                    alysVar3.getClass();
                    byte[] byteArray = alysVar3.toByteArray();
                    try {
                        Object obj = wjrVar.b;
                        int length = byteArray.length;
                        if (length > 512) {
                            tqh tqhVarD = ((dov) obj).a.d(2);
                            int i = tqr.a;
                            tqhVarD.b(1073820224, 1L);
                            tqhVarD.b(1074475585, 0L);
                            tqhVarD.a();
                            throw new trp(a.bP(length, "input tokens do not fit in the token store. size: ", " bytes"));
                        }
                        tqh tqhVarD2 = ((dov) obj).a.d(((length + 7) >> 3) + 2);
                        int i2 = tqr.a;
                        tqhVarD2.c(1342186048, byteArray);
                        tqhVarD2.b(1074475585, length);
                        tqhVarD2.b(1073820224, 0L);
                        tqhVarD2.a();
                        listenableFutureM = aher.a;
                        ahng.v(listenableFutureM);
                    } catch (Exception e) {
                        listenableFutureM = ahng.m(e);
                    }
                } catch (IllegalArgumentException | IllegalStateException | ExecutionException e2) {
                    this.b.keySet().removeAll(agkeVar);
                    twu.c(5, "Failed to write startup critical tokens to disk.", e2);
                }
            }
        }
    }

    public final void c(Exception exc) {
        if (this.f) {
            return;
        }
        this.f = true;
        zvl zvlVar = (zvl) this.d.io();
        zvj zvjVarA = zvk.a();
        zvjVarA.c(ajtv.ERROR_LEVEL_WARNING);
        zvjVarA.j = 9;
        zvjVarA.d("Failed to read startup critical tokens from disk.");
        zvjVarA.f(exc);
        zvlVar.a(zvjVarA.a());
    }
}
