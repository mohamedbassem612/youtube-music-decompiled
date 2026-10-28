package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jmr implements accz {
    public WeakReference b;
    private final Context c;
    private final acda d;
    private final acag e;
    private final ycp g;
    final BroadcastReceiver a = new jmq(this);
    private boolean f = false;

    public jmr(Context context, acda acdaVar, abvn abvnVar, ycp ycpVar) {
        this.c = context;
        this.d = acdaVar;
        this.e = abvnVar.v();
        this.g = ycpVar;
    }

    public final void a() {
        WeakReference weakReference = this.b;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        ((get) ((hhb) this.b.get()).a).j.z();
    }

    @Override // defpackage.accz
    public final void b(float f) {
        acca accaVar;
        yco ycoVar = this.g.e;
        if (ycoVar == null || (accaVar = this.e.n) == null) {
            return;
        }
        ycoVar.ae(accaVar);
    }

    @tcc
    public void handleMdxPlaybackChangedEvent(xyt xytVar) {
        WeakReference weakReference;
        WeakReference weakReference2 = this.b;
        if (weakReference2 == null || weakReference2.get() == null || !((get) ((hhb) this.b.get()).a).j.Z() || !xytVar.a.d() || xytVar.b != 1 || (weakReference = this.b) == null || weakReference.get() == null) {
            return;
        }
        ((get) ((hhb) this.b.get()).a).j.N();
    }

    @tcc
    public void handleYouTubeMediaRouteSelectionChangedEvent(xse xseVar) {
        boolean z;
        xsc xscVar = xseVar.a;
        boolean z2 = this.f;
        if (xscVar != null) {
            z = true;
            if (!z2) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("com.google.android.libraries.youtube.player.action.controller_notification_close");
                intentFilter.addAction("android.intent.action.MEDIA_BUTTON");
                avg.f(this.c, this.a, intentFilter, null, 2);
                this.d.e(this);
            }
        } else {
            z = false;
            if (z2) {
                this.c.unregisterReceiver(this.a);
                this.d.f(this);
            }
        }
        this.f = z;
    }

    @Override // defpackage.accz
    public final void jN(accp accpVar) {
        acca accaVar;
        yco ycoVar = this.g.e;
        if (ycoVar == null || (accaVar = this.e.n) == null) {
            return;
        }
        ycoVar.ae(accaVar);
    }
}
