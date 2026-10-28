package defpackage;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahoy implements ahrs {
    private volatile Set b = null;
    private volatile Set a = Collections.newSetFromMap(new ConcurrentHashMap());

    public ahoy(Collection collection) {
        this.a.addAll(collection);
    }

    private final synchronized void c() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            this.b.add(((ahrs) it.next()).a());
        }
        this.a = null;
    }

    @Override // defpackage.ahrs
    public final /* bridge */ /* synthetic */ Object a() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    this.b = Collections.newSetFromMap(new ConcurrentHashMap());
                    c();
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.b);
    }

    public final synchronized void b(ahrs ahrsVar) {
        if (this.b == null) {
            this.a.add(ahrsVar);
        } else {
            this.b.add(ahrsVar.a());
        }
    }
}
