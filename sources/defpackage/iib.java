package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class iib implements aheh {
    final /* synthetic */ Context a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ Bundle d;
    final /* synthetic */ iic e;

    public iib(iic iicVar, Context context, int i, int i2, Bundle bundle) {
        this.a = context;
        this.b = i;
        this.c = i2;
        this.d = bundle;
        this.e = iicVar;
    }

    @Override // defpackage.aheh
    public final void a(Throwable th) {
        this.e.d(this.a, this.b, this.c, this.d, null);
    }

    @Override // defpackage.aheh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.e.d(this.a, this.b, this.c, this.d, (Bitmap) obj);
    }
}
