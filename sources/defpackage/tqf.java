package defpackage;

import app.rive.semantics.SemanticState;
import j$.util.stream.Stream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tqf implements tqj {
    public final AtomicReference a;
    public avmn b;
    private final File d;
    private final twh e;
    private final awmd f;
    private volatile int g;
    private final boolean h;
    private final awmd i;

    public tqf(twh twhVar, awmd awmdVar, awmd awmdVar2, File file) {
        boolean z;
        boolean z2;
        this.e = twhVar;
        this.f = awmdVar;
        this.i = awmdVar2;
        tqg.a();
        long[] jArr = (long[]) Stream.CC.of((Object[]) new File[]{e(file), file}).map(new hpc(twhVar, 2)).filter(new gqn(13)).findFirst().orElse(null);
        if (jArr == null) {
            jArr = new long[SemanticState.LiveRegion];
            z = true;
            z2 = true;
        } else {
            z = ((int) (jArr.length <= 0 ? 0L : jArr[0] & 127)) != 1;
            z2 = false;
        }
        this.h = z2;
        this.d = file;
        long[] jArrP = p(jArr);
        int iB = b(((tqv) awmdVar2.io()).b);
        int iO = o(iB);
        tqd tqdVar = new tqd();
        tqdVar.e(0);
        tqdVar.j(0);
        long[][] jArr2 = {jArrP, jArrP};
        tqdVar.l(jArr2[0]);
        tqdVar.k(jArr2[1]);
        tqdVar.g(z);
        tqdVar.f(0);
        tqdVar.h(iB);
        tqdVar.i(iO);
        this.a = new AtomicReference(tqdVar.a());
    }

    public static int b(int i) {
        return tzk.v(tzk.v(0, 74, (i >> 10) & 1), 267, (i >> 11) & 15);
    }

    static File e(File file) {
        return new File(String.valueOf(file.getPath()).concat(".bak"));
    }

    public static int o(int i) {
        int i2 = i >> 11;
        return ((i2 & 3) == 3 || (i2 & 8) == 0) ? 30 : 6;
    }

    static final long[] p(long[] jArr) {
        int length = jArr.length;
        if (length < 512 || length > 512) {
            jArr = Arrays.copyOf(jArr, SemanticState.LiveRegion);
        }
        int i = tqg.a;
        jArr[0] = (jArr[0] & (-128)) | 1;
        return jArr;
    }

    private static void u(tqe tqeVar, tqe tqeVar2) {
        ScheduledFuture scheduledFuture = tqeVar.i;
        if (scheduledFuture == null || scheduledFuture == tqeVar2.i) {
            return;
        }
        scheduledFuture.cancel(false);
    }

    @Override // defpackage.tqj
    public final /* synthetic */ int a(int i) {
        int i2 = tqg.a;
        return (int) c(i);
    }

    @Override // defpackage.tqj
    public final long c(int i) {
        boolean z = vyl.c.b;
        long[] jArr = ((tqe) this.a.get()).a;
        int i2 = tqg.a;
        int i3 = (i >>> 16) & 16383;
        long j = i3 < 64 ? (-1) + (1 << i3) : -1L;
        int i4 = (i >> 6) & 1023;
        if (i4 >= jArr.length) {
            return 0L;
        }
        return (jArr[i4] >> (i & 63)) & j;
    }

    @Override // defpackage.tqj
    public final tqh d(int i) {
        return new tqh(i, this);
    }

    @Override // defpackage.tqj
    public final void f(tqh tqhVar) {
        tqe tqeVar;
        tqd tqdVar;
        long[] jArr;
        long j;
        long jMax;
        do {
            tqeVar = (tqe) this.a.get();
            long[] jArr2 = tqeVar.b;
            long[] jArrCopyOf = Arrays.copyOf(jArr2, SemanticState.LiveRegion);
            int i = 0;
            long[] jArrCopyOf2 = null;
            while (i < tqhVar.e) {
                int i2 = tqhVar.a[i];
                int i3 = i2 & 63;
                long[] jArr3 = tqhVar.b;
                boolean[] zArr = tqhVar.c;
                long j2 = jArr3[i];
                int i4 = (i2 >>> 16) & 16383;
                int i5 = (i2 >> 6) & 1023;
                long[] jArr4 = jArrCopyOf;
                long j3 = -1;
                if (zArr[i]) {
                    int i6 = tqg.a;
                    jArr = jArr4;
                    j2 += i5 >= jArr.length ? 0L : (jArr[i5] >> i3) & (i4 >= 64 ? -1L : (1 << i4) - 1);
                } else {
                    jArr = jArr4;
                }
                int i7 = tqg.a;
                long j4 = i4 >= 64 ? -1L : (1 << i4) - 1;
                if (j4 == -1) {
                    jMax = j2;
                    j = jMax;
                    j4 = -1;
                } else {
                    j = j2;
                    jMax = Math.max(0L, Math.min(j2, j4));
                }
                jArr[i5] = (jArr[i5] & (~(j4 << i3))) | (jMax << i3);
                if ((i2 & 1073741824) == 0) {
                    if (jArrCopyOf2 == null) {
                        jArrCopyOf2 = Arrays.copyOf(tqeVar.a, SemanticState.LiveRegion);
                    }
                    long j5 = i4 >= 64 ? -1L : (1 << i4) - 1;
                    long jMax2 = j;
                    if (j5 != -1) {
                        jMax2 = Math.max(0L, Math.min(jMax2, j5));
                        j3 = j5;
                    }
                    jArrCopyOf2[i5] = (jArrCopyOf2[i5] & (~(j3 << i3))) | (jMax2 << i3);
                }
                i++;
                jArrCopyOf = jArr;
            }
            long[] jArr5 = jArrCopyOf;
            if (Arrays.equals(jArr2, jArr5)) {
                return;
            }
            tqdVar = new tqd(tqeVar);
            tqdVar.k(jArr5);
            tqdVar.g(true);
            if (jArrCopyOf2 != null) {
                tqdVar.l(jArrCopyOf2);
            }
        } while (!j(tqeVar, tqdVar));
    }

    public final void g() {
        tqe tqeVar;
        tqd tqdVar;
        tqe tqeVar2;
        tqd tqdVar2;
        tqe tqeVar3;
        tqd tqdVar3;
        do {
            tqeVar = (tqe) this.a.get();
            if (!tqeVar.c) {
                return;
            }
            tqdVar = new tqd(tqeVar);
            tqdVar.g(false);
        } while (!j(tqeVar, tqdVar));
        synchronized (this) {
            if (this.g >= tqeVar.f) {
                return;
            }
            File file = this.d;
            File fileE = e(file);
            tym.p(file, fileE, this.e);
            try {
                OutputStream outputStreamS = tym.s(file);
                try {
                    outputStreamS.write(tym.aw(tqeVar.b, SemanticState.Obscured));
                    outputStreamS.close();
                    this.g = tqeVar.f;
                    do {
                        tqeVar3 = (tqe) this.a.get();
                        if (tqeVar3.h == 0) {
                            break;
                        }
                        tqdVar3 = new tqd(tqeVar3);
                        tqdVar3.j(0);
                    } while (!j(tqeVar3, tqdVar3));
                    tym.n(fileE, this.e);
                } catch (Throwable th) {
                    try {
                        outputStreamS.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                if (!(th3 instanceof IOException)) {
                    this.e.a("!serialize", th3);
                }
                File file2 = this.d;
                twh twhVar = this.e;
                tym.n(file2, twhVar);
                tym.p(fileE, file2, twhVar);
                do {
                    tqeVar2 = (tqe) this.a.get();
                    tqdVar2 = new tqd(tqeVar2);
                    tqdVar2.g(true);
                    if ((tqdVar2.d & 32) == 0) {
                        throw new IllegalStateException("Property \"serializationFailures\" has not been set");
                    }
                    tqdVar2.j(tqdVar2.b + 1);
                } while (!j(tqeVar2, tqdVar2));
            }
        }
    }

    @Override // defpackage.tqj
    public final void h() {
        tqe tqeVar;
        tqd tqdVar;
        synchronized (vyl.d) {
            vyk vykVar = vyl.c;
            boolean z = vykVar.b;
            boolean z2 = vykVar.h;
            boolean z3 = vykVar.a;
            if (vyl.e.a != vym.a) {
                File file = vykVar.c;
                vykVar.h = false;
                vykVar.a = false;
                vykVar.g++;
                ((agrc) vyl.a.c().k("com/google/android/libraries/youtube/innertube/config/Flags", "purgeDiskFilesForRollback$<anonymous>", 664, "Flags.kt")).w("Config Zero: Global reset (%s)", "BootstrapStore.clearCache");
                vyl.b("Config Zero: Global reset: BootstrapStore.clearCache", new IllegalStateException("BootstrapStore.clearCache"));
            }
        }
        long[] jArrP = p(new long[SemanticState.LiveRegion]);
        do {
            tqeVar = (tqe) this.a.get();
            if (Arrays.equals(tqeVar.b, jArrP)) {
                return;
            }
            tqdVar = new tqd(tqeVar);
            tqdVar.l(jArrP);
            tqdVar.k(jArrP);
            tqdVar.g(true);
        } while (!j(tqeVar, tqdVar));
    }

    public final void i() {
        if (((tqe) this.a.get()).d == 0) {
            this.b = ((tqv) this.i.io()).a.af(new rtn(this, 13));
        }
    }

    public final boolean j(tqe tqeVar, tqd tqdVar) {
        if (tqeVar.a()) {
            tqdVar.f(tqeVar.d);
            if (!tqeVar.c) {
                tqdVar.g(false);
            }
        } else if (tqdVar.c() != 0) {
            tqdVar.c = null;
            if (tqdVar.c() == 1) {
                tqdVar.g(false);
            }
        } else {
            if ((tqdVar.d & 1) == 0) {
                throw new IllegalStateException("Property \"isDirty\" has not been set");
            }
            if (!tqdVar.a) {
                tqdVar.c = null;
            } else if (tqdVar.c == null || ((tqdVar.b() && !tqe.b(tqeVar.e)) || tqeVar.g != tqdVar.d())) {
                tqdVar.c = ((ScheduledExecutorService) this.f.io()).schedule(new syd(this, 9), tqdVar.b() ? 0 : tqdVar.d(), TimeUnit.SECONDS);
            }
        }
        tqe tqeVarA = tqdVar.a();
        boolean zAv = a.av(this.a, tqeVar, tqeVarA);
        if (zAv) {
            u(tqeVar, tqeVarA);
        } else {
            u(tqeVarA, tqeVar);
        }
        return zAv;
    }

    @Override // defpackage.tqj
    public final /* synthetic */ boolean k(int i) {
        int i2 = tqg.a;
        return c(i) != 0;
    }

    @Override // defpackage.tqj
    public final /* synthetic */ boolean l(int i, int i2) {
        int i3 = tqg.a;
        return (((int) c(i)) & i2) != 0;
    }

    @Override // defpackage.tqj
    public final boolean m() {
        return this.h;
    }

    @Override // defpackage.tqj
    public final /* synthetic */ byte[] n(int i, int i2) {
        int i3 = tqg.a;
        char c = (char) i;
        byte[] bArr = new byte[i2];
        int i4 = 0;
        for (int i5 = c; i5 < ((i >>> 16) & 16383) + c && i4 < i2; i5 += 64) {
            long jC = c(((-1073741824) & i) | 4194304 | i5);
            int iMin = Math.min(i4 + 8, i2);
            while (i4 < iMin) {
                bArr[i4] = (byte) jC;
                jC >>= 8;
                i4++;
            }
        }
        return bArr;
    }

    @Override // defpackage.tqj
    public final /* synthetic */ byte[] q() {
        int i = tqg.a;
        byte[] bArr = new byte[64];
        int i2 = 0;
        for (int i3 = 21888; i3 < 22400; i3 += 64) {
            long jC = c(1077936128 | i3);
            int i4 = i2 + 8;
            while (i2 < i4) {
                bArr[i2] = (byte) jC;
                jC >>= 8;
                i2++;
            }
        }
        return bArr;
    }

    @Override // defpackage.tqj
    public final /* synthetic */ long[] r() {
        int i = tqg.a;
        long[] jArr = new long[6];
        int i2 = 7168;
        for (int i3 = 0; i3 < 6; i3++) {
            jArr[i3] = c(4194304 | i2);
            i2 += 64;
        }
        return jArr;
    }

    @Override // defpackage.tqj
    public final /* synthetic */ long s() {
        int i = tqg.a;
        return c(1074269699) * 100;
    }

    @Override // defpackage.tqj
    public final /* synthetic */ boolean t(long j) {
        int i = tqg.a;
        return (c(1077944256) & j) != 0;
    }
}
