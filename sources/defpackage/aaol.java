package defpackage;

import android.net.Uri;
import j$.util.Optional;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aaol implements bye {
    private final aamc a;
    private final bye b;
    private final vxz c;

    public aaol(aamc aamcVar, bye byeVar, vxz vxzVar) {
        this.a = aamcVar;
        this.b = byeVar;
        this.c = vxzVar;
    }

    @Override // defpackage.brv
    public final int a(byte[] bArr, int i, int i2) {
        return this.b.a(bArr, i, i2);
    }

    @Override // defpackage.bye
    public final long b(byi byiVar) {
        String str;
        long j = -1;
        if (byiVar.i != -1 || (str = byiVar.j) == null) {
            return this.b.b(byiVar);
        }
        aamc aamcVar = this.a;
        long jA = aamcVar.d(str).a();
        if (jA != -1) {
            j = jA;
        } else if (!aamcVar.g(str).isEmpty()) {
            jsp jspVar = (jsp) aamcVar.g(str).last();
            j = jspVar.c + jspVar.b;
        }
        byh byhVar = new byh();
        byhVar.a = byiVar.a;
        byhVar.g = byiVar.h;
        byhVar.h = j;
        byhVar.i = str;
        byhVar.j = byiVar.k;
        if (this.c.m(14, 45627566L)) {
            Object obj = tok.OFFLINE_PLAYER_CACHE_LENGTH_RESOLVER;
            Object obj2 = byiVar.l;
            if (obj2 instanceof ypq) {
                Optional optional = ((ypq) obj2).i;
                if (optional.isPresent()) {
                    obj = optional.get();
                }
            }
            ypp yppVarA = ypq.a();
            yppVarA.j((tok) obj);
            byhVar.k = yppVarA.a();
        }
        return this.b.b(byhVar.a());
    }

    @Override // defpackage.bye
    public final Uri c() {
        return ((jsn) this.b).a;
    }

    @Override // defpackage.bye
    public final Map d() {
        return this.b.d();
    }

    @Override // defpackage.bye
    public final void e(bzg bzgVar) {
        this.b.e(bzgVar);
    }

    @Override // defpackage.bye
    public final void f() {
        this.b.f();
    }
}
