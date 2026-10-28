package com.google.vr.cardboard;

import android.os.Handler;
import android.util.Log;
import android.view.Surface;
import defpackage.a;
import defpackage.aujb;
import defpackage.aujc;
import defpackage.aujd;
import defpackage.auje;
import defpackage.aujf;
import defpackage.aujg;
import defpackage.auji;
import defpackage.axoz;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public class ExternalSurfaceManager {
    private static final String b = "ExternalSurfaceManager";
    public final aujc a;
    private final Object c;
    private int d;
    private boolean e;
    private volatile axoz f;

    public ExternalSurfaceManager(long j) {
        aujc aujcVar = new aujc(j);
        this.c = new Object();
        this.f = new axoz();
        this.d = 1;
        this.a = aujcVar;
    }

    private final int a(int i, int i2, aujf aujfVar, boolean z) {
        int i3;
        synchronized (this.c) {
            axoz axozVar = new axoz(this.f);
            i3 = this.d;
            this.d = i3 + 1;
            ((HashMap) axozVar.a).put(Integer.valueOf(i3), new auje(i3, i, i2, aujfVar, z));
            this.f = axozVar;
        }
        return i3;
    }

    private final void b(aujg aujgVar) {
        axoz axozVar = this.f;
        if (this.e) {
            HashMap map = (HashMap) axozVar.a;
            if (!map.isEmpty()) {
                for (auje aujeVar : map.values()) {
                    aujeVar.a();
                    aujgVar.a(aujeVar);
                }
            }
        }
        HashMap map2 = (HashMap) axozVar.b;
        if (map2.isEmpty()) {
            return;
        }
        Iterator it = map2.values().iterator();
        while (it.hasNext()) {
            ((auje) it.next()).c(this.a);
        }
    }

    public static native void nativeCallback(long j);

    public static native void nativeUpdateSurface(long j, int i, int i2, long j2, float[] fArr);

    public void consumerAttachToCurrentGLContext(Map map) {
        this.e = true;
        axoz axozVar = this.f;
        if (!((HashMap) this.f.a).isEmpty()) {
            for (Integer num : ((HashMap) this.f.a).keySet()) {
                if (!map.containsKey(num)) {
                    Log.e(b, String.format("Surface %d's texture ID is not provided, abandoning attaching to current GL context.", num));
                    return;
                }
            }
        }
        if (map.isEmpty()) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            HashMap map2 = (HashMap) axozVar.a;
            if (map2.containsKey(entry.getKey())) {
                ((auje) map2.get(entry.getKey())).b(((Integer) entry.getValue()).intValue());
            } else {
                Log.e(b, String.format("Surface %d doesn't exist, skip attaching to current GL context.", entry.getKey()));
            }
        }
    }

    public void consumerDetachFromCurrentGLContext() {
        this.e = false;
        HashMap map = (HashMap) this.f.a;
        if (map.isEmpty()) {
            return;
        }
        for (auje aujeVar : map.values()) {
            if (aujeVar.i) {
                aujf aujfVar = aujeVar.b;
                if (aujfVar != null) {
                    aujfVar.a();
                }
                aujeVar.g.detachFromGLContext();
                aujeVar.i = false;
            }
        }
    }

    public void consumerUpdateManagedSurfaces() {
        b(new aujb(this, 0));
    }

    public void consumerUpdateManagedSurfacesSequentially() {
        b(new aujb(this, 1));
    }

    public int createExternalSurface(int i, int i2, Runnable runnable, Runnable runnable2, Handler handler) {
        if (runnable == null || handler == null) {
            throw new IllegalArgumentException("Surface listener and handler must both be non-null for external Surface creation for Java callbacks.");
        }
        return a(i, i2, new aujd(runnable, runnable2, handler), false);
    }

    public int createExternalSurfaceWithNativeCallback(int i, int i2, long j, long j2, boolean z) {
        return a(i, i2, new auji(j, j2), z);
    }

    public Surface getSurface(int i) {
        Object obj = this.f.a;
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = (HashMap) obj;
        if (!map.containsKey(numValueOf)) {
            Log.e(b, a.bP(i, "Surface with ID ", " does not exist, returning null"));
            return null;
        }
        auje aujeVar = (auje) map.get(numValueOf);
        if (aujeVar.i) {
            return aujeVar.h;
        }
        return null;
    }

    public void releaseExternalSurface(int i) {
        synchronized (this.c) {
            axoz axozVar = new axoz(this.f);
            Object obj = axozVar.a;
            Integer numValueOf = Integer.valueOf(i);
            auje aujeVar = (auje) ((HashMap) obj).remove(numValueOf);
            if (aujeVar != null) {
                ((HashMap) axozVar.b).put(numValueOf, aujeVar);
                this.f = axozVar;
            } else {
                Log.e(b, a.bR(i, "Not releasing nonexistent surface ID "));
            }
        }
    }

    public void shutdown() {
        synchronized (this.c) {
            axoz axozVar = this.f;
            this.f = new axoz();
            Object obj = axozVar.a;
            if (!((HashMap) obj).isEmpty()) {
                Iterator it = ((HashMap) obj).entrySet().iterator();
                while (it.hasNext()) {
                    ((auje) ((Map.Entry) it.next()).getValue()).c(this.a);
                }
            }
            Object obj2 = axozVar.b;
            if (!((HashMap) obj2).isEmpty()) {
                Iterator it2 = ((HashMap) obj2).entrySet().iterator();
                while (it2.hasNext()) {
                    ((auje) ((Map.Entry) it2.next()).getValue()).c(this.a);
                }
            }
        }
    }

    public int createExternalSurface() {
        return a(-1, -1, null, false);
    }

    public void consumerAttachToCurrentGLContext() {
        this.e = true;
        HashMap map = (HashMap) this.f.a;
        if (map.isEmpty()) {
            return;
        }
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((auje) it.next()).a();
        }
    }
}
