package defpackage;

import android.app.Activity;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qp {
    public final Object a;
    public boolean b;
    public final Object c;

    public qp(Executor executor) {
        executor.getClass();
        this.a = new Object();
        this.c = new ArrayList();
    }

    public final void a() {
        if (this.b) {
            return;
        }
        agqr it = ((agpr) this.a).iterator();
        while (it.hasNext()) {
            ((ee) this.c).getLifecycle().b((bof) it.next());
        }
        this.b = true;
    }

    public qp(Activity activity, Set set) {
        this.b = false;
        this.c = (cf) activity;
        this.a = set;
    }

    public qp(Handler handler, crc crcVar) {
        this.a = handler;
        this.c = crcVar;
    }
}
