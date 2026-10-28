package defpackage;

import android.content.Context;
import com.google.firebase.iid.FirebaseInstanceId;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aabx extends aacd {
    private static final agrf d = agrf.h("com/google/android/libraries/youtube/notification/registration/FcmNotificationRegistrarV2");
    private final aaas e;
    private final vyo f;
    private volatile boolean g;
    private final ci h;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [awmd, java.lang.Object] */
    public aabx(aaas aaasVar, aapw aapwVar, ScheduledExecutorService scheduledExecutorService, wjr wjrVar, hld hldVar, Context context, vyo vyoVar, mbc mbcVar, tfq tfqVar, abxv abxvVar, ci ciVar, afft afftVar) {
        aaas aaasVar2 = (aaas) abxvVar.a.io();
        aaasVar2.getClass();
        Context context2 = (Context) abxvVar.b.io();
        context2.getClass();
        mbc mbcVar2 = (mbc) abxvVar.d.io();
        mbcVar2.getClass();
        vyo vyoVar2 = (vyo) abxvVar.c.io();
        vyoVar2.getClass();
        super(aaasVar, aapwVar, scheduledExecutorService, wjrVar, hldVar, context, mbcVar, tfqVar, new axfd(hldVar, aaasVar2, context2, mbcVar2, vyoVar2), ciVar, afftVar);
        this.e = aaasVar;
        this.f = vyoVar;
        this.h = ciVar;
    }

    private final boolean h(String str) {
        if (ahno.aa(str)) {
            return false;
        }
        try {
            taf.c(this.e.l(str), new xwx(13), 30L, TimeUnit.SECONDS);
            this.g = true;
        } catch (Exception e) {
            ((agrc) ((agrc) ((agrc) d.c()).j(e)).k("com/google/android/libraries/youtube/notification/registration/FcmNotificationRegistrarV2", "persistRegistrationId", 'w', "FcmNotificationRegistrarV2.java")).t("Failed to save registration Id for some unknown reason");
            this.g = false;
        }
        return this.g;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0068  */
    @Override // defpackage.aacd
    public final agev a() {
        twr twrVarI;
        ArrayList arrayList;
        agev agevVarH;
        alik alikVarB = this.f.b();
        if (alikVarB == null) {
            twrVarI = this.c.i();
        } else {
            aode aodeVar = alikVarB.p;
            if (aodeVar == null) {
                aodeVar = aode.a;
            }
            aodc aodcVar = aodeVar.c;
            if (aodcVar == null) {
                aodcVar = aodc.a;
            }
            if ((aodcVar.b & 8) != 0) {
                aode aodeVar2 = alikVarB.p;
                if (aodeVar2 == null) {
                    aodeVar2 = aode.a;
                }
                aodc aodcVar2 = aodeVar2.c;
                if (aodcVar2 == null) {
                    aodcVar2 = aodc.a;
                }
                akxd akxdVar = aodcVar2.c;
                if (akxdVar == null) {
                    akxdVar = akxd.a;
                }
                int i = akxdVar.b;
                twrVarI = ((i & 1) == 0 || (i & 2) == 0 || (i & 4) == 0 || (i & 8) == 0 || (i & 16) == 0) ? this.c.i() : this.c.j(new twq(akxdVar.c, akxdVar.d, akxdVar.e, akxdVar.f, akxdVar.g));
            } else {
                twrVarI = this.c.i();
            }
        }
        twr twrVar = twrVarI;
        while (true) {
            try {
                synchronized (ahnr.a) {
                    arrayList = new ArrayList(ahnr.b.values());
                }
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        agevVarH = agdf.a;
                        break;
                    }
                    if ("[DEFAULT]".equals(((ahnr) it.next()).g())) {
                        ahnr ahnrVarB = ahnr.b();
                        agevVarH = agev.h(FirebaseInstanceId.getInstance(ahnrVarB).d(a.g(ahnrVarB), "*"));
                        break;
                    }
                }
                if (agevVarH.g()) {
                    agevVarH.c();
                    this.h.aB(aaca.FCM_SUCCESS);
                    return !h((String) agevVarH.c()) ? agdf.a : agevVarH;
                }
                if (!twrVar.b()) {
                    ((agrc) ((agrc) d.b()).k("com/google/android/libraries/youtube/notification/registration/FcmNotificationRegistrarV2", "registerAndSaveToken", 168, "FcmNotificationRegistrarV2.java")).t("Given up trying to get FCM Registration Id");
                    zvp.a(zvn.b, zvm.h, "Internal FCM error. Given up trying to get FCM Registration Id");
                    this.h.aB(aaca.FCM_FAILED);
                    return agdf.a;
                }
                this.h.aB(aaca.FCM_RETRY);
            } catch (IOException e) {
                if (!twrVar.b()) {
                    ((agrc) ((agrc) ((agrc) d.b()).j(e)).k("com/google/android/libraries/youtube/notification/registration/FcmNotificationRegistrarV2", "registerAndSaveToken", (char) 184, "FcmNotificationRegistrarV2.java")).t("Given up trying to get FCM Registration Id: ");
                    zvp.b(zvn.b, zvm.h, "Too many attempts. Given up trying to get FCM Registration Id", e);
                    this.h.aB(aaca.FCM_FAILED);
                    return agdf.a;
                }
                zvp.b(zvn.a, zvm.h, "Failed to register FCM, retriable error", e);
                this.h.aB(aaca.FCM_RETRY);
            } catch (RuntimeException e2) {
                ((agrc) ((agrc) ((agrc) d.b()).j(e2)).k("com/google/android/libraries/youtube/notification/registration/FcmNotificationRegistrarV2", "registerAndSaveToken", (char) 198, "FcmNotificationRegistrarV2.java")).t("Could not register with FCM (Unrecoverable Error): ");
                zvp.b(zvn.b, zvm.h, "Could not register with FCM (Unrecoverable Error)", e2);
                this.h.aB(aaca.FCM_FAILED);
                return agdf.a;
            }
        }
    }

    @Override // defpackage.aabz
    public final void b(String str) {
        String strS = this.e.s();
        if (h(str) && !str.equals(strS)) {
            d(aaby.c);
        }
        boolean z = this.g;
    }
}
