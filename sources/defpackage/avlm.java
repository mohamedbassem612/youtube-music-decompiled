package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class avlm implements avlp {
    public static avlm l() {
        avyi avyiVar = avyi.a;
        avnn avnnVar = atqp.n;
        return avyiVar;
    }

    public static avlm m(Throwable th) {
        th.getClass();
        avyj avyjVar = new avyj(th);
        avnn avnnVar = atqp.n;
        return avyjVar;
    }

    public static avlm p(Callable callable) {
        avyv avyvVar = new avyv(callable);
        avnn avnnVar = atqp.n;
        return avyvVar;
    }

    public static avlm q(Object obj) {
        obj.getClass();
        avzd avzdVar = new avzd(obj);
        avnn avnnVar = atqp.n;
        return avzdVar;
    }

    public static avlm y(long j, TimeUnit timeUnit, avmb avmbVar) {
        timeUnit.getClass();
        avmbVar.getClass();
        avzz avzzVar = new avzz(Math.max(0L, j), timeUnit, avmbVar);
        avnn avnnVar = atqp.n;
        return avzzVar;
    }

    public final avmc A(avmf avmfVar) {
        avzt avztVar = new avzt(this, avmfVar);
        avnn avnnVar = atqp.o;
        return avztVar;
    }

    public final avmc B(Object obj) {
        awaf awafVar = new awaf(this, obj);
        avnn avnnVar = atqp.o;
        return awafVar;
    }

    public final avmn C(avni avniVar, avni avniVar2) {
        return D(avniVar, avniVar2, avoi.c);
    }

    public final avmn D(avni avniVar, avni avniVar2, avnd avndVar) {
        avyc avycVar = new avyc(avniVar, avniVar2, avndVar);
        F(avycVar);
        return avycVar;
    }

    public final Object E() {
        avoy avoyVar = new avoy();
        F(avoyVar);
        return avoyVar.c();
    }

    @Override // defpackage.avlp
    public final void F(avln avlnVar) {
        avlnVar.getClass();
        avnf avnfVar = atqp.s;
        try {
            G(avlnVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            avkz.a(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    protected abstract void G(avln avlnVar);

    public final void H() {
        D(avoi.d, avoi.e, avoi.c);
    }

    public final avlb c(avnn avnnVar) {
        avyp avypVar = new avyp(this, avnnVar);
        avnn avnnVar2 = atqp.p;
        return avypVar;
    }

    public final avlb e() {
        avyz avyzVar = new avyz(this);
        avnn avnnVar = atqp.p;
        return avyzVar;
    }

    public final avlm f() {
        avyb avybVar = new avyb(this);
        avnn avnnVar = atqp.n;
        return avybVar;
    }

    public final avlm g(Class cls) {
        return r(new avoa(cls));
    }

    public final avlm h(Object obj) {
        avzd avzdVar = new avzd(obj);
        avnn avnnVar = atqp.n;
        return w(avzdVar);
    }

    public final avlm i(avnd avndVar) {
        avni avniVar = avoi.d;
        avzl avzlVar = new avzl(this, avniVar, avniVar, avndVar);
        avnn avnnVar = atqp.n;
        return avzlVar;
    }

    public final avlm j(avni avniVar) {
        avzl avzlVar = new avzl(this, avoi.d, avniVar, avoi.c);
        avnn avnnVar = atqp.n;
        return avzlVar;
    }

    public final avlm k(avni avniVar) {
        avzl avzlVar = new avzl(this, avniVar, avoi.d, avoi.c);
        avnn avnnVar = atqp.n;
        return avzlVar;
    }

    public final avlm n(avno avnoVar) {
        avyl avylVar = new avyl(this, avnoVar);
        avnn avnnVar = atqp.n;
        return avylVar;
    }

    public final avlm o(avnn avnnVar) {
        avyu avyuVar = new avyu(this, avnnVar);
        avnn avnnVar2 = atqp.n;
        return avyuVar;
    }

    public final avlm r(avnn avnnVar) {
        avzf avzfVar = new avzf(this, avnnVar);
        avnn avnnVar2 = atqp.n;
        return avzfVar;
    }

    public final avlm s(avmb avmbVar) {
        avmbVar.getClass();
        avzh avzhVar = new avzh(this, avmbVar);
        avnn avnnVar = atqp.n;
        return avzhVar;
    }

    public final avlm t() {
        return u(avoi.f);
    }

    public final avlm u(avno avnoVar) {
        avzi avziVar = new avzi(this, avnoVar);
        avnn avnnVar = atqp.n;
        return avziVar;
    }

    public final avlm v(avmb avmbVar) {
        avmbVar.getClass();
        avzn avznVar = new avzn(this, avmbVar);
        avnn avnnVar = atqp.n;
        return avznVar;
    }

    public final avlm w(avlp avlpVar) {
        avzq avzqVar = new avzq(this, avlpVar);
        avnn avnnVar = atqp.n;
        return avzqVar;
    }

    public final avlm x(long j, TimeUnit timeUnit) {
        avzx avzxVar = new avzx(this, y(j, timeUnit, awlg.a()), null);
        avnn avnnVar = atqp.n;
        return avzxVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final avlr z() {
        if (this instanceof avon) {
            return ((avon) this).a();
        }
        awad awadVar = new awad(this);
        avnn avnnVar = atqp.l;
        return awadVar;
    }
}
