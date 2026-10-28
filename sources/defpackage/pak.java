package defpackage;

import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pak implements pmb {
    @Override // defpackage.pmb
    public final boolean a(Intent intent) {
        return awrc.c("com.google.android.libraries.notifications.SYSTEM_TRAY_EVENT", intent.getAction());
    }
}
