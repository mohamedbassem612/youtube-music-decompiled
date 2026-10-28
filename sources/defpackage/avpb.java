package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class avpb extends avov {
    private static final long serialVersionUID = -5502432239815349361L;
    protected final avlw a;
    protected Object b;

    public avpb(avlw avlwVar) {
        this.a = avlwVar;
    }

    @Override // defpackage.avot
    public final void c() {
        lazySet(32);
        this.b = null;
    }

    @Override // defpackage.avmn
    public void dispose() {
        set(4);
        this.b = null;
    }

    public final void e(Object obj) {
        int i = get();
        if ((i & 54) == 0) {
            avlw avlwVar = this.a;
            if (i == 8) {
                this.b = obj;
                lazySet(16);
                avlwVar.kk(null);
            } else {
                lazySet(2);
                avlwVar.kk(obj);
            }
            if (get() != 4) {
                avlwVar.kn();
            }
        }
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return get() == 4;
    }

    public final void g(Throwable th) {
        if ((get() & 54) != 0) {
            atqp.n(th);
        } else {
            lazySet(2);
            this.a.b(th);
        }
    }

    @Override // defpackage.avot
    public final boolean i() {
        return get() != 16;
    }

    @Override // defpackage.avop
    public final int kl(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    @Override // defpackage.avot
    public final Object km() {
        if (get() != 16) {
            return null;
        }
        Object obj = this.b;
        this.b = null;
        lazySet(32);
        return obj;
    }
}
