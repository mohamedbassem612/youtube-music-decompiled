package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fdi implements ffm {
    final /* synthetic */ Context a;

    public fdi(Context context) {
        this.a = context;
    }

    @Override // defpackage.ffm
    public final /* bridge */ /* synthetic */ Object a() {
        return (ConnectivityManager) this.a.getSystemService("connectivity");
    }
}
