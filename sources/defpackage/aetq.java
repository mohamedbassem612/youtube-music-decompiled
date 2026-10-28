package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aetq implements vxc {
    private final aety a;
    private final boolean b;

    public aetq(aety aetyVar, boolean z) {
        this.a = aetyVar;
        this.b = z;
    }

    @Override // defpackage.vxc
    public final /* synthetic */ boolean b() {
        return true;
    }

    @Override // defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        Object objC;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(araa.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        araa araaVar = (araa) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        if (this.b && araaVar.e) {
            aety aetyVar = this.a;
            String str = araaVar.d;
            if (aetyVar.g.g() && ((aett) aetyVar.g.c()).a.equals(str)) {
                aetyVar.a();
                return;
            }
            return;
        }
        aety aetyVar2 = this.a;
        String str2 = araaVar.d;
        if (!aetyVar2.g.g()) {
            jmu jmuVar = aetyVar2.h;
            jmuVar.d = jmuVar.e.y().L(jmuVar.a).al(new jgq(jmuVar, 5), new jeh(9));
            aetyVar2.g = agev.i(new aett(aetyVar2.b, aetyVar2.e, aetyVar2.f, str2, aetyVar2.c, aetyVar2.d));
            objC = aetyVar2.g.c();
        } else if (((aett) aetyVar2.g.c()).a.equals(str2)) {
            objC = aetyVar2.g.c();
        } else {
            ((aett) aetyVar2.g.c()).a();
            jmu jmuVar2 = aetyVar2.h;
            jmuVar2.d = jmuVar2.e.y().L(jmuVar2.a).al(new jgq(jmuVar2, 5), new jeh(9));
            aetyVar2.g = agev.i(new aett(aetyVar2.b, aetyVar2.e, aetyVar2.f, str2, aetyVar2.c, aetyVar2.d));
            objC = aetyVar2.g.c();
        }
        aett aettVar = (aett) objC;
        aettVar.k = araaVar.g.G();
        long j = (araaVar.c & 4) != 0 ? araaVar.f : 5000L;
        if (aettVar.i) {
            return;
        }
        aettVar.b(j);
        aettVar.i = true;
    }

    @Override // defpackage.vxc
    public final /* synthetic */ void a(ajwo ajwoVar) {
    }
}
