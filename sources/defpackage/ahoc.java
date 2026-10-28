package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahoc implements ahoa {
    public static volatile ahoa a;
    final AppMeasurementSdk b;

    public ahoc(AppMeasurementSdk appMeasurementSdk) {
        if (appMeasurementSdk == null) {
            throw new NullPointerException("null reference");
        }
        this.b = appMeasurementSdk;
        new ConcurrentHashMap();
    }

    @Override // defpackage.ahoa
    public final void a(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!ahod.a(str) || ahod.a.contains(str2)) {
            return;
        }
        agke agkeVar = ahod.b;
        int i = ((agpi) agkeVar).d;
        int i2 = 0;
        int i3 = 0;
        while (i3 < i) {
            boolean zContainsKey = bundle.containsKey((String) agkeVar.get(i3));
            i3++;
            if (zContainsKey) {
                return;
            }
        }
        if ("_cmp".equals(str2)) {
            if (!ahod.a(str)) {
                return;
            }
            while (i2 < i) {
                boolean zContainsKey2 = bundle.containsKey((String) agkeVar.get(i2));
                i2++;
                if (zContainsKey2) {
                    return;
                }
            }
            int iHashCode = str.hashCode();
            if (iHashCode != 101200) {
                if (iHashCode != 101230) {
                    if (iHashCode != 3142703 || !str.equals("fiam")) {
                        return;
                    } else {
                        bundle.putString("_cis", "fiam_integration");
                    }
                } else if (!str.equals("fdl")) {
                    return;
                } else {
                    bundle.putString("_cis", "fdl_integration");
                }
            } else if (!str.equals("fcm")) {
                return;
            } else {
                bundle.putString("_cis", "fcm_integration");
            }
        }
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1L);
        }
        this.b.logEvent(str, str2, bundle);
    }

    @Override // defpackage.ahoa
    public final void b(Object obj) {
        if (ahod.a("fcm")) {
            lay layVar = this.b.a;
            layVar.i(new kzw(layVar, obj));
        }
    }
}
