package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.graphics.Rect;
import android.os.Build;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import com.google.common.util.concurrent.ListenableFuture;
import internal.org.jni_zero.JniZero;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yi {
    public yi(InvocationHandler invocationHandler) {
    }

    public static yq a(xr xrVar, xv xvVar) {
        int i = xrVar.d;
        if (i == 0) {
            throw new IllegalStateException("Car App API level hasn't been established yet");
        }
        if (i < 3) {
            throw new xw("Create CarHardwareManager failed", new IllegalArgumentException("Attempted to retrieve CarHardwareManager service, but the host is less than 3"));
        }
        try {
            ServiceInfo serviceInfoA = xi.a(xrVar);
            String string = serviceInfoA.metaData != null ? serviceInfoA.metaData.getString("androidx.car.app.CarAppMetadataHolderService.CAR_HARDWARE_MANAGER") : null;
            if (string != null) {
                return (yq) Class.forName(string).getConstructor(xr.class, xv.class).newInstance(xrVar, xvVar);
            }
            throw new ClassNotFoundException("CarHardwareManager metadata could not be found");
        } catch (PackageManager.NameNotFoundException | ReflectiveOperationException unused) {
            throw new IllegalStateException("CarHardwareManager not configured. Did you forget to add a dependency on app-automotive or app-projected artifacts?");
        }
    }

    public static final Object b(ListenableFuture listenableFuture, awoq awoqVar) throws Throwable {
        try {
            if (listenableFuture.isDone()) {
                int i = aqh.c;
                return a.i(listenableFuture);
            }
            awud awudVar = new awud(JniZero.q(awoqVar), 1);
            awudVar.w();
            listenableFuture.addListener(new tln(listenableFuture, (awuc) awudVar, 1), aqn.INSTANCE);
            awudVar.b(new vdt(listenableFuture, 1));
            return awudVar.j();
        } catch (ExecutionException e) {
            throw c(e);
        }
    }

    public static final Throwable c(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        cause.getClass();
        return cause;
    }

    public static final int d(SidecarDeviceState sidecarDeviceState) {
        int iIntValue;
        try {
            try {
                iIntValue = sidecarDeviceState.posture;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                iIntValue = 0;
            }
        } catch (NoSuchFieldError unused2) {
            Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
            objInvoke.getClass();
            iIntValue = ((Integer) objInvoke).intValue();
        }
        if (iIntValue < 0 || iIntValue > 4) {
            return 0;
        }
        return iIntValue;
    }

    public static final List e(SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        try {
            try {
                List list = sidecarWindowLayoutInfo.displayFeatures;
                return list == null ? awno.a : list;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return awno.a;
            }
        } catch (NoSuchFieldError unused2) {
            Object objInvoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
            objInvoke.getClass();
            return (List) objInvoke;
        }
        return awno.a;
    }

    public static final dwy f(dwz dwzVar, WindowLayoutInfo windowLayoutInfo) {
        dwq dwqVar;
        dwp dwpVar;
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        displayFeatures.getClass();
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            dwr dwrVar = null;
            if (foldingFeature instanceof FoldingFeature) {
                FoldingFeature foldingFeature2 = foldingFeature;
                foldingFeature2.getClass();
                int type = foldingFeature2.getType();
                if (type == 1) {
                    dwqVar = dwq.a;
                } else if (type == 2) {
                    dwqVar = dwq.b;
                }
                int state = foldingFeature2.getState();
                if (state == 1) {
                    dwpVar = dwp.a;
                } else if (state == 2) {
                    dwpVar = dwp.b;
                }
                Rect bounds = foldingFeature2.getBounds();
                bounds.getClass();
                dwd dwdVar = new dwd(bounds);
                Rect rectA = dwzVar.a();
                if ((dwdVar.a() != 0 || dwdVar.b() != 0) && ((dwdVar.b() == rectA.width() || dwdVar.a() == rectA.height()) && ((dwdVar.b() >= rectA.width() || dwdVar.a() >= rectA.height()) && (dwdVar.b() != rectA.width() || dwdVar.a() != rectA.height())))) {
                    Rect bounds2 = foldingFeature2.getBounds();
                    bounds2.getClass();
                    dwrVar = new dwr(new dwd(bounds2), dwqVar, dwpVar);
                }
            }
            if (dwrVar != null) {
                arrayList.add(dwrVar);
            }
        }
        int i = dwh.a;
        int engagementModeFlags = dwh.a() >= 10 ? windowLayoutInfo.getEngagementModeFlags() : 3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if ((engagementModeFlags & 1) != 0) {
            linkedHashSet.add(dwx.a);
        }
        if ((engagementModeFlags & 2) != 0) {
            linkedHashSet.add(dwx.b);
        }
        return new dwy(arrayList, atqq.aw(linkedHashSet));
    }

    public static final dwy g(Context context, WindowLayoutInfo windowLayoutInfo) {
        dxd dxdVar = new dxd();
        if (Build.VERSION.SDK_INT >= 30) {
            return f(azw.r().b(context, dxdVar.b), windowLayoutInfo);
        }
        if (Build.VERSION.SDK_INT < 29 || !(context instanceof Activity)) {
            throw new UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
        }
        return f(dxdVar.a((Activity) context), windowLayoutInfo);
    }

    public static elq h() {
        if (!dvy.e.d()) {
            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
        }
        if (elq.b == null) {
            elq.b = new elq(dwa.a.a());
        }
        return elq.b;
    }
}
