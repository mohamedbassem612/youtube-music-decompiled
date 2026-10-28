package defpackage;

import android.util.Base64;
import com.google.protobuf.MessageLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nwv {
    public static final String a(MessageLite messageLite) {
        String strEncodeToString = Base64.encodeToString(messageLite.toByteArray(), 10);
        strEncodeToString.getClass();
        return strEncodeToString;
    }
}
