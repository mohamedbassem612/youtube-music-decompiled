package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import app.rive.semantics.SemanticState;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class avk {
    public static volatile aua a;
    private static volatile List b;

    private avk() {
    }

    public static List a(Context context) {
        Bundle bundle;
        String string;
        if (b == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
            intent.setPackage(context.getPackageName());
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, SemanticState.Focused).iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                if (activityInfo != null && (bundle = activityInfo.metaData) != null && (string = bundle.getString("androidx.core.content.pm.shortcut_listener_impl")) != null) {
                    try {
                        arrayList.add((atz) Class.forName(string, false, avk.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context));
                    } catch (Exception unused) {
                    }
                }
            }
            if (b == null) {
                b = arrayList;
            }
        }
        return b;
    }

    public static void b(Context context, String str) {
        azs.l(str);
        zs$$ExternalSyntheticApiModelOutline0.m949m(context.getSystemService(zs$$ExternalSyntheticApiModelOutline0.m())).reportShortcutUsed(str);
        Iterator it = a(context).iterator();
        if (it.hasNext()) {
            Collections.singletonList(str);
            throw null;
        }
    }
}
