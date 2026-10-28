package defpackage;

import androidx.car.app.model.Alert;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class awge extends avlh {
    final awks b;
    final int c;

    public awge(awks awksVar, int i) {
        this.b = awksVar;
        this.c = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.avlh
    protected final void ar(axsp axspVar) {
        awks awksVar = this.b;
        awgd awgdVar = new awgd(axspVar, awksVar.a(), this.c);
        axspVar.e(awgdVar);
        awgb[] awgbVarArr = awgdVar.b;
        if (awksVar.c(awgbVarArr)) {
            int length = awgbVarArr.length;
            axsp[] axspVarArr = new axsp[length];
            for (int i = 0; i < length; i++) {
                awgb awgbVar = awgbVarArr[i];
                awfx awfxVar = (awfx) awksVar;
                avnn avnnVar = awfxVar.b;
                int i2 = awfxVar.c;
                int i3 = avtq.f;
                axspVarArr[i] = new avtp(awgbVar, avnnVar, Alert.DURATION_SHOW_INDEFINITELY, i2);
            }
            awks awksVar2 = ((awfx) awksVar).a;
            if (awksVar2.c(axspVarArr)) {
                awgj awgjVar = (awgj) awksVar2;
                avmb avmbVar = awgjVar.b;
                axsp[] axspVarArr2 = new axsp[length];
                if (avmbVar instanceof awje) {
                    ((awje) avmbVar).b(length, new awgg(awgjVar, axspVarArr, axspVarArr2));
                } else {
                    for (int i4 = 0; i4 < length; i4++) {
                        awgjVar.b(i4, axspVarArr, axspVarArr2, avmbVar.a());
                    }
                }
                awks awksVar3 = awgjVar.a;
                if (awksVar3.c(axspVarArr2)) {
                    awga awgaVar = (awga) awksVar3;
                    awgaVar.a.aq(new awfz(axspVarArr2, awgaVar.c));
                }
            }
        }
    }
}
