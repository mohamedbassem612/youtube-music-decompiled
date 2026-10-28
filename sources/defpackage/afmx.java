package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afmx extends bpi {
    private final Map a = new HashMap();
    private final Map b = new HashMap();
    private final afkf c;

    public afmx(Executor executor) {
        new afkh("SubscriptionMixinVM");
        new HashSet();
        afkf afkfVar = new afkf(executor, false, false);
        this.c = afkfVar;
        qpj.c();
        synchronized (afkfVar.a) {
            afkfVar.c = true;
            afkfVar.f = 1;
            if (afkfVar.b) {
                afke afkeVar = afkfVar.e;
                if (afkeVar != null) {
                    afkeVar.a();
                    afkfVar.e = null;
                }
            } else {
                ListenableFuture listenableFuture = afkfVar.d;
                if (listenableFuture != null) {
                    listenableFuture.cancel(false);
                    afkfVar.d = null;
                }
            }
        }
    }

    @Override // defpackage.bpi
    protected final void d() {
        ArrayDeque arrayDeque;
        Iterator it = this.a.values().iterator();
        if (it.hasNext()) {
            throw null;
        }
        Iterator it2 = this.b.values().iterator();
        if (it2.hasNext()) {
            throw null;
        }
        afkf afkfVar = this.c;
        Deque deque = afkfVar.a;
        synchronized (deque) {
            ahno.P(afkfVar.c, "Executor may only be drained when it is suspended.");
            arrayDeque = new ArrayDeque(deque);
            deque.clear();
        }
        arrayDeque.clear();
    }
}
