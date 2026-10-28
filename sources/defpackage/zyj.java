package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class zyj implements sxu {
    final /* synthetic */ zyk a;
    private final sxu b;
    private boolean c;

    public zyj(zyk zykVar, sxu sxuVar, boolean z) {
        this.a = zykVar;
        this.b = sxuVar;
        this.c = z;
    }

    @Override // defpackage.sxu
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Uri uri = (Uri) obj;
        Long l = (Long) obj2;
        if (!this.c) {
            this.b.b(uri, l);
            return;
        }
        if (l.longValue() > 0) {
            this.b.b(uri, l);
            return;
        }
        this.c = false;
        zyk zykVar = this.a;
        zykVar.b = true;
        zykVar.a.a(uri, this);
    }

    @Override // defpackage.sxu
    public final /* bridge */ /* synthetic */ void iT(Object obj, Exception exc) {
        this.b.iT((Uri) obj, exc);
    }
}
