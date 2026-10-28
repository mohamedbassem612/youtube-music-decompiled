package defpackage;

import android.app.Service;
import android.content.ComponentCallbacks2;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class aunp extends Service {
    @Override // android.app.Service
    public final void onCreate() {
        ComponentCallbacks2 application = getApplication();
        if (!(application instanceof aunq)) {
            throw new RuntimeException(String.format("%s does not implement %s", application.getClass().getCanonicalName(), aunq.class.getCanonicalName()));
        }
        aunq aunqVar = (aunq) application;
        auno aunoVarA = aunqVar.a();
        aunqVar.getClass();
        aunoVarA.getClass();
        aunoVarA.a();
        super.onCreate();
    }
}
