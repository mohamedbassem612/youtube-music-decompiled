package defpackage;

import android.net.Uri;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bzp implements bye {
    private final bzk a;
    private final bye b;
    private final bye c;
    private final bye d;
    private Uri e;
    private byi f;
    private byi g;
    private bye h;
    private long i;
    private long j;
    private long k;
    private bzr l;
    private long m;
    private long n;

    public bzp(bzk bzkVar, bye byeVar, bye byeVar2, byc bycVar) {
        this.a = bzkVar;
        this.b = byeVar2;
        bzf bzfVar = null;
        if (byeVar != null) {
            this.d = byeVar;
            if (bycVar != null) {
                bzfVar = new bzf(byeVar, bycVar);
            }
        } else {
            this.d = byy.a;
        }
        this.c = bzfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void g() {
        bye byeVar = this.h;
        if (byeVar != null) {
            try {
                byeVar.f();
            } finally {
                this.g = null;
                this.h = null;
                bzr bzrVar = this.l;
                if (bzrVar != null) {
                    this.a.e(bzrVar);
                    this.l = null;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, java.util.Map] */
    private final void h(byi byiVar, boolean z) {
        byi byiVarA;
        bye byeVar;
        int i = bwp.a;
        bzk bzkVar = this.a;
        String str = byiVar.j;
        bzr bzrVarA = bzkVar.a(str, this.j, this.k);
        if (bzrVarA == null) {
            byeVar = this.d;
            byh byhVar = new byh(byiVar);
            byhVar.g = this.j;
            byhVar.h = this.k;
            byiVarA = byhVar.a();
        } else if (bzrVarA.d) {
            File file = bzrVarA.e;
            long j = bzrVarA.b;
            Uri uriFromFile = Uri.fromFile(file);
            long j2 = this.j - j;
            long j3 = bzrVarA.c;
            long j4 = this.k;
            long jMin = j3 - j2;
            if (j4 != -1) {
                jMin = Math.min(jMin, j4);
            }
            byh byhVar2 = new byh(byiVar);
            byhVar2.a = uriFromFile;
            byhVar2.b = j;
            byhVar2.g = j2;
            byhVar2.h = jMin;
            byiVarA = byhVar2.a();
            byeVar = this.b;
        } else {
            long jMin2 = bzrVarA.c;
            long j5 = this.k;
            if (jMin2 == -1) {
                jMin2 = j5;
            } else if (j5 != -1) {
                jMin2 = Math.min(jMin2, j5);
            }
            byh byhVar3 = new byh(byiVar);
            byhVar3.g = this.j;
            byhVar3.h = jMin2;
            byiVarA = byhVar3.a();
            bye byeVar2 = this.c;
            if (byeVar2 == null) {
                byeVar2 = this.d;
                bzkVar.e(bzrVarA);
                bzrVarA = null;
            }
            byeVar = byeVar2;
        }
        bye byeVar3 = this.d;
        this.n = byeVar == byeVar3 ? this.j + 102400 : Long.MAX_VALUE;
        if (z) {
            ahno.O(this.h == byeVar3);
            if (byeVar == byeVar3) {
                return;
            }
            try {
                g();
            } catch (Throwable th) {
                if (bzrVarA.b()) {
                    this.a.e(bzrVarA);
                }
                throw th;
            }
        }
        if (bzrVarA != null && bzrVarA.b()) {
            this.l = bzrVarA;
        }
        this.h = byeVar;
        this.g = byiVarA;
        this.i = 0L;
        long jB = byeVar.b(byiVarA);
        eol eolVar = new eol((char[]) null);
        if (byiVarA.i == -1 && jB != -1) {
            this.k = jB;
            eolVar.i(this.j + jB);
        }
        if (j()) {
            this.e = byeVar.c();
            Uri uri = byiVar.a.equals(this.e) ? null : this.e;
            if (uri == null) {
                eolVar.b.add("exo_redir");
                eolVar.a.remove("exo_redir");
            } else {
                eolVar.h("exo_redir", uri.toString());
            }
        }
        if (k()) {
            this.a.g(str, eolVar);
        }
    }

    private final boolean i() {
        return this.h == this.b;
    }

    private final boolean j() {
        return !i();
    }

    private final boolean k() {
        return this.h == this.c;
    }

    @Override // defpackage.brv
    public final int a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (this.k == 0) {
            return -1;
        }
        byi byiVar = this.f;
        byiVar.getClass();
        byi byiVar2 = this.g;
        byiVar2.getClass();
        if (this.j >= this.n) {
            h(byiVar, true);
        }
        bye byeVar = this.h;
        byeVar.getClass();
        int iA = byeVar.a(bArr, i, i2);
        if (iA != -1) {
            if (i()) {
                this.m += (long) iA;
            }
            long j = iA;
            this.j += j;
            this.i += j;
            long j2 = this.k;
            if (j2 != -1) {
                this.k = j2 - j;
            }
        } else {
            if (j()) {
                long j3 = byiVar2.i;
                if (j3 == -1 || this.i < j3) {
                    String str = byiVar.j;
                    int i3 = bwp.a;
                    this.k = 0L;
                    if (k()) {
                        eol eolVar = new eol((char[]) null);
                        eolVar.i(this.j);
                        this.a.g(str, eolVar);
                    }
                }
            }
            long j4 = this.k;
            if (j4 > 0 || j4 == -1) {
                g();
                h(byiVar, false);
                return a(bArr, i, i2);
            }
        }
        return iA;
    }

    @Override // defpackage.bye
    public final long b(byi byiVar) throws byf {
        String string = byiVar.j;
        if (string == null) {
            string = byiVar.a.toString();
        }
        byh byhVar = new byh(byiVar);
        byhVar.i = string;
        byi byiVarA = byhVar.a();
        this.f = byiVarA;
        bzk bzkVar = this.a;
        Uri uri = byiVarA.a;
        byte[] bArr = (byte[]) ((bzy) bzkVar.b(string)).b.get("exo_redir");
        String str = bArr != null ? new String(bArr, StandardCharsets.UTF_8) : null;
        Uri uri2 = str != null ? Uri.parse(str) : null;
        if (uri2 != null) {
            uri = uri2;
        }
        this.e = uri;
        long j = byiVar.h;
        this.j = j;
        long jA = bzkVar.b(string).a();
        this.k = jA;
        if (jA != -1) {
            jA -= j;
            this.k = jA;
            if (jA < 0) {
                throw new byf(2008);
            }
        }
        long j2 = byiVar.i;
        if (j2 != -1) {
            jA = jA == -1 ? j2 : Math.min(jA, j2);
            this.k = jA;
        }
        if (jA > 0 || jA == -1) {
            h(byiVarA, false);
        }
        return j2 == -1 ? this.k : j2;
    }

    @Override // defpackage.bye
    public final Uri c() {
        return this.e;
    }

    @Override // defpackage.bye
    public final Map d() {
        return j() ? this.d.d() : Collections.EMPTY_MAP;
    }

    @Override // defpackage.bye
    public final void e(bzg bzgVar) {
        bzgVar.getClass();
        this.b.e(bzgVar);
        this.d.e(bzgVar);
    }

    @Override // defpackage.bye
    public final void f() {
        this.f = null;
        this.e = null;
        this.j = 0L;
        g();
    }
}
