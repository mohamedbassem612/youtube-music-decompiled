package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class syr implements tdz {
    public final Set a;
    public final ReferenceQueue b;

    public syr(vxz vxzVar, awmd awmdVar) {
        vxzVar.getClass();
        awmdVar.getClass();
        Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        setNewSetFromMap.getClass();
        this.a = setNewSetFromMap;
        this.b = new ReferenceQueue();
        tew[] tewVarArr = new tew[2];
        tewVarArr[0] = true != vxzVar.l(121, 45834389L, false) ? null : tew.e;
        tewVarArr[1] = true == vxzVar.l(122, 45834390L, false) ? tew.c : null;
        ArrayList arrayList = new ArrayList();
        atqq.ba(tewVarArr, arrayList);
        if (arrayList.isEmpty()) {
            return;
        }
        tes tesVar = (tes) awmdVar.io();
        tew[] tewVarArr2 = (tew[]) arrayList.toArray(new tew[0]);
        tesVar.b(this, (tew[]) Arrays.copyOf(tewVarArr2, tewVarArr2.length));
    }

    public final syp b(int i) {
        syt sytVar = new syt(i);
        this.a.add(new WeakReference(sytVar, this.b));
        return sytVar;
    }

    @Override // defpackage.tdz
    public final /* synthetic */ Object jC() {
        return nsi.l(this);
    }

    @Override // defpackage.tdz
    public final void jz() {
        Set set;
        while (true) {
            Reference referencePoll = this.b.poll();
            set = this.a;
            if (referencePoll == null) {
                break;
            }
            awro.d(set);
            set.remove(referencePoll);
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            syp sypVar = (syp) ((WeakReference) it.next()).get();
            if (sypVar != null) {
                sypVar.b();
            }
        }
    }
}
