package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import defpackage.dmc;
import defpackage.dmh;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class MultiInstanceInvalidationService extends Service {
    public int a;
    public final Map b = new LinkedHashMap();
    public final RemoteCallbackList c = new dmh(this);
    private final dmc d = new dmc(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        return this.d;
    }
}
