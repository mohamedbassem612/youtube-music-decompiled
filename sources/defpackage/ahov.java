package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ahov implements ahqy, ahqx {
    private final Executor c;
    private final Map b = new HashMap();
    public Queue a = new ArrayDeque();

    public ahov(Executor executor) {
        this.c = executor;
    }

    @Override // defpackage.ahqy
    public final void a(Class cls, ahqw ahqwVar) {
        b(cls, this.c, ahqwVar);
    }

    @Override // defpackage.ahqy
    public final synchronized void b(Class cls, Executor executor, ahqw ahqwVar) {
        try {
            if (ahqwVar == null) {
                throw null;
            }
            Map map = this.b;
            if (!map.containsKey(cls)) {
                map.put(cls, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) map.get(cls)).put(ahqwVar, executor);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Set c() {
        throw null;
    }
}
