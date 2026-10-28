package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avek extends aveh {
    final /* synthetic */ aven a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avek(aveo aveoVar, aven avenVar) {
        super(aveoVar.c);
        this.a = avenVar;
    }

    @Override // defpackage.aveh
    public final void a() {
        List list;
        List arrayList = new ArrayList();
        while (true) {
            aven avenVar = this.a;
            synchronized (avenVar) {
                if (avenVar.d.isEmpty()) {
                    avenVar.d = null;
                    avenVar.b = true;
                    return;
                } else {
                    list = avenVar.d;
                    avenVar.d = arrayList;
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            list.clear();
            arrayList = list;
        }
    }
}
