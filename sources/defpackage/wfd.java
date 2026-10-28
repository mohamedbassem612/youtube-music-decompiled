package defpackage;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wfd {
    private final Function a;
    private final zwb b;
    private final Map c = new HashMap();
    private zwa d;
    private wek e;

    public wfd(zwb zwbVar, Function function) {
        this.b = zwbVar;
        this.a = function;
    }

    private final synchronized wek e(zwa zwaVar) {
        wek wekVar;
        WeakReference weakReference = new WeakReference(null);
        Map map = this.c;
        wekVar = (wek) ((WeakReference) j$.util.Map.EL.getOrDefault(map, zwaVar, weakReference)).get();
        if (wekVar == null) {
            wekVar = (wek) this.a.apply(zwaVar);
            map.put(zwaVar, new WeakReference(wekVar));
            wekVar.getClass();
        }
        return wekVar;
    }

    public final wek a() {
        zwa zwaVarE = this.b.e();
        zwaVarE.getClass();
        return b(zwaVarE);
    }

    public final synchronized wek b(zwa zwaVar) {
        wek wekVarE;
        try {
            if (zwaVar == null) {
                throw new IllegalArgumentException("Cannot produce a valid store for the null Identity - this is an unrecoverable failure.");
            }
            zwa zwaVarE = this.b.e();
            boolean z = zwaVarE != null && zik.cq(zwaVar, zwaVarE);
            zwa zwaVar2 = this.d;
            boolean z2 = zwaVar2 != null && zik.cq(zwaVar, zwaVar2);
            if (z) {
                if (!z2) {
                    wek wekVarE2 = e(zwaVar);
                    this.d = zwaVar;
                    this.e = wekVarE2;
                }
                wekVarE = this.e;
                wekVarE.getClass();
            } else if (z2) {
                wekVarE = this.e;
                wekVarE.getClass();
                this.d = null;
                this.e = null;
            } else {
                wekVarE = e(zwaVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return wekVarE;
    }

    public final synchronized void c(zwa zwaVar) {
        this.c.remove(zwaVar);
        zwa zwaVar2 = this.d;
        if (zwaVar2 != null && zik.cq(zwaVar, zwaVar2)) {
            this.d = null;
            this.e = null;
        }
    }

    public final synchronized void d() {
        zwa zwaVar = this.d;
        if (zwaVar != null && zik.cq(zwaVar, this.b.e())) {
            this.d = null;
            this.e = null;
        }
    }
}
