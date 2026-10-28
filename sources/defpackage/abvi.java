package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abvi extends BroadcastReceiver {
    public boolean a;
    public final /* synthetic */ abvk b;
    private Handler c;

    public abvi(abvk abvkVar) {
        this.b = abvkVar;
    }

    public final void a() {
        abvk abvkVar = this.b;
        if (abmt.r(abvkVar.i.a).C) {
            return;
        }
        if (this.c == null) {
            this.c = new Handler();
        }
        if (this.a) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        abvkVar.a.registerReceiver(this, intentFilter);
        this.a = true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [acey, java.lang.Object] */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!"android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            this.c.removeCallbacksAndMessages(null);
            return;
        }
        abvk abvkVar = this.b;
        ?? r0 = abvkVar.o.d;
        String strP = r0 != 0 ? r0.p() : null;
        if (abvkVar.r.k() || abvkVar.c.h(strP).b <= 0) {
            return;
        }
        this.c.postDelayed(new abbj(this, 18), 180000L);
    }
}
