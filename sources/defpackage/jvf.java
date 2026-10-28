package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jvf extends bxw implements byw {
    private static final Pattern b = Pattern.compile("(^|&)rn=[0-9]+");
    private final byw c;
    private final long d;
    private final int e;
    private long f;
    private Uri g;
    private byi h;
    private Uri i;
    private long j;
    private boolean k;
    private final jvh l;

    public jvf(byw bywVar, int i, long j, jvh jvhVar) {
        super(true);
        this.c = bywVar;
        this.e = i;
        this.d = j;
        this.l = jvhVar;
    }

    private final void n() {
        this.i = null;
        this.j = 0L;
    }

    private final void o() {
        this.i = null;
        this.j = 0L;
    }

    @Override // defpackage.brv
    public final int a(byte[] bArr, int i, int i2) throws byt {
        try {
            int i3 = this.e;
            if (i3 > 0) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f;
                if (jElapsedRealtime > i3) {
                    byi byiVar = this.h;
                    byiVar.getClass();
                    throw new jve(byiVar, jElapsedRealtime);
                }
            }
            int iA = this.c.a(bArr, i, i2);
            if (iA != -1) {
                g(iA);
            }
            return iA;
        } catch (byt e) {
            o();
            throw e;
        }
    }

    @Override // defpackage.bye
    public final long b(byi byiVar) throws byt {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f = jElapsedRealtime;
        if (this.i != null && jElapsedRealtime - this.j > this.d) {
            n();
        }
        Uri uri = byiVar.a;
        if (!uri.equals(this.g)) {
            n();
            this.g = uri;
        }
        Uri uri2 = this.i;
        if (uri2 != null) {
            uri = uri2;
        }
        jvh jvhVar = this.l;
        String encodedQuery = uri.getEncodedQuery();
        String strCl = "rn=" + jvhVar.a();
        if (encodedQuery != null) {
            Matcher matcher = b.matcher(encodedQuery);
            if (matcher.find()) {
                strCl = matcher.replaceFirst("$1".concat(strCl));
            } else if (!encodedQuery.isEmpty()) {
                strCl = a.cl(strCl, (byte) 38, encodedQuery);
            }
        }
        byi byiVarC = byiVar.c(uri.buildUpon().encodedQuery(strCl).build());
        i(byiVarC);
        this.h = byiVarC;
        try {
            byw bywVar = this.c;
            long jB = bywVar.b(byiVarC);
            if (this.i == null) {
                this.i = bywVar.c();
                this.j = SystemClock.elapsedRealtime();
            }
            j(byiVarC);
            this.k = true;
            return jB;
        } catch (byt e) {
            o();
            throw e;
        }
    }

    @Override // defpackage.bye
    public final Uri c() {
        return this.c.c();
    }

    @Override // defpackage.bxw, defpackage.bye
    public final Map d() {
        return this.c.d();
    }

    @Override // defpackage.bye
    public final void f() {
        try {
            try {
                this.c.f();
                if (this.k) {
                    h();
                    this.k = false;
                }
            } catch (byt e) {
                o();
                throw e;
            }
        } catch (Throwable th) {
            if (this.k) {
                h();
                this.k = false;
            }
            throw th;
        }
    }

    @Override // defpackage.byw
    public final int k() {
        return this.c.k();
    }

    @Override // defpackage.byw
    public final void l() {
        this.c.l();
    }

    @Override // defpackage.byw
    public final void m(String str, String str2) {
        this.c.m(str, str2);
    }
}
