package defpackage;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class efr {
    public static final String a = dzf.a("PackageManagerHelper");
    public static final HashMap b = new HashMap();

    public static final void a(PackageManager packageManager, ComponentName componentName, boolean z, awqk awqkVar) {
        try {
            if (z != ((Boolean) awqkVar.invoke(packageManager, componentName)).booleanValue()) {
                packageManager.setComponentEnabledSetting(componentName, true != z ? 2 : 1, 1);
                dzf.b();
                componentName.getClassName();
            }
        } catch (Exception unused) {
            dzf.b();
            componentName.getClassName();
        }
    }
}
