package defpackage;

import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kqm extends kqo {
    final /* synthetic */ Intent a;
    final /* synthetic */ kou b;

    public kqm(Intent intent, kou kouVar) {
        this.a = intent;
        this.b = kouVar;
    }

    @Override // defpackage.kqo
    public final void a() {
        this.b.startActivityForResult(this.a, 2);
    }
}
