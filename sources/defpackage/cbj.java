package defpackage;

import android.content.Context;
import android.media.MediaRouter2;
import android.media.MediaRouter2$ControllerCallback;
import android.media.MediaRouter2$RouteCallback;
import android.media.RouteDiscoveryPreference;
import android.os.Looper;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cbj implements cdx {
    public static final RouteDiscoveryPreference a = new RouteDiscoveryPreference.Builder(agpi.a, false).build();
    public MediaRouter2 b;
    public MediaRouter2$RouteCallback c;
    public MediaRouter2$ControllerCallback d;
    public bvc e;

    public static boolean c(MediaRouter2 mediaRouter2) {
        mediaRouter2.getClass();
        int transferReason = mediaRouter2.getSystemController().getRoutingSessionInfo().getTransferReason();
        boolean zWasTransferInitiatedBySelf = mediaRouter2.getSystemController().wasTransferInitiatedBySelf();
        Iterator it = mediaRouter2.getSystemController().getSelectedRoutes().iterator();
        while (it.hasNext()) {
            int suitabilityStatus = aaj$$ExternalSyntheticApiModelOutline0.m28m(it.next()).getSuitabilityStatus();
            if (suitabilityStatus == 1) {
                if (transferReason == 1 || transferReason == 2) {
                    if (zWasTransferInitiatedBySelf) {
                        return true;
                    }
                }
            } else if (suitabilityStatus == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cdx
    public final void a() {
        bvc bvcVar = this.e;
        bvcVar.getClass();
        bvcVar.b(new bkn(this, 6));
    }

    @Override // defpackage.cdx
    public final boolean b() {
        bvc bvcVar = this.e;
        if (bvcVar == null) {
            return true;
        }
        return ((Boolean) bvcVar.a()).booleanValue();
    }

    @Override // defpackage.cdx
    public final void d(qcb qcbVar, Context context, Looper looper, Looper looper2, bvd bvdVar) {
        bvc bvcVar = new bvc(Boolean.TRUE, looper2, looper, bvdVar, new cbk(qcbVar, 1));
        this.e = bvcVar;
        bvcVar.b(new blq((Object) this, (Object) context, 14, (byte[]) null));
    }
}
