package defpackage;

import j$.net.URLEncoder;
import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aeor {
    private static final Charset a = StandardCharsets.UTF_8;

    public static String a(aeom aeomVar) {
        String str = File.separator;
        String strConcat = "BLOB_STORAGE.".concat(String.valueOf(aeomVar.b));
        Charset charset = a;
        return str + URLEncoder.encode(strConcat, charset) + File.separator + (URLEncoder.encode(aeomVar.a, charset) + '.' + URLEncoder.encode(aeomVar.c, charset));
    }
}
