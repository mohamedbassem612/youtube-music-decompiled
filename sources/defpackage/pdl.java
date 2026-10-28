package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pdl implements qbh {
    private final pdd a;
    private final awou b;
    private final String c;

    static {
        agsn.h("GnpSdk");
    }

    public pdl(pdd pddVar, awou awouVar) {
        pddVar.getClass();
        awouVar.getClass();
        this.a = pddVar;
        this.b = awouVar;
        this.c = "ON_NOTIFICATION_RECEIVED";
    }

    @Override // defpackage.qbh
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // defpackage.qbh
    public final pky b(Bundle bundle) {
        return (pky) awqx.l(this.b, new gmc(this, bundle, (awoq) null, 13));
    }

    @Override // defpackage.qbh
    public final Object c(Bundle bundle, awoq awoqVar) {
        long j = bundle.getLong("com.google.android.libraries.notifications.DELIVERED_TIMESTAMP");
        int i = bundle.getInt("com.google.android.libraries.notifications.MUTE_NOTIFICATION");
        int i2 = bundle.getInt("com.google.android.libraries.notifications.FORCE_NOTIFICATION");
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        return this.a.a(nvi.a(bundle), 5, j, z, false, i2 == z, awoqVar);
    }

    @Override // defpackage.qbh
    public final String d() {
        return this.c;
    }

    @Override // defpackage.qbh
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // defpackage.qbh
    public final /* synthetic */ int f() {
        return 3;
    }
}
