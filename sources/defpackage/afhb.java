package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afhb {
    public static final agrf a = agrf.h("com/google/apps/tiktok/account/api/controller/Config");
    public final boolean b;
    public final agke c;

    public afhb(boolean z, agke agkeVar) {
        this.b = z;
        this.c = agkeVar;
    }

    public static afha a() {
        afha afhaVar = new afha();
        afhaVar.c(false);
        afhaVar.b(afje.class);
        return afhaVar;
    }

    public static afha b(Activity activity) {
        if (!"robolectric".equals(Build.FINGERPRINT)) {
            Intent intent = activity.getIntent();
            Set<String> categories = intent.getCategories();
            ComponentName callingActivity = activity.getCallingActivity();
            if ((categories == null || categories.isEmpty()) && ((callingActivity == null || activity.getPackageName().equals(callingActivity.getPackageName())) && (intent.getFlags() & 268435456) == 0 && intent.getData() == null && intent.getClipData() == null && intent.getType() == null)) {
                ((agrc) ((agrc) a.c()).k("com/google/apps/tiktok/account/api/controller/Config", "forExternalActivity", 96, "Config.java")).w("External config used on invalid activity: %s", activity.getClass());
            }
        }
        afha afhaVarA = a();
        afhaVarA.c(true);
        return afhaVarA;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof afhb) {
            afhb afhbVar = (afhb) obj;
            if (this.b == afhbVar.b && aguu.v(this.c, afhbVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((true != this.b ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.c.hashCode()) * (-721379959);
    }

    public final String toString() {
        return "Config{canSwitchAccounts=" + this.b + ", initialSelectors=" + String.valueOf(this.c) + ", overrideRequirements=null, updateInitialSelectionContext=null}";
    }

    public afhb() {
        throw null;
    }
}
