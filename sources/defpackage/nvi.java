package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nvi {
    public static final pxk a(Bundle bundle) {
        bundle.getClass();
        String string = bundle.getString("com.google.android.libraries.notifications.ACCOUNT_REPRESENTATION");
        if (string == null || string.length() == 0) {
            return null;
        }
        return nxm.a(string);
    }

    public static final void b(Bundle bundle, plx plxVar) {
        if (plxVar != null) {
            bundle.putString("com.google.android.libraries.notifications.ACCOUNT_REPRESENTATION", nxm.c(plxVar.b()));
        }
    }
}
