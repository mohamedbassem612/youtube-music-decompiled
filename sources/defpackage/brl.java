package defpackage;

import android.app.Notification;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat$Token;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class brl extends auu {
    public int[] a = null;
    public MediaSessionCompat$Token b;

    @Override // defpackage.auu
    public void f(dep depVar) {
        if (Build.VERSION.SDK_INT < 34) {
            Object obj = depVar.c;
            Notification.MediaStyle mediaStyle = new Notification.MediaStyle();
            ats.e(mediaStyle, this.a, this.b);
            ((Notification.Builder) obj).setStyle(mediaStyle);
            return;
        }
        Object obj2 = depVar.c;
        Notification.MediaStyle mediaStyle2 = new Notification.MediaStyle();
        Boolean.FALSE.booleanValue();
        ats.e(mediaStyle2, this.a, this.b);
        ((Notification.Builder) obj2).setStyle(mediaStyle2);
    }
}
