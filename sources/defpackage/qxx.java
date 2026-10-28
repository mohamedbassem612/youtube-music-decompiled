package defpackage;

import j$.time.Duration;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qxx implements buj {
    public double b;
    public int c;
    public qvq e;
    private int h;
    private ByteBuffer i;
    private ByteBuffer j;
    private boolean k;
    private int l;
    private static final rbm m = rbm.c(qxx.class);
    private static final Duration g = Duration.ofMillis(10);
    public long d = 0;
    long f = 0;

    public qxx() {
        g();
    }

    private final long k() {
        return ((long) (this.d * this.b)) / ((long) this.c);
    }

    @Override // defpackage.buj
    public final bug b(bug bugVar) throws bui {
        if (bugVar.d != 2) {
            throw new bui("Unhandled input format:", bugVar);
        }
        int i = bugVar.c;
        this.c = i;
        this.l = i << 1;
        int i2 = bugVar.b;
        this.b = 1000000.0d / ((double) i2);
        int i3 = i2 / 100;
        if (i3 <= 0) {
            i3 = 1;
        }
        this.h = i3;
        return new bug(i2, i, 4);
    }

    @Override // defpackage.buj
    public final ByteBuffer c() {
        ByteBuffer byteBuffer = this.i;
        this.f += (long) byteBuffer.remaining();
        this.i = buj.a;
        return byteBuffer;
    }

    @Override // defpackage.buj
    public final void d() {
        this.i = buj.a;
        this.k = false;
    }

    @Override // defpackage.buj
    public final void e() {
        qvq qvqVar = this.e;
        if (qvqVar != null) {
            Duration durationB = ahbt.b(k());
            durationB.getClass();
            if (aext.k(qvqVar.q.plus(g), durationB)) {
                rbc rbcVar = new rbc(m, rbd.c);
                rbcVar.c();
                rbcVar.a("Marking VolumeAudioProcessor as ended at %dus even though we haven't reached the configured end time %dus.", Long.valueOf(k()), Long.valueOf(ahbt.a(qvqVar.q)));
            }
        }
        this.k = true;
    }

    @Override // defpackage.buj
    public final void f(ByteBuffer byteBuffer) {
        ahno.O(false);
        ahno.O(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
        int iRemaining = byteBuffer.remaining();
        if (byteBuffer.hasRemaining()) {
            ahno.O(iRemaining % this.l == 0);
            int i = iRemaining << 1;
            if (this.j.capacity() < i) {
                this.j = ByteBuffer.allocateDirect(i).order(ByteOrder.LITTLE_ENDIAN);
            } else {
                this.j.clear();
            }
            int i2 = iRemaining / 2;
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = i3 / this.c;
                k();
                int i5 = i4 % this.h;
                double d = byteBuffer.getShort();
                this.j.putFloat(((float) d) / (d < 0.0d ? 32768 : 32767));
            }
            this.j.flip();
            this.i = this.j;
            this.d += (long) i2;
        }
    }

    @Override // defpackage.buj
    public final void g() {
        d();
        this.j = buj.a;
        this.b = 0.0d;
    }

    @Override // defpackage.buj
    public final boolean h() {
        return false;
    }

    @Override // defpackage.buj
    public final boolean i() {
        return this.k && this.i == buj.a;
    }

    @Override // defpackage.buj
    public final /* synthetic */ void j() {
        d();
    }

    @Override // defpackage.buj
    public final /* synthetic */ long a(long j) {
        return j;
    }
}
