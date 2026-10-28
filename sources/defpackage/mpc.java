package defpackage;

import com.google.android.libraries.elements.interfaces.CommandRunCompletionCallback;
import io.grpc.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class mpc extends CommandRunCompletionCallback {
    final /* synthetic */ avpr a;

    public mpc(avpr avprVar) {
        this.a = avprVar;
    }

    @Override // com.google.android.libraries.elements.interfaces.CommandRunCompletionCallback
    public final void completion(Status status) {
        boolean zE = status.e();
        avpr avprVar = this.a;
        if (zE) {
            avprVar.a();
        } else {
            avprVar.d(status.asException());
        }
    }
}
