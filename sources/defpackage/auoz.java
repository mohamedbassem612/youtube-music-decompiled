package defpackage;

import android.app.Application;
import android.app.Service;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class auoz implements auph {
    private final Service a;
    private Object b;

    public auoz(Service service) {
        this.a = service;
    }

    @Override // defpackage.auph
    public final Object generatedComponent() {
        if (this.b == null) {
            Service service = this.a;
            Application application = service.getApplication();
            atqq.c(application instanceof auph, "Hilt service must be attached to an @HiltAndroidApp Application. Found: %s", application.getClass());
            mgk mgkVarGd = ((auoy) atqp.a(application, auoy.class)).gd();
            mgkVarGd.b = service;
            atqq.b(mgkVarGd.b, Service.class);
            this.b = new gkf((ght) mgkVarGd.a, (Service) mgkVarGd.b);
        }
        return this.b;
    }
}
