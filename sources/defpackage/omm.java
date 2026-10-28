package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class omm {
    public final Object a;
    public final Object b;

    public omm(agev agevVar, awou awouVar) {
        awouVar.getClass();
        this.b = agevVar;
        this.a = awouVar;
    }

    private static final tld y() {
        tld tldVar = new tld();
        tldVar.A("reference");
        tldVar.B("& ? > 0", 1L);
        return tldVar;
    }

    public final Object a(awoq awoqVar) {
        return qnl.S((hef) ((agfa) this.b).a, awoqVar);
    }

    public final Object b(awoq awoqVar) {
        return qnl.T((hef) ((agfa) this.b).a, awoqVar);
    }

    public final Object c(awoq awoqVar) {
        return qnl.U((hef) ((agfa) this.b).a, awoqVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(awoq awoqVar) throws Throwable {
        prd prdVar;
        if (awoqVar instanceof prd) {
            prdVar = (prd) awoqVar;
            int i = prdVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                prdVar.b = i - Integer.MIN_VALUE;
            } else {
                prdVar = new prd(this, awoqVar);
            }
        } else {
            prdVar = new prd(this, awoqVar);
        }
        Object objL = prdVar.a;
        Object obj = awox.a;
        int i2 = prdVar.b;
        if (i2 == 0) {
            atqp.j(objL);
            prdVar.b = 1;
            objL = l(prdVar);
            if (objL == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(objL);
        }
        String str = ((pym) objL).j;
        str.getClass();
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(awoq awoqVar) throws Throwable {
        pre preVar;
        if (awoqVar instanceof pre) {
            preVar = (pre) awoqVar;
            int i = preVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                preVar.b = i - Integer.MIN_VALUE;
            } else {
                preVar = new pre(this, awoqVar);
            }
        } else {
            preVar = new pre(this, awoqVar);
        }
        Object objL = preVar.a;
        Object obj = awox.a;
        int i2 = preVar.b;
        if (i2 == 0) {
            atqp.j(objL);
            preVar.b = 1;
            objL = l(preVar);
            if (objL == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(objL);
        }
        return ((pym) objL).h;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(awoq awoqVar) throws Throwable {
        prf prfVar;
        if (awoqVar instanceof prf) {
            prfVar = (prf) awoqVar;
            int i = prfVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                prfVar.b = i - Integer.MIN_VALUE;
            } else {
                prfVar = new prf(this, awoqVar);
            }
        } else {
            prfVar = new prf(this, awoqVar);
        }
        Object objL = prfVar.a;
        Object obj = awox.a;
        int i2 = prfVar.b;
        if (i2 == 0) {
            atqp.j(objL);
            prfVar.b = 1;
            objL = l(prfVar);
            if (objL == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(objL);
        }
        int iBd = a.bd(((pym) objL).f);
        if (iBd == 0) {
            iBd = 1;
        }
        pqo pqoVar = pqo.UNKNOWN;
        pqk pqkVar = pqk.CHIME;
        int i3 = iBd - 2;
        if (i3 == 1) {
            return pqo.SIGNED_IN;
        }
        if (i3 == 2) {
            return pqo.SIGNED_OUT_ZWIEBACK;
        }
        if (i3 == 3) {
            return pqo.SIGNED_OUT_YOUTUBE_VISITOR;
        }
        if (i3 != 4) {
            return null;
        }
        return pqo.SIGNED_IN_FITBIT;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(awoq awoqVar) throws Throwable {
        prg prgVar;
        if (awoqVar instanceof prg) {
            prgVar = (prg) awoqVar;
            int i = prgVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                prgVar.b = i - Integer.MIN_VALUE;
            } else {
                prgVar = new prg(this, awoqVar);
            }
        } else {
            prgVar = new prg(this, awoqVar);
        }
        Object objL = prgVar.a;
        Object obj = awox.a;
        int i2 = prgVar.b;
        if (i2 == 0) {
            atqp.j(objL);
            prgVar.b = 1;
            objL = l(prgVar);
            if (objL == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(objL);
        }
        String str = ((pym) objL).c;
        str.getClass();
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(awoq awoqVar) throws Throwable {
        prh prhVar;
        if (awoqVar instanceof prh) {
            prhVar = (prh) awoqVar;
            int i = prhVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                prhVar.b = i - Integer.MIN_VALUE;
            } else {
                prhVar = new prh(this, awoqVar);
            }
        } else {
            prhVar = new prh(this, awoqVar);
        }
        Object objL = prhVar.a;
        Object obj = awox.a;
        int i2 = prhVar.b;
        if (i2 == 0) {
            atqp.j(objL);
            prhVar.b = 1;
            objL = l(prhVar);
            if (objL == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(objL);
        }
        return new Integer(((pym) objL).b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(awoq awoqVar) throws Throwable {
        pri priVar;
        if (awoqVar instanceof pri) {
            priVar = (pri) awoqVar;
            int i = priVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                priVar.b = i - Integer.MIN_VALUE;
            } else {
                priVar = new pri(this, awoqVar);
            }
        } else {
            priVar = new pri(this, awoqVar);
        }
        Object objL = priVar.a;
        Object obj = awox.a;
        int i2 = priVar.b;
        if (i2 == 0) {
            atqp.j(objL);
            priVar.b = 1;
            objL = l(priVar);
            if (objL == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(objL);
        }
        String str = ((pym) objL).g;
        str.getClass();
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(awoq awoqVar) throws Throwable {
        prj prjVar;
        if (awoqVar instanceof prj) {
            prjVar = (prj) awoqVar;
            int i = prjVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                prjVar.b = i - Integer.MIN_VALUE;
            } else {
                prjVar = new prj(this, awoqVar);
            }
        } else {
            prjVar = new prj(this, awoqVar);
        }
        Object objL = prjVar.a;
        Object obj = awox.a;
        int i2 = prjVar.b;
        if (i2 == 0) {
            atqp.j(objL);
            prjVar.b = 1;
            objL = l(prjVar);
            if (objL == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(objL);
        }
        return new Long(((pym) objL).d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(awoq awoqVar) throws Throwable {
        prk prkVar;
        if (awoqVar instanceof prk) {
            prkVar = (prk) awoqVar;
            int i = prkVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                prkVar.b = i - Integer.MIN_VALUE;
            } else {
                prkVar = new prk(this, awoqVar);
            }
        } else {
            prkVar = new prk(this, awoqVar);
        }
        Object objL = prkVar.a;
        Object obj = awox.a;
        int i2 = prkVar.b;
        if (i2 == 0) {
            atqp.j(objL);
            prkVar.b = 1;
            objL = l(prkVar);
            if (objL == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(objL);
        }
        int iAT = a.aT(((pym) objL).i);
        if (iAT == 0) {
            iAT = 1;
        }
        pqo pqoVar = pqo.UNKNOWN;
        int i3 = iAT - 2;
        if (i3 != 1) {
            return i3 != 2 ? pqk.NONE : pqk.GNP;
        }
        return pqk.CHIME;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aunn, java.lang.Object] */
    public final Object l(awoq awoqVar) {
        return awqx.o(((bec) this.a.io()).b(), awoqVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r0v2, types: [aunn, java.lang.Object] */
    public final Object m(int i, String str, pqo pqoVar, String str2, long j, String str3, boolean z, awoq awoqVar) throws Throwable {
        prl prlVar;
        if (awoqVar instanceof prl) {
            prlVar = (prl) awoqVar;
            int i2 = prlVar.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                prlVar.b = i2 - Integer.MIN_VALUE;
            } else {
                prlVar = new prl(this, awoqVar);
            }
        } else {
            prlVar = new prl(this, awoqVar);
        }
        prl prlVar2 = prlVar;
        Object obj = prlVar2.a;
        awox awoxVar = awox.a;
        int i3 = prlVar2.b;
        if (i3 == 0) {
            atqp.j(obj);
            bec becVar = (bec) this.a.io();
            prm prmVar = new prm(i, str, j, z, pqoVar, this, str2, str3, null);
            prlVar2.b = 1;
            if (becVar.a(prmVar, prlVar2) == awoxVar) {
                return awoxVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(obj);
        }
        return awmy.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v1, types: [aunn, java.lang.Object] */
    public final Object n(String str, awoq awoqVar) throws Throwable {
        prn prnVar;
        if (awoqVar instanceof prn) {
            prnVar = (prn) awoqVar;
            int i = prnVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                prnVar.b = i - Integer.MIN_VALUE;
            } else {
                prnVar = new prn(this, awoqVar);
            }
        } else {
            prnVar = new prn(this, awoqVar);
        }
        Object obj = prnVar.a;
        awox awoxVar = awox.a;
        int i2 = prnVar.b;
        if (i2 == 0) {
            atqp.j(obj);
            bec becVar = (bec) this.a.io();
            pbs pbsVar = new pbs(str, (awoq) null, 3);
            prnVar.b = 1;
            if (becVar.a(pbsVar, prnVar) == awoxVar) {
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v2, types: [aunn, java.lang.Object] */
    public final Object o(pqk pqkVar, awoq awoqVar) throws Throwable {
        pro proVar;
        if (awoqVar instanceof pro) {
            proVar = (pro) awoqVar;
            int i = proVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                proVar.b = i - Integer.MIN_VALUE;
            } else {
                proVar = new pro(this, awoqVar);
            }
        } else {
            proVar = new pro(this, awoqVar);
        }
        Object obj = proVar.a;
        awox awoxVar = awox.a;
        int i2 = proVar.b;
        if (i2 == 0) {
            atqp.j(obj);
            bec becVar = (bec) this.a.io();
            prp prpVar = new prp(this, pqkVar, null);
            proVar.b = 1;
            if (becVar.a(prpVar, proVar) == awoxVar) {
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

    public final agke p(plx plxVar) {
        return ((pfv) this.a).a(plxVar, agke.q(y().z()));
    }

    public final agke q(plx plxVar, String str) {
        tld tldVarY = y();
        tldVarY.A(" AND ");
        tldVarY.A("group_id");
        tldVarY.B("=?", str);
        return ((pfv) this.a).a(plxVar, agke.q(tldVarY.z()));
    }

    public final agke r(plx plxVar, String... strArr) {
        return ((pfv) this.a).a(plxVar, pfx.d(y().z(), "thread_id", strArr));
    }

    public final void s(plx plxVar, String... strArr) {
        ((pfv) this.a).b(plxVar, pfx.d(null, "thread_id", strArr));
    }

    public final qmc t(String str, double d) {
        return new qlt((String) this.a, str, (qmj) this.b, d);
    }

    public final qmc u(String str, long j) {
        return new qlv((String) this.a, str, (qmj) this.b, j);
    }

    public final qmc v(String str, String str2) {
        return new qlx((String) this.a, str, (qmj) this.b, str2);
    }

    public final qmc w(String str, boolean z) {
        return new qlp((String) this.a, str, (qmj) this.b, z);
    }

    public final qmc x(String str, qln qlnVar, String str2) {
        return new qlr((String) this.a, str, (qmj) this.b, qlnVar, str2);
    }

    public omm(Object obj, Object obj2, byte[] bArr) {
        this.a = obj;
        this.b = obj2;
    }

    public omm(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public omm(awmd awmdVar, awmd awmdVar2) {
        this.a = awmdVar;
        awmdVar2.getClass();
        this.b = awmdVar2;
    }
}
