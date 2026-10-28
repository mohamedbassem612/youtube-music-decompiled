package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ezn implements eyv {
    private final Context a;
    private final eyv b;
    private final eyv c;
    private final Class d;

    public ezn(Context context, eyv eyvVar, eyv eyvVar2, Class cls) {
        this.a = context.getApplicationContext();
        this.b = eyvVar;
        this.c = eyvVar2;
        this.d = cls;
    }

    @Override // defpackage.eyv
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && ept.q((Uri) obj);
    }

    @Override // defpackage.eyv
    public final /* bridge */ /* synthetic */ hed b(Object obj, int i, int i2, ety etyVar) {
        Uri uri = (Uri) obj;
        return new hed(new ffd(uri), new ezm(this.a, this.b, this.c, uri, i, i2, etyVar, this.d));
    }
}
