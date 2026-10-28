package defpackage;

import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xhq implements xhk {
    private final Map a = new ConcurrentHashMap();
    private final Deque b = new ArrayDeque();

    @Override // defpackage.xhk
    public final xgt a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (xgt) this.a.get(str);
    }

    @Override // defpackage.xhk
    public final xgt b(String str) {
        return (xgt) this.a.get(str);
    }

    @Override // defpackage.xhk
    public final void c(xgt xgtVar) {
        xgtVar.getClass();
        String str = xgtVar.a;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.a.remove(str);
        this.b.remove(str);
    }

    @Override // defpackage.xhk
    public final void d(xgt xgtVar) {
        String str = xgtVar.a;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Map map = this.a;
        boolean zContainsKey = map.containsKey(str);
        Deque deque = this.b;
        if (zContainsKey) {
            deque.remove(str);
            deque.addLast(str);
        } else {
            if (deque.size() == 7) {
                map.remove((String) deque.removeFirst());
            }
            deque.addLast(str);
            map.put(str, xgtVar);
        }
    }
}
