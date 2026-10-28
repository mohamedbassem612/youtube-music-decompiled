package defpackage;

import android.graphics.drawable.Drawable;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class nxr extends dta {
    final /* synthetic */ nxs b;

    public nxr(nxs nxsVar) {
        this.b = nxsVar;
    }

    @Override // defpackage.dta
    public final void b(Drawable drawable) {
        nxs nxsVar = this.b;
        CommandOuterClass$Command commandOuterClass$Command = nxsVar.a;
        if (commandOuterClass$Command != null) {
            nxsVar.b.a(commandOuterClass$Command, nrv.d().a()).D();
        }
        ((fce) drawable).start();
    }

    @Override // defpackage.dta
    public final void c(Drawable drawable) {
    }
}
