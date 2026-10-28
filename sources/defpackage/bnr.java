package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
final class bnr {
    final Map a = new HashMap();
    final Map b;

    public bnr(Map map) {
        this.b = map;
        for (Map.Entry entry : map.entrySet()) {
            boa boaVar = (boa) entry.getValue();
            List arrayList = (List) this.a.get(boaVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.a.put(boaVar, arrayList);
            }
            arrayList.add((bns) entry.getKey());
        }
    }

    public static void a(List list, bog bogVar, boa boaVar, Object obj) {
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            bns bnsVar = (bns) list.get(size);
            try {
                int i = bnsVar.a;
                if (i == 0) {
                    bnsVar.b.invoke(obj, null);
                } else if (i != 1) {
                    bnsVar.b.invoke(obj, bogVar, boaVar);
                } else {
                    bnsVar.b.invoke(obj, bogVar);
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("Failed to call observer method", e2.getCause());
            }
        }
    }
}
