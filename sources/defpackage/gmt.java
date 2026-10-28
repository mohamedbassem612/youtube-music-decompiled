package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gmt implements wnf {
    private final gqh a;
    private final String b;
    private final xsc c;

    public gmt(gqh gqhVar, xsc xscVar, String str) {
        this.a = gqhVar;
        this.c = xscVar;
        this.b = str;
    }

    @Override // defpackage.wnf
    public final /* bridge */ /* synthetic */ wlu a(acjx acjxVar) {
        return this.a.a(acjxVar);
    }

    @Override // defpackage.wnf
    public final /* synthetic */ ListenableFuture b(wlu wluVar, wne wneVar, Executor executor) {
        return zik.ch(this, wluVar, wneVar);
    }

    @Override // defpackage.wnf
    public final void c(wlu wluVar, wne wneVar, zza zzaVar) {
        wluVar.getClass();
        wneVar.getClass();
        xsc xscVar = this.c;
        ((gqh) xscVar.c).i(wluVar, wneVar, new grk(zzaVar, xscVar, this.b, wluVar, wneVar), false);
    }

    @Override // defpackage.wnf
    public final /* synthetic */ ListenableFuture d(wlu wluVar, wne wneVar, Executor executor) {
        return zik.ch(this, wluVar, wneVar);
    }
}
