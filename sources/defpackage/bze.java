package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bze implements bye {
    public long a;
    public Uri b;
    public Map c;
    private final bye d;

    public bze(bye byeVar) {
        byeVar.getClass();
        this.d = byeVar;
        this.b = Uri.EMPTY;
        this.c = Collections.EMPTY_MAP;
    }

    @Override // defpackage.brv
    public final int a(byte[] bArr, int i, int i2) {
        int iA = this.d.a(bArr, i, i2);
        if (iA != -1) {
            this.a += (long) iA;
        }
        return iA;
    }

    @Override // defpackage.bye
    public final long b(byi byiVar) {
        this.b = byiVar.a;
        this.c = Collections.EMPTY_MAP;
        try {
            return this.d.b(byiVar);
        } finally {
            Uri uriC = c();
            if (uriC != null) {
                this.b = uriC;
            }
            this.c = d();
        }
    }

    @Override // defpackage.bye
    public final Uri c() {
        return this.d.c();
    }

    @Override // defpackage.bye
    public final Map d() {
        return this.d.d();
    }

    @Override // defpackage.bye
    public final void e(bzg bzgVar) {
        bzgVar.getClass();
        this.d.e(bzgVar);
    }

    @Override // defpackage.bye
    public final void f() {
        this.d.f();
    }
}
