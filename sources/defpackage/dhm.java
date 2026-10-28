package defpackage;

import android.content.ComponentName;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dhm {
    public final ComponentName a;

    public dhm(ComponentName componentName) {
        this.a = componentName;
    }

    public final String a() {
        return this.a.getPackageName();
    }

    public final String toString() {
        return "ProviderMetadata{ componentName=" + this.a.flattenToShortString() + " }";
    }
}
