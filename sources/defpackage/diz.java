package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class diz extends vy {
    final /* synthetic */ dja a;

    public diz(dja djaVar) {
        this.a = djaVar;
    }

    @Override // defpackage.vy
    public final void l(String str, Bundle bundle) {
        Objects.toString(bundle);
    }

    @Override // defpackage.vy
    public final void m(Bundle bundle) {
        dja djaVar = this.a;
        djaVar.a = bundle.getString("groupableTitle");
        djaVar.b = bundle.getString("transferableTitle");
    }
}
