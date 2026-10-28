package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class edu implements eco, eaa {
    public static final String a = dzf.a("SystemFgDispatcher");
    public static final /* synthetic */ int k = 0;
    public final ebm b;
    public final Object c = new Object();
    eek d;
    final Map e;
    public final Map f;
    public final Map g;
    public edt h;
    public final dov i;
    public final axfd j;
    private final Context l;

    public edu(Context context) {
        this.l = context;
        ebm ebmVarJ = ebm.j(context);
        this.b = ebmVarJ;
        this.j = ebmVarJ.k;
        this.d = null;
        this.e = new LinkedHashMap();
        this.g = new HashMap();
        this.f = new HashMap();
        this.i = new dov(ebmVarJ.l);
        ebmVarJ.f.c(this);
    }

    @Override // defpackage.eaa
    public final void a(eek eekVar, boolean z) {
        Map.Entry entry;
        synchronized (this.c) {
            awwd awwdVar = ((ees) this.f.remove(eekVar)) != null ? (awwd) this.g.remove(eekVar) : null;
            if (awwdVar != null) {
                awwdVar.p(null);
            }
        }
        Map map = this.e;
        dyv dyvVar = (dyv) map.remove(eekVar);
        if (eekVar.equals(this.d)) {
            if (map.size() > 0) {
                Iterator it = map.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.d = (eek) entry.getKey();
                if (this.h != null) {
                    dyv dyvVar2 = (dyv) entry.getValue();
                    edt edtVar = this.h;
                    int i = dyvVar2.a;
                    edtVar.c(i, dyvVar2.b, dyvVar2.c);
                    this.h.a(i);
                }
            } else {
                this.d = null;
            }
        }
        edt edtVar2 = this.h;
        if (dyvVar == null || edtVar2 == null) {
            return;
        }
        dzf.b();
        int i2 = dyvVar.a;
        Objects.toString(eekVar);
        int i3 = dyvVar.b;
        edtVar2.a(i2);
    }

    public final void b(Intent intent) {
        if (this.h == null) {
            throw new IllegalStateException("handleNotify was called on the destroyed dispatcher");
        }
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        eek eekVar = new eek(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        dzf.b();
        if (notification == null) {
            throw new IllegalArgumentException("Notification passed in the intent was null.");
        }
        dyv dyvVar = new dyv(intExtra, notification, intExtra2);
        Map map = this.e;
        map.put(eekVar, dyvVar);
        dyv dyvVar2 = (dyv) map.get(this.d);
        if (dyvVar2 == null) {
            this.d = eekVar;
        } else {
            this.h.b(intExtra, notification);
            if (Build.VERSION.SDK_INT >= 29) {
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    i |= ((dyv) ((Map.Entry) it.next()).getValue()).b;
                }
                dyvVar = new dyv(dyvVar2.a, dyvVar2.c, i);
            } else {
                dyvVar = dyvVar2;
            }
        }
        this.h.c(dyvVar.a, dyvVar.b, dyvVar.c);
    }

    public final void c() {
        this.h = null;
        synchronized (this.c) {
            Iterator it = this.g.values().iterator();
            while (it.hasNext()) {
                ((awwd) it.next()).p(null);
            }
        }
        this.b.f.d(this);
    }

    public final void d(int i, int i2) {
        dzf.b();
        for (Map.Entry entry : this.e.entrySet()) {
            if (((dyv) entry.getValue()).b == i2) {
                this.b.m((eek) entry.getKey(), -128);
            }
        }
        edt edtVar = this.h;
        if (edtVar != null) {
            edtVar.d(i);
        }
    }

    @Override // defpackage.eco
    public final void e(ees eesVar, bou bouVar) {
        if (bouVar instanceof eci) {
            dzf.b();
            this.b.m(bou.e(eesVar), ((eci) bouVar).a);
        }
    }
}
