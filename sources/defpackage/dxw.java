package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.util.Log;
import androidx.window.layout.adapter.sidecar.DistinctElementSidecarCallback;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import defpackage.azw;
import defpackage.dwy;
import defpackage.dxq;
import defpackage.dxs;
import defpackage.dxu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dxw implements dxj {
    public static volatile dxw a;
    public static final ReentrantLock b = new ReentrantLock();
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    private final dxu d;

    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.window.sidecar.SidecarInterface, java.lang.Object] */
    public dxw(final dxu dxuVar) {
        this.d = dxuVar;
        if (dxuVar != null) {
            dxuVar.e = new dxs(new dxv(this));
            ?? r2 = dxuVar.a;
            if (r2 != 0) {
                r2.setSidecarCallback(new DistinctElementSidecarCallback(new SidecarInterface.SidecarCallback() { // from class: androidx.window.layout.adapter.sidecar.SidecarCompat$TranslatingCallback
                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.window.sidecar.SidecarInterface, java.lang.Object] */
                    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
                        ?? r4;
                        sidecarDeviceState.getClass();
                        dxu dxuVar2 = dxuVar;
                        for (Activity activity : dxuVar2.c.values()) {
                            IBinder iBinderS = azw.s(activity);
                            SidecarWindowLayoutInfo windowLayoutInfo = null;
                            if (iBinderS != null && (r4 = dxuVar2.a) != 0) {
                                windowLayoutInfo = r4.getWindowLayoutInfo(iBinderS);
                            }
                            Object obj = dxuVar2.e;
                            if (obj != null) {
                                ((dxs) obj).a(activity, ((dxq) dxuVar2.b).a(windowLayoutInfo, sidecarDeviceState));
                            }
                        }
                    }

                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.window.sidecar.SidecarInterface, java.lang.Object] */
                    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
                        SidecarDeviceState sidecarDeviceState;
                        iBinder.getClass();
                        sidecarWindowLayoutInfo.getClass();
                        dxu dxuVar2 = dxuVar;
                        Activity activity = (Activity) dxuVar2.c.get(iBinder);
                        if (activity == null) {
                            Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                            return;
                        }
                        Object obj = dxuVar2.b;
                        ?? r1 = dxuVar2.a;
                        if (r1 == 0 || (sidecarDeviceState = r1.getDeviceState()) == null) {
                            sidecarDeviceState = new SidecarDeviceState();
                        }
                        dwy dwyVarA = ((dxq) obj).a(sidecarWindowLayoutInfo, sidecarDeviceState);
                        Object obj2 = dxuVar2.e;
                        if (obj2 != null) {
                            ((dxs) obj2).a(activity, dwyVarA);
                        }
                    }
                }, null));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.window.sidecar.SidecarInterface, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.dxj
    public final void a(axo axoVar) {
        synchronized (b) {
            dxu dxuVar = this.d;
            if (dxuVar != null) {
                ArrayList arrayList = new ArrayList();
                CopyOnWriteArrayList copyOnWriteArrayList = this.c;
                Iterator it = copyOnWriteArrayList.iterator();
                it.getClass();
                while (it.hasNext()) {
                    aeiv aeivVar = (aeiv) it.next();
                    if (aeivVar.b == axoVar) {
                        aeivVar.getClass();
                        arrayList.add(aeivVar);
                    }
                }
                copyOnWriteArrayList.removeAll(arrayList);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Object obj = ((aeiv) it2.next()).a;
                    if (!copyOnWriteArrayList.isEmpty()) {
                        Iterator it3 = copyOnWriteArrayList.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (awrc.c(((aeiv) it3.next()).a, obj)) {
                                }
                            }
                        }
                    }
                    IBinder iBinderS = azw.s((Activity) obj);
                    if (iBinderS == null) {
                        continue;
                    } else {
                        ?? r4 = dxuVar.a;
                        if (r4 != 0) {
                            r4.onWindowLayoutChangeListenerRemoved(iBinderS);
                        }
                        ?? r5 = dxuVar.d;
                        axo axoVar2 = (axo) r5.get(obj);
                        if (axoVar2 != null) {
                            if (obj instanceof avi) {
                                ((avi) obj).removeOnConfigurationChangedListener(axoVar2);
                            }
                            r5.remove(obj);
                        }
                        Object obj2 = dxuVar.e;
                        if (obj2 != null) {
                            ReentrantLock reentrantLock = ((dxs) obj2).a;
                            reentrantLock.lock();
                            try {
                                ((dxs) obj2).b.put(obj, null);
                                reentrantLock.unlock();
                            } catch (Throwable th) {
                                reentrantLock.unlock();
                                throw th;
                            }
                        }
                        ?? r2 = dxuVar.c;
                        int size = r2.size();
                        r2.remove(iBinderS);
                        if (size == 1 && r4 != 0) {
                            r4.onDeviceStateListenersChanged(true);
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.dxj
    public final void b(Context context, axo axoVar) {
        Object next;
        ReentrantLock reentrantLock = b;
        reentrantLock.lock();
        try {
            dxu dxuVar = this.d;
            if (dxuVar == null) {
                axoVar.accept(new dwy(awno.a));
            } else {
                CopyOnWriteArrayList copyOnWriteArrayList = this.c;
                boolean z = false;
                if (!copyOnWriteArrayList.isEmpty()) {
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        if (awrc.c(((aeiv) it.next()).a, context)) {
                            z = true;
                            break;
                        }
                    }
                }
                aeiv aeivVar = new aeiv(context, axoVar);
                copyOnWriteArrayList.add(aeivVar);
                if (z) {
                    Iterator it2 = copyOnWriteArrayList.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                    } while (!awrc.c(context, ((aeiv) next).a));
                    aeiv aeivVar2 = (aeiv) next;
                    Object obj = aeivVar2 != null ? aeivVar2.c : null;
                    if (obj != null) {
                        aeivVar.x((dwy) obj);
                    }
                } else {
                    IBinder iBinderS = azw.s((Activity) context);
                    if (iBinderS != null) {
                        dxuVar.b(iBinderS, (Activity) context);
                    } else {
                        ((Activity) context).getWindow().getDecorView().addOnAttachStateChangeListener(new dxt(dxuVar, (Activity) context));
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
