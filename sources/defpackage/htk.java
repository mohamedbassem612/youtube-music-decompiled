package defpackage;

import android.app.Notification;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class htk implements sxu {
    final /* synthetic */ String a;
    final /* synthetic */ int b;
    final /* synthetic */ boolean c;
    final /* synthetic */ htp d;

    public htk(htp htpVar, String str, int i, boolean z) {
        this.a = str;
        this.b = i;
        this.c = z;
        this.d = htpVar;
    }

    @Override // defpackage.sxu
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        this.d.k(this.a, this.b, (Notification) obj2, this.c);
    }

    @Override // defpackage.sxu
    public final /* bridge */ /* synthetic */ void iT(Object obj, Exception exc) {
    }
}
