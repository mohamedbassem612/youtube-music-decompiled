package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qrd implements qrf {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ qrg a;

    public /* synthetic */ qrd(qrg qrgVar, int i) {
        this.$cid = i;
        this.a = qrgVar;
    }

    @Override // defpackage.qrf
    public final ListenableFuture a(IOException iOException, qrb qrbVar) {
        if (this.$cid == 0) {
            return qrbVar.a(iOException, this.a.e);
        }
        qrg qrgVar = this.a;
        return qrgVar.g.d(afwl.c(new gwj(qrgVar, qrbVar, 14, null)), qrgVar.c);
    }
}
