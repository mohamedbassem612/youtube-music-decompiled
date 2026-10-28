package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gtx extends gut {
    private final hea a;
    private final hcb b;

    public gtx(hcb hcbVar, hea heaVar) {
        this.b = hcbVar;
        this.a = heaVar;
    }

    private final void d(List list, List list2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            anop anopVar = (anop) this.b.b((String) it.next(), anop.class);
            if (anopVar != null) {
                boolean zBooleanValue = anopVar.getSelected().booleanValue();
                String opaqueToken = anopVar.getOpaqueToken();
                if (zBooleanValue) {
                    list2.add(opaqueToken);
                }
            }
        }
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(anpd.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        anpd anpdVar = (anpd) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        ArrayList arrayList = new ArrayList();
        if ((anpdVar.c & 16) != 0) {
            hea heaVar = this.a;
            heaVar.f = ajwoVar;
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(anpd.b);
            ajwoVar.c(aihlVarCheckIsLite2);
            Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite2.d);
            anpd anpdVar2 = (anpd) (objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2));
            if (heaVar.c == null) {
                heaVar.c = new hdz();
                avlr.Y(avlr.o(heaVar.c)).ag(new hbr(heaVar, 15), new hbr(heaVar, 16));
            }
            hdz hdzVar = heaVar.c;
            if (hdzVar != null) {
                anpc anpcVar = anpdVar2.h;
                if (anpcVar == null) {
                    anpcVar = anpc.a;
                }
                aiie aiieVar = anpcVar.b;
                anpc anpcVar2 = anpdVar2.h;
                String str = (anpcVar2 == null ? anpc.a : anpcVar2).c;
                if (anpcVar2 == null) {
                    anpcVar2 = anpc.a;
                }
                int iAS = a.aS(anpcVar2.d);
                if (iAS == 0) {
                    iAS = 1;
                }
                hdzVar.b(avlr.o(new hdy(heaVar, aiieVar, str, iAS, anpdVar2.g)));
                return;
            }
            return;
        }
        String str2 = anpdVar.d;
        hcb hcbVar = this.b;
        anos anosVar = (anos) hcbVar.b(str2, anos.class);
        if (anosVar != null) {
            d(anosVar.e(), arrayList);
            Iterator it = anosVar.f().iterator();
            while (it.hasNext()) {
                anov anovVar = (anov) hcbVar.b((String) it.next(), anov.class);
                if (anovVar != null) {
                    d(anovVar.e(), arrayList);
                }
            }
            hea heaVar2 = this.a;
            String str3 = anpdVar.f;
            String str4 = anpdVar.e;
            String str5 = anpdVar.g;
            heaVar2.d = str3;
            heaVar2.e = str4;
            heaVar2.b(anvx.MUSIC_RADIO_BUILDER_BUTTON_STATE_SHOWING_LOADING_SPINNER);
            if (heaVar2.c == null) {
                heaVar2.c = new hdz();
                avlr.Y(avlr.o(heaVar2.c)).ag(new hbr(heaVar2, 15), new hbr(heaVar2, 16));
            }
            hdz hdzVar2 = heaVar2.c;
            if (hdzVar2 != null) {
                hdzVar2.b(avlr.o(new hdy(heaVar2, arrayList, null, 0, str5)));
            }
        }
    }
}
