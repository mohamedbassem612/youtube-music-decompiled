package defpackage;

import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dwa {
    public static final dwb a;

    static {
        dwb dvnVar;
        ClassLoader classLoader;
        try {
            try {
                if (Build.VERSION.SDK_INT >= 28) {
                    classLoader = WebView.getWebViewClassLoader();
                } else {
                    try {
                        Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", null);
                        declaredMethod.setAccessible(true);
                        classLoader = declaredMethod.invoke(null, null).getClass().getClassLoader();
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                        throw new RuntimeException(e);
                    }
                }
                dvnVar = new dwc((WebViewProviderFactoryBoundaryInterface) axsn.a(WebViewProviderFactoryBoundaryInterface.class, (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, classLoader).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null)));
            } catch (ClassNotFoundException unused) {
                dvnVar = new dvn();
            }
            a = dvnVar;
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }
}
