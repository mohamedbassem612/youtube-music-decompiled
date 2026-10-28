package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axdl extends awuq implements awvb {
    public final awuq a;
    public final awtp b;
    public final Object c;
    private final /* synthetic */ awvb d;
    private final int e;
    private final ahud f;

    /* JADX WARN: Multi-variable type inference failed */
    public axdl(awuq awuqVar, int i) {
        awvb awvbVar = awuqVar instanceof awvb ? (awvb) awuqVar : null;
        this.d = awvbVar == null ? awuy.a : awvbVar;
        this.a = awuqVar;
        this.e = i;
        this.b = new awtp(0, awts.a);
        this.f = new ahud((byte[]) null, (byte[]) null);
        this.c = new Object();
    }

    private final boolean j() {
        synchronized (this.c) {
            awtp awtpVar = this.b;
            if (awtpVar.b >= this.e) {
                return false;
            }
            awtpVar.b();
            return true;
        }
    }

    @Override // defpackage.awuq
    public final void a(awou awouVar, Runnable runnable) {
        Runnable runnableH;
        this.f.r(runnable);
        if (this.b.b >= this.e || !j() || (runnableH = h()) == null) {
            return;
        }
        try {
            axnn axnnVar = new axnn(this, runnableH, 1);
            awuq awuqVar = this.a;
            try {
                awuqVar.a(this, axnnVar);
            } catch (Throwable th) {
                throw new awve(th, awuqVar, this);
            }
        } catch (Throwable th2) {
            this.b.a();
            throw th2;
        }
    }

    @Override // defpackage.awvb
    public final awvk c(long j, Runnable runnable, awou awouVar) {
        return this.d.c(j, runnable, awouVar);
    }

    @Override // defpackage.awvb
    public final void d(long j, awuc awucVar) {
        this.d.d(j, awucVar);
    }

    @Override // defpackage.awuq
    public final awuq e(int i) {
        return this.e > 1 ? super.e(1) : this;
    }

    public final Runnable h() {
        while (true) {
            ahud ahudVar = this.f;
            Runnable runnable = (Runnable) ahudVar.p();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.c) {
                awtp awtpVar = this.b;
                awtpVar.a();
                if (ahudVar.o() == 0) {
                    return null;
                }
                awtpVar.b();
            }
        }
    }

    @Override // defpackage.awuq
    public final void i(awou awouVar, Runnable runnable) {
        Runnable runnableH;
        this.f.r(runnable);
        if (this.b.b >= this.e || !j() || (runnableH = h()) == null) {
            return;
        }
        try {
            this.a.i(this, new axnn(this, runnableH, 1));
        } catch (Throwable th) {
            this.b.a();
            throw th;
        }
    }

    @Override // defpackage.awuq
    public final String toString() {
        return this.a + ".limitedParallelism(" + this.e + ')';
    }
}
