package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zyb extends zxw {
    private static final agrf b = agrf.h("com/google/android/libraries/youtube/net/request/HttpRequester");
    private final tft c;

    public zyb(tft tftVar, zsk zskVar, zsi zsiVar) {
        super(zskVar, zsiVar);
        tftVar.getClass();
        this.c = tftVar;
    }

    private static final void d(tgo tgoVar) {
        tgn tgnVar = tgoVar.d;
        if (tgnVar != null) {
            tgnVar.g();
        }
    }

    @Override // defpackage.zxw
    protected final /* bridge */ /* synthetic */ void b(Object obj, sxu sxuVar) {
        tgo tgoVarA = null;
        try {
            try {
                try {
                    tgoVarA = this.c.a((tgf) obj);
                    sxuVar.b(obj, tgoVarA);
                } catch (Throwable th) {
                    if (tgoVarA == null) {
                        throw th;
                    }
                    try {
                        d(tgoVarA);
                        throw th;
                    } catch (IOException e) {
                        ((agrc) ((agrc) ((agrc) b.c()).j(e)).k("com/google/android/libraries/youtube/net/request/HttpRequester", "doRequest", '>', "HttpRequester.java")).t("Error consuming content response");
                        throw th;
                    }
                }
            } catch (IllegalStateException e2) {
                sxuVar.iT(obj, e2);
            }
        } catch (RuntimeException e3) {
            throw e3;
        } catch (Exception e4) {
            sxuVar.iT(obj, e4);
        }
        if (tgoVarA != null) {
            try {
                d(tgoVarA);
            } catch (IOException e5) {
                ((agrc) ((agrc) ((agrc) b.c()).j(e5)).k("com/google/android/libraries/youtube/net/request/HttpRequester", "doRequest", '>', "HttpRequester.java")).t("Error consuming content response");
            }
        }
    }

    @Override // defpackage.zxw
    protected final /* synthetic */ void c(Object obj, Object obj2, sxu sxuVar, Exception exc) {
        if (exc instanceof tgp) {
            String str = ((tgf) obj2).a;
            ((agrc) ((agrc) b.b()).k("com/google/android/libraries/youtube/net/request/HttpRequester", "onConvertError", 77, "HttpRequester.java")).y("Http error: status=[%s] msg=[%s]", ((tgp) exc).a, exc.getMessage());
        }
        sxuVar.iT(obj, exc);
    }
}
