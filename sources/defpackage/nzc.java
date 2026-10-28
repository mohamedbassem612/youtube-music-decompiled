package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class nzc implements nse {
    public final int b;
    public final nzw c;
    public final nzu d = new nzu();
    public final String e;
    public final nzk f;
    private final Executor g;

    public nzc(String str, int i, nzw nzwVar, Executor executor, nzk nzkVar) {
        this.b = i;
        this.c = nzwVar;
        this.g = executor;
        this.e = str;
        this.f = nzkVar;
    }

    @Override // defpackage.nse
    public final void a(boolean z) {
        nzu nzuVar = this.d;
        if (z) {
            nzuVar.b();
        } else {
            nzuVar.c();
            this.g.execute(new mga(this, 11));
        }
    }

    @Override // defpackage.nse
    public final void b() {
        this.d.d();
    }
}
