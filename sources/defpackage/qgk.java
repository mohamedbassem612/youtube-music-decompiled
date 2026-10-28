package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qgk {
    public static final aguu d = new aguu(null);
    public final ConcurrentHashMap a;
    public final Queue b;
    public volatile aigu c;
    private final AtomicReference e = new AtomicReference();
    private final AtomicReference f = new AtomicReference();
    private volatile boolean g;

    qgk() {
        new AtomicReference(null);
        this.a = new ConcurrentHashMap();
        this.b = new ConcurrentLinkedQueue();
        this.c = null;
        this.g = false;
        ListenableFuture listenableFuture = aher.a;
        new ConcurrentLinkedQueue();
    }

    public static qgk b(agke agkeVar) {
        qgk qgkVar;
        int i = 0;
        do {
            qgkVar = null;
            if (i >= ((agpi) agkeVar).d) {
                break;
            }
            afuv afuvVarJ = afuy.j(d, (afuy) agkeVar.get(i));
            qgkVar = afuvVarJ.b() ? (qgk) afuvVarJ.a() : null;
            i++;
        } while (qgkVar == null);
        return qgkVar;
    }

    public final qgi a() {
        if (c()) {
            return null;
        }
        return (qgi) this.e.get();
    }

    public final boolean c() {
        return this.f.get() != null;
    }
}
