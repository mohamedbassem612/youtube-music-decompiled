package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.mediarouter.media.MediaTransferReceiver;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dgj implements axp {
    @Override // defpackage.axp
    public final Object a(Object obj) {
        Context context = (Context) obj;
        Intent intent = new Intent(context, (Class<?>) MediaTransferReceiver.class);
        intent.setPackage(context.getPackageName());
        return Boolean.valueOf(!context.getPackageManager().queryBroadcastReceivers(intent, 0).isEmpty());
    }
}
