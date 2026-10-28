package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aatc implements aati, aarz {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/offline/transfer/service/DefaultTransfersExecutorManager");
    private static final CountDownLatch u = new CountDownLatch(0);
    private static final Pair v = new Pair("", 17);
    private final Executor A;
    private final aasy B;
    private aasw E;
    private final vxz F;
    private final abfv G;
    public volatile String b;
    public final Context d;
    public final awmd e;
    public final awmd f;
    public final awmd g;
    public final SharedPreferences h;
    public final String i;
    public final aauk j;
    public final awmd k;
    public final boolean l;
    public final awmd m;
    public aask n;
    public boolean o;
    public Executor p;
    public aatb q;
    public avmn r;
    public CountDownLatch s;
    public final isi t;
    private final Executor w;
    private final aasl x;
    private final aalj y;
    private final aark z;
    public final Map c = new HashMap();
    private Set D = new CopyOnWriteArraySet();
    private final awku C = new awku();

    public aatc(Context context, Executor executor, awmd awmdVar, awmd awmdVar2, awmd awmdVar3, SharedPreferences sharedPreferences, aasl aaslVar, aalj aaljVar, aark aarkVar, Executor executor2, aasy aasyVar, abfv abfvVar, String str, isi isiVar, aauk aaukVar, vxz vxzVar, awmd awmdVar4, awmd awmdVar5) {
        this.d = context;
        this.w = executor;
        this.e = awmdVar;
        this.f = awmdVar2;
        this.g = awmdVar3;
        this.h = sharedPreferences;
        this.x = aaslVar;
        this.y = aaljVar;
        this.z = aarkVar;
        this.A = executor2;
        this.B = aasyVar;
        this.G = abfvVar;
        this.i = str;
        this.t = isiVar;
        this.j = aaukVar;
        this.F = vxzVar;
        this.k = awmdVar4;
        this.l = aaukVar.H();
        this.m = awmdVar5;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.Set] */
    private final void r(boolean z, String str) {
        aaqn aaqnVarB;
        abfv abfvVarE;
        if (!this.F.m(58, 45813924L) || TextUtils.isEmpty(str) || (aaqnVarB = ((aanb) this.f.io()).b()) == null || (abfvVarE = aaqnVarB.E()) == null) {
            return;
        }
        if (z) {
            str.getClass();
            if (str.length() != 0) {
                abfvVarE.b.add(str);
            }
        } else {
            str.getClass();
            if (str.length() != 0) {
                abfvVarE.a.add(str);
            }
        }
        aask aaskVar = this.n;
        if (aaskVar != null) {
            aaskVar.h();
        }
    }

    @Override // defpackage.aarz
    public final void a(aamw aamwVar) {
        throw null;
    }

    @Override // defpackage.aati
    public final aasa b() {
        return this.n;
    }

    /* JADX WARN: Type inference failed for: r3v35, types: [java.lang.Object, tpq] */
    @Override // defpackage.aati
    public final aasa c() {
        if (this.n == null) {
            Executor executor = this.A;
            aasl aaslVar = this.x;
            this.s = new CountDownLatch(1);
            aasw aaswVar = new aasw(this, executor);
            this.E = aaswVar;
            awku awkuVar = this.C;
            Context context = (Context) aaslVar.a.io();
            context.getClass();
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) aaslVar.b.io();
            scheduledExecutorService.getClass();
            tfq tfqVar = (tfq) aaslVar.c.io();
            tfqVar.getClass();
            mbc mbcVar = (mbc) aaslVar.d.io();
            mbcVar.getClass();
            dov dovVar = (dov) aaslVar.e.io();
            dovVar.getClass();
            syn synVar = (syn) aaslVar.f.io();
            synVar.getClass();
            aaqo aaqoVar = (aaqo) aaslVar.g.io();
            aaqoVar.getClass();
            abxv abxvVar = (abxv) aaslVar.i.io();
            abxvVar.getClass();
            aalv aalvVar = (aalv) aaslVar.j.io();
            aalvVar.getClass();
            aary aaryVar = (aary) aaslVar.k.io();
            aaryVar.getClass();
            vyo vyoVar = (vyo) aaslVar.l.io();
            vyoVar.getClass();
            aauk aaukVar = (aauk) aaslVar.m.io();
            aaukVar.getClass();
            abfv abfvVar = (abfv) aaslVar.o.io();
            abfvVar.getClass();
            afcy afcyVar = (afcy) aaslVar.p.io();
            afcyVar.getClass();
            aasb aasbVar = (aasb) aaslVar.q.io();
            aasbVar.getClass();
            aasq aasqVar = (aasq) aaslVar.r.io();
            aasqVar.getClass();
            aasr aasrVar = (aasr) aaslVar.s.io();
            aasrVar.getClass();
            String str = this.i;
            abfv abfvVar2 = this.G;
            aasy aasyVar = this.B;
            aark aarkVar = this.z;
            aalj aaljVar = this.y;
            aazo aazoVar = (aazo) aaslVar.t.io();
            aazoVar.getClass();
            aass aassVar = (aass) aaslVar.u.io();
            aassVar.getClass();
            zwb zwbVar = (zwb) aaslVar.v.io();
            zwbVar.getClass();
            awkv awkvVar = (awkv) aaslVar.w.io();
            awkvVar.getClass();
            awmd awmdVar = aaslVar.n;
            awmd awmdVar2 = aaslVar.h;
            awkv awkvVar2 = (awkv) aaslVar.x.io();
            awkvVar2.getClass();
            aesq aesqVar = (aesq) aaslVar.y.io();
            aesqVar.getClass();
            this.n = new aask(context, scheduledExecutorService, tfqVar, mbcVar, dovVar, synVar, aaqoVar, awmdVar2, abxvVar, aalvVar, aaryVar, vyoVar, aaukVar, awmdVar, abfvVar, afcyVar, aasbVar, aasqVar, aasrVar, aazoVar, aassVar, zwbVar, awkvVar, awkvVar2, aesqVar, awkuVar, aaswVar, str, aasyVar);
            this.w.execute(new aadm(this, 13));
            this.D = new CopyOnWriteArraySet();
            aatb aatbVar = new aatb(this);
            this.q = aatbVar;
            this.h.registerOnSharedPreferenceChangeListener(aatbVar);
            this.r = abfvVar2.b.d().P().ak(new zgd(this, 16));
            j();
            n(aaljVar);
            n(aarkVar);
            this.p = executor;
            aasw aaswVar2 = this.E;
            if (aaswVar2 != null) {
                aaswVar2.b = executor;
            }
        }
        aask aaskVar = this.n;
        aaskVar.getClass();
        return aaskVar;
    }

    public final avlh d() {
        return this.C;
    }

    @Override // defpackage.aati
    public final String e() {
        aask aaskVar = this.n;
        if (aaskVar == null) {
            return null;
        }
        return aaskVar.h;
    }

    @Override // defpackage.aati
    public final Map f() {
        aask aaskVar = this.n;
        return aaskVar != null ? aaskVar.u.g() : agpn.b;
    }

    @Override // defpackage.aati
    public final CountDownLatch g() {
        CountDownLatch countDownLatch = this.s;
        return countDownLatch == null ? u : countDownLatch;
    }

    @Override // defpackage.aati
    public final void h(String str) {
        r(false, str);
    }

    @Override // defpackage.aati
    public final void i(String str) {
        r(true, str);
    }

    public final void j() {
        aask aaskVar = this.n;
        if (aaskVar != null) {
            atpr atprVarS = ((aaqg) this.e.io()).s();
            aasi aasiVarA = aasj.a(21);
            aasiVarA.c = agev.i(atprVarS);
            aaskVar.f(aasiVarA.a());
        }
    }

    public final void k(twi twiVar) {
        for (aarp aarpVar : this.D) {
            if (aarpVar != null) {
                twiVar.a(aarpVar);
            }
        }
    }

    public final void l() {
        String strD = ((aanb) this.f.io()).d();
        aarq.g(this.h, strD, true);
        ((aaqg) this.e.io()).w(strD, true);
    }

    @Override // defpackage.aati
    public final void m() {
        Notification notificationB;
        if (this.d.getApplicationInfo().targetSdkVersion < 26 || (notificationB = ((aanl) this.g.io()).b()) == null || !p(notificationB)) {
            this.t.M();
        }
    }

    @Override // defpackage.aati
    public final void n(aarp aarpVar) {
        Set set = this.D;
        aarpVar.getClass();
        if (set.add(aarpVar) && this.o) {
            aarpVar.g();
        }
    }

    @Override // defpackage.aati
    public final void o(aarp aarpVar) {
        this.D.remove(aarpVar);
    }

    @Override // defpackage.aati
    public final boolean p(Notification notification) {
        isi isiVar = this.t;
        if (!isiVar.L().contains(v)) {
            return false;
        }
        isiVar.N(null, 17, notification);
        return true;
    }

    public final void q(aamw aamwVar) {
        ((aanl) this.g.io()).q(aamwVar);
    }
}
