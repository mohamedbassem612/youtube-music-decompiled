package defpackage;

import android.app.Application;
import android.content.Context;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wmy {
    public volatile boolean a;
    public final Object b;
    public final Object c;
    public final Object d;

    /* JADX WARN: Multi-variable type inference failed */
    public wmy(Context context, awmd awmdVar, tqj tqjVar) {
        this.d = tqjVar;
        int i = tqr.a;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (tqjVar.k(1073830161)) {
            oml omlVar = (oml) awmdVar.io();
            this.b = omlVar;
            this.c = null;
            int i2 = 1;
            this.a = omlVar.i() == 2;
            omlVar.g(new xiw(this, i2));
            omlVar.g(new xix(this, i2));
            return;
        }
        this.a = qel.d(context);
        this.b = null;
        tdd tddVar = new tdd(tqjVar);
        this.c = tddVar;
        tddVar.a(new twc((Object) this, (int) (objArr2 == true ? 1 : 0)));
        tddVar.a(new twd((Object) this, (int) (objArr == true ? 1 : 0)));
        tddVar.b((Application) context.getApplicationContext());
    }

    public static final void b(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, tqj] */
    public final void a(tcu tcuVar) {
        int i = tqr.a;
        if (this.d.k(1073830161)) {
            Object obj = this.b;
            if (obj != null) {
                ((oml) obj).g(tcuVar);
                return;
            }
            return;
        }
        Object obj2 = this.c;
        if (obj2 != null) {
            ((tdd) obj2).a(tcuVar);
        }
    }

    public wmy() {
        this.b = new bou();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashSet();
    }

    public wmy(Context context, syn synVar, vxz vxzVar) {
        this.a = false;
        this.b = context;
        this.c = synVar;
        this.d = vxzVar;
    }
}
