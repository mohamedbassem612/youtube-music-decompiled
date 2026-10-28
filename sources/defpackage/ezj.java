package defpackage;

import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ezj implements eyv {
    private static final Set a = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));
    private final eyv b;

    public ezj(eyv eyvVar) {
        this.b = eyvVar;
    }

    @Override // defpackage.eyv
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return a.contains(((Uri) obj).getScheme());
    }

    @Override // defpackage.eyv
    public final /* bridge */ /* synthetic */ hed b(Object obj, int i, int i2, ety etyVar) {
        return this.b.b(new eyl(((Uri) obj).toString()), i, i2, etyVar);
    }
}
