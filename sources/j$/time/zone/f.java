package j$.time.zone;

import app.rive.semantics.SemanticState;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class f {
    public static final CopyOnWriteArrayList b;
    public static final ConcurrentHashMap c;
    public static volatile Set d;
    public final Set a;

    static {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        b = copyOnWriteArrayList;
        c = new ConcurrentHashMap(SemanticState.LiveRegion, 0.75f, 2);
        ArrayList arrayList = new ArrayList();
        AccessController.doPrivileged(new j$.sun.security.action.a(arrayList));
        copyOnWriteArrayList.addAll(arrayList);
    }

    public f() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : TimeZone.getAvailableIDs()) {
            linkedHashSet.add(str);
        }
        this.a = DesugarCollections.unmodifiableSet(linkedHashSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ZoneRules a(String str) {
        Objects.a(str, "zoneId");
        ConcurrentHashMap concurrentHashMap = c;
        f fVar = (f) concurrentHashMap.get(str);
        if (fVar == null) {
            if (concurrentHashMap.isEmpty()) {
                throw new e("No time-zone data files registered");
            }
            throw new e("Unknown time-zone ID: ".concat(str));
        }
        if (fVar.a.contains(str)) {
            return new ZoneRules(TimeZone.getTimeZone(str));
        }
        throw new e("Not a built-in time zone: ".concat(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(f fVar) {
        Objects.a(fVar, "provider");
        synchronized (f.class) {
            for (String str : fVar.a) {
                Objects.a(str, "zoneId");
                if (((f) c.putIfAbsent(str, fVar)) != null) {
                    throw new e("Unable to register zone as one already registered with that ID: " + str + ", currently loading from provider: " + String.valueOf(fVar));
                }
            }
            d = DesugarCollections.unmodifiableSet(new HashSet(c.keySet()));
        }
        b.add(fVar);
    }
}
