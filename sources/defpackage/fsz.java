package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fsz {
    public boolean a;
    public Object b;

    public fsz(Context context) {
        int i = 1;
        try {
            jsh.b(context);
            this.b = jsh.a().c().a("PLAY_BILLING_LIBRARY", new jsa(), new kcu(i));
        } catch (Throwable unused) {
            this.a = true;
        }
    }

    public final void a(aioi aioiVar) {
        if (this.a) {
            eov.e("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((kyr) this.b).r(new jsb(null, aioiVar, 1, null));
        } catch (Throwable unused) {
            eov.e("BillingLogger", "logging failed.");
        }
    }

    public fsz(ftg ftgVar, boolean z) {
        this.b = ftgVar;
        this.a = z;
    }

    public fsz(byte[] bArr, byte[] bArr2) {
        this.b = new dbk(1);
    }

    public fsz() {
    }
}
