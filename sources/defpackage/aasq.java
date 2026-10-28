package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Environment;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aasq extends BroadcastReceiver {
    private volatile boolean b = Environment.getExternalStorageState().equals("mounted");
    public aasp a = null;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.b = "android.intent.action.MEDIA_MOUNTED".equals(intent.getAction());
        boolean z = this.b;
        aasp aaspVar = this.a;
        if (aaspVar != null) {
            aaspVar.h();
        }
    }
}
