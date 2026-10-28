package defpackage;

import androidx.car.app.model.Alert;
import internal.org.jni_zero.JniZero;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class avlr implements avlu {
    public static avlr A(Throwable th) {
        th.getClass();
        awce awceVar = new awce(new avog(th));
        avnn avnnVar = atqp.l;
        return awceVar;
    }

    public static avlr F(Callable callable) {
        awcv awcvVar = new awcv(callable);
        avnn avnnVar = atqp.l;
        return awcvVar;
    }

    public static avlr G(Iterable iterable) {
        iterable.getClass();
        awcy awcyVar = new awcy(iterable);
        avnn avnnVar = atqp.l;
        return awcyVar;
    }

    public static avlr I(long j, long j2, TimeUnit timeUnit, avmb avmbVar) {
        timeUnit.getClass();
        avmbVar.getClass();
        awdg awdgVar = new awdg(Math.max(0L, j), Math.max(0L, j2), timeUnit, avmbVar);
        avnn avnnVar = atqp.l;
        return awdgVar;
    }

    public static avlr J(Object obj) {
        obj.getClass();
        awdh awdhVar = new awdh(obj);
        avnn avnnVar = atqp.l;
        return awdhVar;
    }

    public static avlr L(Iterable iterable) {
        return G(iterable).D(avoi.a, false, Alert.DURATION_SHOW_INDEFINITELY);
    }

    public static avlr M(avlu avluVar, avlu avluVar2) {
        awcu awcuVar = new awcu(new avlu[]{avluVar, avluVar2});
        avnn avnnVar = atqp.l;
        return awcuVar.D(avoi.a, false, 2);
    }

    public static avlr N(avlu avluVar, avlu avluVar2, avlu avluVar3) {
        awcu awcuVar = new awcu(new avlu[]{avluVar, avluVar2, avluVar3});
        avnn avnnVar = atqp.l;
        return awcuVar.D(avoi.a, false, 3);
    }

    public static avlr Y(avlu avluVar) {
        int i = avlh.a;
        avoj.a(i, "bufferSize");
        awfb awfbVar = new awfb(avluVar, avoi.a, i);
        avnn avnnVar = atqp.l;
        return awfbVar;
    }

    public static avlr ab(long j, TimeUnit timeUnit) {
        return ac(j, timeUnit, awlg.a());
    }

    public static avlr ac(long j, TimeUnit timeUnit, avmb avmbVar) {
        timeUnit.getClass();
        avmbVar.getClass();
        awfp awfpVar = new awfp(Math.max(j, 0L), timeUnit, avmbVar);
        avnn avnnVar = atqp.l;
        return awfpVar;
    }

    public static avlr i(Iterable iterable, avnn avnnVar) {
        int i = avlh.a;
        iterable.getClass();
        avoj.a(i, "bufferSize");
        awbb awbbVar = new awbb(null, iterable, avnnVar, i << 1);
        avnn avnnVar2 = atqp.l;
        return awbbVar;
    }

    public static avlr j(avlu avluVar, avlu avluVar2, avnf avnfVar) {
        avluVar.getClass();
        return k(new avlu[]{avluVar, avluVar2}, new avnx(avnfVar, 1), avlh.a);
    }

    public static avlr k(avlu[] avluVarArr, avnn avnnVar, int i) {
        avoj.a(i, "bufferSize");
        awbb awbbVar = new awbb(avluVarArr, null, avnnVar, i << 1);
        avnn avnnVar2 = atqp.l;
        return awbbVar;
    }

    public static avlr m(avlu... avluVarArr) {
        awcu awcuVar = new awcu(avluVarArr);
        avnn avnnVar = atqp.l;
        awbg awbgVar = new awbg(awcuVar, avoi.a, avlh.a, 2);
        avnn avnnVar2 = atqp.l;
        return awbgVar;
    }

    public static avlr o(avlt avltVar) {
        avltVar.getClass();
        awbl awblVar = new awbl(avltVar);
        avnn avnnVar = atqp.l;
        return awblVar;
    }

    public static avlr q(Callable callable) {
        awbp awbpVar = new awbp(callable);
        avnn avnnVar = atqp.l;
        return awbpVar;
    }

    public static avlr z() {
        avlr avlrVar = awcd.a;
        avnn avnnVar = atqp.l;
        return avlrVar;
    }

    public final avlr B(avno avnoVar) {
        awcg awcgVar = new awcg(this, avnoVar);
        avnn avnnVar = atqp.l;
        return awcgVar;
    }

    public final avlr C(avnn avnnVar, int i) {
        return E(avnnVar, false, i, avlh.a);
    }

    public final avlr D(avnn avnnVar, boolean z, int i) {
        return E(avnnVar, z, i, avlh.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final avlr E(avnn avnnVar, boolean z, int i, int i2) {
        avoj.a(i2, "bufferSize");
        if (this instanceof avor) {
            Object objCall = ((avor) this).call();
            return objCall == null ? z() : JniZero.b(objCall, avnnVar);
        }
        awcj awcjVar = new awcj(this, avnnVar, z, i, i2);
        avnn avnnVar2 = atqp.l;
        return awcjVar;
    }

    public final avlr H() {
        awdb awdbVar = new awdb(this);
        avnn avnnVar = atqp.l;
        return awdbVar;
    }

    public final avlr K(avnn avnnVar) {
        awdk awdkVar = new awdk(this, avnnVar);
        avnn avnnVar2 = atqp.l;
        return awdkVar;
    }

    public final avlr O(avmb avmbVar) {
        int i = avlh.a;
        avmbVar.getClass();
        avoj.a(i, "bufferSize");
        awdo awdoVar = new awdo(this, avmbVar, i);
        avnn avnnVar = atqp.l;
        return awdoVar;
    }

    public final avlr P(avnn avnnVar) {
        avnnVar.getClass();
        awdq awdqVar = new awdq(this, avnnVar);
        avnn avnnVar2 = atqp.l;
        return awdqVar;
    }

    public final avlr Q(avnn avnnVar) {
        awds awdsVar = new awds(this, avnnVar);
        avnn avnnVar2 = atqp.l;
        return awdsVar;
    }

    public final avlr R() {
        awes awesVar = new awes(this);
        avnn avnnVar = atqp.l;
        return awesVar;
    }

    public final avlr S() {
        AtomicReference atomicReference = new AtomicReference();
        awdw awdwVar = new awdw(new awdv(atomicReference), this, atomicReference);
        avnn avnnVar = atqp.m;
        return awdwVar.d();
    }

    public final avlr T(avno avnoVar) {
        awev awevVar = new awev(this, avnoVar);
        avnn avnnVar = atqp.l;
        return awevVar;
    }

    public final avlr U(avlu avluVar) {
        return m(avluVar, this);
    }

    public final avlr V(Object obj) {
        awdh awdhVar = new awdh(obj);
        avnn avnnVar = atqp.l;
        return m(awdhVar, this);
    }

    public final avlr W(avmb avmbVar) {
        avmbVar.getClass();
        awey aweyVar = new awey(this, avmbVar);
        avnn avnnVar = atqp.l;
        return aweyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final avlr X(avnn avnnVar) {
        int i = avlh.a;
        avoj.a(i, "bufferSize");
        if (this instanceof avor) {
            Object objCall = ((avor) this).call();
            return objCall == null ? z() : JniZero.b(objCall, avnnVar);
        }
        awfb awfbVar = new awfb(this, avnnVar, i);
        avnn avnnVar2 = atqp.l;
        return awfbVar;
    }

    public final avlr Z(avlu avluVar) {
        awfg awfgVar = new awfg(this, avluVar);
        avnn avnnVar = atqp.l;
        return awfgVar;
    }

    public final avlr aa(avno avnoVar) {
        awfi awfiVar = new awfi(this, avnoVar);
        avnn avnnVar = atqp.l;
        return awfiVar;
    }

    public final avlr ad(avlu avluVar, avnf avnfVar) {
        awfw awfwVar = new awfw(this, avnfVar, avluVar);
        avnn avnnVar = atqp.l;
        return awfwVar;
    }

    public final avmn ae() {
        avni avniVar = avoi.d;
        return ai(avniVar, avoi.e, avoi.c, avniVar);
    }

    public final avmn af(avni avniVar) {
        return ai(avniVar, avoi.e, avoi.c, avoi.d);
    }

    public final avmn ag(avni avniVar, avni avniVar2) {
        return ai(avniVar, avniVar2, avoi.c, avoi.d);
    }

    public final avmn ah(avni avniVar, avni avniVar2, avnd avndVar) {
        return ai(avniVar, avniVar2, avndVar, avoi.d);
    }

    public final avmn ai(avni avniVar, avni avniVar2, avnd avndVar, avni avniVar3) {
        avpf avpfVar = new avpf(avniVar, avniVar2, avndVar, avniVar3);
        ak(avpfVar);
        return avpfVar;
    }

    public final Object aj() {
        avox avoxVar = new avox();
        ak(avoxVar);
        Object objE = avoxVar.e();
        if (objE != null) {
            return objE;
        }
        throw new NoSuchElementException();
    }

    @Override // defpackage.avlu
    public final void ak(avlw avlwVar) {
        avlwVar.getClass();
        try {
            avnf avnfVar = atqp.t;
            e(avlwVar);
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

    public final avlr al() {
        away awayVar = new away(this);
        avnn avnnVar = atqp.l;
        return awayVar;
    }

    public final avlm am() {
        awca awcaVar = new awca(this);
        avnn avnnVar = atqp.n;
        return awcaVar;
    }

    public final avmc an(Object obj) {
        obj.getClass();
        awcc awccVar = new awcc(this, obj);
        avnn avnnVar = atqp.o;
        return awccVar;
    }

    public final avmc ao() {
        awcc awccVar = new awcc(this, null);
        avnn avnnVar = atqp.o;
        return awccVar;
    }

    public final awko ap() {
        return awen.b(this, new awel(1));
    }

    public final avlr aq() {
        aweu aweuVar = new aweu(this);
        avnn avnnVar = atqp.l;
        return aweuVar;
    }

    public final avlr ar() {
        awfd awfdVar = new awfd(this);
        avnn avnnVar = atqp.l;
        return awfdVar;
    }

    public final avmc as() {
        awft awftVar = new awft(this);
        avnn avnnVar = atqp.o;
        return awftVar;
    }

    public final avlr at(avni avniVar, avni avniVar2, avnd avndVar) {
        awbv awbvVar = new awbv(this, avniVar, avniVar2, avndVar);
        avnn avnnVar = atqp.l;
        return awbvVar;
    }

    protected abstract void e(avlw avlwVar);

    public final avlh g(avla avlaVar) {
        avug avugVar = new avug(this);
        int iOrdinal = avlaVar.ordinal();
        if (iOrdinal == 0) {
            return avugVar;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 3) {
                return iOrdinal != 4 ? avugVar.N() : avugVar.P();
            }
            return avugVar.O();
        }
        avvm avvmVar = new avvm(avugVar);
        avnn avnnVar = atqp.j;
        return avvmVar;
    }

    public final avlr h(Class cls) {
        return K(new avoa(cls));
    }

    public final avlr l(avlv avlvVar) {
        avlu avluVarA = avlvVar.a(this);
        avnn avnnVar = atqp.l;
        return (avlr) avluVarA;
    }

    public final avlr n(avlu avluVar) {
        return m(this, avluVar);
    }

    public final avlr p(long j, TimeUnit timeUnit, avmb avmbVar) {
        timeUnit.getClass();
        avmbVar.getClass();
        awbo awboVar = new awbo(this, j, timeUnit, avmbVar);
        avnn avnnVar = atqp.l;
        return awboVar;
    }

    public final avlr r() {
        awbr awbrVar = new awbr(this, avoj.a);
        avnn avnnVar = atqp.l;
        return awbrVar;
    }

    public final avlr s(avng avngVar) {
        awbr awbrVar = new awbr(this, avngVar);
        avnn avnnVar = atqp.l;
        return awbrVar;
    }

    public final avlr t(avnd avndVar) {
        awbt awbtVar = new awbt(this, avndVar);
        avnn avnnVar = atqp.l;
        return awbtVar;
    }

    public final avlr u(avnd avndVar) {
        avni avniVar = avoi.d;
        return at(avniVar, avniVar, avndVar);
    }

    public final avlr v(avnd avndVar) {
        return w(avoi.d, avndVar);
    }

    public final avlr w(avni avniVar, avnd avndVar) {
        awbw awbwVar = new awbw(this, avniVar, avndVar);
        avnn avnnVar = atqp.l;
        return awbwVar;
    }

    public final avlr x(avni avniVar) {
        return at(avniVar, avoi.d, avoi.c);
    }

    public final avlr y(avni avniVar) {
        return w(avniVar, avoi.c);
    }
}
