package defpackage;

import android.view.View;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class osb extends axx {
    final /* synthetic */ boolean a;
    final /* synthetic */ boolean b;
    final /* synthetic */ boolean c;
    final /* synthetic */ String d;
    final /* synthetic */ asuy e;

    public osb(asuy asuyVar, boolean z, boolean z2, boolean z3, String str) {
        this.e = asuyVar;
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = str;
    }

    @Override // defpackage.axx
    public final void onInitializeAccessibilityNodeInfo(View view, bbz bbzVar) {
        super.onInitializeAccessibilityNodeInfo(view, bbzVar);
        asuy asuyVar = this.e;
        if (asuyVar != null) {
            if (this.a) {
                bbzVar.F(asuyVar.aT());
            }
            if (this.b) {
                bbzVar.O(asuyVar.aU());
            }
            bbzVar.E(Memory.peekByte(asuyVar.c + 10) != 0);
            bbzVar.s(Memory.peekByte(asuyVar.c + 11) != 0);
            bbzVar.t(Memory.peekByte(asuyVar.c + 12) == 0 ? 0 : 1);
            if (Memory.peekByte(asuyVar.c + 13) != 0) {
                bbzVar.B(false);
            }
        }
        if (this.c) {
            bbzVar.z(this.d);
        }
    }
}
