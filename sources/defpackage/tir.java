package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import internal.org.jni_zero.JniZero;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tir implements tgg {
    public final tlj a;
    public final awmi b;
    public final tjj c;
    private final tjd d;
    private final vwp e;

    public tir(tlj tljVar, tjl tjlVar, aunn aunnVar, awmd awmdVar) {
        tjlVar.getClass();
        this.a = tljVar;
        this.b = new awmp(new ebk(awmdVar, 14));
        tjj tiuVar = tljVar.N() ? new tiu(taq.y(tljVar.J())) : new tjg(taq.y(tljVar.J()));
        this.c = tiuVar;
        this.d = new tjd(aunnVar, tjlVar, tiuVar, tljVar.N());
        this.e = (vwp) ((tkr) tljVar).i.orElse(null);
    }

    private final void l(tns tnsVar, Function0 function0) {
        if (tnsVar.C()) {
            function0.invoke();
            return;
        }
        tlj tljVar = this.a;
        ((tkr) tljVar).k.execute(new syd(function0, 7));
    }

    private final boolean m(tns tnsVar, tnx tnxVar, tnm tnmVar, tmo tmoVar, String str, tmt tmtVar, boolean z, vwp vwpVar, boolean z2) {
        tmr tmrVarA;
        if (!tnsVar.G() || TextUtils.isEmpty(str) || tmtVar == null) {
            return false;
        }
        if (tmoVar.j()) {
            tmrVarA = tmr.b(tmtVar, new rzt(tnmVar, 4));
        } else {
            Object obj = tnxVar.c().a;
            if (obj == null) {
                return false;
            }
            tmrVarA = tmr.a(tmtVar, new rzt(obj, 5), new tjq(tnmVar, 1));
        }
        if (z) {
            if (z2 && this.a.J()) {
                if (vwpVar != null) {
                    vwpVar.f(str, tmrVarA, tmoVar.b());
                }
            } else if (vwpVar != null) {
                vwpVar.g(str, tmrVarA, tmoVar.b());
            }
        }
        tmoVar.h(str, tmrVarA);
        if (tmtVar.k == 2 && (tnsVar instanceof toa)) {
        }
        return true;
    }

    @Override // defpackage.tgg
    public final tgz a(tns tnsVar, tha thaVar) {
        tnsVar.getClass();
        if (!(tnsVar instanceof toc)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        tkd tkdVar = new tkd((toc) tnsVar, thaVar, this.d, this.a);
        return new tly(awro.r(tkdVar.a, awov.a, 1, new dnz(tkdVar, (awoq) null, 14)), 1);
    }

    @Override // defpackage.tgg
    public final tns b(tns tnsVar) {
        ListenableFuture listenableFutureC = c(tnsVar);
        tlj tljVar = this.a;
        if (tljVar.K()) {
            taf.i(listenableFutureC, tnsVar.C() ? MoreExecutors.directExecutor() : ((tkr) tljVar).k, new roc(tnsVar, 6), new itt(tnsVar, this, 13, null), null);
        }
        return tnsVar;
    }

    @Override // defpackage.tgg
    public final ListenableFuture c(tns tnsVar) {
        return awrc.ag(this.a.H(tnsVar), awov.a, new bev(tnsVar, this, (awoq) null, 7));
    }

    @Override // defpackage.tgg
    public final void d() {
        int i = tqr.a;
        tlj tljVar = this.a;
        if (((tkr) tljVar).n.k(1073828820) && tljVar.M()) {
            ExecutorService executorServiceA = tljVar.A();
            ExecutorService executorServiceB = tljVar.B();
            if (executorServiceA instanceof ThreadPoolExecutor) {
                ((ThreadPoolExecutor) executorServiceA).prestartAllCoreThreads();
                if (awrc.c(executorServiceB, executorServiceA) || !(executorServiceB instanceof ThreadPoolExecutor)) {
                    return;
                }
                ((ThreadPoolExecutor) executorServiceB).prestartAllCoreThreads();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
    
        if (r7 != r1) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [tir] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, tns] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, tns] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.tns r5, boolean r6, defpackage.awoq r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.tif
            if (r0 == 0) goto L13
            r0 = r7
            tif r0 = (defpackage.tif) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            tif r0 = new tif
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.b
            awox r1 = defpackage.awox.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r5 = r0.a
            defpackage.atqp.j(r7)     // Catch: java.lang.Exception -> L48
            goto L44
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.atqp.j(r7)
            r0.a = r5     // Catch: java.lang.Exception -> L48
            r0.d = r3     // Catch: java.lang.Exception -> L48
            tii r7 = new tii     // Catch: java.lang.Exception -> L48
            r2 = 0
            r7.<init>(r4, r5, r6, r2)     // Catch: java.lang.Exception -> L48
            java.lang.Object r7 = defpackage.awrc.J(r7, r0)     // Catch: java.lang.Exception -> L48
            if (r7 == r1) goto La3
        L44:
            tnx r7 = (defpackage.tnx) r7     // Catch: java.lang.Exception -> L48
            r1 = r7
            goto L56
        L48:
            r6 = move-exception
            boolean r7 = r6 instanceof java.util.concurrent.CancellationException
            if (r7 != 0) goto La4
            toe r6 = defpackage.tjo.b(r6)
            tnx r6 = defpackage.tnx.d(r6)
            r1 = r6
        L56:
            tlj r6 = r4.a
            boolean r7 = r6.K()
            if (r7 == 0) goto L6f
            boolean r4 = r1.h()
            if (r4 == 0) goto L68
            r1.getClass()
            goto La3
        L68:
            tnv r4 = r1.a()
            toe r4 = r4.a
            throw r4
        L6f:
            r1.getClass()
            boolean r7 = r1.h()
            if (r7 != 0) goto L8e
            tnv r6 = r1.a()
            toe r6 = r6.a
            boolean r7 = r5.D()
            if (r7 != 0) goto L8d
            efi r7 = new efi
            r0 = 2
            r7.<init>(r5, r6, r0)
            r4.l(r5, r7)
        L8d:
            throw r6
        L8e:
            boolean r6 = r6.I()
            if (r6 == 0) goto L9a
            boolean r6 = r5.D()
            if (r6 != 0) goto La3
        L9a:
            bgz r6 = new bgz
            r7 = 6
            r6.<init>(r5, r1, r7)
            r4.l(r5, r6)
        La3:
            return r1
        La4:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tir.e(tns, boolean, awoq):java.lang.Object");
    }

    public final Object f(tns tnsVar, tnx tnxVar, awoq awoqVar) {
        return awrc.J(new beh(tnxVar, this, tnsVar, (awoq) null, 7), awoqVar);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [tns] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    public final Object g(tns tnsVar, String str, awoq awoqVar) throws Throwable {
        tij tijVar;
        ?? r8;
        boolean z;
        tie tieVar;
        tie tieVar2;
        tmp tmpVar;
        if (awoqVar instanceof tij) {
            tijVar = (tij) awoqVar;
            int i = tijVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                tijVar.d = i - Integer.MIN_VALUE;
            } else {
                tijVar = new tij(this, awoqVar);
            }
        } else {
            tijVar = new tij(this, awoqVar);
        }
        Object obj = tijVar.b;
        awox awoxVar = awox.a;
        int i2 = tijVar.d;
        if (i2 == 0) {
            atqp.j(obj);
            tijVar.a = tnsVar;
            tijVar.e = str;
            tijVar.d = 1;
            if (tnsVar instanceof toa) {
            }
            obj = null;
            r8 = tnsVar;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                atqp.j(obj);
                return obj;
            }
            str = tijVar.e;
            Object obj2 = tijVar.a;
            atqp.j(obj);
            r8 = obj2;
        }
        tie tieVar3 = (tie) obj;
        if (tieVar3 != null) {
            return tieVar3;
        }
        tijVar.a = null;
        tijVar.e = null;
        tijVar.d = 2;
        tlj tljVar = this.a;
        String strR = r8.r();
        tmo tmoVar = ((tkr) tljVar).h;
        tmr tmrVarC = strR != null ? tjo.c(tmoVar, r8, strR) : null;
        if (tmrVarC == null) {
            tmrVarC = tjo.c(tmoVar, r8, str);
            if (tmrVarC == null) {
                tieVar = null;
            } else {
                z = false;
            }
            if (tieVar == awoxVar) {
                return awoxVar;
            }
            return tieVar;
        }
        str = strR;
        z = true;
        if (!tljVar.J() || tmrVarC == null || (tmpVar = tmrVarC.a) == null || tmpVar.b() != 2) {
            tieVar2 = new tie(tmrVarC, str, z, false);
        } else {
            Object obj3 = tmrVarC.a.c().a;
            Class clsAb = r8.ab();
            if (clsAb == null || clsAb.isInstance(obj3)) {
                tieVar2 = new tie(tmrVarC, str, z, false);
            } else {
                Object obj4 = tmrVarC.a.c().a;
                twu.d(twu.a, 5, "Cache cast failed. Expected " + r8.ab() + ", got " + obj4.getClass(), null);
                tmoVar.i(str);
                tieVar2 = new tie(null, str, z, true);
            }
        }
        tieVar = tieVar2;
        if (tieVar == awoxVar) {
            return awoxVar;
        }
        return tieVar;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008a  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [tir] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [tns] */
    /* JADX WARN: Type inference failed for: r1v8 */
    public final Object h(tns tnsVar, tnm tnmVar, String str, boolean z, boolean z2, awoq awoqVar) throws Throwable {
        tik tikVar;
        ?? r1;
        boolean z3;
        Object obj;
        String str2;
        tnx tnxVar;
        String strR;
        tmo tmoVar;
        tow towVar;
        if (awoqVar instanceof tik) {
            tikVar = (tik) awoqVar;
            int i = tikVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                tikVar.f = i - Integer.MIN_VALUE;
            } else {
                tikVar = new tik(this, awoqVar);
            }
        } else {
            tikVar = new tik(this, awoqVar);
        }
        tik tikVar2 = tikVar;
        Object objAd = tikVar2.d;
        awox awoxVar = awox.a;
        int i2 = tikVar2.f;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                atqp.j(objAd);
                objAd.getClass();
                return (tnx) objAd;
            }
            z3 = tikVar2.c;
            str = tikVar2.g;
            Object obj2 = tikVar2.b;
            Object obj3 = tikVar2.a;
            atqp.j(objAd);
            r1 = obj3;
            obj = obj2;
            str2 = str;
            tnxVar = ((tnq) objAd).a;
            if (z3 && tnxVar.h()) {
                tlj tljVar = this.a;
                strR = r1.r();
                if (r1 instanceof toa) {
                }
                tmoVar = ((tkr) tljVar).h;
                if (strR != null && strR.length() > 0 && str2.length() > 0 && !awrc.c(strR, str2)) {
                    if (tmoVar instanceof tow) {
                        towVar = (tow) tmoVar;
                    } else {
                        towVar = null;
                    }
                    if (towVar != null) {
                        towVar.l(strR, str2);
                    }
                }
                if (strR != null) {
                    tmoVar.i(strR);
                }
                m(r1, tnxVar, (tnm) obj, tmoVar, str2, tnxVar.c().b, false, this.e, false);
            }
            return tnxVar;
        }
        atqp.j(objAd);
        if (!tnsVar.F()) {
            if (!tnsVar.J()) {
                return tnsVar.aa(tnmVar);
            }
            ListenableFuture listenableFutureJ = tnsVar.j(this.a.G(tnsVar), tnmVar, z);
            tikVar2.f = 2;
            objAd = awrc.ad(listenableFutureJ, tikVar2);
            if (objAd == awoxVar) {
                return awoxVar;
            }
            objAd.getClass();
            return (tnx) objAd;
        }
        tlj tljVar2 = this.a;
        tjo tjoVar = tjo.a;
        Executor executorG = tljVar2.G(tnsVar);
        executorG.getClass();
        tikVar2.a = tnsVar;
        tikVar2.b = tnmVar;
        tikVar2.g = str;
        tikVar2.c = z2;
        tikVar2.f = 1;
        objAd = tjoVar.a(executorG, tnsVar, tnmVar, z, ((tkr) tljVar2).h, tikVar2);
        if (objAd == awoxVar) {
            return awoxVar;
        }
        r1 = tnsVar;
        z3 = z2;
        obj = tnmVar;
        str2 = str;
        tnxVar = ((tnq) objAd).a;
        if (z3) {
            tlj tljVar3 = this.a;
            strR = r1.r();
            if (r1 instanceof toa) {
            }
            tmoVar = ((tkr) tljVar3).h;
            if (strR != null) {
                if (tmoVar instanceof tow) {
                    towVar = (tow) tmoVar;
                } else {
                    towVar = null;
                }
                if (towVar != null) {
                    towVar.l(strR, str2);
                }
            }
            if (strR != null) {
                tmoVar.i(strR);
            }
            m(r1, tnxVar, (tnm) obj, tmoVar, str2, tnxVar.c().b, false, this.e, false);
        }
        return tnxVar;
    }

    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:45:0x00de  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:56:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:58:0x0107  */
    /* JADX WARN: Code duplicated, block: B:71:0x017c  */
    /* JADX WARN: Code duplicated, block: B:79:0x019f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:82:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c4  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object, tns] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Object, tns] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r18v0, types: [tir] */
    /* JADX WARN: Type inference failed for: r1v14, types: [tns] */
    /* JADX WARN: Type inference failed for: r1v16, types: [tns] */
    /* JADX WARN: Type inference failed for: r1v24, types: [tlj] */
    /* JADX WARN: Type inference failed for: r2v26, types: [tns] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [tjh] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object i(tns tnsVar, String str, tjh tjhVar, awoq awoqVar) throws Throwable {
        til tilVar;
        tns tnsVar2;
        String str2;
        tjh tjhVar2;
        ?? r12;
        tjh tjhVar3;
        tmo tmoVar;
        mbc mbcVar;
        Object objG;
        mbc mbcVar2;
        ?? r14;
        tjh tjhVar4;
        String str3;
        tmo tmoVar2;
        tie tieVar;
        tmr tmrVar;
        boolean z;
        Object objJ;
        tmr tmrVar2;
        tmt tmtVar;
        boolean zC;
        ?? r6;
        String str4;
        tmr tmrVar3;
        tjh tjhVar5;
        tie tieVar2;
        tmr tmrVar4;
        tnx tnxVarD;
        String str5;
        ?? r5;
        Object obj;
        ?? r15;
        tnx tnxVar;
        vwp vwpVar;
        tmt tmtVar2;
        if (awoqVar instanceof til) {
            tilVar = (til) awoqVar;
            int i = tilVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                tilVar.i = i - Integer.MIN_VALUE;
            } else {
                tilVar = new til(this, awoqVar);
            }
        } else {
            tilVar = new til(this, awoqVar);
        }
        til tilVar2 = tilVar;
        Object objAd = tilVar2.g;
        awox awoxVar = awox.a;
        int i2 = tilVar2.i;
        if (i2 != 0) {
            if (i2 == 1) {
                tjhVar3 = (tjh) tilVar2.c;
                str2 = (String) tilVar2.b;
                r12 = tilVar2.a;
                try {
                    atqp.j(objAd);
                    r12 = r12;
                } catch (CancellationException unused) {
                }
            } else {
                if (i2 == 2) {
                    mbcVar2 = (mbc) tilVar2.e;
                    tmoVar2 = (tmo) tilVar2.d;
                    tjhVar4 = (tjh) tilVar2.c;
                    str3 = (String) tilVar2.b;
                    Object obj2 = tilVar2.a;
                    atqp.j(objAd);
                    r14 = obj2;
                    tieVar = (tie) objAd;
                    if (tieVar != null) {
                        tmrVar = tieVar.a;
                    } else {
                        tmrVar = null;
                    }
                    if (tieVar == null && tieVar.d) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (tmrVar != null) {
                        mbcVar2.getClass();
                        boolean z2 = tieVar.e;
                        tmrVar2 = tieVar.a;
                        if (tmrVar2 != null || (tmtVar = tmrVar2.b) == null || tmtVar.b(mbcVar2)) {
                            tilVar2.a = null;
                            tilVar2.b = null;
                            tilVar2.c = null;
                            tilVar2.d = null;
                            tilVar2.e = null;
                            tilVar2.i = 3;
                            objJ = j(r14, tmrVar, str3, tjhVar4, z, true, tilVar2);
                            obj = awoxVar;
                            if (objJ != awoxVar) {
                                return objJ;
                            }
                        } else {
                            String str6 = tieVar.b;
                            zC = tmtVar.c(mbcVar2);
                            tmp tmpVar = tmrVar.a;
                            if (tmpVar.b() == 2) {
                                tml tmlVar = new tml(new tnw(tmpVar.c().a, tmrVar.b, null, false));
                                tmrVar4 = tmrVar;
                                tnxVarD = tmlVar;
                                str5 = str6;
                                r5 = tjhVar4;
                                r15 = r14;
                                if (tnxVarD.h()) {
                                    tmtVar2 = tmrVar4.b;
                                    tmoVar2.getClass();
                                    r15.getClass();
                                    if (tmtVar2 != null && (r15 instanceof toa)) {
                                    }
                                    Object obj3 = tnxVarD.c().a;
                                    tmtVar2.getClass();
                                    tnxVarD = tjo.d(obj3, tmtVar2, tmoVar2, str5);
                                }
                                tnxVar = tnxVarD;
                                vwpVar = this.e;
                                if (vwpVar != null) {
                                    vwpVar.d(str5, tmrVar4, tmoVar2.b(), tieVar.c);
                                }
                                r5.b(r15, tnxVar);
                                obj = tnxVar;
                                if (zC) {
                                    awro.t(this.a.H(r15), null, 0, new pmu((tir) this, (tns) r15, tmrVar4, str5, (tjh) r5, (awoq) null, 3), 3);
                                    obj = tnxVar;
                                }
                            } else {
                                tnm tnmVar = new tnm(200, tmpVar.a(), (Map) tmrVar.b.c, true);
                                boolean z3 = tieVar.c;
                                tilVar2.a = r14;
                                tilVar2.b = tjhVar4;
                                tilVar2.c = tmoVar2;
                                tilVar2.d = tieVar;
                                tilVar2.e = tmrVar;
                                tilVar2.j = str6;
                                tilVar2.f = zC;
                                tilVar2.i = 4;
                                tmr tmrVar5 = tmrVar;
                                ?? r1 = r14;
                                Object objH = h(r1, tnmVar, str3, false, z3, tilVar2);
                                if (objH != awoxVar) {
                                    obj = awoxVar;
                                    r6 = r1;
                                    objAd = objH;
                                    str4 = str6;
                                    zC = zC;
                                    tmrVar3 = tmrVar5;
                                    tjhVar5 = tjhVar4;
                                    tieVar2 = tieVar;
                                }
                            }
                        }
                    } else {
                        tilVar2.a = null;
                        tilVar2.b = null;
                        tilVar2.c = null;
                        tilVar2.d = null;
                        tilVar2.e = null;
                        tilVar2.i = 3;
                        objJ = j(r14, tmrVar, str3, tjhVar4, z, true, tilVar2);
                        obj = awoxVar;
                        if (objJ != awoxVar) {
                            return objJ;
                        }
                    }
                    obj = awoxVar;
                    return obj;
                }
                if (i2 == 3) {
                    atqp.j(objAd);
                    return objAd;
                }
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zC = tilVar2.f;
                str4 = tilVar2.j;
                tmrVar3 = (tmr) tilVar2.e;
                tieVar2 = (tie) tilVar2.d;
                tmoVar2 = (tmo) tilVar2.c;
                tjhVar5 = (tjh) tilVar2.b;
                Object obj4 = tilVar2.a;
                atqp.j(objAd);
                r6 = obj4;
            }
            tnxVarD = (tnx) objAd;
            tmr tmrVar6 = tmrVar3;
            str5 = str4;
            tmrVar4 = tmrVar6;
            tieVar = tieVar2;
            r15 = r6;
            r5 = tjhVar5;
            if (tnxVarD.h()) {
                tmtVar2 = tmrVar4.b;
                tmoVar2.getClass();
                r15.getClass();
                if (tmtVar2 != null) {
                }
                Object obj5 = tnxVarD.c().a;
                tmtVar2.getClass();
                tnxVarD = tjo.d(obj5, tmtVar2, tmoVar2, str5);
            }
            tnxVar = tnxVarD;
            vwpVar = this.e;
            if (vwpVar != null) {
                vwpVar.d(str5, tmrVar4, tmoVar2.b(), tieVar.c);
            }
            r5.b(r15, tnxVar);
            obj = tnxVar;
            if (zC) {
                awro.t(this.a.H(r15), null, 0, new pmu((tir) this, (tns) r15, tmrVar4, str5, (tjh) r5, (awoq) null, 3), 3);
                obj = tnxVar;
            }
            obj = awoxVar;
            return obj;
        }
        atqp.j(objAd);
        tjhVar.a();
        String strR = tnsVar.r();
        if (strR == null || TextUtils.isEmpty(strR)) {
            tnsVar2 = tnsVar;
            str2 = str;
            tjhVar2 = tjhVar;
            tjh tjhVar6 = tjhVar2;
            r12 = tnsVar2;
            tjhVar3 = tjhVar6;
            tlj tljVar = this.a;
            tilVar2.a = r12;
            tilVar2.b = str2;
            tilVar2.c = tjhVar3;
            tkr tkrVar = (tkr) tljVar;
            tmoVar = tkrVar.h;
            tilVar2.d = tmoVar;
            mbcVar = tkrVar.d;
            tilVar2.e = mbcVar;
            tilVar2.i = 2;
            objG = g(r12, str2, tilVar2);
            obj = awoxVar;
            if (objG != awoxVar) {
                tjh tjhVar7 = tjhVar3;
                mbcVar2 = mbcVar;
                objAd = objG;
                r14 = r12;
                tjhVar4 = tjhVar7;
                str3 = str2;
                tmoVar2 = tmoVar;
                tieVar = (tie) objAd;
                if (tieVar != null) {
                    tmrVar = tieVar.a;
                } else {
                    tmrVar = null;
                }
                if (tieVar == null) {
                    z = false;
                } else {
                    z = false;
                }
                if (tmrVar != null) {
                    mbcVar2.getClass();
                    boolean z4 = tieVar.e;
                    tmrVar2 = tieVar.a;
                    if (tmrVar2 != null) {
                        tilVar2.a = null;
                        tilVar2.b = null;
                        tilVar2.c = null;
                        tilVar2.d = null;
                        tilVar2.e = null;
                        tilVar2.i = 3;
                        objJ = j(r14, tmrVar, str3, tjhVar4, z, true, tilVar2);
                        obj = awoxVar;
                        if (objJ != awoxVar) {
                            return objJ;
                        }
                    } else {
                        tilVar2.a = null;
                        tilVar2.b = null;
                        tilVar2.c = null;
                        tilVar2.d = null;
                        tilVar2.e = null;
                        tilVar2.i = 3;
                        objJ = j(r14, tmrVar, str3, tjhVar4, z, true, tilVar2);
                        obj = awoxVar;
                        if (objJ != awoxVar) {
                            return objJ;
                        }
                    }
                } else {
                    tilVar2.a = null;
                    tilVar2.b = null;
                    tilVar2.c = null;
                    tilVar2.d = null;
                    tilVar2.e = null;
                    tilVar2.i = 3;
                    objJ = j(r14, tmrVar, str3, tjhVar4, z, true, tilVar2);
                    obj = awoxVar;
                    if (objJ != awoxVar) {
                        return objJ;
                    }
                }
            }
        } else {
            try {
                ListenableFuture listenableFutureT = ((tkr) this.a).r.t(strR);
                if (listenableFutureT != null) {
                    tnsVar2 = tnsVar;
                    try {
                        tilVar2.a = tnsVar2;
                        str2 = str;
                        try {
                            tilVar2.b = str2;
                            tjhVar2 = tjhVar;
                            try {
                                tilVar2.c = tjhVar2;
                                tilVar2.i = 1;
                                objAd = awrc.ad(listenableFutureT, tilVar2);
                                obj = awoxVar;
                                if (objAd != awoxVar) {
                                    r12 = tnsVar2;
                                    tjhVar3 = tjhVar2;
                                }
                            } catch (CancellationException unused2) {
                                tjh tjhVar8 = tjhVar2;
                                r12 = tnsVar2;
                                tjhVar3 = tjhVar8;
                            }
                        } catch (CancellationException unused3) {
                            tjhVar2 = tjhVar;
                        }
                    } catch (CancellationException unused4) {
                        str2 = str;
                    }
                } else {
                    tnsVar2 = tnsVar;
                }
            } catch (CancellationException unused5) {
            }
            str2 = str;
            tjhVar2 = tjhVar;
            tjh tjhVar9 = tjhVar2;
            r12 = tnsVar2;
            tjhVar3 = tjhVar9;
            tlj tljVar2 = this.a;
            tilVar2.a = r12;
            tilVar2.b = str2;
            tilVar2.c = tjhVar3;
            tkr tkrVar2 = (tkr) tljVar2;
            tmoVar = tkrVar2.h;
            tilVar2.d = tmoVar;
            mbcVar = tkrVar2.d;
            tilVar2.e = mbcVar;
            tilVar2.i = 2;
            objG = g(r12, str2, tilVar2);
            obj = awoxVar;
            if (objG != awoxVar) {
                tjh tjhVar10 = tjhVar3;
                mbcVar2 = mbcVar;
                objAd = objG;
                r14 = r12;
                tjhVar4 = tjhVar10;
                str3 = str2;
                tmoVar2 = tmoVar;
                tieVar = (tie) objAd;
                if (tieVar != null) {
                    tmrVar = tieVar.a;
                } else {
                    tmrVar = null;
                }
                if (tieVar == null) {
                    z = false;
                } else {
                    z = false;
                }
                if (tmrVar != null) {
                    mbcVar2.getClass();
                    boolean z5 = tieVar.e;
                    tmrVar2 = tieVar.a;
                    if (tmrVar2 != null) {
                        tilVar2.a = null;
                        tilVar2.b = null;
                        tilVar2.c = null;
                        tilVar2.d = null;
                        tilVar2.e = null;
                        tilVar2.i = 3;
                        objJ = j(r14, tmrVar, str3, tjhVar4, z, true, tilVar2);
                        obj = awoxVar;
                        if (objJ != awoxVar) {
                            return objJ;
                        }
                    } else {
                        tilVar2.a = null;
                        tilVar2.b = null;
                        tilVar2.c = null;
                        tilVar2.d = null;
                        tilVar2.e = null;
                        tilVar2.i = 3;
                        objJ = j(r14, tmrVar, str3, tjhVar4, z, true, tilVar2);
                        obj = awoxVar;
                        if (objJ != awoxVar) {
                            return objJ;
                        }
                    }
                } else {
                    tilVar2.a = null;
                    tilVar2.b = null;
                    tilVar2.c = null;
                    tilVar2.d = null;
                    tilVar2.e = null;
                    tilVar2.i = 3;
                    objJ = j(r14, tmrVar, str3, tjhVar4, z, true, tilVar2);
                    obj = awoxVar;
                    if (objJ != awoxVar) {
                        return objJ;
                    }
                }
            }
        }
        obj = awoxVar;
        return obj;
        tlj tljVar3 = this.a;
        tilVar2.a = r12;
        tilVar2.b = str2;
        tilVar2.c = tjhVar3;
        tkr tkrVar3 = (tkr) tljVar3;
        tmoVar = tkrVar3.h;
        tilVar2.d = tmoVar;
        mbcVar = tkrVar3.d;
        tilVar2.e = mbcVar;
        tilVar2.i = 2;
        objG = g(r12, str2, tilVar2);
        obj = awoxVar;
        if (objG != awoxVar) {
            tjh tjhVar11 = tjhVar3;
            mbcVar2 = mbcVar;
            objAd = objG;
            r14 = r12;
            tjhVar4 = tjhVar11;
            str3 = str2;
            tmoVar2 = tmoVar;
            tieVar = (tie) objAd;
            if (tieVar != null) {
                tmrVar = tieVar.a;
            } else {
                tmrVar = null;
            }
            if (tieVar == null) {
                z = false;
            } else {
                z = false;
            }
            if (tmrVar != null) {
                mbcVar2.getClass();
                boolean z6 = tieVar.e;
                tmrVar2 = tieVar.a;
                if (tmrVar2 != null) {
                    tilVar2.a = null;
                    tilVar2.b = null;
                    tilVar2.c = null;
                    tilVar2.d = null;
                    tilVar2.e = null;
                    tilVar2.i = 3;
                    objJ = j(r14, tmrVar, str3, tjhVar4, z, true, tilVar2);
                    obj = awoxVar;
                    if (objJ != awoxVar) {
                        return objJ;
                    }
                } else {
                    tilVar2.a = null;
                    tilVar2.b = null;
                    tilVar2.c = null;
                    tilVar2.d = null;
                    tilVar2.e = null;
                    tilVar2.i = 3;
                    objJ = j(r14, tmrVar, str3, tjhVar4, z, true, tilVar2);
                    obj = awoxVar;
                    if (objJ != awoxVar) {
                        return objJ;
                    }
                }
            } else {
                tilVar2.a = null;
                tilVar2.b = null;
                tilVar2.c = null;
                tilVar2.d = null;
                tilVar2.e = null;
                tilVar2.i = 3;
                objJ = j(r14, tmrVar, str3, tjhVar4, z, true, tilVar2);
                obj = awoxVar;
                if (objJ != awoxVar) {
                    return objJ;
                }
            }
        }
        obj = awoxVar;
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [tir] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v29, types: [tir] */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r12v1, types: [tjh] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r18v0, types: [tir] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, tns] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v5, types: [tns] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r20v1, types: [tns] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v8 */
    public final Object j(tns tnsVar, tmr tmrVar, String str, tjh tjhVar, boolean z, boolean z2, awoq awoqVar) throws Throwable {
        tim timVar;
        String str2;
        boolean z3;
        boolean z4;
        tmr tmrVar2;
        tit titVar;
        awrm awrmVar;
        awri awriVar;
        Object objK;
        awrm awrmVar2;
        ?? r12;
        ?? r1;
        ?? r0;
        ?? r4;
        String str3;
        tit titVar2;
        awrm awrmVar3;
        boolean z5;
        boolean z6;
        tnx tmlVar;
        boolean z7;
        ?? r2;
        boolean z8;
        ?? r3;
        ?? r5 = this;
        tns tnsVar2 = tnsVar;
        if (awoqVar instanceof tim) {
            timVar = (tim) awoqVar;
            int i = timVar.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                timVar.j = i - Integer.MIN_VALUE;
            } else {
                timVar = new tim(r5, awoqVar);
            }
        } else {
            timVar = new tim(r5, awoqVar);
        }
        Object objH = timVar.h;
        awox awoxVar = awox.a;
        int i2 = timVar.j;
        if (i2 != 0) {
            if (i2 == 1) {
                boolean z9 = timVar.g;
                boolean z10 = timVar.f;
                awrmVar = timVar.m;
                awrmVar2 = timVar.l;
                tit titVar3 = timVar.k;
                awri awriVar2 = (awri) timVar.e;
                tjh tjhVar2 = (tjh) timVar.d;
                String str4 = (String) timVar.c;
                tmrVar2 = (tmr) timVar.b;
                Object obj = timVar.a;
                atqp.j(objH);
                objK = ((awmn) objH).a;
                z4 = z9;
                r1 = obj;
                awriVar = awriVar2;
                r12 = tjhVar2;
                z3 = z10;
                titVar = titVar3;
                str2 = str4;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z6 = timVar.g;
                z5 = timVar.f;
                awrmVar3 = (awrm) timVar.e;
                titVar2 = (tit) timVar.d;
                awriVar = (awri) timVar.c;
                str3 = (String) timVar.b;
                Object obj2 = timVar.a;
                atqp.j(objH);
                r0 = r5;
                r4 = obj2;
            }
            z4 = z6;
            z7 = z5;
            r3 = r4;
            awrmVar2 = awrmVar3;
            titVar = titVar2;
            str2 = str3;
            tmlVar = (tnx) objH;
            r2 = r0;
            if (!tmlVar.h() && !awriVar.a) {
                if (titVar != null) {
                    Collection collectionT = r3.t();
                    collectionT.getClass();
                    titVar.a(collectionT);
                }
                tmt tmtVarA = tmlVar.c().b;
                tlj tljVar = r2.a;
                ainp ainpVarL = r3.l();
                if (tmtVarA != null && ainpVarL != null) {
                    tms tmsVar = new tms(tmtVarA);
                    tmsVar.c = ainpVarL;
                    tmtVarA = tmsVar.a();
                }
                tmt tmtVar = tmtVarA;
                tmo tmoVar = ((tkr) tljVar).h;
                tnx tnxVar = tmlVar;
                String str5 = str2;
                return tjo.e(tnxVar, ainpVarL, tmtVar, r2.m(r3, tnxVar, (tnm) awrmVar2.a, tmoVar, str5, tmtVar, z4, r2.e, z7), tmoVar, str5);
            }
        }
        atqp.j(objH);
        tjhVar.c();
        awri awriVar3 = new awri();
        tit titVarX = taq.x(r5.a);
        awrm awrmVar4 = new awrm();
        tmt tmtVar2 = tmrVar != null ? tmrVar.b : null;
        timVar.a = tnsVar2;
        timVar.b = tmrVar;
        str2 = str;
        timVar.c = str2;
        tjh tjhVar3 = tjhVar;
        timVar.d = tjhVar3;
        timVar.e = awriVar3;
        timVar.k = titVarX;
        timVar.l = awrmVar4;
        timVar.m = awrmVar4;
        z3 = z;
        timVar.f = z3;
        z4 = z2;
        timVar.g = z4;
        timVar.j = 1;
        Object objK2 = r5.k(tnsVar2, tmtVar2, titVarX, timVar);
        if (objK2 == awoxVar) {
            return awoxVar;
        }
        tmrVar2 = tmrVar;
        titVar = titVarX;
        awrmVar = awrmVar4;
        awriVar = awriVar3;
        objK = objK2;
        awrmVar2 = awrmVar;
        r1 = tnsVar2;
        r12 = tjhVar3;
        Throwable thA = awmn.a(objK);
        if (thA != null) {
            tlj tljVar2 = r5.a;
            toe toeVarB = tjo.b(thA);
            if (tljVar2.I()) {
                tnm tnmVar = toeVarB.b;
                if (tnmVar == null || tnmVar.a() == 0) {
                    z8 = true;
                } else {
                    Map map = tnmVar.e;
                    if (map != null) {
                        String str6 = (String) map.get("content-type");
                        if (str6 == null) {
                            z8 = true;
                        } else {
                            z8 = true;
                            if (!awrc.u(str6, "x-protobuf", true)) {
                            }
                        }
                    } else {
                        z8 = true;
                    }
                    objK = taq.k(toeVarB);
                }
                objK = null;
            } else {
                z8 = true;
                objK = taq.k(toeVarB);
            }
            if (objK == null) {
                toe toeVarI = r1.i(toeVarB);
                Collection collectionT2 = r1.t();
                collectionT2.getClass();
                titVar.a(collectionT2);
                return tnx.d(toeVarI);
            }
            awriVar.a = z8;
        }
        awrmVar.a = objK;
        tnm tnmVar2 = (tnm) awrmVar2.a;
        if (tnmVar2.d == 304) {
            if (tmrVar2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            if (!tmrVar2.c()) {
                tnmVar2 = new tnm(304, tmrVar2.a.a(), tnmVar2.e, true);
            }
        }
        awrmVar2.a = tnmVar2;
        r12.d(r1, (tnm) awrmVar2.a);
        if (((tnm) awrmVar2.a).d == 304 && tmrVar2 != null && tmrVar2.c()) {
            Object obj3 = tmrVar2.a.c().a;
            tms tmsVar2 = new tms(tmrVar2.b);
            tmsVar2.d(((tnm) awrmVar2.a).e);
            tmlVar = new tml(new tnw(obj3, tmsVar2.a(), null, false));
            z7 = z3;
            r2 = this;
            r3 = r1;
        } else {
            tnm tnmVar3 = (tnm) awrmVar2.a;
            boolean z11 = awriVar.a;
            timVar.a = r1;
            timVar.b = str2;
            timVar.c = awriVar;
            timVar.d = titVar;
            timVar.e = awrmVar2;
            timVar.k = null;
            timVar.l = null;
            timVar.m = null;
            timVar.f = z3;
            timVar.g = z4;
            timVar.j = 2;
            ?? r20 = r1;
            String str7 = str2;
            objH = h(r20, tnmVar3, str7, z11, false, timVar);
            r0 = this;
            r4 = r20;
            str3 = str7;
            if (objH == awoxVar) {
                return awoxVar;
            }
            titVar2 = titVar;
            awrmVar3 = awrmVar2;
            z5 = z3;
            z6 = z4;
            z4 = z6;
            z7 = z5;
            r3 = r4;
            awrmVar2 = awrmVar3;
            titVar = titVar2;
            str2 = str3;
            tmlVar = (tnx) objH;
            r2 = r0;
        }
        return !tmlVar.h() ? tmlVar : tmlVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(tns tnsVar, tmt tmtVar, tit titVar, awoq awoqVar) throws Throwable {
        tin tinVar;
        if (awoqVar instanceof tin) {
            tinVar = (tin) awoqVar;
            int i = tinVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tinVar.c = i - Integer.MIN_VALUE;
            } else {
                tinVar = new tin(this, awoqVar);
            }
        } else {
            tinVar = new tin(this, awoqVar);
        }
        Object objJ = tinVar.a;
        awox awoxVar = awox.a;
        int i2 = tinVar.c;
        if (i2 == 0) {
            atqp.j(objJ);
            tjm tjmVarC = this.d.c(tnsVar, this.a, titVar, tmtVar);
            tinVar.c = 1;
            awud awudVar = new awud(JniZero.q(tinVar), 1);
            awudVar.w();
            tiq tiqVar = new tiq(awudVar);
            awudVar.b(new tio(tjmVarC, 0));
            tjmVarC.d(tiqVar);
            objJ = awudVar.j();
            if (objJ == awoxVar) {
                return awoxVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(objJ);
        }
        return ((awmn) objJ).a;
    }
}
