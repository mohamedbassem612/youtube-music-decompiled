package defpackage;

import android.media.AudioFormat;
import android.os.ConditionVariable;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.research.aimatter.drishti.DrishtiCache;
import com.google.research.xeno.effect.InputFrameSource;
import j$.util.Collection;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qxt implements buj, ahxj {
    private static final short[] g = new short[0];
    public final qyy b;
    public final rjb d;
    public ListenableFuture e;
    public agke f;
    private final DrishtiCache j;
    private final boolean l;
    private AudioFormat m;
    private ByteBuffer n;
    private ByteBuffer o;
    private atuv p;
    private bug q;
    private boolean r;
    private long s;
    private short[] t;
    private long u;
    private volatile long v;
    private final Object h = new Object();
    private final Object i = new Object();
    public final Map c = new HashMap();
    private final ConditionVariable k = new ConditionVariable();

    public qxt(DrishtiCache drishtiCache, qyy qyyVar, boolean z, rjb rjbVar) {
        ByteBuffer byteBuffer = buj.a;
        this.n = byteBuffer;
        this.o = byteBuffer;
        this.s = 0L;
        this.t = g;
        this.e = aher.a;
        this.f = agpi.a;
        this.j = drishtiCache;
        this.b = qyyVar;
        this.l = z;
        this.d = rjbVar;
    }

    private static void l(ByteBuffer byteBuffer, short[] sArr) {
        byteBuffer.clear();
        byteBuffer.asShortBuffer().put(sArr);
        byteBuffer.position(sArr.length << 1);
        byteBuffer.flip();
    }

    private static short[] m(short[] sArr, int i, int i2) {
        if (i == i2) {
            return sArr;
        }
        int i3 = 0;
        if (i < i2) {
            short[] sArr2 = new short[sArr.length << 1];
            while (i3 < sArr.length) {
                int i4 = i3 << 1;
                sArr2[i4] = sArr[i3];
                sArr2[i4 + 1] = sArr[i3];
                i3++;
            }
            return sArr2;
        }
        int length = sArr.length >> 1;
        short[] sArr3 = new short[length];
        while (i3 < length) {
            int i5 = i3 << 1;
            sArr3[i3] = (short) ((sArr[i5] + sArr[i5 + 1]) / 2);
            i3++;
        }
        return sArr3;
    }

    private static short[] n(ByteBuffer byteBuffer, int i) {
        short[] sArr = new short[i / 2];
        byteBuffer.asShortBuffer().get(sArr);
        byteBuffer.position(byteBuffer.position() + i);
        return sArr;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x009b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.buj
    public final bug b(bug bugVar) throws bui {
        if (bugVar.d != 2) {
            throw new bui("Unhandled input format:", bugVar);
        }
        Object obj = this.i;
        synchronized (obj) {
            AudioFormat.Builder encoding = new AudioFormat.Builder().setEncoding(2);
            int i = bugVar.b;
            AudioFormat.Builder sampleRate = encoding.setSampleRate(i);
            int i2 = bugVar.c;
            int i3 = 4;
            if (i2 != 1 && this.l) {
                i3 = 12;
            }
            this.m = sampleRate.setChannelMask(i3).build();
            long j = ((long) i) * 2000000 * ((long) i2);
            long j2 = j / 1000000;
            Long.signum(j2);
            if (j - (j2 * 1000000) != 0 && (((j ^ 1000000) >> 63) | 1) < 0) {
                j2--;
            }
            int i4 = (int) j2;
            this.o = ByteBuffer.allocateDirect(i4).order(ByteOrder.LITTLE_ENDIAN);
            this.n = ByteBuffer.allocateDirect(i4).order(ByteOrder.LITTLE_ENDIAN);
            synchronized (obj) {
                try {
                    atuv atuvVar = this.p;
                    if (atuvVar != null) {
                        atuvVar.c();
                    }
                    atvx atvxVarA = atth.a();
                    atvxVarA.b = this.j;
                    atuv atuvVar2 = new atuv(atvxVarA.e(), InputFrameSource.VIDEO, atvp.c, this.m);
                    this.p = atuvVar2;
                    CopyOnWriteArraySet copyOnWriteArraySet = atuvVar2.j;
                    copyOnWriteArraySet.clear();
                    copyOnWriteArraySet.add(this);
                } catch (Throwable th) {
                    throw th;
                }
            }
            synchronized (this.h) {
                this.q = bugVar;
                this.u = (((long) bugVar.b) << 1) * ((long) bugVar.c);
            }
            return bugVar;
        }
        synchronized (this.h) {
            this.q = bugVar;
            this.u = (((long) bugVar.b) << 1) * ((long) bugVar.c);
            return bugVar;
        }
    }

    @Override // defpackage.buj
    public final ByteBuffer c() {
        short[] sArr;
        ByteBuffer byteBuffer;
        synchronized (this.i) {
            synchronized (this.h) {
                try {
                    sArr = this.t;
                    int i = (int) this.s;
                    if (i < sArr.length) {
                        short[] sArr2 = new short[i];
                        for (int i2 = 0; i2 < i; i2++) {
                            sArr2[i2] = sArr[i2];
                        }
                        sArr = sArr2;
                    }
                    this.s -= (long) sArr.length;
                    this.t = g;
                } catch (Throwable th) {
                    throw th;
                }
            }
            l(this.n, sArr);
            byteBuffer = this.n;
        }
        return byteBuffer;
    }

    @Override // defpackage.buj
    public final void d() {
        throw null;
    }

    @Override // defpackage.buj
    public final void e() {
        int iCapacity;
        synchronized (this.h) {
            this.r = true;
            if (this.s == 0) {
                return;
            }
            this.k.close();
            synchronized (this.i) {
                iCapacity = this.o.capacity();
            }
            f(ByteBuffer.wrap(new byte[iCapacity]).order(ByteOrder.LITTLE_ENDIAN));
            this.k.block();
        }
    }

    @Override // defpackage.buj
    public final void f(ByteBuffer byteBuffer) {
        int iMin;
        long j;
        ahno.O(h());
        ahno.O(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
        if (byteBuffer.hasRemaining()) {
            synchronized (this.i) {
                atuv atuvVar = this.p;
                AudioFormat audioFormat = this.m;
                if (atuvVar != null && audioFormat != null) {
                    synchronized (this.h) {
                        try {
                            bug bugVar = this.q;
                            if (bugVar == null) {
                                j = 0;
                            } else {
                                int i = bugVar.c;
                                if (this.r) {
                                    iMin = byteBuffer.remaining();
                                } else {
                                    iMin = Math.min(byteBuffer.remaining(), (int) (((long) this.o.capacity()) - (this.s << 1)));
                                    this.s += (long) (iMin / 2);
                                }
                                j = (((long) iMin) * 1000000) / this.u;
                                if (j > 0) {
                                    l(this.o, this.l ? n(byteBuffer, iMin) : m(n(byteBuffer, iMin), i, 1));
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (j > 0) {
                        atuvVar.iA(this.o, this.v, audioFormat);
                        this.v += j;
                    }
                }
            }
        }
    }

    @Override // defpackage.buj
    public final void g() {
        synchronized (this.i) {
            this.m = null;
            atuv atuvVar = this.p;
            if (atuvVar != null) {
                atuvVar.c();
                this.p = null;
            }
        }
        this.c.clear();
        this.f = agpi.a;
        this.v = 0L;
    }

    @Override // defpackage.buj
    public final boolean h() {
        boolean z;
        synchronized (this.i) {
            z = false;
            if (this.m != null && this.p != null) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.buj
    public final boolean i() {
        boolean z;
        synchronized (this.h) {
            z = false;
            if (this.r && this.s == 0) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.ahxj
    public final void iA(ByteBuffer byteBuffer, long j, AudioFormat audioFormat) {
        if (byteBuffer.hasRemaining()) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            synchronized (this.h) {
                bug bugVar = this.q;
                if (bugVar == null) {
                    return;
                }
                short[][] sArr = {this.t, m(n(byteBuffer, byteBuffer.remaining()), audioFormat.getChannelCount(), bugVar.c)};
                long length = 0;
                for (int i = 0; i < 2; i++) {
                    length += (long) sArr[i].length;
                }
                short[] sArr2 = new short[afxw.N(length)];
                int i2 = 0;
                for (int i3 = 0; i3 < 2; i3++) {
                    short[] sArr3 = sArr[i3];
                    int length2 = sArr3.length;
                    System.arraycopy(sArr3, 0, sArr2, i2, length2);
                    i2 += length2;
                }
                this.t = sArr2;
                if (this.r && sArr2.length >= this.s) {
                    this.k.open();
                }
            }
        }
    }

    @Override // defpackage.buj
    public final /* synthetic */ void j() {
        axoz axozVarG;
        if (!this.e.isDone()) {
            try {
                ahng.w(this.e);
            } catch (RuntimeException unused) {
            }
        }
        synchronized (this.i) {
            atuv atuvVar = this.p;
            if (atuvVar != null && (axozVarG = axoz.g((agke) Collection.EL.stream(this.c.values()).map(new qdi(17)).collect(aghu.a), agpr.a)) != null) {
                atuvVar.p(new axoz(axozVarG, ahub.M()), new qxs());
            }
        }
        synchronized (this.h) {
            this.s = 0L;
            this.t = g;
            this.r = false;
        }
    }

    @Override // defpackage.buj
    public final /* synthetic */ long a(long j) {
        return j;
    }
}
