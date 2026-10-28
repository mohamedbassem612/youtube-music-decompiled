package defpackage;

import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class wkc implements wmb {
    private final tmo a;
    private final Map b = new ConcurrentHashMap();

    protected wkc(tmo tmoVar) {
        this.a = tmoVar;
    }

    protected abstract String a(wlu wluVar);

    @Override // defpackage.wmt
    public void b(Collection collection) {
        HashSet hashSet = new HashSet();
        Map map = this.b;
        for (Map.Entry entry : map.entrySet()) {
            for (aqcm aqcmVar : (Collection) entry.getValue()) {
                int iAS = a.aS(aqcmVar.c);
                if (iAS == 0) {
                    iAS = 1;
                }
                if (iAS == 3 && collection.contains(Integer.valueOf(aqcmVar.b))) {
                    hashSet.add((String) entry.getKey());
                    break;
                }
            }
        }
        map.keySet().removeAll(hashSet);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            this.a.g((String) it.next(), true);
        }
    }

    @Override // defpackage.wmb
    public final void c(wlu wluVar, Collection collection) {
        String strA = a(wluVar);
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        if (collection.isEmpty() || !wluVar.x()) {
            this.b.remove(strA);
        } else {
            this.b.put(strA, collection);
        }
    }
}
