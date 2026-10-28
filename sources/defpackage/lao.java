package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lao extends laq {
    final /* synthetic */ Bundle a;
    final /* synthetic */ lay b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lao(lay layVar, Bundle bundle) {
        super(layVar, true);
        this.a = bundle;
        this.b = layVar;
    }

    @Override // defpackage.laq
    public final void a() {
        kzj kzjVar = this.b.e;
        if (kzjVar == null) {
            throw new NullPointerException("null reference");
        }
        kzjVar.setDefaultEventParameters(this.a);
    }
}
