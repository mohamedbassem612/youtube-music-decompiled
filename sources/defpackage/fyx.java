package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fyx extends fys implements fyu {
    protected final List a;
    protected final List b;
    protected kwq c;

    public fyx(String str, List list, List list2, kwq kwqVar) {
        super(str);
        this.a = new ArrayList();
        this.c = kwqVar;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.a.add(((fyy) it.next()).i());
            }
        }
        this.b = new ArrayList(list2);
    }

    @Override // defpackage.fys
    public final fyy a(kwq kwqVar, List list) {
        kwq kwqVarF = this.c.F();
        int i = 0;
        while (true) {
            List list2 = this.a;
            if (i >= list2.size()) {
                break;
            }
            if (i < list.size()) {
                kwqVarF.y((String) list2.get(i), kwqVar.v((fyy) list.get(i)));
            } else {
                kwqVarF.y((String) list2.get(i), f);
            }
            i++;
        }
        for (fyy fyyVar : this.b) {
            fyy fyyVarV = kwqVarF.v(fyyVar);
            if (fyyVarV instanceof fyz) {
                fyyVarV = kwqVarF.v(fyyVar);
            }
            if (fyyVarV instanceof fyq) {
                return ((fyq) fyyVarV).a;
            }
        }
        return fyy.f;
    }

    @Override // defpackage.fys, defpackage.fyy
    public final fyy d() {
        return new fyx(this);
    }

    private fyx(fyx fyxVar) {
        super(fyxVar.d);
        ArrayList arrayList = new ArrayList(fyxVar.a.size());
        this.a = arrayList;
        arrayList.addAll(fyxVar.a);
        ArrayList arrayList2 = new ArrayList(fyxVar.b.size());
        this.b = arrayList2;
        arrayList2.addAll(fyxVar.b);
        this.c = fyxVar.c;
    }
}
