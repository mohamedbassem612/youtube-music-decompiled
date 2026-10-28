package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class evz implements ewf {
    public final boolean a;
    public final ewf b;
    private final boolean c;
    private final ett d;
    private int e;
    private boolean f;
    private final aerj g;

    public evz(ewf ewfVar, boolean z, boolean z2, ett ettVar, aerj aerjVar) {
        if (ewfVar == null) {
            throw new NullPointerException("Argument must not be null");
        }
        this.b = ewfVar;
        this.a = z;
        this.c = z2;
        this.d = ettVar;
        if (aerjVar == null) {
            throw new NullPointerException("Argument must not be null");
        }
        this.g = aerjVar;
    }

    @Override // defpackage.ewf
    public final int a() {
        return this.b.a();
    }

    @Override // defpackage.ewf
    public final Class b() {
        return this.b.b();
    }

    @Override // defpackage.ewf
    public final Object c() {
        return this.b.c();
    }

    public final synchronized void d() {
        if (this.f) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.e++;
    }

    @Override // defpackage.ewf
    public final synchronized void e() {
        if (this.e > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f = true;
        if (this.c) {
            this.b.e();
        }
    }

    public final void f() {
        int i;
        synchronized (this) {
            int i2 = this.e;
            if (i2 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            i = i2 - 1;
            this.e = i;
        }
        if (i == 0) {
            this.g.s(this.d, this);
        }
    }

    public final synchronized boolean g() {
        if (this.e == 0) {
            return false;
        }
        d();
        return true;
    }

    public final synchronized String toString() {
        ewf ewfVar;
        ett ettVar;
        ewfVar = this.b;
        ettVar = this.d;
        return "EngineResource{isMemoryCacheable=" + this.a + ", listener=" + this.g.toString() + ", key=" + String.valueOf(ettVar) + ", acquired=" + this.e + ", isRecycled=" + this.f + ", resource=" + ewfVar.toString() + '}';
    }
}
