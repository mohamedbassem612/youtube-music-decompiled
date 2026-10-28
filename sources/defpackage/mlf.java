package defpackage;

import com.google.android.libraries.elements.interfaces.ComponentState;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mlf extends bpi implements avmn {
    private Map a;
    private Map b;
    private final Object c = new Object();
    private volatile boolean d = false;

    public final mqt a(String str) {
        mqt mqtVar;
        synchronized (this.c) {
            Map map = this.b;
            mqtVar = map == null ? null : (mqt) map.get(str);
        }
        return mqtVar;
    }

    public final synchronized ComponentState b(String str) {
        Map map = this.a;
        if (map == null) {
            return null;
        }
        return (ComponentState) map.get(str);
    }

    public final synchronized void c(String str, ComponentState componentState) {
        if (this.a == null) {
            this.a = new HashMap();
        }
        this.a.put(str, componentState);
    }

    @Override // defpackage.bpi
    protected final void d() {
        dispose();
    }

    @Override // defpackage.avmn
    public final synchronized void dispose() {
        if (this.d) {
            return;
        }
        Map map = this.a;
        if (map != null) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((ComponentState) it.next()).dispose();
            }
            map.clear();
        }
        this.d = true;
    }

    public final void e(String str, mqt mqtVar) {
        synchronized (this.c) {
            if (this.b == null) {
                this.b = new HashMap();
            }
            this.b.put(str, mqtVar);
        }
    }

    @Override // defpackage.avmn
    public final synchronized boolean f() {
        return this.d;
    }

    public final synchronized boolean g() {
        boolean z;
        Map map;
        synchronized (this.c) {
            try {
                Map map2 = this.a;
                z = false;
                if ((map2 == null || map2.isEmpty()) && ((map = this.b) == null || map.isEmpty())) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }
}
