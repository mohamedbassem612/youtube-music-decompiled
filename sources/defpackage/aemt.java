package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aemt implements adme {
    private final Context a;
    private final adhv b;
    private final vxe c;
    private final aduv d;
    private final aemu e;

    public aemt(Context context, adhv adhvVar, vxe vxeVar, aduv aduvVar, aemu aemuVar) {
        this.a = context;
        this.b = adhvVar;
        this.c = vxeVar;
        this.d = aduvVar;
        this.e = aemuVar;
    }

    @Override // defpackage.adme
    public final /* bridge */ /* synthetic */ adma a(ViewGroup viewGroup) {
        return new aemv(this.a, this.b, this.c, this.d, this.e);
    }
}
