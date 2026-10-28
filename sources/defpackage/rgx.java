package defpackage;

import j$.time.Duration;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rgx extends rgr {
    public final rih d;
    public rfs e;
    private final rhe f;
    private UUID g;
    public final Object c = new Object();
    private boolean h = true;

    public rgx(rhe rheVar, rih rihVar) {
        this.f = rheVar;
        this.d = rihVar;
    }

    private final Duration h(rfs rfsVar) {
        return ahbt.b(this.f.h(rfsVar.getTimestamp()));
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0081 A[Catch: all -> 0x00e2, TryCatch #1 {all -> 0x00e2, blocks: (B:13:0x0021, B:15:0x0025, B:16:0x0028, B:18:0x002a, B:20:0x002e, B:21:0x0030, B:23:0x0032, B:25:0x0054, B:26:0x0056, B:33:0x0066, B:40:0x0083, B:41:0x0085, B:36:0x007e, B:39:0x0081, B:27:0x0057, B:28:0x0059), top: B:70:0x0021, outer: #2, inners: #3 }] */
    @Override // defpackage.rgr
    public final void c(rfs rfsVar) {
        long j;
        rfsVar.p();
        Object obj = this.c;
        synchronized (obj) {
            UUID uuid = this.g;
            rfs rfsVar2 = null;
            if (uuid != null) {
                if (uuid.equals(rfsVar.l())) {
                    this.g = null;
                    e(rfsVar);
                } else {
                    g(rfsVar);
                }
                return;
            }
            synchronized (obj) {
                try {
                    if (this.h) {
                        this.h = false;
                    } else {
                        rfs rfsVar3 = this.e;
                        if (rfsVar3 != null) {
                            long timestamp = rfsVar3.getTimestamp();
                            long timestamp2 = rfsVar.getTimestamp();
                            rhe rheVar = this.f;
                            long jH = rheVar.h(timestamp);
                            long jH2 = rheVar.h(timestamp2);
                            rih rihVar = this.d;
                            long j2 = jH2 - jH;
                            if (jH2 <= ahbt.a(rihVar.a())) {
                                synchronized (rihVar.a) {
                                    try {
                                        j = rihVar.e;
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                if (j > 1 || j2 <= 31666) {
                                    this.d.d(this.f.h(this.e.getTimestamp()));
                                    g(this.e);
                                } else {
                                    rfsVar2 = this.e;
                                }
                                this.e = rfsVar;
                            } else {
                                rfsVar2 = this.e;
                                this.e = rfsVar;
                            }
                            throw th;
                        }
                        this.e = rfsVar;
                        rfsVar = rfsVar2;
                    }
                    if (rfsVar != null) {
                        rih rihVar2 = this.d;
                        if (rihVar2.a().compareTo(h(rfsVar)) < 0) {
                            Duration durationH = h(rfsVar);
                            synchronized (rihVar2.a) {
                                try {
                                    rihVar2.d = -1L;
                                    long jL = nra.l((ahbt.a(durationH) * 30) + 999999, 1000000L);
                                    rihVar2.c = jL;
                                    long j3 = rihVar2.e;
                                    long jL2 = j3 * nra.l((jL + j3) - 1, j3);
                                    rihVar2.c = jL2;
                                    rihVar2.c = Math.min(jL2, rihVar2.f);
                                    rihVar2.a();
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (rfsVar != null) {
                this.d.f();
                e(rfsVar);
            }
        }
    }

    @Override // defpackage.rgr, java.lang.AutoCloseable
    public final void close() {
        super.close();
        synchronized (this.c) {
            rfs rfsVar = this.e;
            if (rfsVar != null) {
                g(rfsVar);
            }
            this.e = null;
        }
    }

    @Override // defpackage.rgr
    public final void e(rfs rfsVar) {
        rfsVar.q();
        super.e(rfsVar);
    }

    @Override // defpackage.rhd
    public final void k(rfs rfsVar) {
        synchronized (this.c) {
            this.g = rfsVar.l();
            rfs rfsVar2 = this.e;
            if (rfsVar2 != null) {
                g(rfsVar2);
                this.e = null;
                this.h = true;
            }
        }
    }
}
