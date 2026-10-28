package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.dtq;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(dtq dtqVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.a = (IconCompat) dtqVar.t(remoteActionCompat.a);
        remoteActionCompat.b = dtqVar.d(remoteActionCompat.b, 2);
        remoteActionCompat.c = dtqVar.d(remoteActionCompat.c, 3);
        remoteActionCompat.d = (PendingIntent) dtqVar.b(remoteActionCompat.d, 4);
        remoteActionCompat.e = dtqVar.l(remoteActionCompat.e, 5);
        remoteActionCompat.f = dtqVar.l(remoteActionCompat.f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, dtq dtqVar) {
        dtqVar.u(remoteActionCompat.a);
        dtqVar.g(remoteActionCompat.b, 2);
        dtqVar.g(remoteActionCompat.c, 3);
        dtqVar.i(remoteActionCompat.d, 4);
        dtqVar.f(remoteActionCompat.e, 5);
        dtqVar.f(remoteActionCompat.f, 6);
    }
}
