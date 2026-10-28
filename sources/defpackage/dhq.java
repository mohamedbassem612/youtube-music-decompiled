package defpackage;

import android.os.Bundle;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dhq {
    Bundle a;
    final List b;
    final boolean c;

    public dhq(List list, boolean z) {
        if (list.isEmpty()) {
            this.b = Collections.EMPTY_LIST;
        } else {
            this.b = DesugarCollections.unmodifiableList(new ArrayList(list));
        }
        this.c = z;
    }

    public static dhq a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("routes");
        if (parcelableArrayList != null) {
            for (int i = 0; i < parcelableArrayList.size(); i++) {
                arrayList.add(dhg.n((Bundle) parcelableArrayList.get(i)));
            }
        }
        return new dhq(arrayList, bundle.getBoolean("supportsDynamicGroupRoute", false));
    }

    public final boolean b() {
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            dhg dhgVar = (dhg) list.get(i);
            if (dhgVar == null || !dhgVar.y()) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return "MediaRouteProviderDescriptor{ routes=" + Arrays.toString(this.b.toArray()) + ", isValid=" + b() + " }";
    }
}
