package defpackage;

import android.app.ActivityOptions;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class atc extends aad {
    private final ActivityOptions a;

    public atc(ActivityOptions activityOptions) {
        this.a = activityOptions;
    }

    @Override // defpackage.aad
    public final Bundle c() {
        return this.a.toBundle();
    }

    @Override // defpackage.aad
    public final void d(int i) {
        if (Build.VERSION.SDK_INT >= 34) {
            this.a.setPendingIntentBackgroundActivityStartMode(i);
        } else if (Build.VERSION.SDK_INT >= 33) {
            this.a.setPendingIntentBackgroundActivityLaunchAllowed(i != 2);
        }
    }
}
