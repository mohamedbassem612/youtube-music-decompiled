package defpackage;

import j$.util.Collection;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vkc implements usx {
    private final aaok a;
    private final xpl b;

    public vkc(aaok aaokVar, xpl xplVar) {
        this.a = aaokVar;
        this.b = xplVar;
    }

    @Override // defpackage.usx
    public final auhs a(auhs auhsVar) {
        int i;
        boolean zM = ((vxz) this.b.b).m(2, 45662094L);
        boolean zM2 = ((vxz) this.a.b).m(346, 45683315L);
        int i2 = 0;
        boolean z = zM && zM2;
        List list = auhsVar.d;
        if (!z) {
            list = (List) Collection.EL.stream(list).filter(new vka(zM, zM2, i2)).collect(aghu.a);
        }
        if (zM2) {
            list = (List) Collection.EL.stream(list).filter(new uvm(9)).collect(aghu.a);
        }
        Stream map = Collection.EL.stream(list).map(new vkb());
        Collector collector = aghu.a;
        List list2 = (List) Collection.EL.stream((List) map.collect(collector)).map(new uot(usj.l(auhsVar), 16)).collect(collector);
        auhq auhqVar = (auhq) auhsVar.toBuilder();
        auhqVar.copyOnWrite();
        ((auhs) auhqVar.instance).d = auhs.emptyProtobufList();
        auhqVar.b(list2);
        auhs auhsVarJ = (auhs) auhqVar.build();
        for (augy augyVar : auhsVarJ.d) {
            if ((augyVar.b & 1) != 0) {
                if ((augyVar.c == 107 ? (auhv) augyVar.d : auhv.a).c == 2 || (i = augyVar.c) == 102 || i == 103) {
                    auhsVarJ = usj.j(auhsVarJ, augyVar.e, new uot(vjw.a(augyVar), 17));
                }
            }
        }
        return auhsVarJ;
    }
}
