package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.input.InputManager;
import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dwt {
    static final /* synthetic */ dwt a = new dwt();
    public static final /* synthetic */ int b = 0;
    private static final awmi c;

    static {
        int i = awrn.a;
        new awqv(dwu.class).c();
        c = new awmp(new aho(9));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0078  */
    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.window.sidecar.SidecarInterface, java.lang.Object] */
    public final dwu a(Context context) {
        Method method;
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        dxj dxjVar = (dxj) c.a();
        if (dxjVar == null) {
            if (dxw.a == null) {
                ReentrantLock reentrantLock = dxw.b;
                reentrantLock.lock();
                try {
                    if (dxw.a == null) {
                        dxu dxuVar = null;
                        try {
                            dwl dwlVarT = azw.t();
                            if (dwlVarT != null && dwlVarT.compareTo(dwl.a) >= 0) {
                                dxu dxuVar2 = new dxu(context);
                                ?? r6 = dxuVar2.a;
                                Method method2 = (r6 == 0 || (cls3 = r6.getClass()) == null) ? null : cls3.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class);
                                Class<?> returnType = method2 != null ? method2.getReturnType() : null;
                                if (!awrc.c(returnType, Void.TYPE)) {
                                    throw new NoSuchMethodException("Illegal return type for 'setSidecarCallback': " + returnType);
                                }
                                if (r6 != 0) {
                                    r6.getDeviceState();
                                    r6.onDeviceStateListenersChanged(true);
                                    Class<?> cls4 = r6.getClass();
                                    if (cls4 != null) {
                                        method = cls4.getMethod("getWindowLayoutInfo", IBinder.class);
                                    } else {
                                        method = null;
                                    }
                                } else {
                                    method = null;
                                }
                                Class<?> returnType2 = method != null ? method.getReturnType() : null;
                                if (!awrc.c(returnType2, SidecarWindowLayoutInfo.class)) {
                                    throw new NoSuchMethodException("Illegal return type for 'getWindowLayoutInfo': " + returnType2);
                                }
                                Method method3 = (r6 == 0 || (cls2 = r6.getClass()) == null) ? null : cls2.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
                                Class<?> returnType3 = method3 != null ? method3.getReturnType() : null;
                                if (!awrc.c(returnType3, Void.TYPE)) {
                                    throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerAdded': " + returnType3);
                                }
                                Method method4 = (r6 == 0 || (cls = r6.getClass()) == null) ? null : cls.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
                                Class<?> returnType4 = method4 != null ? method4.getReturnType() : null;
                                if (!awrc.c(returnType4, Void.TYPE)) {
                                    throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerRemoved': " + returnType4);
                                }
                                SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
                                try {
                                    sidecarDeviceState.posture = 3;
                                } catch (NoSuchFieldError unused) {
                                    SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, 3);
                                    Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                                    objInvoke.getClass();
                                    if (((Integer) objInvoke).intValue() != 3) {
                                        throw new Exception("Invalid device posture getter/setter");
                                    }
                                }
                                SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
                                Rect rect = sidecarDisplayFeature.getRect();
                                rect.getClass();
                                sidecarDisplayFeature.setRect(rect);
                                sidecarDisplayFeature.getType();
                                sidecarDisplayFeature.setType(1);
                                SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new SidecarWindowLayoutInfo();
                                try {
                                    List list = sidecarWindowLayoutInfo.displayFeatures;
                                } catch (NoSuchFieldError unused2) {
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(sidecarDisplayFeature);
                                    SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(sidecarWindowLayoutInfo, arrayList);
                                    Object objInvoke2 = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
                                    objInvoke2.getClass();
                                    if (!awrc.c(arrayList, (List) objInvoke2)) {
                                        throw new Exception("Invalid display feature getter/setter");
                                    }
                                }
                                dxuVar = dxuVar2;
                            }
                        } catch (Throwable unused3) {
                        }
                        dxw.a = new dxw(dxuVar);
                    }
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            dxjVar = dxw.a;
            dxjVar.getClass();
        }
        int i = dxf.a;
        if (dxe.a == null) {
            ReentrantLock reentrantLock2 = dxe.b;
            reentrantLock2.lock();
            try {
                if (dxe.a == null) {
                    Object systemService = context.getApplicationContext().getSystemService("input");
                    systemService.getClass();
                    dov dovVar = new dov((InputManager) systemService);
                    dxc.a.a();
                    new dxi(dovVar);
                    dxe.a = new dxg();
                }
                reentrantLock2.unlock();
            } catch (Throwable th2) {
                reentrantLock2.unlock();
                throw th2;
            }
        }
        dxe.a.getClass();
        new dxd();
        int i2 = dwh.a;
        dwh.a();
        return new dww(dxjVar);
    }
}
