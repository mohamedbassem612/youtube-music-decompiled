package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avhh extends avfi {
    private final avhg e;
    private static final ReferenceQueue c = new ReferenceQueue();
    private static final ConcurrentMap d = new ConcurrentHashMap();
    public static final Logger b = Logger.getLogger(avhh.class.getName());

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avhh(avax avaxVar) {
        super(avaxVar);
        ReferenceQueue referenceQueue = c;
        ConcurrentMap concurrentMap = d;
        this.e = new avhg(this, avaxVar, referenceQueue, concurrentMap);
    }

    @Override // defpackage.avfi, defpackage.avax
    public final void d() {
        int i = avhg.a;
        this.e.a();
        if (getClass() == null) {
            throw new AssertionError();
        }
        ((avhb) this.a).d();
    }

    @Override // defpackage.avfi, defpackage.avax
    public final void e() {
        int i = avhg.a;
        this.e.a();
        if (getClass() == null) {
            throw new AssertionError();
        }
        ((avhb) this.a).e();
    }
}
