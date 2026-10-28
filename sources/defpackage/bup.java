package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bup implements buj {
    public float b = 1.0f;
    public float c = 1.0f;
    public bug d;
    public bug e;
    public boolean f;
    public buo g;
    public long h;
    public long i;
    private int j;
    private bug k;
    private bug l;
    private ByteBuffer m;
    private ByteBuffer n;
    private boolean o;

    public bup() {
        bug bugVar = bug.a;
        this.k = bugVar;
        this.l = bugVar;
        this.d = bugVar;
        this.e = bugVar;
        ByteBuffer byteBuffer = a;
        this.m = byteBuffer;
        this.n = byteBuffer;
        this.j = -1;
    }

    @Override // defpackage.buj
    public final long a(long j) {
        if (this.i < 1024) {
            return (long) (j / ((double) this.b));
        }
        long j2 = this.h;
        buo buoVar = this.g;
        buoVar.getClass();
        long jB = j2 - ((long) buoVar.b());
        int i = this.e.b;
        int i2 = this.d.b;
        long j3 = this.i;
        return i == i2 ? bwp.C(j, j3, jB) : bwp.C(j, j3 * ((long) i2), jB * ((long) i));
    }

    @Override // defpackage.buj
    public final bug b(bug bugVar) throws bui {
        int i = bugVar.d;
        if (i != 2 && i != 4) {
            throw new bui("Unhandled input format:", bugVar);
        }
        int i2 = this.j;
        if (i2 == -1) {
            i2 = bugVar.b;
        }
        this.k = bugVar;
        bug bugVar2 = new bug(i2, bugVar.c, i);
        this.l = bugVar2;
        this.f = true;
        return bugVar2;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    @Override // defpackage.buj
    public final ByteBuffer c() {
        int iA;
        buo buoVar = this.g;
        if (buoVar != null && (iA = buoVar.a()) > 0) {
            if (this.m.capacity() < iA) {
                this.m = ByteBuffer.allocateDirect(iA).order(ByteOrder.nativeOrder());
            } else {
                this.m.clear();
            }
            ByteBuffer byteBuffer = this.m;
            ahno.O((buoVar.h ^ (-1)) >>> 31);
            int iRemaining = byteBuffer.remaining();
            int i = buoVar.a;
            bum bumVar = buoVar.f;
            int iMin = Math.min(iRemaining / (bumVar.a() * i), buoVar.h);
            bumVar.g(byteBuffer, iMin);
            buoVar.h -= iMin;
            System.arraycopy(bumVar.d(), iMin * i, bumVar.d(), 0, buoVar.h * i);
            this.m.flip();
            this.i += (long) iA;
            this.n = this.m;
        }
        ByteBuffer byteBuffer2 = this.n;
        this.n = a;
        return byteBuffer2;
    }

    @Override // defpackage.buj
    public final /* synthetic */ void d() {
        throw null;
    }

    @Override // defpackage.buj
    public final void e() {
        buo buoVar = this.g;
        if (buoVar != null) {
            int i = buoVar.g;
            int i2 = buoVar.l;
            int i3 = i - i2;
            double d = i2;
            float f = buoVar.c;
            int i4 = buoVar.h + ((int) ((((((((double) i3) / ((double) (buoVar.b / f))) + d) + buoVar.n) + ((double) buoVar.i)) / ((double) (buoVar.d * f))) + 0.5d));
            buoVar.n = 0.0d;
            int i5 = buoVar.e << 1;
            bum bumVar = buoVar.f;
            bumVar.i(i + i5);
            bumVar.p(i * buoVar.a, i5);
            buoVar.g += i5;
            buoVar.c();
            if (buoVar.h > i4) {
                buoVar.h = Math.max(i4, 0);
            }
            buoVar.g = 0;
            buoVar.l = 0;
            buoVar.i = 0;
        }
        this.o = true;
    }

    @Override // defpackage.buj
    public final void f(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            buo buoVar = this.g;
            buoVar.getClass();
            this.h += (long) byteBuffer.remaining();
            int iRemaining = byteBuffer.remaining();
            int i = buoVar.a;
            bum bumVar = buoVar.f;
            int iA = iRemaining / (i * bumVar.a());
            bumVar.i(iA);
            bumVar.f(byteBuffer, iRemaining);
            buoVar.g += iA;
            buoVar.c();
        }
    }

    @Override // defpackage.buj
    public final void g() {
        this.b = 1.0f;
        this.c = 1.0f;
        bug bugVar = bug.a;
        this.k = bugVar;
        this.l = bugVar;
        this.d = bugVar;
        this.e = bugVar;
        ByteBuffer byteBuffer = a;
        this.m = byteBuffer;
        this.n = byteBuffer;
        this.j = -1;
        this.f = false;
        this.g = null;
        this.h = 0L;
        this.i = 0L;
        this.o = false;
    }

    @Override // defpackage.buj
    public final boolean h() {
        return this.l.b != -1 && (Math.abs(this.b + (-1.0f)) >= 1.0E-4f || Math.abs(this.c + (-1.0f)) >= 1.0E-4f || this.l.b != this.k.b);
    }

    @Override // defpackage.buj
    public final boolean i() {
        if (!this.o) {
            return false;
        }
        buo buoVar = this.g;
        return buoVar == null || buoVar.a() == 0;
    }

    @Override // defpackage.buj
    public final void j() {
        if (h()) {
            this.d = this.k;
            this.e = this.l;
            if (this.f) {
                bug bugVar = this.d;
                this.g = new buo(bugVar.b, bugVar.c, this.b, this.c, this.e.b, bugVar.d == 4);
            } else {
                buo buoVar = this.g;
                if (buoVar != null) {
                    buoVar.g = 0;
                    buoVar.h = 0;
                    buoVar.i = 0;
                    buoVar.j = 0;
                    buoVar.k = 0;
                    buoVar.l = 0;
                    buoVar.m = 0;
                    buoVar.n = 0.0d;
                    buoVar.f.l();
                }
            }
        }
        this.n = a;
        this.h = 0L;
        this.i = 0L;
        this.o = false;
    }

    public final void k(int i) {
        boolean z = true;
        if (i != -1 && i <= 0) {
            z = false;
        }
        ahno.F(z);
        this.j = i;
    }

    public final void l(float f) {
        ahno.F(f > 0.0f);
        if (this.b != f) {
            this.b = f;
            this.f = true;
        }
    }
}
