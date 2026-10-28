package defpackage;

import androidx.car.app.model.Alert;
import j$.lang.Iterable$EL;
import j$.time.Duration;
import j$.util.Collection;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.Semaphore;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rgm extends rgp {
    public static final /* synthetic */ int c = 0;
    public final rgy b;
    private final int k;
    private final int l;
    private final boolean m;
    private final rgl n;
    private final qua o;
    private int p;
    private long q;
    private long r;
    private final TreeMap s;
    private rfs t;
    private UUID u;
    static final Duration a = Duration.ofMillis(34);
    private static final rbm v = rbm.c(rgm.class);

    public rgm(rgk rgkVar, rgy rgyVar) {
        super(rgkVar);
        this.p = 0;
        this.q = 0L;
        this.r = 0L;
        this.s = new TreeMap();
        this.t = null;
        this.n = rgkVar.e;
        this.b = rgyVar;
        this.k = rgkVar.a;
        this.l = rgkVar.b;
        this.m = rgkVar.c;
        this.o = rgkVar.d;
    }

    private final synchronized void m() {
        TreeMap treeMap = this.s;
        Iterable$EL.forEach(treeMap.values(), new rcp(this, 10));
        treeMap.clear();
        o(null);
    }

    private final synchronized void n(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            Map.Entry entryPollFirstEntry = this.s.pollFirstEntry();
            if (entryPollFirstEntry == null) {
                break;
            }
            k((rfs) entryPollFirstEntry.getValue());
        }
    }

    private final synchronized void o(rfs rfsVar) {
        if (rfsVar != null) {
            if (!rfsVar.z()) {
                rbc rbcVar = new rbc(v, rbd.d);
                rbcVar.c();
                rbcVar.a("MediaEngine: couldn't acquire frame!", new Object[0]);
                return;
            }
        }
        rfs rfsVar2 = this.t;
        if (rfsVar2 != null) {
            rfsVar2.release();
        }
        this.t = rfsVar;
    }

    private final synchronized boolean p(Duration duration) {
        return this.m || duration.compareTo(a) > 0;
    }

    private final synchronized rfs q(Duration duration, boolean z, boolean z2) {
        rfs rfsVar;
        TreeMap treeMap = this.s;
        Duration durationJ = Duration.ZERO;
        Map.Entry entryFloorEntry = treeMap.floorEntry(duration);
        Map.Entry entryCeilingEntry = treeMap.ceilingEntry(duration);
        if (entryFloorEntry != null && entryCeilingEntry != null) {
            rfsVar = (rfs) entryFloorEntry.getValue();
            rfs rfsVar2 = (rfs) entryCeilingEntry.getValue();
            duration.getClass();
            if (true == aext.i(this.n.a(rfsVar.j()), duration)) {
                rfsVar = rfsVar2;
            }
            durationJ = rfsVar.j();
        } else if (entryCeilingEntry == null || (!z && p(((Duration) entryCeilingEntry.getKey()).minus(duration)))) {
            rfsVar = null;
            if (entryFloorEntry != null) {
                rfsVar = g() ? (rfs) entryFloorEntry.getValue() : null;
                durationJ = ((rfs) entryFloorEntry.getValue()).j();
            }
        } else {
            rfsVar = (rfs) entryCeilingEntry.getValue();
            durationJ = rfsVar.j();
        }
        if (z2) {
            n(treeMap.headMap(durationJ).size() - this.l);
        }
        return rfsVar;
    }

    @Override // defpackage.rgp
    protected final int b() {
        return this.k + this.l;
    }

    public final synchronized int c(Duration duration) {
        if (g()) {
            return Alert.DURATION_SHOW_INDEFINITELY;
        }
        rfs rfsVarQ = q(duration, true, false);
        if (rfsVarQ == null) {
            return 0;
        }
        return this.s.tailMap(rfsVarQ.j()).size();
    }

    @Override // defpackage.rgp, java.lang.AutoCloseable
    public final void close() {
        super.close();
        m();
    }

    @Override // defpackage.rgp
    public final void d() {
        if (this.e == null) {
            m();
            return;
        }
        rfs rfsVarH = rfs.h();
        synchronized (this) {
            this.u = rfsVarH.l();
        }
        m();
        Iterable$EL.forEach(this.d, new rcp(rfsVarH, 11));
        this.e.c(rfsVarH);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004b A[Catch: all -> 0x012f, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000d, B:11:0x0012, B:13:0x0018, B:14:0x001d, B:16:0x0023, B:18:0x002c, B:20:0x0037, B:26:0x006d, B:28:0x0075, B:30:0x0081, B:32:0x0098, B:35:0x009d, B:36:0x00a0, B:38:0x00a4, B:39:0x00ab, B:41:0x00b1, B:43:0x00c0, B:44:0x00fa, B:46:0x011e, B:21:0x004b, B:23:0x004f, B:25:0x005a, B:51:0x0125, B:52:0x012c), top: B:57:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x004f A[Catch: all -> 0x012f, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000d, B:11:0x0012, B:13:0x0018, B:14:0x001d, B:16:0x0023, B:18:0x002c, B:20:0x0037, B:26:0x006d, B:28:0x0075, B:30:0x0081, B:32:0x0098, B:35:0x009d, B:36:0x00a0, B:38:0x00a4, B:39:0x00ab, B:41:0x00b1, B:43:0x00c0, B:44:0x00fa, B:46:0x011e, B:21:0x004b, B:23:0x004f, B:25:0x005a, B:51:0x0125, B:52:0x012c), top: B:57:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x005a A[Catch: all -> 0x012f, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000d, B:11:0x0012, B:13:0x0018, B:14:0x001d, B:16:0x0023, B:18:0x002c, B:20:0x0037, B:26:0x006d, B:28:0x0075, B:30:0x0081, B:32:0x0098, B:35:0x009d, B:36:0x00a0, B:38:0x00a4, B:39:0x00ab, B:41:0x00b1, B:43:0x00c0, B:44:0x00fa, B:46:0x011e, B:21:0x004b, B:23:0x004f, B:25:0x005a, B:51:0x0125, B:52:0x012c), top: B:57:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a4 A[Catch: all -> 0x012f, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000d, B:11:0x0012, B:13:0x0018, B:14:0x001d, B:16:0x0023, B:18:0x002c, B:20:0x0037, B:26:0x006d, B:28:0x0075, B:30:0x0081, B:32:0x0098, B:35:0x009d, B:36:0x00a0, B:38:0x00a4, B:39:0x00ab, B:41:0x00b1, B:43:0x00c0, B:44:0x00fa, B:46:0x011e, B:21:0x004b, B:23:0x004f, B:25:0x005a, B:51:0x0125, B:52:0x012c), top: B:57:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b1 A[Catch: all -> 0x012f, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000d, B:11:0x0012, B:13:0x0018, B:14:0x001d, B:16:0x0023, B:18:0x002c, B:20:0x0037, B:26:0x006d, B:28:0x0075, B:30:0x0081, B:32:0x0098, B:35:0x009d, B:36:0x00a0, B:38:0x00a4, B:39:0x00ab, B:41:0x00b1, B:43:0x00c0, B:44:0x00fa, B:46:0x011e, B:21:0x004b, B:23:0x004f, B:25:0x005a, B:51:0x0125, B:52:0x012c), top: B:57:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c0 A[Catch: all -> 0x012f, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000d, B:11:0x0012, B:13:0x0018, B:14:0x001d, B:16:0x0023, B:18:0x002c, B:20:0x0037, B:26:0x006d, B:28:0x0075, B:30:0x0081, B:32:0x0098, B:35:0x009d, B:36:0x00a0, B:38:0x00a4, B:39:0x00ab, B:41:0x00b1, B:43:0x00c0, B:44:0x00fa, B:46:0x011e, B:21:0x004b, B:23:0x004f, B:25:0x005a, B:51:0x0125, B:52:0x012c), top: B:57:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x011e A[Catch: all -> 0x012f, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000d, B:11:0x0012, B:13:0x0018, B:14:0x001d, B:16:0x0023, B:18:0x002c, B:20:0x0037, B:26:0x006d, B:28:0x0075, B:30:0x0081, B:32:0x0098, B:35:0x009d, B:36:0x00a0, B:38:0x00a4, B:39:0x00ab, B:41:0x00b1, B:43:0x00c0, B:44:0x00fa, B:46:0x011e, B:21:0x004b, B:23:0x004f, B:25:0x005a, B:51:0x0125, B:52:0x012c), top: B:57:0x0003 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:43:0x00c0, please report this as an issue */
    @Override // defpackage.rgp
    public final synchronized void e(rfs rfsVar) {
        rib ribVar;
        Runnable runnable;
        UUID uuid = this.u;
        if (uuid != null) {
            if (rfsVar.A(uuid)) {
                this.u = null;
            } else if (!rfsVar.B()) {
                k(rfsVar);
            }
        } else {
            if (rfsVar.B()) {
                throw new IllegalArgumentException("Didn't expect a FlushFrame since flushFrameId is unset.");
            }
            Duration durationJ = rfsVar.j();
            if (this.h != null) {
                durationJ.getClass();
                if (aext.l(this.h, durationJ)) {
                    rbc rbcVar = new rbc(this.j, rbd.c);
                    rbcVar.c();
                    rbcVar.a("Invalid frame, Received frame timestamp is before expected start position", new Object[0]);
                } else if (this.i != null) {
                    durationJ.getClass();
                    if (aext.k(this.i, durationJ)) {
                        rbc rbcVar2 = new rbc(this.j, rbd.c);
                        rbcVar2.c();
                        rbcVar2.a("Invalid frame, Received frame timestamp is after expected end position", new Object[0]);
                    }
                }
            } else if (this.i != null) {
                durationJ.getClass();
                if (aext.k(this.i, durationJ)) {
                    rbc rbcVar3 = new rbc(this.j, rbd.c);
                    rbcVar3.c();
                    rbcVar3.a("Invalid frame, Received frame timestamp is after expected end position", new Object[0]);
                }
            }
            TreeMap treeMap = this.s;
            if (treeMap.containsKey(durationJ)) {
                rfs rfsVar2 = (rfs) treeMap.get(durationJ);
                if (rfsVar2.equals(rfsVar)) {
                    rbc rbcVar4 = new rbc(v, rbd.d);
                    rbcVar4.c();
                    rbcVar4.a("QTPC received the same frame twice!", new Object[0]);
                    Semaphore semaphore = this.f;
                    if (semaphore != null) {
                        semaphore.release();
                    }
                } else {
                    k(rfsVar2);
                    ribVar = this.e;
                    if (ribVar != null) {
                        ribVar.iF(rfsVar.d());
                    }
                    if (!treeMap.isEmpty()) {
                        durationJ.getClass();
                        if (aext.l((Duration) treeMap.lastKey(), durationJ)) {
                            rbc rbcVar5 = new rbc(v, rbd.c);
                            rbcVar5.a = new IllegalStateException("QTPC: New frame received out of order, last frame timestamp: " + String.valueOf(treeMap.lastKey()) + " new frame timestamp: " + String.valueOf(durationJ));
                            rbcVar5.c();
                            rbcVar5.a("QTPC: New frame received out of order", new Object[0]);
                        }
                    }
                    treeMap.put(durationJ, rfsVar);
                    this.r++;
                    this.q += (long) treeMap.size();
                    this.p = Math.max(this.p, treeMap.size());
                    runnable = this.g;
                    if (runnable != null) {
                        runnable.run();
                    }
                }
            } else {
                ribVar = this.e;
                if (ribVar != null) {
                    ribVar.iF(rfsVar.d());
                }
                if (!treeMap.isEmpty()) {
                    durationJ.getClass();
                    if (aext.l((Duration) treeMap.lastKey(), durationJ)) {
                        rbc rbcVar6 = new rbc(v, rbd.c);
                        rbcVar6.a = new IllegalStateException("QTPC: New frame received out of order, last frame timestamp: " + String.valueOf(treeMap.lastKey()) + " new frame timestamp: " + String.valueOf(durationJ));
                        rbcVar6.c();
                        rbcVar6.a("QTPC: New frame received out of order", new Object[0]);
                    }
                }
                treeMap.put(durationJ, rfsVar);
                this.r++;
                this.q += (long) treeMap.size();
                this.p = Math.max(this.p, treeMap.size());
                runnable = this.g;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
    }

    @Override // defpackage.rgp
    public final synchronized boolean f(Duration duration) {
        return q(duration, false, false) != null;
    }

    public final synchronized boolean g() {
        TreeMap treeMap = this.s;
        int i = 12;
        boolean z = Collection.EL.stream(treeMap.values()).map(new rcs(i)).anyMatch(new jmy(this, i)) || this.b.c == null;
        rgy rgyVar = this.b;
        qua quaVar = this.o;
        Duration duration = rgyVar.d;
        if (quaVar.V && duration != null && treeMap.containsKey(duration)) {
            z = true;
        }
        rib ribVar = this.e;
        return ribVar != null && ribVar.g() && z;
    }

    @Override // defpackage.rgp
    public final synchronized ren h(Duration duration) {
        rfs rfsVarQ = q(duration, true, true);
        o(rfsVarQ);
        if (rfsVarQ == null) {
            return ren.a;
        }
        return new ren(rfsVarQ);
    }
}
