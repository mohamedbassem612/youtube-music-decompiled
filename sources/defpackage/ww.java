package defpackage;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.HandlerThread;
import androidx.car.app.AppManager$1;
import androidx.car.app.IAppHost;
import androidx.car.app.IAppManager;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ww implements za {
    public final xr a;
    public final IAppManager.Stub b;
    public final xv c;
    public final boc d;
    public final HandlerThread e = new HandlerThread("LocationUpdateThread");
    public final wu f = new LocationListener() { // from class: wu
        @Override // android.location.LocationListener
        public final /* synthetic */ void onLocationChanged(List list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                onLocationChanged((Location) list.get(i));
            }
        }

        @Override // android.location.LocationListener
        public final void onLocationChanged(final Location location) {
            this.a.c.a("app", "sendLocation", new xs() { // from class: wt
                @Override // defpackage.xs
                public final void a(Object obj) {
                    ((IAppHost) obj).sendLocation(location);
                }
            });
        }

        @Override // android.location.LocationListener
        public final /* synthetic */ void onFlushComplete(int i) {
        }

        @Override // android.location.LocationListener
        public final /* synthetic */ void onProviderDisabled(String str) {
        }

        @Override // android.location.LocationListener
        public final /* synthetic */ void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public final /* synthetic */ void onStatusChanged(String str, int i, Bundle bundle) {
        }
    };

    /* JADX WARN: Type inference failed for: r1v2, types: [wu] */
    protected ww(xr xrVar, xv xvVar, boc bocVar) {
        this.a = xrVar;
        this.c = xvVar;
        this.d = bocVar;
        this.b = new AppManager$1(this, xrVar);
    }

    public final void a() {
        this.c.a("app", "invalidate", new xl(1));
    }

    public final void b() {
        ((LocationManager) this.a.getSystemService("location")).removeUpdates(this.f);
    }
}
