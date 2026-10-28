package defpackage;

import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cbd implements ccw {
    public static final agke a = agke.v("file", "content", "data", "android.resource", "rawresource", "asset");
    public final crf b;
    public final ConcurrentHashMap c;
    private final btm d;
    private final btl e;
    private final long f;
    private final long g;
    private final long h;
    private final long i;
    private final long j;
    private final long k;
    private final long l;
    private final long m;
    private final boolean n;
    private final long o;
    private final agkj p;
    private long q;

    protected cbd(crf crfVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, int i9, Map map) {
        ahno.M(true, "%s cannot be less than %s", "bufferForPlaybackMs", "0");
        ahno.M(true, "%s cannot be less than %s", "bufferForPlaybackForLocalPlaybackMs", "0");
        ahno.M(true, "%s cannot be less than %s", "bufferForPlaybackAfterRebufferMs", "0");
        ahno.M(true, "%s cannot be less than %s", "bufferForPlaybackAfterRebufferForLocalPlaybackMs", "0");
        ahno.M(i >= i5, "%s cannot be less than %s", "minBufferMs", "bufferForPlaybackMs");
        ahno.M(i2 >= i6, "%s cannot be less than %s", "minBufferForLocalPlaybackMs", "bufferForPlaybackForLocalPlaybackMs");
        ahno.M(i >= i7, "%s cannot be less than %s", "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        ahno.M(i2 >= i8, "%s cannot be less than %s", "minBufferForLocalPlaybackMs", "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        ahno.M(i3 >= i, "%s cannot be less than %s", "maxBufferMs", "minBufferMs");
        ahno.M(i4 >= i2, "%s cannot be less than %s", "maxBufferForLocalPlaybackMs", "minBufferForLocalPlaybackMs");
        ahno.M(true, "%s cannot be less than %s", "backBufferDurationMs", "0");
        this.d = new btm();
        this.e = new btl();
        this.b = crfVar;
        this.f = bwp.y(i);
        this.g = bwp.y(i2);
        this.h = bwp.y(i3);
        this.i = bwp.y(i4);
        this.j = bwp.y(i5);
        this.k = bwp.y(i6);
        this.l = bwp.y(i7);
        this.m = bwp.y(i8);
        this.n = z;
        this.o = bwp.y(i9);
        this.c = new ConcurrentHashMap();
        this.p = agkj.h(map);
        this.q = -1L;
    }

    private final int k(cfd cfdVar) {
        oga ogaVar = (oga) this.c.get(cfdVar);
        ogaVar.getClass();
        return ogaVar.a;
    }

    private final int l(cfd cfdVar) {
        Integer num = (Integer) this.p.get(cfdVar.b);
        if (num == null || num.intValue() == -1) {
            return -1;
        }
        return num.intValue();
    }

    private final int m(cfd cfdVar) {
        oga ogaVar = (oga) this.c.get(cfdVar);
        ogaVar.getClass();
        return ogaVar.b() * this.b.a;
    }

    private final void n(cfd cfdVar) {
        ConcurrentHashMap concurrentHashMap = this.c;
        oga ogaVar = (oga) concurrentHashMap.get(cfdVar);
        if (ogaVar != null) {
            int i = ogaVar.b - 1;
            ogaVar.b = i;
            if (i == 0) {
                concurrentHashMap.remove(cfdVar);
                o();
            }
        }
    }

    private final void o() {
        ConcurrentHashMap concurrentHashMap = this.c;
        boolean zIsEmpty = concurrentHashMap.isEmpty();
        crf crfVar = this.b;
        if (zIsEmpty) {
            crfVar.h();
            return;
        }
        Iterator it = concurrentHashMap.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((oga) it.next()).a;
        }
        crfVar.i(i);
    }

    private final boolean p(ccv ccvVar) {
        btn btnVar = ccvVar.b;
        bsp bspVar = btnVar.e(btnVar.m(ccvVar.c.a, this.e).c, this.d, 0L).d.c;
        if (bspVar == null) {
            return false;
        }
        String scheme = bspVar.a.getScheme();
        return TextUtils.isEmpty(scheme) || a.contains(scheme);
    }

    private final boolean q(boolean z) {
        if (z) {
            return this.n;
        }
        return false;
    }

    @Override // defpackage.ccw
    public final cra a(cfd cfdVar) {
        return new cbc(this, cfdVar);
    }

    @Override // defpackage.ccw
    public final void b(cfd cfdVar) {
        long id = Thread.currentThread().getId();
        long j = this.q;
        ahno.P(j == -1 || j == id, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.q = id;
        ConcurrentHashMap concurrentHashMap = this.c;
        oga ogaVar = (oga) concurrentHashMap.get(cfdVar);
        if (ogaVar == null) {
            concurrentHashMap.put(cfdVar, new oga(null));
        } else {
            ogaVar.b++;
        }
        oga ogaVar2 = (oga) concurrentHashMap.get(cfdVar);
        ogaVar2.getClass();
        int iL = l(cfdVar);
        if (iL == -1) {
            iL = 13107200;
        }
        ogaVar2.a = iL;
        ogaVar2.c = false;
    }

    @Override // defpackage.ccw
    public final void c(cfd cfdVar) {
        n(cfdVar);
        if (this.c.isEmpty()) {
            this.q = -1L;
        }
    }

    @Override // defpackage.ccw
    public final void d(cfd cfdVar) {
        n(cfdVar);
    }

    @Override // defpackage.ccw
    public final boolean e(ccv ccvVar) {
        long jMin;
        long j;
        ConcurrentHashMap concurrentHashMap = this.c;
        cfd cfdVar = ccvVar.a;
        oga ogaVar = (oga) concurrentHashMap.get(cfdVar);
        ogaVar.getClass();
        int iM = m(cfdVar);
        int iK = k(cfdVar);
        boolean z = false;
        if (cfdVar.equals(cfd.a)) {
            return iM < iK;
        }
        boolean zP = p(ccvVar);
        if (zP) {
            jMin = this.g;
            j = this.i;
        } else {
            jMin = this.f;
            j = this.h;
        }
        float f = ccvVar.f;
        if (f > 1.0f) {
            jMin = Math.min(bwp.v(jMin, f), j);
        }
        long j2 = ccvVar.e;
        if (j2 < Math.max(jMin, 500000L)) {
            boolean zQ = q(zP);
            Runtime runtime = Runtime.getRuntime();
            long jMaxMemory = runtime.maxMemory();
            boolean z2 = runtime.totalMemory() < jMaxMemory || runtime.freeMemory() + ((long) this.b.g()) >= jMaxMemory / 25;
            if (!zQ ? iM < iK : !(!z2 && iM >= iK)) {
                z = true;
            }
            ogaVar.c = z;
            if (!z && zQ && !z2) {
                bvx.h("Stopped loading before minBufferUs reached due to memory pressure, despite prioritizeTimeOverSizeThresholds=true.");
            }
            if (!ogaVar.c && j2 < 500000) {
                bvx.e("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= j || iM >= iK) {
            ogaVar.c = false;
        }
        return ogaVar.c;
    }

    @Override // defpackage.ccw
    public final boolean f(ccv ccvVar) {
        long jMin;
        boolean z;
        boolean z2 = ccvVar.g;
        long j = ccvVar.e;
        float f = ccvVar.f;
        boolean zP = p(ccvVar);
        long jX = bwp.x(j, f);
        if (z2) {
            if (zP) {
                jMin = this.m;
                z = true;
            } else {
                jMin = this.l;
                z = false;
            }
        } else if (zP) {
            jMin = this.k;
            z = true;
        } else {
            jMin = this.j;
            z = false;
        }
        long j2 = ccvVar.h;
        if (j2 != -9223372036854775807L) {
            jMin = Math.min(j2 / 2, jMin);
        }
        if (jMin > 0 && jX < jMin) {
            if (q(z)) {
                return false;
            }
            cfd cfdVar = ccvVar.a;
            if (m(cfdVar) < k(cfdVar)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.ccw
    public final long g() {
        return this.o;
    }

    @Override // defpackage.ccw
    public final void h(ccv ccvVar, cqs[] cqsVarArr) {
        ConcurrentHashMap concurrentHashMap = this.c;
        cfd cfdVar = ccvVar.a;
        int iL = l(cfdVar);
        oga ogaVar = (oga) concurrentHashMap.get(cfdVar);
        ogaVar.getClass();
        if (iL == -1) {
            boolean zP = p(ccvVar);
            int length = cqsVarArr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = 13107200;
                if (i < length) {
                    cqs cqsVar = cqsVarArr[i];
                    if (cqsVar != null) {
                        switch (cqsVar.d().c) {
                            case -1:
                            case 1:
                                break;
                            case 0:
                                i3 = 144310272;
                                break;
                            case 2:
                                i3 = !zP ? 131072000 : 19660800;
                                break;
                            case 3:
                            case 5:
                            default:
                                i3 = 131072;
                                break;
                            case 4:
                                i3 = 26214400;
                                break;
                        }
                        i2 += i3;
                    }
                    i++;
                } else {
                    iL = bwp.c(i2, 13107200, 210239488);
                }
            }
        }
        ogaVar.a = iL;
        o();
    }

    @Override // defpackage.ccw
    public final boolean i() {
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            if (((oga) it.next()).c) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.ccw
    public final void j() {
    }

    public cbd() {
        this(new crf(true, 65536), 50000, 1000, 50000, 50000, 1000, 1000, 2000, 1000, true, 0, agpn.b);
    }
}
