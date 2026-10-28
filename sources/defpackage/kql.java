package defpackage;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kql extends kqo {
    final /* synthetic */ Intent a;
    final /* synthetic */ Activity b;
    final /* synthetic */ int c;

    public kql(Intent intent, Activity activity, int i) {
        this.a = intent;
        this.b = activity;
        this.c = i;
    }

    @Override // defpackage.kqo
    public final void a() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, this.c);
        }
    }
}
