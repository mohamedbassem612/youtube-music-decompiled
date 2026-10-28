package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kzx extends laq {
    final /* synthetic */ Bundle a;
    final /* synthetic */ lay b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kzx(lay layVar, Bundle bundle) {
        super(layVar, true);
        this.a = bundle;
        this.b = layVar;
    }

    @Override // defpackage.laq
    public final void a() {
        kzj kzjVar = this.b.e;
        kro.l(kzjVar);
        kzjVar.setConditionalUserProperty(this.a, this.f);
    }
}
