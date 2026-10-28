package defpackage;

import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class qex {
    public abstract MessageLite a(String str, Object obj);

    public abstract MessageLite b(MessageLite messageLite, MessageLite messageLite2);

    public abstract String c(MessageLite messageLite);

    public final List e(Map map) {
        MessageLite messageLiteA;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() != null && (messageLiteA = a((String) entry.getKey(), entry.getValue())) != null) {
                arrayList.add(messageLiteA);
            }
        }
        return arrayList;
    }

    final List f(List list, List list2) {
        MessageLite messageLite;
        if (list.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MessageLite messageLite2 = (MessageLite) it.next();
            String strC = c(messageLite2);
            Iterator it2 = list2.iterator();
            do {
                if (!it2.hasNext()) {
                    messageLite = null;
                    break;
                }
                messageLite = (MessageLite) it2.next();
            } while (!strC.equals(c(messageLite)));
            MessageLite messageLiteB = b(messageLite2, messageLite);
            if (messageLiteB != null) {
                arrayList.add(messageLiteB);
            }
        }
        return arrayList;
    }
}
