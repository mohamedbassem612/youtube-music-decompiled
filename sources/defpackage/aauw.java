package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aauw implements abmv {
    public final aceo a;
    public final abmt b;
    public final Executor c;
    private final acfn d;

    public aauw(aceo aceoVar, acfn acfnVar, abmt abmtVar, Executor executor) {
        this.a = aceoVar;
        this.d = acfnVar;
        this.b = abmtVar;
        this.c = new ahfg(executor);
    }

    @Override // defpackage.abmv
    public final void o() {
        if (this.b.g.l(168, 45668748L, false)) {
            this.d.d.add(this);
        }
    }
}
