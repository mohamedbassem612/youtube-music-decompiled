package defpackage;

import java.util.ArrayList;
import java.util.UUID;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aftt {
    private static final WeakHashMap b = new WeakHashMap();
    public static final WeakHashMap a = new WeakHashMap();

    public static void a(Throwable th) {
        Throwable cause;
        boolean z;
        afvl afvlVarB;
        WeakHashMap weakHashMap = a;
        synchronized (weakHashMap) {
            cause = th;
            while (true) {
                if (cause == null) {
                    z = false;
                    break;
                } else {
                    if (weakHashMap.containsKey(cause)) {
                        z = true;
                        break;
                    }
                    cause = cause.getCause();
                }
            }
            weakHashMap.put(th, Boolean.valueOf(z));
        }
        if (cause == null && b(th) == null && (afvlVarB = ((afvh) afty.d.get()).c) != null) {
            ArrayList arrayList = new ArrayList();
            for (afvlVarB = ((afvh) afty.d.get()).c; afvlVarB != null; afvlVarB = afvlVarB.b()) {
                arrayList.add(afvlVarB);
            }
            UUID uuidG = ((afvl) arrayList.get(0)).g();
            if (uuidG == null) {
                throw new NullPointerException("Null rootTraceId");
            }
            long jL = ((afvl) arrayList.get(0)).l();
            int size = arrayList.size();
            aguu.ag(size, "expectedSize");
            agjz agjzVar = new agjz(size);
            int size2 = arrayList.size();
            aguu.ag(size2, "expectedSize");
            agjz agjzVar2 = new agjz(size2);
            for (afvl afvlVar : aguu.t(arrayList)) {
                agjzVar2.h(afvlVar.d());
                agjzVar.h(afvlVar.j());
            }
            WeakHashMap weakHashMap2 = b;
            synchronized (weakHashMap2) {
                agke agkeVarG = agjzVar2.g();
                if (agkeVarG == null) {
                    throw new NullPointerException("Null spansNames");
                }
                agke agkeVarG2 = agjzVar.g();
                if (agkeVarG2 == null) {
                    throw new NullPointerException("Null extras");
                }
                weakHashMap2.put(th, new afvy(agkeVarG, agkeVarG2, uuidG, jL));
            }
        }
    }

    public static ahub b(Throwable th) {
        WeakHashMap weakHashMap = b;
        synchronized (weakHashMap) {
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                if (weakHashMap.containsKey(cause)) {
                    afvy afvyVar = (afvy) weakHashMap.get(cause);
                    weakHashMap.put(th, afvyVar);
                    return new ahub(afvyVar);
                }
            }
            return null;
        }
    }
}
