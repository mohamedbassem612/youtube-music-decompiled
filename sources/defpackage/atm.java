package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class atm extends Service {
    public static final Object a = new Object();
    public static final HashMap b = new HashMap();
    ati c;
    atk d;

    protected abstract void a();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        atk atkVar = this.d;
        if (atkVar != null) {
            return atkVar.getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.d = new atk(this);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }
}
