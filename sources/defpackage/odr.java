package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class odr implements obq {
    public final aunn a;
    public final aunn b;
    public final aunn c;
    public final long d;
    private final boolean e;

    public odr(aunn aunnVar, aunn aunnVar2, aunn aunnVar3, boolean z, long j) {
        this.a = aunnVar;
        this.b = aunnVar2;
        this.c = aunnVar3;
        this.e = z;
        this.d = j;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.obq
    public final ListenableFuture a(Context context) {
        aczl aczlVar = (aczl) this.b.io();
        return ahng.r(new jkb(aczlVar, context, 7, null), aczlVar.a);
    }

    @Override // defpackage.obq
    public final ListenableFuture b() {
        if (this.e) {
            return ((aheo) ahbz.e(aheo.p(((odx) this.a.io()).a()), Throwable.class, new kke(4), MoreExecutors.directExecutor())).r(new isv(this, 19), MoreExecutors.directExecutor()).r(new isv(this, 20), MoreExecutors.directExecutor());
        }
        aheo aheoVarR = ((aheo) ahbz.e(aheo.p(xsc.ak()), Throwable.class, new kke(5), MoreExecutors.directExecutor())).r(new ods(this, 1), MoreExecutors.directExecutor());
        aheoVarR.addListener(new mga(this, 18), MoreExecutors.directExecutor());
        return aheoVarR;
    }

    @Override // defpackage.obq
    public final String c() {
        return (String) ((AtomicReference) ((aczl) this.b.io()).f).get();
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.obq
    public final ListenableFuture d(Context context, String str) {
        aczl aczlVar = (aczl) this.b.io();
        return ahng.r(new ium(aczlVar, context, str, 7, (char[]) null), aczlVar.b);
    }
}
