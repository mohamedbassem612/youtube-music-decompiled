package defpackage;

import com.google.android.libraries.elements.interfaces.JSFutureHandler;
import com.google.net.util.proto2api.Status$StatusProto;
import io.grpc.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mhj extends JSFutureHandler {
    public avpr a;

    public mhj(avpr avprVar) {
        this.a = avprVar;
    }

    @Override // com.google.android.libraries.elements.interfaces.JSFutureHandler
    public final Status onError(Status$StatusProto status$StatusProto) {
        avpr avprVar = this.a;
        if (avprVar == null) {
            return Status.m;
        }
        avprVar.d(mhb.a(status$StatusProto));
        return Status.OK;
    }

    @Override // com.google.android.libraries.elements.interfaces.JSFutureHandler
    public final Status onSuccess() {
        avpr avprVar = this.a;
        if (avprVar == null) {
            return Status.m;
        }
        avprVar.a();
        return Status.OK;
    }
}
