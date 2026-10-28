package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avee extends avda {
    private static final avec b = new avea(1);
    private static final avec c = new avea(0);
    private static final avec d = new avea(2);
    private static final aved e = new aveb();
    public int a;
    private final Deque f;
    private Deque g;
    private boolean h;
    private int i;

    public avee() {
        this.i = 0;
        this.f = new ArrayDeque();
    }

    private final int l(aved avedVar, int i, Object obj, int i2) {
        a(i);
        Deque deque = this.f;
        if (!deque.isEmpty()) {
            p();
        }
        while (i > 0) {
            if (deque.isEmpty()) {
                throw new AssertionError("Failed executing read operation");
            }
            avil avilVar = (avil) deque.peek();
            int iMin = Math.min(i, avilVar.f());
            i2 = avedVar.a(avilVar, iMin, obj, i2);
            i -= iMin;
            this.a -= iMin;
            p();
        }
        return i2;
    }

    private final int m(avec avecVar, int i, Object obj, int i2) {
        try {
            return l(avecVar, i, obj, i2);
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    private final void n() {
        Deque deque = this.f;
        if (this.i > deque.size()) {
            this.i = deque.size();
        }
    }

    private final void o() {
        if (this.h) {
            Deque deque = this.g;
            Deque deque2 = this.f;
            deque.add((avil) deque2.remove());
            avil avilVar = (avil) deque2.peek();
            if (avilVar != null) {
                avilVar.b();
            }
        } else {
            ((avil) this.f.remove()).close();
        }
        n();
    }

    private final void p() {
        if (((avil) this.f.peek()).f() == 0) {
            o();
        }
    }

    private final void q(int i) {
        if (this.h) {
            return;
        }
        avil[] avilVarArr = new avil[i];
        int iF = 0;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            avil avilVar = (avil) this.f.pollLast();
            avilVarArr[i2] = avilVar;
            iF += avilVar.f();
        }
        byte[] bArr = new byte[iF];
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            avil avilVar2 = avilVarArr[i4];
            int iF2 = avilVar2.f();
            avilVar2.j(bArr, i3, iF2);
            i3 += iF2;
            avilVar2.close();
        }
        avil avilVar3 = avip.a;
        this.f.add(new avin(bArr, 0, iF));
    }

    @Override // defpackage.avda, defpackage.avil
    public final void b() {
        if (this.g == null) {
            this.g = new ArrayDeque(Math.min(this.f.size(), 16));
        }
        while (!this.g.isEmpty()) {
            ((avil) this.g.remove()).close();
        }
        this.h = true;
        avil avilVar = (avil) this.f.peek();
        if (avilVar != null) {
            avilVar.b();
        }
    }

    @Override // defpackage.avda, defpackage.avil
    public final void c() {
        if (!this.h) {
            throw new InvalidMarkException();
        }
        Deque deque = this.f;
        avil avilVar = (avil) deque.peek();
        if (avilVar != null) {
            int iF = avilVar.f();
            avilVar.c();
            this.a += avilVar.f() - iF;
        }
        while (true) {
            avil avilVar2 = (avil) this.g.pollLast();
            if (avilVar2 == null) {
                return;
            }
            avilVar2.c();
            deque.addFirst(avilVar2);
            this.a += avilVar2.f();
        }
    }

    @Override // defpackage.avda, defpackage.avil, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        while (true) {
            Deque deque = this.f;
            if (deque.isEmpty()) {
                break;
            } else {
                ((avil) deque.remove()).close();
            }
        }
        if (this.g != null) {
            while (!this.g.isEmpty()) {
                ((avil) this.g.remove()).close();
            }
        }
        this.i = 0;
    }

    @Override // defpackage.avda, defpackage.avil
    public final boolean d() {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            if (!((avil) it.next()).d()) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.avil
    public final int e() {
        return m(b, 1, null, 0);
    }

    @Override // defpackage.avil
    public final int f() {
        return this.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [avil] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [avee] */
    /* JADX WARN: Type inference failed for: r1v3, types: [avee] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r7v1, types: [avil] */
    @Override // defpackage.avil
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.avil g(int r8) {
        /*
            r7 = this;
            if (r8 > 0) goto L5
            avil r7 = defpackage.avip.a
            goto L5f
        L5:
            r7.a(r8)
            int r0 = r7.a
            int r0 = r0 - r8
            r7.a = r0
            r0 = 0
            r1 = r0
        Lf:
            java.util.Deque r2 = r7.f
            java.lang.Object r3 = r2.peek()
            avil r3 = (defpackage.avil) r3
            int r4 = r3.f()
            if (r4 <= r8) goto L23
            avil r8 = r3.g(r8)
            r3 = 0
            goto L3c
        L23:
            boolean r5 = r7.h
            if (r5 == 0) goto L2f
            avil r3 = r3.g(r4)
            r7.o()
            goto L38
        L2f:
            java.lang.Object r3 = r2.poll()
            avil r3 = (defpackage.avil) r3
            r7.n()
        L38:
            int r8 = r8 - r4
            r6 = r3
            r3 = r8
            r8 = r6
        L3c:
            if (r0 != 0) goto L40
            r0 = r8
            goto L5c
        L40:
            if (r1 != 0) goto L59
            avee r1 = new avee
            r4 = 2
            if (r3 == 0) goto L52
            int r2 = r2.size()
            int r2 = r2 + r4
            r4 = 16
            int r4 = java.lang.Math.min(r2, r4)
        L52:
            r1.<init>(r4)
            r1.h(r0)
            r0 = r1
        L59:
            r1.h(r8)
        L5c:
            if (r3 > 0) goto L60
            r7 = r0
        L5f:
            return r7
        L60:
            r8 = r3
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avee.g(int):avil");
    }

    public final void h(avil avilVar) {
        boolean z = this.h && this.f.isEmpty();
        int iF = avilVar.f();
        if (iF >= 1024) {
            int i = this.i;
            if (i > 1) {
                q(i);
            }
            this.i = 0;
            this.f.add(avilVar);
            this.a += iF;
        } else {
            this.f.add(avilVar);
            this.a += iF;
            int i2 = this.i + 1;
            this.i = i2;
            if (i2 >= 1000) {
                q(i2);
                this.i = 0;
            }
        }
        if (z) {
            ((avil) this.f.peek()).b();
        }
    }

    @Override // defpackage.avil
    public final void i(OutputStream outputStream, int i) {
        l(e, i, outputStream, 0);
    }

    @Override // defpackage.avil
    public final void j(byte[] bArr, int i, int i2) {
        m(d, i2, bArr, i);
    }

    @Override // defpackage.avil
    public final void k(int i) {
        m(c, i, null, 0);
    }

    public avee(int i) {
        this.i = 0;
        this.f = new ArrayDeque(i);
    }
}
