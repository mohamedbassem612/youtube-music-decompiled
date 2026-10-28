package defpackage;

import android.os.Debug;
import android.os.Handler;
import com.google.protos.youtube.api.innertube.ManifestlessWindowedLiveConfigOuterClass$ManifestlessWindowedLiveConfig;
import java.util.Locale;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yyi extends zeu {
    public final yye a;
    public final zjr b;
    private final agfr e;
    private final Handler f;

    public yyi(yha yhaVar, ExecutorService executorService, zjr zjrVar, Handler handler, yye yyeVar, agfr agfrVar) {
        super(yhaVar, executorService);
        this.b = zjrVar;
        this.a = yyeVar;
        this.f = handler;
        this.e = agfrVar;
    }

    public final long a() {
        return ((Long) this.e.io()).longValue();
    }

    public final void b(zcf zcfVar, zfs zfsVar, boolean z, boolean z2) {
        String strZ;
        Long lValueOf;
        long j;
        ywn ywnVar = zcfVar.Z;
        wja wjaVar = zcfVar.A;
        long j2 = zcfVar.g;
        super.d(ywnVar, wjaVar);
        yzc yzcVar = this.a.c;
        if (yzcVar.b) {
            ywnVar.l("hwh10p", true != yzcVar.c ? "gpu" : "hw");
        }
        zjr zjrVar = this.b;
        if (zjrVar.fm() && z) {
            int i = zic.a;
            ywnVar.l("eao", "offload.1;pos." + a());
            if (z2) {
                ywnVar.l("esfo", "sfo.1;pos." + a());
            }
        }
        if (wjaVar.D() || wjaVar.B) {
            ywnVar.l("cat", "manifestless");
        }
        if (j2 != zjrVar.v()) {
            long jV = zcfVar.y.v();
            if (j2 != jV) {
                ywnVar.o(j2, -1L);
            } else {
                aoqd aoqdVar = zcfVar.y.d;
                aopd aopdVar = aoqdVar.h;
                if (aopdVar == null) {
                    aopdVar = aopd.a;
                }
                if ((aopdVar.b & 4) != 0) {
                    aopd aopdVar2 = aoqdVar.h;
                    if (aopdVar2 == null) {
                        aopdVar2 = aopd.a;
                    }
                    arev arevVar = aopdVar2.c;
                    if (arevVar == null) {
                        arevVar = arev.a;
                    }
                    j = arevVar.d;
                } else {
                    j = 0;
                }
                if (j == 0) {
                    j = -1;
                }
                ywnVar.o(jV, j);
            }
        }
        long j3 = zcfVar.e;
        if (j3 != -1) {
            ywnVar.l("cp", "min." + j3 + ";max." + zcfVar.f);
        } else if (zcfVar.f != -1) {
            j3 = -1;
            ywnVar.l("cp", "min." + j3 + ";max." + zcfVar.f);
        }
        Long lT = zcfVar.y.T();
        if (lT != null) {
            Long lR = zcfVar.y.R();
            Long lS = zcfVar.y.S();
            Long lQ = zcfVar.y.Q();
            aoqd aoqdVar2 = zcfVar.y.d;
            ManifestlessWindowedLiveConfigOuterClass$ManifestlessWindowedLiveConfig defaultInstance = aoqdVar2.G;
            if (defaultInstance == null) {
                defaultInstance = ManifestlessWindowedLiveConfigOuterClass$ManifestlessWindowedLiveConfig.getDefaultInstance();
            }
            if ((defaultInstance.b & 16) != 0) {
                ManifestlessWindowedLiveConfigOuterClass$ManifestlessWindowedLiveConfig defaultInstance2 = aoqdVar2.G;
                if (defaultInstance2 == null) {
                    defaultInstance2 = ManifestlessWindowedLiveConfigOuterClass$ManifestlessWindowedLiveConfig.getDefaultInstance();
                }
                lValueOf = Long.valueOf(defaultInstance2.g);
            } else {
                lValueOf = null;
            }
            ywnVar.n(lT.longValue(), lR != null ? lR.longValue() : -1L, lS != null ? lS.longValue() : -1L, lQ != null ? lQ.longValue() : -1L, lValueOf != null ? lValueOf.longValue() : -1L);
        }
        if (zjrVar.aa().c && zcfVar.S == null) {
            zhv zhvVar = new zhv("missingpotoken");
            zhvVar.e(0L);
            String str = wjaVar.g;
            zh zhVar = new zh((byte[]) 0, (char[]) r3);
            zhVar.m(str);
            zhvVar.d = zfsVar.e(zhVar.l());
            ywnVar.k(zhvVar.a());
        }
        Runtime runtime = Runtime.getRuntime();
        try {
            strZ = String.format(Locale.US, "tot.%d;max.%d;free.%d;heap.%d;hpall.%d;hpfree.%d", Long.valueOf(runtime.totalMemory() >> 20), Long.valueOf(runtime.maxMemory() >> 20), Long.valueOf(runtime.freeMemory() >> 20), Long.valueOf(Debug.getNativeHeapSize() >> 20), Long.valueOf(Debug.getNativeHeapAllocatedSize() >> 20), Long.valueOf(Debug.getNativeHeapFreeSize() >> 20));
        } catch (RuntimeException e) {
            strZ = ahno.Z(zhf.g(e));
        }
        ywnVar.l("mem", strZ);
    }

    public final void c(Throwable th) {
        this.f.post(new yts(this, th, 12));
    }
}
