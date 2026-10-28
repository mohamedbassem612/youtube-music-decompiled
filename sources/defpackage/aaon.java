package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aaon implements bye {
    private final bye a;

    public aaon(bye byeVar) {
        this.a = byeVar;
    }

    @Override // defpackage.brv
    public final int a(byte[] bArr, int i, int i2) {
        return this.a.a(bArr, i, i2);
    }

    @Override // defpackage.bye
    public final long b(byi byiVar) throws zie {
        if (tyu.i(byiVar.a)) {
            throw new zie();
        }
        return this.a.b(byiVar);
    }

    @Override // defpackage.bye
    public final Uri c() {
        return this.a.c();
    }

    @Override // defpackage.bye
    public final /* synthetic */ Map d() {
        return Collections.EMPTY_MAP;
    }

    @Override // defpackage.bye
    public final void e(bzg bzgVar) {
        this.a.e(bzgVar);
    }

    @Override // defpackage.bye
    public final void f() {
        this.a.f();
    }
}
