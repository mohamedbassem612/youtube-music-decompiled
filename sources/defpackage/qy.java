package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qy {
    public volatile Context a;
    private final Set b = new CopyOnWriteArraySet();

    public final void a(qz qzVar) {
        qzVar.getClass();
        Context context = this.a;
        if (context != null) {
            qzVar.a(context);
        }
        this.b.add(qzVar);
    }

    public final void b() {
        this.a = null;
    }

    public final void c(Context context) {
        this.a = context;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((qz) it.next()).a(context);
        }
    }

    public final void d(qz qzVar) {
        qzVar.getClass();
        this.b.remove(qzVar);
    }
}
