package defpackage;

import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import j$.util.concurrent.ThreadLocalRandom;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.AndroidNetworkLibrary;
import org.json.JSONException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axrv extends axnk {
    private final AtomicInteger a;
    private final axry b;

    public axrv() {
        axry axryVar = new axry();
        this.a = new AtomicInteger();
        this.b = axryVar;
    }

    private static int i(axnb axnbVar) {
        axnh axnhVar = axnh.CRONET_SOURCE_UNSPECIFIED;
        int iOrdinal = axnbVar.ordinal();
        if (iOrdinal == 1) {
            return 1;
        }
        if (iOrdinal == 2) {
            return 2;
        }
        if (iOrdinal == 3) {
            return 3;
        }
        if (iOrdinal != 4) {
            return iOrdinal != 5 ? 0 : 5;
        }
        return 4;
    }

    @Override // defpackage.axnk
    public final long a() {
        long jNextLong = ThreadLocalRandom.current().nextLong(-9223372036854775807L, 9223372036854775805L);
        return jNextLong >= -1 ? jNextLong + 2 : jNextLong;
    }

    @Override // defpackage.axnk
    public final void b(axnh axnhVar, long j, boolean z, boolean z2) {
        new axjt("CronetLoggerImpl#logCronetAdaptiveTrafficAlternateNetworkComputation", 0);
        AndroidNetworkLibrary.m(Process.myUid(), AndroidNetworkLibrary.j(axnhVar), j, z, z2);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0028 A[PHI: r3
      0x0028: PHI (r3v2 int) = (r3v1 int), (r3v3 int) binds: [B:5:0x0023, B:7:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.axnk
    public final void c(axnc axncVar) {
        int i = 0;
        new axjt("CronetLoggerImpl#logCronetAdaptiveTraffic", 0);
        int iMyUid = Process.myUid();
        int iJ = AndroidNetworkLibrary.j(axncVar.d);
        axnd axndVar = (axnd) axncVar.c.get();
        axnh axnhVar = axnh.CRONET_SOURCE_UNSPECIFIED;
        int iOrdinal = axndVar.ordinal();
        if (iOrdinal != 0) {
            int i2 = 1;
            if (iOrdinal != 1) {
                i2 = 2;
                if (iOrdinal == 2) {
                    i = i2;
                }
            } else {
                i = i2;
            }
        }
        AndroidNetworkLibrary.k(iMyUid, iJ, i, i((axnb) axncVar.a.get()), i((axnb) axncVar.b.get()));
    }

    @Override // defpackage.axnk
    public final void d(axnf axnfVar) {
        int i;
        new axjt("CronetLoggerImpl#logCronetEngineBuilderInitializedInfo", 0);
        long j = axnfVar.a;
        int i2 = axnfVar.h;
        axnh axnhVar = axnh.CRONET_SOURCE_UNSPECIFIED;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        if (i3 != 0) {
            i = i3 == 1 ? 2 : 0;
        } else {
            i = 1;
        }
        int i4 = axnfVar.b;
        int iJ = AndroidNetworkLibrary.j(axnfVar.c);
        int i5 = AndroidNetworkLibrary.i(axnfVar.d) - 1;
        axnj axnjVar = axnfVar.e;
        int i6 = axnjVar.a;
        int i7 = axnjVar.b;
        int i8 = axnjVar.c;
        int i9 = axnjVar.d;
        axnj axnjVar2 = axnfVar.f;
        AndroidNetworkLibrary.n(j, i, i4, iJ, i5, i6, i7, i8, i9, axnjVar2 == null ? -1 : axnjVar2.a, axnjVar2 == null ? -1 : axnjVar2.b, axnjVar2 == null ? -1 : axnjVar2.c, axnjVar2 != null ? axnjVar2.d : -1, axnfVar.g);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0039  */
    @Override // defpackage.axnk
    public final void e(long j, axne axneVar, axnj axnjVar, axnh axnhVar) {
        int i;
        int i2;
        Object objCast;
        if (axnhVar != null) {
            try {
                new axjt("CronetLoggerImpl#writeCronetEngineCreation", 0);
                try {
                    axrw axrwVar = new axrw(axneVar.f);
                    int i3 = axnjVar.a;
                    int i4 = axnjVar.b;
                    int i5 = axnjVar.c;
                    int i6 = axnjVar.d;
                    int iOrdinal = axnhVar.ordinal();
                    if (iOrdinal == 0) {
                        i = 0;
                    } else if (iOrdinal == 1) {
                        i = 1;
                    } else if (iOrdinal == 2) {
                        i = 2;
                    } else if (iOrdinal == 3) {
                        i = 3;
                    } else if (iOrdinal == 4) {
                        i = 4;
                    } else {
                        i = 0;
                    }
                    boolean z = axneVar.d;
                    boolean z2 = axneVar.c;
                    int i7 = axneVar.e;
                    if (i7 == 0) {
                        i2 = 1;
                    } else if (i7 != 1) {
                        i2 = i7 != 2 ? 4 : 3;
                    } else {
                        i2 = 2;
                    }
                    boolean z3 = axneVar.a;
                    boolean z4 = axneVar.b;
                    boolean z5 = axneVar.g;
                    int i8 = i;
                    String strR = (String) axrwVar.f("QUIC", "connection_options", null, String.class);
                    if (!axrw.h(strR)) {
                        ArrayList arrayList = new ArrayList();
                        String[] strArrSplit = strR.split(",", -1);
                        int length = strArrSplit.length;
                        int i9 = 0;
                        while (i9 < length) {
                            int i10 = i9;
                            String str = strArrSplit[i10];
                            String[] strArr = strArrSplit;
                            int i11 = length;
                            if (axrw.a.contains(str.toUpperCase(Locale.ROOT).trim())) {
                                arrayList.add(str);
                            }
                            i9 = i10 + 1;
                            strArrSplit = strArr;
                            length = i11;
                        }
                        strR = a.R(arrayList);
                    }
                    String str2 = strR;
                    int i12 = AndroidNetworkLibrary.i((Boolean) axrwVar.f("QUIC", "store_server_configs_in_properties", null, Boolean.class)) - 1;
                    int iB = axrwVar.b();
                    int iA = axrwVar.a();
                    int i13 = AndroidNetworkLibrary.i((Boolean) axrwVar.f("QUIC", "goaway_sessions_on_ip_change", null, Boolean.class)) - 1;
                    int i14 = AndroidNetworkLibrary.i((Boolean) axrwVar.f("QUIC", "close_sessions_on_ip_change", null, Boolean.class)) - 1;
                    int iK = axrwVar.k() - 1;
                    int iJ = axrwVar.j() - 1;
                    int i15 = AndroidNetworkLibrary.i((Boolean) axrwVar.f("QUIC", "disable_bidirectional_streams", null, Boolean.class)) - 1;
                    int iIntValue = ((Integer) axrwVar.f("QUIC", "max_time_before_crypto_handshake_seconds", -1, Integer.class)).intValue();
                    int iIntValue2 = ((Integer) axrwVar.f("QUIC", "max_idle_time_before_crypto_handshake_seconds", -1, Integer.class)).intValue();
                    int i16 = AndroidNetworkLibrary.i((Boolean) axrwVar.f("QUIC", "enable_socket_recv_optimization", null, Boolean.class)) - 1;
                    int i17 = axrwVar.i() - 1;
                    int iM = axrwVar.m() - 1;
                    int iC = axrwVar.c();
                    int iD = axrwVar.d();
                    int iIntValue3 = ((Integer) axrwVar.f("StaleDNS", "max_stale_uses", -1, Integer.class)).intValue();
                    int iL = axrwVar.l() - 1;
                    int iN = axrwVar.n() - 1;
                    int iE = axrwVar.e();
                    int iO = axrwVar.o() - 1;
                    if (axrwVar.b.length() != 0) {
                        try {
                            objCast = Boolean.class.cast(axrwVar.b.get("disable_ipv6_on_wifi"));
                        } catch (ClassCastException | JSONException unused) {
                            objCast = null;
                        }
                    } else {
                        objCast = null;
                    }
                    AndroidNetworkLibrary.p(j, i3, i4, i5, i6, i8, z, z2, i2, z3, z4, z5, str2, i12, iB, iA, i13, i14, iK, iJ, i15, iIntValue, iIntValue2, i16, i17, iM, iC, iD, iIntValue3, iL, iN, iE, iO, AndroidNetworkLibrary.i((Boolean) objCast) - 1, axneVar.h, Process.myUid());
                } catch (Throwable th) {
                    throw th;
                }
            } catch (Exception unused2) {
            }
        }
    }

    @Override // defpackage.axnk
    public final void f(axng axngVar) {
        if (Build.VERSION.SDK_INT >= 33) {
            new axjt("CronetLoggerImpl#logCronetInitializedInfo", 0);
            AndroidNetworkLibrary.q(axngVar.a, axngVar.b, axngVar.c, new long[0], new long[0], (String) axngVar.d, AndroidNetworkLibrary.j((axnh) axngVar.e), Process.myUid());
        }
    }

    @Override // defpackage.axnk
    public final void g(long j, axni axniVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        long j2;
        long j3;
        long j4;
        long j5;
        byte[] bytes;
        axry axryVar = this.b;
        synchronized (axryVar.a) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (axryVar.c + 1000 <= jElapsedRealtime) {
                axryVar.b = 1;
                axryVar.c = jElapsedRealtime;
            } else {
                if (axryVar.b > 0) {
                    this.a.incrementAndGet();
                    return;
                }
                axryVar.b = 1;
            }
            int andSet = this.a.getAndSet(0);
            new axjt("CronetLoggerImpl#writeCronetTrafficReported", 0);
            long j6 = axniVar.a;
            if (j6 < 0) {
                throw new IllegalArgumentException("Request header size is negative");
            }
            double d = j6 / 1024.0d;
            int i8 = 4;
            long j7 = 0;
            if (AndroidNetworkLibrary.h(d, 0, 1)) {
                i = 1;
            } else if (AndroidNetworkLibrary.h(d, 1, 10)) {
                i = 2;
            } else if (AndroidNetworkLibrary.h(d, 10, 25)) {
                i = 3;
            } else if (AndroidNetworkLibrary.h(d, 25, 50)) {
                i = 4;
            } else {
                i = AndroidNetworkLibrary.h(d, 50, 100) ? 5 : 6;
            }
            long j8 = axniVar.b;
            if (j8 < 0) {
                throw new IllegalArgumentException("Request body size is negative");
            }
            double d2 = j8 / 1024.0d;
            if (d2 == 0.0d) {
                i2 = 1;
            } else if (d2 > 0.0d && d2 < 10.0d) {
                i2 = 2;
            } else if (AndroidNetworkLibrary.h(d2, 10, 50)) {
                i2 = 3;
            } else if (AndroidNetworkLibrary.h(d2, 50, 200)) {
                i2 = 4;
            } else if (AndroidNetworkLibrary.h(d2, 200, 500)) {
                i2 = 5;
            } else if (AndroidNetworkLibrary.h(d2, 500, 1000)) {
                i2 = 6;
            } else {
                i2 = AndroidNetworkLibrary.h(d2, 1000, 5000) ? 7 : 8;
            }
            long j9 = axniVar.c;
            if (j9 < 0) {
                throw new IllegalArgumentException("Response header size is negative");
            }
            double d3 = j9 / 1024.0d;
            if (AndroidNetworkLibrary.h(d3, 0, 1)) {
                i3 = 1;
            } else if (AndroidNetworkLibrary.h(d3, 1, 10)) {
                i3 = 2;
            } else if (AndroidNetworkLibrary.h(d3, 10, 25)) {
                i3 = 3;
            } else if (AndroidNetworkLibrary.h(d3, 25, 50)) {
                i3 = 4;
            } else {
                i3 = AndroidNetworkLibrary.h(d3, 50, 100) ? 5 : 6;
            }
            long j10 = axniVar.d;
            if (j10 < 0) {
                throw new IllegalArgumentException("Response body size is negative");
            }
            double d4 = j10 / 1024.0d;
            if (d4 == 0.0d) {
                i8 = 1;
            } else if (d4 > 0.0d && d4 < 10.0d) {
                i8 = 2;
            } else if (AndroidNetworkLibrary.h(d4, 10, 50)) {
                i8 = 3;
            } else if (!AndroidNetworkLibrary.h(d4, 50, 200)) {
                if (AndroidNetworkLibrary.h(d4, 200, 500)) {
                    i8 = 5;
                } else if (AndroidNetworkLibrary.h(d4, 500, 1000)) {
                    i8 = 6;
                } else {
                    i8 = AndroidNetworkLibrary.h(d4, 1000, 5000) ? 7 : 8;
                }
            }
            int i9 = axniVar.e;
            String str = axniVar.g;
            MessageDigest messageDigest = axrx.a;
            if (messageDigest != null && str != null && !str.isEmpty() && (bytes = str.getBytes(StandardCharsets.UTF_8)) != null && bytes.length != 0) {
                j7 = ByteBuffer.wrap(messageDigest.digest(bytes)).getLong();
            }
            long j11 = axniVar.y;
            if (j11 == -1) {
                i4 = -1;
            } else {
                TimeUnit timeUnit = TimeUnit.MICROSECONDS;
                i4 = (int) (j11 / 1000);
            }
            int millis = (int) axniVar.f.toMillis();
            boolean z = axniVar.h;
            boolean z2 = axniVar.i;
            int i10 = axniVar.B;
            axnh axnhVar = axnh.CRONET_SOURCE_UNSPECIFIED;
            int i11 = i10 - 1;
            if (i11 != 0) {
                i5 = i11 != 1 ? 3 : 2;
            } else {
                i5 = 1;
            }
            int i12 = axniVar.j;
            int i13 = axniVar.k;
            int i14 = axniVar.l;
            int i15 = AndroidNetworkLibrary.i(Boolean.valueOf(axniVar.m)) - 1;
            int i16 = AndroidNetworkLibrary.i(Boolean.valueOf(axniVar.n)) - 1;
            int i17 = axniVar.o;
            int i18 = i;
            int i19 = axniVar.p;
            int i20 = axniVar.q;
            int i21 = axniVar.r;
            int i22 = i4;
            if (i21 != 1) {
                i6 = 2;
                i7 = i21 != 2 ? 0 : 1;
            } else {
                i6 = 2;
                i7 = 2;
            }
            int i23 = axniVar.C - 1;
            int i24 = 1;
            if (i23 != 1) {
                i24 = i23 != i6 ? 0 : 100;
            }
            int i25 = AndroidNetworkLibrary.i(Boolean.valueOf(axniVar.s)) - 1;
            int iJ = AndroidNetworkLibrary.j(axniVar.t);
            int i26 = i24;
            long j12 = axniVar.u;
            if (j12 == -1) {
                j2 = -1;
            } else {
                TimeUnit timeUnit2 = TimeUnit.MICROSECONDS;
                j2 = j12 / 1000;
            }
            long j13 = axniVar.v;
            if (j13 == -1) {
                j3 = -1;
            } else {
                TimeUnit timeUnit3 = TimeUnit.MICROSECONDS;
                j3 = j13 / 1000;
            }
            long j14 = axniVar.w;
            if (j14 == -1) {
                j4 = -1;
            } else {
                TimeUnit timeUnit4 = TimeUnit.MICROSECONDS;
                j4 = j14 / 1000;
            }
            long j15 = axniVar.x;
            if (j15 == -1) {
                j5 = -1;
            } else {
                TimeUnit timeUnit5 = TimeUnit.MICROSECONDS;
                j5 = j15 / 1000;
            }
            AndroidNetworkLibrary.o(j, i18, i2, i3, i8, i9, j7, i22, millis, z, z2, andSet, i5, i12, i13, i14, i15, i16, i17, i19, i20, i7, i26, i25, iJ, j2, j3, j4, j5, j12, j13, j14, j15, j11, AndroidNetworkLibrary.i(axniVar.z) - 1, AndroidNetworkLibrary.i(Boolean.valueOf(axniVar.A)) - 1);
        }
    }

    @Override // defpackage.axnk
    public final void h(long j, int i, axnh axnhVar) {
        new axjt("CronetLoggerImpl#logCronetUmaHistogram", 0);
        AndroidNetworkLibrary.l(Process.myUid(), AndroidNetworkLibrary.j(axnhVar), j, i);
    }
}
