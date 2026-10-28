package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class lfo extends lfk {
    private boolean a;

    public lfo(lfv lfvVar) {
        super(lfvVar);
        this.l.n++;
    }

    protected abstract void b();

    public final void w() {
        if (!y()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void x() {
        if (this.a) {
            throw new IllegalStateException("Can't initialize twice");
        }
        b();
        this.l.o++;
        this.a = true;
    }

    final boolean y() {
        return this.a;
    }
}
