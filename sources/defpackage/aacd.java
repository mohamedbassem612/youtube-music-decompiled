package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class aacd implements aabz {
    public final afft b;
    protected final wjr c;
    private final String e;
    private final aaas f;
    private final ScheduledExecutorService g;
    private final Context h;
    private final mbc i;
    private final hld j;
    private final tfq k;
    private final aapw l;
    private final axfd m;
    private final ci n;
    private static final agrf d = agrf.h("com/google/android/libraries/youtube/notification/registration/YouTubeNotificationRegistrar");
    public static final agek a = new aabw();

    public aacd(aaas aaasVar, aapw aapwVar, ScheduledExecutorService scheduledExecutorService, wjr wjrVar, hld hldVar, Context context, mbc mbcVar, tfq tfqVar, axfd axfdVar, ci ciVar, afft afftVar) {
        int i = typ.a;
        this.e = "551011954849";
        this.f = aaasVar;
        this.l = aapwVar;
        this.g = scheduledExecutorService;
        this.c = wjrVar;
        this.j = hldVar;
        this.h = context;
        this.i = mbcVar;
        this.k = tfqVar;
        this.m = axfdVar;
        this.n = ciVar;
        this.b = afftVar;
    }

    private final void h(boolean z) {
        try {
            taf.b(this.f.r(z), new xwx(14));
        } catch (Exception unused) {
            ((agrc) ((agrc) d.b()).k("com/google/android/libraries/youtube/notification/registration/YouTubeNotificationRegistrar", "markNextRegistrationRequired", 302, "YouTubeNotificationRegistrar.java")).t("Failed to set registration pending flag");
        }
    }

    private final void i() {
        int iA = this.b.a(aacb.FINISHED_REGISTRATION);
        int i = iA - 1;
        if (iA == 0) {
            throw null;
        }
        if (i == 1) {
            j();
        } else if (i == 2) {
            g(aacc.UNKNOWN);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:12:0x002a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code duplicated, block: B:51:0x010c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0119  */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, mbc] */
    /* JADX WARN: Type inference failed for: r1v2, types: [aaas, java.lang.Object] */
    private final void j() {
        ?? r1;
        agev agevVarG;
        agev agevVarI;
        axfd axfdVar = this.m;
        vyo vyoVar = (vyo) axfdVar.b;
        if (vyoVar.b() == null) {
            r1 = axfdVar.a;
            if (r1.t()) {
                agevVarI = agev.i(aacc.UNKNOWN);
            } else {
                Object obj = axfdVar.e;
                boolean zBooleanValue = ((Boolean) taf.d(hld.d(), Boolean.TRUE)).booleanValue();
                agevVarG = r1.g();
                if (agevVarG.g() || ((Boolean) agevVarG.c()).booleanValue() != zBooleanValue) {
                    aabu.b(r1);
                    agevVarI = agev.i(aacc.APP_SETTINGS_CHANGED);
                } else {
                    Context context = (Context) axfdVar.c;
                    boolean zC = ((hld) obj).c(context);
                    agev agevVarJ = r1.j();
                    if (agevVarJ.g() && ((Boolean) agevVarJ.c()).booleanValue() == zC) {
                        if (axfdVar.d.f().toEpochMilli() - r1.f() >= 86400000) {
                            aabu.b(r1);
                            agevVarI = agev.i(aacc.EXPIRED);
                        } else {
                            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                            if (notificationManager != null) {
                                Iterator it = notificationManager.getNotificationChannels().iterator();
                                boolean z = false;
                                while (it.hasNext()) {
                                    NotificationChannel notificationChannelM = bd$$ExternalSyntheticApiModelOutline1.m(it.next());
                                    int importance = notificationChannelM.getImportance();
                                    boolean z2 = true;
                                    boolean z3 = notificationChannelM.getSound() == null;
                                    agev agevVarI2 = r1.i(notificationChannelM.getId());
                                    boolean z4 = (agevVarI2.g() && ((aaar) agevVarI2.c()).a == importance) ? false : true;
                                    boolean z5 = (agevVarI2.g() && ((aaar) agevVarI2.c()).b == z3) ? false : true;
                                    if (!z4 && !z5) {
                                        z2 = false;
                                    }
                                    z |= z2;
                                }
                                if (z) {
                                    aabu.b(r1);
                                    agevVarI = agev.i(aacc.CHANNEL_SETTINGS_CHANGED);
                                } else {
                                    agevVarI = agdf.a;
                                }
                            } else {
                                agevVarI = agdf.a;
                            }
                        }
                    } else {
                        aabu.b(r1);
                        agevVarI = agev.i(aacc.OS_SETTINGS_CHANGED);
                    }
                }
            }
        } else {
            aode aodeVar = vyoVar.b().p;
            if (aodeVar == null) {
                aodeVar = aode.a;
            }
            if (aodeVar.d) {
                agevVarI = agev.i(aacc.FORCE_REFRESH);
            } else {
                r1 = axfdVar.a;
                if (r1.t()) {
                    agevVarI = agev.i(aacc.UNKNOWN);
                } else {
                    Object obj2 = axfdVar.e;
                    boolean zBooleanValue2 = ((Boolean) taf.d(hld.d(), Boolean.TRUE)).booleanValue();
                    agevVarG = r1.g();
                    if (agevVarG.g()) {
                        aabu.b(r1);
                        agevVarI = agev.i(aacc.APP_SETTINGS_CHANGED);
                    } else {
                        aabu.b(r1);
                        agevVarI = agev.i(aacc.APP_SETTINGS_CHANGED);
                    }
                }
            }
        }
        if (agevVarI.g()) {
            g((aacc) agevVarI.c());
        } else {
            i();
        }
    }

    public abstract agev a();

    @Override // defpackage.aabz
    public final agev c() {
        return agev.i(this.f.s());
    }

    @Override // defpackage.aabz
    public final void d(aaby aabyVar) {
        this.g.execute(afwl.i(new zgc(this, aabyVar, 19, null)));
    }

    @Override // defpackage.aabz
    public final void e() {
        taq.c();
        if (this.b.a(aacb.REGISTRATION) == 2) {
            j();
        }
    }

    @Override // defpackage.aabz
    public final void f() {
        this.g.schedule(new yas(this, 9, null), 3L, TimeUnit.SECONDS);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x021c A[Catch: IllegalStateException -> 0x02f5, IllegalStateException | wno -> 0x02f7, TRY_ENTER, TryCatch #6 {IllegalStateException | wno -> 0x02f7, blocks: (B:29:0x01de, B:41:0x0232, B:43:0x0247, B:44:0x024b, B:46:0x0251, B:50:0x0267, B:40:0x021c), top: B:90:0x01de }] */
    /* JADX WARN: Code duplicated, block: B:77:0x031f A[LOOP:1: B:90:0x01de->B:77:0x031f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:78:0x032a  */
    /* JADX WARN: Code duplicated, block: B:95:0x0317 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, zwb] */
    public final void g(aacc aaccVar) {
        boolean z;
        twr twrVar;
        Throwable th;
        boolean zB;
        ci ciVar;
        boolean z2 = true;
        ((qtf) ((aerv) this.n.a.io()).n.io()).b(1L, aaccVar.n);
        if (!this.k.i()) {
            h(true);
            i();
            return;
        }
        agev agevVarA = a();
        if (agevVarA.g()) {
            taq.c();
            String str = (String) agevVarA.e("");
            if (TextUtils.isEmpty(str)) {
                z = true;
            } else {
                wjr wjrVar = this.c;
                aapw aapwVar = this.l;
                twr twrVarI = wjrVar.i();
                wrn wrnVar = new wrn(aapwVar.b, aapwVar.d.e());
                aihf aihfVar = wrnVar.b;
                aigj aigjVarX = aigj.x(str);
                aihfVar.copyOnWrite();
                aocu aocuVar = (aocu) aihfVar.instance;
                aocu aocuVar2 = aocu.a;
                aigjVarX.getClass();
                aocuVar.b |= 1;
                aocuVar.c = aigjVarX;
                String str2 = this.e;
                aihfVar.copyOnWrite();
                aocu aocuVar3 = (aocu) aihfVar.instance;
                aocuVar3.b |= 8;
                aocuVar3.f = str2;
                hld hldVar = this.j;
                boolean zBooleanValue = ((Boolean) taf.d(hld.d(), Boolean.TRUE)).booleanValue();
                if (!zBooleanValue) {
                    aihfVar.copyOnWrite();
                    aocu aocuVar4 = (aocu) aihfVar.instance;
                    aocuVar4.b |= 2;
                    aocuVar4.d = true;
                }
                Context context = this.h;
                boolean zC = hldVar.c(context);
                int i = 4;
                if (!zC) {
                    aihfVar.copyOnWrite();
                    aocu aocuVar5 = (aocu) aihfVar.instance;
                    aocuVar5.b |= 4;
                    aocuVar5.e = true;
                }
                List notificationChannels = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationChannels();
                Iterator it = notificationChannels.iterator();
                while (it.hasNext()) {
                    NotificationChannel notificationChannelM = bd$$ExternalSyntheticApiModelOutline1.m(it.next());
                    aihf aihfVarCreateBuilder = aoct.a.createBuilder();
                    boolean z3 = z2;
                    String id = notificationChannelM.getId();
                    aihfVarCreateBuilder.copyOnWrite();
                    aoct aoctVar = (aoct) aihfVarCreateBuilder.instance;
                    id.getClass();
                    int i2 = i;
                    aoctVar.b |= 1;
                    aoctVar.c = id;
                    int importance = notificationChannelM.getImportance();
                    aihfVarCreateBuilder.copyOnWrite();
                    aoct aoctVar2 = (aoct) aihfVarCreateBuilder.instance;
                    aoctVar2.b |= 2;
                    aoctVar2.d = importance;
                    Uri sound = notificationChannelM.getSound();
                    aihfVarCreateBuilder.copyOnWrite();
                    aoct aoctVar3 = (aoct) aihfVarCreateBuilder.instance;
                    aoctVar3.b |= 4;
                    aoctVar3.e = sound != null ? z3 : false;
                    boolean zCanShowBadge = notificationChannelM.canShowBadge();
                    aihfVarCreateBuilder.copyOnWrite();
                    aoct aoctVar4 = (aoct) aihfVarCreateBuilder.instance;
                    aoctVar4.b |= 8;
                    aoctVar4.f = zCanShowBadge;
                    boolean zShouldShowLights = notificationChannelM.shouldShowLights();
                    aihfVarCreateBuilder.copyOnWrite();
                    aoct aoctVar5 = (aoct) aihfVarCreateBuilder.instance;
                    aoctVar5.b |= 16;
                    aoctVar5.g = zShouldShowLights;
                    boolean zCanBypassDnd = notificationChannelM.canBypassDnd();
                    aihfVarCreateBuilder.copyOnWrite();
                    aoct aoctVar6 = (aoct) aihfVarCreateBuilder.instance;
                    aoctVar6.b |= 32;
                    aoctVar6.h = zCanBypassDnd;
                    int lockscreenVisibility = notificationChannelM.getLockscreenVisibility();
                    aihfVarCreateBuilder.copyOnWrite();
                    aoct aoctVar7 = (aoct) aihfVarCreateBuilder.instance;
                    aoctVar7.b |= 64;
                    aoctVar7.i = lockscreenVisibility;
                    wrnVar.a.add((aoct) aihfVarCreateBuilder.build());
                    z2 = z3;
                    i = i2;
                }
                boolean z4 = z2;
                int i3 = i;
                if (Build.VERSION.SDK_INT >= 33) {
                    aaas aaasVar = this.f;
                    int iD = aaasVar.d();
                    aihfVar.copyOnWrite();
                    aocu aocuVar6 = (aocu) aihfVar.instance;
                    aocuVar6.b |= 16;
                    aocuVar6.h = iD;
                    int iE = aaasVar.e();
                    aihfVar.copyOnWrite();
                    aocu aocuVar7 = (aocu) aihfVar.instance;
                    aocuVar7.b |= 32;
                    aocuVar7.i = iE;
                    agev agevVarH = aaasVar.h();
                    if (agevVarH.g()) {
                        Object objC = agevVarH.c();
                        aihfVar.copyOnWrite();
                        aocu aocuVar8 = (aocu) aihfVar.instance;
                        aocuVar8.j = (aoms) objC;
                        aocuVar8.b |= 64;
                    }
                }
                while (true) {
                    try {
                        aaas aaasVar2 = this.f;
                        mbc mbcVar = this.i;
                        boolean zC2 = hldVar.c(context);
                        agev agevVarJ = aaasVar2.j();
                        if (aaasVar2.k().g()) {
                            try {
                                if (!agevVarJ.g() || ((Boolean) agevVarJ.c()).booleanValue() != zC2) {
                                    taf.j(aaasVar2.q(mbcVar.f().toEpochMilli()), new ztb(i3));
                                }
                            } catch (IllegalStateException | wno e) {
                                th = e;
                                twrVar = twrVarI;
                                ((agrc) ((agrc) ((agrc) d.c()).j(th)).k("com/google/android/libraries/youtube/notification/registration/YouTubeNotificationRegistrar", "registerWithInnerTubeBlocking", (char) 215, "YouTubeNotificationRegistrar.java")).t("Could not register for notifications with InnerTube: ");
                                zB = twrVar.b();
                                ciVar = this.n;
                                if (zB) {
                                    ciVar.aB(aaca.INNERTUBE_RETRY);
                                    twrVarI = twrVar;
                                    i3 = 4;
                                } else {
                                    ciVar.aB(aaca.INNERTUBE_FAILED);
                                    z = z4;
                                    h(z);
                                }
                            }
                        } else {
                            taf.j(aaasVar2.q(mbcVar.f().toEpochMilli()), new ztb(i3));
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(aaasVar2.p(zC));
                        arrayList.add(aaasVar2.n(zBooleanValue));
                        if (notificationChannels != null) {
                            Iterator it2 = notificationChannels.iterator();
                            while (it2.hasNext()) {
                                NotificationChannel notificationChannelM2 = bd$$ExternalSyntheticApiModelOutline1.m(it2.next());
                                twrVar = twrVarI;
                                try {
                                    arrayList.add(aaasVar2.o(notificationChannelM2.getId(), new aaar(notificationChannelM2.getImportance(), notificationChannelM2.getSound() == null ? z4 : false)));
                                    twrVarI = twrVar;
                                } catch (IllegalStateException e2) {
                                    e = e2;
                                    th = e;
                                    ((agrc) ((agrc) ((agrc) d.c()).j(th)).k("com/google/android/libraries/youtube/notification/registration/YouTubeNotificationRegistrar", "registerWithInnerTubeBlocking", (char) 215, "YouTubeNotificationRegistrar.java")).t("Could not register for notifications with InnerTube: ");
                                    zB = twrVar.b();
                                    ciVar = this.n;
                                    if (zB) {
                                        ciVar.aB(aaca.INNERTUBE_FAILED);
                                        z = z4;
                                        h(z);
                                    } else {
                                        ciVar.aB(aaca.INNERTUBE_RETRY);
                                        twrVarI = twrVar;
                                        i3 = 4;
                                    }
                                } catch (wno e3) {
                                    e = e3;
                                    th = e;
                                    ((agrc) ((agrc) ((agrc) d.c()).j(th)).k("com/google/android/libraries/youtube/notification/registration/YouTubeNotificationRegistrar", "registerWithInnerTubeBlocking", (char) 215, "YouTubeNotificationRegistrar.java")).t("Could not register for notifications with InnerTube: ");
                                    zB = twrVar.b();
                                    ciVar = this.n;
                                    if (zB) {
                                        ciVar.aB(aaca.INNERTUBE_FAILED);
                                        z = z4;
                                        h(z);
                                    } else {
                                        ciVar.aB(aaca.INNERTUBE_RETRY);
                                        twrVarI = twrVar;
                                        i3 = 4;
                                    }
                                }
                            }
                            twrVar = twrVarI;
                            try {
                                ahng.g(arrayList).c(new tpo(15), MoreExecutors.directExecutor()).get();
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                            } catch (ExecutionException unused2) {
                                ((agrc) ((agrc) aabu.a.b()).k("com/google/android/libraries/youtube/notification/push/util/NotificationUtils", "saveNotificationState", 108, "NotificationUtils.java")).t("Failed to store notification settings to disk");
                            }
                            this.n.aB(aaca.INNERTUBE_SUCCESS);
                            h(false);
                            try {
                                taf.b(this.f.m(new Date().getTime()), new xwx(14));
                            } catch (Exception e4) {
                                ((agrc) ((agrc) ((agrc) d.b()).j(e4)).k("com/google/android/libraries/youtube/notification/registration/YouTubeNotificationRegistrar", "registerBlocking", (char) 253, "YouTubeNotificationRegistrar.java")).t("Failed to store the timestamp");
                            }
                        } else {
                            twrVar = twrVarI;
                            ahng.g(arrayList).c(new tpo(15), MoreExecutors.directExecutor()).get();
                            this.n.aB(aaca.INNERTUBE_SUCCESS);
                            h(false);
                            taf.b(this.f.m(new Date().getTime()), new xwx(14));
                        }
                    } catch (IllegalStateException | wno e5) {
                        e = e5;
                        twrVar = twrVarI;
                    }
                    ciVar.aB(aaca.INNERTUBE_RETRY);
                    twrVarI = twrVar;
                    i3 = 4;
                }
            }
            h(z);
        } else {
            z = true;
            h(z);
        }
        i();
    }
}
