package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.StrictMode;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dyb implements dxy {
    public static final dyb b = new dyb();

    @Override // defpackage.dxy
    public final Rect a(Activity activity) {
        Rect rectA;
        Configuration configuration = activity.getResources().getConfiguration();
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        try {
            try {
                StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(configuration);
                Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                objInvoke.getClass();
                rectA = new Rect((Rect) objInvoke);
            } catch (Exception e) {
                if (!(e instanceof NoSuchFieldException) && !(e instanceof NoSuchMethodException) && !(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException)) {
                    throw e;
                }
                Log.w(dxx.b, e);
                rectA = dya.b.a(activity);
            }
            StrictMode.setVmPolicy(vmPolicy);
            return rectA;
        } catch (Throwable th) {
            StrictMode.setVmPolicy(vmPolicy);
            throw th;
        }
    }
}
