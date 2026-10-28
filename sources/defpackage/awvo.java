package defpackage;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class awvo extends awuq {
    private long a;
    public awnm b;
    private boolean c;

    protected abstract Thread h();

    protected void k(long j, awvr awvrVar) {
        awux.a.v(j, awvrVar);
    }

    public void l() {
        throw null;
    }

    public long m() {
        throw null;
    }

    public final void n(boolean z) {
        long j = this.a - (true != z ? 1L : 4294967296L);
        this.a = j;
        if (j <= 0) {
            boolean z2 = awuv.a;
            if (this.c) {
                l();
            }
        }
    }

    public final void o(awvg awvgVar) {
        awnm awnmVar = this.b;
        if (awnmVar == null) {
            awnmVar = new awnm();
            this.b = awnmVar;
        }
        awnmVar.addLast(awvgVar);
    }

    public final void p(boolean z) {
        this.a += true != z ? 1L : 4294967296L;
        if (z) {
            return;
        }
        this.c = true;
    }

    public final boolean q() {
        return this.a >= 4294967296L;
    }

    public final boolean r() {
        awnm awnmVar = this.b;
        if (awnmVar != null) {
            return awnmVar.isEmpty();
        }
        return true;
    }

    public final boolean s() {
        awvg awvgVar;
        awnm awnmVar = this.b;
        if (awnmVar == null || (awvgVar = (awvg) awnmVar.e()) == null) {
            return false;
        }
        awvgVar.run();
        return true;
    }

    protected final void t() {
        Thread threadH = h();
        if (Thread.currentThread() != threadH) {
            LockSupport.unpark(threadH);
        }
    }

    @Override // defpackage.awuq
    public final awuq e(int i) {
        return this;
    }
}
