package defpackage;

import android.net.http.UrlResponseInfo;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class axme implements axna {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ axmf a;
    public final /* synthetic */ UrlResponseInfo b;
    public final /* synthetic */ Object c;

    public /* synthetic */ axme(axmf axmfVar, UrlResponseInfo urlResponseInfo, Object obj, int i) {
        this.$cid = i;
        this.a = axmfVar;
        this.b = urlResponseInfo;
        this.c = obj;
    }

    @Override // defpackage.axna
    public final Object a() {
        int i = this.$cid;
        UrlResponseInfo urlResponseInfo = this.b;
        if (i != 0) {
            axmf axmfVar = this.a;
            Object obj = this.c;
            axmi axmiVarB = axmi.b(urlResponseInfo);
            axmfVar.a.onReadCompleted(axmfVar.b, axmiVarB, (ByteBuffer) obj);
        } else {
            axmf axmfVar2 = this.a;
            Object obj2 = this.c;
            axmi axmiVarB2 = axmi.b(urlResponseInfo);
            axmfVar2.a.onRedirectReceived(axmfVar2.b, axmiVarB2, (String) obj2);
        }
        return null;
    }
}
