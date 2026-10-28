package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class xkt implements zzi {
    final /* synthetic */ xku a;

    public xkt(xku xkuVar) {
        this.a = xkuVar;
    }

    @Override // defpackage.zzi
    public final String a(Uri uri, String str) {
        return (String) this.a.a.get(str);
    }

    @Override // defpackage.zzi
    public final String b() {
        return "xkt";
    }
}
