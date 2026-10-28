package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wdg implements wda, zwg {
    public final Context a;
    public final wjr b;
    private final Executor c;
    private final wfd d;

    public wdg(Context context, hhb hhbVar, wfc wfcVar, tbt tbtVar, Executor executor, wjr wjrVar) {
        this.a = context;
        this.c = executor;
        this.b = wjrVar;
        hhbVar.getClass();
        this.d = wfcVar.a(new hpc(hhbVar, 4));
        tbtVar.f(this);
    }

    @Override // defpackage.zwg
    public final synchronized void a(zwa zwaVar) {
        this.c.execute(afwl.i(new uqd(this, zwaVar, 17)));
        this.d.c(zwaVar);
    }

    @Override // defpackage.wco
    public final synchronized wcn b(zwa zwaVar) {
        return (wcn) this.d.b(zwaVar);
    }

    @Override // defpackage.wel
    public final /* bridge */ /* synthetic */ wek e(zwa zwaVar) {
        throw null;
    }

    @tcc
    public synchronized void handleSignOutEvent(zwu zwuVar) {
        this.d.d();
    }
}
