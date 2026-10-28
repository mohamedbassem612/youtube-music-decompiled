package defpackage;

import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afgf {
    public static final agrf a = agrf.h("com/google/apps/tiktok/account/api/controller/AccountIntents");

    public static void a(Intent intent, affd affdVar) {
        int i = affdVar.a;
        ahno.F(i != -1);
        intent.putExtra("account_id", i);
        intent.putExtra("$tiktok$account_id_owned", true);
    }
}
