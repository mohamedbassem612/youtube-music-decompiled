package defpackage;

import app.rive.semantics.SemanticState;
import internal.org.jni_zero.JniZero;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class avlh implements axso {
    public static final int a = Math.max(1, Integer.getInteger("rx2.buffer-size", SemanticState.Focused).intValue());

    public static avlh A(Object... objArr) {
        avty avtyVar = new avty(objArr);
        avnn avnnVar = atqp.j;
        return avtyVar;
    }

    public static avlh B(Iterable iterable) {
        iterable.getClass();
        avue avueVar = new avue(iterable);
        avnn avnnVar = atqp.j;
        return avueVar;
    }

    public static avlh C(axso axsoVar) {
        if (axsoVar instanceof avlh) {
            avlh avlhVar = (avlh) axsoVar;
            avnn avnnVar = atqp.j;
            return avlhVar;
        }
        axsoVar.getClass();
        avuh avuhVar = new avuh(axsoVar);
        avnn avnnVar2 = atqp.j;
        return avuhVar;
    }

    public static avlh F(long j, long j2, TimeUnit timeUnit, avmb avmbVar) {
        timeUnit.getClass();
        avmbVar.getClass();
        avut avutVar = new avut(Math.max(0L, j), Math.max(0L, j2), timeUnit, avmbVar);
        avnn avnnVar = atqp.j;
        return avutVar;
    }

    public static avlh G(Object obj) {
        obj.getClass();
        avuu avuuVar = new avuu(obj);
        avnn avnnVar = atqp.j;
        return avuuVar;
    }

    public static avlh I(axso axsoVar, axso axsoVar2) {
        axsoVar.getClass();
        axsoVar2.getClass();
        avty avtyVar = new avty(new axso[]{axsoVar, axsoVar2});
        avnn avnnVar = atqp.j;
        return avtyVar.av(avoi.a, 2);
    }

    public static avlh J(axso axsoVar, axso axsoVar2, axso axsoVar3) {
        axsoVar3.getClass();
        avty avtyVar = new avty(new axso[]{axsoVar, axsoVar2, axsoVar3});
        avnn avnnVar = atqp.j;
        return avtyVar.av(avoi.a, 3);
    }

    public static avlh K() {
        avlh avlhVar = avva.b;
        avnn avnnVar = atqp.j;
        return avlhVar;
    }

    public static avlh ab(long j, TimeUnit timeUnit, avmb avmbVar) {
        timeUnit.getClass();
        avmbVar.getClass();
        avxo avxoVar = new avxo(Math.max(0L, j), timeUnit, avmbVar);
        avnn avnnVar = atqp.j;
        return avxoVar;
    }

    public static avlh f(axso axsoVar, axso axsoVar2, avnf avnfVar) {
        axsoVar.getClass();
        axsoVar2.getClass();
        avnx avnxVar = new avnx(avnfVar, 1);
        axso[] axsoVarArr = {axsoVar, axsoVar2};
        int i = a;
        avoj.a(i, "bufferSize");
        avrz avrzVar = new avrz(axsoVarArr, avnxVar, i);
        avnn avnnVar = atqp.j;
        return avrzVar;
    }

    public static avlh g(axso axsoVar, axso axsoVar2, axso axsoVar3, avnj avnjVar) {
        axsoVar.getClass();
        axsoVar2.getClass();
        axsoVar3.getClass();
        avnx avnxVar = new avnx(avnjVar, 0);
        axso[] axsoVarArr = {axsoVar, axsoVar2, axsoVar3};
        int i = a;
        avoj.a(i, "bufferSize");
        avrz avrzVar = new avrz(axsoVarArr, avnxVar, i);
        avnn avnnVar = atqp.j;
        return avrzVar;
    }

    public static avlh h(axso axsoVar, axso axsoVar2, axso axsoVar3, axso axsoVar4, avnk avnkVar) {
        axsoVar.getClass();
        axsoVar2.getClass();
        axsoVar3.getClass();
        axsoVar4.getClass();
        avnx avnxVar = new avnx(avnkVar, 2);
        axso[] axsoVarArr = {axsoVar, axsoVar2, axsoVar3, axsoVar4};
        int i = a;
        avoj.a(i, "bufferSize");
        avrz avrzVar = new avrz(axsoVarArr, avnxVar, i);
        avnn avnnVar = atqp.j;
        return avrzVar;
    }

    public static avlh n(Callable callable) {
        avss avssVar = new avss(callable);
        avnn avnnVar = atqp.j;
        return avssVar;
    }

    public static avlh w() {
        avlh avlhVar = avtj.b;
        avnn avnnVar = atqp.j;
        return avlhVar;
    }

    public final avlh D(avnn avnnVar) {
        int i = a;
        avoj.a(i, "bufferSize");
        avuk avukVar = new avuk(this, avnnVar, i);
        avnn avnnVar2 = atqp.j;
        return avukVar;
    }

    public final avlh E() {
        avum avumVar = new avum(this);
        avnn avnnVar = atqp.j;
        return avumVar;
    }

    public final avlh H(avnn avnnVar) {
        avux avuxVar = new avux(this, avnnVar);
        avnn avnnVar2 = atqp.j;
        return avuxVar;
    }

    public final avlh L(avmb avmbVar) {
        int i = a;
        avmbVar.getClass();
        avoj.a(i, "bufferSize");
        avve avveVar = new avve(this, avmbVar, i);
        avnn avnnVar = atqp.j;
        return avveVar;
    }

    public final avlh M(Class cls) {
        return x(new avob(cls)).H(new avoa(cls));
    }

    public final avlh N() {
        int i = a;
        avoj.a(i, "capacity");
        avvg avvgVar = new avvg(this, i);
        avnn avnnVar = atqp.j;
        return avvgVar;
    }

    public final avlh O() {
        avvk avvkVar = new avvk(this);
        avnn avnnVar = atqp.j;
        return avvkVar;
    }

    public final avlh P() {
        avvo avvoVar = new avvo(this);
        avnn avnnVar = atqp.j;
        return avvoVar;
    }

    public final avlh Q(Object obj) {
        obj.getClass();
        avvs avvsVar = new avvs(this, new avog(obj));
        avnn avnnVar = atqp.j;
        return avvsVar;
    }

    public final avlh R(Object obj, avnf avnfVar) {
        obj.getClass();
        avwn avwnVar = new avwn(this, new avog(obj), avnfVar);
        avnn avnnVar = atqp.j;
        return avwnVar;
    }

    public final avlh S() {
        int i = a;
        avoj.a(i, "bufferSize");
        int i2 = avvw.f;
        AtomicReference atomicReference = new AtomicReference();
        avvw avvwVar = new avvw(new avvt(atomicReference, i), this, atomicReference, i);
        avnn avnnVar = atqp.k;
        return avvwVar.c();
    }

    public final avlh T(avno avnoVar) {
        avwt avwtVar = new avwt(this, avnoVar);
        avnn avnnVar = atqp.j;
        return avwtVar;
    }

    public final avlh U(Object obj) {
        obj.getClass();
        avuu avuuVar = new avuu(obj);
        avnn avnnVar = atqp.j;
        avsb avsbVar = new avsb(new axso[]{avuuVar, this});
        avnn avnnVar2 = atqp.j;
        return avsbVar;
    }

    public final avlh V(avmb avmbVar) {
        avmbVar.getClass();
        avwv avwvVar = new avwv(this, avmbVar, !(this instanceof avsl));
        avnn avnnVar = atqp.j;
        return avwvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final avlh W(avnn avnnVar) {
        int i = a;
        avoj.a(i, "bufferSize");
        if (!(this instanceof avor)) {
            avxa avxaVar = new avxa(this, avnnVar, i);
            avnn avnnVar2 = atqp.j;
            return avxaVar;
        }
        Object objCall = ((avor) this).call();
        if (objCall != null) {
            return JniZero.d(objCall, avnnVar);
        }
        avlh avlhVar = avtj.b;
        avnn avnnVar3 = atqp.j;
        return avlhVar;
    }

    public final avlh X(avnn avnnVar) {
        awan awanVar = new awan(this, avnnVar);
        avnn avnnVar2 = atqp.j;
        return awanVar;
    }

    public final avlh Y(avno avnoVar) {
        avxh avxhVar = new avxh(this, avnoVar);
        avnn avnnVar = atqp.j;
        return avxhVar;
    }

    public final avlh Z(axso axsoVar) {
        avxf avxfVar = new avxf(this, axsoVar);
        avnn avnnVar = atqp.j;
        return avxfVar;
    }

    public final avlh aA(long j, TimeUnit timeUnit) {
        return aa(j, timeUnit, awlg.a(), true);
    }

    public final avlh aB(avnn avnnVar) {
        avsu avsuVar = new avsu(this, avnnVar);
        avnn avnnVar2 = atqp.j;
        return avsuVar;
    }

    public final avlh aa(long j, TimeUnit timeUnit, avmb avmbVar, boolean z) {
        timeUnit.getClass();
        avmbVar.getClass();
        avxj avxjVar = new avxj(this, j, timeUnit, avmbVar, z);
        avnn avnnVar = atqp.j;
        return avxjVar;
    }

    public final avlh ac(axso axsoVar, avnf avnfVar) {
        axsoVar.getClass();
        avxv avxvVar = new avxv(this, avnfVar, axsoVar);
        avnn avnnVar = atqp.j;
        return avxvVar;
    }

    public final avlh ad(axso[] axsoVarArr, avnn avnnVar) {
        avxy avxyVar = new avxy(this, axsoVarArr, avnnVar);
        avnn avnnVar2 = atqp.j;
        return avxyVar;
    }

    public final avlh ae(axso axsoVar, axso axsoVar2, avnj avnjVar) {
        axsoVar2.getClass();
        return ad(new axso[]{axsoVar, axsoVar2}, new avnx(avnjVar, 0));
    }

    public final avlh af(axso axsoVar, axso axsoVar2, axso axsoVar3, axso axsoVar4, avnl avnlVar) {
        axsoVar.getClass();
        axsoVar3.getClass();
        return ad(new axso[]{axsoVar, axsoVar2, axsoVar3, axsoVar4}, new avnx(avnlVar, 3));
    }

    public final avlr ag() {
        awda awdaVar = new awda(this);
        avnn avnnVar = atqp.l;
        return awdaVar;
    }

    public final avmc ah(avno avnoVar) {
        avti avtiVar = new avti(this, avnoVar, 1);
        avnn avnnVar = atqp.o;
        return avtiVar;
    }

    public final avmc ai() {
        avxs avxsVar = new avxs(this, 0);
        avnn avnnVar = atqp.o;
        return avxsVar;
    }

    public final avmn aj() {
        return an(avoi.d, avoi.e, avoi.c, avur.INSTANCE);
    }

    public final avmn ak(avni avniVar) {
        return an(avniVar, avoi.e, avoi.c, avur.INSTANCE);
    }

    public final avmn al(avni avniVar, avni avniVar2) {
        return an(avniVar, avniVar2, avoi.c, avur.INSTANCE);
    }

    public final avmn am(avni avniVar, avni avniVar2, avnd avndVar) {
        return an(avniVar, avniVar2, avndVar, avur.INSTANCE);
    }

    public final avmn an(avni avniVar, avni avniVar2, avnd avndVar, avni avniVar3) {
        awjp awjpVar = new awjp(avniVar, avniVar2, avndVar, avniVar3);
        ap(awjpVar);
        return awjpVar;
    }

    public final Object ao(Object obj) {
        awjn awjnVar = new awjn();
        ap(awjnVar);
        Object objD = awjnVar.d();
        return objD != null ? objD : obj;
    }

    public final void ap(avlk avlkVar) {
        avlkVar.getClass();
        try {
            avnf avnfVar = atqp.r;
            ar(avlkVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            avkz.a(th);
            atqp.n(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    @Override // defpackage.axso
    public final void aq(axsp axspVar) {
        if (axspVar instanceof avlk) {
            ap((avlk) axspVar);
        } else {
            axspVar.getClass();
            ap(new awjt(axspVar));
        }
    }

    protected abstract void ar(axsp axspVar);

    public final avlh as() {
        avrw avrwVar = new avrw(this);
        avnn avnnVar = atqp.j;
        return avrwVar;
    }

    public final avlm at() {
        avtg avtgVar = new avtg(this);
        avnn avnnVar = atqp.n;
        return avtgVar;
    }

    public final avmc au() {
        avti avtiVar = new avti(this, null, 0);
        avnn avnnVar = atqp.o;
        return avtiVar;
    }

    public final avlh av(avnn avnnVar, int i) {
        return aw(avnnVar, i, a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final avlh aw(avnn avnnVar, int i, int i2) {
        avoj.a(i, "maxConcurrency");
        avoj.a(i2, "bufferSize");
        if (!(this instanceof avor)) {
            avtq avtqVar = new avtq(this, avnnVar, i, i2);
            avnn avnnVar2 = atqp.j;
            return avtqVar;
        }
        Object objCall = ((avor) this).call();
        if (objCall != null) {
            return JniZero.d(objCall, avnnVar);
        }
        avlh avlhVar = avtj.b;
        avnn avnnVar3 = atqp.j;
        return avlhVar;
    }

    public final avnb ax() {
        int i = avwk.e;
        AtomicReference atomicReference = new AtomicReference();
        avwk avwkVar = new avwk(new avwh(atomicReference), this, atomicReference);
        avnn avnnVar = atqp.k;
        return avwkVar;
    }

    public final avlh ay() {
        avws avwsVar = new avws(this);
        avnn avnnVar = atqp.j;
        return avwsVar;
    }

    public final avlh az() {
        avxc avxcVar = new avxc(this);
        avnn avnnVar = atqp.j;
        return avxcVar;
    }

    public final avlh d(long j, TimeUnit timeUnit, avmb avmbVar) {
        timeUnit.getClass();
        avmbVar.getClass();
        avru avruVar = new avru(this, j, j, timeUnit, avmbVar);
        avnn avnnVar = atqp.j;
        return avruVar;
    }

    public final avlh i(avll avllVar) {
        return C(avllVar.a(this));
    }

    public final avlh j(avnn avnnVar) {
        int i = a;
        avoj.a(i, "maxConcurrency");
        avoj.a(i, "prefetch");
        avsd avsdVar = new avsd(this, avnnVar, i, i);
        avnn avnnVar2 = atqp.j;
        return avsdVar;
    }

    public final avlh k(axso axsoVar) {
        avsb avsbVar = new avsb(new axso[]{this, axsoVar});
        avnn avnnVar = atqp.j;
        return avsbVar;
    }

    public final avlh l(long j, TimeUnit timeUnit) {
        avmb avmbVar = awlg.b;
        avnn avnnVar = atqp.g;
        return m(j, timeUnit, avmbVar);
    }

    public final avlh m(long j, TimeUnit timeUnit, avmb avmbVar) {
        timeUnit.getClass();
        avmbVar.getClass();
        avsr avsrVar = new avsr(this, j, timeUnit, avmbVar);
        avnn avnnVar = atqp.j;
        return avsrVar;
    }

    public final avlh o(avnn avnnVar) {
        return aB(avnnVar);
    }

    public final avlh p() {
        return r(avoi.a);
    }

    public final avlh q(avng avngVar) {
        avsx avsxVar = new avsx(this, avoi.a, avngVar);
        avnn avnnVar = atqp.j;
        return avsxVar;
    }

    public final avlh r(avnn avnnVar) {
        avsx avsxVar = new avsx(this, avnnVar, avoj.a);
        avnn avnnVar2 = atqp.j;
        return avsxVar;
    }

    public final avlh s(avnd avndVar) {
        avni avniVar = avoi.d;
        return t(avniVar, avniVar, avoi.c, avndVar);
    }

    public final avlh t(avni avniVar, avni avniVar2, avnd avndVar, avnd avndVar2) {
        avta avtaVar = new avta(this, avniVar, avniVar2, avndVar, avndVar2);
        avnn avnnVar = atqp.j;
        return avtaVar;
    }

    public final avlh u(avni avniVar) {
        avni avniVar2 = avoi.d;
        avnd avndVar = avoi.c;
        return t(avniVar, avniVar2, avndVar, avndVar);
    }

    public final avlh v(avni avniVar) {
        avtc avtcVar = new avtc(this, avniVar);
        avnn avnnVar = atqp.j;
        return avtcVar;
    }

    public final avlh x(avno avnoVar) {
        avtn avtnVar = new avtn(this, avnoVar);
        avnn avnnVar = atqp.j;
        return avtnVar;
    }

    public final avlh y(avnn avnnVar) {
        int i = a;
        return aw(avnnVar, i, i);
    }

    public final avlh z(avnn avnnVar, int i) {
        return aw(avnnVar, i, a);
    }
}
