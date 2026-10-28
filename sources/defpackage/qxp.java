package defpackage;

import android.media.AudioFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.SparseArray;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qxp implements Handler.Callback, AutoCloseable {
    public static final rbm f = new rbm("qxp");
    public final Looper a;
    public final bvq b;
    public boolean d;
    public final dfh e;
    private final qua g;
    private final HandlerThread h;
    private final bug i;
    private final bug j;
    private final int k;
    private long l;
    private qxz m;
    private long n;
    private long o;
    private agke p;
    private buf q;
    private ByteBuffer r;
    private ByteBuffer s;
    private long t;
    private AudioFormat u;
    private long v;
    private boolean w;
    private final qcb z;
    public final Map c = new HashMap();
    private qxo x = new qxo();
    private qxo y = new qxo();

    public qxp(bvd bvdVar, int i, qcb qcbVar, bug bugVar, qua quaVar) {
        this.g = quaVar;
        this.i = bugVar;
        this.j = new bug(bugVar.b, bugVar.c, 4);
        this.e = new dfh(!quaVar.e);
        this.k = i;
        this.z = qcbVar;
        i();
        HandlerThread handlerThread = new HandlerThread("ME:AudioPlayback", -16);
        this.h = handlerThread;
        handlerThread.setUncaughtExceptionHandler(new rdf(1));
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        this.a = looper;
        this.b = bvdVar.d(looper, this);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003d  */
    /* JADX WARN: Code duplicated, block: B:19:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0113  */
    /* JADX WARN: Code duplicated, block: B:50:0x0116  */
    /* JADX WARN: Code duplicated, block: B:59:0x0152  */
    private final void d() {
        boolean z;
        boolean z2;
        buf bufVar;
        ByteBuffer byteBuffer;
        buf bufVar2;
        boolean zH;
        qxz qxzVar;
        bvq bvqVar = this.b;
        long jUptimeMillis = SystemClock.uptimeMillis();
        bvqVar.b(7);
        do {
            if (this.w) {
                z = true;
                z2 = false;
                break;
            }
            dfh dfhVar = this.e;
            if (dfhVar.g() && this.c.isEmpty()) {
                if (h()) {
                    buf bufVar3 = this.q;
                    if (bufVar3 == null || !bufVar3.h()) {
                        qxzVar = this.m;
                        qxzVar.getClass();
                        qxzVar.c();
                        if (qxzVar.g()) {
                            this.w = true;
                            zH = true;
                            z = true;
                            z2 = false;
                        } else {
                            z = true;
                            zH = false;
                            z2 = false;
                        }
                    } else {
                        this.q.e();
                        if (g()) {
                            qxzVar = this.m;
                            qxzVar.getClass();
                            qxzVar.c();
                            if (qxzVar.g()) {
                                this.w = true;
                                zH = true;
                                z = true;
                                z2 = false;
                            } else {
                                z = true;
                                zH = false;
                                z2 = false;
                            }
                        } else {
                            z = true;
                            zH = false;
                            z2 = false;
                        }
                    }
                } else {
                    z = true;
                    zH = false;
                    z2 = false;
                }
            } else if (h() && ((bufVar = this.q) == null || !bufVar.h() || g())) {
                dfhVar.b();
                if (dfhVar.g()) {
                    byteBuffer = buj.a;
                } else {
                    long jMin = dfhVar.i;
                    SparseArray sparseArray = dfhVar.b;
                    if (sparseArray.size() == 0) {
                        jMin = Math.min(jMin, dfhVar.j);
                    }
                    for (int i = 0; i < sparseArray.size(); i++) {
                        jMin = Math.min(jMin, ((dfg) sparseArray.valueAt(i)).a);
                    }
                    if (jMin <= dfhVar.h) {
                        byteBuffer = buj.a;
                    } else {
                        aawx aawxVar = dfhVar.l[0];
                        long j = aawxVar.b;
                        long jMin2 = Math.min(jMin, j);
                        ByteBuffer byteBufferDuplicate = ((ByteBuffer) aawxVar.c).duplicate();
                        long j2 = dfhVar.h;
                        z = true;
                        z2 = false;
                        long j3 = aawxVar.a;
                        byteBufferDuplicate.position(((int) (j2 - j3)) * dfhVar.d.e).limit(((int) (jMin2 - j3)) * dfhVar.d.e);
                        ByteBuffer byteBufferOrder = byteBufferDuplicate.slice().order(ByteOrder.nativeOrder());
                        if (jMin2 == j) {
                            aawx[] aawxVarArr = dfhVar.l;
                            aawx aawxVar2 = aawxVarArr[1];
                            aawxVarArr[0] = aawxVar2;
                            aawxVarArr[1] = dfhVar.h(aawxVar2.b);
                        }
                        dfhVar.h = jMin2;
                        dfhVar.f();
                        byteBufferOrder.remaining();
                        int i2 = cat.a;
                        dfhVar.c();
                        byteBuffer = byteBufferOrder;
                    }
                    if (byteBuffer.hasRemaining()) {
                        long jRemaining = this.o + ((long) byteBuffer.remaining());
                        this.o = jRemaining;
                        bug bugVar = this.j;
                        this.y.f = this.n + (((jRemaining / ((long) bugVar.e)) * 1000000) / ((long) bugVar.b));
                        bufVar2 = this.q;
                        if (bufVar2 == null && bufVar2.h()) {
                            ahno.O(this.r == null ? z : z2);
                            this.r = byteBuffer;
                            zH = g();
                        } else {
                            f(byteBuffer);
                            zH = h();
                        }
                    } else {
                        zH = z2;
                    }
                }
                z = true;
                z2 = false;
                if (byteBuffer.hasRemaining()) {
                    zH = z2;
                } else {
                    long jRemaining2 = this.o + ((long) byteBuffer.remaining());
                    this.o = jRemaining2;
                    bug bugVar2 = this.j;
                    this.y.f = this.n + (((jRemaining2 / ((long) bugVar2.e)) * 1000000) / ((long) bugVar2.b));
                    bufVar2 = this.q;
                    if (bufVar2 == null) {
                        f(byteBuffer);
                        zH = h();
                    } else {
                        f(byteBuffer);
                        zH = h();
                    }
                }
            } else {
                z = true;
                zH = false;
                z2 = false;
            }
        } while (zH);
        qxo qxoVar = this.y;
        qxoVar.c = this.t;
        qxoVar.d = this.w;
        qxoVar.e = (!this.e.g() || this.c.isEmpty()) ? z2 : z;
        if (this.w) {
            return;
        }
        bvqVar.h(7, jUptimeMillis + 10);
    }

    private final void e() {
        qxo qxoVar = this.y;
        int i = qxoVar.a;
        boolean z = qxoVar.e;
        qxo qxoVar2 = this.x;
        boolean z2 = qxoVar2.e;
        boolean z3 = true;
        boolean z4 = z && qxoVar.f != qxoVar2.f;
        long j = qxoVar.c;
        long j2 = qxoVar2.c;
        if (j >= j2 && j - j2 < 100000) {
            z3 = false;
        }
        boolean z5 = qxoVar.d;
        boolean z6 = qxoVar2.d;
        if (i > 0 || z != z2 || z4 || z3 || z5 != z6) {
            this.x = qxoVar;
            this.y = new qxo(this.x);
            qcb qcbVar = this.z;
            qxo qxoVar3 = this.x;
            Object obj = qcbVar.a;
            ((qxm) obj).c.d(new plj(obj, qxoVar3, 11));
        }
    }

    private final void f(ByteBuffer byteBuffer) {
        ahno.O(this.s == null);
        this.s = byteBuffer;
        this.v += (long) byteBuffer.remaining();
    }

    private final boolean g() {
        ahno.O(this.s == null);
        buf bufVar = this.q;
        if (bufVar != null && bufVar.h()) {
            while (true) {
                ByteBuffer byteBuffer = this.r;
                if (byteBuffer != null) {
                    bufVar.f(byteBuffer);
                    if (!this.r.hasRemaining()) {
                        this.r = null;
                    }
                    for (ByteBuffer byteBufferB = bufVar.b(); byteBufferB.hasRemaining(); byteBufferB = bufVar.b()) {
                        f(byteBufferB);
                        if (!h()) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    private final boolean h() {
        ByteBuffer byteBuffer = this.s;
        if (byteBuffer == null) {
            return true;
        }
        qxz qxzVar = this.m;
        qxzVar.getClass();
        long j = this.t;
        AudioFormat audioFormat = this.u;
        audioFormat.getClass();
        qxzVar.iA(byteBuffer, j, audioFormat);
        if (this.s.hasRemaining()) {
            return false;
        }
        this.s = null;
        long j2 = this.v;
        bug bugVar = this.i;
        this.t = this.n + (((j2 / ((long) bugVar.e)) * 1000000) / ((long) bugVar.b));
        return true;
    }

    private final void i() {
        this.c.clear();
        dfh dfhVar = this.e;
        dfhVar.b.clear();
        dfhVar.c = 0;
        dfhVar.d = bug.a;
        dfhVar.e = -1;
        dfhVar.l = new aawx[0];
        dfhVar.f = -9223372036854775807L;
        dfhVar.g = -1L;
        dfhVar.h = 0L;
        dfhVar.i = Long.MAX_VALUE;
        dfhVar.j = Long.MAX_VALUE;
        dfhVar.k = false;
        int i = cat.a;
        this.m = null;
        this.n = -9223372036854775807L;
        this.o = 0L;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = -9223372036854775807L;
        this.u = null;
        this.v = 0L;
        this.w = false;
    }

    public final void a() {
        ahno.O(this.d);
        this.b.j(5).p();
        this.d = false;
    }

    public final void b(quc qucVar) {
        this.b.k(6, qucVar).p();
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [boolean, int] */
    public final void c() {
        HashSet hashSet = new HashSet(this.c.keySet());
        hashSet.add(Long.valueOf(this.l));
        long jMax = Math.max(this.n, ((Long) Collections.min(hashSet)).longValue());
        dfh dfhVar = this.e;
        dfhVar.b();
        ahno.G(((jMax > dfhVar.f ? 1 : (jMax == dfhVar.f ? 0 : -1)) ^ (-1)) >>> 31, "End time must be at least the configured start time.");
        dfhVar.i = bwp.u(jMax - dfhVar.f, dfhVar.d.b);
        dfhVar.f();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.h.quit();
    }

    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, qxz] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 1:
                long j = ((trg) message.obj).a;
                Map map = this.c;
                Long lValueOf = Long.valueOf(j);
                map.put(lValueOf, Integer.valueOf(((Integer) j$.util.Map.EL.getOrDefault(map, lValueOf, 0)).intValue() + 1));
                break;
            case 2:
                axmq axmqVar = (axmq) message.obj;
                long j2 = axmqVar.a;
                ?? r9 = axmqVar.b;
                qxo qxoVar = this.y;
                qxoVar.a++;
                this.n = j2;
                this.t = j2;
                this.m = r9;
                qxoVar.c = j2;
                qxoVar.d = this.w;
                qxoVar.e = false;
                qxoVar.f = j2;
                try {
                    qxz qxzVar = this.m;
                    qxzVar.getClass();
                    qxzVar.b();
                    try {
                        dfh dfhVar = this.e;
                        bug bugVar = this.j;
                        int i = this.k;
                        long j3 = this.n;
                        ahno.P(dfhVar.d.equals(bug.a), "Audio mixer already configured.");
                        ahno.F(i > 0);
                        if (!att.j(bugVar)) {
                            throw new bui("Can not mix to this AudioFormat.", bugVar);
                        }
                        dfhVar.d = bugVar;
                        dfhVar.e = (i * bugVar.b) / 1000;
                        dfhVar.f = j3;
                        int i2 = cat.a;
                        dfhVar.l = new aawx[]{dfhVar.h(0L), dfhVar.h(dfhVar.e)};
                        dfhVar.f();
                        agjz agjzVar = new agjz(4);
                        if (this.g.e) {
                            agjzVar.h(new qxw());
                        }
                        int i3 = this.i.d;
                        bug bugVar2 = this.j;
                        if (i3 != bugVar2.d) {
                            if (i3 != 2) {
                                throw new qul("Output audio encoding is not supported.");
                            }
                            agjzVar.h(new buq());
                        }
                        this.p = agjzVar.g();
                        buf bufVar = new buf(this.p);
                        this.q = bufVar;
                        try {
                            bug bugVarA = bufVar.a(bugVar2);
                            this.q.c();
                            bug bugVar3 = this.i;
                            if (!bugVarA.equals(bugVar3)) {
                                throw new qul("Audio processing output format does not match requested output format.");
                            }
                            this.u = new AudioFormat.Builder().setSampleRate(bugVar3.b).setChannelMask(bwp.g(bugVar3.c)).setEncoding(bugVar3.d).build();
                            c();
                            d();
                        } catch (bui e) {
                            throw new qul("Audio format not supported by audio processing pipeline", e);
                        }
                    } catch (bui e2) {
                        throw new qul("Audio format not supported by audio mixer.", e2);
                    }
                } catch (qul e3) {
                    rbc rbcVar = new rbc(f, rbd.e);
                    rbcVar.a = e3;
                    rbcVar.c();
                    rbcVar.a("Internal error", new Object[0]);
                    this.y.b = e3;
                    e();
                    i();
                }
                break;
            case 3:
                this.y.a++;
                qxz qxzVar2 = this.m;
                if (qxzVar2 != null) {
                    qxzVar2.d();
                }
                this.b.b(7);
                break;
            case 4:
                this.y.a++;
                qxz qxzVar3 = this.m;
                if (qxzVar3 != null) {
                    qxzVar3.e();
                    d();
                }
                break;
            case 5:
                this.y.a++;
                this.b.b(7);
                i();
                break;
            case 6:
                quc qucVar = (quc) message.obj;
                this.y.a++;
                this.l = ahbt.a(qucVar.iu());
                break;
            case 7:
                d();
                break;
            default:
                return false;
        }
        e();
        return true;
    }
}
