package defpackage;

import android.content.Context;
import org.chromium.net.CronetEngine;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class yeh extends CronetEngine.Builder.LibraryLoader {
    final /* synthetic */ abzo a;

    public yeh(abzo abzoVar) {
        this.a = abzoVar;
    }

    @Override // org.chromium.net.CronetEngine.Builder.LibraryLoader
    public final void loadLibrary(String str) throws Throwable {
        tym.f((Context) this.a.i, str);
    }
}
