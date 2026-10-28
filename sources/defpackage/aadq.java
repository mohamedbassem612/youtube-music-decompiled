package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aadq extends aanb implements zwg {
    public final Context a;
    public final aauk b;
    public final tqa c;
    public final aaqg d;
    private final tbt f;
    private final Executor g;
    private final awmd h;
    private final zwb i;
    private final aalt j;
    private volatile aado k;
    private final awkv l = new awkx();
    private final aalh m;
    private final abfv n;

    public aadq(Context context, tbt tbtVar, Executor executor, tqa tqaVar, awmd awmdVar, zwb zwbVar, abfv abfvVar, aaed aaedVar, aaqg aaqgVar, aalt aaltVar, aauk aaukVar, aalh aalhVar) {
        this.a = context;
        this.f = tbtVar;
        this.g = executor;
        this.c = tqaVar;
        this.i = zwbVar;
        this.h = awmdVar;
        this.n = abfvVar;
        this.d = aaqgVar;
        this.j = aaltVar;
        this.b = aaukVar;
        this.m = aalhVar;
        tbtVar.f(this);
        aaedVar.a();
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, zwa] */
    private final aaqn i(zwa zwaVar) {
        zwaVar.getClass();
        if (zwaVar.h()) {
            throw new IllegalArgumentException("Identity must be signed in.");
        }
        aado aadoVar = this.k;
        if (aadoVar != null && zwaVar.k().equals(aadoVar.b)) {
            return aadoVar;
        }
        f();
        trf trfVarFG = ((aadp) aadp.class.cast(tym.N(tym.L(this.a)))).fG();
        trfVarFG.c = zwaVar.k();
        trfVarFG.b = zwaVar;
        atqq.b(trfVarFG.c, String.class);
        atqq.b(trfVarFG.b, zwa.class);
        Object obj = trfVarFG.a;
        ght ghtVar = (ght) obj;
        aado aadoVar2 = (aado) new ghz(ghtVar, (String) trfVarFG.c, trfVarFG.b).B.io();
        this.k = aadoVar2;
        ((aadb) this.h.io()).j(aadoVar2.q);
        aadoVar2.x();
        this.j.a();
        this.f.f(aadoVar2);
        return aadoVar2;
    }

    @Override // defpackage.zwg
    public final void a(zwa zwaVar) {
        this.g.execute(new aadi(this, zwaVar, 6));
    }

    @Override // defpackage.aanb
    public final synchronized aaqn b() {
        zwa zwaVarE = this.i.e();
        if (zwaVarE.h()) {
            if (this.b.z()) {
                f();
            }
            return this.e;
        }
        aado aadoVar = this.k;
        if (aadoVar != null) {
            try {
                if (!this.b.z() || zwaVarE.k().equals(aadoVar.b)) {
                    return aadoVar;
                }
            } catch (SQLiteException e) {
                throw e;
            }
        }
        return i(zwaVarE);
    }

    @Override // defpackage.aanb
    public final avlr c() {
        return this.l.aI().P().ag();
    }

    @Override // defpackage.aanb
    public final synchronized String d() {
        aaqn aaqnVarB;
        aaqnVarB = b();
        return aaqnVarB != null ? aaqnVarB.s() : "NO_OP_STORE_TAG";
    }

    @Override // defpackage.aanb
    public final synchronized void e() {
        zwa zwaVarE = this.i.e();
        if (!zwaVarE.h()) {
            abfv abfvVar = this.n;
            int iP = abfvVar.p();
            if (iP == 1) {
                i(zwaVarE);
                return;
            }
            if (iP != 2) {
                i(zwaVarE);
                aado aadoVar = this.k;
                if (aadoVar != null && aadoVar.l().h().isEmpty() && aadoVar.i().e().isEmpty() && aadoVar.j().b().isEmpty()) {
                    abfvVar.q(false);
                    return;
                } else {
                    abfvVar.q(true);
                    return;
                }
            }
            if (this.b.z()) {
                f();
            }
        } else if (this.b.z()) {
            f();
        }
    }

    public final void f() {
        if (this.k != null) {
            this.f.l(this.k);
            this.k.A();
            this.k = null;
            ((aadb) this.h.io()).j(null);
            this.l.kk(Boolean.FALSE);
        }
    }

    @Override // defpackage.aanb
    public final boolean g() {
        if (this.k != null) {
            aado aadoVar = this.k;
            if (aadoVar.w && aadoVar.x.c()) {
                return true;
            }
        }
        return false;
    }

    @tcc
    public void handleOfflineStoreInitCompletedEvent(aahw aahwVar) {
        this.l.kk(Boolean.TRUE);
    }

    @tcc
    protected void handleSignInEvent(zwt zwtVar) {
        aauk aaukVar = this.b;
        if (aaukVar.q()) {
            this.m.a(zwtVar.a);
        }
        if (txz.g(this.a) || aaukVar.C()) {
            this.g.execute(new aadm(this, 5));
        } else {
            e();
        }
    }

    @tcc
    protected void handleSignOutEvent(zwu zwuVar) {
        aauk aaukVar = this.b;
        if (aaukVar.q()) {
            this.m.b();
        }
        if (aaukVar.C()) {
            this.g.execute(new aadm(this, 4));
        } else {
            f();
        }
    }
}
