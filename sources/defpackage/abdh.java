package defpackage;

import android.content.Context;
import android.util.SparseArray;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abdh {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/player/features/gl/program/ShaderResourceCache");
    private final Context b;
    private final SparseArray c = new SparseArray();

    public abdh(Context context) {
        this.b = context;
    }

    public final String a(int i) {
        SparseArray sparseArray = this.c;
        String str = (String) sparseArray.get(i, null);
        if (str != null) {
            return str;
        }
        try {
            InputStream inputStreamOpenRawResource = this.b.getResources().openRawResource(i);
            byte[] bArr = new byte[inputStreamOpenRawResource.available()];
            if (inputStreamOpenRawResource.read(bArr) > 0) {
                String str2 = new String(bArr, Charset.defaultCharset());
                sparseArray.put(i, str2);
                return str2;
            }
        } catch (IOException e) {
            ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/player/features/gl/program/ShaderResourceCache", "getShaderResource", 52, "ShaderResourceCache.java")).w("ShaderSourceCache: Error retrieving resource: %s", e.getMessage());
        }
        return "";
    }
}
