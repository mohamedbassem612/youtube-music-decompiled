package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import j$.util.Optional;
import java.security.Key;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ynw {
    public final ygf a;
    public ynv b;
    private final boolean d;
    private final agfr e;
    private final jsk f;
    private final Key g;
    private final Key h;
    private final zgy i;
    private final byb j;
    private final Object k;
    private final Optional l;
    private final zjr m;
    private final Object n;
    private final mbc p;
    private long q;
    private long r;
    private final tgr s;
    public volatile boolean c = false;
    private volatile boolean o = false;

    public ynw(agfr agfrVar, jsk jskVar, Key key, Key key2, zgy zgyVar, byb bybVar, mbc mbcVar, Object obj, ygf ygfVar, tgr tgrVar, Optional optional, zjr zjrVar, boolean z) {
        this.e = agfrVar;
        this.f = jskVar;
        this.g = key;
        this.h = key2;
        zgyVar.getClass();
        this.i = zgyVar;
        this.j = bybVar;
        this.p = mbcVar;
        this.k = obj;
        this.a = ygfVar;
        this.s = tgrVar;
        this.l = optional;
        this.n = new Object();
        this.d = z;
        this.m = zjrVar;
        this.q = -1L;
    }

    private final bye c() {
        jsx jsxVar = new jsx("Downloader");
        Key key = this.g;
        return key != null ? new bxs(key.getEncoded(), jsxVar) : jsxVar;
    }

    public final void a(boolean z) {
        synchronized (this.n) {
            this.c = true;
            this.o = z;
        }
    }

    public final void b(wgs wgsVar, long j, long j2, wiu wiuVar, String str, zgx zgxVar, zgx zgxVar2) throws Throwable {
        Object obj;
        String str2;
        Uri uriL;
        String str3;
        long j3;
        boolean z;
        long j4;
        long j5;
        int iA;
        Object obj2 = this.k;
        synchronized (obj2) {
            try {
                String str4 = wgsVar.c;
                long jK = wgsVar.k();
                int iE = wgsVar.e();
                String strC = wgsVar.C();
                boolean z2 = this.d;
                String strBv = zik.bv(str4, iE, strC, jK, z2);
                if (TextUtils.isEmpty(str) || z2) {
                    str2 = str;
                    uriL = wgsVar.e;
                } else {
                    str2 = str;
                    uriL = wgsVar.l(str2);
                }
                boolean z3 = true;
                long j6 = true != z2 ? j2 : -1L;
                byh byhVar = new byh();
                byhVar.a = uriL;
                byhVar.g = j;
                byhVar.h = j6;
                byhVar.i = strBv;
                byhVar.j = 4;
                zjr zjrVar = this.m;
                if (zjrVar.cI()) {
                    ypp yppVarA = ypq.a();
                    yppVarA.j(tok.MEDIA_EXO_CACHE_DOWNLOADER);
                    byhVar.k = yppVarA.a();
                }
                byi byiVarA = byhVar.a();
                boolean zBL = zjrVar.bL();
                zgy zgyVar = this.i;
                bye byeVarD = zBL ? zgyVar.d(wiuVar, ahno.Z(str2), Optional.ofNullable(str4)) : zgyVar.b(wiuVar);
                jsk jskVar = (jsk) this.e.io();
                if (jskVar != null) {
                    byeVarD = new jsn(jskVar, byeVarD, c(), null, 5, zgxVar);
                }
                this.l.isPresent();
                byb bybVar = this.j;
                byc jsmVar = new jsm(((ynt) bybVar).a, 20480, ((ynt) bybVar).b);
                Key key = this.h;
                if (key != null) {
                    jsmVar = new bxr(key.getEncoded(), jsmVar, new byte[SemanticState.Obscured]);
                }
                jsn jsnVar = new jsn(this.f, byeVarD, c(), jsmVar, (true == z2 ? 0 : 4) | 1, zgxVar2);
                tgr tgrVar = this.s;
                int i = -10;
                byz byzVar = new byz(jsnVar, tgrVar, -10);
                byte[] bArr = new byte[SemanticState.Obscured];
                obj = obj2;
                try {
                    long j7 = byiVarA.i;
                    byi byiVarA2 = byiVarA;
                    boolean z4 = false;
                    while (!z4) {
                        tgrVar.d(i);
                        try {
                            tgrVar.e(i);
                            long j8 = 0;
                            try {
                                try {
                                    long jB = byzVar.b(byiVarA2);
                                    if (z3 == z2) {
                                        j7 = jB;
                                    }
                                    while (!this.c && (iA = byzVar.a(bArr, 0, SemanticState.Obscured)) >= 0) {
                                        try {
                                            j8 += (long) iA;
                                            long j9 = byiVarA2.h + j8;
                                            j5 = j7;
                                            try {
                                                if (j9 == this.q) {
                                                    long jB2 = this.p.b();
                                                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                                                    TimeUnit timeUnit2 = TimeUnit.SECONDS;
                                                    if (jB2 - this.r >= 30000) {
                                                        throw new yoa();
                                                    }
                                                } else {
                                                    this.q = j9;
                                                    this.r = this.p.b();
                                                    ynv ynvVar = this.b;
                                                    if (ynvVar != null) {
                                                        ynvVar.c(wgsVar, j9);
                                                    }
                                                }
                                                j7 = j5;
                                            } catch (bti unused) {
                                                j3 = j5;
                                                j4 = j8;
                                                z = false;
                                                boolean z5 = j4 == byiVarA2.i;
                                                if (!z5) {
                                                    byiVarA2 = byiVarA2.a(j4);
                                                }
                                                byzVar.f();
                                                z2 = z;
                                                z4 = z5;
                                                j7 = j3;
                                                this.s.g(-10);
                                                z3 = true;
                                                i = -10;
                                            }
                                        } catch (bti unused2) {
                                            j5 = j7;
                                        }
                                    }
                                    long j10 = j7;
                                    byzVar.f();
                                    j7 = j10;
                                    z2 = false;
                                    z4 = true;
                                } catch (bti unused3) {
                                    j3 = j7;
                                    z = z2;
                                    j4 = 0;
                                }
                                this.s.g(-10);
                                z3 = true;
                                i = -10;
                            } catch (Throwable th) {
                                byzVar.f();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            this.s.g(-10);
                            throw th2;
                        }
                    }
                    if (j6 != j7) {
                        byhVar.h = j7;
                        byiVarA = byhVar.a();
                    }
                    if (!this.c) {
                        return;
                    }
                    if (this.o && (str3 = byiVarA.j) != null) {
                        jsk jskVar2 = this.f;
                        for (jsp jspVar : jskVar2.g(str3)) {
                            long j11 = jspVar.b;
                            long j12 = byiVarA.h;
                            if (j11 >= j12 && j11 + jspVar.c <= j12 + byiVarA.i) {
                                jskVar2.m(jspVar);
                            }
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                obj = obj2;
            }
        }
    }
}
