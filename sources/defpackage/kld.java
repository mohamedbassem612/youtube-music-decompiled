package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kld {
    private final Context a;
    private int b;
    private int c = 0;

    public kld(Context context) {
        this.a = context;
    }

    public final synchronized int a() {
        PackageInfo packageInfoG;
        if (this.b == 0) {
            try {
                packageInfoG = kte.a.a(this.a).g("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("Metadata", "Failed to find package ".concat(e.toString()));
                packageInfoG = null;
            }
            if (packageInfoG != null) {
                this.b = packageInfoG.versionCode;
            }
        }
        return this.b;
    }

    public final synchronized int b() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        Context context = this.a;
        PackageManager packageManager = context.getPackageManager();
        if (((Context) kte.b(context).a).getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
        intent.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers == null || listQueryBroadcastReceivers.isEmpty()) {
            Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
            this.c = 2;
        } else {
            this.c = 2;
        }
        return 2;
    }
}
