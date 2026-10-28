package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.StrictMode;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dya implements dxy {
    public static final dya b = new dya();

    @Override // defpackage.dxy
    public final Rect a(Activity activity) {
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        DisplayCutout displayCutoutM770m = null;
        try {
            try {
                StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(configuration);
                if (activity.isInMultiWindowMode()) {
                    Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                    objInvoke.getClass();
                    rect.set((Rect) objInvoke);
                } else {
                    Object objInvoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                    objInvoke2.getClass();
                    rect.set((Rect) objInvoke2);
                }
            } catch (Exception e) {
                if (!(e instanceof NoSuchFieldException) && !(e instanceof NoSuchMethodException) && !(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException)) {
                    throw e;
                }
                Log.w(dxx.b, e);
                activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
            }
            StrictMode.setVmPolicy(vmPolicy);
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (!activity.isInMultiWindowMode()) {
                int iE = yp.e(activity);
                if (rect.bottom + iE == point.y) {
                    rect.bottom += iE;
                } else if (rect.right + iE == point.x) {
                    rect.right += iE;
                } else if (rect.left == iE) {
                    rect.left = 0;
                }
            }
            if ((rect.width() < point.x || rect.height() < point.y) && !activity.isInMultiWindowMode()) {
                defaultDisplay.getClass();
                StrictMode.VmPolicy vmPolicy2 = StrictMode.getVmPolicy();
                try {
                    try {
                        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                        Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
                        constructor.setAccessible(true);
                        Object objNewInstance = constructor.newInstance(null);
                        Method declaredMethod = defaultDisplay.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(defaultDisplay, objNewInstance);
                        Field declaredField2 = objNewInstance.getClass().getDeclaredField("displayCutout");
                        declaredField2.setAccessible(true);
                        Object obj2 = declaredField2.get(objNewInstance);
                        if (fd$$ExternalSyntheticApiModelOutline0.m$1(obj2)) {
                            displayCutoutM770m = fd$$ExternalSyntheticApiModelOutline0.m770m(obj2);
                        }
                    } catch (Exception e2) {
                        if (!(e2 instanceof ClassNotFoundException) && !(e2 instanceof NoSuchMethodException) && !(e2 instanceof NoSuchFieldException) && !(e2 instanceof IllegalAccessException) && !(e2 instanceof InvocationTargetException) && !(e2 instanceof InstantiationException)) {
                            throw e2;
                        }
                        Log.w(dxx.b, e2);
                    }
                    StrictMode.setVmPolicy(vmPolicy2);
                    if (displayCutoutM770m != null) {
                        if (rect.left == displayCutoutM770m.getSafeInsetLeft()) {
                            rect.left = 0;
                        }
                        if (point.x - rect.right == displayCutoutM770m.getSafeInsetRight()) {
                            rect.right += displayCutoutM770m.getSafeInsetRight();
                        }
                        if (rect.top == displayCutoutM770m.getSafeInsetTop()) {
                            rect.top = 0;
                        }
                        if (point.y - rect.bottom == displayCutoutM770m.getSafeInsetBottom()) {
                            rect.bottom += displayCutoutM770m.getSafeInsetBottom();
                        }
                    }
                } catch (Throwable th) {
                    StrictMode.setVmPolicy(vmPolicy2);
                    throw th;
                }
            }
            return rect;
        } catch (Throwable th2) {
            StrictMode.setVmPolicy(vmPolicy);
            throw th2;
        }
    }
}
