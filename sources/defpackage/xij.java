package defpackage;

import android.os.MessageQueue;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xij implements MessageQueue.IdleHandler {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ xij(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.Set] */
    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        if (this.$cid != 0) {
            Object obj = this.a;
            ((qch) obj).a.schedule(new iug(obj, 20), 7000L, TimeUnit.MILLISECONDS);
        } else {
            qkb qkbVar = (qkb) this.a;
            if (!qkbVar.b) {
                qkbVar.b = true;
                ?? r5 = qkbVar.d;
                if (r5 != 0 && !r5.isEmpty()) {
                    Iterator it = r5.iterator();
                    while (it.hasNext()) {
                        ((xik) it.next()).a();
                    }
                }
            }
        }
        return false;
    }
}
