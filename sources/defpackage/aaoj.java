package defpackage;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aaoj implements bye {
    private final agfr a;

    public aaoj(final aadc aadcVar, final adgf adgfVar, final zho zhoVar, final bye byeVar, final boolean z, final vxz vxzVar) {
        this.a = aguu.al(new agfr() { // from class: aaoi
            @Override // defpackage.agfr
            public final Object io() {
                aaon aaonVar = new aaon(byeVar);
                bye aaolVar = aaonVar;
                for (aamc aamcVar : aadcVar.i()) {
                    boolean z2 = z;
                    jsn jsnVar = new jsn(aamcVar, aaolVar, adgfVar.a(new jsx("Offline")), null, z2 ? 12 : 4, zhoVar);
                    aaolVar = z2 ? new aaol(aamcVar, jsnVar, vxzVar) : jsnVar;
                }
                return aaolVar;
            }
        });
    }

    @Override // defpackage.brv
    public final int a(byte[] bArr, int i, int i2) {
        return ((bye) this.a.io()).a(bArr, i, i2);
    }

    @Override // defpackage.bye
    public final long b(byi byiVar) {
        return ((bye) this.a.io()).b(byiVar);
    }

    @Override // defpackage.bye
    public final Uri c() {
        return ((bye) this.a.io()).c();
    }

    @Override // defpackage.bye
    public final Map d() {
        return ((bye) this.a.io()).d();
    }

    @Override // defpackage.bye
    public final void e(bzg bzgVar) {
        ((bye) this.a.io()).e(bzgVar);
    }

    @Override // defpackage.bye
    public final void f() {
        ((bye) this.a.io()).f();
    }
}
