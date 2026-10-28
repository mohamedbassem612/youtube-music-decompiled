package defpackage;

import android.app.Activity;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class actf implements awqg {
    private final /* synthetic */ int $cid;

    public /* synthetic */ actf(int i) {
        this.$cid = i;
    }

    @Override // defpackage.awqg
    public final Object invoke(Object obj) {
        switch (this.$cid) {
            case 0:
                String str = actj.a;
                twu.d("ReelMuteController", 6, "Failed to commit mute entity", (Throwable) obj);
                return awmy.a;
            case 1:
                String str2 = actj.a;
                twu.d("ReelMuteController", 6, "Error in volume processing", (Throwable) obj);
                return awmy.a;
            case 2:
                String str3 = actj.a;
                twu.d("ReelMuteController", 6, "Error in entity observation", (Throwable) obj);
                return awmy.a;
            case 3:
                Long l = (Long) obj;
                l.getClass();
                return Boolean.valueOf(l.longValue() <= 0);
            case 4:
                String str4 = ((aqhl) obj).e;
                str4.getClass();
                return str4;
            case 5:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                return Boolean.valueOf(!bool.booleanValue());
            case 6:
                Activity activity = (Activity) obj;
                activity.getClass();
                return activity.getIntent();
            case 7:
                Activity activity2 = (Activity) obj;
                activity2.getClass();
                return Boolean.valueOf(activity2.isFinishing());
            case 8:
                Activity activity3 = (Activity) obj;
                activity3.getClass();
                return Boolean.valueOf(activity3.isChangingConfigurations());
            case 9:
                syn synVar = afnp.m;
                ((Exception) obj).getClass();
                return Boolean.FALSE;
            case 10:
                syn synVar2 = afnp.m;
                return ahng.n(Boolean.TRUE);
            case 11:
                bhj bhjVar = (bhj) obj;
                long j = 0;
                for (Map.Entry entry : bhjVar.c().entrySet()) {
                    if (entry.getValue() instanceof Set) {
                        bhi bhiVar = (bhi) entry.getKey();
                        Set set = (Set) entry.getValue();
                        String strH = ahrg.h(System.currentTimeMillis());
                        if (set.contains(strH)) {
                            Object[] objArr = {strH};
                            HashSet hashSet = new HashSet(1);
                            Object obj2 = objArr[0];
                            obj2.getClass();
                            if (!hashSet.add(obj2)) {
                                Objects.toString(obj2);
                                throw new IllegalArgumentException("duplicate element: ".concat(obj2.toString()));
                            }
                            bhjVar.e(bhiVar, DesugarCollections.unmodifiableSet(hashSet));
                            j++;
                        } else {
                            bhjVar.g(bhiVar);
                        }
                    }
                }
                if (j == 0) {
                    bhjVar.g(ahrg.b);
                } else {
                    bhjVar.e(ahrg.b, Long.valueOf(j));
                }
                break;
            case 12:
                Iterable iterable = (Iterable) obj;
                iterable.getClass();
                return iterable.iterator();
            case 13:
                return obj;
            case 14:
                return Boolean.valueOf(obj == null);
            default:
                int i = axdi.a;
                break;
        }
        return null;
    }
}
