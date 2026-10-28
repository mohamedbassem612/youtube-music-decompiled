package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qkh {
    public final Context c;
    public final agfr d;
    public final agfr e;
    public final qnf f;
    public final agfr g;
    public final qms h;
    public final axfd i = new axfd((byte[]) null);
    private final agfr m;
    private final agfr n;
    private static final Object j = new Object();
    public static final AtomicReference a = new AtomicReference();
    private static volatile qkh k = null;
    private static volatile qkh l = null;
    public static final agfr b = aguu.al(new jxp(12));

    public qkh(Context context, agfr agfrVar, agfr agfrVar2, agfr agfrVar3, agfr agfrVar4, agfr agfrVar5) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        agfrVar.getClass();
        agfrVar2.getClass();
        agfrVar3.getClass();
        agfrVar4.getClass();
        agfrVar5.getClass();
        agfr agfrVarAl = aguu.al(agfrVar);
        agfr agfrVarAl2 = aguu.al(agfrVar2);
        agfr agfrVarAl3 = aguu.al(new qhs(agfrVar3, 5));
        agfr agfrVarAl4 = aguu.al(agfrVar4);
        agfr agfrVarAl5 = aguu.al(agfrVar5);
        this.c = applicationContext;
        this.m = agfrVarAl;
        this.n = agfrVarAl2;
        this.d = agfrVarAl3;
        this.e = agfrVarAl4;
        this.f = new qnf(applicationContext, agfrVarAl, agfrVarAl2);
        this.g = agfrVarAl5;
        this.h = new qms(applicationContext, agfrVarAl, agfrVarAl3, agfrVarAl2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static qkh a(Context context) {
        boolean z;
        qkh qkhVar = l;
        qkh qkhVar2 = k;
        if (qkhVar2 != null) {
            return qkhVar2;
        }
        Context applicationContext = context.getApplicationContext();
        try {
            z = true;
        } catch (IllegalStateException unused) {
            z = false;
        }
        synchronized (j) {
            if (k != null) {
                return k;
            }
            agev agevVarBp = agdf.a;
            boolean z2 = applicationContext instanceof qkg;
            if (z2) {
                agevVarBp = ((qkg) applicationContext).bp();
            }
            qkh qkhVar3 = (qkh) agevVarBp.d(new qhs(applicationContext, 2));
            k = qkhVar3;
            if (!z && !z2) {
                qnl.q(Level.CONFIG, qkhVar3.b(), null, "Application doesn't implement PhenotypeApplication interface, falling back to globally set context. See go/phenotype-flag#process-stable-init for more info.", new Object[0]);
            }
            return qkhVar3;
        }
    }

    public static void c(Context context) {
        Context applicationContext;
        if (a.get() == null) {
            try {
                applicationContext = context.getApplicationContext();
            } catch (NullPointerException unused) {
                d();
                qnl.q(Level.WARNING, (Executor) b.io(), null, "context.getApplicationContext() yielded NullPointerException", new Object[0]);
                applicationContext = null;
            }
            if (applicationContext != null) {
                a.ap(a, applicationContext);
            }
        }
    }

    public static void d() {
        synchronized (qkj.a) {
        }
        if (a.get() == null && qkj.b == null) {
            qkj.b = new qki();
        }
    }

    public final ahey b() {
        return (ahey) this.m.io();
    }

    public final kjc e() {
        return (kjc) this.n.io();
    }
}
