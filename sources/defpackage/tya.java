package defpackage;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tya {
    private static final Method a;

    static {
        try {
            a = Context.class.getDeclaredMethod("checkSelfPermission", String.class);
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException("This is meant to be M, but methods aren't here.", e);
        }
    }

    public static boolean a(Context context, String str) {
        Method method = a;
        if (method == null) {
            return false;
        }
        try {
            return ((Integer) method.invoke(context, str)).intValue() == 0;
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            twu.c(6, "Exception calling context.checkSelfPermissions().", e);
            return false;
        }
    }
}
