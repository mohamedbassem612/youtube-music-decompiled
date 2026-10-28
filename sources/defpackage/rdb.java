package defpackage;

import android.view.Choreographer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rdb implements Choreographer.FrameCallback {
    public final Choreographer a = Choreographer.getInstance();
    public boolean b = false;
    private final rda c;

    public rdb(rda rdaVar) {
        this.c = rdaVar;
    }

    public final void a() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.a.postFrameCallback(this);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.b = false;
        rda rdaVar = this.c;
        rdaVar.l(j);
        if (((rdr) rdaVar).J() || ((rdr) rdaVar).f.b() || !((rdr) rdaVar).d.d()) {
            a();
        }
    }
}
