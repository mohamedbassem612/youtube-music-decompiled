package defpackage;

import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ezh implements eyv {
    private static final Set a = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));
    private final ezg b;

    public ezh(ezg ezgVar) {
        this.b = ezgVar;
    }

    @Override // defpackage.eyv
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return a.contains(((Uri) obj).getScheme());
    }

    @Override // defpackage.eyv
    public final /* bridge */ /* synthetic */ hed b(Object obj, int i, int i2, ety etyVar) {
        Uri uri = (Uri) obj;
        return new hed(new ffd(uri), this.b.a(uri));
    }
}
