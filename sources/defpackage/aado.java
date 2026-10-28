package defpackage;

import android.content.SharedPreferences;
import android.os.Handler;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Collection;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aado implements aaqn {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/offline/client/DefaultOfflineStore");
    public final ci A;
    private aarp B;
    private final tbt C;
    private final aanl D;
    private final aauk E;
    private final aafw F;
    private final aagg G;
    private final aaev H;
    private final aaeu I;
    private final awmd J;
    private final awmd K;
    private final awmd L;
    private final awmd M;
    private final awmd N;
    private final awmd O;
    private final awly P;
    private final abfv Q;
    private final axfd R;
    public final String b;
    public final zwa c;
    public final Handler d;
    public final SharedPreferences e;
    public final awmd f;
    public final aaps g;
    public final aari h;
    public final aacm i;
    public final ScheduledExecutorService j;
    public final Executor k;
    public final wcn l;
    public final awmd m;
    public final aaew n;
    public final aary o;
    public final awmd p;
    public final aada q;
    public final awmd r;
    public final awmd s;
    public final awmd t;
    public final awmd u;
    public final awmd v;
    public boolean w;
    public final afkb x;
    public final vxz y;
    public final abfv z;

    public aado(String str, zwa zwaVar, Handler handler, tbt tbtVar, SharedPreferences sharedPreferences, awmd awmdVar, aaps aapsVar, aari aariVar, aacm aacmVar, aanl aanlVar, ScheduledExecutorService scheduledExecutorService, Executor executor, aauk aaukVar, vxz vxzVar, wcn wcnVar, ci ciVar, awmd awmdVar2, axfd axfdVar, abfv abfvVar, aaew aaewVar, aafw aafwVar, aagg aaggVar, aaev aaevVar, aaeu aaeuVar, aary aaryVar, abfv abfvVar2, awmd awmdVar3, aada aadaVar, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, awmd awmdVar9, awmd awmdVar10, awmd awmdVar11, awmd awmdVar12, awmd awmdVar13, awly awlyVar, awmd awmdVar14) {
        this.b = str;
        this.c = zwaVar;
        this.d = handler;
        this.C = tbtVar;
        this.e = sharedPreferences;
        this.f = awmdVar;
        this.g = aapsVar;
        this.h = aariVar;
        this.i = aacmVar;
        this.D = aanlVar;
        this.j = scheduledExecutorService;
        this.k = executor;
        this.E = aaukVar;
        this.y = vxzVar;
        this.l = wcnVar;
        this.A = ciVar;
        this.m = awmdVar2;
        this.R = axfdVar;
        this.z = abfvVar;
        this.n = aaewVar;
        this.F = aafwVar;
        this.G = aaggVar;
        this.H = aaevVar;
        this.I = aaeuVar;
        this.o = aaryVar;
        this.Q = abfvVar2;
        this.p = awmdVar3;
        this.q = aadaVar;
        this.r = awmdVar4;
        this.J = awmdVar5;
        this.s = awmdVar6;
        this.K = awmdVar7;
        this.t = awmdVar8;
        this.u = awmdVar9;
        this.L = awmdVar10;
        this.M = awmdVar11;
        this.N = awmdVar12;
        this.O = awmdVar13;
        this.P = awlyVar;
        this.v = awmdVar14;
        this.x = new afkb(new ojf(this, 13), scheduledExecutorService);
    }

    public static String r(String str) {
        return TextUtils.join(".", new String[]{"offline", str, "db"});
    }

    public final synchronized void A() {
        this.w = false;
        this.P.kn();
        aada aadaVar = this.q;
        aadaVar.b.f.remove(aadaVar);
        this.g.g();
        this.h.d();
        this.i.e();
        this.D.g();
        SharedPreferences sharedPreferences = this.e;
        if (aarq.j(sharedPreferences, this.b)) {
            Executor executor = this.k;
            ci ciVar = this.A;
            ciVar.getClass();
            executor.execute(new aadm(ciVar, 3));
        }
        this.R.z();
        if (this.E.z()) {
            this.H.b();
        }
        sharedPreferences.edit().remove("current_offline_store_tag").apply();
    }

    public final synchronized boolean B() {
        return this.w;
    }

    public final boolean C() {
        try {
            p().get();
            return true;
        } catch (IllegalStateException | InterruptedException | ExecutionException e) {
            ((agrc) ((agrc) ((agrc) a.b()).j(e)).k("com/google/android/libraries/youtube/offline/client/DefaultOfflineStore", "waitOnOfflineStoreInitDone", (char) 780, "DefaultOfflineStore.java")).t("[Offline] Offline store initialization error");
            if (this.E.b.l(81, 45426799L, false)) {
                zvp.b(zvn.b, zvm.C, "Offline store init error: ".concat(String.valueOf(e.getMessage())), e);
            }
            return false;
        }
    }

    public final aerj D() {
        return (aerj) this.O.io();
    }

    @Override // defpackage.aaqn
    public final abfv E() {
        return this.Q;
    }

    @Override // defpackage.aaqn
    public final yvi a() {
        return (yvi) this.N.io();
    }

    @Override // defpackage.aaqn
    public final zwa b() {
        return this.c;
    }

    @Override // defpackage.aaqn
    public final aadc c() {
        return this.q;
    }

    @Override // defpackage.aaqn
    public final aaew d() {
        if (C()) {
            return this.n;
        }
        return null;
    }

    @Override // defpackage.aaqn
    public final aaex e() {
        return this.n;
    }

    @Override // defpackage.aaqn
    public final aafu f() {
        return (aafu) this.L.io();
    }

    @Override // defpackage.aaqn
    public final aalf g() {
        return (aalf) this.p.io();
    }

    @Override // defpackage.aaqn
    public final aaqi h() {
        return (aaqi) this.M.io();
    }

    @tcc
    public void handleOfflineVideoStatusUpdateEvent(aaif aaifVar) {
        if (Objects.equals(aaifVar.b, aogv.NOT_PLAYABLE)) {
            ((aadk) this.t.io()).o(aaifVar.a.b(), null);
        }
    }

    @tcc
    public void handleSdCardMountChangedEvent(tqb tqbVar) {
        this.k.execute(new aadm(this, 1));
    }

    @Override // defpackage.aaqn
    public final aaqm i() {
        return (aaqm) this.t.io();
    }

    @Override // defpackage.aaqn
    public final aaqq j() {
        return (aaqq) this.u.io();
    }

    @Override // defpackage.aaqn
    public final aaqr k() {
        return (aaqr) this.K.io();
    }

    @Override // defpackage.aaqn
    public final aaqt l() {
        return (aaqt) this.s.io();
    }

    @Override // defpackage.aaqn
    public final aaqu m() {
        return (aaqu) this.J.io();
    }

    @Override // defpackage.aaqn
    public final aaqx n() {
        return (aaqx) this.r.io();
    }

    @Override // defpackage.aaqn
    public final aarp o() {
        return this.B;
    }

    public final ListenableFuture p() {
        if (!this.w) {
            return ahng.m(new aais());
        }
        ListenableFuture listenableFutureA = this.x.a();
        hqn hqnVar = new hqn(14);
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        long j = afwl.a;
        ahdb ahdbVar = new ahdb(afty.c(false), hqnVar, 1);
        int i = ahbz.d;
        ahbx ahbxVar = new ahbx(listenableFutureA, Throwable.class, ahdbVar);
        listenableFutureA.addListener(ahbxVar, MoreExecutors.c(executorDirectExecutor, ahbxVar));
        return ahbxVar;
    }

    @Override // defpackage.aaqn
    public final awly q() {
        return this.P;
    }

    @Override // defpackage.aaqn
    public final String s() {
        return this.b;
    }

    @Override // defpackage.aaqn
    public final void t() {
        u(new aadm(this, 2));
    }

    public final void u(Runnable runnable) {
        this.k.execute(new wdd(this, runnable, 14));
    }

    @Override // defpackage.aaqn
    public final void v(String str, sxu sxuVar) {
        typ.f(str);
        this.k.execute(new yag(this, str, sxuVar, 18, (int[]) null));
    }

    public final void w(String str, sxu sxuVar) {
        sxuVar.b(null, this.n.aq(str));
    }

    final synchronized void x() {
        if (!this.w) {
            this.B = new aark(this, 1);
            this.D.r();
            aaew aaewVar = this.n;
            aaewVar.a.add(new hxh(this));
            this.F.b(new aage(this, 1));
            aagg aaggVar = this.G;
            aaggVar.g.add(new hzo(this));
            this.H.a = new hxh(this);
        }
        this.w = true;
        ListenableFuture listenableFutureA = this.x.a();
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        aadl aadlVar = new aadl(this, 0);
        hvf hvfVar = new hvf(this, 6);
        Executor executor = taf.a;
        taa taaVar = new taa(hvfVar, null, aadlVar);
        long j = afwl.a;
        listenableFutureA.addListener(new ahei(listenableFutureA, new afwj(afty.c(false), taaVar, 0)), executorDirectExecutor);
    }

    public final synchronized void y(Object obj) {
        if (this.w) {
            this.C.e(obj);
        }
    }

    public final synchronized void z() {
        avlb avlbVarI;
        avlb avlbVarC;
        SharedPreferences.Editor editorEdit = this.e.edit();
        String str = this.b;
        editorEdit.putString("current_offline_store_tag", str).apply();
        this.q.j();
        this.G.g();
        this.n.r();
        this.g.b(str);
        this.h.b(str);
        this.i.b(str);
        aadv aadvVar = (aadv) this.K.io();
        aadvVar.k.u(new yas(aadvVar, 11, null));
        i().p();
        ListenableFuture listenableFutureF = ((aady) this.s.io()).f();
        hvf hvfVar = new hvf(this, 7);
        Executor executor = taf.a;
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        taa taaVar = new taa(hvfVar, null, taf.b);
        long j = afwl.a;
        int i = 0;
        listenableFutureF.addListener(new ahei(listenableFutureF, new afwj(afty.c(false), taaVar, 0)), executorDirectExecutor);
        vxz vxzVar = this.E.b;
        long jC = vxzVar.c(15, 45661340L, 0L);
        awmd awmdVar = this.f;
        SharedPreferences sharedPreferences = ((aaqg) awmdVar.io()).b;
        String strY = tym.y("offline_migration_milestone1_cleanup_value_%s", str);
        long j2 = sharedPreferences.getLong(strY, 0L);
        if (j2 != jC) {
            sharedPreferences.edit().putLong(strY, jC).apply();
        }
        if (jC <= j2) {
            avlbVarI = avpy.a;
            avnn avnnVar = atqp.p;
        } else {
            aaeu aaeuVar = this.I;
            ArrayList arrayList = new ArrayList();
            int i2 = 12;
            avlbVarI = aaeuVar.d.q(119).c(new hpn(aaeuVar, arrayList, i2)).i(new hmg(aaeuVar, arrayList, i2));
        }
        avlb avlbVar = avlbVarI;
        long jC2 = vxzVar.c(19, 45694607L, 0L);
        aaqg aaqgVar = (aaqg) awmdVar.io();
        String strY2 = tym.y("offline_migration_milestone1_validation_value_%s", str);
        SharedPreferences sharedPreferences2 = aaqgVar.b;
        long j3 = sharedPreferences2.getLong(strY2, 0L);
        if (j3 != jC2) {
            sharedPreferences2.edit().putLong(strY2, jC2).apply();
        }
        int i3 = 2;
        if (jC2 <= j3) {
            avlbVarC = avpy.a;
            avnn avnnVar2 = atqp.p;
        } else {
            aaeu aaeuVar2 = this.I;
            List listL = aaeuVar2.c.l();
            wcn wcnVar = aaeuVar2.d;
            wer werVarE = wcnVar.e();
            Collection.EL.stream(listL).filter(new aaep(i)).map(new aaeq(i)).forEach(new aaer(werVarE, i));
            avlbVarC = wcnVar.r(120).x(agpr.a).c(new yrb(werVarE, i3));
        }
        avpq avpqVar = new avpq(new avle[]{avlbVar, avlbVarC});
        avnn avnnVar3 = atqp.p;
        avpqVar.i(new isg(this, 4)).D();
    }
}
