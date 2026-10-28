package defpackage;

import android.database.ContentObserver;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qjv extends ContentObserver {
    final /* synthetic */ qjw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qjv(qjw qjwVar) {
        super(null);
        this.a = qjwVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        qjw qjwVar = this.a;
        synchronized (qjwVar.g) {
            qjwVar.h = null;
            qkm.e();
        }
        synchronized (qjwVar) {
            Iterator it = qjwVar.i.iterator();
            while (it.hasNext()) {
                ((qjx) it.next()).a();
            }
        }
    }
}
