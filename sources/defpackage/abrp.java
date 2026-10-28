package defpackage;

import android.app.Notification;
import android.app.Service;
import android.os.Build;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abrp {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/player/notification/ForegroundNotificationController");
    private final abru b;
    private final awmd c;
    private final abmt d;
    private final awmd e;
    private Service f;
    private Notification g;
    private boolean h;
    private boolean i;
    private Notification j;
    private final Set k;
    private final vxu l;

    public abrp(awmd awmdVar, vxu vxuVar, abru abruVar, awmd awmdVar2, abmt abmtVar) {
        awmdVar.getClass();
        this.e = awmdVar;
        vxuVar.getClass();
        this.l = vxuVar;
        awmdVar2.getClass();
        this.c = awmdVar2;
        this.b = abruVar;
        abmtVar.getClass();
        this.d = abmtVar;
        this.k = new HashSet();
    }

    private final synchronized void l(Service service) {
        abru abruVar = this.b;
        if (abruVar.f() && o(service)) {
            abruVar.e();
            if (this.g == null) {
                this.j = null;
            }
        }
    }

    private final synchronized void m(boolean z) {
        aceo aceoVar;
        fg fgVar;
        if (z) {
            if (this.f == null && !this.i && this.k.isEmpty() && (fgVar = (aceoVar = (aceo) this.c.io()).a) != null) {
                if (fgVar.m()) {
                    aceoVar.j(true);
                }
                fgVar.k(new fi().a());
                fgVar.j(null);
                aceoVar.d();
                fgVar.e();
                aceoVar.a = null;
                aceoVar.d = null;
                abmx.a(abmw.MEDIASESSION, "MediaSession released");
            }
        }
    }

    private final boolean n(Service service, Notification notification) {
        if (notification == null) {
            return false;
        }
        abmw abmwVar = abmw.MEDIASESSION;
        service.getPackageName();
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                service.startForeground(2, notification);
            } catch (RuntimeException e) {
                if (!br$$ExternalSyntheticApiModelOutline0.m653m((Object) e) && !this.d.v()) {
                    throw e;
                }
                ((agrc) ((agrc) ((agrc) a.c()).j(e)).k("com/google/android/libraries/youtube/player/notification/ForegroundNotificationController", "foregroundService", (char) 407, "ForegroundNotificationController.java")).t("Failed to foreground Service due to Android S+ restrictions");
                return false;
            }
        } else {
            service.startForeground(2, notification);
        }
        return true;
    }

    private final synchronized boolean o(Service service) {
        Notification notification = this.g;
        if (notification == null) {
            notification = this.j;
        }
        if (notification == null) {
            return false;
        }
        abmw abmwVar = abmw.MEDIASESSION;
        if (!n(service, notification)) {
            return false;
        }
        if (!this.h) {
            service.stopForeground(this.g == null);
        }
        return true;
    }

    private final boolean p() {
        int i;
        return this.h && ((i = this.b.a) == 2 || i == 3) && this.g != null;
    }

    public final synchronized void a() {
        abmw abmwVar = abmw.MEDIASESSION;
        Notification notification = this.g;
        this.h = false;
        this.g = null;
        abmt abmtVar = this.d;
        if (abmtVar.v()) {
            abru abruVar = this.b;
            if (abruVar.f()) {
                Iterator it = this.k.iterator();
                boolean zO = false;
                while (it.hasNext()) {
                    zO |= o((Service) it.next());
                }
                if (zO) {
                    abruVar.e();
                    this.j = null;
                }
            }
        }
        Service service = this.f;
        if (service != null) {
            service.stopForeground(true);
        }
        Iterator it2 = this.k.iterator();
        while (it2.hasNext()) {
            ((Service) it2.next()).stopForeground(true);
        }
        this.b.b();
        if (!abmtVar.g.l(508, 45843570L, false) || notification != null) {
            ((auy) this.e.io()).a(null, 2);
        }
    }

    public final synchronized void b() {
        this.i = true;
    }

    public final synchronized void c(boolean z) {
        this.i = false;
        d(z);
    }

    public final synchronized void d(boolean z) {
        m(z);
    }

    public final synchronized void e(Service service) {
        if (this.d.v()) {
            if (!p()) {
                l(service);
            } else if (n(service, this.g)) {
                this.b.e();
            }
        }
    }

    public final synchronized void f(Service service) {
        Set set = this.k;
        if (!set.contains(service)) {
            if (p()) {
                if (n(service, this.g) && this.d.v()) {
                    this.b.e();
                }
            } else if (this.d.v()) {
                l(service);
            }
        }
        set.add(service);
    }

    public final synchronized void g(Service service) {
        this.k.remove(service);
    }

    public final synchronized void h(Service service) {
        if (this.f != service && p() && service != null) {
            n(service, this.g);
        }
        this.f = service;
    }

    public final synchronized void i(Notification notification, boolean z) {
        abmw abmwVar = abmw.MEDIASESSION;
        this.g = notification;
        abmt abmtVar = this.d;
        if (abmtVar.v()) {
            this.j = notification;
        }
        if (!z) {
            anhb anhbVar = this.l.c().j;
            if (anhbVar == null) {
                anhbVar = anhb.a;
            }
            ajdi ajdiVar = anhbVar.t;
            if (ajdiVar == null) {
                ajdiVar = ajdi.a;
            }
            if (!ajdiVar.b) {
                ((auy) this.e.io()).b(null, 2, notification);
                j();
                return;
            }
        }
        Service service = this.f;
        boolean z2 = false;
        boolean zN = service != null ? n(service, notification) : false;
        boolean z3 = zN;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            zN = n((Service) it.next(), notification);
            z3 |= zN;
            z2 |= zN;
        }
        if (true == abmtVar.v()) {
            zN = z3;
        }
        if (!zN) {
            ((auy) this.e.io()).b(null, 2, notification);
        }
        if (z2 && abmtVar.v()) {
            this.b.e();
        }
        this.h = true;
        this.b.c();
    }

    public final synchronized void j() {
        abmw abmwVar = abmw.MEDIASESSION;
        Service service = this.f;
        if (service != null) {
            service.stopForeground(false);
        }
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((Service) it.next()).stopForeground(false);
        }
        this.h = false;
    }

    public final synchronized void k() {
        abmw abmwVar = abmw.MEDIASESSION;
        Service service = this.f;
        if (service != null) {
            service.stopSelf();
        }
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((Service) it.next()).stopSelf();
        }
        this.h = false;
    }
}
