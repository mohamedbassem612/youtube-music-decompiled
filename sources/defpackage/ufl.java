package defpackage;

import j$.util.Collection;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ufl implements rbi {
    private final Map a = new ConcurrentHashMap();

    @Override // defpackage.rbi
    public final void a(UUID uuid, anck anckVar) {
        Map map = this.a;
        map.put(uuid, anckVar);
        if (map.size() > 1) {
            rbc rbcVar = new rbc(ufm.a, rbd.d);
            rbcVar.c();
            rbcVar.a("Multiple services started at the same time, active services: %s.", Collection.EL.stream(map.values()).map(new snm(8)).collect(aghu.a));
        }
    }

    @Override // defpackage.rbi
    public final void b(UUID uuid) {
        this.a.remove(uuid);
    }
}
