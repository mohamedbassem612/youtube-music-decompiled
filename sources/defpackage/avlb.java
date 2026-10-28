package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class avlb implements avle {
    public static avlb e() {
        avlb avlbVar = avpy.a;
        avnn avnnVar = atqp.p;
        return avlbVar;
    }

    public static avlb g(avld avldVar) {
        avps avpsVar = new avps(avldVar);
        avnn avnnVar = atqp.p;
        return avpsVar;
    }

    public static avlb h(Callable callable) {
        avpt avptVar = new avpt(callable);
        avnn avnnVar = atqp.p;
        return avptVar;
    }

    public static avlb m(Throwable th) {
        th.getClass();
        avpz avpzVar = new avpz(th);
        avnn avnnVar = atqp.p;
        return avpzVar;
    }

    public static avlb n(avnd avndVar) {
        avqa avqaVar = new avqa(avndVar);
        avnn avnnVar = atqp.p;
        return avqaVar;
    }

    public static avlb o(Runnable runnable) {
        avqb avqbVar = new avqb(runnable);
        avnn avnnVar = atqp.p;
        return avqbVar;
    }

    public static avlb x(long j, TimeUnit timeUnit, avmb avmbVar) {
        timeUnit.getClass();
        avmbVar.getClass();
        avqz avqzVar = new avqz(j, timeUnit, avmbVar);
        avnn avnnVar = atqp.p;
        return avqzVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final avlr A() {
        if (this instanceof avon) {
            return ((avon) this).a();
        }
        avrc avrcVar = new avrc(this);
        avnn avnnVar = atqp.l;
        return avrcVar;
    }

    public final avmc B(avmf avmfVar) {
        awgq awgqVar = new awgq(avmfVar, this);
        avnn avnnVar = atqp.o;
        return awgqVar;
    }

    public final avmc C(Object obj) {
        avre avreVar = new avre(this, obj);
        avnn avnnVar = atqp.o;
        return avreVar;
    }

    public final avmn D() {
        avpd avpdVar = new avpd();
        kp(avpdVar);
        return avpdVar;
    }

    public final avmn E(avnd avndVar) {
        avoz avozVar = new avoz(avndVar);
        kp(avozVar);
        return avozVar;
    }

    public final avmn F(avnd avndVar, avni avniVar) {
        avoz avozVar = new avoz(avniVar, avndVar);
        kp(avozVar);
        return avozVar;
    }

    public final void G() {
        avoy avoyVar = new avoy();
        kp(avoyVar);
        avoyVar.c();
    }

    protected abstract void H(avlc avlcVar);

    public final avlb I(avni avniVar, avni avniVar2, avnd avndVar, avnd avndVar2) {
        avqq avqqVar = new avqq(this, avniVar, avniVar2, avndVar, avndVar2);
        avnn avnnVar = atqp.p;
        return avqqVar;
    }

    public final avlb c(avle avleVar) {
        avpl avplVar = new avpl(this, avleVar);
        avnn avnnVar = atqp.p;
        return avplVar;
    }

    public final avlb f(avlf avlfVar) {
        avle avleVarC = avlfVar.c(this);
        if (avleVarC instanceof avlb) {
            avlb avlbVar = (avlb) avleVarC;
            avnn avnnVar = atqp.p;
            return avlbVar;
        }
        avqe avqeVar = new avqe(avleVarC);
        avnn avnnVar2 = atqp.p;
        return avqeVar;
    }

    public final avlb i(avnd avndVar) {
        avpx avpxVar = new avpx(this, avndVar);
        avnn avnnVar = atqp.p;
        return avpxVar;
    }

    public final avlb j(avnd avndVar) {
        avni avniVar = avoi.d;
        return I(avniVar, avniVar, avndVar, avoi.c);
    }

    public final avlb k(avni avniVar) {
        avni avniVar2 = avoi.d;
        avnd avndVar = avoi.c;
        return I(avniVar2, avniVar, avndVar, avndVar);
    }

    @Override // defpackage.avle
    public final void kp(avlc avlcVar) {
        avlcVar.getClass();
        try {
            avnf avnfVar = atqp.v;
            H(avlcVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            avkz.a(th);
            atqp.n(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final avlb l(avni avniVar) {
        avni avniVar2 = avoi.d;
        avnd avndVar = avoi.c;
        return I(avniVar, avniVar2, avndVar, avndVar);
    }

    public final avlb p() {
        avqg avqgVar = new avqg(this);
        avnn avnnVar = atqp.p;
        return avqgVar;
    }

    public final avlb q(avle avleVar) {
        avql avqlVar = new avql(new avle[]{this, avleVar});
        avnn avnnVar = atqp.p;
        return avqlVar;
    }

    public final avlb r(avmb avmbVar) {
        avmbVar.getClass();
        avqn avqnVar = new avqn(this, avmbVar);
        avnn avnnVar = atqp.p;
        return avqnVar;
    }

    public final avlb s() {
        return t(avoi.f);
    }

    public final avlb t(avno avnoVar) {
        avqo avqoVar = new avqo(this, avnoVar);
        avnn avnnVar = atqp.p;
        return avqoVar;
    }

    public final avlb u(avnn avnnVar) {
        avqs avqsVar = new avqs(this, avnnVar);
        avnn avnnVar2 = atqp.p;
        return avqsVar;
    }

    public final avlb v(avmb avmbVar) {
        avmbVar.getClass();
        avqu avquVar = new avqu(this, avmbVar);
        avnn avnnVar = atqp.p;
        return avquVar;
    }

    public final avlb w(long j, TimeUnit timeUnit, avmb avmbVar, avle avleVar) {
        timeUnit.getClass();
        avmbVar.getClass();
        avqx avqxVar = new avqx(this, j, timeUnit, avmbVar, avleVar);
        avnn avnnVar = atqp.p;
        return avqxVar;
    }

    public final avlm y(avlp avlpVar) {
        avyg avygVar = new avyg(avlpVar, this);
        avnn avnnVar = atqp.n;
        return avygVar;
    }

    public final avlr z(avlu avluVar) {
        awah awahVar = new awah(this, avluVar);
        avnn avnnVar = atqp.l;
        return awahVar;
    }
}
