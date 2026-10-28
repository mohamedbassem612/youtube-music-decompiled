package defpackage;

import android.content.Context;
import android.os.IBinder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class kuq {
    private final String a = "com.google.android.gms.ads.adshield.AdShieldCreatorImpl";
    private Object b;

    protected kuq() {
    }

    protected abstract Object b(IBinder iBinder);

    protected final Object c(Context context) {
        Object obj = this.b;
        if (obj != null) {
            return obj;
        }
        kro.l(context);
        Context contextC = kml.c(context);
        if (contextC == null) {
            throw new kup();
        }
        try {
            Object objB = b((IBinder) contextC.getClassLoader().loadClass(this.a).newInstance());
            this.b = objB;
            return objB;
        } catch (ClassNotFoundException e) {
            throw new kup("Could not load creator class.", e);
        } catch (IllegalAccessException e2) {
            throw new kup("Could not access creator.", e2);
        } catch (InstantiationException e3) {
            throw new kup("Could not instantiate creator.", e3);
        }
    }
}
