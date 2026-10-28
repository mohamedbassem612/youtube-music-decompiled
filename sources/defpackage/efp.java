package defpackage;

import android.content.ComponentName;
import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import app.rive.semantics.SemanticState;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class efp extends awrb implements awqk {
    public static final efp a = new efp();

    public efp() {
        super(2, efr.class, "isReceiverEnabled", "isReceiverEnabled(Landroid/content/pm/PackageManager;Landroid/content/ComponentName;)Z", 1);
    }

    @Override // defpackage.awqk
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        PackageManager packageManager = (PackageManager) obj;
        ComponentName componentName = (ComponentName) obj2;
        packageManager.getClass();
        componentName.getClass();
        String str = efr.a;
        int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
        boolean zBooleanValue = false;
        if (componentEnabledSetting == 0) {
            HashMap map = efr.b;
            synchronized (map) {
                Boolean bool = (Boolean) map.get(componentName);
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    try {
                        ActivityInfo receiverInfo = packageManager.getReceiverInfo(componentName, SemanticState.LiveRegion);
                        if (receiverInfo != null) {
                            zBooleanValue = ((ComponentInfo) receiverInfo).enabled;
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        dzf.b();
                        Log.w(efr.a, String.valueOf(componentName.getClassName()).concat(" could not be found in manifest"), e);
                    }
                    HashMap map2 = efr.b;
                    synchronized (map2) {
                        map2.put(componentName, Boolean.valueOf(zBooleanValue));
                    }
                }
            }
        } else if (componentEnabledSetting == 1) {
            zBooleanValue = true;
        }
        return Boolean.valueOf(zBooleanValue);
    }
}
