package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kxs extends kmz {
    public final Activity a;

    static {
        Status status = kxr.a;
    }

    public kxs(Context context) {
        super(context, null, kxd.a, null, kmy.a);
        this.a = null;
    }

    public final void a(Intent intent) {
        kro.l(this.a);
        kpj kpjVar = new kpj();
        kpjVar.a = new jyx(this, intent, 6);
        kpjVar.c = 34401;
        super.A(1, kpjVar.a());
    }

    public kxs(Activity activity) {
        super(activity, activity, kxd.a, null, kmy.a);
        this.a = activity;
    }
}
