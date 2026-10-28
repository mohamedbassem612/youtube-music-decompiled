package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class fvr implements fvm {
    private Map a;
    private List b;
    private Map c;
    public final int d;
    private List e;

    public fvr(int i) {
        List list = Collections.EMPTY_LIST;
        List list2 = Collections.EMPTY_LIST;
        this.d = i;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e((dov) it.next());
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            d((dov) it2.next());
        }
    }

    private static void a(Map map, List list, dov dovVar) {
        Object obj = dovVar.a;
        if (((dov) map.put(obj.getClass(), dovVar)) != null) {
            int size = list.size();
            do {
                size--;
                if (size < 0) {
                    throw new IllegalStateException("Extension Map and Extension List out of sync!");
                }
            } while (((dov) list.get(size)).a.getClass() != obj.getClass());
            list.remove(size);
        }
        list.add(dovVar);
    }

    @Override // defpackage.fvm
    public final Object B() {
        throw null;
    }

    @Override // defpackage.fvm
    public final boolean ac() {
        throw null;
    }

    public void c() {
        throw null;
    }

    public final void d(dov dovVar) {
        if (this.e == null) {
            this.e = new ArrayList();
            if (this.c != null) {
                throw new IllegalStateException("Extension Map and Extension List out of sync!");
            }
            this.c = new HashMap();
        }
        a(this.c, this.e, dovVar);
    }

    public final void e(dov dovVar) {
        if (this.b == null) {
            this.b = new ArrayList();
            if (this.a != null) {
                throw new IllegalStateException("Extension Map and Extension List out of sync!");
            }
            this.a = new HashMap();
        }
        a(this.a, this.b, dovVar);
    }

    @Override // defpackage.fvm
    public final fvj w() {
        throw null;
    }

    @Override // defpackage.fvm
    public final Object y(Context context) {
        throw null;
    }
}
