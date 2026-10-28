package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class abx {
    public List a;
    public boolean b;
    public final Object c;
    public Object d;

    public abx(znf znfVar) {
        znfVar.getClass();
        this.c = znfVar;
    }

    public final List a() {
        List list = this.a;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object obj = ((abx) it.next()).d;
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void b() {
        this.b = true;
    }
}
