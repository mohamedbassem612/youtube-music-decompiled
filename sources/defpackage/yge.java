package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yge implements bye {
    private final bye a;
    private final bye b;
    private final zjr c;
    private String d;
    private long e = -1;

    public yge(bye byeVar, bye byeVar2, zjr zjrVar) {
        this.a = byeVar;
        this.b = byeVar2;
        this.c = zjrVar;
    }

    @Override // defpackage.brv
    public final int a(byte[] bArr, int i, int i2) {
        return this.a.a(bArr, i, i2);
    }

    @Override // defpackage.bye
    public final long b(byi byiVar) {
        String str = byiVar.j;
        long j = -1;
        if (byiVar.i == -1 && str != null) {
            long j2 = str.equals(this.d) ? this.e : -1L;
            if (j2 == -1) {
                byh byhVar = new byh();
                byhVar.a = byiVar.a;
                byhVar.g = 0L;
                byhVar.h = -1L;
                byhVar.d = 3;
                byhVar.i = null;
                byhVar.j = 4;
                if (this.c.cI()) {
                    ypp yppVarA = ypq.a();
                    yppVarA.j(tok.MEDIA_CACHE_LENGTH_RESOLVER);
                    byhVar.k = yppVarA.a();
                }
                try {
                    bye byeVar = this.b;
                    long jB = byeVar.b(byhVar.a());
                    byeVar.f();
                    j = jB;
                } catch (IOException e) {
                    zhr.c(zhq.CACHE, e, "Unable to resolve content-length", new Object[0]);
                }
                if (j > 0) {
                    this.d = str;
                    this.e = j;
                }
                j2 = j;
            }
            byh byhVar2 = new byh(byiVar);
            byhVar2.h = j2;
            if (this.c.cI()) {
                Object objA = byiVar.l;
                if (objA instanceof ypq) {
                    ypq ypqVar = (ypq) objA;
                    if (ypqVar.i.isEmpty()) {
                        ypp yppVar = new ypp(ypqVar);
                        yppVar.j(tok.MEDIA_CACHE_LENGTH_RESOLVER);
                        objA = yppVar.a();
                    }
                } else {
                    ypp yppVarA2 = ypq.a();
                    yppVarA2.j(tok.MEDIA_CACHE_LENGTH_RESOLVER);
                    objA = yppVarA2.a();
                }
                byhVar2.k = objA;
            }
            byiVar = byhVar2.a();
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
