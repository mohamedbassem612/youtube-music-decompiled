package defpackage;

import android.app.Notification;
import android.os.Build;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class brk extends brl {
    @Override // defpackage.brl, defpackage.auu
    public final void f(dep depVar) {
        if (Build.VERSION.SDK_INT < 34) {
            Object obj = depVar.c;
            Notification.DecoratedMediaCustomViewStyle decoratedMediaCustomViewStyle = new Notification.DecoratedMediaCustomViewStyle();
            ats.e(decoratedMediaCustomViewStyle, this.a, this.b);
            ((Notification.Builder) obj).setStyle(decoratedMediaCustomViewStyle);
            return;
        }
        Object obj2 = depVar.c;
        Notification.DecoratedMediaCustomViewStyle decoratedMediaCustomViewStyle2 = new Notification.DecoratedMediaCustomViewStyle();
        Boolean.FALSE.booleanValue();
        ats.e(decoratedMediaCustomViewStyle2, this.a, this.b);
        ((Notification.Builder) obj2).setStyle(decoratedMediaCustomViewStyle2);
    }

    @Override // defpackage.auu
    public final void j() {
    }
}
