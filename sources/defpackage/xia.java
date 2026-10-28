package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xia {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/logging/interaction/util/LoggingDirectableUtil");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.google.protobuf.MessageLite] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [aigj] */
    /* JADX WARN: Type inference failed for: r7v7, types: [aigj] */
    /* JADX WARN: Type inference failed for: r7v8 */
    public static amud a(MessageLite messageLite) {
        ?? r7;
        if (messageLite == 0) {
            return null;
        }
        byte[] byteArray = messageLite.toByteArray();
        int i = aigm.l;
        aigm aigmVarO = aigm.O(byteArray, 0, byteArray.length, false);
        while (true) {
            try {
                if (!aigmVarO.D()) {
                    int iN = aigmVarO.n();
                    int i2 = iN & 7;
                    if ((iN >>> 3) == 999 && i2 == 2) {
                        messageLite = aigmVarO.w();
                        r7 = messageLite;
                        break;
                    }
                    aigmVarO.F(iN);
                    r7 = 0;
                    break;
                }
                r7 = 0;
                break;
            } catch (IOException unused) {
                ((agrc) ((agrc) a.c()).k("com/google/android/libraries/youtube/logging/interaction/util/LoggingDirectableUtil", "readFieldFromProto", 63, "LoggingDirectableUtil.java")).y("Error while getting field %d from %s", 999, messageLite.getClass());
            }
        }
        if (r7 == 0) {
            return null;
        }
        try {
            return (amud) aihn.parseFrom(amud.b, (aigj) r7, ExtensionRegistryLite.getGeneratedRegistry());
        } catch (aiik unused2) {
            return null;
        }
    }
}
