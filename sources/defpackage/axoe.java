package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class axoe implements axoi {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ axof a;
    public final /* synthetic */ UrlResponseInfo b;
    public final /* synthetic */ Object c;

    public /* synthetic */ axoe(axof axofVar, UrlResponseInfo urlResponseInfo, Object obj, int i) {
        this.$cid = i;
        this.a = axofVar;
        this.b = urlResponseInfo;
        this.c = obj;
    }

    @Override // defpackage.axoi
    public final void a() {
        int i = this.$cid;
        axof axofVar = this.a;
        if (i == 0) {
            Object obj = this.c;
            axofVar.a.onRedirectReceived(axofVar.d, this.b, (String) obj);
        } else {
            axoh axohVar = axofVar.d;
            if (axohVar.g.compareAndSet(5, 4)) {
                Object obj2 = this.c;
                axofVar.a.onReadCompleted(axohVar, this.b, (ByteBuffer) obj2);
            }
        }
    }
}
