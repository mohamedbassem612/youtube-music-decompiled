package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awlh implements avmn, awkb {
    final avlw a;
    final awli b;
    boolean c;
    boolean d;
    awkc e;
    boolean f;
    volatile boolean g;
    long h;

    public awlh(avlw avlwVar, awli awliVar) {
        this.a = avlwVar;
        this.b = awliVar;
    }

    @Override // defpackage.awkb, defpackage.avno
    public final boolean a(Object obj) {
        return this.g || awkl.b(obj, this.a);
    }

    final void b(Object obj, long j) {
        if (this.g) {
            return;
        }
        if (!this.f) {
            synchronized (this) {
                if (this.g) {
                    return;
                }
                if (this.h == j) {
                    return;
                }
                if (this.d) {
                    awkc awkcVar = this.e;
                    if (awkcVar == null) {
                        awkcVar = new awkc();
                        this.e = awkcVar;
                    }
                    awkcVar.a(obj);
                    return;
                }
                this.c = true;
                this.f = true;
            }
        }
        a(obj);
    }

    @Override // defpackage.avmn
    public final void dispose() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.b.av(this);
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.g;
    }
}
