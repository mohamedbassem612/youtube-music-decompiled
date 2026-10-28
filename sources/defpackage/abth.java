package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abth implements bye {
    public final tgr a;
    private final byz b;

    public abth(bye byeVar, tgr tgrVar) {
        this.b = new byz(byeVar, tgrVar, 0);
        this.a = tgrVar;
    }

    private final void g() {
        new abtf(this).start();
    }

    @Override // defpackage.brv
    public final int a(byte[] bArr, int i, int i2) {
        return this.b.a(bArr, i, i2);
    }

    @Override // defpackage.bye
    public final long b(byi byiVar) {
        this.a.d(0);
        return this.b.b(byiVar);
    }

    @Override // defpackage.bye
    public final Uri c() {
        return this.b.c();
    }

    @Override // defpackage.bye
    public final /* synthetic */ Map d() {
        return Collections.EMPTY_MAP;
    }

    @Override // defpackage.bye
    public final void e(bzg bzgVar) {
        this.b.e(bzgVar);
    }

    @Override // defpackage.bye
    public final void f() {
        try {
            this.b.f();
        } finally {
            g();
        }
    }
}
