package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class zyi extends zsg {
    @Override // defpackage.zsg
    /* JADX INFO: renamed from: a */
    public final tgf b(Uri uri) {
        return super.b(uri.buildUpon().appendQueryParameter("pseudo_head", "1").build());
    }

    @Override // defpackage.zsg, defpackage.zsk
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        return b((Uri) obj);
    }
}
