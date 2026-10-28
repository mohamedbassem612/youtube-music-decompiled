package defpackage;

import android.net.Uri;
import android.os.Handler;
import androidx.car.app.model.Alert;
import androidx.media3.exoplayer.ExoPlayer;
import com.google.research.aimatter.drishti.DrishtiCache;
import j$.lang.Iterable$EL;
import j$.time.Duration;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qyh implements AutoCloseable, btf, rin, cdz {
    private static final qyi m = new qyd();
    private static final rbm y = new rbm("qyh");
    public final qxy a;
    public final ExoPlayer b;
    public final Handler c;
    public final qua d;
    public final rip e;
    public qvq f;
    public final qxu g;
    public final qxx h;
    public qyg j;
    public qxn l;
    private final DrishtiCache n;
    private final qzf o;
    private final rjb p;
    private qyi q;
    private final bup s;
    private qxt t;
    private final clu u;
    private final cli v;
    private final AtomicBoolean w;
    private final Runnable x;
    public int k = 1;
    private boolean r = false;
    public agke i = agpi.a;

    public qyh(qye qyeVar) {
        this.q = m;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.w = atomicBoolean;
        this.f = qyeVar.b;
        qxy qxyVar = new qxy();
        this.a = qxyVar;
        this.g = new qxu();
        this.h = new qxx();
        bup bupVar = new bup();
        this.s = bupVar;
        bupVar.k(qyeVar.d.b);
        this.n = qyeVar.f;
        this.o = qyeVar.g;
        qua quaVar = qyeVar.h;
        this.d = quaVar;
        this.p = qyeVar.k;
        Runnable runnable = qyeVar.o;
        this.x = runnable;
        cve cveVar = new cve();
        cveVar.f();
        cmy cmyVar = new cmy(qyeVar.j, cveVar);
        cmyVar.e(quaVar.U);
        this.q = qyeVar.l;
        clu cluVar = qyeVar.m;
        this.u = cluVar;
        cli cliVar = qyeVar.n;
        this.v = cliVar;
        cbt cbtVar = new cbt(qyeVar.a);
        cbtVar.h(new qyf(this, qyeVar.a, qxyVar, cluVar, cliVar, new qcb(this, null), runnable, atomicBoolean));
        cbtVar.c(new cbd());
        cbtVar.f(qyeVar.e);
        cbtVar.e(cmyVar);
        cbtVar.g(2000L);
        cbtVar.i(Alert.DURATION_SHOW_INDEFINITELY);
        cbtVar.j(Alert.DURATION_SHOW_INDEFINITELY);
        ExoPlayer exoPlayerA = cbtVar.a();
        this.b = exoPlayerA;
        this.c = new Handler(exoPlayerA.c());
        aL(qyeVar.p, qyeVar.c);
        final qyi qyiVar = this.q;
        qyiVar.getClass();
        rip ripVar = new rip(exoPlayerA, this, new qug() { // from class: qyc
            @Override // defpackage.qug
            public final void a(quk qukVar) {
                qyiVar.h(qukVar);
            }
        }, rim.b);
        this.e = ripVar;
        exoPlayerA.e(aK(this.f));
        exoPlayerA.y(ripVar);
        exoPlayerA.y(this);
        exoPlayerA.i(this);
        if (this.f.e) {
            exoPlayerA.C(2);
        }
    }

    public static final bss aK(qvq qvqVar) {
        Duration durationOfMillis = Duration.ofMillis((long) (qvqVar.q.toMillis() * qvqVar.f));
        bsi bsiVar = new bsi();
        String string = qvqVar.b.a().toString();
        bsiVar.b = string == null ? null : Uri.parse(string);
        qwo qwoVar = qvqVar.b;
        Optional optionalEmpty = Optional.empty();
        optionalEmpty.isPresent();
        bsiVar.c = (String) optionalEmpty.orElse(null);
        bsj bsjVar = new bsj();
        bsjVar.d(qvqVar.c.toMillis());
        bsjVar.c(qvqVar.c.plus(durationOfMillis).toMillis());
        bsjVar.c = true;
        bsiVar.b(new bsk(bsjVar));
        return bsiVar.a();
    }

    private static long aM(qxj qxjVar) {
        if (qxjVar == null) {
            return 20000L;
        }
        Duration durationDividedBy = qxjVar.c;
        qvu qvuVar = qxjVar.e;
        qvu qvuVar2 = qxjVar.f;
        if (qvuVar != null && qvuVar2 != null) {
            durationDividedBy = durationDividedBy.plus(qvuVar.p.plus(qvuVar.iu()).minus(qvuVar2.p)).dividedBy(2L);
        }
        return Math.max(ahbt.a(durationDividedBy), 20000L);
    }

    private final void aN() {
        if (this.r) {
            this.r = false;
            this.q.i();
        }
    }

    @Override // defpackage.rin
    public final UUID aD() {
        return this.f.m;
    }

    public final void aE() {
        ((brs) this.b).A(false);
        this.c.post(new qca(this.a, 20));
    }

    @Override // defpackage.rin
    public final void aF() {
        if (this.l != null) {
            aJ(Duration.ZERO, this.l);
        }
    }

    @Override // defpackage.rin
    public final void aH() {
        this.c.post(new qca(this, 17));
    }

    @Override // defpackage.rin
    public final boolean aI() {
        qyg qygVar = this.j;
        return (qygVar == null || qygVar.I.get()) ? false : true;
    }

    public final void aJ(Duration duration, qxn qxnVar) {
        Duration durationOfNanos;
        this.r = true;
        qvq qvqVar = this.f;
        Duration durationMinus = duration.minus(qvqVar.p);
        if (qvqVar.e && this.d.h) {
            qwo qwoVar = qvqVar.b;
            qwoVar.d();
            qwn qwnVar = (qwn) qwoVar.f;
            qwnVar.getClass();
            durationOfNanos = Duration.ofNanos((long) (qwnVar.b.toNanos() / qvqVar.f));
        } else {
            durationOfNanos = Duration.ofNanos(Long.MAX_VALUE);
        }
        if (durationOfNanos.equals(Duration.ZERO)) {
            rbc rbcVar = new rbc(y, rbd.d);
            rbcVar.c();
            rbcVar.a("Looped segment duration is zero, falling back to original seek position.", new Object[0]);
            durationOfNanos = Duration.ofNanos(Long.MAX_VALUE);
        }
        Duration duration2 = durationOfNanos;
        this.c.post(new mrh(this, qxnVar, qvqVar, duration2.multipliedBy(durationMinus.toNanos() / duration2.toNanos()), 5));
        long millis = Duration.ofNanos(durationMinus.toNanos() % duration2.toNanos()).toMillis();
        bth bthVar = this.b;
        brs brsVar = (brs) bthVar;
        brsVar.as((long) (millis * qvqVar.f));
        bthVar.z();
        brsVar.A(true);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0128  */
    /* JADX WARN: Type inference failed for: r5v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    public final boolean aL(sry sryVar, agkz agkzVar) {
        long jAM;
        long jAM2;
        boolean z;
        qxt qxtVar;
        agjz agjzVar = new agjz(4);
        if (sryVar == null) {
            jAM2 = 20000;
            jAM = 20000;
        } else {
            jAM = aM((qxj) sryVar.a);
            jAM2 = aM((qxj) sryVar.b);
        }
        qxu qxuVar = this.g;
        acac acacVar = qxuVar.f;
        boolean z2 = false;
        if ((acacVar != null ? acacVar.a : 0L) != jAM) {
            ahno.P(((jAM > 0L ? 1 : (jAM == 0L ? 0 : -1)) ^ (-1)) >>> 31, "Fade in duration is negative.");
            qxuVar.f = new acac(0L, jAM, null);
            z = true;
        } else {
            z = false;
        }
        long jA = ahbt.a(this.f.q);
        ahno.P(((jAM2 > 0L ? 1 : (jAM2 == 0L ? 0 : -1)) ^ (-1)) >>> 31, "Fade out duration is negative.");
        qxuVar.g = new acac(jA - jAM2, jA, null);
        acac acacVar2 = qxuVar.g;
        boolean z3 = (!((acacVar2 != null ? acacVar2.a : 0L) == jAM2)) | z;
        qxx qxxVar = this.h;
        qvq qvqVar = this.f;
        boolean z4 = !Objects.equals(null, null);
        qxxVar.e = qvqVar;
        if (!agkzVar.isEmpty() && this.t == null) {
            this.t = new qxt(this.n, this.o, this.d.a, this.p);
        }
        boolean z5 = z3 | z4;
        qxt qxtVar2 = this.t;
        if (qxtVar2 != null) {
            agke agkeVarG = agkzVar.g();
            int iOrdinal = nqy.j(qxtVar2.f, agke.n(agkeVarG)).ordinal();
            if (iOrdinal == 0) {
                qxtVar2.c.clear();
            } else if (iOrdinal == 1) {
                agkj agkjVarA = qxtVar2.b.a(agkeVarG);
                if (!qxtVar2.e.isDone()) {
                    qxtVar2.e.cancel(false);
                }
                qxtVar2.e = ahno.au(agkjVarA.values()).k(new jkb(qxtVar2, agkjVarA, 14), qxtVar2.d.h());
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                }
                z5 |= z2;
                bup bupVar = new bup();
                bupVar.k(48000);
                agjzVar.h(bupVar);
                qxtVar = this.t;
                if (qxtVar != null) {
                    agjzVar.h(qxtVar);
                }
            } else {
                nqy.i(new agyt(agyz.e(agkeVarG), Function$CC.identity(), new iuk(qxtVar2, 15)));
            }
            qxtVar2.f = agke.n(agkeVarG);
            z2 = true;
            z5 |= z2;
            bup bupVar2 = new bup();
            bupVar2.k(48000);
            agjzVar.h(bupVar2);
            qxtVar = this.t;
            if (qxtVar != null) {
                agjzVar.h(qxtVar);
            }
        }
        bup bupVar3 = this.s;
        bupVar3.l(this.f.f);
        agjzVar.h(bupVar3);
        agjzVar.h(qxuVar);
        agjzVar.h(qxxVar);
        this.i = agjzVar.g();
        return z5;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.r = false;
        this.e.B();
        ExoPlayer exoPlayer = this.b;
        exoPlayer.F();
        exoPlayer.L();
        Iterable$EL.forEach(this.i, new hgi(9));
        this.k = 1;
    }

    @Override // defpackage.btf
    public final void gl(int i) {
        if (i == 4) {
            aN();
            this.q.g();
        } else if (i == 3) {
            aN();
        }
    }

    @Override // defpackage.btf
    public final void s(btu btuVar) {
        boolean z;
        agke agkeVar = btuVar.b;
        int size = agkeVar.size();
        int i = 0;
        while (true) {
            int i2 = 1;
            if (i >= size) {
                this.k = 2;
                this.c.post(new rcu(this, i2));
                return;
            }
            btt bttVar = (btt) agkeVar.get(i);
            int iA = bttVar.a();
            boolean zC = bttVar.c();
            int i3 = 0;
            while (true) {
                int[] iArr = bttVar.c;
                if (i3 >= iArr.length) {
                    z = false;
                    break;
                } else {
                    if (iArr[i3] == 4) {
                        z = true;
                        break;
                    }
                    i3++;
                }
            }
            if (iA == 1 && z && zC) {
                this.k = 3;
                return;
            }
            i++;
        }
    }

    @Override // defpackage.btf
    public final /* synthetic */ void A() {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void o() {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void w() {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void x() {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void y() {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void J(cdy cdyVar) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void K(cdy cdyVar) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void N(cdy cdyVar) {
    }

    @Override // defpackage.rin
    public final void aG(int i) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void af(cdy cdyVar) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void at(cdy cdyVar) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void au(cdy cdyVar) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void ax(cdy cdyVar) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void b(int i) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void gg(boolean z) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void gh(boolean z) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void gi(bsx bsxVar) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void gk(btb btbVar) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void iE(brq brqVar) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void j(int i) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void k(bta btaVar) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void l(bta btaVar) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void p(int i) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void q(boolean z) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void t(btz btzVar) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void u(float f) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void v(int i) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void z(int i) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void B(cdy cdyVar, brq brqVar) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void D(cdy cdyVar, String str) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void E(cdy cdyVar, long j) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void F(cdy cdyVar, int i) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void G(cdy cdyVar, Exception exc) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void I(cdy cdyVar, cni cniVar) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void L(cdy cdyVar, int i) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void M(cdy cdyVar, Exception exc) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void O(cdy cdyVar, int i) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void Q(cdy cdyVar, boolean z) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void R(cdy cdyVar, boolean z) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void T(cdy cdyVar, boolean z) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void U(cdy cdyVar, bsx bsxVar) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void W(cdy cdyVar, btb btbVar) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void X(cdy cdyVar, int i) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void Y(cdy cdyVar, int i) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void Z(cdy cdyVar, bta btaVar) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void aA(cdy cdyVar, cri criVar) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void aB(cdy cdyVar, cri criVar) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void aC(bth bthVar, boy boyVar) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void ae(cdy cdyVar, int i) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void ag(cdy cdyVar, boolean z) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void ai(cdy cdyVar, int i) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void aj(cdy cdyVar, btu btuVar) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void ak(cdy cdyVar, cni cniVar) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void al(cdy cdyVar, Exception exc) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void an(cdy cdyVar, String str) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void ao(cdy cdyVar, cay cayVar) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void ap(cdy cdyVar, cay cayVar) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void ar(cdy cdyVar, btz btzVar) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void as(cdy cdyVar, float f) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void av(cdy cdyVar, bse bseVar) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void ay(cdy cdyVar, int i) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void gf(bth bthVar, bte bteVar) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void gj(boolean z, int i) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void m(boolean z, int i) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void r(int i, int i2) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void P(cdy cdyVar, int i, long j) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void V(cdy cdyVar, boolean z, int i) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void aa(cdy cdyVar, boolean z, int i) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void ac(cdy cdyVar, Object obj, long j) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void ah(cdy cdyVar, int i, int i2) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void aq(cdy cdyVar, bse bseVar, caz cazVar) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void aw(cdy cdyVar, int i, long j) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void n(btg btgVar, btg btgVar2, int i) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void C(cdy cdyVar, String str, long j, long j2) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void H(cdy cdyVar, int i, long j, long j2) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void ab(cdy cdyVar, btg btgVar, btg btgVar2, int i) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void ad(cdy cdyVar, int i, int i2, boolean z) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void am(cdy cdyVar, String str, long j, long j2) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void az(cdy cdyVar, int i, int i2, float f) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void S(cdy cdyVar, cnd cndVar, cni cniVar, IOException iOException, boolean z) {
    }
}
