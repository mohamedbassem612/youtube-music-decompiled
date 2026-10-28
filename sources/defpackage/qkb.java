package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qkb {
    public static qkb a;
    public boolean b;
    public final Object c;
    public final Object d;

    public qkb(Set set, tqj tqjVar) {
        int i = tqr.a;
        this.b = tqjVar.k(1073808329);
        this.d = set;
        this.c = new xij(this, 0);
    }

    static synchronized void a() {
        Object obj;
        qkb qkbVar = a;
        if (qkbVar != null && (obj = qkbVar.c) != null && qkbVar.d != null && qkbVar.b) {
            ((Context) obj).getContentResolver().unregisterContentObserver((ContentObserver) a.d);
        }
        a = null;
    }

    public qkb(Context context) {
        this.b = false;
        this.c = context;
        this.d = new qka();
    }

    public qkb() {
        this.b = false;
        this.c = null;
        this.d = null;
    }
}
