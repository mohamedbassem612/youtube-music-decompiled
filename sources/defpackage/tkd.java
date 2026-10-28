package defpackage;

import android.text.TextUtils;
import com.google.protobuf.MessageLite;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.function.IntSupplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class tkd {
    public final awut a;
    private toc e;
    private final tha f;
    private final tjl g;
    private final tlj h;
    private final Executor i;
    private final tmo j;
    private final mbc k;
    private final tjh l;
    private tit o;
    private final vwp p;
    private final vwt r;
    private final Set m = new LinkedHashSet();
    private final Set n = new LinkedHashSet();
    private final ahub q = new ahub((byte[]) null, (byte[]) null);
    public final axff b = new axfi(true);
    public boolean c = true;
    public final tjy d = new tjy(this);

    public tkd(toc tocVar, tha thaVar, tjl tjlVar, tlj tljVar) {
        this.e = tocVar;
        this.f = thaVar;
        this.g = tjlVar;
        this.h = tljVar;
        this.a = tljVar.H(tocVar);
        this.i = tljVar.G(this.e);
        tkr tkrVar = (tkr) tljVar;
        this.j = tkrVar.h;
        this.k = tkrVar.d;
        this.p = (vwp) awrc.f(tkrVar.i);
        this.l = new tjh(tljVar);
        this.r = ((tkr) tljVar).r;
    }

    private final void l() {
        aqi aqiVarV;
        this.b.c();
        this.c = false;
        Set<String> set = this.n;
        for (String str : set) {
            vwt vwtVar = this.r;
            str.getClass();
            aeiv aeivVar = (aeiv) ((ConcurrentHashMap) vwtVar.a).remove(str);
            if (aeivVar != null && (aqiVarV = aeivVar.v()) != null) {
                aqiVarV.c();
            }
        }
        set.clear();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [tkd] */
    /* JADX WARN: Type inference failed for: r5v1, types: [tns] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r6v2, types: [tjh] */
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
    public final Object a(tmw tmwVar, tmv tmvVar, tmr tmrVar, String str, boolean z, boolean z2, awoq awoqVar) throws Throwable {
        tjt tjtVar;
        ?? r5;
        if (awoqVar instanceof tjt) {
            tjtVar = (tjt) awoqVar;
            int i = tjtVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                tjtVar.f = i - Integer.MIN_VALUE;
            } else {
                tjtVar = new tjt(this, awoqVar);
            }
        } else {
            tjtVar = new tjt(this, awoqVar);
        }
        Object objH = tjtVar.d;
        awox awoxVar = awox.a;
        int i2 = tjtVar.f;
        if (i2 == 0) {
            atqp.j(objH);
            tjtVar.a = tmwVar;
            tjtVar.h = tmrVar;
            tjtVar.g = str;
            tjtVar.b = z;
            tjtVar.c = z2;
            tjtVar.f = 1;
            objH = h(tmrVar, tmwVar, tmvVar, tjtVar);
            if (objH == awoxVar) {
                r5 = tmwVar;
                return awoxVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z2 = tjtVar.c;
            z = tjtVar.b;
            str = tjtVar.g;
            tmrVar = tjtVar.h;
            Object obj = tjtVar.a;
            atqp.j(objH);
            r5 = obj;
        }
        r5 = tmwVar;
        tjr tjrVar = (tjr) objH;
        if (tjrVar == null) {
            return tjs.c;
        }
        tmo tmoVar = this.j;
        tnx tnxVarD = tjo.d(tjrVar.a, tjrVar.b, tmoVar, str);
        this.m.add(str);
        vwp vwpVar = this.p;
        if (vwpVar != null) {
            vwpVar.d(str, tmrVar, tmoVar.b(), z);
        }
        this.l.b(r5, tnxVarD);
        this.f.c(((tml) tnxVarD).a);
        return z2 ? tjs.b : tjs.a;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0079  */
    /* JADX WARN: Code duplicated, block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r6v2, types: [tmw] */
    /* JADX WARN: Type inference failed for: r8v0, types: [tkd] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0073 -> B:22:0x0075). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(defpackage.awoq r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.tju
            if (r0 == 0) goto L13
            r0 = r9
            tju r0 = (defpackage.tju) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            tju r0 = new tju
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.e
            awox r1 = defpackage.awox.a
            int r2 = r0.g
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r2 = r0.d
            java.lang.Object r4 = r0.c
            java.lang.Object r5 = r0.b
            java.lang.Object r6 = r0.a
            defpackage.atqp.j(r9)
            goto L75
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            defpackage.atqp.j(r9)
            toc r9 = r8.e
            boolean r2 = r9 instanceof defpackage.tmw
            if (r2 != 0) goto L42
            r1 = r9
            goto L98
        L42:
            r2 = r9
            tmw r2 = (defpackage.tmw) r2
            java.util.List r2 = r2.S()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r2 = r2.iterator()
            r6 = r9
            r5 = r4
            r4 = r2
        L55:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L7d
            java.lang.Object r2 = r4.next()
            r9 = r2
            tmv r9 = (defpackage.tmv) r9
            r7 = r6
            tmw r7 = (defpackage.tmw) r7
            r0.a = r6
            r0.b = r5
            r0.c = r4
            r0.d = r2
            r0.g = r3
            java.lang.Object r9 = r8.f(r7, r9, r0)
            if (r9 == r1) goto L98
        L75:
            tjs r7 = defpackage.tjs.a
            if (r9 != r7) goto L55
            r5.add(r2)
            goto L55
        L7d:
            int r9 = r5.size()
            if (r9 != 0) goto L86
            toc r1 = r8.e
            goto L98
        L86:
            tmw r6 = (defpackage.tmw) r6
            java.util.List r8 = r6.S()
            int r8 = r8.size()
            if (r9 != r8) goto L94
            r1 = 0
            goto L98
        L94:
            tmw r1 = r6.Q(r5)
        L98:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tkd.b(awoq):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(tnm tnmVar, boolean z, awoq awoqVar) throws Throwable {
        tjv tjvVar;
        if (awoqVar instanceof tjv) {
            tjvVar = (tjv) awoqVar;
            int i = tjvVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tjvVar.c = i - Integer.MIN_VALUE;
            } else {
                tjvVar = new tjv(this, awoqVar);
            }
        } else {
            tjvVar = new tjv(this, awoqVar);
        }
        tjv tjvVar2 = tjvVar;
        Object obj = tjvVar2.a;
        awox awoxVar = awox.a;
        int i2 = tjvVar2.c;
        if (i2 != 0) {
            if (i2 == 1) {
                atqp.j(obj);
                return obj;
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(obj);
            tnx tnxVar = (tnx) obj;
            tnxVar.getClass();
            return new tnq(tnxVar, awno.a, (List) null, 12);
        }
        atqp.j(obj);
        this.e.F();
        Executor executor = this.i;
        tjo tjoVar = tjo.a;
        executor.getClass();
        toc tocVar = this.e;
        tmo tmoVar = this.j;
        tjvVar2.c = 1;
        Object objA = tjoVar.a(executor, tocVar, tnmVar, z, tmoVar, tjvVar2);
        return objA == awoxVar ? awoxVar : objA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0171, code lost:
    
        if (r12.m.contains(r5) != false) goto L66;
     */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.tnm r13, boolean r14, defpackage.awoq r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tkd.d(tnm, boolean, awoq):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v7, types: [tkd] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [tmw] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r1v2, types: [tmw] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3, types: [tmv] */
    /* JADX WARN: Type inference failed for: r2v5 */
    public final Object e(tmw tmwVar, tmv tmvVar, tmr tmrVar, String str, boolean z, awoq awoqVar) throws Throwable {
        tjx tjxVar;
        int i;
        boolean z2;
        String str2;
        ?? r2;
        tmr tmrVar2;
        ?? r10;
        ?? r0;
        if (awoqVar instanceof tjx) {
            tjxVar = (tjx) awoqVar;
            int i2 = tjxVar.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tjxVar.g = i2 - Integer.MIN_VALUE;
            } else {
                tjxVar = new tjx(this, awoqVar);
            }
        } else {
            tjxVar = new tjx(this, awoqVar);
        }
        tjx tjxVar2 = tjxVar;
        Object objH = tjxVar2.e;
        awox awoxVar = awox.a;
        int i3 = tjxVar2.g;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = tjxVar2.d;
                    boolean z3 = tjxVar2.c;
                    str2 = tjxVar2.i;
                    str = tjxVar2.h;
                    tmrVar2 = tjxVar2.j;
                    Object obj = tjxVar2.b;
                    Object obj2 = tjxVar2.a;
                    atqp.j(objH);
                    i = i4;
                    z2 = z3;
                    r10 = obj2;
                    r2 = obj;
                    r0 = this;
                } else if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            atqp.j(objH);
            return objH;
        }
        atqp.j(objH);
        String strY = tmvVar.Y();
        boolean zIsEmpty = TextUtils.isEmpty(strY);
        i = !zIsEmpty ? 1 : 0;
        if (true == zIsEmpty) {
            strY = str;
        }
        if (!zIsEmpty) {
            this.j.i(str);
        }
        if (tmrVar.c()) {
            if (!zIsEmpty) {
                this.j.h(strY, tmrVar);
            }
            tjxVar2.g = 1;
            Object objA = a(tmwVar, tmvVar, tmrVar, strY, false, z, tjxVar2);
            if (objA != awoxVar) {
                return objA;
            }
        } else {
            tkd tkdVar = this;
            z2 = z;
            str2 = strY;
            tjxVar2.a = tmwVar;
            tjxVar2.b = tmvVar;
            tjxVar2.j = tmrVar;
            tjxVar2.h = str;
            tjxVar2.i = str2;
            tjxVar2.c = z2;
            tjxVar2.d = i;
            tjxVar2.g = 2;
            objH = tkdVar.h(tmrVar, tmwVar, tmvVar, tjxVar2);
            if (objH != awoxVar) {
                r2 = tmvVar;
                tmrVar2 = tmrVar;
                r10 = tmwVar;
                r0 = tkdVar;
            }
        }
        return awoxVar;
        tjr tjrVar = (tjr) objH;
        if (tjrVar == null) {
            if (i == 0) {
                r0.j.i(str);
            }
            return tjs.c;
        }
        Object obj3 = r10.P(tjrVar.a).b;
        final int length = tmrVar2.d().length;
        tmr tmrVarA = tmr.a(tjrVar.b, new rzt(obj3, 7), new IntSupplier() { // from class: tjp
            @Override // java.util.function.IntSupplier
            public final int getAsInt() {
                return length;
            }
        });
        r0.j.h(str2, tmrVarA);
        tjxVar2.a = null;
        tjxVar2.b = null;
        tjxVar2.j = null;
        tjxVar2.h = null;
        tjxVar2.i = null;
        tjxVar2.g = 3;
        Object objA2 = r0.a(r10, r2, tmrVarA, str2, true, z2, tjxVar2);
        if (objA2 != awoxVar) {
            return objA2;
        }
        return awoxVar;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0080  */
    /* JADX WARN: Code duplicated, block: B:34:0x008a  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0071, code lost:
    
        if (r0 != r8) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009d, code lost:
    
        if (r10 == r8) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d7, code lost:
    
        if (r10 == r8) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:?, code lost:
    
        return r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [tkd] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, tmw] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [tns] */
    /* JADX WARN: Type inference failed for: r11v4, types: [tns] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, tmv] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r1v1, types: [tmw] */
    /* JADX WARN: Type inference failed for: r1v2, types: [tmw] */
    /* JADX WARN: Type inference failed for: r2v1, types: [tmv] */
    /* JADX WARN: Type inference failed for: r2v2, types: [tmv] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.tmw r11, defpackage.tmv r12, defpackage.awoq r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tkd.f(tmw, tmv, awoq):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [awrm, int] */
    public final Object g(awoq awoqVar) throws Throwable {
        tka tkaVar;
        awrm awrmVar;
        if (awoqVar instanceof tka) {
            tkaVar = (tka) awoqVar;
            int i = tkaVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tkaVar.c = i - Integer.MIN_VALUE;
            } else {
                tkaVar = new tka(this, awoqVar);
            }
        } else {
            tkaVar = new tka(this, awoqVar);
        }
        Object objB = tkaVar.a;
        Object obj = awox.a;
        ?? r2 = tkaVar.c;
        try {
            if (r2 != 0) {
                if (r2 == 1) {
                    awrmVar = tkaVar.d;
                    atqp.j(objB);
                } else if (r2 == 2) {
                    awrm awrmVar2 = tkaVar.d;
                    atqp.j(objB);
                } else {
                    if (r2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    atqp.j(objB);
                }
                return awmy.a;
            }
            atqp.j(objB);
            this.l.e(this.e);
            awrmVar = new awrm();
            tkaVar.d = awrmVar;
            tkaVar.c = 1;
            objB = b(tkaVar);
            if (objB == obj) {
                return obj;
            }
            toc tocVar = (toc) objB;
            if (tocVar == null) {
                j();
            } else {
                this.l.c();
                this.e = tocVar;
                tlj tljVar = this.h;
                tit titVarX = taq.x(tljVar);
                awrmVar.a = this.g.c(this.e, tljVar, titVarX, null);
                this.o = titVarX;
                tjm tjmVar = (tjm) awrmVar.a;
                tkaVar.d = awrmVar;
                tkaVar.c = 2;
                Object objJ = awrc.J(new qbj(tjmVar, this, (awoq) null, 6), tkaVar);
                if (objJ != obj) {
                    objJ = awmy.a;
                }
                if (objJ == obj) {
                    return obj;
                }
            }
        } catch (Throwable th) {
            awwq awwqVar = awwq.a;
            tkb tkbVar = new tkb(this, r2, th, null);
            tkaVar.d = null;
            tkaVar.c = 3;
            if (awro.p(awwqVar, tkbVar, tkaVar) == obj) {
                return obj;
            }
        }
        return awmy.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [tmw] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r11v1, types: [tmv] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r8v0, types: [tkd] */
    public final Object h(tmr tmrVar, tmw tmwVar, tmv tmvVar, awoq awoqVar) throws Throwable {
        tkc tkcVar;
        ?? r11;
        ?? r10;
        if (awoqVar instanceof tkc) {
            tkcVar = (tkc) awoqVar;
            int i = tkcVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                tkcVar.e = i - Integer.MIN_VALUE;
            } else {
                tkcVar = new tkc(this, awoqVar);
            }
        } else {
            tkcVar = new tkc(this, awoqVar);
        }
        Object objC = tkcVar.c;
        awox awoxVar = awox.a;
        int i2 = tkcVar.e;
        try {
            if (i2 == 0) {
                atqp.j(objC);
                tmp tmpVar = tmrVar.a;
                if (tmpVar.b() == 2) {
                    MessageLite messageLite = (MessageLite) tmwVar.R(tmvVar, tmpVar.c().a);
                    tmt tmtVar = tmrVar.b;
                    tmtVar.getClass();
                    return new tjr(messageLite, tmtVar);
                }
                tnm tnmVar = new tnm(200, tmpVar.a(), (Map) tmrVar.b.c, true);
                tkcVar.f = tmrVar;
                tkcVar.a = tmwVar;
                tkcVar.b = tmvVar;
                tkcVar.e = 1;
                objC = c(tnmVar, true, tkcVar);
                r10 = tmwVar;
                r11 = tmvVar;
                if (objC == awoxVar) {
                    return awoxVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj = tkcVar.b;
                Object obj2 = tkcVar.a;
                tmrVar = tkcVar.f;
                atqp.j(objC);
                r10 = obj2;
                r11 = obj;
            }
            tnx tnxVar = ((tnq) objC).a;
            if (!tnxVar.h()) {
                twu.c(6, "Failed to parse cache entry", tnxVar.a().a);
                return null;
            }
            Object obj3 = tnxVar.c().a;
            if (obj3 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            MessageLite messageLite2 = (MessageLite) r10.R(r11, obj3);
            tmt tmtVar2 = tnxVar.c().b;
            if (tmtVar2 == null) {
                tmtVar2 = tmrVar.b;
            }
            tmtVar2.getClass();
            return new tjr(messageLite2, tmtVar2);
        } catch (Exception e) {
            twu.c(6, "Exception while parsing cache entry", e);
        }
    }

    public final void i(awut awutVar, awqk awqkVar) {
        uzq uzqVar = new uzq(this, awqkVar, (awoq) null, 1);
        awutVar.getClass();
        awro.r(awutVar, awov.a, 4, new afyc(this.q, uzqVar, null));
    }

    public final void j() {
        tit titVar = this.o;
        if (titVar != null) {
            Collection collectionT = this.e.t();
            collectionT.getClass();
            titVar.a(collectionT);
        }
        l();
        this.f.a();
    }

    public final void k(Throwable th) {
        l();
        toe toeVarI = this.e.i(tjo.b(th));
        tit titVar = this.o;
        if (titVar != null) {
            Collection collectionT = this.e.t();
            collectionT.getClass();
            titVar.a(collectionT);
        }
        this.f.b(new tnv(toeVarI));
    }
}
