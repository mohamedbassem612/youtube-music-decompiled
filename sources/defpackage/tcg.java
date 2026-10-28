package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class tcg extends ContextWrapper {
    private final tci a;

    public tcg(Context context, tci tciVar) {
        super(context);
        this.a = tciVar;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final PackageManager getPackageManager() {
        return this.a;
    }
}
