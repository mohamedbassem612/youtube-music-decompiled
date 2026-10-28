package defpackage;

import android.media.AudioRecord;
import android.os.Build;
import android.os.Handler;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.net.CronetEngine;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aejo {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/search/voice/EmbeddedAssistant");
    public boolean A;
    public final boolean B;
    public final agev C;
    public final boolean D;
    public final String E;
    public final String F;
    public final boolean G;
    public final aijp H;
    public final String I;
    public final boolean J;
    public String K;
    public String L;
    public final aigj M;
    public aigj N;
    public final int P;
    public final int Q;
    public final int R;
    public avkm S;
    public final lqa T;
    public final abxv U;
    public final wjr V;
    public final qcb W;
    public final qcb X;
    private final int Z;
    private final mbc aa;
    private final int ab;
    private final ci ac;
    public final afxu b;
    public final AudioRecord c;
    public final Handler d;
    public final String e;
    public final Executor f;
    public final afxr g;
    public final afxt h;
    public final CronetEngine i;
    public final String j;
    public String k;
    public final byte[] l;
    public final zwb m;
    public final String n;
    public final ahey o;
    public volatile ListenableFuture p;
    public volatile ListenableFuture q;
    final avbe r;
    public final rly s;
    volatile avkw t;
    public avax u;
    public final aejz x;
    public final float y;
    public final int z;
    private final aejt Y = new aejt();
    public final avkw v = new aejn(this, 0);
    public final Runnable w = new aehz(this, 12);
    public final AtomicBoolean O = new AtomicBoolean(false);

    public aejo(aejp aejpVar) {
        int iF;
        mbc mbcVar = aejpVar.l;
        this.aa = mbcVar;
        this.o = aejpVar.m;
        this.x = new aejz(mbcVar);
        this.z = 16000;
        this.i = aejpVar.a;
        this.s = aejpVar.b;
        this.U = aejpVar.C;
        this.V = aejpVar.D;
        this.X = aejpVar.F;
        this.W = aejpVar.E;
        this.r = new avbe();
        this.e = aejpVar.i;
        this.f = aejpVar.d;
        this.d = aejpVar.e;
        this.l = aejpVar.j;
        this.m = aejpVar.c;
        this.ac = aejpVar.G;
        this.P = aejpVar.y;
        this.n = aejpVar.f;
        int i = aejpVar.x;
        this.ab = i;
        int iP = p();
        boolean zK = k(16000);
        this.A = zK;
        int i2 = 4;
        i = (!zK || ((iF = aejz.f(iP)) == 4 && Build.VERSION.SDK_INT < 30) || aejz.a(aejz.d(iF)) == null) ? 2 : i;
        this.Q = i;
        this.j = aejpVar.k;
        this.Z = SemanticState.ReadOnly;
        aihf aihfVarCreateBuilder = afxr.a.createBuilder();
        int i3 = i - 1;
        AudioRecord audioRecord = null;
        if (i == 0) {
            throw null;
        }
        if (i3 == 2) {
            i2 = 5;
        } else if (i3 == 3) {
            i2 = 6;
        } else if (i3 != 4) {
            i2 = 3;
        }
        aihfVarCreateBuilder.copyOnWrite();
        ((afxr) aihfVarCreateBuilder.instance).b = i2 - 2;
        aihfVarCreateBuilder.copyOnWrite();
        ((afxr) aihfVarCreateBuilder.instance).c = 16000;
        this.g = (afxr) aihfVarCreateBuilder.build();
        aihf aihfVarCreateBuilder2 = afxt.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        ((afxt) aihfVarCreateBuilder2.instance).b = 1;
        aihfVarCreateBuilder2.copyOnWrite();
        ((afxt) aihfVarCreateBuilder2.instance).c = 16000;
        aihfVarCreateBuilder2.copyOnWrite();
        ((afxt) aihfVarCreateBuilder2.instance).d = 100;
        this.h = (afxt) aihfVarCreateBuilder2.build();
        try {
            audioRecord = new AudioRecord(6, 16000, 16, 2, Math.max(1280, AudioRecord.getMinBufferSize(16000, 16, 2)));
        } catch (IllegalArgumentException unused) {
        }
        this.c = audioRecord;
        aihf aihfVarCreateBuilder3 = afxu.a.createBuilder();
        String str = aejpVar.h;
        aihfVarCreateBuilder3.copyOnWrite();
        ((afxu) aihfVarCreateBuilder3.instance).b = str;
        String str2 = aejpVar.g;
        aihfVarCreateBuilder3.copyOnWrite();
        ((afxu) aihfVarCreateBuilder3.instance).c = str2;
        this.b = (afxu) aihfVarCreateBuilder3.build();
        this.y = aejpVar.r;
        this.B = aejpVar.o;
        this.C = aejpVar.s;
        this.D = aejpVar.q;
        this.E = aejpVar.n;
        this.F = aejpVar.t;
        this.G = aejpVar.p;
        this.T = aejpVar.B;
        this.H = aikz.a;
        this.I = aejpVar.u;
        this.J = aejpVar.A.m(14, 45627566L);
        this.M = aejpVar.v;
        int i4 = aejpVar.z;
        this.R = i4 == 0 ? 9 : i4;
        this.N = aejpVar.w;
    }

    public static /* synthetic */ void f(Throwable th) {
        if (th instanceof CancellationException) {
            return;
        }
        ((agrc) ((agrc) ((agrc) a.b()).j(th)).k("com/google/android/libraries/youtube/search/voice/EmbeddedAssistant", "pollAndStreamAudio", (char) 1074, "EmbeddedAssistant.java")).t("MEMFD: Immediate read schedule failed");
    }

    public static /* synthetic */ void g(Throwable th) {
        if (th instanceof CancellationException) {
            return;
        }
        ((agrc) ((agrc) ((agrc) a.b()).j(th)).k("com/google/android/libraries/youtube/search/voice/EmbeddedAssistant", "pollAndStreamAudio", (char) 1091, "EmbeddedAssistant.java")).t("MEMFD: Delayed read schedule failed");
    }

    private final aigj m() {
        this.A = false;
        if (!o()) {
            return null;
        }
        try {
            aejz aejzVar = this.x;
            if (!aejzVar.d) {
                throw new IllegalStateException("You forgot to call init()!");
            }
            if (aejzVar.c) {
                throw new IllegalStateException("Already flushed. You must reinitialize.");
            }
            aejzVar.c = true;
            aejy aejyVar = aejzVar.e;
            aejyVar.getClass();
            aigj aigjVarA = aejyVar.a();
            aejzVar.d = false;
            aejzVar.f = 1;
            return aigjVarA;
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    private final void n() {
        ListenableFuture listenableFuture;
        if (!this.O.getAndSet(false) || (listenableFuture = this.p) == null) {
            return;
        }
        listenableFuture.cancel(false);
        this.p = null;
    }

    private final boolean o() {
        return this.Q != 2;
    }

    private final int p() {
        int i = this.Q;
        if (i == 0) {
            i = this.ab;
        }
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 2) {
            return 23851;
        }
        if (i2 != 3) {
            return i2 != 4 ? 1 : 2;
        }
        return 24001;
    }

    public final /* synthetic */ Long a(FileDescriptor fileDescriptor, long j, byte[] bArr) throws InterruptedIOException {
        long j2;
        long j3;
        if (!this.O.get() || !fileDescriptor.valid()) {
            return -1L;
        }
        try {
            long j4 = Os.fstat(fileDescriptor).st_size;
            if (j4 > j) {
                j2 = j;
                int iPread = Os.pread(fileDescriptor, bArr, 0, (int) Math.min(j4 - j, 1024L), j2);
                if (iPread > 0) {
                    aihf aihfVarCreateBuilder = afxp.a.createBuilder();
                    aigj aigjVarW = aigj.w(bArr, 0, iPread);
                    aihfVarCreateBuilder.copyOnWrite();
                    afxp afxpVar = (afxp) aihfVarCreateBuilder.instance;
                    aigjVarW.getClass();
                    afxpVar.b = 1;
                    afxpVar.c = aigjVarW;
                    afxp afxpVar2 = (afxp) aihfVarCreateBuilder.build();
                    synchronized (this) {
                        if (this.t == null) {
                            return -1L;
                        }
                        this.t.c(afxpVar2);
                        long j5 = ((long) iPread) + j2;
                        aejy aejyVar = this.x.e;
                        if (aejyVar != null) {
                            aejyVar.c(j5);
                        }
                        j3 = j5;
                    }
                } else if (iPread == -1) {
                    return -1L;
                }
                return Long.valueOf(j3);
            }
            j2 = j;
            j3 = j2;
            return Long.valueOf(j3);
        } catch (ErrnoException e) {
            if (e.errno == OsConstants.EBADF) {
                return -1L;
            }
            ((agrc) ((agrc) ((agrc) a.c()).j(e)).k("com/google/android/libraries/youtube/search/voice/EmbeddedAssistant", "pollAndStreamAudio", (char) 1035, "EmbeddedAssistant.java")).t("MEMFD: Os.fstat or Os.pread failed");
            return -1L;
        }
    }

    public final synchronized void b() {
        ListenableFuture listenableFuture = this.q;
        if (listenableFuture != null) {
            listenableFuture.cancel(false);
            this.q = null;
        }
    }

    public final void c() {
        AudioRecord audioRecord = this.c;
        if (audioRecord != null) {
            audioRecord.release();
        }
        this.x.c();
        avax avaxVar = this.u;
        if (avaxVar != null) {
            avaxVar.e();
        }
        n();
    }

    public final void d() {
        String strAD = this.ac.aD(this.m.e());
        if (strAD != null) {
            avbe avbeVar = this.r;
            avba avbaVar = avbe.b;
            int i = avbb.c;
            avbeVar.e(new avaz("X-Goog-Visitor-Id", avbaVar), strAD);
        }
    }

    public final /* synthetic */ void e() {
        int i;
        float f;
        while (true) {
            AudioRecord audioRecord = this.c;
            if (audioRecord.getRecordingState() != 3) {
                return;
            }
            int i2 = this.Z;
            byte[] bArr = new byte[i2];
            int i3 = audioRecord.read(bArr, 0, i2);
            if (i3 <= 0) {
                ((agrc) ((agrc) a.c()).k("com/google/android/libraries/youtube/search/voice/EmbeddedAssistant", "createStreamAssistantRunnable", 831, "EmbeddedAssistant.java")).u("Failed to read audio data, result: %d", i3);
                return;
            }
            aejt aejtVar = this.Y;
            long j = 0;
            int i4 = i3;
            long j2 = 0;
            while (true) {
                i = 8;
                if (i4 < 2) {
                    break;
                }
                int i5 = bArr[i4 - 1] << 8;
                i4 -= 2;
                int i6 = i5 + (bArr[i4] & 255);
                j2 += (long) i6;
                j += (long) (i6 * i6);
            }
            int i7 = i3 >> 1;
            float fSqrt = (float) Math.sqrt(((j * ((long) i7)) - (j2 * j2)) / ((long) (i7 * i7)));
            if (!aejtVar.c && fSqrt == 0.0f) {
                ((agrc) ((agrc) aejt.a.c()).k("com/google/android/libraries/youtube/search/voice/SpeechLevelGenerator", "calculateSpeechLevel", 25, "SpeechLevelGenerator.java")).t("Really low audio levels detected. The audio input may have issues.");
                aejtVar.c = true;
            }
            float f2 = aejtVar.b;
            if (f2 < fSqrt) {
                f = (f2 * 0.999f) + (0.001f * fSqrt);
                aejtVar.b = f;
            } else {
                f = (f2 * 0.95f) + (0.05f * fSqrt);
                aejtVar.b = f;
            }
            float fLog10 = -120.0f;
            if (f > 0.0d) {
                double d = fSqrt / f;
                if (d > 1.0E-6d) {
                    fLog10 = ((float) Math.log10(d)) * 10.0f;
                }
            }
            int iMin = (int) (((Math.min(Math.max(fLog10, -2.0f), 10.0f) + 2.0f) * 100.0f) / 12.0f);
            int i8 = iMin >= 30 ? (iMin / 10) * 10 : 0;
            Handler handler = this.d;
            handler.post(new rir(this, i8, 19));
            if (this.t == null) {
                i();
                this.d.post(new aead(this, new NullPointerException(), i));
                return;
            }
            if (o()) {
                boolean zL = l();
                aejz aejzVar = this.x;
                if (zL) {
                    FileDescriptor fileDescriptorB = aejzVar.b();
                    if (fileDescriptorB != null && fileDescriptorB.valid()) {
                        try {
                            long j3 = Os.fstat(fileDescriptorB).st_size;
                            if (j3 > 2097152) {
                                ((agrc) ((agrc) a.c()).k("com/google/android/libraries/youtube/search/voice/EmbeddedAssistant", "createStreamAssistantRunnable", 845, "EmbeddedAssistant.java")).z("MEMFD size %d exceeded limit %d. Resetting conversation.", j3, 2097152L);
                                i();
                                handler.post(new aehz(this, 14));
                                return;
                            }
                        } catch (ErrnoException e) {
                            ((agrc) ((agrc) ((agrc) a.c()).j(e)).k("com/google/android/libraries/youtube/search/voice/EmbeddedAssistant", "createStreamAssistantRunnable", (char) 856, "EmbeddedAssistant.java")).t("Failed to check memfd size");
                        }
                    }
                    this.x.e(bArr, i3);
                } else {
                    aigj aigjVarE = aejzVar.e(bArr, i2);
                    if (aigjVarE.d() > 0) {
                        synchronized (this) {
                            if (this.t != null) {
                                avkw avkwVar = this.t;
                                aihf aihfVarCreateBuilder = afxp.a.createBuilder();
                                aihfVarCreateBuilder.copyOnWrite();
                                afxp afxpVar = (afxp) aihfVarCreateBuilder.instance;
                                aigjVarE.getClass();
                                afxpVar.b = 1;
                                afxpVar.c = aigjVarE;
                                avkwVar.c((afxp) aihfVarCreateBuilder.build());
                            }
                        }
                    } else {
                        continue;
                    }
                }
            } else {
                synchronized (this) {
                    if (this.t != null) {
                        avkw avkwVar2 = this.t;
                        aihf aihfVarCreateBuilder2 = afxp.a.createBuilder();
                        aigj aigjVarV = aigj.v(bArr);
                        aihfVarCreateBuilder2.copyOnWrite();
                        afxp afxpVar2 = (afxp) aihfVarCreateBuilder2.instance;
                        aigjVarV.getClass();
                        afxpVar2.b = 1;
                        afxpVar2.c = aigjVarV;
                        avkwVar2.c((afxp) aihfVarCreateBuilder2.build());
                    }
                }
            }
        }
    }

    public final void h(final FileDescriptor fileDescriptor, final long j, final byte[] bArr) {
        if (this.O.get()) {
            ahey aheyVar = this.o;
            ListenableFuture listenableFutureJ = aheyVar.submit(afwl.j(new Callable() { // from class: aejl
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.a(fileDescriptor, j, bArr);
                }
            }));
            this.p = listenableFutureJ;
            taf.i(listenableFutureJ, aheyVar, new aelg(this, 1), new aejm(this, j, fileDescriptor, bArr, 0), null);
        }
    }

    public final void i() {
        b();
        AudioRecord audioRecord = this.c;
        if (audioRecord != null) {
            audioRecord.stop();
        }
        synchronized (this) {
            aigj aigjVarM = m();
            if (aigjVarM != null && aigjVarM.d() > 0 && this.t != null && l()) {
                avkw avkwVar = this.t;
                aihf aihfVarCreateBuilder = afxp.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                afxp afxpVar = (afxp) aihfVarCreateBuilder.instance;
                afxpVar.b = 1;
                afxpVar.c = aigjVarM;
                avkwVar.c((afxp) aihfVarCreateBuilder.build());
            }
            this.x.c();
            if (this.t != null) {
                avkw avkwVar2 = this.t;
                ((avkp) avkwVar2).a.b("Reset conversation", Status.b.asException());
                this.t = null;
            }
        }
        n();
    }

    public final void j() {
        b();
        AudioRecord audioRecord = this.c;
        if (audioRecord != null) {
            audioRecord.stop();
        }
        synchronized (this) {
            aigj aigjVarM = m();
            if (l() && aigjVarM != null && aigjVarM.d() > 0 && this.t != null) {
                avkw avkwVar = this.t;
                aihf aihfVarCreateBuilder = afxp.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                afxp afxpVar = (afxp) aihfVarCreateBuilder.instance;
                afxpVar.b = 1;
                afxpVar.c = aigjVarM;
                avkwVar.c((afxp) aihfVarCreateBuilder.build());
            }
            this.x.c();
            if (this.t != null) {
                this.t.a();
                this.t = null;
            }
        }
        n();
    }

    public final boolean k(int i) {
        aejy aejuVar;
        int iP = p();
        if (iP == 1) {
            ((agrc) ((agrc) a.c()).k("com/google/android/libraries/youtube/search/voice/EmbeddedAssistant", "initializeEncoder", 956, "EmbeddedAssistant.java")).t("Encoder initialization skipped: Codec UNDEFINED");
            return false;
        }
        if (iP == 24001 && Build.VERSION.SDK_INT < 30) {
            ((agrc) ((agrc) a.c()).k("com/google/android/libraries/youtube/search/voice/EmbeddedAssistant", "initializeEncoder", 962, "EmbeddedAssistant.java")).t("OGG OPUS encoding requires API level 30+, not fully initialized for streaming.");
            return false;
        }
        try {
            aejz aejzVar = this.x;
            int iF = aejz.f(iP);
            aejzVar.f = iF;
            aedi aediVar = aejzVar.g;
            mbc mbcVar = aejzVar.b;
            if (iF != 4) {
                aejuVar = new aeju();
            } else if (Build.VERSION.SDK_INT >= 30) {
                aejuVar = new aejx(mbcVar);
            } else {
                ((agrc) ((agrc) aejz.a.c()).k("com/google/android/libraries/youtube/search/voice/StreamingAudioEncoder$DefaultStreamingAudioInternalEncoderFactory", "create", 112, "StreamingAudioEncoder.java")).t("OGG_OPUS requires API level 30+, falling back to AndroidSystemEncoder");
                aejuVar = new aeju();
            }
            aejzVar.e = aejuVar;
            aejzVar.e.e(i, iP);
            aejzVar.d = true;
            aejzVar.c = false;
            return true;
        } catch (aejv | IOException | IllegalArgumentException unused) {
            return false;
        }
    }

    public final boolean l() {
        return this.Q == 4 && Build.VERSION.SDK_INT >= 30;
    }
}
