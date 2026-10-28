package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aaci {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/notification/topic/GcmTopicNotificationInvalidationService");
    public final aabz b;
    public final Map c;
    public final Executor d;
    public String e;
    public final AtomicInteger f;
    public final zhg g;
    private final ScheduledExecutorService h;
    private final awmd i;
    private final vyo j;

    public aaci(aabz aabzVar, zhg zhgVar, ScheduledExecutorService scheduledExecutorService, Executor executor, awmd awmdVar, vyo vyoVar) {
        aabzVar.getClass();
        this.b = aabzVar;
        this.g = zhgVar;
        this.c = new HashMap();
        scheduledExecutorService.getClass();
        this.h = scheduledExecutorService;
        this.d = executor;
        this.i = awmdVar;
        this.j = vyoVar;
        this.f = new AtomicInteger();
        d();
    }

    public static String a(String str) {
        return (TextUtils.isEmpty(str) || str.startsWith("/topics/")) ? str : "/topics/".concat(String.valueOf(str));
    }

    public final Collection b() {
        taq.d();
        ArrayList arrayList = new ArrayList(this.c.values());
        Collections.sort(arrayList, new rit(10));
        return arrayList;
    }

    public final void c(String str, amfn amfnVar) {
        taq.d();
        if (TextUtils.isEmpty(str)) {
            ((agrc) ((agrc) a.c()).k("com/google/android/libraries/youtube/notification/topic/GcmTopicNotificationInvalidationService", "onReceiveMainThread", 188, "GcmTopicNotificationInvalidationService.java")).t("Do not know how to handle a received topic invalidation for a null or empty topic.");
            return;
        }
        awmd awmdVar = this.i;
        vyo vyoVar = this.j;
        aaal.a(awmdVar, "RECEIVED", vyoVar);
        aach aachVar = (aach) this.c.get(str);
        if (aachVar == null) {
            ((agrc) ((agrc) a.c()).k("com/google/android/libraries/youtube/notification/topic/GcmTopicNotificationInvalidationService", "onReceiveMainThread", 201, "GcmTopicNotificationInvalidationService.java")).w("No listeners for GCM topic: %s", str);
            return;
        }
        ahno.O(TextUtils.equals(aachVar.b, str));
        aihf aihfVarCreateBuilder = amfl.a.createBuilder();
        if (!TextUtils.isEmpty(str) && str.startsWith("/topics/")) {
            str = str.substring(8);
        }
        aihfVarCreateBuilder.copyOnWrite();
        amfl amflVar = (amfl) aihfVarCreateBuilder.instance;
        str.getClass();
        amflVar.b |= 4;
        amflVar.e = str;
        aachVar.d.execute(new yag((Object) new HashSet(aachVar.c), (Object) ((amfl) aihfVarCreateBuilder.build()), (Object) amfnVar, 14, (short[]) null));
        aaal.a(awmdVar, "MAPPED", vyoVar);
    }

    public final void d() {
        if (f()) {
            return;
        }
        this.e = (String) ((agfa) this.b.c()).a;
        if (!f()) {
            this.h.schedule(new ztg(this, 16), 3L, TimeUnit.SECONDS);
            return;
        }
        ztg ztgVar = new ztg(this, 17);
        if (a.x()) {
            ztgVar.run();
        } else {
            this.d.execute(ztgVar);
        }
    }

    public final void e() {
        taq.d();
        for (aach aachVar : b()) {
            String str = this.e;
            str.getClass();
            aachVar.f = str;
            if (aachVar.g == 4) {
                aachVar.a();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.CharSequence, java.lang.Object] */
    public final boolean f() {
        return !TextUtils.isEmpty(this.e) && TextUtils.equals(this.e, ((agfa) this.b.c()).a);
    }
}
