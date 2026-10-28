package defpackage;

import androidx.car.app.model.Alert;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class zcv extends zct {
    final /* synthetic */ zcy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zcv(zcy zcyVar, zcs zcsVar) {
        super(zcyVar, zcsVar);
        this.c = zcyVar;
    }

    @Override // defpackage.zcx
    public final int a() {
        return this.a.a;
    }

    @Override // defpackage.zcx
    public final void d() {
        this.a.a++;
    }

    @Override // defpackage.zct, defpackage.zcx
    public final boolean e() {
        int i;
        int iA = a();
        if (iA <= 1) {
            return true;
        }
        wiu wiuVar = (wiu) this.c.b.io();
        int i2 = wiuVar.d.b & 1;
        int i3 = Alert.DURATION_SHOW_INDEFINITELY;
        if (i2 != 0 && (i = wiuVar.E().g) != -1) {
            i3 = i;
        }
        return iA < i3;
    }
}
