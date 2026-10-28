package defpackage;

import j$.util.Objects;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class awud extends awvg implements awuc, awph, awxo {
    public final awoq a;
    public final awou b;
    public final awtp c;
    public final awtr d;
    private final awtr f;

    public awud(awoq awoqVar, int i) {
        super(i);
        this.a = awoqVar;
        boolean z = awuv.a;
        this.b = awoqVar.getContext();
        awts awtsVar = awts.a;
        this.c = new awtp(536870911, awtsVar);
        this.d = new awtr(awtu.a, awtsVar);
        this.f = new awtr(null, awtsVar);
    }

    private final awvk F() {
        awwd awwdVar = (awwd) this.b.get(awwd.d);
        if (awwdVar == null) {
            return null;
        }
        awvk awvkVarY = awro.y(awwdVar, true, new awug(this));
        this.f.d(null, awvkVarY);
        return awvkVarY;
    }

    private final void G(int i) throws awve {
        awtp awtpVar;
        int i2;
        do {
            awtpVar = this.c;
            i2 = awtpVar.b;
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z = awuv.a;
                awoq awoqVarQ = q();
                boolean z2 = i == 4;
                if (z2 || !(awoqVarQ instanceof axda) || a.az(i) != a.az(this.e)) {
                    awuw.d(this, awoqVarQ, z2);
                    return;
                }
                axda axdaVar = (axda) awoqVarQ;
                awuq awuqVar = axdaVar.a;
                awou context = axdaVar.getContext();
                try {
                    if (awuqVar.fX(context)) {
                        try {
                            awuqVar.a(context, this);
                            return;
                        } catch (Throwable th) {
                            throw new awve(th, awuqVar, context);
                        }
                    }
                    ThreadLocal threadLocal = awxh.a;
                    awvo awvoVarA = awxh.a();
                    if (awvoVarA.q()) {
                        awvoVarA.o(this);
                        return;
                    }
                    awvoVarA.p(true);
                    try {
                        awuw.d(this, q(), true);
                        do {
                        } while (awvoVarA.s());
                    } catch (Throwable th2) {
                        try {
                            E(th2);
                        } finally {
                            awvoVarA.n(true);
                        }
                    }
                    return;
                } catch (Throwable th3) {
                    throw new awve(th3, awuqVar, context);
                }
            }
        } while (!awtpVar.c(i2, (536870911 & i2) + 1073741824));
    }

    private static final void H(Object obj, Object obj2) {
        throw new IllegalStateException(a.bZ(obj2, obj, "It's prohibited to register multiple handlers, tried to register ", ", already has "));
    }

    private static final Object I(awws awwsVar, Object obj, int i, awql awqlVar) {
        if (obj instanceof awum) {
            boolean z = awuv.a;
            return obj;
        }
        if (!a.az(i)) {
            return obj;
        }
        if (awqlVar == null) {
            if (!(awwsVar instanceof awub)) {
                return obj;
            }
            awqlVar = null;
        }
        return new awul(obj, awwsVar instanceof awub ? (awub) awwsVar : null, awqlVar, null);
    }

    private final void J(axcv axcvVar) {
        int i = this.c.b & 536870911;
        if (i == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            axcvVar.k(i);
        } catch (Throwable th) {
            awou awouVar = this.b;
            toString();
            awrc.Q(awouVar, new awun("Exception in invokeOnCancellation handler for ".concat(toString()), th));
        }
    }

    public final boolean A() {
        return this.e == 2 && ((axda) this.a).f.a != null;
    }

    @Override // defpackage.awxo
    public final void B(axcv axcvVar, int i) {
        awtp awtpVar;
        int i2;
        do {
            awtpVar = this.c;
            i2 = awtpVar.b;
            if ((i2 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!awtpVar.c(i2, ((i2 >> 29) << 29) + i));
        x(axcvVar);
    }

    @Override // defpackage.awvg
    public final void C(Throwable th) {
        while (true) {
            awtr awtrVar = this.d;
            Object obj = awtrVar.a;
            Objects.checkIndex(0, 4);
            if (obj != null) {
                if (obj instanceof awws) {
                    throw new IllegalStateException("Not completed");
                }
                if (obj instanceof awum) {
                    return;
                }
                if (obj instanceof awul) {
                    awul awulVar = (awul) obj;
                    if (awulVar.a()) {
                        throw new IllegalStateException("Must be called at most once");
                    }
                    if (awtrVar.d(obj, awul.b(awulVar, null, th, 15))) {
                        awub awubVar = awulVar.b;
                        if (awubVar != null) {
                            s(awubVar, th);
                        }
                        awql awqlVar = awulVar.c;
                        if (awqlVar != null) {
                            t(awqlVar, th, awulVar.a);
                            return;
                        }
                        return;
                    }
                }
            }
            if (awtrVar.d(obj, new awul(obj, null, null, th))) {
                return;
            }
        }
    }

    public final axdy D(Object obj, awql awqlVar) {
        awtr awtrVar;
        Object obj2;
        do {
            awtrVar = this.d;
            obj2 = awtrVar.a;
            Objects.checkIndex(0, 3);
            if (obj2 == null || !(obj2 instanceof awws)) {
                return null;
            }
        } while (!awtrVar.d(obj2, I((awws) obj2, obj, this.e, awqlVar)));
        v();
        return awue.a;
    }

    @Override // defpackage.awuc
    public final void a(Object obj) throws awve {
        boolean z = awuv.a;
        G(this.e);
    }

    @Override // defpackage.awuc
    public final void b(awqg awqgVar) {
        x(new awvl(awqgVar, 1));
    }

    @Override // defpackage.awuc
    public final void c(Object obj, awqg awqgVar) throws awve {
        z(obj, this.e, new axfg(awqgVar, 1));
    }

    @Override // defpackage.awuc
    public final void d(Object obj, awql awqlVar) throws awve {
        z(obj, this.e, awqlVar);
    }

    @Override // defpackage.awuc
    public final void e(awuq awuqVar, Object obj) throws awve {
        awoq awoqVar = this.a;
        axda axdaVar = awoqVar instanceof axda ? (axda) awoqVar : null;
        z(obj, (axdaVar != null ? axdaVar.a : null) == awuqVar ? 4 : this.e, null);
    }

    @Override // defpackage.awuc
    public final boolean f(Throwable th) throws awve {
        awtr awtrVar;
        Object obj;
        do {
            awtrVar = this.d;
            obj = awtrVar.a;
            if (!(obj instanceof awws)) {
                return false;
            }
        } while (!awtrVar.d(obj, new awuf(this, th, (obj instanceof awub) || (obj instanceof axcv))));
        awws awwsVar = (awws) obj;
        Objects.checkIndex(0, 3);
        if (awwsVar != null) {
            if (awwsVar instanceof awub) {
                s((awub) obj, th);
            } else if (awwsVar instanceof axcv) {
                J((axcv) obj);
            }
        }
        v();
        G(this.e);
        return true;
    }

    @Override // defpackage.awuc
    public final boolean g() {
        return k() instanceof awuf;
    }

    @Override // defpackage.awph
    public final awph getCallerFrame() {
        awoq awoqVar = this.a;
        if (awoqVar instanceof awph) {
            return (awph) awoqVar;
        }
        return null;
    }

    @Override // defpackage.awoq
    public final awou getContext() {
        return this.b;
    }

    @Override // defpackage.awph
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // defpackage.awuc
    public final boolean h() {
        return !(k() instanceof awws);
    }

    @Override // defpackage.awuc
    public final Object i(Object obj, awql awqlVar) {
        return D(obj, awqlVar);
    }

    public final Object j() {
        awtp awtpVar;
        int i;
        awwd awwdVar;
        boolean zA = A();
        do {
            awtpVar = this.c;
            i = awtpVar.b;
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zA) {
                    y();
                }
                Object objK = k();
                if (objK instanceof awum) {
                    Throwable th = ((awum) objK).b;
                    if (awuv.b) {
                        throw axdx.a(th, this);
                    }
                    throw th;
                }
                if (!a.az(this.e) || (awwdVar = (awwd) this.b.get(awwd.d)) == null || awwdVar.q()) {
                    return l(objK);
                }
                CancellationException cancellationExceptionM = awwdVar.m();
                C(cancellationExceptionM);
                if (awuv.b) {
                    throw axdx.a(cancellationExceptionM, this);
                }
                throw cancellationExceptionM;
            }
        } while (!awtpVar.c(i, (536870911 & i) + 536870912));
        if (r() == null) {
            F();
        }
        if (zA) {
            y();
        }
        return awox.a;
    }

    public final Object k() {
        return this.d.a;
    }

    @Override // defpackage.awvg
    public final Object l(Object obj) {
        return obj instanceof awul ? ((awul) obj).a : obj;
    }

    @Override // defpackage.awvg
    public final Object m() {
        return k();
    }

    protected String n() {
        return "CancellableContinuation";
    }

    public Throwable o(awwd awwdVar) {
        return awwdVar.m();
    }

    @Override // defpackage.awvg
    public final Throwable p(Object obj) {
        Throwable thP = super.p(obj);
        if (thP == null) {
            return null;
        }
        awoq awoqVar = this.a;
        return (awuv.b && (awoqVar instanceof awph)) ? axdx.a(thP, (awph) awoqVar) : thP;
    }

    @Override // defpackage.awvg
    public final awoq q() {
        return this.a;
    }

    public final awvk r() {
        return (awvk) this.f.a;
    }

    @Override // defpackage.awoq
    public final void resumeWith(Object obj) throws awve {
        Throwable thA = awmn.a(obj);
        if (thA != null) {
            if (awuv.b) {
                thA = axdx.a(thA, this);
            }
            obj = new awum(thA, false);
        }
        z(obj, this.e, null);
    }

    public final void s(awub awubVar, Throwable th) {
        try {
            awubVar.b(th);
        } catch (Throwable th2) {
            awou awouVar = this.b;
            toString();
            awrc.Q(awouVar, new awun("Exception in invokeOnCancellation handler for ".concat(toString()), th2));
        }
    }

    public final void t(awql awqlVar, Throwable th, Object obj) {
        try {
            awqlVar.invoke(th, obj, this.b);
        } catch (Throwable th2) {
            awou awouVar = this.b;
            toString();
            awrc.Q(awouVar, new awun("Exception in resume onCancellation handler for ".concat(toString()), th2));
        }
    }

    public final String toString() {
        String str;
        String strC = awuw.c(this.a);
        int iK = awqx.k(k());
        if (iK != 0) {
            str = iK != 1 ? "Completed" : "Cancelled";
        } else {
            str = "Active";
        }
        return n() + '(' + strC + "){" + str + "}@" + awuw.b(this);
    }

    public final void u() {
        awvk awvkVarR = r();
        if (awvkVarR != null) {
            awvkVarR.kv();
            this.f.c(awwr.a);
        }
    }

    public final void v() {
        if (A()) {
            return;
        }
        u();
    }

    public final void w() {
        awvk awvkVarF = F();
        if (awvkVarF == null || !h()) {
            return;
        }
        awvkVarF.kv();
        this.f.c(awwr.a);
    }

    public final void x(Object obj) {
        boolean z = awuv.a;
        while (true) {
            awtr awtrVar = this.d;
            Object obj2 = awtrVar.a;
            Objects.checkIndex(0, 6);
            if (obj2 != null) {
                if (obj2 instanceof awtu) {
                    if (awtrVar.d(obj2, obj)) {
                        return;
                    }
                } else if ((obj2 instanceof awub) || (obj2 instanceof axcv)) {
                    H(obj, obj2);
                } else {
                    if (obj2 instanceof awum) {
                        awum awumVar = (awum) obj2;
                        if (!awumVar.a()) {
                            H(obj, obj2);
                        }
                        if (obj2 instanceof awuf) {
                            Throwable th = awumVar.b;
                            if (obj instanceof awub) {
                                s((awub) obj, th);
                                return;
                            } else {
                                obj.getClass();
                                J((axcv) obj);
                                return;
                            }
                        }
                        return;
                    }
                    if (obj2 instanceof awul) {
                        awul awulVar = (awul) obj2;
                        if (awulVar.b != null) {
                            H(obj, obj2);
                        }
                        if (obj instanceof axcv) {
                            return;
                        }
                        obj.getClass();
                        awub awubVar = (awub) obj;
                        if (awulVar.a()) {
                            s(awubVar, awulVar.e);
                            return;
                        } else if (awtrVar.d(obj2, awul.b(awulVar, awubVar, null, 29))) {
                            return;
                        }
                    }
                }
            }
            if (obj instanceof axcv) {
                return;
            }
            obj.getClass();
            if (awtrVar.d(obj2, new awul(obj2, (awub) obj, null, null))) {
                return;
            }
        }
    }

    public final void y() throws awve {
        awtr awtrVar;
        axdy axdyVar;
        awoq awoqVar = this.a;
        Throwable th = null;
        axda axdaVar = awoqVar instanceof axda ? (axda) awoqVar : null;
        if (axdaVar != null) {
            do {
                awtrVar = axdaVar.f;
                Object obj = awtrVar.a;
                axdyVar = axdb.b;
                if (obj != axdyVar) {
                    if (!(obj instanceof Throwable)) {
                        java.util.Objects.toString(obj);
                        throw new IllegalStateException("Inconsistent state ".concat(String.valueOf(obj)));
                    }
                    if (!awtrVar.d(obj, null)) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    th = (Throwable) obj;
                    break;
                }
            } while (!awtrVar.d(axdyVar, this));
            if (th != null) {
                u();
                f(th);
            }
        }
    }

    public final void z(Object obj, int i, awql awqlVar) throws awve {
        awtr awtrVar;
        Object obj2;
        do {
            awtrVar = this.d;
            obj2 = awtrVar.a;
            int iK = awqx.k(obj2);
            if (iK != 0) {
                if (iK == 1) {
                    awuf awufVar = (awuf) obj2;
                    if (awufVar.a.b()) {
                        if (awqlVar != null) {
                            t(awqlVar, awufVar.b, obj);
                            return;
                        }
                        return;
                    }
                }
                java.util.Objects.toString(obj);
                throw new IllegalStateException("Already resumed, but proposed with update ".concat(String.valueOf(obj)));
            }
        } while (!awtrVar.d(obj2, I((awws) obj2, obj, i, awqlVar)));
        v();
        G(i);
    }
}
