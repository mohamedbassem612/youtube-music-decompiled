package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aaaj implements twn {
    public final adtv a;
    public final Map b;
    public final Handler c;
    public final aaci d;
    public final xxj e;
    public final xxj f;

    public aaaj(adtv adtvVar, aaci aaciVar, xxj xxjVar) {
        adtvVar.getClass();
        this.a = adtvVar;
        this.d = aaciVar;
        this.e = new xxj(this);
        this.b = new HashMap();
        this.f = xxjVar;
        this.c = new Handler(Looper.getMainLooper());
    }

    public static String a(amfl amflVar) {
        if (!amflVar.e.isEmpty()) {
            return agyg.f.f().j(amflVar.e.getBytes(StandardCharsets.UTF_8));
        }
        String hexString = Integer.toHexString(amflVar.c);
        return String.valueOf(hexString).concat(agyg.f.f().j(amflVar.d.G()));
    }

    public final void b() {
        Map map = this.b;
        synchronized (map) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                amfj amfjVar = (amfj) aawb.ag((acjx) it.next(), amfj.class);
                amfjVar.getClass();
                amfl amflVar = amfjVar.c;
                if (amflVar == null) {
                    amflVar = amfl.a;
                }
                synchronized (map) {
                    try {
                        this.a.az(a(amflVar));
                        map.remove(a(amflVar));
                        aaci aaciVar = this.d;
                        xxj xxjVar = this.e;
                        taq.d();
                        if (xxjVar == null) {
                            ((agrc) ((agrc) aaci.a.c()).k("com/google/android/libraries/youtube/notification/topic/GcmTopicNotificationInvalidationService", "unsubscribe", 147, "GcmTopicNotificationInvalidationService.java")).t("Cannot unsubscribeAll a null listener.");
                        } else if (amflVar == null || amflVar.e.isEmpty()) {
                            ((agrc) ((agrc) aaci.a.c()).k("com/google/android/libraries/youtube/notification/topic/GcmTopicNotificationInvalidationService", "unsubscribe", 152, "GcmTopicNotificationInvalidationService.java")).t("Cannot unsubscribeAll from a null invalidation ID or from without a topic.");
                        } else {
                            String strA = aaci.a(amflVar.e);
                            Map map2 = aaciVar.c;
                            if (map2.containsKey(strA)) {
                                aach aachVar = (aach) map2.get(strA);
                                Set set = aachVar.c;
                                set.remove(xxjVar);
                                if (aachVar.g == 2 && set.isEmpty()) {
                                    aachVar.b();
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    @Override // defpackage.twn
    public final void i() {
        b();
    }
}
