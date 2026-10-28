package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class sup implements rnv, svp {
    final vxe a;
    final ajwo b;
    private final sul c;

    public sup(vxe vxeVar, ajwo ajwoVar, sul sulVar) {
        this.a = vxeVar;
        this.b = ajwoVar;
        this.c = sulVar;
    }

    @Override // defpackage.rnv
    public final void a() {
        sul sulVar = this.c;
        if (sulVar != null) {
            sulVar.d();
        }
    }

    @Override // defpackage.rnv
    public final void b() {
        ajwo ajwoVar = this.b;
        if (ajwoVar != null) {
            HashMap map = new HashMap();
            map.put("PostTransactionCallback", this);
            this.a.c(ajwoVar, map);
        }
    }

    @Override // defpackage.svp
    public final void x(amax amaxVar) {
        sul sulVar = this.c;
        if (sulVar != null) {
            sulVar.f(amaxVar);
        }
    }

    @Override // defpackage.svp
    public final /* synthetic */ void P() {
    }

    @Override // defpackage.svp
    public final void v() {
    }
}
