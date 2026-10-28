package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.MessageLite;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tpn implements tpq {
    private static final agrf c = agrf.h("com/google/android/libraries/youtube/common/preferences/ProtoDataStoreSettingsStore");
    public final awkv a;
    public final avlh b;
    private final afkb d;
    private final MessageLite e;

    public tpn(afkb afkbVar, MessageLite messageLite) {
        this.e = messageLite;
        this.d = afkbVar;
        awkv awkvVarAI = new awku().aI();
        this.a = awkvVarAI;
        awgn awgnVar = new awgn(new tzh(afkbVar.a()));
        avnn avnnVar = atqp.o;
        this.b = awgnVar.u(new tfk(2)).g().Q(messageLite).k(awkvVarAI).p();
    }

    @Override // defpackage.tpq
    public final ListenableFuture a() {
        ListenableFuture listenableFutureA = this.d.a();
        hqn hqnVar = new hqn(12);
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        long j = afwl.a;
        ahdb ahdbVar = new ahdb(afty.c(false), hqnVar, 1);
        int i = ahcs.c;
        ahcq ahcqVar = new ahcq(listenableFutureA, ahdbVar);
        listenableFutureA.addListener(ahcqVar, MoreExecutors.c(executorDirectExecutor, ahcqVar));
        return ahcqVar;
    }

    @Override // defpackage.tpq
    public final ListenableFuture b(agek agekVar) {
        return afxd.f(this.d.a()).h(new thc(agekVar, 2), MoreExecutors.directExecutor()).h(new thc(this, 3), MoreExecutors.directExecutor()).g(new olh(this, 19), MoreExecutors.directExecutor());
    }

    @Override // defpackage.tpq
    public final MessageLite c() {
        try {
            return ((omj) taf.b(this.d.a(), new qmd(4))).T();
        } catch (Exception e) {
            ((agrc) ((agrc) ((agrc) c.b()).j(e)).k("com/google/android/libraries/youtube/common/preferences/ProtoDataStoreSettingsStore", "blockAndGetData", 'c', "ProtoDataStoreSettingsStore.java")).t("Failed to read from the store. Falling back to store fallbacks");
            return this.e;
        }
    }

    @Override // defpackage.tpq
    public final avlh d() {
        return this.b;
    }
}
