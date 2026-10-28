package defpackage;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahst {
    private static final Object a = new Object();
    private static ahtw b;

    public static lpa a(Context context, Intent intent, boolean z) {
        ahtw ahtwVar;
        synchronized (a) {
            ahtwVar = b;
            if (ahtwVar == null) {
                ahtwVar = new ahtw(context);
                b = ahtwVar;
            }
        }
        if (!z) {
            return ahtwVar.a(intent).a(new cte(15), new vlm(2));
        }
        if (ahtj.a().c(context)) {
            synchronized (ahtt.b) {
                ahtt.a(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                if (!booleanExtra) {
                    ahtt.c.a(ahtt.a);
                }
                ahtwVar.a(intent).o(new kbr(intent, 9));
            }
        } else {
            ahtwVar.a(intent);
        }
        return mda.m(-1);
    }

    public static final lpa b(final Intent intent, final Context context, Executor executor) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        final boolean z = (intent.getFlags() & 268435456) != 0;
        return (i < 26 || z) ? mda.k(executor, new afmn(context, intent, 3, null)).b(executor, new loo() { // from class: ahss
            @Override // defpackage.loo
            public final Object a(lpa lpaVar) {
                if (((Integer) lpaVar.f()).intValue() != 402) {
                    return lpaVar;
                }
                boolean z2 = z;
                return ahst.a(context, intent, z2).a(new cte(15), new vlm(3));
            }
        }) : a(context, intent, false);
    }
}
