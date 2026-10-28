package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abhy implements abhz {
    private final zwb a;
    private final wco b;
    private final avmb c;

    public abhy(zwb zwbVar, wco wcoVar, avmb avmbVar) {
        this.a = zwbVar;
        this.b = wcoVar;
        this.c = avmbVar;
    }

    @Override // defpackage.abhz
    public final ListenableFuture a(agke agkeVar) {
        return agkeVar.isEmpty() ? ahng.n(agpi.a) : tzk.b(this.b.b(this.a.e()).r(76).y(this.c).u(new yrb(agkeVar, 15)));
    }
}
