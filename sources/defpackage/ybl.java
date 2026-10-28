package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ybl implements sxu {
    final /* synthetic */ sxu a;
    final /* synthetic */ aesp b;
    private final sxu c;

    public ybl(aesp aespVar, sxu sxuVar, sxu sxuVar2) {
        this.a = sxuVar2;
        this.b = aespVar;
        this.c = sxuVar;
    }

    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v5, types: [awmd, java.lang.Object] */
    @Override // defpackage.sxu
    public final /* synthetic */ void b(Object obj, Object obj2) {
        List<xvk> list = (List) obj2;
        if (list.isEmpty()) {
            this.a.b(null, Collections.EMPTY_LIST);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (xvk xvkVar : list) {
            if (!this.b.e.containsKey(xvkVar.b())) {
                arrayList.add(xvkVar.b());
            }
        }
        int i = 0;
        while (i < arrayList.size()) {
            int i2 = i + 6;
            int iMin = Math.min(arrayList.size(), i2);
            aesp aespVar = this.b;
            aespVar.e.putAll(((xwj) aespVar.i).b(arrayList.subList(i, iMin), 9));
            i = i2;
        }
        ArrayList arrayList2 = new ArrayList();
        for (xvk xvkVar2 : list) {
            xvh xvhVar = (xvh) this.b.e.get(xvkVar2.b());
            if (xvhVar != null) {
                xvb xvbVar = new xvb(xvkVar2.a);
                xvbVar.c(xvhVar);
                arrayList2.add(new xvk(xvbVar.a(), xvkVar2.b));
            }
        }
        aesp aespVar2 = this.b;
        Set setA = ((xwo) aespVar2.d).a((Collection) j$.util.Collection.EL.stream(arrayList2).map(new xjh(15)).collect(aghu.a), ((vxz) aespVar2.g).l(102, 45478146L, false) ? tok.MDX_PAIRING_URL_BUILDER_CLOUD_SCREEN_BACKGROUND_REFRESH : tok.MDX_PAIRING_URL_BUILDER_CLOUD_SCREEN_UI_HANDLER_REFRESH);
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList2.size();
        for (int i3 = 0; i3 < size; i3++) {
            xvk xvkVar3 = (xvk) arrayList2.get(i3);
            if (setA.contains(xvkVar3.a)) {
                arrayList3.add(xvkVar3);
            }
        }
        yco ycoVar = ((ycp) aespVar2.b.io()).e;
        if (ycoVar != null && ycoVar.b() != 0 && (ycoVar.j() instanceof xvk) && !arrayList3.contains(ycoVar.j())) {
            arrayList3.add((xvk) ycoVar.j());
        }
        this.a.b(null, arrayList3);
    }

    @Override // defpackage.sxu
    public final /* bridge */ /* synthetic */ void iT(Object obj, Exception exc) {
        sxu sxuVar = this.c;
        if (sxuVar != null) {
            sxuVar.iT(null, exc);
        }
    }
}
