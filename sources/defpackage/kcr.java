package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.RemoteException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kcr {
    public static final khn a = new khn("SessionManager", (String) null);
    public final kcj b;
    private final Context c;

    public kcr(kcj kcjVar, Context context) {
        this.b = kcjVar;
        this.c = context;
    }

    public final kbu a() {
        kro.f("Must be called from the main thread.");
        kcq kcqVarB = b();
        if (kcqVarB == null || !(kcqVarB instanceof kbu)) {
            return null;
        }
        return (kbu) kcqVarB;
    }

    public final kcq b() {
        kro.f("Must be called from the main thread.");
        try {
            return (kcq) kun.b(this.b.a());
        } catch (RemoteException unused) {
            khn.e();
            return null;
        }
    }

    public final void c(kcs kcsVar, Class cls) {
        if (kcsVar == null) {
            throw new NullPointerException("SessionManagerListener can't be null");
        }
        kro.f("Must be called from the main thread.");
        try {
            this.b.h(new kck(kcsVar, cls));
        } catch (RemoteException unused) {
            Build.TYPE.equals("user");
        }
    }

    public final void d(boolean z) {
        kro.f("Must be called from the main thread.");
        try {
            a.a("End session for %s", this.c.getPackageName());
            this.b.g(z);
        } catch (RemoteException unused) {
            khn.e();
        }
    }
}
