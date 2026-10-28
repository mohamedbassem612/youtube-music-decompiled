package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aaee implements vxc {
    private final zzf a;
    private final vxe b;

    public aaee(zzf zzfVar, vxe vxeVar) {
        zzfVar.getClass();
        vxeVar.getClass();
        this.a = zzfVar;
        this.b = vxeVar;
    }

    @Override // defpackage.vxc
    public final void a(ajwo ajwoVar) {
        throw null;
    }

    @Override // defpackage.vxc
    public final /* synthetic */ boolean b() {
        return true;
    }

    @Override // defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        Object next;
        ajwoVar.getClass();
        aihl aihlVar = aobn.b;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        ajwoVar.c(aihlVarCheckIsLite);
        if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
            ajwoVar.c(aihlVarCheckIsLite2);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
            Object objC = objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK);
            objC.getClass();
            aobn aobnVar = (aobn) objC;
            aobh aobhVar = this.a.c;
            aiie aiieVar = aobnVar.d;
            aiieVar.getClass();
            Iterator<E> it = aiieVar.iterator();
            loop0: while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                aobp aobpVar = (aobp) next;
                aobpVar.getClass();
                aobhVar.getClass();
                if (aobpVar.c.isEmpty()) {
                    break;
                }
                aiie<aobo> aiieVar2 = aobpVar.c;
                aiieVar2.getClass();
                if (!aiieVar2.isEmpty()) {
                    for (aobo aoboVar : aiieVar2) {
                        aoboVar.getClass();
                        if (aoboVar.c.size() == 0 || new aihx(aoboVar.c, aobo.a).contains(aobhVar)) {
                            break loop0;
                        }
                    }
                }
            }
            aobp aobpVar2 = (aobp) next;
            if (aobpVar2 != null) {
                if ((aobpVar2.b & 1) != 0) {
                    vxe vxeVar = this.b;
                    ajwo ajwoVar2 = aobpVar2.d;
                    if (ajwoVar2 == null) {
                        ajwoVar2 = ajwo.a;
                    }
                    vxeVar.c(ajwoVar2, map);
                    return;
                }
                return;
            }
            if ((aobnVar.c & 1) != 0) {
                vxe vxeVar2 = this.b;
                ajwo ajwoVar3 = aobnVar.e;
                if (ajwoVar3 == null) {
                    ajwoVar3 = ajwo.a;
                }
                vxeVar2.c(ajwoVar3, map);
            }
        }
    }
}
