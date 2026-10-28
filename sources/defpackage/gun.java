package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gun implements vxe {
    public vxe a = null;

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
        vxe vxeVar = this.a;
        if (vxeVar == null) {
            zvp.a(zvn.a, zvm.a, "Attempting to route command without a command router");
        } else {
            vxeVar.c(ajwoVar, map);
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
