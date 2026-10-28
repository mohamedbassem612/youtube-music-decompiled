package defpackage;

import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ouh implements oui {
    @Override // defpackage.oui
    public final /* synthetic */ void a(aslh aslhVar, String str) {
        c(aslhVar, str, null);
    }

    @Override // defpackage.oui
    public final void b(String str, Throwable th) {
        Log.e("RENDER_NEXT", "ElementsServices not provided in PresentContext so ElementsView cannot be initialized. Either provide it inside the PresentContext or call present with ElementsServices.", th);
    }

    @Override // defpackage.oui
    public final void c(aslh aslhVar, String str, Throwable th) {
        Log.e("RENDER_NEXT", "[" + aslhVar.name() + "] " + str, th);
    }

    @Override // defpackage.oui
    public final /* synthetic */ void d() {
        Log.e("RENDER_NEXT", "ElementsDrawable.draw: copy failed", null);
    }
}
