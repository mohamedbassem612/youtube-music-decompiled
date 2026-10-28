package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import app.rive.semantics.SemanticState;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.cardboard.sdk.R;
import com.google.protos.youtube.api.innertube.MediaFetchColdConfigOuterClass$MediaFetchColdConfig;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hno {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;
    public final Object o;
    public final Object p;
    public final Object q;

    public hno(zxj zxjVar, zrx zrxVar, tfq tfqVar, twf twfVar, abuz abuzVar, zho zhoVar, ScheduledExecutorService scheduledExecutorService, Executor executor, zwb zwbVar, aunn aunnVar, aunn aunnVar2, aunn aunnVar3, Context context, zgf zgfVar, zjr zjrVar, awmd awmdVar, awmd awmdVar2) {
        tfqVar.getClass();
        this.p = tfqVar;
        twfVar.getClass();
        this.a = twfVar;
        this.g = new wjr(context);
        zhoVar.getClass();
        this.m = zhoVar;
        scheduledExecutorService.getClass();
        this.f = scheduledExecutorService;
        this.i = aunnVar;
        this.l = aunnVar2;
        abuzVar.getClass();
        this.q = abuzVar;
        executor.getClass();
        this.k = executor;
        this.c = zrxVar;
        zxjVar.getClass();
        this.o = zxjVar;
        zwbVar.getClass();
        this.n = zwbVar;
        aunnVar3.getClass();
        this.b = aunnVar3;
        zgfVar.getClass();
        this.e = zgfVar;
        this.j = zjrVar;
        this.d = awmdVar;
        this.h = awmdVar2;
    }

    public static final boolean bi(apfu apfuVar) {
        if (apfuVar == null || (apfuVar.b & SemanticState.Obscured) == 0) {
            return false;
        }
        ajuk ajukVar = apfuVar.k;
        if (ajukVar == null) {
            ajukVar = ajuk.a;
        }
        return ajukVar.b;
    }

    private final void bk() {
        ((hef) this.p).c(3);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v0, types: [aacm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.concurrent.Executor] */
    private final void bl() {
        Object obj = this.l;
        zwa zwaVarE = this.b.e();
        aaqn aaqnVarB = ((aanb) obj).b();
        vxz vxzVar = (vxz) this.o;
        vxz vxzVar2 = (vxz) this.n;
        syn synVar = (syn) this.q;
        aany aanyVar = (aany) this.k;
        huf hufVar = (huf) this.j;
        Object obj2 = this.c;
        ?? r11 = this.i;
        tbt tbtVar = (tbt) obj2;
        Object obj3 = this.m;
        jnm jnmVar = (jnm) this.e;
        hnq hnqVar = (hnq) this.d;
        hnt hntVar = new hnt((Context) this.a, zwaVarE, aaqnVarB, hnqVar, jnmVar, this.g, this.h, (hnz) obj3, r11, tbtVar, hufVar, aanyVar, synVar, vxzVar2, vxzVar);
        ?? r0 = this.f;
        ((ArrayList) r0).add(hntVar);
        int size = r0.size();
        for (int i = 0; i < size; i++) {
            hnt hntVar2 = (hnt) r0.get(i);
            hntVar2.h.y(hntVar2);
            avmm avmmVar = hntVar2.g;
            hnq hnqVar2 = hntVar2.c;
            avmmVar.c(hnqVar2.b.af(new hjd(hntVar2, 14)));
            avmmVar.c(hnqVar2.d.af(new hjd(hntVar2, 15)));
            hntVar2.e.f(hntVar2);
        }
    }

    public final boolean A() {
        return ((vxz) this.i).l(258, 45801921L, false);
    }

    public final boolean B() {
        return ((vxz) this.j).l(225, 45830180L, false);
    }

    public final boolean C() {
        return ((vxz) this.j).l(221, 45826531L, false);
    }

    public final boolean D() {
        return ((vxz) this.i).l(227, 45782302L, false);
    }

    public final boolean E() {
        return ((vxz) this.a).l(22, 45658994L, true);
    }

    public final boolean F() {
        return ((vxz) this.i).l(180, 45746458L, false);
    }

    public final boolean G() {
        return ((vxz) this.i).l(246, 45796871L, false);
    }

    public final boolean H() {
        return ((vxz) this.m).l(85, 45785200L, false);
    }

    public final boolean I() {
        return ((vxz) this.i).l(214, 45774538L, false);
    }

    public final boolean J() {
        return ((vxz) this.o).m(173, 45700052L);
    }

    public final boolean K() {
        return ((vxz) this.i).l(141, 45705999L, false);
    }

    public final boolean L() {
        return ((vxz) this.k).l(80, 45856874L, false);
    }

    public final boolean M() {
        return ((vxz) this.m).l(92, 45805118L, false);
    }

    public final boolean N() {
        return ((vxz) this.i).l(253, 45799111L, false);
    }

    public final boolean O() {
        return ((vxz) this.c).l(45, 45835053L, false);
    }

    public final boolean P() {
        return ((vxz) this.i).l(201, 45763263L, false);
    }

    public final boolean Q() {
        return ((vxz) this.i).l(202, 45763439L, false);
    }

    public final boolean R() {
        return ((vxz) this.i).l(147, 45711200L, false);
    }

    public final boolean S() {
        return ((vxz) this.i).l(146, 45711153L, false);
    }

    public final boolean T() {
        return ((vxz) this.m).l(122, 45850553L, false);
    }

    public final boolean U() {
        return ((vxz) this.i).l(317, 45851476L, false);
    }

    public final boolean V() {
        return ((vxz) this.i).l(313, 45845721L, false);
    }

    public final boolean W() {
        return ((vxz) this.i).l(237, 45793848L, false);
    }

    public final boolean X() {
        return ((vxz) this.m).l(116, 45844629L, false);
    }

    public final boolean Y() {
        return ((vxz) this.k).l(75, 45826677L, false);
    }

    public final boolean Z() {
        return ((vxz) this.m).l(R.styleable.AppCompatTheme_windowMinWidthMajor, 45856764L, false);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, zwb] */
    public final void a() {
        ((tbt) this.c).f(this);
        if (this.b.u()) {
            bl();
        }
    }

    public final boolean aA() {
        return ((vxz) this.m).l(52, 45729994L, false);
    }

    public final boolean aB() {
        return ((vxz) this.m).l(71, 45763871L, false);
    }

    public final boolean aC() {
        return ((vxz) this.i).l(92, 45647747L, false);
    }

    public final boolean aD() {
        return ((vxz) this.m).l(117, 45847112L, false);
    }

    public final boolean aE() {
        return ((vxz) this.o).m(115, 45620373L);
    }

    public final boolean aF() {
        return ((vxz) this.m).l(45, 45722066L, false);
    }

    public final boolean aG() {
        return ((vxz) this.m).l(106, 45822407L, false);
    }

    public final boolean aH() {
        return ((vxz) this.m).l(96, 45811675L, false);
    }

    public final boolean aI() {
        MediaFetchColdConfigOuterClass$MediaFetchColdConfig defaultInstance = abmt.cm((vxu) this.p).c;
        if (defaultInstance == null) {
            defaultInstance = MediaFetchColdConfigOuterClass$MediaFetchColdConfig.getDefaultInstance();
        }
        return defaultInstance.c;
    }

    public final boolean aJ() {
        return ((vxz) this.k).l(78, 45845023L, false);
    }

    public final boolean aK() {
        return ((vxz) this.i).l(102, 45662826L, false);
    }

    public final boolean aL() {
        return ((vxz) this.n).l(23, 45662143L, false);
    }

    public final boolean aM() {
        return ((vxz) this.i).l(99, 45657151L, false);
    }

    public final boolean aN() {
        return ((vxz) this.i).l(86, 45644023L, false);
    }

    public final boolean aO() {
        return ((vxz) this.m).l(6, 45649726L, false);
    }

    public final boolean aP() {
        return ((vxz) this.m).l(56, 45736557L, false);
    }

    public final boolean aQ() {
        return ((vxz) this.i).l(57, 45617843L, false);
    }

    public final boolean aR() {
        return ((vxz) this.i).l(105, 45666395L, false);
    }

    public final boolean aS() {
        return ((vxz) this.i).l(ModuleDescriptor.MODULE_VERSION, 45775694L, false);
    }

    public final boolean aT() {
        return ((vxz) this.i).l(159, 45725239L, false);
    }

    public final boolean aU() {
        apdq apdqVar = ((vxu) this.p).c().w;
        if (apdqVar == null) {
            apdqVar = apdq.a;
        }
        return (apdqVar.b & SemanticState.ReadOnly) != 0;
    }

    public final boolean aV() {
        apdq apdqVar = ((vxu) this.p).c().w;
        if (apdqVar == null) {
            apdqVar = apdq.a;
        }
        return (apdqVar.b & SemanticState.Obscured) != 0;
    }

    public final boolean aW() {
        apdq apdqVar = ((vxu) this.p).c().w;
        if (apdqVar == null) {
            apdqVar = apdq.a;
        }
        return apdqVar.g;
    }

    public final boolean aX() {
        return ((vxz) this.l).m(23, 45530946L);
    }

    public final boolean aY() {
        return i() >= 2 || aI();
    }

    public final boolean aZ() {
        return ((vxz) this.k).l(0, 45415425L, false);
    }

    public final boolean aa() {
        return ((vxz) this.i).l(230, 45783735L, false);
    }

    public final boolean ab() {
        return ((vxz) this.i).l(155, 45722759L, false);
    }

    public final boolean ac() {
        return ((vxz) this.m).l(101, 45814588L, false);
    }

    public final boolean ad() {
        return ((vxz) this.g).m(99, 45619198L);
    }

    public final boolean ae() {
        return ((vxz) this.m).l(27, 45701912L, false);
    }

    public final boolean af() {
        return S() || P() || Q() || R();
    }

    public final boolean ag() {
        if (!((vxz) this.i).l(122, 45692114L, false)) {
            return false;
        }
        vxu vxuVar = (vxu) this.p;
        apdq apdqVar = vxuVar.c().w;
        if (apdqVar == null) {
            apdqVar = apdq.a;
        }
        if (!apdqVar.i) {
            apdq apdqVar2 = vxuVar.c().w;
            if (apdqVar2 == null) {
                apdqVar2 = apdq.a;
            }
            if (!apdqVar2.j) {
                return false;
            }
        }
        return true;
    }

    public final boolean ah() {
        return ((vxz) this.i).l(179, 45746364L, false);
    }

    public final boolean ai() {
        return ((vxz) this.k).l(12, 45622664L, false);
    }

    public final boolean aj() {
        return ((vxz) this.k).l(21, 45638126L, false);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [awmd, java.lang.Object] */
    public final boolean ak() {
        return ((aenu) this.h.io()).o();
    }

    public final boolean al() {
        return ((vxz) this.i).l(224, 45780619L, false);
    }

    public final boolean am() {
        return ((vxz) this.i).l(142, 45707443L, false);
    }

    public final boolean an() {
        return ((vxz) this.c).l(47, 45849129L, false);
    }

    public final boolean ao() {
        return ((vxz) this.i).l(290, 45831470L, false);
    }

    public final boolean ap() {
        return ((vxz) this.m).l(119, 45847375L, false);
    }

    public final boolean aq() {
        return ((vxz) this.k).l(36, 45655248L, false);
    }

    public final boolean ar() {
        return ((vxz) this.k).l(35, 45655247L, false);
    }

    public final boolean as() {
        return ((vxz) this.i).l(284, 45825858L, false) || ((vxz) this.e).l(378, 45825857L, false);
    }

    public final boolean at() {
        return ((vxz) this.i).l(152, 45717754L, false);
    }

    public final boolean au() {
        return ((vxz) this.c).l(30, 45694567L, false);
    }

    public final boolean av() {
        return ((vxz) this.m).l(15, 45665016L, false);
    }

    public final boolean aw() {
        return ((vxz) this.m).l(102, 45815237L, false);
    }

    public final boolean ax() {
        return ((vxz) this.c).l(38, 45728246L, false);
    }

    public final boolean ay() {
        return ((vxz) this.m).l(100, 45813628L, false);
    }

    public final boolean az() {
        return ((vxz) this.m).l(91, 45804820L, false);
    }

    public final float b() {
        return (float) ((vxz) this.i).a(1, 45530958L, 1.9d);
    }

    public final boolean ba() {
        return ((vxz) this.l).m(14, 45381591L);
    }

    public final boolean bb() {
        return ((vxz) this.m).l(53, 45730337L, false);
    }

    public final boolean bc() {
        return ((vxz) this.g).m(109, 45624552L);
    }

    public final boolean bd() {
        return ((vxz) this.i).l(199, 45761383L, false);
    }

    public final boolean be() {
        apdq apdqVar = ((vxu) this.p).c().w;
        if (apdqVar == null) {
            apdqVar = apdq.a;
        }
        return apdqVar.d;
    }

    public final boolean bf() {
        return ((vxz) this.i).l(132, 45698788L, false);
    }

    public final boolean bg() {
        return ((vxz) this.m).l(24, 45699650L, false);
    }

    public final boolean bh() {
        MediaFetchColdConfigOuterClass$MediaFetchColdConfig defaultInstance = abmt.cm((vxu) this.p).c;
        if (defaultInstance == null) {
            defaultInstance = MediaFetchColdConfigOuterClass$MediaFetchColdConfig.getDefaultInstance();
        }
        return defaultInstance.h;
    }

    public final void bj() {
        ((vxz) this.m).l(98, 45813213L, false);
    }

    public final float c() {
        apdq apdqVar = ((vxu) this.p).c().w;
        if (apdqVar == null) {
            apdqVar = apdq.a;
        }
        return apdqVar.e;
    }

    public final int d() {
        return (int) ((vxz) this.i).c(14, 45763455L, 20L);
    }

    public final int e() {
        return (int) ((vxz) this.i).c(15, 45770012L, 5L);
    }

    public final int f() {
        return (int) ((vxz) this.m).c(3, 45814401L, 0L);
    }

    public final int g() {
        return (int) ((vxz) this.i).c(13, 45757902L, 0L);
    }

    public final int h() {
        return (int) ((vxz) this.i).c(12, 45757901L, 0L);
    }

    @tcc
    public void handlePlaybackServiceException(aboe aboeVar) {
        if (txz.d((Context) this.a)) {
            Throwable th = aboeVar.g;
            if ((th instanceof tmg) || (th instanceof tnc)) {
                bk();
            }
        }
    }

    @tcc
    public void handleSignInEvent(zwt zwtVar) {
        bl();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    @tcc
    public void handleSignOutEvent(zwu zwuVar) {
        ?? r5 = this.f;
        int size = r5.size();
        for (int i = 0; i < size; i++) {
            hnt hntVar = (hnt) r5.get(i);
            hntVar.g.b();
            hntVar.e.l(hntVar);
        }
        ((ArrayList) r5).clear();
        bk();
    }

    public final int i() {
        vxz vxzVar = (vxz) this.e;
        int i = !vxzVar.l(116, 45415141L, false) ? 1 : 0;
        int iC = (int) vxzVar.c(18, 45400356L, 0L);
        apdq apdqVar = ((vxu) this.p).c().w;
        if (apdqVar == null) {
            apdqVar = apdq.a;
        }
        return Math.max(i, Math.max(iC, apdqVar.h));
    }

    public final boolean j() {
        return ((vxz) this.m).l(86, 45786184L, false);
    }

    public final boolean k() {
        return ((vxz) this.m).m(127, 45859243L);
    }

    public final boolean l() {
        return ((vxz) this.m).l(112, 45831829L, false);
    }

    public final boolean m() {
        return ((vxz) this.i).l(270, 45813015L, false);
    }

    public final boolean n() {
        return ((vxz) this.m).l(115, 45843566L, false);
    }

    public final boolean o() {
        return ((vxz) this.i).l(304, 45842023L, false);
    }

    public final boolean p() {
        return ((vxz) this.i).l(248, 45797801L, false);
    }

    public final boolean q() {
        return ((vxz) this.c).l(37, 45723773L, false);
    }

    public final boolean r() {
        return ((vxz) this.c).l(42, 45821352L, false);
    }

    public final boolean s() {
        return ((vxz) this.m).l(111, 45826266L, false);
    }

    public final boolean t() {
        return ((vxz) this.m).l(120, 45848917L, false);
    }

    public final boolean u() {
        return ((vxz) this.m).l(121, 45850326L, false);
    }

    public final boolean v() {
        aizx aizxVar = ((vyo) this.d).b().o;
        if (aizxVar == null) {
            aizxVar = aizx.a;
        }
        return aizxVar.ag;
    }

    public final boolean w() {
        return ((vxz) this.i).l(271, 45813622L, false);
    }

    public final boolean x() {
        return ((vxz) this.i).l(204, 45764219L, false);
    }

    public final boolean y() {
        return ((vxz) this.i).l(225, 45781997L, false);
    }

    public final boolean z() {
        tqj tqjVar = tqi.a;
        if (tqjVar == null) {
            return ((vxz) this.j).l(234, 45840490L, false);
        }
        int i = tqr.a;
        return tqjVar.k(1073830861);
    }

    public hno(Context context, tbt tbtVar, zwb zwbVar, hnq hnqVar, aanb aanbVar, jnm jnmVar, SharedPreferences sharedPreferences, Executor executor, hnz hnzVar, aacm aacmVar, huf hufVar, aany aanyVar, syn synVar, vxz vxzVar, vxz vxzVar2, hef hefVar) {
        this.a = context;
        this.b = zwbVar;
        this.c = tbtVar;
        this.d = hnqVar;
        this.l = aanbVar;
        this.e = jnmVar;
        this.g = sharedPreferences;
        this.f = new ArrayList();
        this.h = executor;
        this.m = hnzVar;
        this.i = aacmVar;
        this.j = hufVar;
        this.k = aanyVar;
        this.q = synVar;
        this.n = vxzVar;
        this.o = vxzVar2;
        this.p = hefVar;
    }

    public hno(vxz vxzVar, vxu vxuVar, vyo vyoVar, vxz vxzVar2, vxz vxzVar3, vxz vxzVar4, vxz vxzVar5, vxz vxzVar6, vxz vxzVar7, vxz vxzVar8, vxz vxzVar9, vxz vxzVar10, vxz vxzVar11, vxz vxzVar12, vxz vxzVar13, vxz vxzVar14, awmd awmdVar) {
        this.e = vxzVar;
        this.p = vxuVar;
        this.d = vyoVar;
        this.c = vxzVar2;
        this.k = vxzVar3;
        this.g = vxzVar4;
        this.l = vxzVar5;
        this.j = vxzVar6;
        this.q = vxzVar7;
        this.i = vxzVar8;
        this.o = vxzVar9;
        this.a = vxzVar10;
        this.m = vxzVar11;
        this.n = vxzVar12;
        this.b = vxzVar13;
        this.f = vxzVar14;
        this.h = awmdVar;
    }
}
