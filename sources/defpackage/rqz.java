package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class rqz implements afgl, afgm {
    public final afho a;
    public final zwb b;
    public final ahpu c;
    public final abhh d;
    private final afid e;
    private final syn f;

    public rqz(abhh abhhVar, afho afhoVar, ahpu ahpuVar, zwb zwbVar, afid afidVar, syn synVar) {
        this.d = abhhVar;
        this.a = afhoVar;
        this.c = ahpuVar;
        this.b = zwbVar;
        this.e = afidVar;
        this.f = synVar;
    }

    @Override // defpackage.afgk
    public final ListenableFuture a(afgp afgpVar) {
        this.f.l(2);
        afxd afxdVarF = afxd.f(this.e.a());
        olm olmVar = new olm(this, 18);
        long j = afwl.a;
        return afxdVarF.h(new ahdb(afty.c(false), olmVar, 1), MoreExecutors.directExecutor()).h(new ahdb(afty.c(false), new olm(this, 19), 1), MoreExecutors.directExecutor());
    }

    @Override // defpackage.afgl
    public final ListenableFuture b(affd affdVar) {
        this.f.l(3);
        return this.d.w(affdVar);
    }

    @Override // defpackage.afgl
    public final /* synthetic */ ListenableFuture c(affd affdVar) {
        return b(affdVar);
    }
}
