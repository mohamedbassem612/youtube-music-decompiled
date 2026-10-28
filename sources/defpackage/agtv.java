package defpackage;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agtv {
    public static final agsv a;
    private static final Set b;

    static {
        Set setSingleton = Collections.singleton(agrj.a);
        b = setSingleton;
        a = new agsv(setSingleton);
    }

    public static boolean a(agsu agsuVar, agtr agtrVar, Set set) {
        return (agsuVar.n() == null && agtrVar.a() <= set.size() && set.containsAll(agtrVar.c())) ? false : true;
    }

    public static void b(agtr agtrVar, agth agthVar, StringBuilder sb) {
        agst agstVar = new agst(sb);
        agtrVar.d(agthVar, agstVar);
        if (agstVar.c) {
            agstVar.b.append(agstVar.a);
        }
    }
}
