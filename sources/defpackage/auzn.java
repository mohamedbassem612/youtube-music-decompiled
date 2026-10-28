package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class auzn {
    public static final boolean a = a("GRPC_ENABLE_RFC3986_URIS", true);

    public static boolean a(String str, boolean z) {
        String strTrim = System.getenv(str);
        if (strTrim == null) {
            strTrim = System.getProperty(str);
        }
        if (strTrim != null) {
            strTrim = strTrim.trim();
        }
        if (z) {
            if (ahno.aa(strTrim) || Boolean.parseBoolean(strTrim)) {
                return true;
            }
        } else if (!ahno.aa(strTrim) && Boolean.parseBoolean(strTrim)) {
            return true;
        }
        return false;
    }
}
