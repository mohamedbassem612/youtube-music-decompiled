package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class vib implements sxu {
    final /* synthetic */ Uri a;
    final /* synthetic */ int b;
    final /* synthetic */ sxu c;
    public final /* synthetic */ vic d;

    public vib(vic vicVar, Uri uri, int i, sxu sxuVar) {
        this.a = uri;
        this.b = i;
        this.c = sxuVar;
        this.d = vicVar;
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.sxu
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        this.d.e.execute(new pac(this, (Uri) obj, (byte[]) obj2, this.a, this.b, this.c, 3));
    }

    @Override // defpackage.sxu
    public final /* bridge */ /* synthetic */ void iT(Object obj, Exception exc) {
        this.c.iT((Uri) obj, exc);
    }
}
