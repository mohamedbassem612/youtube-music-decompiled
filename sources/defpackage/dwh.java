package defpackage;

import androidx.window.extensions.WindowExtensionsProvider;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dwh {
    public static final /* synthetic */ int a = 0;

    static {
        int i = awrn.a;
        new awqv(dwh.class).c();
    }

    private dwh() {
    }

    public static final int a() {
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError | NullPointerException | UnsupportedOperationException unused) {
            return 0;
        }
    }
}
