package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class boj extends Service implements bog {
    private final aeiv a = new aeiv(this);

    @Override // defpackage.bog
    public final boc getLifecycle() {
        return (boc) this.a.b;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        this.a.y(boa.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.a.y(boa.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        aeiv aeivVar = this.a;
        aeivVar.y(boa.ON_STOP);
        aeivVar.y(boa.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        this.a.y(boa.ON_START);
        super.onStart(intent, i);
    }
}
