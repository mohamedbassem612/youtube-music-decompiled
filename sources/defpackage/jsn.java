package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class jsn implements bye {
    public Uri a;
    private final jsk b;
    private final bye c;
    private final bye d;
    private final bye e;
    private final zgx f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private byi j;
    private byi k;
    private bye l;
    private long m;
    private long n;
    private long o;
    private jsp p;
    private boolean q;
    private boolean r;
    private final boolean s;
    private long t;
    private long u;
    private ywn v;

    public jsn(jsk jskVar, bye byeVar, bye byeVar2, byc bycVar, int i, zgx zgxVar) {
        this.b = jskVar;
        this.c = byeVar2;
        this.g = 1 == (i & 1);
        this.h = (i & 2) != 0;
        this.i = (i & 4) != 0;
        this.s = (i & 8) != 0;
        this.e = byeVar;
        this.d = bycVar != null ? new bzf(byeVar, bycVar) : null;
        this.f = zgxVar;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x006a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void g() {
        /*
            r7 = this;
            bye r0 = r7.l
            if (r0 == 0) goto L17
            r1 = 0
            r0.f()     // Catch: java.io.IOException -> L18 java.lang.Throwable -> L6a
            r7.k = r1
            r7.l = r1
            jsp r0 = r7.p
            if (r0 == 0) goto L17
            jsk r2 = r7.b
            r2.l(r0)
            r7.p = r1
        L17:
            return
        L18:
            r0 = move-exception
            boolean r2 = r0 instanceof defpackage.jsi     // Catch: java.lang.Throwable -> L6a
            if (r2 == 0) goto L21
            r2 = r0
            jsi r2 = (defpackage.jsi) r2     // Catch: java.lang.Throwable -> L6a
            goto L28
        L21:
            jsi r2 = new jsi     // Catch: java.lang.Throwable -> L6a
            java.lang.String r3 = "c.close"
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L6a
        L28:
            ywn r3 = r7.v     // Catch: java.lang.Throwable -> L6a
            if (r3 == 0) goto L69
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6a
            r4.<init>()     // Catch: java.lang.Throwable -> L6a
            java.lang.String r5 = r2.b()     // Catch: java.lang.Throwable -> L6a
            boolean r5 = r5.isEmpty()     // Catch: java.lang.Throwable -> L6a
            if (r5 != 0) goto L47
            java.lang.String r5 = r2.b()     // Catch: java.lang.Throwable -> L6a
            r4.append(r5)     // Catch: java.lang.Throwable -> L6a
            r5 = 59
            r4.append(r5)     // Catch: java.lang.Throwable -> L6a
        L47:
            zhv r5 = new zhv     // Catch: java.lang.Throwable -> L6a
            java.lang.String r6 = "cache.exception"
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L6a
            zhw r6 = defpackage.zhw.a     // Catch: java.lang.Throwable -> L6a
            r5.b = r6     // Catch: java.lang.Throwable -> L6a
            r5.d = r2     // Catch: java.lang.Throwable -> L6a
            int r2 = r4.length()     // Catch: java.lang.Throwable -> L6a
            if (r2 <= 0) goto L5f
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> L6a
            goto L60
        L5f:
            r2 = r1
        L60:
            r5.c = r2     // Catch: java.lang.Throwable -> L6a
            zhz r2 = r5.a()     // Catch: java.lang.Throwable -> L6a
            r3.k(r2)     // Catch: java.lang.Throwable -> L6a
        L69:
            throw r0     // Catch: java.lang.Throwable -> L6a
        L6a:
            r0 = move-exception
            r7.k = r1
            r7.l = r1
            jsp r2 = r7.p
            if (r2 == 0) goto L7a
            jsk r3 = r7.b
            r3.l(r2)
            r7.p = r1
        L7a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jsn.g():void");
    }

    private final void h(Throwable th) {
        if (k() || (th instanceof jsi)) {
            this.q = true;
            ywn ywnVar = this.v;
            if (ywnVar != null) {
                ywnVar.w("cigncau", zhf.b(th, true, 5, 100));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, java.util.Map] */
    private final void i(boolean z) throws InterruptedIOException {
        jsp jspVarB;
        long jMin;
        byi byiVarA;
        bye byeVar;
        String str = this.j.j;
        if (this.r) {
            jspVarB = null;
        } else if (this.g) {
            try {
                jspVarB = this.b.b(str, this.n);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            jspVarB = this.b.c(str, this.n);
        }
        if (jspVarB == null) {
            byeVar = this.e;
            byh byhVar = new byh(this.j);
            byhVar.g = this.n;
            byhVar.h = this.o;
            byiVarA = byhVar.a();
        } else if (jspVarB.d) {
            File file = jspVarB.e;
            long j = jspVarB.b;
            Uri uriFromFile = Uri.fromFile(file);
            long j2 = this.n - j;
            long j3 = jspVarB.c;
            long j4 = this.o;
            long jMin2 = j3 - j2;
            if (j4 != -1) {
                jMin2 = Math.min(jMin2, j4);
            }
            byh byhVar2 = new byh(this.j);
            byhVar2.a = uriFromFile;
            byhVar2.b = j;
            byhVar2.g = j2;
            byhVar2.h = jMin2;
            byiVarA = byhVar2.a();
            byeVar = this.c;
        } else {
            if (jspVarB.c()) {
                jMin = this.o;
            } else {
                jMin = jspVarB.c;
                long j5 = this.o;
                if (j5 != -1) {
                    jMin = Math.min(jMin, j5);
                }
            }
            byh byhVar3 = new byh(this.j);
            byhVar3.g = this.n;
            byhVar3.h = jMin;
            byiVarA = byhVar3.a();
            byeVar = this.d;
            if (byeVar == null) {
                byeVar = this.e;
                this.b.l(jspVarB);
                jspVarB = null;
            }
        }
        long j6 = Long.MAX_VALUE;
        if (!this.r && byeVar == this.e) {
            j6 = this.n + 102400;
        }
        this.u = j6;
        if (z) {
            bye byeVar2 = this.l;
            bye byeVar3 = this.e;
            ahno.O(byeVar2 == byeVar3);
            if (byeVar == byeVar3) {
                return;
            }
            try {
                g();
            } catch (Throwable th) {
                if (jspVarB.b()) {
                    this.b.l(jspVarB);
                }
                throw th;
            }
        }
        if (jspVarB != null && jspVarB.b()) {
            this.p = jspVarB;
        }
        this.l = byeVar;
        this.k = byiVarA;
        this.m = 0L;
        long jB = byeVar.b(byiVarA);
        kyr kyrVar = new kyr();
        if (this.k.i == -1 && jB != -1) {
            this.o = jB;
            kyrVar.q(this.n + jB);
        }
        if (l()) {
            this.a = this.l.c();
            Uri uri = this.j.a.equals(this.a) ? null : this.a;
            if (uri == null) {
                kyrVar.b.add("exo_redir");
                kyrVar.a.remove("exo_redir");
            } else {
                kyrVar.p("exo_redir", uri.toString());
            }
        }
        if (m()) {
            this.b.q(str, kyrVar);
        }
    }

    private final void j() {
        this.o = 0L;
        if (m()) {
            kyr kyrVar = new kyr();
            kyrVar.q(this.n);
            this.b.q(this.j.j, kyrVar);
        }
    }

    private final boolean k() {
        return this.l == this.c;
    }

    private final boolean l() {
        return !k();
    }

    private final boolean m() {
        return this.l == this.d;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0066 A[Catch: all -> 0x007d, IOException -> 0x0082, TryCatch #2 {IOException -> 0x0082, all -> 0x007d, blocks: (B:7:0x000e, B:9:0x0016, B:10:0x001a, B:12:0x0022, B:14:0x0028, B:15:0x002e, B:17:0x003f, B:20:0x0046, B:22:0x004a, B:23:0x004e, B:25:0x0054, B:27:0x005c, B:29:0x0062, B:30:0x0066, B:35:0x0072), top: B:55:0x000e }] */
    @Override // defpackage.brv
    public final int a(byte[] bArr, int i, int i2) throws IOException {
        long j;
        if (i2 == 0) {
            return 0;
        }
        if (this.o != 0) {
            try {
                if (this.n >= this.u) {
                    i(true);
                }
                int iA = this.l.a(bArr, i, i2);
                if (iA != -1) {
                    if (k()) {
                        this.t += (long) iA;
                    }
                    long j2 = iA;
                    this.n += j2;
                    this.m += j2;
                    long j3 = this.o;
                    if (j3 != -1) {
                        j3 -= j2;
                        this.o = j3;
                    }
                    if (j3 == 0 && this.s) {
                        j();
                    }
                } else {
                    if (!l()) {
                        j = this.o;
                        if (j <= 0) {
                        }
                        g();
                        i(false);
                        return a(bArr, i, i2);
                    }
                    long j4 = this.k.i;
                    if (j4 == -1 || this.m < j4) {
                        j();
                    } else {
                        j = this.o;
                        if (j <= 0 || j == -1) {
                            g();
                            i(false);
                            return a(bArr, i, i2);
                        }
                    }
                }
                return iA;
            } catch (IOException e) {
                if (this.k.i == -1) {
                    for (Throwable cause = e; cause != null; cause = cause.getCause()) {
                        if ((cause instanceof byf) && ((byf) cause).a == 2008) {
                            j();
                        }
                    }
                }
                h(e);
                throw e;
            } catch (Throwable th) {
                h(th);
                throw th;
            }
        }
        return -1;
    }

    @Override // defpackage.bye
    public final long b(byi byiVar) {
        int i;
        long jA;
        zgx zgxVar;
        try {
            String string = byiVar.j;
            if (string == null) {
                string = byiVar.a.toString();
            }
            byh byhVar = new byh(byiVar);
            byhVar.i = string;
            byi byiVarA = byhVar.a();
            this.j = byiVarA;
            jsk jskVar = this.b;
            Uri uri = byiVarA.a;
            Map map = ((jsv) jskVar.d(string)).b;
            String str = map.containsKey("exo_redir") ? new String((byte[]) map.get("exo_redir"), StandardCharsets.UTF_8) : null;
            Uri uri2 = str != null ? Uri.parse(str) : null;
            if (uri2 != null) {
                uri = uri2;
            }
            this.a = uri;
            long j = byiVar.h;
            this.n = j;
            Object obj = byiVar.l;
            if (obj instanceof ypq) {
                this.v = ((ypq) obj).f;
            }
            if (this.h && this.q) {
                i = 0;
            } else {
                i = (this.i && byiVar.i == -1) ? 1 : -1;
            }
            boolean z = i != -1;
            this.r = z;
            if (z && (zgxVar = this.f) != null) {
                zgxVar.b(i);
            }
            if (this.r) {
                this.o = -1L;
                jA = -1;
            } else {
                jA = jskVar.d(string).a();
                this.o = jA;
                if (jA != -1) {
                    jA -= j;
                    this.o = jA;
                    if (jA < 0) {
                        throw new byf(2008);
                    }
                }
            }
            long j2 = byiVar.i;
            if (j2 != -1) {
                jA = jA == -1 ? j2 : Math.min(jA, j2);
                this.o = jA;
            }
            if (jA > 0 || jA == -1) {
                i(false);
            }
            return j2 == -1 ? this.o : j2;
        } catch (Throwable th) {
            h(th);
            throw th;
        }
    }

    @Override // defpackage.bye
    public final Uri c() {
        return this.a;
    }

    @Override // defpackage.bye
    public final Map d() {
        return l() ? this.e.d() : Collections.EMPTY_MAP;
    }

    @Override // defpackage.bye
    public final void e(bzg bzgVar) {
        this.c.e(bzgVar);
        this.e.e(bzgVar);
    }

    @Override // defpackage.bye
    public final void f() throws IOException {
        this.j = null;
        this.a = null;
        if (this.f != null && this.t > 0) {
            try {
                this.b.a();
            } catch (Exception e) {
                this.f.a(e);
            }
            this.f.c(this.t);
            this.t = 0L;
        }
        try {
            g();
        } catch (IOException e2) {
            h(e2);
            throw e2;
        }
    }
}
