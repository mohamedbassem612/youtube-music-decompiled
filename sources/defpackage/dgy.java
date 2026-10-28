package defpackage;

import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$TransferCallback;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dgy extends MediaRouter2$TransferCallback {
    final /* synthetic */ dgz a;

    public dgy(dgz dgzVar) {
        this.a = dgzVar;
    }

    public final void onStop(MediaRouter2.RoutingController routingController) {
        dgz dgzVar = this.a;
        dgzVar.d = null;
        dhn dhnVar = (dhn) dgzVar.b.remove(routingController);
        if (dhnVar == null) {
            Objects.toString(routingController);
            Log.w("MR2Provider", "onStop: No matching routeController found. routingController=".concat(String.valueOf(routingController)));
        } else {
            hhb hhbVar = dgzVar.e;
            if (dhnVar == ((dgr) hhbVar.a).f) {
                hhbVar.s(2, 2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0022  */
    public final void onTransfer(MediaRouter2.RoutingController routingController, MediaRouter2.RoutingController routingController2) {
        dii diiVar;
        int i = 2;
        if (Build.VERSION.SDK_INT >= 35) {
            int transferReason = routingController2.getRoutingSessionInfo().getTransferReason();
            if (transferReason == 2) {
                i = 1;
            } else if (transferReason != 1) {
                i = transferReason == 0 ? 3 : 0;
            }
        } else if (this.a.d != null) {
            i = 1;
        }
        dgz dgzVar = this.a;
        dgzVar.d = null;
        Map map = dgzVar.b;
        map.remove(routingController);
        if (routingController2 == dgzVar.a.getSystemController()) {
            dgzVar.e.s(3, i);
            return;
        }
        List selectedRoutes = routingController2.getSelectedRoutes();
        if (selectedRoutes.isEmpty()) {
            Log.w("MR2Provider", "Selected routes are empty. This shouldn't happen.");
            return;
        }
        String id = aaj$$ExternalSyntheticApiModelOutline0.m28m(selectedRoutes.get(0)).getId();
        map.put(routingController2, new dgu(dgzVar, routingController2, id));
        dgr dgrVar = (dgr) dgzVar.e.a;
        ArrayList<dii> arrayList = dgrVar.j;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                diiVar = null;
                break;
            }
            diiVar = (dii) it.next();
            if (diiVar.d() == dgrVar.o && TextUtils.equals(id, diiVar.c)) {
                break;
            }
        }
        if (diiVar == null) {
            ArrayList arrayList2 = new ArrayList();
            for (dii diiVar2 : arrayList) {
                if (diiVar2.d() == dgrVar.o) {
                    arrayList2.add(diiVar2.c);
                }
            }
            Log.w("AxMediaRouter", "onSelectRoute: The target RouteInfo is not found for descriptorId=" + id + ". Available ids=" + arrayList2);
        } else {
            dgrVar.n(diiVar, 3, i, true);
        }
        dgzVar.g(routingController2);
    }

    public final void onTransferFailure(MediaRoute2Info mediaRoute2Info) {
        this.a.d = null;
        Objects.toString(mediaRoute2Info);
        Log.w("MR2Provider", "Transfer failed. requestedRoute=".concat(String.valueOf(mediaRoute2Info)));
    }
}
