package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awxi extends CancellationException implements awuo {
    public final transient awwd a;

    public awxi(String str, awwd awwdVar) {
        super(str);
        this.a = awwdVar;
    }

    @Override // defpackage.awuo
    public final /* bridge */ /* synthetic */ Throwable a() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        awxi awxiVar = new awxi(message, this.a);
        awxiVar.initCause(this);
        return awxiVar;
    }
}
