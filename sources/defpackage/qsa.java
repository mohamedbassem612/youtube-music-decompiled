package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.MessageLite;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qsa extends qrb {
    private final MessageLite a;

    public qsa(MessageLite messageLite) {
        this.a = messageLite;
    }

    @Override // defpackage.qrb
    public final ListenableFuture a(IOException iOException, qrc qrcVar) {
        return !(iOException.getCause() instanceof aiik) ? ahng.m(iOException) : ahbz.f(qrcVar.a(ahng.n(this.a)), IOException.class, new qmu(iOException, 7), MoreExecutors.directExecutor());
    }
}
