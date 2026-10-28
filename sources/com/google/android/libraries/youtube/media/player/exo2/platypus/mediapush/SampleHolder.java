package com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush;

import androidx.media3.decoder.DecoderInputBuffer;
import com.google.android.apps.youtube.proto.streaming.FormatIdOuterClass$FormatId;
import com.google.android.libraries.youtube.media.player.exo2.platypus.event.PlatypusException;
import defpackage.aae;
import defpackage.abxv;
import defpackage.afwl;
import defpackage.agke;
import defpackage.aguu;
import defpackage.ahno;
import defpackage.axo;
import defpackage.brv;
import defpackage.bse;
import defpackage.bwb;
import defpackage.ccu;
import defpackage.cjt;
import defpackage.cjz;
import defpackage.con;
import defpackage.cra;
import defpackage.cwi;
import defpackage.jqz;
import defpackage.ywx;
import defpackage.zhq;
import defpackage.zhr;
import defpackage.zjr;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class SampleHolder extends MediaSegmentHolder {
    protected final con M;
    protected volatile String N;
    protected volatile EmbeddedMetadataListener O;
    protected long P;
    protected boolean Q;
    protected volatile boolean R;
    protected ScheduledFuture S;
    protected final List T;
    protected final SampleHolderDrmSessionManager U;
    protected final ScheduledExecutorService V;
    protected volatile boolean W;

    /* JADX INFO: compiled from: PG */
    /* JADX INFO: loaded from: classes4.dex */
    public interface EmbeddedMetadataListener {
        void g(jqz jqzVar, FormatIdOuterClass$FormatId formatIdOuterClass$FormatId, long j, long j2, long j3, List list);
    }

    /* JADX INFO: compiled from: PG */
    /* JADX INFO: loaded from: classes4.dex */
    abstract class EmbeddedMetadataWithSegment {
        public abstract long a();

        public abstract BufferedMediaSegment b();

        public abstract agke c();
    }

    public SampleHolder(jqz jqzVar, cra craVar, cjz cjzVar, aae aaeVar, axo axoVar, long j, long j2, String str, abxv abxvVar, zjr zjrVar, Supplier supplier, ScheduledExecutorService scheduledExecutorService, StartPositionTracker startPositionTracker, Long l, boolean z) {
        con conVarJ;
        super(jqzVar, axoVar, j2, str, abxvVar, zjrVar, startPositionTracker, l);
        this.N = null;
        this.T = new ArrayList();
        if (cjzVar == null) {
            SampleHolderDrmSessionManager sampleHolderDrmSessionManager = new SampleHolderDrmSessionManager(supplier, this.c);
            this.U = sampleHolderDrmSessionManager;
            conVarJ = con.J(craVar, sampleHolderDrmSessionManager, aaeVar);
            this.M = conVarJ;
        } else {
            this.U = null;
            conVarJ = con.J(craVar, cjzVar, aaeVar);
            this.M = conVarJ;
        }
        this.P = j;
        conVarJ.f = j;
        if (j2 > 0 && j >= j2 - 10000) {
            this.n = true;
        }
        this.V = scheduledExecutorService;
        this.W = z;
    }

    private final synchronized void Y() {
        con conVar = this.M;
        conVar.G(conVar.k());
    }

    private final void Z() {
        this.Q = false;
        this.R = false;
        ScheduledFuture scheduledFuture = this.S;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.S = null;
        }
    }

    private final synchronized void aa() {
        con conVar = this.M;
        conVar.G(conVar.e);
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaSegmentHolder
    public void C(ywx ywxVar, BufferedMediaSegment bufferedMediaSegment) {
        super.C(ywxVar, bufferedMediaSegment);
        bufferedMediaSegment.e.add(ywxVar);
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaSegmentHolder
    public void H() {
        this.M.B();
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaSegmentHolder
    protected final void I(BufferedMediaSegment bufferedMediaSegment, long j) {
        zjr zjrVar = this.d;
        if (zjrVar == null || !zjrVar.dV() || j >= bufferedMediaSegment.b() - 1000) {
            return;
        }
        zhr.e(zhq.PLATYPUS, "SampleHolder: timestamp regression on incoming segment push: incomingStartUs=%d, lastBufferedEndTimeUs=%d", Long.valueOf(j), Long.valueOf(bufferedMediaSegment.b()));
        if (j > bufferedMediaSegment.e()) {
            con conVar = this.M;
            if (j > conVar.p()) {
                int iL = bufferedMediaSegment.l(j);
                if (iL == -1) {
                    conVar.t(j);
                    bufferedMediaSegment.i(j - bufferedMediaSegment.e());
                    this.p = j;
                } else {
                    int iMax = Math.max(iL, conVar.h());
                    if (iMax <= conVar.k()) {
                        conVar.u(iMax);
                    }
                    bufferedMediaSegment.j(iL, j - bufferedMediaSegment.e());
                    this.p = bufferedMediaSegment.b();
                }
            }
        }
    }

    public long K() {
        return this.M.n();
    }

    public synchronized long L() {
        return this.M.q();
    }

    public void M(long j) {
        if (j >= this.q) {
            synchronized (this) {
                con conVar = this.M;
                int iN = n(Math.min(j, conVar.p()));
                if (iN > 0) {
                    List list = this.z;
                    conVar.I(S((BufferedMediaSegment) list.get(iN)), false);
                    list.subList(0, iN).clear();
                    J();
                }
            }
        }
    }

    public void N() throws cjt {
        Throwable th;
        if (this.d.ax()) {
            synchronized (this) {
                synchronized (this.v) {
                    try {
                        th = this.w;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (th == null) {
                    if (this.Q || this.R) {
                        Z();
                    }
                } else if (!X()) {
                    if (!W()) {
                        throw new IOException("Deferred parse error", th);
                    }
                    if (this.p - this.M.p() <= 120000 && !this.Q) {
                        this.Q = true;
                        this.S = this.V.schedule(afwl.i(new Runnable() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.SampleHolder$$ExternalSyntheticLambda1
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.a.R = true;
                            }
                        }), 30L, TimeUnit.SECONDS);
                    }
                    if (this.R) {
                        throw new IOException("Deferred parse error", th);
                    }
                }
            }
        }
        this.M.v();
    }

    public synchronized void O() {
        this.M.w();
    }

    public synchronized void P() {
        this.z.clear();
        this.n = false;
        this.p = 0L;
        this.M.x();
        J();
    }

    public synchronized void Q(long j) {
        this.P = j;
        this.M.f = j;
        if (this.i > 0 && j >= this.i - 10000) {
            this.n = true;
        }
    }

    public synchronized boolean R() {
        return this.M.F(this.n);
    }

    protected final long S(BufferedMediaSegment bufferedMediaSegment) {
        zjr zjrVar = this.d;
        if (zjrVar == null || !zjrVar.j.m(390, 45845533L)) {
            return bufferedMediaSegment.e();
        }
        long j = bufferedMediaSegment.h;
        return j != -9223372036854775807L ? Math.min(bufferedMediaSegment.e(), j) : bufferedMediaSegment.e();
    }

    public final void T(List list) {
        if (this.O != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                EmbeddedMetadataWithSegment embeddedMetadataWithSegment = (EmbeddedMetadataWithSegment) it.next();
                BufferedMediaSegment bufferedMediaSegmentB = embeddedMetadataWithSegment.b();
                EmbeddedMetadataListener embeddedMetadataListener = this.O;
                jqz jqzVar = this.b;
                FormatIdOuterClass$FormatId formatIdOuterClass$FormatId = bufferedMediaSegmentB.a;
                long j = bufferedMediaSegmentB.b;
                TimeUnit timeUnit = TimeUnit.MICROSECONDS;
                embeddedMetadataListener.g(jqzVar, formatIdOuterClass$FormatId, j, bufferedMediaSegmentB.e() / 1000, embeddedMetadataWithSegment.a(), embeddedMetadataWithSegment.c());
            }
        }
    }

    public final void U(EmbeddedMetadataListener embeddedMetadataListener) {
        this.O = embeddedMetadataListener;
        this.V.execute(afwl.i(new Runnable() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.SampleHolder$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ArrayList arrayList = new ArrayList();
                SampleHolder sampleHolder = this.a;
                List list = sampleHolder.T;
                synchronized (list) {
                    if (list.isEmpty()) {
                        return;
                    }
                    arrayList.addAll(list);
                    list.clear();
                    sampleHolder.T(arrayList);
                }
            }
        }));
    }

    final void V(cjz cjzVar) {
        SampleHolderDrmSessionManager sampleHolderDrmSessionManager = this.U;
        if (sampleHolderDrmSessionManager != null) {
            if (sampleHolderDrmSessionManager.a.equals(cjz.m) || sampleHolderDrmSessionManager.a.equals(cjzVar)) {
                sampleHolderDrmSessionManager.a = cjzVar;
                return;
            }
            PlatypusException.PlatypusExceptionBuilder platypusExceptionBuilder = new PlatypusException.PlatypusExceptionBuilder(PlatypusException.ErrorType.d);
            platypusExceptionBuilder.b("m", "DrmSessionAttemptToReplaceExistingManager");
            ((axo) sampleHolderDrmSessionManager.b.get()).accept(platypusExceptionBuilder.a());
        }
    }

    protected final boolean W() {
        boolean z = this.W;
        zjr zjrVar = this.d;
        return z ? zjrVar.W().s : zjrVar.W().r;
    }

    protected final boolean X() {
        boolean z = this.W;
        zjr zjrVar = this.d;
        return z ? zjrVar.W().u : zjrVar.W().t;
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaSegmentHolder
    public synchronized void a() {
        if (this.d.ax()) {
            synchronized (this.v) {
                try {
                    this.w = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            Z();
        }
        zhq zhqVar = zhq.ABR;
        this.b.name();
        String str = this.h;
        this.z.clear();
        this.n = false;
        this.p = 0L;
        this.M.y(true);
        Q(this.P);
        J();
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaSegmentHolder
    public void b(BufferedMediaSegment bufferedMediaSegment, long j, long j2) {
        BufferedMediaSegment bufferedMediaSegment2;
        CopyOnWriteArrayList copyOnWriteArrayList = bufferedMediaSegment.e;
        if (!copyOnWriteArrayList.isEmpty()) {
            agke agkeVarN = agke.n(copyOnWriteArrayList);
            long j3 = this.y;
            ArrayList arrayList = new ArrayList();
            AutoValue_SampleHolder_EmbeddedMetadataWithSegment autoValue_SampleHolder_EmbeddedMetadataWithSegment = new AutoValue_SampleHolder_EmbeddedMetadataWithSegment(agkeVarN, bufferedMediaSegment, j3);
            List list = this.T;
            synchronized (list) {
                list.add(autoValue_SampleHolder_EmbeddedMetadataWithSegment);
                if (this.O != null) {
                    arrayList.addAll(list);
                    list.clear();
                }
            }
            if (!arrayList.isEmpty() && this.O != null) {
                T(arrayList);
            }
            bufferedMediaSegment.e.clear();
        }
        zjr zjrVar = this.d;
        if (zjrVar == null || !zjrVar.dV()) {
            bufferedMediaSegment2 = bufferedMediaSegment;
            bufferedMediaSegment2.g(j, j2);
        } else {
            con conVar = this.M;
            int iK = conVar.k();
            int i = iK > conVar.e ? (-1) + iK : -1;
            bufferedMediaSegment2 = bufferedMediaSegment;
            bufferedMediaSegment2.h(j, j2, i);
        }
        this.p = bufferedMediaSegment2.e() + bufferedMediaSegment2.c();
    }

    public synchronized int d(ccu ccuVar, DecoderInputBuffer decoderInputBuffer, int i) {
        int iL;
        con conVar = this.M;
        long jQ = conVar.q();
        iL = conVar.l(ccuVar, decoderInputBuffer, i, this.n);
        if (iL == -5) {
            synchronized (this) {
                int iM = m(jQ);
                String str = iM == -1 ? null : ((BufferedMediaSegment) this.z.get(iM)).f;
                if (str != null) {
                    this.N = str;
                } else if (this.j != null) {
                    this.N = this.j.b;
                }
            }
            return -5;
        }
        return iL;
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaSegmentHolder
    public void e(bwb bwbVar, int i, int i2) {
        this.M.d(bwbVar, i, i2);
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaSegmentHolder
    public void f(long j, int i, int i2, int i3, cwi cwiVar) {
        this.M.e(j, i, i2, i3, cwiVar);
    }

    public synchronized int g(long j) {
        int iJ;
        boolean z = this.n;
        con conVar = this.M;
        iJ = conVar.j(j, z);
        conVar.A(iJ);
        return iJ;
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaSegmentHolder
    public void h(bse bseVar) {
        con conVar = this.M;
        if (bseVar.equals(conVar.r())) {
            return;
        }
        conVar.b(bseVar);
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaSegmentHolder
    public void i(long j) {
        this.M.i = j;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0019 A[Catch: all -> 0x0071, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0005, B:9:0x0010, B:11:0x0019, B:17:0x002c, B:18:0x003c, B:19:0x003f, B:21:0x0054, B:23:0x006a, B:22:0x0066), top: B:30:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x0027 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0029 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:17:0x002c A[Catch: all -> 0x0071, TRY_ENTER, TryCatch #0 {, blocks: (B:5:0x0005, B:9:0x0010, B:11:0x0019, B:17:0x002c, B:18:0x003c, B:19:0x003f, B:21:0x0054, B:23:0x006a, B:22:0x0066), top: B:30:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x003c A[Catch: all -> 0x0071, TryCatch #0 {, blocks: (B:5:0x0005, B:9:0x0010, B:11:0x0019, B:17:0x002c, B:18:0x003c, B:19:0x003f, B:21:0x0054, B:23:0x006a, B:22:0x0066), top: B:30:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0054 A[Catch: all -> 0x0071, TryCatch #0 {, blocks: (B:5:0x0005, B:9:0x0010, B:11:0x0019, B:17:0x002c, B:18:0x003c, B:19:0x003f, B:21:0x0054, B:23:0x006a, B:22:0x0066), top: B:30:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0066 A[Catch: all -> 0x0071, TryCatch #0 {, blocks: (B:5:0x0005, B:9:0x0010, B:11:0x0019, B:17:0x002c, B:18:0x003c, B:19:0x003f, B:21:0x0054, B:23:0x006a, B:22:0x0066), top: B:30:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x000f  */
    /* JADX WARN: Instruction removed from duplicated block: B:15:0x0029, please report this as an issue */
    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaSegmentHolder
    public synchronized boolean j(BufferedMediaSegment bufferedMediaSegment, int i, boolean z) {
        boolean z2;
        List list;
        long jS;
        con conVar;
        if (i < 0) {
            z2 = false;
            ahno.F(z2);
            if (bufferedMediaSegment.k()) {
                jS = S(bufferedMediaSegment);
                conVar = this.M;
                if (jS <= conVar.p()) {
                    conVar.t(jS);
                } else {
                    if (!z) {
                        return false;
                    }
                    long jP = conVar.p();
                    aa();
                    conVar.t(jS);
                    Y();
                    conVar.f = jP;
                }
            }
            list = this.z;
            list.subList(i, list.size()).clear();
            this.n = false;
            if (list.isEmpty()) {
                this.p = 0L;
            } else {
                BufferedMediaSegment bufferedMediaSegment2 = (BufferedMediaSegment) aguu.K(list);
                this.p = bufferedMediaSegment2.e() + bufferedMediaSegment2.c();
            }
            J();
            return true;
        }
        if (i < this.z.size()) {
            z2 = true;
        } else {
            z2 = false;
        }
        ahno.F(z2);
        if (bufferedMediaSegment.k()) {
            jS = S(bufferedMediaSegment);
            conVar = this.M;
            if (jS <= conVar.p()) {
                conVar.t(jS);
            } else {
                if (!z) {
                    return false;
                }
                long jP2 = conVar.p();
                aa();
                conVar.t(jS);
                Y();
                conVar.f = jP2;
            }
        }
        list = this.z;
        list.subList(i, list.size()).clear();
        this.n = false;
        if (list.isEmpty()) {
            BufferedMediaSegment bufferedMediaSegment3 = (BufferedMediaSegment) aguu.K(list);
            this.p = bufferedMediaSegment3.e() + bufferedMediaSegment3.c();
        } else {
            this.p = 0L;
        }
        J();
        return true;
        throw th;
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaSegmentHolder
    public synchronized boolean k(long j) {
        boolean zH;
        zH = false;
        if (j != Long.MAX_VALUE) {
            if (this.d.ax()) {
                synchronized (this.v) {
                    try {
                        this.w = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Z();
            }
            zH = this.M.H(j, false);
            zhq zhqVar = zhq.ABR;
            this.b.name();
            String str = this.h;
            Q(j);
        }
        return zH;
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaSegmentHolder
    public int l(brv brvVar, int i, boolean z) {
        return this.M.g(brvVar, i, z);
    }
}
