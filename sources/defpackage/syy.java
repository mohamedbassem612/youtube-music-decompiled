package defpackage;

import android.app.Activity;
import android.os.Build;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class syy {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/common/car/CarDisplayDetector");
    public final tqj b;
    private final dov c;

    public syy(tqj tqjVar, dov dovVar) {
        tqjVar.getClass();
        this.b = tqjVar;
        this.c = dovVar;
    }

    public final boolean a() {
        if (Build.VERSION.SDK_INT >= 37) {
            tqj tqjVar = this.b;
            int i = tqr.a;
            if (tqjVar.k(1073830439)) {
                return true;
            }
        }
        return false;
    }

    public final void b(Activity activity) {
        activity.getClass();
        if (a()) {
            try {
                ((Optional) this.c.a).isPresent();
            } catch (RuntimeException e) {
                ((agrc) ((agrc) a.c()).j(e).k("com/google/android/libraries/youtube/common/car/CarDisplayDetector", "isActivityRunningOnCarScreen", 60, "CarDisplayDetector.kt")).t("Failed to determine projected car display state from dependency");
            }
        }
    }
}
