package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class wmp extends twv {
    final /* synthetic */ Context a;
    final /* synthetic */ wmr b;

    public wmp(wmr wmrVar, Context context) {
        this.a = context;
        this.b = wmrVar;
    }

    @Override // defpackage.twv
    public final /* bridge */ /* synthetic */ Object b() {
        return new wmq(this.b.a(this.a), true);
    }
}
