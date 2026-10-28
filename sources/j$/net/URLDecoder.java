package j$.net;

import j$.util.Objects;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.util.BitSet;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public class URLDecoder {
    static {
        BitSet bitSet = URLEncoder.a;
    }

    public static boolean a(char c) {
        return ('0' <= c && c <= '9') || ('a' <= c && c <= 'f') || ('A' <= c && c <= 'F');
    }

    public static String decode(String str, Charset charset) {
        Objects.a(charset, "Charset");
        int length = str.length();
        StringBuilder sb = new StringBuilder(length > 500 ? length / 2 : length);
        byte[] bArr = null;
        int i = 0;
        boolean z = false;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '%') {
                if (bArr == null) {
                    try {
                        bArr = new byte[(length - i) / 3];
                    } catch (NumberFormatException e) {
                        throw new IllegalArgumentException("URLDecoder: Illegal hex characters in escape (%) pattern - " + e.getMessage());
                    }
                }
                int i2 = 0;
                while (true) {
                    int i3 = i + 2;
                    if (i3 >= length || cCharAt != '%') {
                        break;
                    }
                    int i4 = i + 1;
                    if (!a(str.charAt(i4)) || !a(str.charAt(i3))) {
                        throw new IllegalArgumentException("URLDecoder: Illegal hex characters in escape (%) pattern : " + str.substring(i, i + 3));
                    }
                    int i5 = i + 3;
                    int i6 = Integer.parseInt(str.subSequence(i4, i5).toString(), 16);
                    if (i6 < 0) {
                        throw new IllegalArgumentException("URLDecoder: Illegal hex characters in escape (%) pattern - negative value : " + str.substring(i, i5));
                    }
                    int i7 = i2 + 1;
                    bArr[i2] = (byte) i6;
                    if (i5 < length) {
                        cCharAt = str.charAt(i5);
                    }
                    i2 = i7;
                    i = i5;
                }
                if (i < length && cCharAt == '%') {
                    throw new IllegalArgumentException("URLDecoder: Incomplete trailing escape (%) pattern");
                }
                sb.append(new String(bArr, 0, i2, charset));
            } else if (cCharAt != '+') {
                sb.append(cCharAt);
                i++;
            } else {
                sb.append(' ');
                i++;
            }
            z = true;
        }
        return z ? sb.toString() : str;
    }

    public static String decode(String str, String str2) throws UnsupportedEncodingException {
        if (!str2.isEmpty()) {
            try {
                return decode(str, Charset.forName(str2));
            } catch (IllegalCharsetNameException | UnsupportedCharsetException unused) {
                throw new UnsupportedEncodingException(str2);
            }
        }
        throw new UnsupportedEncodingException("URLDecoder: empty string enc parameter");
    }
}
