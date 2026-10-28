package defpackage;

import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.os.Build;
import app.rive.semantics.SemanticState;
import java.util.IdentityHashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afju {
    public static final agrf a = agrf.h("com/google/apps/tiktok/concurrent/ForegroundServiceTracker");
    public final Object b = new Object();
    public final IdentityHashMap c = new IdentityHashMap(10);
    public final agjp d = new agjp(12, 2);
    public final agow e = new agjq();
    public afjt f;
    public Service g;
    public int h;
    public afjr i;
    private final ahud j;

    public afju(Context context, ahey aheyVar, ahud ahudVar) {
        new ahfg(aheyVar);
        this.j = ahudVar;
        this.f = afjt.a;
    }

    public final void a(Service service, Notification notification) {
        int i;
        if (Build.VERSION.SDK_INT < 29) {
            service.startForeground(174344743, notification);
            return;
        }
        agow agowVar = this.e;
        if (agowVar.isEmpty()) {
            i = (Build.VERSION.SDK_INT < 34 || !(((Context) this.j.b).getApplicationInfo().targetSdkVersion >= 34)) ? 0 : SemanticState.Modal;
        } else {
            Iterator<E> it = new agoy((aghi) agowVar).iterator();
            int iIntValue = 0;
            while (it.hasNext()) {
                iIntValue |= ((Integer) it.next()).intValue();
            }
            i = iIntValue;
        }
        service.startForeground(174344743, notification, i != 0 ? i : 0);
    }

    public final void b() {
        afjt afjtVar = this.f;
        ahno.R(afjtVar == afjt.c, "Destroyed in wrong state %s", afjtVar);
        this.f = afjt.a;
        this.g.stopForeground(true);
        this.i = null;
        this.g.stopSelf(this.h);
        this.g = null;
    }
}
