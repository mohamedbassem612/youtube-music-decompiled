package defpackage;

import androidx.car.app.model.Alert;
import internal.org.jni_zero.JniZero;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avtu extends avlh {
    final axso b;
    final avnn c;
    final int d;

    public avtu(axso axsoVar, avnn avnnVar, int i) {
        this.b = axsoVar;
        this.c = avnnVar;
        this.d = i;
    }

    @Override // defpackage.avlh
    protected final void ar(axsp axspVar) {
        axso axsoVar = this.b;
        avnn avnnVar = this.c;
        if (JniZero.e(axsoVar, axspVar, avnnVar)) {
            return;
        }
        int i = this.d;
        int i2 = avtq.f;
        axsoVar.aq(new avtp(axspVar, avnnVar, Alert.DURATION_SHOW_INDEFINITELY, i));
    }
}
