package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.youtube.music.R;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iox {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/settings/battery/BatteryRestrictionsMonitor");
    public final Context b;
    public final aunn c;
    public final Executor d;
    public final Executor e;
    private final aunn f;

    public iox(Context context, aunn aunnVar, aunn aunnVar2, Executor executor, Executor executor2) {
        this.b = context;
        this.f = aunnVar;
        this.c = aunnVar2;
        this.d = executor;
        this.e = executor2;
    }

    public final void c(int i) {
        aunn aunnVar = this.f;
        jin jinVar = (jin) aunnVar.io();
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setFlags(268435456);
        Context context = this.b;
        intent.setData(Uri.parse("package:".concat(String.valueOf(context.getPackageName()))));
        Bundle bundle = new Bundle();
        bundle.putString(":settings:fragment_args_key", "battery");
        intent.putExtra(":settings:show_fragment_args", bundle);
        jio jioVarE = jin.e();
        ((jik) jioVarE).k(context.getString(R.string.battery_restriction_warning));
        jioVarE.l(context.getString(R.string.battery_restriction_action), new gdp(this, intent, 11, null));
        jinVar.d(jioVarE.b());
        if (i >= 0) {
            taf.j(((qrx) this.c.io()).a(new iow(i, 0), this.e), new ihw(6));
        }
    }
}
