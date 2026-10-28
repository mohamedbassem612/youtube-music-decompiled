package defpackage;

import android.content.Context;
import org.chromium.net.CronetEngine;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class thi extends CronetEngine.Builder.LibraryLoader {
    final /* synthetic */ Context a;

    public thi(Context context) {
        this.a = context;
    }

    @Override // org.chromium.net.CronetEngine.Builder.LibraryLoader
    public final void loadLibrary(String str) throws Throwable {
        tym.f(this.a, str);
    }
}
