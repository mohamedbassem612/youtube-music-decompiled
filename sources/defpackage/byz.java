package defpackage;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class byz implements bye {
    private final bye a;
    private final int b;
    private final tgr c;

    public byz(bye byeVar, tgr tgrVar, int i) {
        this.a = byeVar;
        this.c = tgrVar;
        this.b = i;
    }

    @Override // defpackage.brv
    public final int a(byte[] bArr, int i, int i2) {
        this.c.f(this.b);
        return this.a.a(bArr, i, i2);
    }

    @Override // defpackage.bye
    public final long b(byi byiVar) {
        this.c.f(this.b);
        return this.a.b(byiVar);
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
        this.a.f();
    }
}
