package defpackage;

import android.view.View;
import android.widget.Button;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class jey extends axx {
    final /* synthetic */ anxn a;
    final /* synthetic */ jfb b;

    public jey(jfb jfbVar, anxn anxnVar) {
        this.a = anxnVar;
        this.b = jfbVar;
    }

    @Override // defpackage.axx
    public final void onInitializeAccessibilityNodeInfo(View view, bbz bbzVar) {
        super.onInitializeAccessibilityNodeInfo(view, bbzVar);
        bbzVar.v(Button.class.getName());
        anxn anxnVar = this.a;
        aiqe aiqeVar = anxnVar.i;
        if (aiqeVar == null) {
            aiqeVar = aiqe.a;
        }
        alay alayVar = anxnVar.c;
        if (alayVar == null) {
            alayVar = alay.a;
        }
        jfb jfbVar = this.b;
        jfb.g(jfbVar.b, aiqeVar, ackj.k(null, alayVar, null, false).toString());
    }
}
