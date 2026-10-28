package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class ga {
    static final fz a = new fz(new vp(1));
    public static final int b = -100;
    public static awq c = null;
    public static awq d = null;
    private static Boolean i = null;
    public static boolean e = false;
    public static final afx f = new afx(0);
    public static final Object g = new Object();
    public static final Object h = new Object();

    public static void p(ga gaVar) {
        synchronized (g) {
            afw afwVar = new afw(f);
            while (afwVar.hasNext()) {
                ga gaVar2 = (ga) ((WeakReference) afwVar.next()).get();
                if (gaVar2 == gaVar || gaVar2 == null) {
                    afwVar.remove();
                }
            }
        }
    }

    static boolean x(Context context) {
        if (i == null) {
            try {
                ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) gu.class), 640);
                if (serviceInfo.metaData != null) {
                    i = Boolean.valueOf(serviceInfo.metaData.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                i = Boolean.FALSE;
            }
        }
        return i.booleanValue();
    }

    public abstract void A();

    public abstract void B();

    public abstract void C();

    public int a() {
        throw null;
    }

    public Context b(Context context) {
        throw null;
    }

    public Context c() {
        throw null;
    }

    public abstract fl d();

    public abstract fm e();

    public abstract hv f(hu huVar);

    public abstract MenuInflater g();

    public abstract View h(int i2);

    public abstract void i(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void j();

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n();

    public abstract void o();

    public abstract void q(int i2);

    public abstract void r(View view);

    public abstract void s(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void t(int i2);

    public abstract void u(Toolbar toolbar);

    public void v(int i2) {
        throw null;
    }

    public abstract void w(CharSequence charSequence);

    public abstract boolean y(int i2);

    public abstract void z();
}
