package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class lap extends laq {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ Bundle c;
    final /* synthetic */ boolean d;
    final /* synthetic */ lay e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lap(lay layVar, String str, String str2, Bundle bundle, boolean z) {
        super(layVar, true);
        this.a = str;
        this.b = str2;
        this.c = bundle;
        this.d = z;
        this.e = layVar;
    }

    @Override // defpackage.laq
    public final void a() {
        lay layVar = this.e;
        long j = layVar.f;
        long j2 = this.f;
        if (j < 157) {
            kzj kzjVar = layVar.e;
            kro.l(kzjVar);
            kzjVar.logEvent(this.a, this.b, this.c, this.d, true, j2);
        } else {
            long j3 = this.g;
            kzj kzjVar2 = layVar.e;
            kro.l(kzjVar2);
            kzjVar2.logEventWithElapsedTime(this.a, this.b, this.c, this.d, true, j2, j3);
        }
    }
}
