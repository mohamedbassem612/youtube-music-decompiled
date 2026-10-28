package defpackage;

import android.os.Bundle;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class xbd extends axx {
    final /* synthetic */ ajwo a;
    final /* synthetic */ agkj b;
    final /* synthetic */ xbf c;

    public xbd(xbf xbfVar, ajwo ajwoVar, agkj agkjVar) {
        this.a = ajwoVar;
        this.b = agkjVar;
        this.c = xbfVar;
    }

    @Override // defpackage.axx
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (i != 16) {
            return super.performAccessibilityAction(view, i, bundle);
        }
        xbf xbfVar = this.c;
        xbfVar.d.c(this.a, this.b);
        return true;
    }
}
