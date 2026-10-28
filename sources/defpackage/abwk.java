package defpackage;

import android.content.Context;
import android.net.Uri;
import app.rive.semantics.SemanticState;
import j$.util.Objects;
import java.io.File;
import java.util.HashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abwk {
    public final Object a;
    public final Object b;
    public final Object c;
    public Object d;

    public abwk() {
        this.a = new HashSet();
        awku awkuVar = new awku(agdf.a);
        this.b = awkuVar;
        this.c = awkuVar.E().i(new vqh(0));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [abtj, java.lang.Object] */
    public final synchronized acey a(abnl abnlVar, abnp abnpVar) {
        acey aceyVarA;
        c();
        aceyVarA = this.a.b().a(abnlVar, abnpVar);
        this.d = aceyVarA;
        return aceyVarA;
    }

    public final synchronized void b() {
        c();
        this.d = null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [acey, java.lang.Object] */
    public final void c() {
        ?? r0 = this.d;
        if (r0 != 0) {
            r0.P();
            if (((abmt) this.c).g.l(194, 45684404L, false)) {
                Object obj = this.b;
                Object obj2 = this.d;
                obj2.getClass();
                acfn acfnVar = (acfn) obj;
                if (Objects.equals(obj2, acfnVar.a)) {
                    acfnVar.a = null;
                } else if (Objects.equals(obj2, acfnVar.b)) {
                    acfnVar.b = null;
                }
            }
        }
    }

    public final synchronized void d() {
        if (this.d != null) {
            try {
                Object obj = this.c;
                Uri uriAI = zik.aI((Context) obj);
                File parentFile = ((Context) obj).getFilesDir().getParentFile();
                String path = uriAI.getPath();
                path.getClass();
                new File(parentFile, path).delete();
            } catch (RuntimeException unused) {
            }
            this.d = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, tpq] */
    public final synchronized void e(String str, int i, long j) {
        ?? r0 = this.d;
        if (r0 == 0 || !((agkj) this.b).containsKey(str)) {
            return;
        }
        taf.j(r0.b(new aadz(str, j, i, 1)), new ztb(0));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, tpq] */
    public final synchronized void f(final String str, final int i, final int i2) {
        ?? r0 = this.d;
        if (r0 == 0 || !((agkj) this.b).containsKey(str)) {
            return;
        }
        taf.j(r0.b(new agek() { // from class: ztc
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.agek
            public final Object apply(Object obj) {
                atpn atpnVar = (atpn) obj;
                jrq jrqVar = (jrq) atpnVar.toBuilder();
                String str2 = str;
                jrqVar.e(str2, i);
                str2.getClass();
                Integer num = (Integer) atpnVar.e.get(str2);
                jrqVar.d(str2, (num != null ? num.intValue() : 0) + i2);
                jrqVar.c(str2, true);
                return (atpn) jrqVar.build();
            }
        }), new ztb(2));
    }

    public final boolean g() {
        tao taoVar = (tao) this.a;
        if ((taoVar.e().b & SemanticState.Hidden) != 0) {
            aqiq aqiqVar = taoVar.e().h;
            if (aqiqVar == null) {
                aqiqVar = aqiq.a;
            }
            if (aqiqVar.b) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    public final void h(vqi vqiVar) {
        this.a.add(vqiVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    public final void i(vqi vqiVar) {
        this.a.remove(vqiVar);
    }

    public final ruf j() {
        Object obj = this.d;
        if (obj != null) {
            return (ruf) obj;
        }
        return null;
    }

    public abwk(tao taoVar, Context context, agkj agkjVar, tpq tpqVar) {
        this.a = taoVar;
        this.c = context;
        this.d = tpqVar;
        this.b = agkjVar;
    }

    public abwk(abfx abfxVar, xgn xgnVar, vxe vxeVar, sod... sodVarArr) {
        abfxVar.getClass();
        this.b = abfxVar;
        xgnVar.getClass();
        vxeVar.getClass();
        this.c = vxeVar;
        this.a = sodVarArr;
        abfxVar.i = this;
        abfxVar.a.h = this;
    }

    public abwk(abtj abtjVar, acfn acfnVar, abmt abmtVar) {
        this.a = abtjVar;
        this.b = acfnVar;
        this.c = abmtVar;
    }
}
