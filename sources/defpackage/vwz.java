package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vwz implements vwx {
    private final agkj a;

    public vwz(Map map) {
        this.a = agkj.h(map);
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
        try {
            f(ajwoVar).c(ajwoVar, map);
        } catch (vxo unused) {
            ((agrc) ((agrc) vxa.a.b()).k("com/google/android/libraries/youtube/innertube/commands/CommandMappingFactory", "route", 338, "CommandMappingFactory.java")).w("Unknown command not resolved: %s", ajwoVar);
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

    @Override // defpackage.vwx
    public final vxc f(ajwo ajwoVar) {
        awmd awmdVar;
        vxc vxcVar;
        Object objC = vxg.c(ajwoVar);
        return (objC == null || (awmdVar = (awmd) this.a.get(objC.getClass())) == null || (vxcVar = (vxc) awmdVar.io()) == null) ? vxc.j : vxcVar;
    }
}
