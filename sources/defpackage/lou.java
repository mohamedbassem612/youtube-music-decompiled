package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lou implements lpb {
    private final /* synthetic */ int $cid;
    public final Object a = new Object();
    public Object b;
    private final Executor c;

    public lou(Executor executor, Object obj, int i) {
        this.$cid = i;
        this.c = executor;
        this.b = obj;
    }

    @Override // defpackage.lpb
    public final void a() {
        int i = this.$cid;
        if (i == 0) {
            synchronized (this.a) {
                this.b = null;
            }
        } else {
            synchronized (this.a) {
                if (i != 1) {
                    this.b = null;
                } else {
                    this.b = null;
                }
            }
        }
    }

    @Override // defpackage.lpb
    public final void b(lpa lpaVar) {
        int i = this.$cid;
        if (i == 0) {
            if (lpaVar.j() || ((lpf) lpaVar).c) {
                return;
            }
            synchronized (this.a) {
                if (this.b != null) {
                    this.c.execute(new ihq(this, lpaVar, 19, (short[]) null));
                }
            }
            return;
        }
        if (i == 1) {
            synchronized (this.a) {
                if (this.b != null) {
                    this.c.execute(new ihq(this, lpaVar, 18, (short[]) null));
                }
            }
            return;
        }
        if (lpaVar.j()) {
            synchronized (this.a) {
                if (this.b != null) {
                    this.c.execute(new ihq(this, lpaVar, 20, (short[]) null));
                }
            }
        }
    }
}
