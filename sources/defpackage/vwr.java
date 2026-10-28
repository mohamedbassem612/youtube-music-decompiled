package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vwr implements vxe {
    public final vwx a;
    private final vwu b;
    private volatile boolean c = false;

    public vwr(vwx vwxVar, vxe vxeVar) {
        if (!(vxeVar instanceof vxf)) {
            throw new IllegalStateException();
        }
        vxe vxeVarF = ((vxf) vxeVar).f();
        if (!(vxeVarF instanceof vwu)) {
            throw new IllegalStateException();
        }
        this.b = (vwu) vxeVarF;
        this.a = vwxVar;
    }

    @Override // defpackage.vxe
    public final /* synthetic */ void a(ajwo ajwoVar) {
        yno.eB(this, ajwoVar);
    }

    @Override // defpackage.vxe
    public final /* synthetic */ void b(List list) {
        yno.eC(this, list);
    }

    @Override // defpackage.vxe
    public final void c(ajwo ajwoVar, Map map) {
        if (!this.c) {
            this.c = true;
        }
        vwx vwxVar = this.a;
        if (yno.eG(vwxVar, ajwoVar)) {
            vwxVar.c(ajwoVar, map);
        } else {
            this.b.b.c(ajwoVar, map);
        }
    }

    @Override // defpackage.vxe
    public final /* synthetic */ void d(List list, Map map) {
        yno.eD(this, list, map);
    }

    @Override // defpackage.vxe
    public final /* synthetic */ void e(List list, Object obj) {
        yno.eE(this, list, obj);
    }
}
