package defpackage;

import android.util.Base64;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class awy {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final int e;
    public final String f;
    public final String g;
    public final String h;

    public awy(String str, int i) {
        this.a = "com.google.android.gms.fonts";
        this.b = "com.google.android.gms";
        this.c = str;
        this.d = null;
        this.e = i;
        this.f = null;
        this.g = null;
        this.h = a("com.google.android.gms.fonts", "com.google.android.gms", str, null, null);
    }

    private static final String a(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('-');
        sb.append(str2);
        sb.append('-');
        sb.append(str3);
        sb.append('-');
        sb.append(str4);
        if (str5 != null) {
            int iCharCount = 0;
            while (iCharCount < str5.length()) {
                int iCodePointAt = str5.codePointAt(iCharCount);
                if (!Character.isWhitespace(iCodePointAt)) {
                    sb.append("-VF");
                    break;
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
        }
        return sb.toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.a + ", mProviderPackage: " + this.b + ", mQuery: " + this.c + ", mSystemFont: " + this.f + ", mVariationSettings: " + this.g + ", mCertificates:");
        int i = 0;
        while (true) {
            List list = this.d;
            if (i >= list.size()) {
                sb.append('}');
                sb.append("mCertificatesArray: " + this.e);
                return sb.toString();
            }
            sb.append(" [");
            List list2 = (List) list.get(i);
            for (int i2 = 0; i2 < list2.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list2.get(i2), 0));
                sb.append('\"');
            }
            sb.append(" ]");
            i++;
        }
    }

    public awy(String str, String str2, String str3, List list, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        azs.l(list);
        this.d = list;
        this.e = 0;
        this.f = str4;
        this.g = str5;
        this.h = a(str, str2, str3, str4, str5);
    }
}
