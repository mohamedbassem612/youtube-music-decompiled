package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avxw extends AtomicInteger implements avok, axsq {
    private static final long serialVersionUID = 1577321883966341961L;
    final axsp a;
    final avnn b;
    final avxx[] c;
    final AtomicReferenceArray d;
    final AtomicReference e;
    final AtomicLong f;
    final awkd g;
    volatile boolean h;

    public avxw(axsp axspVar, avnn avnnVar, int i) {
        this.a = axspVar;
        this.b = avnnVar;
        avxx[] avxxVarArr = new avxx[i];
        for (int i2 = 0; i2 < i; i2++) {
            avxxVarArr[i2] = new avxx(this, i2);
        }
        this.c = avxxVarArr;
        this.d = new AtomicReferenceArray(i);
        this.e = new AtomicReference();
        this.f = new AtomicLong();
        this.g = new awkd();
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        if (this.h) {
            atqp.n(th);
            return;
        }
        this.h = true;
        f(-1);
        atqp.x(this.a, th, this, this.g);
    }

    @Override // defpackage.avok
    public final boolean d(Object obj) {
        if (this.h) {
            return false;
        }
        AtomicReferenceArray atomicReferenceArray = this.d;
        int length = atomicReferenceArray.length();
        Object[] objArr = new Object[length + 1];
        objArr[0] = obj;
        int i = 0;
        while (i < length) {
            Object obj2 = atomicReferenceArray.get(i);
            if (obj2 == null) {
                return false;
            }
            i++;
            objArr[i] = obj2;
        }
        try {
            Object objA = this.b.a(objArr);
            objA.getClass();
            atqp.y(this.a, objA, this, this.g);
            return true;
        } catch (Throwable th) {
            avkz.a(th);
            kj();
            b(th);
            return false;
        }
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        awka.j(this.e, this.f, axsqVar);
    }

    final void f(int i) {
        int i2 = 0;
        while (true) {
            avxx[] avxxVarArr = this.c;
            if (i2 >= avxxVarArr.length) {
                return;
            }
            if (i2 != i) {
                awka.f(avxxVarArr[i2]);
            }
            i2++;
        }
    }

    @Override // defpackage.axsq
    public final void kj() {
        awka.f(this.e);
        for (avxx avxxVar : this.c) {
            awka.f(avxxVar);
        }
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        if (d(obj) || this.h) {
            return;
        }
        ((axsq) this.e.get()).ko(1L);
    }

    @Override // defpackage.axsp
    public final void kn() {
        if (this.h) {
            return;
        }
        this.h = true;
        f(-1);
        atqp.v(this.a, this, this.g);
    }

    @Override // defpackage.axsq
    public final void ko(long j) {
        awka.a(this.e, this.f, j);
    }
}
