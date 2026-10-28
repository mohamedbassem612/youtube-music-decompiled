package defpackage;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class kls extends afkg {
    final /* synthetic */ klt a;
    private final Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kls(klt kltVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), (byte[]) null);
        this.a = kltVar;
        this.b = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + message.what);
            return;
        }
        klt kltVar = this.a;
        Context context = this.b;
        int iM = kltVar.m(context, 17895000);
        boolean z = kml.a;
        if (iM == 1 || iM == 2 || iM == 3 || iM == 9) {
            kltVar.j(context, iM);
        }
    }
}
