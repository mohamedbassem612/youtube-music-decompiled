package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class yai extends BroadcastReceiver {
    final /* synthetic */ yam a;

    public yai(yam yamVar) {
        this.a = yamVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction() != null) {
            String action = intent.getAction();
            xvf xvfVar = (xvf) Enum.valueOf(xvf.class, action.substring(action.lastIndexOf(".") + 1));
            xvu xvuVar = xvu.ADD_VIDEO;
            String str = xyw.a;
            int iOrdinal = xvfVar.ordinal();
            if (iOrdinal == 7) {
                this.a.t(xyq.NETWORK, amyu.MDX_SESSION_DISCONNECT_REASON_NOT_ONLINE, 0);
                return;
            }
            if (iOrdinal == 11) {
                yam yamVar = this.a;
                if (!yamVar.an.i()) {
                    yamVar.t(xyq.NETWORK, amyu.MDX_SESSION_DISCONNECT_REASON_NOT_ONLINE, 0);
                } else if (yamVar.n.d(yamVar.s.n().k)) {
                    yamVar.t(xyq.LOUNGE_SERVER_CONNECTION_ERROR, amyu.MDX_SESSION_DISCONNECT_REASON_CLOUD_CHANNEL_NETWORK_ERROR, 2);
                } else {
                    yamVar.t(xyq.NETWORK, amyu.MDX_SESSION_DISCONNECT_REASON_NETWORK_CHANGED, 0);
                }
            }
        }
    }
}
