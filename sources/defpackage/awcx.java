package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awcx extends avow {
    final avlw a;
    final Iterator b;
    volatile boolean c;
    boolean d;
    boolean e;
    boolean f;

    public awcx(avlw avlwVar, Iterator it) {
        this.a = avlwVar;
        this.b = it;
    }

    @Override // defpackage.avot
    public final void c() {
        this.e = true;
    }

    @Override // defpackage.avmn
    public final void dispose() {
        this.c = true;
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.c;
    }

    @Override // defpackage.avot
    public final boolean i() {
        return this.e;
    }

    @Override // defpackage.avop
    public final int kl(int i) {
        if ((i & 1) == 0) {
            return 0;
        }
        this.d = true;
        return 1;
    }

    @Override // defpackage.avot
    public final Object km() {
        if (this.e) {
            return null;
        }
        if (!this.f) {
            this.f = true;
        } else if (!this.b.hasNext()) {
            this.e = true;
            return null;
        }
        Object next = this.b.next();
        next.getClass();
        return next;
    }
}
