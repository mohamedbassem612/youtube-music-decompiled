package defpackage;

import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dhu extends dht {
    PackageManager c;

    @Override // defpackage.dhz
    public final dhq e(dhq dhqVar, String str) {
        if (dhqVar == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        List<dhg> list = dhqVar.b;
        arrayList.addAll(list);
        azs.D(Collections.EMPTY_LIST, arrayList);
        for (dhg dhgVar : list) {
            List list2 = dhgVar.c;
            if (!list2.isEmpty()) {
                if (this.c == null) {
                    this.c = this.d.getPackageManager();
                }
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((Set) it.next()).iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            String str2 = (String) it2.next();
                            if (this.c.checkPermission(str2, str) != 0) {
                                if ("android.permission.ACCESS_LOCAL_NETWORK".equals(str2)) {
                                    try {
                                        if (this.c.getApplicationInfo(str, 0).targetSdkVersion <= 36) {
                                        }
                                    } catch (PackageManager.NameNotFoundException unused) {
                                    }
                                }
                            }
                        }
                    }
                }
            }
            azs.C(dhgVar, arrayList);
        }
        return new dhq(arrayList, dhqVar.c);
    }
}
