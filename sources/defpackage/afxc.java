package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afxc {
    private final ahdm a;

    public afxc(ahdm ahdmVar) {
        this.a = ahdmVar;
    }

    public final afxc a(ahdf ahdfVar, Executor executor) {
        return new afxc(this.a.c(afwl.f(ahdfVar), executor));
    }

    public final afxd b() {
        return afxd.f(this.a.g());
    }

    public final String toString() {
        return "PropagatedClosingFuture[" + this.a.toString() + ']';
    }
}
