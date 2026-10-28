package defpackage;

import internal.org.jni_zero.JniZero;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class awwk implements awwd {
    private final awtr a;
    public final awtr e;

    public awwk(boolean z) {
        awvn awvnVar = z ? awwl.h : awwl.g;
        awts awtsVar = awts.a;
        this.e = new awtr(awvnVar, awtsVar);
        this.a = new awtr(null, awtsVar);
    }

    public static final awui N(axdp axdpVar) {
        while (axdpVar.kx()) {
            axdpVar = axdpVar.h();
        }
        while (true) {
            axdpVar = axdpVar.g();
            if (!axdpVar.kx()) {
                if (axdpVar instanceof awui) {
                    return (awui) axdpVar;
                }
                if (axdpVar instanceof awwp) {
                    return null;
                }
            }
        }
    }

    private final awwp O(awvz awvzVar) {
        awwp awwpVarKu = awvzVar.ku();
        if (awwpVarKu != null) {
            return awwpVarKu;
        }
        Objects.checkIndex(0, 3);
        if (awvzVar != null) {
            if (awvzVar instanceof awvn) {
                return new awwp();
            }
            if (awvzVar instanceof awwg) {
                S((awwg) awvzVar);
                return null;
            }
        }
        java.util.Objects.toString(awvzVar);
        throw new IllegalStateException("State should have list: ".concat(String.valueOf(awvzVar)));
    }

    private final void P(awvz awvzVar, Object obj) throws Throwable {
        awuh awuhVarC = C();
        if (awuhVarC != null) {
            awuhVarC.kv();
            H(awwr.a);
        }
        awun awunVar = null;
        awum awumVar = obj instanceof awum ? (awum) obj : null;
        Throwable th = awumVar != null ? awumVar.b : null;
        if (awvzVar instanceof awwg) {
            try {
                ((awwg) awvzVar).a(th);
                return;
            } catch (Throwable th2) {
                g(new awun(a.bZ(this, awvzVar, "Exception in completion handler ", " for "), th2));
                return;
            }
        }
        awwp awwpVarKu = awvzVar.ku();
        if (awwpVarKu != null) {
            awwpVarKu.j(1);
            Object objF = awwpVarKu.f();
            objF.getClass();
            for (axdp axdpVarG = (axdp) objF; !awrc.c(axdpVarG, awwpVarKu); axdpVarG = axdpVarG.g()) {
                if ((axdpVarG instanceof awwg) && !axdpVarG.kx()) {
                    try {
                        ((awwg) axdpVarG).a(th);
                    } catch (Throwable th3) {
                        if (awunVar != null) {
                            avkz.d(awunVar, th3);
                        } else {
                            awunVar = new awun(a.bZ(this, axdpVarG, "Exception in completion handler ", " for "), th3);
                        }
                    }
                }
            }
            if (awunVar != null) {
                g(awunVar);
            }
        }
    }

    private final void Q(awwp awwpVar, Throwable th) throws Throwable {
        awwpVar.j(4);
        Object objF = awwpVar.f();
        objF.getClass();
        awun awunVar = null;
        for (axdp axdpVarG = (axdp) objF; !awrc.c(axdpVarG, awwpVar); axdpVarG = axdpVarG.g()) {
            if ((axdpVarG instanceof awwg) && !axdpVarG.kx()) {
                awwg awwgVar = (awwg) axdpVarG;
                if (awwgVar.b()) {
                    try {
                        awwgVar.a(th);
                    } catch (Throwable th2) {
                        if (awunVar != null) {
                            avkz.d(awunVar, th2);
                        } else {
                            awunVar = new awun(a.bZ(this, axdpVarG, "Exception in completion handler ", " for "), th2);
                        }
                    }
                }
            }
        }
        if (awunVar != null) {
            g(awunVar);
        }
        T(th);
    }

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
    private final void R(awvn awvnVar) {
        awwp awwpVar = new awwp();
        Object awvyVar = awwpVar;
        if (!awvnVar.a) {
            awvyVar = new awvy(awwpVar);
        }
        this.e.d(awvnVar, awvyVar);
    }

    private final void S(awwg awwgVar) {
        awwp awwpVar = new awwp();
        awwpVar.f.b(awwgVar);
        awwpVar.e.b(awwgVar);
        while (awwgVar.f() == awwgVar) {
            if (awwgVar.e.d(awwgVar, awwpVar)) {
                awwpVar.k(awwgVar);
                break;
            }
        }
        this.e.d(awwgVar, awwgVar.g());
    }

    private final boolean T(Throwable th) {
        if (k()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        awuh awuhVarC = C();
        if (awuhVarC == null || awuhVarC == awwr.a) {
            return z;
        }
        return awuhVarC.d(th) || z;
    }

    private static final String U(Object obj) {
        int iW = awro.w(obj);
        if (iW != 0) {
            if (iW != 1) {
                return iW != 2 ? "Completed" : "Cancelled";
            }
            return !((awvz) obj).kw() ? "New" : "Active";
        }
        awwj awwjVar = (awwj) obj;
        if (awwjVar.g()) {
            return "Cancelling";
        }
        return awwjVar.h() ? "Completing" : "Active";
    }

    private final int c(Object obj) {
        Objects.checkIndex(0, 3);
        if (obj == null) {
            return 0;
        }
        if (obj instanceof awvn) {
            if (((awvn) obj).a) {
                return 0;
            }
            if (this.e.d(obj, awwl.h)) {
                G();
                return 1;
            }
            return -1;
        }
        if (!(obj instanceof awvy)) {
            return 0;
        }
        if (this.e.d(obj, ((awvy) obj).a)) {
            G();
            return 1;
        }
        return -1;
    }

    private final Object f(Object obj, Object obj2) throws Throwable {
        axdy axdyVar;
        if (!(obj instanceof awvz)) {
            return awwl.b;
        }
        if (((obj instanceof awvn) || (obj instanceof awwg)) && !(obj instanceof awui) && !(obj2 instanceof awum)) {
            awvz awvzVar = (awvz) obj;
            boolean z = awuv.a;
            if (!this.e.d(awvzVar, awwl.a(obj2))) {
                return awwl.d;
            }
            kE(obj2);
            P(awvzVar, obj2);
            return obj2;
        }
        awvz awvzVar2 = (awvz) obj;
        awwp awwpVarO = O(awvzVar2);
        if (awwpVarO == null) {
            return awwl.d;
        }
        awwj awwjVar = awvzVar2 instanceof awwj ? (awwj) awvzVar2 : null;
        if (awwjVar == null) {
            awwjVar = new awwj(awwpVarO, null);
        }
        awrm awrmVar = new awrm();
        synchronized (awwjVar) {
            if (awwjVar.h()) {
                axdyVar = awwl.b;
            } else {
                awwjVar.b.c();
                if (awwjVar == awvzVar2 || this.e.d(awvzVar2, awwjVar)) {
                    boolean z2 = awuv.a;
                    boolean zG = awwjVar.g();
                    awum awumVar = obj2 instanceof awum ? (awum) obj2 : null;
                    if (awumVar != null) {
                        awwjVar.e(awumVar.b);
                    }
                    Throwable thD = awwjVar.d();
                    boolean z3 = !zG;
                    Boolean.valueOf(z3).getClass();
                    awrmVar.a = true == z3 ? thD : null;
                    Throwable th = (Throwable) awrmVar.a;
                    if (th != null) {
                        Q(awwpVarO, th);
                    }
                    awui awuiVarN = N(awwpVarO);
                    if (awuiVarN != null && M(awwjVar, awuiVarN, obj2)) {
                        return awwl.c;
                    }
                    awwpVarO.j(2);
                    awui awuiVarN2 = N(awwpVarO);
                    return (awuiVarN2 == null || !M(awwjVar, awuiVarN2, obj2)) ? x(awwjVar, obj2) : awwl.c;
                }
                axdyVar = awwl.d;
            }
            return axdyVar;
        }
    }

    private final Throwable i(Object obj) {
        Throwable thD;
        Objects.checkIndex(0, 2);
        if (obj == null || (obj instanceof Throwable)) {
            Throwable awweVar = (Throwable) obj;
            if (awweVar == null) {
                awweVar = new awwe(ky(), null, this);
            }
            return awweVar;
        }
        awwk awwkVar = (awwk) obj;
        Object objZ = awwkVar.z();
        Objects.checkIndex(0, 4);
        if (objZ == null) {
            thD = null;
        } else if (objZ instanceof awwj) {
            thD = ((awwj) objZ).d();
        } else if (objZ instanceof awum) {
            thD = ((awum) objZ).b;
        } else {
            if (objZ instanceof awvz) {
                java.util.Objects.toString(objZ);
                throw new IllegalStateException("Cannot be cancelling child in this state: ".concat(objZ.toString()));
            }
            thD = null;
        }
        CancellationException cancellationException = thD instanceof CancellationException ? (CancellationException) thD : null;
        return cancellationException == null ? new awwe("Parent job is ".concat(U(objZ)), thD, awwkVar) : cancellationException;
    }

    protected final CancellationException B(Throwable th, String str) {
        CancellationException awweVar = th instanceof CancellationException ? (CancellationException) th : null;
        if (awweVar == null) {
            if (str == null) {
                str = ky();
            }
            awweVar = new awwe(str, th, this);
        }
        return awweVar;
    }

    public final awuh C() {
        return (awuh) this.a.a;
    }

    public final awvk D(boolean z, awwg awwgVar) {
        boolean zL;
        awwgVar.d = this;
        while (true) {
            Object objZ = z();
            int iV = awro.v(objZ);
            if (iV != 0) {
                if (iV != 1) {
                    if (!z) {
                        break;
                    }
                    Object objZ2 = z();
                    awum awumVar = objZ2 instanceof awum ? (awum) objZ2 : null;
                    awwgVar.a(awumVar != null ? awumVar.b : null);
                    break;
                }
                awvz awvzVar = (awvz) objZ;
                awwp awwpVarKu = awvzVar.ku();
                if (awwpVarKu == null) {
                    objZ.getClass();
                    S((awwg) objZ);
                } else {
                    if (awwgVar.b()) {
                        awwj awwjVar = awvzVar instanceof awwj ? (awwj) awvzVar : null;
                        Throwable thD = awwjVar != null ? awwjVar.d() : null;
                        if (thD != null) {
                            if (!z) {
                                break;
                            }
                            awwgVar.a(thD);
                            break;
                        }
                        zL = awwpVarKu.l(awwgVar, 5);
                    } else {
                        zL = awwpVarKu.l(awwgVar, 1);
                    }
                    if (zL) {
                        return awwgVar;
                    }
                }
            } else {
                awvn awvnVar = (awvn) objZ;
                if (!awvnVar.a) {
                    R(awvnVar);
                } else if (this.e.d(objZ, awwgVar)) {
                    return awwgVar;
                }
            }
        }
        return awwr.a;
    }

    public void E(Throwable th) {
        I(th);
    }

    protected final void F(awwd awwdVar) {
        boolean z = awuv.a;
        if (awwdVar == null) {
            H(awwr.a);
            return;
        }
        awwdVar.v();
        awuh awuhVarT = awwdVar.t(this);
        H(awuhVarT);
        if (kI()) {
            awuhVarT.kv();
            H(awwr.a);
        }
    }

    public final void H(awuh awuhVar) {
        this.a.c(awuhVar);
    }

    public final boolean I(Object obj) {
        Object objF;
        axdy axdyVar;
        boolean zKt = kt();
        axdy axdyVar2 = awwl.b;
        if (zKt) {
            do {
                Object objZ = z();
                if (!(objZ instanceof awvz) || ((objZ instanceof awwj) && ((awwj) objZ).h())) {
                    objF = axdyVar2;
                    break;
                }
                objF = f(objZ, new awum(i(obj), false));
            } while (objF == awwl.d);
            if (objF != awwl.c) {
            }
            return true;
        }
        objF = axdyVar2;
        if (objF == axdyVar2) {
            Throwable thI = null;
            while (true) {
                Object objZ2 = z();
                Objects.checkIndex(0, 3);
                if (objZ2 != null) {
                    if (objZ2 instanceof awwj) {
                        synchronized (objZ2) {
                            awwj awwjVar = (awwj) objZ2;
                            if (awwjVar.c() == awwl.f) {
                                axdyVar = awwl.e;
                            } else {
                                boolean zG = awwjVar.g();
                                if (obj != null) {
                                    if (thI == null) {
                                        thI = i(obj);
                                    }
                                    awwjVar.e(thI);
                                } else if (!zG) {
                                    if (thI == null) {
                                        thI = i(obj);
                                    }
                                    awwjVar.e(thI);
                                }
                                Throwable thD = true != zG ? awwjVar.d() : null;
                                if (thD != null) {
                                    Q(((awwj) objZ2).a, thD);
                                }
                                axdyVar = awwl.b;
                            }
                        }
                    } else if (objZ2 instanceof awvz) {
                        if (thI == null) {
                            thI = i(obj);
                        }
                        awvz awvzVar = (awvz) objZ2;
                        if (awvzVar.kw()) {
                            boolean z = awuv.a;
                            awwp awwpVarO = O(awvzVar);
                            if (awwpVarO != null) {
                                if (this.e.d(awvzVar, new awwj(awwpVarO, thI))) {
                                    Q(awwpVarO, thI);
                                    axdyVar = awwl.b;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            Object objF2 = f(objZ2, new awum(thI, false));
                            if (objF2 == axdyVar2) {
                                java.util.Objects.toString(objZ2);
                                throw new IllegalStateException("Cannot happen in ".concat(objZ2.toString()));
                            }
                            if (objF2 != awwl.d) {
                                objF = objF2;
                            }
                        }
                    }
                    objF = axdyVar;
                }
                axdyVar = awwl.e;
                objF = axdyVar;
            }
        }
        if (objF != awwl.b && objF != awwl.c) {
            if (objF == awwl.e) {
                return false;
            }
            kH(objF);
        }
        return true;
    }

    public boolean J(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return I(th) && ks();
    }

    protected boolean K(Throwable th) {
        return false;
    }

    public final boolean L(Object obj) {
        Object objF;
        do {
            objF = f(z(), obj);
            if (objF == awwl.b) {
                return false;
            }
            if (objF != awwl.c) {
            }
            return true;
        } while (objF == awwl.d);
        kH(objF);
        return true;
    }

    public final boolean M(awwj awwjVar, awui awuiVar, Object obj) {
        while (awro.y(awuiVar.a, false, new awwi(this, awwjVar, awuiVar, obj)) == awwr.a) {
            awuiVar = N(awuiVar);
            if (awuiVar == null) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.awou
    public final Object fold(Object obj, awqk awqkVar) {
        return JniZero.r(this, obj, awqkVar);
    }

    @Override // defpackage.awos, defpackage.awou
    public final awos get(awot awotVar) {
        return JniZero.s(this, awotVar);
    }

    @Override // defpackage.awos
    public final awot getKey() {
        return awwd.d;
    }

    protected boolean k() {
        return false;
    }

    public String kB() {
        return awuw.a(this);
    }

    public final Object kF() throws Throwable {
        Object objZ = z();
        if (objZ instanceof awvz) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (objZ instanceof awum) {
            throw ((awum) objZ).b;
        }
        return awwl.b(objZ);
    }

    public final Object kG(Object obj) throws Throwable {
        Object objF;
        do {
            objF = f(z(), obj);
            if (objF == awwl.b) {
                String strBZ = a.bZ(obj, this, "Job ", " is already complete or completing, but is being completed with ");
                awum awumVar = obj instanceof awum ? (awum) obj : null;
                throw new IllegalStateException(strBZ, awumVar != null ? awumVar.b : null);
            }
        } while (objF == awwl.d);
        return objF;
    }

    @Override // defpackage.awwd
    public final boolean kI() {
        return !(z() instanceof awvz);
    }

    @Override // defpackage.awwd
    public final void kJ(awqg awqgVar) {
        D(true, new awwc(awqgVar));
    }

    public boolean ks() {
        return true;
    }

    public boolean kt() {
        return false;
    }

    protected String ky() {
        return "Job was cancelled";
    }

    @Override // defpackage.awwd
    public final Object l(awoq awoqVar) {
        Object objZ;
        do {
            objZ = z();
            if (!(objZ instanceof awvz)) {
                awro.A(awoqVar.getContext());
                return awmy.a;
            }
        } while (c(objZ) < 0);
        awud awudVar = new awud(JniZero.q(awoqVar), 1);
        awudVar.w();
        awudVar.x(new awvl(awro.y(this, true, new awwx(awudVar)), 0));
        Object objJ = awudVar.j();
        awox awoxVar = awox.a;
        if (objJ == awoxVar) {
            awoqVar.getClass();
        } else {
            objJ = awmy.a;
        }
        return objJ != awoxVar ? awmy.a : objJ;
    }

    @Override // defpackage.awwd
    public final CancellationException m() {
        Object objZ = z();
        int iW = awro.w(objZ);
        if (iW != 0) {
            if (iW != 1) {
                return iW != 2 ? new awwe(String.valueOf(getClass().getSimpleName()).concat(" has completed normally"), null, this) : B(((awum) objZ).b, null);
            }
            toString();
            throw new IllegalStateException("Job is still new or active: ".concat(toString()));
        }
        Throwable thD = ((awwj) objZ).d();
        if (thD != null) {
            return B(thD, String.valueOf(getClass().getSimpleName()).concat(" is cancelling"));
        }
        toString();
        throw new IllegalStateException("Job is still new or active: ".concat(toString()));
    }

    @Override // defpackage.awou
    public final awou minusKey(awot awotVar) {
        return JniZero.t(this, awotVar);
    }

    @Override // defpackage.awwd
    public final awvk n(boolean z, boolean z2, awqg awqgVar) {
        return D(z2, z ? new awwb(awqgVar) : new awwc(awqgVar));
    }

    @Override // defpackage.awwd
    public final awwd o() {
        awuh awuhVarC = C();
        if (awuhVarC != null) {
            return awuhVarC.c();
        }
        return null;
    }

    @Override // defpackage.awwd
    public void p(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new awwe(ky(), null, this);
        }
        E(cancellationException);
    }

    @Override // defpackage.awou
    public final awou plus(awou awouVar) {
        return JniZero.u(this, awouVar);
    }

    @Override // defpackage.awwd
    public final boolean q() {
        Object objZ = z();
        return (objZ instanceof awvz) && ((awvz) objZ).kw();
    }

    @Override // defpackage.awwd
    public final boolean r() {
        Object objZ = z();
        if (objZ instanceof awum) {
            return true;
        }
        return (objZ instanceof awwj) && ((awwj) objZ).g();
    }

    @Override // defpackage.awwd
    public final awuh t(awwk awwkVar) {
        awui awuiVar = new awui(awwkVar);
        awuiVar.d = this;
        while (true) {
            Object objZ = z();
            int iV = awro.v(objZ);
            if (iV != 0) {
                Throwable thD = null;
                if (iV != 1) {
                    Object objZ2 = z();
                    awum awumVar = objZ2 instanceof awum ? (awum) objZ2 : null;
                    awuiVar.a(awumVar != null ? awumVar.b : null);
                    return awwr.a;
                }
                awwp awwpVarKu = ((awvz) objZ).ku();
                if (awwpVarKu != null) {
                    if (awwpVarKu.l(awuiVar, 7)) {
                        return awuiVar;
                    }
                    boolean zL = awwpVarKu.l(awuiVar, 3);
                    Object objZ3 = z();
                    if (objZ3 instanceof awwj) {
                        thD = ((awwj) objZ3).d();
                    } else {
                        boolean z = awuv.a;
                        awum awumVar2 = objZ3 instanceof awum ? (awum) objZ3 : null;
                        if (awumVar2 != null) {
                            thD = awumVar2.b;
                        }
                    }
                    awuiVar.a(thD);
                    if (!zL) {
                        return awwr.a;
                    }
                    boolean z2 = awuv.a;
                    return awuiVar;
                }
                objZ.getClass();
                S((awwg) objZ);
            } else {
                awvn awvnVar = (awvn) objZ;
                if (!awvnVar.a) {
                    R(awvnVar);
                } else if (this.e.d(objZ, awuiVar)) {
                    return awuiVar;
                }
            }
        }
    }

    public final String toString() {
        return (kB() + '{' + U(z()) + '}') + '@' + awuw.b(this);
    }

    @Override // defpackage.awwd
    public final void v() {
        int iC;
        do {
            iC = c(z());
            if (iC == 0) {
                return;
            }
        } while (iC != 1);
    }

    public final Object w(awoq awoqVar) throws Throwable {
        Object objZ;
        do {
            objZ = z();
            if (!(objZ instanceof awvz)) {
                if (!(objZ instanceof awum)) {
                    return awwl.b(objZ);
                }
                Throwable th = ((awum) objZ).b;
                if (awuv.b && (awoqVar instanceof awph)) {
                    throw axdx.a(th, (awph) awoqVar);
                }
                throw th;
            }
        } while (c(objZ) < 0);
        awwh awwhVar = new awwh(JniZero.q(awoqVar), this);
        awwhVar.w();
        awwhVar.x(new awvl(awro.y(this, true, new awww(awwhVar)), 0));
        Object objJ = awwhVar.j();
        if (objJ != awox.a) {
            return objJ;
        }
        awoqVar.getClass();
        return objJ;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00c0 A[PHI: r3
      0x00c0: PHI (r3v10 java.lang.Throwable) = (r3v6 java.lang.Throwable), (r3v6 java.lang.Throwable), (r3v12 java.lang.Throwable) binds: [B:41:0x00a2, B:51:0x00be, B:30:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    public final Object x(awwj awwjVar, Object obj) throws Throwable {
        ArrayList<Throwable> arrayList;
        Object next;
        Throwable awweVar;
        boolean z = awuv.a;
        Object obj2 = null;
        Throwable th = null;
        awum awumVar = obj instanceof awum ? (awum) obj : null;
        Throwable th2 = awumVar != null ? awumVar.b : null;
        synchronized (awwjVar) {
            awwjVar.g();
            Object objC = awwjVar.c();
            int iU = awro.u(objC);
            if (iU == -1) {
                arrayList = new ArrayList(4);
            } else if (iU == 0) {
                ArrayList arrayList2 = new ArrayList(4);
                arrayList2.add(objC);
                arrayList = arrayList2;
            } else {
                if (iU != 1) {
                    java.util.Objects.toString(objC);
                    throw new IllegalStateException("State is ".concat(String.valueOf(objC)));
                }
                objC.getClass();
                arrayList = (ArrayList) objC;
            }
            Throwable thD = awwjVar.d();
            if (thD != null) {
                arrayList.add(0, thD);
            }
            if (th2 != null && !awrc.c(th2, thD)) {
                arrayList.add(th2);
            }
            awwjVar.f(awwl.f);
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((Throwable) next) instanceof CancellationException);
                Throwable th3 = (Throwable) next;
                if (th3 == null) {
                    awweVar = (Throwable) arrayList.get(0);
                    if (awweVar instanceof awxi) {
                        for (Object obj3 : arrayList) {
                            Throwable th4 = (Throwable) obj3;
                            if (th4 != awweVar && (th4 instanceof awxi)) {
                                obj2 = obj3;
                                break;
                            }
                        }
                        th = (Throwable) obj2;
                        if (th == null) {
                            th = awweVar;
                        }
                    } else {
                        th = awweVar;
                    }
                } else {
                    th = th3;
                }
            } else if (awwjVar.g()) {
                awweVar = new awwe(ky(), null, this);
                th = awweVar;
            }
            if (th != null && arrayList.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayList.size()));
                boolean z2 = axcn.a;
                boolean z3 = axcn.a;
                Throwable thC = (z3 || !awuv.b) ? th : axdx.c(th);
                for (Throwable thC2 : arrayList) {
                    if (!z3 && awuv.b) {
                        thC2 = axdx.c(thC2);
                    }
                    if (thC2 != th && thC2 != thC && !(thC2 instanceof CancellationException) && setNewSetFromMap.add(thC2)) {
                        avkz.d(th, thC2);
                    }
                }
            }
        }
        if (th != null && th != th2) {
            obj = new awum(th, false);
        }
        if (th != null && (T(th) || K(th))) {
            obj.getClass();
            ((awum) obj).a();
        }
        kE(obj);
        this.e.d(awwjVar, awwl.a(obj));
        P(awwjVar, obj);
        return obj;
    }

    public final Object z() {
        return this.e.a;
    }

    protected void G() {
    }

    public void g(Throwable th) throws Throwable {
        throw th;
    }

    protected void kE(Object obj) {
    }

    protected void kH(Object obj) {
    }
}
