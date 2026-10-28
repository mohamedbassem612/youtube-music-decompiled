package defpackage;

import com.google.firebase.messaging.FirebaseMessaging;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aacg {
    private static final agrf g = agrf.h("com/google/android/libraries/youtube/notification/topic/GcmExponentialBackoffRetryController");
    public final awmd a;
    public final vyo b;
    public int c;
    public final int d;
    int e;
    public final aach f;
    private final awmd h;
    private final tbt i;
    private final Executor j;
    private final amfk k;
    private final int l;
    private final syn m;
    private final ahgb n;

    /* JADX WARN: Type inference failed for: r1v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [awmd, java.lang.Object] */
    public aacg(awmd awmdVar, syn synVar, tfq tfqVar, tbt tbtVar, Executor executor, vyo vyoVar, xsc xscVar, awmd awmdVar2, aach aachVar, String str, String str2, int i, amfk amfkVar, int i2) {
        this.h = awmdVar;
        this.m = synVar;
        this.i = tbtVar;
        this.j = executor;
        this.f = aachVar;
        this.d = i;
        this.k = amfkVar;
        this.a = awmdVar2;
        this.b = vyoVar;
        typ.f(str);
        this.e = true == tfqVar.h() ? 2 : 1;
        mbc mbcVar = (mbc) xscVar.b.io();
        mbcVar.getClass();
        elr elrVar = (elr) xscVar.c.io();
        elrVar.getClass();
        this.n = new ahgb(mbcVar, elrVar, (awmd) xscVar.a, str2, this);
        this.l = i2;
    }

    private static String g(int i) {
        return a.bR(i, "gcm_subscription_retry_topic_");
    }

    final int a() {
        amfk amfkVar = this.k;
        if (amfkVar != null) {
            return amfkVar.c;
        }
        return 1;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [aaah, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, mbc] */
    /* JADX WARN: Type inference failed for: r1v7, types: [awmd, java.lang.Object] */
    public final void b() {
        lpa lpaVarC;
        if (this.c < a()) {
            int i = this.e;
            int i2 = 2;
            if (i == 3 || i == 2) {
                ahgb ahgbVar = this.n;
                int i3 = this.d;
                if (!((elr) ahgbVar.c).a.a()) {
                    ((aacg) ahgbVar.a).d("Waiting on FirebaseClient to initialize");
                    return;
                }
                ahgbVar.e.b();
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) ahgbVar.b.io();
                final int i4 = 0;
                final int i5 = 1;
                if (i3 == 1) {
                    final String str = (String) ahgbVar.d;
                    lpaVarC = firebaseMessaging.g.c(new loz() { // from class: ahsv
                        @Override // defpackage.loz
                        public final lpa a(Object obj) {
                            if (i5 != 0) {
                                ahtq ahtqVar = (ahtq) obj;
                                ahrs ahrsVar = FirebaseMessaging.a;
                                lpa lpaVarA = ahtqVar.a(new ahtn("S", str));
                                ahtqVar.d();
                                return lpaVarA;
                            }
                            ahtq ahtqVar2 = (ahtq) obj;
                            ahrs ahrsVar2 = FirebaseMessaging.a;
                            lpa lpaVarA2 = ahtqVar2.a(new ahtn("U", str));
                            ahtqVar2.d();
                            return lpaVarA2;
                        }
                    });
                    i2 = i3;
                } else {
                    final String str2 = (String) ahgbVar.d;
                    lpaVarC = firebaseMessaging.g.c(new loz() { // from class: ahsv
                        @Override // defpackage.loz
                        public final lpa a(Object obj) {
                            if (i4 != 0) {
                                ahtq ahtqVar = (ahtq) obj;
                                ahrs ahrsVar = FirebaseMessaging.a;
                                lpa lpaVarA = ahtqVar.a(new ahtn("S", str2));
                                ahtqVar.d();
                                return lpaVarA;
                            }
                            ahtq ahtqVar2 = (ahtq) obj;
                            ahrs ahrsVar2 = FirebaseMessaging.a;
                            lpa lpaVarA2 = ahtqVar2.a(new ahtn("U", str2));
                            ahtqVar2.d();
                            return lpaVarA2;
                        }
                    });
                }
                lpaVarC.o(new aace(ahgbVar, i2, i4));
            }
        }
    }

    public final void c() {
        this.e = 3;
        this.c = 0;
        b();
    }

    public final void d(String str) {
        this.c++;
        int i = this.d;
        awmd awmdVar = this.a;
        if (i == 1) {
            aaal.b(awmdVar, "SUBSCRIBED", false, this.b);
        } else {
            aaal.b(awmdVar, "UNSUBSCRIBED", false, this.b);
        }
        ((agrc) ((agrc) g.b()).k("com/google/android/libraries/youtube/notification/topic/GcmExponentialBackoffRetryController", "onPubSubFail", 265, "GcmExponentialBackoffRetryController.java")).w("Exception while attempting to subscribe to GCM topic: %s", str);
        if (this.c >= a()) {
            this.e = 4;
            aach aachVar = this.f;
            aachVar.e.e();
            aachVar.e = null;
            return;
        }
        this.e = 3;
        amfk amfkVar = this.k;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.m.d(g(this.l), (int) Math.max(1L, ((long) Math.min((int) (((double) amfkVar.b) * Math.pow(amfkVar.e, this.c - 1)), amfkVar.d)) / 1000), 2, 0, false, null, null, false);
    }

    public final void e() {
        this.i.l(this);
        ((aacf) ((dov) this.h.io()).ar(g(this.l))).a = null;
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    public final void f() {
        this.i.f(this);
        String strG = g(this.l);
        awmd awmdVar = this.h;
        aacf aacfVar = (aacf) ((dov) awmdVar.io()).ar(strG);
        if (aacfVar == null) {
            dov dovVar = (dov) awmdVar.io();
            if (dovVar.a.putIfAbsent(strG, new oml(new vrr(3), amjv.WORK_MANAGER_TASK_TAG_UNMAPPED, (byte[]) null)) != null) {
                throw new IllegalStateException(a.bT(strG, "Tag ", " is already registered."));
            }
            aacfVar = (aacf) ((dov) awmdVar.io()).ar(strG);
        }
        aacfVar.a = this;
        if (this.e == 2) {
            this.j.execute(new ztg(this, 13));
        }
    }

    @tcc
    public void handleConnectivityChangeEvent(tfn tfnVar) {
        if (!tfnVar.a || this.e != 1) {
            this.e = 1;
        } else {
            this.e = 2;
            this.j.execute(new ztg(this, 14));
        }
    }
}
