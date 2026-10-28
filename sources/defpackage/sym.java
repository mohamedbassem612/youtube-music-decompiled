package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.MessageLite;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sym implements tpq {
    private static final agrf d = agrf.h("com/google/android/libraries/youtube/common/backup/BackupSettingsStoreManager");
    public final Runnable a;
    public final tpn b;
    public final dov c;
    private final Executor e;
    private final MessageLite f;

    public sym(Executor executor, dov dovVar, Runnable runnable, afkb afkbVar, MessageLite messageLite) {
        this.a = runnable;
        this.b = new tpn(afkbVar, messageLite);
        this.e = executor;
        this.c = dovVar;
        this.f = messageLite;
    }

    private final ListenableFuture e(ahcy ahcyVar) {
        ListenableFuture listenableFutureA;
        if (this.c.aq()) {
            try {
                listenableFutureA = ahcyVar.a(this.b);
            } catch (Exception e) {
                this.c.ap();
                return ahng.m(e);
            }
        } else {
            gwj gwjVar = new gwj(this, ahcyVar, 18);
            Executor executor = this.e;
            long j = afwl.a;
            ahfo ahfoVar = new ahfo(new afwh(afty.c(false), gwjVar, 0));
            executor.execute(ahfoVar);
            listenableFutureA = ahfoVar;
        }
        try {
            return afxd.f(listenableFutureA).g(new olh(this, 15), MoreExecutors.directExecutor()).c(Throwable.class, new olm(this, 20), MoreExecutors.directExecutor());
        } catch (Exception e2) {
            this.c.ap();
            return ahng.m(e2);
        }
    }

    @Override // defpackage.tpq
    public final ListenableFuture a() {
        return e(new hqn(10));
    }

    @Override // defpackage.tpq
    public final ListenableFuture b(agek agekVar) {
        return e(new row(this, agekVar, 3, null));
    }

    @Override // defpackage.tpq
    public final MessageLite c() {
        try {
            this.c.an();
            try {
                try {
                    return this.b.c();
                } finally {
                    this.c.ap();
                }
            } catch (Exception e) {
                ((agrc) ((agrc) ((agrc) d.b()).j(e)).k("com/google/android/libraries/youtube/common/backup/BackupSettingsStoreManager", "blockAndGetData", 74, "BackupSettingsStoreManager.java")).t("Failed to read the valye from PDS");
                this.c.ap();
                return this.f;
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // defpackage.tpq
    public final avlh d() {
        return this.b.b;
    }
}
