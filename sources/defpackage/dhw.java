package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dhw implements dhj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ dhw(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.dhj
    public final void a(dhk dhkVar, dhg dhgVar, Collection collection) {
        dhd dhdVar;
        int i = this.$cid;
        Object obj = this.a;
        if (i != 0) {
            dhe dheVar = ((dht) obj).a;
            synchronized (dheVar.a) {
                Iterator it = dheVar.c.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        dhdVar = null;
                        break;
                    } else {
                        dhdVar = (dhd) ((Map.Entry) it.next()).getValue();
                        if (dhdVar.b == dhkVar) {
                            break;
                        }
                    }
                }
            }
            if (dhdVar == null) {
                Log.w("AxMR2ProvdrSrvcAdapter", "setDynamicRouteDescriptor: Ignoring unknown controller");
                return;
            } else {
                dhdVar.c(dhgVar, collection);
                return;
            }
        }
        dhx dhxVar = (dhx) obj;
        SparseArray sparseArray = dhxVar.j;
        int iIndexOfValue = sparseArray.indexOfValue(dhkVar);
        if (iIndexOfValue < 0) {
            Objects.toString(dhkVar);
            Log.w("MediaRouteProviderSrv", "Ignoring unknown dynamic group route controller: ".concat(dhkVar.toString()));
            return;
        }
        int iKeyAt = sparseArray.keyAt(iIndexOfValue);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            dhi dhiVar = (dhi) it2.next();
            if (dhiVar.f == null) {
                dhiVar.f = new Bundle();
                dhiVar.f.putBundle("mrDescriptor", dhiVar.a.a);
                dhiVar.f.putInt("selectionState", dhiVar.b);
                dhiVar.f.putBoolean("isUnselectable", dhiVar.c);
                dhiVar.f.putBoolean("isGroupable", dhiVar.d);
                dhiVar.f.putBoolean("isTransferable", dhiVar.e);
            }
            arrayList.add(dhiVar.f);
        }
        Bundle bundle = new Bundle();
        if (dhgVar != null) {
            bundle.putParcelable("groupRoute", dhgVar.a);
        }
        bundle.putParcelableArrayList("dynamicRoutes", arrayList);
        dic.f(dhxVar.e, 7, 0, iKeyAt, bundle, null);
    }
}
