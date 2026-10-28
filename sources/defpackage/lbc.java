package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class lbc extends lbb {
    private boolean a;

    protected lbc(ldr ldrVar) {
        super(ldrVar);
        this.t.t();
    }

    public final void a() {
        if (!e()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void b() {
        if (this.a) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (f()) {
            return;
        }
        this.t.s();
        this.a = true;
    }

    public final void c() {
        if (this.a) {
            throw new IllegalStateException("Can't initialize twice");
        }
        d();
        this.t.s();
        this.a = true;
    }

    final boolean e() {
        return this.a;
    }

    protected abstract boolean f();

    protected void d() {
    }
}
