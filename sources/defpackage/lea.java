package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class lea extends ldz {
    private boolean a;

    protected lea(ldr ldrVar) {
        super(ldrVar);
        this.t.t();
    }

    protected abstract boolean e();

    protected final void m() {
        if (!r()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void p() {
        if (this.a) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (e()) {
            return;
        }
        this.t.s();
        this.a = true;
    }

    public final void q() {
        if (this.a) {
            throw new IllegalStateException("Can't initialize twice");
        }
        aX();
        this.t.s();
        this.a = true;
    }

    public final boolean r() {
        return this.a;
    }

    protected void aX() {
    }
}
