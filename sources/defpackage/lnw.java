package defpackage;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lnw extends kmz implements lns {
    public static final /* synthetic */ int a = 0;
    private static final khn b;
    private static final kro c;
    private static final kro d;

    static {
        kro kroVar = new kro();
        d = kroVar;
        lnv lnvVar = new lnv();
        c = lnvVar;
        b = new khn("SearchIndex.QUERIES_API", lnvVar, kroVar);
    }

    public lnw(Context context) {
        super(context, null, b, null, kmy.a);
        context.getPackageName();
    }

    @Override // defpackage.lns
    public final lpa a(String str, String[] strArr, jxb jxbVar) {
        lnp lnpVar = new lnp();
        lnpVar.g = new Bundle();
        lnpVar.g.putLong("request_timestamp_ms", System.currentTimeMillis());
        lnpVar.a = str;
        lnpVar.b = "com.google.android.gms";
        lnpVar.c = strArr;
        lnpVar.d = 0;
        lnpVar.e = 3;
        lnpVar.f = jxbVar;
        kpj kpjVar = new kpj();
        kpjVar.a = new kak(lnpVar, 12);
        kpjVar.c = 8117;
        return super.A(0, kpjVar.a());
    }
}
