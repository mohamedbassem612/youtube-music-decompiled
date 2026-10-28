package defpackage;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bxs implements bye {
    private final bye a;
    private final byte[] b;
    private bxt c;

    public bxs(byte[] bArr, bye byeVar) {
        this.a = byeVar;
        this.b = bArr;
    }

    @Override // defpackage.brv
    public final int a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int iA = this.a.a(bArr, i, i2);
        if (iA == -1) {
            return -1;
        }
        bxt bxtVar = this.c;
        int i3 = bwp.a;
        bxtVar.a(bArr, i, iA, bArr, i);
        return iA;
    }

    @Override // defpackage.bye
    public final long b(byi byiVar) {
        long jB = this.a.b(byiVar);
        this.c = new bxt(2, this.b, byiVar.j, byiVar.h + byiVar.b);
        return jB;
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
        this.c = null;
        this.a.f();
    }
}
