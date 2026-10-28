package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class olt implements omb {
    public final Context a;
    public final qnl b;
    private final Executor c;
    private final oii d;
    private final qrx e;

    public olt(Context context, qnl qnlVar, qrx qrxVar, Executor executor, oii oiiVar) {
        this.a = context;
        this.b = qnlVar;
        this.e = qrxVar;
        this.c = executor;
        this.d = oiiVar;
    }

    @Override // defpackage.omb
    public final ListenableFuture a() {
        return this.e.a(new olk(19), this.c);
    }

    public final ListenableFuture b(olg olgVar, int i) {
        ListenableFuture listenableFutureB;
        if (i > olgVar.d) {
            return ahng.n(Boolean.TRUE);
        }
        olg olgVarA = olg.a(i);
        int iOrdinal = olgVarA.ordinal();
        int i2 = 1;
        if (iOrdinal == 1) {
            qrx qrxVar = this.e;
            olj oljVar = new olj(this, 16);
            Executor executor = this.c;
            listenableFutureB = ooi.d(qrxVar.a(oljVar, executor)).e(new olk(20), executor).b(IOException.class, new olj(this, 10), executor);
        } else if (iOrdinal != 2) {
            listenableFutureB = ahng.m(new UnsupportedOperationException("Upgrade to version " + olgVarA.name() + "not supported!"));
        } else {
            qrx qrxVar2 = this.e;
            olj oljVar2 = new olj(this, 13);
            Executor executor2 = this.c;
            listenableFutureB = ooi.d(qrxVar2.a(oljVar2, executor2)).e(new olk(18), executor2).b(IOException.class, new olj(this, 14), executor2);
        }
        return ahno.as(listenableFutureB, new onk(this, i, olgVar, i2), this.c);
    }

    @Override // defpackage.omb
    public final ListenableFuture c() {
        AtomicReference atomicReference = new AtomicReference(new ArrayList());
        kjh kjhVar = new kjh(this, atomicReference, 9, null);
        qrx qrxVar = this.e;
        Executor executor = this.c;
        return ahno.ar(qrxVar.a(kjhVar, executor), new olj(atomicReference, 15), executor);
    }

    @Override // defpackage.omb
    public final ListenableFuture d() {
        Context context = this.a;
        if (!qnl.bh(context)) {
            int i = onb.a;
            qnl.bj(context);
            this.d.z();
            qnl.bi(context, olg.a(2));
            return ahng.n(Boolean.FALSE);
        }
        this.d.z();
        olg olgVarA = olg.a(2);
        olg olgVarBT = qnl.bT(context, this.b);
        int i2 = olgVarA.d;
        int i3 = olgVarBT.d;
        if (i2 == i3) {
            return ahng.n(Boolean.TRUE);
        }
        int i4 = 0;
        int i5 = 1;
        if (i2 >= i3) {
            ooi ooiVarD = ooi.d(b(olgVarA, i3 + 1));
            ols olsVar = new ols(this, olgVarA, i5);
            Executor executor = this.c;
            return ooiVarD.c(Exception.class, olsVar, executor).f(new ols(this, olgVarA, i4), executor);
        }
        onb.e("%s Cannot migrate back from value %s to %s. Clear everything!", "ProtoDataStoreSharedFilesMetadata", olgVarBT, olgVarA);
        new Exception("Downgraded file key from " + olgVarBT.toString() + " to " + olgVarA.toString() + '.');
        qnl.bi(context, olgVarA);
        return ahng.n(Boolean.FALSE);
    }

    @Override // defpackage.omb
    public final ListenableFuture e(oiz oizVar) {
        return ahno.ar(f(new agqj(oizVar)), new olj(oizVar, 11), MoreExecutors.directExecutor());
    }

    @Override // defpackage.omb
    public final ListenableFuture f(agkz agkzVar) {
        return ahno.ar(this.e.c(), new kjh(this, agkzVar, 7, null), MoreExecutors.directExecutor());
    }

    @Override // defpackage.omb
    public final ListenableFuture g(oiz oizVar) {
        olj oljVar = new olj(nst.d(oizVar, this.a, this.b), 12);
        Executor executor = this.c;
        return ooi.d(this.e.a(oljVar, executor)).e(new olk(16), executor).b(IOException.class, new olk(17), executor);
    }

    @Override // defpackage.omb
    public final ListenableFuture h(oiz oizVar, ojb ojbVar) {
        kjh kjhVar = new kjh(nst.d(oizVar, this.a, this.b), ojbVar, 8);
        Executor executor = this.c;
        return ooi.d(this.e.a(kjhVar, executor)).e(new olk(14), executor).b(IOException.class, new olk(15), executor);
    }

    public final void i(olg olgVar) {
        Context context = this.a;
        if (qnl.bT(context, this.b).d == olgVar.d || qnl.bi(context, olgVar)) {
            return;
        }
        onb.b(a.cn((byte) 46, olgVar, "Failed to commit migration version to disk. Fail to set target version to "));
        new Exception(a.cn((byte) 46, olgVar, "Fail to set target version "));
    }
}
