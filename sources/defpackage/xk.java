package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.car.app.AppInfo;
import androidx.car.app.CarAppBinder;
import androidx.car.app.SessionInfo;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class xk extends Service {
    public final Map a = new HashMap();
    public xx b;
    private AppInfo c;

    public final AppInfo a() {
        AppInfo appInfo = this.c;
        if (appInfo != null) {
            return appInfo;
        }
        AppInfo appInfoCreate = AppInfo.create(this);
        this.c = appInfoCreate;
        return appInfoCreate;
    }

    public abstract afj b();

    public yd c() {
        throw null;
    }

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(fileDescriptor, printWriter, strArr);
        if (strArr != null) {
            for (String str : strArr) {
                if ("AUTO_DRIVE".equals(str)) {
                    afi.b(new mc(this, 16, null));
                }
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        CarAppBinder carAppBinder;
        SessionInfo sessionInfoJ = we.k(intent) ? we.j(intent) : SessionInfo.DEFAULT_SESSION_INFO;
        Map map = this.a;
        synchronized (map) {
            if (!map.containsKey(sessionInfoJ)) {
                map.put(sessionInfoJ, new CarAppBinder(this, sessionInfoJ));
            }
            carAppBinder = (CarAppBinder) map.get(sessionInfoJ);
            carAppBinder.getClass();
        }
        return carAppBinder;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        Map map = this.a;
        synchronized (map) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((CarAppBinder) it.next()).destroy();
            }
            map.clear();
        }
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        afi.b(new bg((Object) this, (Object) (we.k(intent) ? we.j(intent) : SessionInfo.DEFAULT_SESSION_INFO), 14, (byte[]) null));
        return true;
    }
}
