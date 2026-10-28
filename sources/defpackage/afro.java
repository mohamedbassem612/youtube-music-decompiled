package defpackage;

import android.app.Application;
import java.io.IOException;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class afro implements agek {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ afro(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.agek
    public final Object apply(Object obj) {
        int i = this.$cid;
        if (i != 0) {
            if (i == 1) {
                return ((ayq) this.a).b;
            }
            if (i == 2) {
                ((afry) this.a).i((Set) obj);
                return null;
            }
            if (i != 3) {
                Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) obj;
                activityLifecycleCallbacks.getClass();
                return new afvo((afvq) this.a, activityLifecycleCallbacks);
            }
            int i2 = afsl.g;
            afsb afsbVar = (afsb) this.a;
            Set set = afsbVar.a;
            long j = afsbVar.b;
            return null;
        }
        Long l = (Long) obj;
        afv afvVar = new afv();
        afsu afsuVar = afsu.a;
        Object obj2 = this.a;
        try {
            for (afst afstVar : ((afrr) obj2).a().d) {
                long jLongValue = afstVar.e;
                afsw afswVar = afstVar.c;
                if (afswVar == null) {
                    afswVar = afsw.a;
                }
                afsa afsaVar = new afsa(afswVar);
                if (jLongValue <= 0) {
                    jLongValue = l.longValue();
                }
                afvVar.put(afsaVar, Long.valueOf(jLongValue));
            }
            return afvVar;
        } catch (IOException e) {
            ((afrr) obj2).g(e);
            return afvVar;
        }
    }
}
