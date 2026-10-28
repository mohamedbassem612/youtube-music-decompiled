package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class kot {
    protected final kou e;

    protected kot(kou kouVar) {
        this.e = kouVar;
    }

    public static kou m(Activity activity) {
        kov kovVar;
        kph kphVar;
        if (!(activity instanceof cf)) {
            WeakReference weakReference = (WeakReference) kov.a.get(activity);
            if (weakReference != null && (kovVar = (kov) weakReference.get()) != null) {
                return kovVar;
            }
            try {
                kov kovVar2 = (kov) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                if (kovVar2 == null || kovVar2.isRemoving()) {
                    kovVar2 = new kov();
                    activity.getFragmentManager().beginTransaction().add(kovVar2, "LifecycleFragmentImpl").commitAllowingStateLoss();
                }
                kov kovVar3 = kovVar2;
                kov.a.put(activity, new WeakReference(kovVar3));
                return kovVar3;
            } catch (ClassCastException e) {
                throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
            }
        }
        cf cfVar = (cf) activity;
        WeakHashMap weakHashMap = kph.a;
        dd supportFragmentManager = cfVar.getSupportFragmentManager();
        WeakReference weakReference2 = (WeakReference) kph.a.get(cfVar);
        if (weakReference2 != null && (kphVar = (kph) weakReference2.get()) != null) {
            return kphVar;
        }
        try {
            kph kphVar2 = (kph) supportFragmentManager.g("SLifecycleFragmentImpl");
            if (kphVar2 == null || kphVar2.isRemoving()) {
                kphVar2 = new kph();
                av avVar = new av(supportFragmentManager);
                avVar.g(0, kphVar2, "SLifecycleFragmentImpl", 1);
                avVar.a(true, true);
            }
            kph.a.put(cfVar, new WeakReference(kphVar2));
            return kphVar2;
        } catch (ClassCastException e2) {
            throw new IllegalStateException("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e2);
        }
    }

    public final Activity l() {
        Activity activityA = this.e.a();
        kro.l(activityA);
        return activityA;
    }

    public void i() {
    }

    public void j() {
    }

    public void k() {
    }

    public void n() {
    }

    public void e(Bundle bundle) {
    }

    public void h(Bundle bundle) {
    }

    public void d(int i, int i2, Intent intent) {
    }
}
