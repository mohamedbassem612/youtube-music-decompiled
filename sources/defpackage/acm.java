package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class acm {
    public Object a;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map] */
    public final void a(nyc nycVar, fkt fktVar, fiz fizVar) {
        if (this.a == null) {
            this.a = new LinkedHashMap();
        }
        String str = "imageprefetch_" + nycVar.hashCode();
        xsc xscVar = (xsc) this.a.get(str);
        if (xscVar == null) {
            this.a.put(str, new xsc(nycVar, fktVar, fizVar));
        } else {
            xscVar.c.add(fktVar);
        }
    }

    public final void b(Object obj) {
        ((aqi) this.a).b(obj);
    }

    public final void c(wjf wjfVar, String str, rsu rsuVar) {
        Object obj = this.a;
        if (obj == null) {
            throw new rso("Null interrupt when trying to play interstitial video", 69);
        }
        qcb qcbVar = new qcb(rsuVar);
        acie acieVar = (acie) obj;
        acieVar.a();
        acieVar.c = qcbVar;
        acieVar.b.a.jP(wjfVar, str);
        acieVar.a = true;
    }

    public final void d() {
        Object obj = this.a;
        if (obj != null) {
            acie acieVar = (acie) obj;
            acieVar.a();
            if (acieVar.c != null && acieVar.a) {
                acieVar.a = false;
                acieVar.b.a.d();
            }
            acig acigVar = acieVar.b;
            acigVar.b.execute(new acnp(acigVar, obj, 1, null));
            acigVar.a.a();
            acigVar.e = null;
            acigVar.b();
            this.a = null;
        }
    }

    public final void e(acfw acfwVar, rsu rsuVar) {
        if (acfwVar == null) {
            throw new rso("VideoPlayback wasn't available when trying to request interrupt", 65);
        }
        acig acigVarH = acfwVar.h();
        if (acigVarH == null) {
            throw new rso("VideoInterrupt.Controller wasn't available when trying to request interrupt", 66);
        }
        if (this.a != null) {
            throw new rso("Tried to enter PlayerBytesSlot when interrupt already acquired", 67);
        }
        acigVarH.g.add(new yhi(this, rsuVar, (char[]) null));
        acigVarH.b();
    }

    public final boolean f() {
        return this.a != null;
    }
}
