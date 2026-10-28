package defpackage;

import com.google.android.libraries.elements.interfaces.ClientErrorLoggerAdapter;
import com.google.protos.youtube.api.innertube.ClientErrorOuterClass$ClientError;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adbd extends ClientErrorLoggerAdapter {
    private final zvl a;

    public adbd(zvl zvlVar) {
        this.a = zvlVar;
    }

    @Override // com.google.android.libraries.elements.interfaces.ClientErrorLoggerAdapter
    public final void logWithClientError(ClientErrorOuterClass$ClientError clientErrorOuterClass$ClientError) {
        this.a.b(clientErrorOuterClass$ClientError);
    }
}
