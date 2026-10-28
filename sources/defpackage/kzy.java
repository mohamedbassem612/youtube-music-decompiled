package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kzy extends laq {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ Bundle c;
    final /* synthetic */ lay d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kzy(lay layVar, String str, String str2, Bundle bundle) {
        super(layVar, true);
        this.a = str;
        this.b = str2;
        this.c = bundle;
        this.d = layVar;
    }

    @Override // defpackage.laq
    public final void a() {
        kzj kzjVar = this.d.e;
        kro.l(kzjVar);
        kzjVar.clearConditionalUserProperty(this.a, this.b, this.c);
    }
}
