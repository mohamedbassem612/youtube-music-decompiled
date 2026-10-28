package defpackage;

import android.database.SQLException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dnv implements dny, dml {
    public final dpt a;
    private final awqk b;
    private final AtomicInteger c;
    private dmz d;

    public dnv(awqk awqkVar, dpt dptVar) {
        dptVar.getClass();
        this.b = awqkVar;
        this.a = dptVar;
        this.c = new AtomicInteger(0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [awqg] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    @Override // defpackage.dml
    public final Object a(String str, awqg awqgVar, awoq awoqVar) throws Exception {
        dns dnsVar;
        ?? r7;
        if (awoqVar instanceof dns) {
            dnsVar = (dns) awoqVar;
            int i = dnsVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                dnsVar.d = i - Integer.MIN_VALUE;
            } else {
                dnsVar = new dns(this, awoqVar);
            }
        } else {
            dnsVar = new dns(this, awoqVar);
        }
        Object objE = dnsVar.b;
        awox awoxVar = awox.a;
        int i2 = dnsVar.d;
        if (i2 == 0) {
            atqp.j(objE);
            dnsVar.e = str;
            dnsVar.a = awqgVar;
            dnsVar.d = 1;
            objE = e();
            if (objE != awoxVar) {
            }
            r7 = awqgVar;
            return awoxVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(objE);
            return objE;
        }
        Object obj = dnsVar.a;
        str = dnsVar.e;
        atqp.j(objE);
        r7 = obj;
        r7 = awqgVar;
        if (((Boolean) objE).booleanValue()) {
            awqk awqkVar = this.b;
            dnt dntVar = new dnt(this, str, r7, null);
            dnsVar.e = null;
            dnsVar.a = null;
            dnsVar.d = 2;
            Object objInvoke = awqkVar.invoke(dntVar, dnsVar);
            if (objInvoke != awoxVar) {
                return objInvoke;
            }
            r7 = awqgVar;
            return awoxVar;
        }
        dpb dpbVarA = this.a.a(str);
        try {
            Object objInvoke2 = r7.invoke(dpbVarA);
            dpbVarA.close();
            return objInvoke2;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    dpbVarA.close();
                } catch (Throwable th3) {
                    avkz.d(th, th3);
                }
                throw th2;
            }
        }
    }

    @Override // defpackage.dny
    public final dpt b() {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00a8 A[Catch: SQLException -> 0x00b0, TryCatch #2 {SQLException -> 0x00b0, blocks: (B:50:0x00a0, B:52:0x00a8, B:53:0x00aa), top: B:64:0x00a0 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(dmz dmzVar, awqk awqkVar, awoq awoqVar) {
        dnr dnrVar;
        Throwable th;
        if (awoqVar instanceof dnr) {
            dnrVar = (dnr) awoqVar;
            int i = dnrVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                dnrVar.d = i - Integer.MIN_VALUE;
            } else {
                dnrVar = new dnr(this, awoqVar);
            }
        } else {
            dnrVar = new dnr(this, awoqVar);
        }
        Object objInvoke = dnrVar.b;
        Object obj = awox.a;
        int i2 = dnrVar.d;
        int i3 = 1;
        try {
            if (i2 == 0) {
                atqp.j(objInvoke);
                int iOrdinal = dmzVar.ordinal();
                if (iOrdinal == 0) {
                    azu.i(this.a, "BEGIN DEFERRED TRANSACTION");
                } else if (iOrdinal == 1) {
                    azu.i(this.a, "BEGIN IMMEDIATE TRANSACTION");
                } else {
                    if (iOrdinal != 2) {
                        throw new awmj();
                    }
                    azu.i(this.a, "BEGIN EXCLUSIVE TRANSACTION");
                }
                if (this.c.incrementAndGet() > 0) {
                    this.d = dmzVar;
                }
                Object dnqVar = new dnq(this);
                dnrVar.a = 1;
                dnrVar.d = 1;
                objInvoke = awqkVar.invoke(dnqVar, dnrVar);
                if (objInvoke == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i3 = dnrVar.a;
                atqp.j(objInvoke);
            }
            if (this.c.decrementAndGet() == 0) {
                this.d = null;
            }
            dpt dptVar = this.a;
            if (i3 != 0) {
                azu.i(dptVar, "END TRANSACTION");
            } else {
                azu.i(dptVar, "ROLLBACK TRANSACTION");
            }
            return objInvoke;
        } catch (Throwable th2) {
            th = th2;
            try {
                if (th instanceof dnm) {
                    dnm dnmVar = th;
                    throw null;
                }
                try {
                    throw th;
                } catch (Throwable th3) {
                    th = th3;
                    if (this.c.decrementAndGet() == 0) {
                        this.d = null;
                    }
                    azu.i(this.a, "ROLLBACK TRANSACTION");
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                th = null;
            }
            try {
                if (this.c.decrementAndGet() == 0) {
                    this.d = null;
                }
                azu.i(this.a, "ROLLBACK TRANSACTION");
            } catch (SQLException e) {
                if (th == null) {
                    throw e;
                }
                avkz.d(th, e);
            }
            throw th;
        }
    }

    public final Object d(dmz dmzVar, awqk awqkVar, awoq awoqVar) {
        return this.b.invoke(new dnu(this, dmzVar, awqkVar, null), awoqVar);
    }

    public final Object e() {
        boolean z = true;
        if (this.d == null && !this.a.a.g()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
