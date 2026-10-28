package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vwy implements vwx {
    final /* synthetic */ vxa a;
    private final agke b;

    public vwy(vxa vxaVar, agke agkeVar) {
        this.a = vxaVar;
        this.b = agkeVar;
    }

    public static final boolean g(vxc vxcVar, ajwo ajwoVar, Map map) {
        try {
            vxcVar.c(ajwoVar, map);
            return true;
        } catch (vxo e) {
            ((agrc) ((agrc) ((agrc) vxa.a.b()).j(e)).k("com/google/android/libraries/youtube/innertube/commands/CommandMappingFactory$InOrderCommandMapping", "tryResolve", (char) 203, "CommandMappingFactory.java")).t("CommandResolver threw exception during resolution");
            return false;
        }
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
        ajwo ajwoVar2;
        Map map2;
        if (ajwoVar != null) {
            agke agkeVar = this.b;
            int size = agkeVar.size();
            int i = 0;
            while (i < size) {
                vxc vxcVarF = ((vwx) agkeVar.get(i)).f(ajwoVar);
                if (vxcVarF == vxc.j) {
                    ajwoVar2 = ajwoVar;
                    map2 = map;
                } else {
                    if (!a.x() && vxcVarF.b()) {
                        vxa vxaVar = this.a;
                        vxaVar.b.execute(afwl.i(new vwh(vxcVarF, ajwoVar, map, 3, (char[]) null)));
                        return;
                    }
                    ajwoVar2 = ajwoVar;
                    map2 = map;
                    if (g(vxcVarF, ajwoVar2, map2)) {
                        return;
                    }
                }
                i++;
                ajwoVar = ajwoVar2;
                map = map2;
            }
            ((agrc) ((agrc) vxa.a.c()).k("com/google/android/libraries/youtube/innertube/commands/CommandMappingFactory$InOrderCommandMapping", "internalResolveCommand", 188, "CommandMappingFactory.java")).w("Unknown command not resolved %s", ajwoVar);
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
        if (vxg.c(ajwoVar) != null) {
            agke agkeVar = this.b;
            int size = agkeVar.size();
            int i = 0;
            while (i < size) {
                vxc vxcVarF = ((vwx) agkeVar.get(i)).f(ajwoVar);
                i++;
                if (vxcVarF != vxc.j) {
                    return vxcVarF;
                }
            }
        }
        return vxc.j;
    }
}
