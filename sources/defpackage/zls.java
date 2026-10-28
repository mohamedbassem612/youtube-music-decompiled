package defpackage;

import android.util.Base64;
import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class zls {
    public static final /* synthetic */ int a = 0;
    private static final agrf b = agrf.h("com/google/android/libraries/youtube/mediaservices/io/MediaItemInfoEncoding");
    private static final awtk c = new awtk("^[a-zA-Z0-9_-]*$");

    public static final String a(byte[] bArr) {
        String strEncodeToString = Base64.encodeToString(bArr, 11);
        strEncodeToString.getClass();
        return strEncodeToString;
    }

    public static final String b(anfb anfbVar) {
        anfbVar.getClass();
        return a(anfbVar.toByteArray());
    }

    public static final Object c(String str) {
        Object objI;
        try {
            byte[] bArrDecode = Base64.decode(str, 11);
            bArrDecode.getClass();
            anfb anfbVar = (anfb) aihn.parseFrom(anfb.a, bArrDecode, ExtensionRegistryLite.getGeneratedRegistry());
            anfbVar.getClass();
            int i = anfbVar.c;
            if (i != 1) {
                return anfbVar;
            }
            String str2 = i == 1 ? (String) anfbVar.d : "";
            str2.getClass();
            if (c.b(str2)) {
                return anfbVar;
            }
            ((agrc) b.c().k("com/google/android/libraries/youtube/mediaservices/io/MediaItemInfoEncoding", "isValid", 70, "MediaItemInfoEncoding.kt")).w("Invalid serverId in parsed MediaItemInfo: %s", anfbVar.c == 1 ? (String) anfbVar.d : "");
            return atqp.i(new IllegalArgumentException(a.ce(anfbVar.c == 1 ? (String) anfbVar.d : "", "MediaItemInfo contains an invalid serverId: ")));
        } catch (aiik e) {
            d(e, str);
            objI = atqp.i(e);
            return objI;
        } catch (IllegalArgumentException e2) {
            d(e2, str);
            objI = atqp.i(e2);
            return objI;
        } catch (StringIndexOutOfBoundsException e3) {
            d(e3, str);
            objI = atqp.i(e3);
            return objI;
        }
    }

    private static final void d(Exception exc, String str) {
        if (zik.aP(str)) {
            return;
        }
        int iA = awrc.A(str, '.', 0, 6);
        while (iA > 0) {
            String strSubstring = str.substring(0, iA);
            strSubstring.getClass();
            if (zik.aP(strSubstring)) {
                return;
            } else {
                iA = awrc.A(str, '.', iA - 1, 4);
            }
        }
        ((agrc) ((agrc) b.c()).j(exc).k("com/google/android/libraries/youtube/mediaservices/io/MediaItemInfoEncoding", "logMediaIdWarning", 79, "MediaItemInfoEncoding.kt")).w("Failed to parse media id: %s", str);
    }
}
