package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class absy extends ytn {
    private final abtd b;
    private final wgs c;
    private final ytx d;

    public absy(ytr ytrVar, abtd abtdVar, wgs wgsVar, ytx ytxVar) {
        super(ytrVar);
        this.b = abtdVar;
        this.c = wgsVar;
        this.d = ytxVar;
    }

    @Override // defpackage.ytn, defpackage.ytr
    public final void G() {
        this.d.c(null);
        this.a.G();
    }

    @Override // defpackage.ytn, defpackage.ytr
    public final void I(Context context, Uri uri, Map map, wiu wiuVar) {
        this.d.c(wiuVar);
        if (!tyu.i(uri)) {
            abtd abtdVar = this.b;
            wgs wgsVar = this.c;
            int iE = wgsVar.e();
            String strC = wgsVar.C();
            long j = wgsVar.j();
            long jK = wgsVar.k();
            int i = absz.a;
            abtb abtbVarA = abtdVar.a("/exocache", wgsVar.c, iE, strC, j, jK);
            abtbVarA.b("s", uri.toString());
            uri = abtbVarA.a();
        }
        this.a.I(context, uri, map, wiuVar);
    }
}
