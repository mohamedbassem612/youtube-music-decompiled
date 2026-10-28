package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qxu implements buj {
    private static final agrf h = agrf.h("com/google/android/libraries/video/mediaengine/audio/processors/FadeAudioProcessor");
    public double b;
    public int c;
    public long d = 0;
    long e = 0;
    public acac f;
    public acac g;
    private ByteBuffer i;
    private ByteBuffer j;
    private boolean k;
    private int l;

    public qxu() {
        g();
    }

    private final long k() {
        return ((long) (this.d * this.b)) / ((long) this.c);
    }

    private final void l(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit() - byteBuffer.position();
        m(iLimit);
        acac acacVar = this.g;
        acacVar.getClass();
        for (int i = 0; i < iLimit / 2; i++) {
            this.j.putShort((short) (((double) byteBuffer.getShort()) * Math.min(1.0d, Math.max(0L, acacVar.b - (k() + ((long) (((double) ((i / this.c) + 1)) * this.b)))) / acacVar.a)));
        }
        this.j.flip();
        this.i = this.j;
    }

    private final void m(int i) {
        if (this.j.capacity() < i) {
            this.j = ByteBuffer.allocateDirect(i).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.j.clear();
        }
    }

    @Override // defpackage.buj
    public final bug b(bug bugVar) throws bui {
        if (bugVar.d != 2) {
            throw new bui("Unhandled input format:", bugVar);
        }
        int i = bugVar.c;
        this.c = i;
        this.l = i << 1;
        this.b = 1000000.0d / ((double) bugVar.b);
        return bugVar;
    }

    @Override // defpackage.buj
    public final ByteBuffer c() {
        ByteBuffer byteBuffer = this.i;
        this.e += (long) byteBuffer.remaining();
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
        acac acacVar = this.g;
        if (acacVar != null) {
            long jK = k();
            long j = acacVar.b;
            if (jK < j) {
                ((agrc) ((agrc) h.c()).k("com/google/android/libraries/video/mediaengine/audio/processors/FadeAudioProcessor", "queueEndOfStream", 154, "FadeAudioProcessor.java")).z("Marking FadeAudioProcessor as ended at %dus even though we haven't reached the configured end time %dus.", k(), j);
            }
        }
        this.k = true;
    }

    @Override // defpackage.buj
    public final void f(ByteBuffer byteBuffer) {
        boolean z;
        ahno.O(h());
        ahno.O(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
        int iLimit = byteBuffer.limit() - byteBuffer.position();
        if (iLimit != 0) {
            ahno.O(iLimit % this.l == 0);
            int i = iLimit / 2;
            long jK = k() + (((long) (this.b * ((double) i))) / ((long) this.c));
            acac acacVar = this.f;
            if (acacVar == null || k() >= acacVar.b) {
                z = false;
            } else {
                int iLimit2 = byteBuffer.limit() - byteBuffer.position();
                m(iLimit2);
                acac acacVar2 = this.f;
                acacVar2.getClass();
                for (int i2 = 0; i2 < iLimit2 / 2; i2++) {
                    this.j.putShort((short) (((double) byteBuffer.getShort()) * Math.min(1.0d, (k() + ((long) (((double) (i2 / this.c)) * this.b))) / acacVar2.a)));
                }
                this.j.flip();
                this.i = this.j;
                z = true;
            }
            acac acacVar3 = this.g;
            if (acacVar3 == null || jK < acacVar3.c) {
                if (!z) {
                    m(iLimit);
                    this.j.put(byteBuffer);
                    this.j.flip();
                    this.i = this.j;
                    byteBuffer.position(byteBuffer.limit());
                }
            } else if (z) {
                ByteBuffer byteBuffer2 = this.i;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer2.asReadOnlyBuffer();
                ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(byteBufferAsReadOnlyBuffer.remaining());
                byteBufferAllocateDirect.put(byteBufferAsReadOnlyBuffer);
                byteBufferAllocateDirect.order(byteBuffer2.order());
                byteBufferAllocateDirect.flip();
                l(byteBufferAllocateDirect);
            } else {
                l(byteBuffer);
            }
            this.d += (long) i;
        }
    }

    @Override // defpackage.buj
    public final void g() {
        d();
        this.j = buj.a;
        this.b = 0.0d;
        this.f = null;
        this.g = null;
    }

    @Override // defpackage.buj
    public final boolean h() {
        if (this.c <= 0 || this.b <= 0.0d) {
            return false;
        }
        return (this.f == null && this.g == null) ? false : true;
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
