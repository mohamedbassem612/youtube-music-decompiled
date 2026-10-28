package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.mediapipe.framework.GraphTextureFrame;
import com.google.mediapipe.framework.TextureFrame;
import com.google.research.xeno.effect.Control;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rht extends rgr implements atus {
    public static final attk c;
    public static final rbm q = new rbm("rht");
    public final rhu d;
    public final Optional f;
    public final qua i;
    public final rjb m;
    public final rjc n;
    public volatile atur o;
    private final rhr r;
    private UUID t;
    private UUID u;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicReference g = new AtomicReference();
    public final AtomicLong h = new AtomicLong(-1);
    public final Object j = new Object();
    public long k = -1;
    private long s = 0;
    public volatile agke p = agpi.a;
    private boolean v = false;
    public final ConcurrentLinkedQueue l = new ConcurrentLinkedQueue();

    static {
        aihf aihfVarCreateBuilder = attk.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        attk attkVar = (attk) aihfVarCreateBuilder.instance;
        attkVar.b |= 1;
        attkVar.c = 16;
        aihfVarCreateBuilder.copyOnWrite();
        attk attkVar2 = (attk) aihfVarCreateBuilder.instance;
        attkVar2.b |= 2;
        attkVar2.d = 20;
        aihfVarCreateBuilder.copyOnWrite();
        attk attkVar3 = (attk) aihfVarCreateBuilder.instance;
        attkVar3.b |= 4;
        attkVar3.e = 5.0f;
        aihfVarCreateBuilder.copyOnWrite();
        attk attkVar4 = (attk) aihfVarCreateBuilder.instance;
        attkVar4.b |= 8;
        attkVar4.f = 0;
        aihfVarCreateBuilder.copyOnWrite();
        attk attkVar5 = (attk) aihfVarCreateBuilder.instance;
        attkVar5.b |= 16;
        attkVar5.g = 50;
        c = (attk) aihfVarCreateBuilder.build();
    }

    public rht(rhu rhuVar, rhr rhrVar, Optional optional, rjb rjbVar, rjc rjcVar, qua quaVar) {
        this.d = rhuVar;
        this.r = rhrVar;
        this.f = optional;
        this.m = rjbVar;
        this.n = rjcVar;
        this.i = quaVar;
    }

    public static rhp h() {
        rhp rhpVar = new rhp();
        rhpVar.a = atvp.c;
        rhpVar.b = null;
        rhpVar.c = Optional.empty();
        return rhpVar;
    }

    public static void p(agke agkeVar) {
        agke agkeVar2 = (agke) Collection.EL.stream(agkeVar).filter(new rej(4)).flatMap(new rcs(18)).flatMap(new rcs(19)).collect(aghu.a);
        int size = agkeVar2.size();
        for (int i = 0; i < size; i++) {
            Optional optionalOfNullable = Optional.ofNullable(((Control) agkeVar2.get(i)).b);
            if (true == optionalOfNullable.isPresent()) {
                ((Control.GpuBufferSetting) optionalOfNullable.get()).a(null);
            }
        }
    }

    private final void s(rfs rfsVar) {
        ConcurrentLinkedQueue concurrentLinkedQueue = this.l;
        if (concurrentLinkedQueue.isEmpty()) {
            e(rfsVar);
        } else {
            concurrentLinkedQueue.add(new rhs(-1L, -1L, rfsVar.c));
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00ef A[Catch: all -> 0x017c, TryCatch #2 {, blocks: (B:7:0x0025, B:9:0x002a, B:11:0x0030, B:13:0x003a, B:15:0x003e, B:17:0x0048, B:18:0x004a, B:19:0x0050, B:21:0x0054, B:23:0x005c, B:25:0x0065, B:26:0x0071, B:28:0x007c, B:30:0x0086, B:31:0x008b, B:32:0x008e, B:34:0x009a, B:49:0x00cf, B:51:0x00e3, B:53:0x00eb, B:55:0x00ef, B:56:0x0103, B:57:0x010a, B:58:0x010f, B:39:0x00a5, B:42:0x00a8, B:68:0x013d, B:71:0x0140, B:79:0x0178, B:72:0x015e, B:74:0x0164, B:76:0x016c, B:77:0x0171, B:78:0x0175, B:35:0x009b, B:36:0x00a2, B:43:0x00a9, B:45:0x00b7, B:47:0x00cc, B:48:0x00ce, B:46:0x00c6), top: B:90:0x0025, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0103 A[Catch: all -> 0x017c, TryCatch #2 {, blocks: (B:7:0x0025, B:9:0x002a, B:11:0x0030, B:13:0x003a, B:15:0x003e, B:17:0x0048, B:18:0x004a, B:19:0x0050, B:21:0x0054, B:23:0x005c, B:25:0x0065, B:26:0x0071, B:28:0x007c, B:30:0x0086, B:31:0x008b, B:32:0x008e, B:34:0x009a, B:49:0x00cf, B:51:0x00e3, B:53:0x00eb, B:55:0x00ef, B:56:0x0103, B:57:0x010a, B:58:0x010f, B:39:0x00a5, B:42:0x00a8, B:68:0x013d, B:71:0x0140, B:79:0x0178, B:72:0x015e, B:74:0x0164, B:76:0x016c, B:77:0x0171, B:78:0x0175, B:35:0x009b, B:36:0x00a2, B:43:0x00a9, B:45:0x00b7, B:47:0x00cc, B:48:0x00ce, B:46:0x00c6), top: B:90:0x0025, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0118 A[Catch: RuntimeException -> 0x0120, TryCatch #1 {RuntimeException -> 0x0120, blocks: (B:60:0x0114, B:62:0x0118, B:63:0x011c), top: B:88:0x0114 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x011c A[Catch: RuntimeException -> 0x0120, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x0120, blocks: (B:60:0x0114, B:62:0x0118, B:63:0x011c), top: B:88:0x0114 }] */
    @Override // defpackage.rgr
    protected final void c(rfs rfsVar) {
        long timestamp;
        rhs rhsVar;
        rhu rhuVar;
        if (this.e.get()) {
            rbc rbcVar = new rbc(q, rbd.c);
            rbcVar.c();
            rbcVar.a("Trying to pass a frame to a closed XenoEffectTextureProcessor", new Object[0]);
            g(rfsVar);
            return;
        }
        synchronized (this) {
            if (this.t == null) {
                if (!rfsVar.B()) {
                    long jE = rfsVar.e();
                    if (rfsVar.m() != null) {
                        UUID uuid = this.u;
                        if (uuid != null && !uuid.equals(rfsVar.m())) {
                            this.v = true;
                        }
                        this.u = rfsVar.m();
                    }
                    if (this.v && !this.p.isEmpty()) {
                        agke agkeVar = this.p;
                        int size = agkeVar.size();
                        for (int i = 0; i < size; i++) {
                            ((qvk) agkeVar.get(i)).j();
                        }
                    }
                    this.v = false;
                    agke agkeVar2 = this.p;
                    int size2 = agkeVar2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        Cloneable cloneable = (qvk) agkeVar2.get(i2);
                        if (cloneable instanceof qzh) {
                            ((qzh) cloneable).b(rfsVar);
                        }
                    }
                    long timestamp2 = rfsVar.getTimestamp();
                    boolean z = this.i.W;
                    Object obj = this.j;
                    if (!z) {
                        synchronized (obj) {
                            try {
                                timestamp = this.k + 1;
                                this.k = timestamp;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        rfsVar.a(timestamp);
                        rhsVar = new rhs(timestamp2, rfsVar.getTimestamp(), rfsVar.c);
                        if (this.i.Y && !this.l.isEmpty()) {
                            if (rhsVar.d) {
                                rbc rbcVar2 = new rbc(q, rbd.c);
                                rbcVar2.c();
                                rbcVar2.a("Processing paused when it was already paused.", new Object[0]);
                            } else {
                                rhsVar.c.b();
                                rhsVar.d = true;
                            }
                        }
                        this.l.add(rhsVar);
                        try {
                            rhuVar = this.d;
                            if (jE >= 0) {
                                rhuVar.h(rfsVar, jE);
                            } else {
                                rhuVar.iB(rfsVar);
                            }
                            return;
                        } catch (RuntimeException e) {
                            m(rfsVar.getTimestamp(), (String) Optional.ofNullable(e.getMessage()).orElse("Xeno runtime exception"));
                            rfsVar.release();
                            return;
                        }
                    }
                    synchronized (obj) {
                        try {
                            long timestamp3 = rfsVar.getTimestamp();
                            long j = this.k;
                            long j2 = this.s;
                            if (timestamp3 <= j - j2) {
                                long j3 = j + this.i.X;
                                this.s = j3 - rfsVar.getTimestamp();
                                timestamp = j3;
                            } else {
                                timestamp = j2 + rfsVar.getTimestamp();
                            }
                            this.k = timestamp;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    rfsVar.a(timestamp);
                    rhsVar = new rhs(timestamp2, rfsVar.getTimestamp(), rfsVar.c);
                    if (this.i.Y) {
                        if (rhsVar.d) {
                            rbc rbcVar3 = new rbc(q, rbd.c);
                            rbcVar3.c();
                            rbcVar3.a("Processing paused when it was already paused.", new Object[0]);
                        } else {
                            rhsVar.c.b();
                            rhsVar.d = true;
                        }
                    }
                    this.l.add(rhsVar);
                    rhuVar = this.d;
                    if (jE >= 0) {
                        rhuVar.h(rfsVar, jE);
                    } else {
                        rhuVar.iB(rfsVar);
                    }
                    return;
                }
                rbc rbcVar4 = new rbc(q, rbd.e);
                rbcVar4.c();
                rbcVar4.a = new Exception();
                rbcVar4.a("Received a flush frame with no flushFrameId set, passing to the consumer.", new Object[0]);
                s(rfsVar);
            } else if (rfsVar.B()) {
                if (rfsVar.A(this.t)) {
                    this.t = null;
                    this.v = true;
                }
                s(rfsVar);
            } else {
                g(rfsVar);
            }
        }
    }

    @Override // defpackage.rgr, java.lang.AutoCloseable
    public final void close() {
        if (this.e.getAndSet(true)) {
            return;
        }
        super.close();
        l();
        p(this.p);
        if (!this.i.Z) {
            rhu rhuVar = this.d;
            rhuVar.f();
            rhuVar.c();
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.d.k(new rhj(this, countDownLatch, 0));
        try {
            if (countDownLatch.await(500L, TimeUnit.MILLISECONDS)) {
                return;
            }
            rbc rbcVar = new rbc(q, rbd.c);
            rbcVar.c();
            rbcVar.a("Timed out waiting for Xeno processor to stop during close.", new Object[0]);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            rbc rbcVar2 = new rbc(q, rbd.c);
            rbcVar2.a = e;
            rbcVar2.c();
            rbcVar2.a("Interrupted while stopping Xeno processor.", new Object[0]);
        }
    }

    public final synchronized rhs i(TextureFrame textureFrame) {
        ConcurrentLinkedQueue concurrentLinkedQueue = this.l;
        for (rhs rhsVar = (rhs) concurrentLinkedQueue.poll(); rhsVar != null; rhsVar = (rhs) concurrentLinkedQueue.poll()) {
            rfr rfrVar = rhsVar.c;
            if (rfrVar.a != null) {
                rfs rfsVarH = rfs.h();
                rfsVarH.c = rfrVar;
                e(rfsVarH);
            } else {
                if (rhsVar.b == ((GraphTextureFrame) textureFrame).d) {
                    return rhsVar;
                }
                rbc rbcVar = new rbc(q, rbd.c);
                rbcVar.c();
                rbcVar.a("Xeno dropped a frame!", new Object[0]);
                d(true);
            }
        }
        return null;
    }

    public final ListenableFuture j(agke agkeVar) {
        return ape.f(new dzx(this, agkeVar, 2));
    }

    @Override // defpackage.rhd
    public final synchronized void k(rfs rfsVar) {
        this.t = rfsVar.l();
    }

    public final synchronized void l() {
        ConcurrentLinkedQueue concurrentLinkedQueue = this.l;
        for (rhs rhsVar = (rhs) concurrentLinkedQueue.poll(); rhsVar != null; rhsVar = (rhs) concurrentLinkedQueue.poll()) {
            rfr rfrVar = rhsVar.c;
            if (rfrVar.a != null) {
                rfs rfsVarH = rfs.h();
                rfsVarH.c = rfrVar;
                e(rfsVarH);
            } else {
                d(false);
            }
        }
    }

    @Override // defpackage.atus
    public final void m(long j, String str) {
        rhi rhiVar = new rhi(j, 1);
        Optional optional = this.f;
        if (true == optional.isPresent()) {
            ((rbr) optional.get()).f(Optional.of(Long.valueOf(rhiVar.a)));
        }
        if (Objects.equals(this.g.getAndSet(str), str)) {
            return;
        }
        if (this.i.ad && str.equals("xeno::effect::InputWasThrottledStatus()")) {
            return;
        }
        Optional optionalOfNullable = Optional.ofNullable(this.r);
        rbj rbjVar = new rbj(str, 12);
        if (true == optionalOfNullable.isPresent()) {
            ((rhr) optionalOfNullable.get()).h((String) rbjVar.a);
        }
    }

    @Override // defpackage.atus
    public final void n(long j) {
        rhi rhiVar = new rhi(j, 2);
        Optional optional = this.f;
        if (true == optional.isPresent()) {
            ((rbr) optional.get()).e(rhiVar.a);
        }
    }

    @Override // defpackage.atus
    public final void o(long j) {
        rhi rhiVar = new rhi(j, 0);
        Optional optional = this.f;
        if (true == optional.isPresent()) {
            ((rbr) optional.get()).g(rhiVar.a);
        }
    }

    public final void q(String str, rfs rfsVar) {
        int i = 1;
        if (this.e.get()) {
            Optional optionalOfNullable = Optional.ofNullable(rfsVar);
            if (true == optionalOfNullable.isPresent()) {
                ((rfs) optionalOfNullable.get()).release();
                return;
            }
            return;
        }
        int i2 = 0;
        agke agkeVar = (agke) Collection.EL.stream(this.d.a()).flatMap(new rhk(str, i2)).flatMap(new ris(i)).collect(aghu.a);
        if (agkeVar.isEmpty()) {
            Optional optionalOfNullable2 = Optional.ofNullable(rfsVar);
            if (true == optionalOfNullable2.isPresent()) {
                ((rfs) optionalOfNullable2.get()).release();
                return;
            }
            return;
        }
        int size = agkeVar.size();
        while (i2 < size) {
            ((Control.GpuBufferSetting) agkeVar.get(i2)).a(rfsVar);
            i2++;
        }
    }

    public final void r(String str, atwa atwaVar) {
        agke agkeVar = (agke) Collection.EL.stream(this.d.a()).flatMap(new rhk(str, 1)).map(new rcs(20)).collect(aghu.a);
        int size = agkeVar.size();
        for (int i = 0; i < size; i++) {
            ((Control.RuntimeOptionsSetting) agkeVar.get(i)).a(atwaVar);
        }
    }
}
