package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahhh {
    public static final ahhh a = new ahhh();
    private final Map b = new HashMap();

    public final synchronized void a(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            b((String) entry.getKey(), (afyd) entry.getValue());
        }
    }

    public final synchronized void b(String str, afyd afydVar) {
        Map map = this.b;
        if (!map.containsKey(str)) {
            map.put(str, afydVar);
            return;
        }
        if (((afyd) map.get(str)).equals(afydVar)) {
            return;
        }
        throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + String.valueOf(map.get(str)) + "), cannot insert " + String.valueOf(afydVar));
    }
}
