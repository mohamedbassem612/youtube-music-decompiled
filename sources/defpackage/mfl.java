package defpackage;

import android.util.Log;
import com.google.android.libraries.elements.interfaces.ClientErrorLoggerAdapter;
import com.google.protos.youtube.api.innertube.ClientErrorOuterClass$ClientError;
import com.google.protos.youtube.api.innertube.ClientErrorOuterClass$LogMessage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mfl extends ClientErrorLoggerAdapter {
    @Override // com.google.android.libraries.elements.interfaces.ClientErrorLoggerAdapter
    public final void logWithClientError(ClientErrorOuterClass$ClientError clientErrorOuterClass$ClientError) {
        int i;
        ClientErrorOuterClass$LogMessage defaultInstance = clientErrorOuterClass$ClientError.e;
        if (defaultInstance == null) {
            defaultInstance = ClientErrorOuterClass$LogMessage.getDefaultInstance();
        }
        ajtv ajtvVarA = ajtv.a(defaultInstance.d);
        if (ajtvVarA == null) {
            ajtvVarA = ajtv.ERROR_LEVEL_UNKNOWN;
        }
        int iOrdinal = ajtvVarA.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2) {
            i = 5;
        } else {
            i = iOrdinal != 3 ? 4 : 6;
        }
        ClientErrorOuterClass$LogMessage defaultInstance2 = clientErrorOuterClass$ClientError.e;
        if (defaultInstance2 == null) {
            defaultInstance2 = ClientErrorOuterClass$LogMessage.getDefaultInstance();
        }
        Log.println(i, "ElementsClientError", defaultInstance2.c);
    }
}
