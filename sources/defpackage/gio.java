package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gio implements abpf {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public gio(giq giqVar, int i) {
        this.$cid = i;
        this.a = giqVar;
    }

    @Override // defpackage.abpf
    public final abpg a(abnl abnlVar, abnp abnpVar, String str) {
        int i = this.$cid;
        Object obj = this.a;
        if (i != 0) {
            giq giqVar = (giq) obj;
            ght ghtVar = giqVar.a;
            mbc mbcVar = (mbc) ghtVar.l.io();
            gil gilVar = (gil) giqVar.b;
            return new abpg(mbcVar, (abpd) gilVar.J.io(), (abrg) ghtVar.gN.io(), gilVar.A(), (Set) ghtVar.gP.io(), (vxz) ghtVar.cM.io(), abnlVar, abnpVar, str);
        }
        giq giqVar2 = (giq) obj;
        ght ghtVar2 = giqVar2.a;
        mbc mbcVar2 = (mbc) ghtVar2.l.io();
        gir girVar = (gir) giqVar2.b;
        return new abpg(mbcVar2, (abpd) girVar.B.io(), (abrg) ghtVar2.gN.io(), girVar.f(), (Set) ghtVar2.gP.io(), (vxz) ghtVar2.cM.io(), abnlVar, abnpVar, str);
    }
}
