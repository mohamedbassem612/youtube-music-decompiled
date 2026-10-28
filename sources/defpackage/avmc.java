package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class avmc implements avmf {
    public static avlh f(axso axsoVar) {
        avtu avtuVar = new avtu(axsoVar, awhj.INSTANCE, avlh.a);
        avnn avnnVar = atqp.j;
        return avtuVar;
    }

    public static avmc m(avme avmeVar) {
        awgn awgnVar = new awgn(avmeVar);
        avnn avnnVar = atqp.o;
        return awgnVar;
    }

    public static avmc n(Callable callable) {
        awgo awgoVar = new awgo(callable);
        avnn avnnVar = atqp.o;
        return awgoVar;
    }

    public static avmc q(Throwable th) {
        th.getClass();
        awgy awgyVar = new awgy(new avog(th));
        avnn avnnVar = atqp.o;
        return awgyVar;
    }

    public static avmc s(Callable callable) {
        awhg awhgVar = new awhg(callable);
        avnn avnnVar = atqp.o;
        return awhgVar;
    }

    public static avmc t(Object obj) {
        obj.getClass();
        awhk awhkVar = new awhk(obj);
        avnn avnnVar = atqp.o;
        return awhkVar;
    }

    public final avmc A(long j, TimeUnit timeUnit, avmf avmfVar) {
        return B(j, timeUnit, awlg.a(), avmfVar);
    }

    public final avmc B(long j, TimeUnit timeUnit, avmb avmbVar, avmf avmfVar) {
        timeUnit.getClass();
        avmbVar.getClass();
        awhu awhuVar = new awhu(this, j, timeUnit, avmbVar, avmfVar);
        avnn avnnVar = atqp.o;
        return awhuVar;
    }

    public final avmn C(avni avniVar) {
        return D(avniVar, avoi.e);
    }

    public final avmn D(avni avniVar, avni avniVar2) {
        avpa avpaVar = new avpa(avniVar, avniVar2);
        F(avpaVar);
        return avpaVar;
    }

    public final Object E() {
        avoy avoyVar = new avoy();
        F(avoyVar);
        return avoyVar.c();
    }

    @Override // defpackage.avmf
    public final void F(avmd avmdVar) {
        avmdVar.getClass();
        avnf avnfVar = atqp.u;
        try {
            G(avmdVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            avkz.a(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    protected abstract void G(avmd avmdVar);

    public final void H() {
        D(avoi.d, avoi.e);
    }

    public final avlb c(avnn avnnVar) {
        awhc awhcVar = new awhc(this, avnnVar);
        avnn avnnVar2 = atqp.p;
        return awhcVar;
    }

    public final avlb e() {
        avqd avqdVar = new avqd(this);
        avnn avnnVar = atqp.p;
        return avqdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final avlh g() {
        if (this instanceof avol) {
            return ((avol) this).a();
        }
        awhy awhyVar = new awhy(this);
        avnn avnnVar = atqp.j;
        return awhyVar;
    }

    public final avlm h(avno avnoVar) {
        avyn avynVar = new avyn(this, avnoVar);
        avnn avnnVar = atqp.n;
        return avynVar;
    }

    public final avlm i(avnn avnnVar) {
        awhf awhfVar = new awhf(this, avnnVar);
        avnn avnnVar2 = atqp.n;
        return awhfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final avlm j() {
        if (this instanceof avom) {
            return ((avom) this).a();
        }
        avyw avywVar = new avyw(this);
        avnn avnnVar = atqp.n;
        return avywVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final avlr k() {
        if (this instanceof avon) {
            return ((avon) this).a();
        }
        awia awiaVar = new awia(this);
        avnn avnnVar = atqp.l;
        return awiaVar;
    }

    public final avmc l() {
        awgl awglVar = new awgl(this);
        avnn avnnVar = atqp.o;
        return awglVar;
    }

    public final avmc o(avni avniVar) {
        awgt awgtVar = new awgt(this, avniVar);
        avnn avnnVar = atqp.o;
        return awgtVar;
    }

    public final avmc p(avni avniVar) {
        awgx awgxVar = new awgx(this, avniVar);
        avnn avnnVar = atqp.o;
        return awgxVar;
    }

    public final avmc r(avnn avnnVar) {
        awha awhaVar = new awha(this, avnnVar);
        avnn avnnVar2 = atqp.o;
        return awhaVar;
    }

    public final avmc u(avnn avnnVar) {
        awhl awhlVar = new awhl(this, avnnVar);
        avnn avnnVar2 = atqp.o;
        return awhlVar;
    }

    public final avmc v(avmb avmbVar) {
        avmbVar.getClass();
        awhn awhnVar = new awhn(this, avmbVar);
        avnn avnnVar = atqp.o;
        return awhnVar;
    }

    public final avmc w(avnn avnnVar) {
        awhp awhpVar = new awhp(this, avnnVar, null);
        avnn avnnVar2 = atqp.o;
        return awhpVar;
    }

    public final avmc x(Object obj) {
        obj.getClass();
        awhp awhpVar = new awhp(this, null, obj);
        avnn avnnVar = atqp.o;
        return awhpVar;
    }

    public final avmc y(avmb avmbVar) {
        avmbVar.getClass();
        awhr awhrVar = new awhr(this, avmbVar);
        avnn avnnVar = atqp.o;
        return awhrVar;
    }

    public final avmc z(long j, TimeUnit timeUnit) {
        return B(j, timeUnit, awlg.a(), null);
    }
}
