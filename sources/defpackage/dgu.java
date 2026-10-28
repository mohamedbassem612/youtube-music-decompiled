package defpackage;

import android.content.Intent;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dgu extends dhk {
    final String a;
    final MediaRouter2.RoutingController b;
    final Messenger c;
    final Messenger d;
    final Handler f;
    dhg i;
    final /* synthetic */ dgz j;
    final SparseArray e = new SparseArray();
    final AtomicInteger g = new AtomicInteger(1);
    private final Runnable o = new cqc(this, 12);
    public int h = -1;

    public dgu(dgz dgzVar, MediaRouter2.RoutingController routingController, String str) {
        Bundle controlHints;
        this.j = dgzVar;
        this.b = routingController;
        this.a = str;
        Messenger messenger = (routingController == null || (controlHints = routingController.getControlHints()) == null) ? null : (Messenger) controlHints.getParcelable("androidx.mediarouter.media.KEY_MESSENGER");
        this.c = messenger;
        this.d = messenger != null ? new Messenger(new dgt(this)) : null;
        this.f = new Handler(Looper.getMainLooper());
    }

    private final void o() {
        Handler handler = this.f;
        Runnable runnable = this.o;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, 1000L);
    }

    @Override // defpackage.dhk
    public final void a(String str) {
        if (str == null || str.isEmpty()) {
            Log.w("MR2Provider", "onAddMemberRoute: Ignoring null or empty routeId.");
            return;
        }
        MediaRoute2Info mediaRoute2InfoA = this.j.a(str);
        if (mediaRoute2InfoA == null) {
            Log.w("MR2Provider", "onAddMemberRoute: Specified route not found. routeId=".concat(str));
        } else {
            this.b.selectRoute(mediaRoute2InfoA);
        }
    }

    @Override // defpackage.dhn
    public final void b() {
        this.b.release();
    }

    @Override // defpackage.dhk
    public final void c(String str) {
        if (str == null || str.isEmpty()) {
            Log.w("MR2Provider", "onRemoveMemberRoute: Ignoring null or empty routeId.");
            return;
        }
        MediaRoute2Info mediaRoute2InfoA = this.j.a(str);
        if (mediaRoute2InfoA == null) {
            Log.w("MR2Provider", "onRemoveMemberRoute: Specified route not found. routeId=".concat(str));
        } else {
            this.b.deselectRoute(mediaRoute2InfoA);
        }
    }

    @Override // defpackage.dhn
    public final void d(int i) {
        MediaRouter2.RoutingController routingController = this.b;
        if (routingController != null) {
            routingController.setVolume(i);
            this.h = i;
            o();
        }
    }

    @Override // defpackage.dhk
    public final void e(List list) {
        if (list == null || list.isEmpty()) {
            Log.w("MR2Provider", "onUpdateMemberRoutes: Ignoring null or empty routeIds.");
            return;
        }
        String str = (String) list.get(0);
        dgz dgzVar = this.j;
        MediaRoute2Info mediaRoute2InfoA = dgzVar.a(str);
        if (mediaRoute2InfoA == null) {
            Log.w("MR2Provider", "onUpdateMemberRoutes: Specified route not found. routeId=".concat(String.valueOf(str)));
        } else {
            dgzVar.a.transferTo(mediaRoute2InfoA);
        }
    }

    @Override // defpackage.dhn
    public final void f(int i) {
        MediaRouter2.RoutingController routingController = this.b;
        if (routingController != null) {
            int volume = this.h;
            if (volume < 0) {
                volume = routingController.getVolume();
            }
            int iMax = Math.max(0, Math.min(volume + i, routingController.getVolumeMax()));
            this.h = iMax;
            routingController.setVolume(iMax);
            o();
        }
    }

    final void g(String str, int i) {
        Messenger messenger;
        MediaRouter2.RoutingController routingController = this.b;
        if (routingController == null || routingController.isReleased() || (messenger = this.c) == null) {
            return;
        }
        int andIncrement = this.g.getAndIncrement();
        Message messageObtain = Message.obtain();
        messageObtain.what = 7;
        messageObtain.arg1 = andIncrement;
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i);
        bundle.putString("routeId", str);
        messageObtain.setData(bundle);
        messageObtain.replyTo = this.d;
        try {
            messenger.send(messageObtain);
        } catch (DeadObjectException unused) {
        } catch (RemoteException e) {
            Log.e("MR2Provider", "Could not send control request to service.", e);
        }
    }

    final void h(String str, int i) {
        Messenger messenger;
        MediaRouter2.RoutingController routingController = this.b;
        if (routingController == null || routingController.isReleased() || (messenger = this.c) == null) {
            return;
        }
        int andIncrement = this.g.getAndIncrement();
        Message messageObtain = Message.obtain();
        messageObtain.what = 8;
        messageObtain.arg1 = andIncrement;
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i);
        bundle.putString("routeId", str);
        messageObtain.setData(bundle);
        messageObtain.replyTo = this.d;
        try {
            messenger.send(messageObtain);
        } catch (DeadObjectException unused) {
        } catch (RemoteException e) {
            Log.e("MR2Provider", "Could not send control request to service.", e);
        }
    }

    @Override // defpackage.dhn
    public final boolean i(Intent intent, vy vyVar) {
        Messenger messenger;
        MediaRouter2.RoutingController routingController = this.b;
        if (routingController == null || routingController.isReleased() || (messenger = this.c) == null) {
            return false;
        }
        int andIncrement = this.g.getAndIncrement();
        Message messageObtain = Message.obtain();
        messageObtain.what = 9;
        messageObtain.arg1 = andIncrement;
        messageObtain.obj = intent;
        messageObtain.replyTo = this.d;
        try {
            messenger.send(messageObtain);
            if (vyVar != null) {
                this.e.put(andIncrement, vyVar);
            }
            return true;
        } catch (DeadObjectException unused) {
            return false;
        } catch (RemoteException e) {
            Log.e("MR2Provider", "Could not send control request to service.", e);
            return false;
        }
    }
}
