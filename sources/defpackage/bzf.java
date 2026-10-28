package defpackage;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bzf implements bye {
    private final bye a;
    private final byc b;
    private boolean c;
    private long d;

    public bzf(bye byeVar, byc bycVar) {
        this.a = byeVar;
        this.b = bycVar;
    }

    @Override // defpackage.brv
    public final int a(byte[] bArr, int i, int i2) {
        if (this.d == 0) {
            return -1;
        }
        int iA = this.a.a(bArr, i, i2);
        if (iA > 0) {
            this.b.c(bArr, i, iA);
            long j = this.d;
            if (j != -1) {
                this.d = j - ((long) iA);
            }
        }
        return iA;
    }

    @Override // defpackage.bye
    public final long b(byi byiVar) {
        long jB = this.a.b(byiVar);
        this.d = jB;
        if (jB == 0) {
            return 0L;
        }
        if (byiVar.i == -1 && jB != -1) {
            byiVar = byiVar.b(0L, jB);
        }
        this.c = true;
        this.b.b(byiVar);
        return this.d;
    }

    @Override // defpackage.bye
    public final Uri c() {
        return this.a.c();
    }

    @Override // defpackage.bye
    public final Map d() {
        return this.a.d();
    }

    @Override // defpackage.bye
    public final void e(bzg bzgVar) {
        bzgVar.getClass();
        this.a.e(bzgVar);
    }

    @Override // defpackage.bye
    public final void f() {
        try {
            this.a.f();
        } finally {
            if (this.c) {
                this.c = false;
                this.b.a();
            }
        }
    }
}
