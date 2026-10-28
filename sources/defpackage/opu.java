package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class opu extends bcc {
    final /* synthetic */ opv a;

    public opu(opv opvVar) {
        this.a = opvVar;
    }

    @Override // defpackage.bcc
    public final bbz createAccessibilityNodeInfo(int i) {
        return bbz.d(this.a.h(i));
    }

    @Override // defpackage.bcc
    public final bbz findFocus(int i) {
        opv opvVar = this.a;
        int i2 = i == 2 ? opvVar.e : opvVar.f;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return createAccessibilityNodeInfo(i2);
    }

    @Override // defpackage.bcc
    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.a.k(i, i2, bundle);
    }
}
