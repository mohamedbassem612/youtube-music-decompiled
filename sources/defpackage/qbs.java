package defpackage;

import android.content.Context;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qbs implements qbn {
    public static final agsn a = agsn.h("GnpSdk");
    public final pve b;
    public final pct c;
    public final pav d;
    public final awou e;
    public final awou f;
    public final omm g;
    private final Context h;
    private final pls i;
    private final awmd j;
    private final pgs k;

    public qbs(Context context, phe pheVar, omm ommVar, pve pveVar, pct pctVar, pav pavVar, pls plsVar, awmd awmdVar, tld tldVar, awou awouVar, awou awouVar2, pgs pgsVar) {
        context.getClass();
        pheVar.getClass();
        ommVar.getClass();
        pveVar.getClass();
        pctVar.getClass();
        pavVar.getClass();
        plsVar.getClass();
        awmdVar.getClass();
        tldVar.getClass();
        awouVar.getClass();
        awouVar2.getClass();
        pgsVar.getClass();
        this.h = context;
        this.g = ommVar;
        this.b = pveVar;
        this.c = pctVar;
        this.d = pavVar;
        this.i = plsVar;
        this.j = awmdVar;
        this.e = awouVar;
        this.f = awouVar2;
        this.k = pgsVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.qbn
    public final Object a(plx plxVar, String str, plb plbVar, aifv aifvVar, awoq awoqVar) throws Throwable {
        qbp qbpVar;
        if (awoqVar instanceof qbp) {
            qbpVar = (qbp) awoqVar;
            int i = qbpVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qbpVar.c = i - Integer.MIN_VALUE;
            } else {
                qbpVar = new qbp(this, awoqVar);
            }
        } else {
            qbpVar = new qbp(this, awoqVar);
        }
        qbp qbpVar2 = qbpVar;
        Object obj = qbpVar2.a;
        awox awoxVar = awox.a;
        int i2 = qbpVar2.c;
        if (i2 == 0) {
            atqp.j(obj);
            pgs pgsVar = this.k;
            pxk pxkVarB = plxVar != null ? plxVar.b() : null;
            phb phbVar = phb.e;
            qbpVar2.c = 1;
            if (pgsVar.c(pxkVarB, str, plbVar, aifvVar, phbVar, qbpVar2) == awoxVar) {
                return awoxVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(obj);
        }
        return awmy.a;
    }

    @Override // defpackage.qbn
    public final void b(pxk pxkVar) throws Throwable {
        awqx.l(this.e, new qbj(this, pxkVar, (awoq) null, 2));
    }

    @Override // defpackage.qbn
    public final void c(pxk pxkVar, List list) throws Throwable {
        awqx.l(this.e, new gme(this, pxkVar, list, (awoq) null, 12));
    }

    @Override // defpackage.qbn
    public final boolean d(StatusBarNotification statusBarNotification) {
        statusBarNotification.getClass();
        return ((Boolean) awqx.l(this.e, new qbj(this, statusBarNotification, (awoq) null, 3))).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(pxk pxkVar, awoq awoqVar) {
        qbo qboVar;
        if (awoqVar instanceof qbo) {
            qboVar = (qbo) awoqVar;
            int i = qboVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qboVar.c = i - Integer.MIN_VALUE;
            } else {
                qboVar = new qbo(this, awoqVar);
            }
        } else {
            qboVar = new qbo(this, awoqVar);
        }
        Object objB = qboVar.a;
        awox awoxVar = awox.a;
        int i2 = qboVar.c;
        if (i2 == 0) {
            atqp.j(objB);
            if (pxkVar == null) {
                return null;
            }
            pve pveVar = this.b;
            qboVar.c = 1;
            objB = pveVar.b(pxkVar, qboVar);
            if (objB == awoxVar) {
                return awoxVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(objB);
        }
        pky pkyVar = (pky) objB;
        int iAu = a.au(pkyVar);
        if (iAu != 0) {
            if (iAu != 1) {
                throw new awmj();
            }
            throw new plu("Failed to fetch account from storage");
        }
        plx plxVar = (plx) ((pla) pkyVar).a;
        if (plxVar != null) {
            return plxVar;
        }
        throw new plu("Account was not in storage");
    }

    public final Object f(plx plxVar, List list, awoq awoqVar) {
        Object objA = nxf.a(this.f, this.e, new qbq(list, this, plxVar, (awoq) null, 0), awoqVar);
        return objA != awox.a ? awmy.a : objA;
    }

    public final void g(pqf pqfVar) {
        ((pwf) this.j.io()).m(this.h.getPackageName(), this.i.a, Build.VERSION.SDK_INT, pqfVar.name());
    }
}
