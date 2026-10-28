package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aekr extends adsv implements aeks {
    public final adlq a;
    private final List b;

    public aekr(aqsj aqsjVar, Context context, vxe vxeVar) {
        aqso aqsoVar;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        adlq adlqVar = new adlq(false);
        this.a = adlqVar;
        aqsp aqspVar = aqsjVar.c;
        if ((aqspVar == null ? aqsp.a : aqspVar).b == 92759253) {
            aqsp aqspVar2 = aqsjVar.c;
            aqspVar2 = aqspVar2 == null ? aqsp.a : aqspVar2;
            aqsoVar = aqspVar2.b == 92759253 ? (aqso) aqspVar2.c : aqso.a;
        } else {
            aqsoVar = null;
        }
        if (aqsoVar != null) {
            aekt aektVar = new aekt(aqsoVar, context, vxeVar);
            arrayList.add(aektVar);
            adlqVar.m(-1, aektVar.c, true);
        }
    }

    @Override // defpackage.advc
    public final adkz a() {
        return this.a;
    }

    @Override // defpackage.aeks
    public final void b(List list) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        List list2 = this.b;
        arrayList.addAll(list2);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            ((aeks) it.next()).b(arrayList);
        }
    }

    @Override // defpackage.aeks
    public final void c(admh admhVar) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((aeks) it.next()).c(admhVar);
        }
    }
}
