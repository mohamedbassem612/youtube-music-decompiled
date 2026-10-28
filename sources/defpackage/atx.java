package defpackage;

import android.app.Notification;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class atx extends auu {
    private final ArrayList a = new ArrayList();

    @Override // defpackage.auu
    protected final String a() {
        return "androidx.core.app.NotificationCompat$InboxStyle";
    }

    @Override // defpackage.auu
    public final void b(Bundle bundle) {
        super.b(bundle);
        ArrayList arrayList = this.a;
        arrayList.clear();
        if (bundle.containsKey("android.textLines")) {
            Collections.addAll(arrayList, bundle.getCharSequenceArray("android.textLines"));
        }
    }

    @Override // defpackage.auu
    public final void f(dep depVar) {
        Notification.InboxStyle bigContentTitle = new Notification.InboxStyle((Notification.Builder) depVar.c).setBigContentTitle(this.i);
        if (this.k) {
            bigContentTitle.setSummaryText(this.j);
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bigContentTitle.addLine((CharSequence) arrayList.get(i));
        }
    }
}
