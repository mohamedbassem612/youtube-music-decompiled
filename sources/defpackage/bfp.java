package defpackage;

import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bfp implements bec {
    public final bgl a;
    public final bdv b;
    public final awut c;
    public final awmi d;
    public final awmi e;
    public final bgg f;
    public final ci g;
    public final djl h;
    private final awzc i;
    private final axff j;
    private int k;
    private awwd l;

    public bfp(bgl bglVar, List list, bdv bdvVar, awou awouVar) {
        bdvVar.getClass();
        this.a = bglVar;
        this.b = bdvVar;
        awwd awwdVar = (awwd) awouVar.get(awwd.d);
        if (awwdVar == null) {
            Objects.toString(awouVar);
            throw new IllegalStateException("Missing Job on Coroutine context: ".concat(awouVar.toString()));
        }
        awut awutVarK = awrc.K(awouVar.plus(awwdVar));
        this.c = awutVarK;
        this.i = new awyv(new dnk(this, (awoq) null, 1));
        this.j = new axfi(false);
        this.g = new ci((byte[]) null);
        this.f = new bgg(this, list, ((axcw) awutVarK).a);
        this.d = new awmp(new py(this, 6));
        this.e = new awmp(new py(this, 7));
        this.h = new djl(awutVarK, new agw(this, 2), new jnk(1), new dnf(this, (awoq) null, 1));
    }

    @Override // defpackage.bec
    public final Object a(awqk awqkVar, awoq awoqVar) {
        awro.A(((axcw) this.c).a);
        return azt.d(new bfh(this, awqkVar, (awoq) null, 2), awoqVar);
    }

    @Override // defpackage.bec
    public final awzc b() {
        return this.i;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    /* JADX WARN: Code duplicated, block: B:22:0x005a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX WARN: Code duplicated, block: B:26:0x0064  */
    /* JADX WARN: Code duplicated, block: B:28:0x0068  */
    /* JADX WARN: Code duplicated, block: B:30:0x006c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0072  */
    /* JADX WARN: Code duplicated, block: B:34:0x0078  */
    /* JADX WARN: Code duplicated, block: B:36:0x007d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0082  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(awoq awoqVar) throws Throwable {
        bei beiVar;
        bgk bgkVar;
        if (awoqVar instanceof bei) {
            beiVar = (bei) awoqVar;
            int i = beiVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                beiVar.c = i - Integer.MIN_VALUE;
            } else {
                beiVar = new bei(this, awoqVar);
            }
        } else {
            beiVar = new bei(this, awoqVar);
        }
        Object objM = beiVar.a;
        Object obj = awox.a;
        int i2 = beiVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                atqp.j(objM);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                atqp.j(objM);
            }
            bgkVar = (bgk) objM;
            if (bgkVar instanceof bdw) {
                return ((bdw) bgkVar).a;
            }
            if (!(bgkVar instanceof bgn)) {
                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
            }
            if (!(bgkVar instanceof bge)) {
                throw ((bge) bgkVar).a;
            }
            if (!(bgkVar instanceof bgb)) {
                throw ((bgb) bgkVar).a;
            }
            if (bgkVar instanceof bgc) {
                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
            }
            throw new awmj();
        }
        atqp.j(objM);
        awro.A(((axcw) this.c).a);
        beiVar.c = 1;
        objM = null;
        beiVar.c = 2;
        objM = m((dqy) objM, beiVar);
        if (objM == obj) {
            return obj;
        }
        bgkVar = (bgk) objM;
        if (bgkVar instanceof bdw) {
            return ((bdw) bgkVar).a;
        }
        if (!(bgkVar instanceof bgn)) {
            throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
        }
        if (!(bgkVar instanceof bge)) {
            throw ((bge) bgkVar).a;
        }
        if (!(bgkVar instanceof bgb)) {
            throw ((bgb) bgkVar).a;
        }
        if (bgkVar instanceof bgc) {
            throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
        }
        throw new awmj();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(awoq awoqVar) throws Throwable {
        beo beoVar;
        axff axffVar;
        if (awoqVar instanceof beo) {
            beoVar = (beo) awoqVar;
            int i = beoVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                beoVar.c = i - Integer.MIN_VALUE;
            } else {
                beoVar = new beo(this, awoqVar);
            }
        } else {
            beoVar = new beo(this, awoqVar);
        }
        Object obj = beoVar.a;
        awox awoxVar = awox.a;
        int i2 = beoVar.c;
        if (i2 == 0) {
            atqp.j(obj);
            axff axffVar2 = this.j;
            beoVar.d = (axfi) axffVar2;
            beoVar.c = 1;
            if (axffVar2.a(beoVar) == awoxVar) {
                return awoxVar;
            }
            axffVar = axffVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            axffVar = beoVar.d;
            atqp.j(obj);
        }
        try {
            int i3 = this.k - 1;
            this.k = i3;
            if (i3 == 0) {
                awwd awwdVar = this.l;
                if (awwdVar != null) {
                    awwdVar.p(null);
                }
                this.l = null;
            }
            return awmy.a;
        } finally {
            axffVar.c();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(awoq awoqVar) throws Throwable {
        bes besVar;
        axff axffVar;
        if (awoqVar instanceof bes) {
            besVar = (bes) awoqVar;
            int i = besVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                besVar.c = i - Integer.MIN_VALUE;
            } else {
                besVar = new bes(this, awoqVar);
            }
        } else {
            besVar = new bes(this, awoqVar);
        }
        Object obj = besVar.a;
        awox awoxVar = awox.a;
        int i2 = besVar.c;
        if (i2 == 0) {
            atqp.j(obj);
            axff axffVar2 = this.j;
            besVar.d = (axfi) axffVar2;
            besVar.c = 1;
            if (axffVar2.a(besVar) == awoxVar) {
                return awoxVar;
            }
            axffVar = axffVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            axffVar = besVar.d;
            atqp.j(obj);
        }
        try {
            int i3 = this.k + 1;
            this.k = i3;
            if (i3 == 1) {
                this.l = awro.t(this.c, null, 0, new bej(this, (awoq) null, 2, (char[]) null), 3);
            }
            return awmy.a;
        } finally {
            axffVar.c();
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(boolean z, awoq awoqVar) throws Throwable {
        bex bexVar;
        Object objH;
        awml awmlVar;
        bgk bgkVar;
        if (awoqVar instanceof bex) {
            bexVar = (bex) awoqVar;
            int i = bexVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                bexVar.h = i - Integer.MIN_VALUE;
            } else {
                bexVar = new bex(this, awoqVar);
            }
        } else {
            bexVar = new bex(this, awoqVar);
        }
        Object objH2 = bexVar.f;
        awox awoxVar = awox.a;
        int i2 = bexVar.h;
        if (i2 == 0) {
            atqp.j(objH2);
            objH = this.g.h();
            if (objH instanceof bgn) {
                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
            }
            ayq ayqVarN = n();
            bexVar.b = objH;
            bexVar.a = z;
            bexVar.h = 1;
            objH2 = ayqVarN.h();
            if (objH2 == awoxVar) {
                return awoxVar;
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    int i3 = bexVar.e;
                    int i4 = bexVar.d;
                    boolean z2 = bexVar.a;
                    Object obj = bexVar.c;
                    Object obj2 = bexVar.b;
                    atqp.j(objH2);
                    awmlVar = (awml) objH2;
                    bgkVar = (bgk) awmlVar.a;
                    if (((Boolean) awmlVar.b).booleanValue()) {
                        return bgkVar;
                    }
                    this.g.i(bgkVar);
                    return bgkVar;
                }
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = bexVar.e;
                int i6 = bexVar.d;
                boolean z3 = bexVar.a;
                Object obj3 = bexVar.c;
                Object obj4 = bexVar.b;
                atqp.j(objH2);
                awmlVar = (awml) objH2;
                bgkVar = (bgk) awmlVar.a;
                if (((Boolean) awmlVar.b).booleanValue()) {
                    return bgkVar;
                }
                this.g.i(bgkVar);
                return bgkVar;
            }
            z = bexVar.a;
            objH = bexVar.b;
            atqp.j(objH2);
        }
        int iIntValue = ((Number) objH2).intValue();
        boolean z4 = objH instanceof bdw;
        int i7 = z4 ? ((bdw) objH).c : -1;
        if (z4 && iIntValue == i7) {
            return objH;
        }
        bez bezVar = new bez(this, i7, null);
        if (z) {
            ayq ayqVarN2 = n();
            pvv pvvVar = new pvv(this, bezVar, (awoq) null, 1);
            bexVar.b = null;
            bexVar.c = null;
            bexVar.a = true;
            bexVar.d = iIntValue;
            bexVar.e = i7;
            bexVar.h = 2;
            objH2 = ayqVarN2.f(pvvVar, bexVar);
            if (objH2 == awoxVar) {
                return awoxVar;
            }
            awmlVar = (awml) objH2;
            bgkVar = (bgk) awmlVar.a;
            if (((Boolean) awmlVar.b).booleanValue()) {
                return bgkVar;
            }
            this.g.i(bgkVar);
            return bgkVar;
        }
        ayq ayqVarN3 = n();
        bey beyVar = new bey(this, bezVar, null);
        bexVar.b = null;
        bexVar.c = null;
        bexVar.a = false;
        bexVar.d = iIntValue;
        bexVar.e = i7;
        bexVar.h = 3;
        objH2 = ayqVarN3.g(beyVar, bexVar);
        if (objH2 == awoxVar) {
            return awoxVar;
        }
        awmlVar = (awml) objH2;
        bgkVar = (bgk) awmlVar.a;
        if (((Boolean) awmlVar.b).booleanValue()) {
            return bgkVar;
        }
        this.g.i(bgkVar);
        return bgkVar;
    }

    public final Object g(awoq awoqVar) {
        return azt.d(new bfa(this, null, 0), awoqVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [awqk] */
    public final Object h(boolean z, awqk awqkVar, awoq awoqVar) throws Throwable {
        bfb bfbVar;
        Object obj;
        if (awoqVar instanceof bfb) {
            bfbVar = (bfb) awoqVar;
            int i = bfbVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                bfbVar.e = i - Integer.MIN_VALUE;
            } else {
                bfbVar = new bfb(this, awoqVar);
            }
        } else {
            bfbVar = new bfb(this, awoqVar);
        }
        Object obj2 = bfbVar.c;
        awox awoxVar = awox.a;
        int i2 = bfbVar.e;
        if (i2 == 0) {
            atqp.j(obj2);
            bfbVar.b = awqkVar;
            bfbVar.a = z;
            bfbVar.e = 1;
            obj2 = null;
            obj = awqkVar;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                atqp.j(obj2);
                return obj2;
            }
            z = bfbVar.a;
            Object obj3 = bfbVar.b;
            atqp.j(obj2);
            obj = obj3;
        }
        boolean z2 = z;
        awut awutVar = this.c;
        bff bffVar = new bff(this, (dqy) obj2, z2, obj, null);
        bfbVar.b = null;
        bfbVar.a = z2;
        bfbVar.e = 2;
        Object objP = awro.p(((axcw) awutVar).a, bffVar, bfbVar);
        return objP == awoxVar ? awoxVar : objP;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(Object obj, boolean z, awoq awoqVar) throws Throwable {
        bfm bfmVar;
        awrk awrkVar;
        if (awoqVar instanceof bfm) {
            bfmVar = (bfm) awoqVar;
            int i = bfmVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bfmVar.c = i - Integer.MIN_VALUE;
            } else {
                bfmVar = new bfm(this, awoqVar);
            }
        } else {
            bfmVar = new bfm(this, awoqVar);
        }
        Object obj2 = bfmVar.a;
        awox awoxVar = awox.a;
        int i2 = bfmVar.c;
        if (i2 == 0) {
            atqp.j(obj2);
            awrk awrkVar2 = new awrk();
            bfy bfyVarJ = j();
            bfo bfoVar = new bfo(this, awrkVar2, obj, z, null);
            bfmVar.d = awrkVar2;
            bfmVar.c = 1;
            if (bfyVarJ.c(bfoVar, bfmVar) == awoxVar) {
                return awoxVar;
            }
            awrkVar = awrkVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            awrkVar = bfmVar.d;
            atqp.j(obj2);
        }
        return new Integer(awrkVar.a);
    }

    public final bfy j() {
        return (bfy) this.d.a();
    }

    public final Object k(dqy dqyVar, awoq awoqVar) throws Exception {
        Object objD = azt.d(new bew(this, null), awoqVar);
        return objD != awox.a ? awmy.a : objD;
    }

    public final Object l(awqk awqkVar, awou awouVar, dqy dqyVar, awoq awoqVar) {
        return n().f(new bfk(this, dqyVar, awouVar, awqkVar, null), awoqVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(dqy dqyVar, awoq awoqVar) throws Throwable {
        bfg bfgVar;
        if (awoqVar instanceof bfg) {
            bfgVar = (bfg) awoqVar;
            int i = bfgVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bfgVar.c = i - Integer.MIN_VALUE;
            } else {
                bfgVar = new bfg(this, awoqVar);
            }
        } else {
            bfgVar = new bfg(this, awoqVar);
        }
        Object obj = bfgVar.a;
        Object obj2 = awox.a;
        int i2 = bfgVar.c;
        try {
            if (i2 == 0) {
                atqp.j(obj);
                if (this.g.h() instanceof bgb) {
                    return this.g.h();
                }
                bfgVar.c = 1;
                if (k(dqyVar, bfgVar) != obj2) {
                }
                return obj2;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                atqp.j(obj);
                return obj;
            }
            atqp.j(obj);
            bfgVar.c = 2;
            Object objF = f(false, bfgVar);
            if (objF != obj2) {
                return objF;
            }
            return obj2;
        } catch (Throwable th) {
            return new bge(th, -1);
        }
    }

    public final ayq n() {
        return (ayq) this.e.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object o(axfd axfdVar, awoq awoqVar) throws Throwable {
        beq beqVar;
        if (awoqVar instanceof beq) {
            beqVar = (beq) awoqVar;
            int i = beqVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                beqVar.c = i - Integer.MIN_VALUE;
            } else {
                beqVar = new beq(this, awoqVar);
            }
        } else {
            beqVar = new beq(this, awoqVar);
        }
        Object obj = beqVar.a;
        awox awoxVar = awox.a;
        int i2 = beqVar.c;
        if (i2 == 0) {
            atqp.j(obj);
            Object obj2 = axfdVar.b;
            ber berVar = new ber(this, axfdVar, null);
            beqVar.c = 1;
            if (azt.d(berVar, beqVar) == awoxVar) {
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
}
