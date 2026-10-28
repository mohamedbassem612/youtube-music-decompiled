package defpackage;

import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.MalformedInputException;
import java.nio.charset.StandardCharsets;
import java.util.BitSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avcm {
    public static final BitSet a = BitSet.valueOf(new long[]{287948901175001088L});
    static final BitSet b = BitSet.valueOf(new long[]{0, 576460743847706622L});
    static final BitSet c = BitSet.valueOf(new long[]{288063250384289792L, 576460743847706622L});
    static final BitSet d = BitSet.valueOf(new long[]{288054454291267584L, 5188146764422578174L});
    static final BitSet e;
    public static final BitSet f;
    static final BitSet g;
    public static final BitSet h;
    public static final BitSet i;
    public static final BitSet j;
    private static final char[] m;
    public final String k;
    public final String l;
    private final String n;
    private final String o;
    private final String p;
    private final String q;
    private final String r;

    static {
        BitSet.valueOf(new long[]{-8935000888854970368L, 671088641});
        BitSet.valueOf(new long[]{2882338748320710656L});
        BitSet.valueOf(new long[]{-6052662140534259712L, 671088641});
        e = BitSet.valueOf(new long[]{3170393202611978240L, 5188146764422578174L});
        f = BitSet.valueOf(new long[]{3458623578763689984L, 5188146764422578174L});
        g = BitSet.valueOf(new long[]{3458623578763689984L, 5188146764422578175L});
        h = BitSet.valueOf(new long[]{3458764316252045312L, 5188146764422578175L});
        BitSet bitSetValueOf = BitSet.valueOf(new long[]{-5764607720602730496L, 5188146764422578175L});
        i = bitSetValueOf;
        j = bitSetValueOf;
        m = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    public avcm(avcl avclVar) {
        Object obj = avclVar.a;
        obj.getClass();
        this.k = (String) obj;
        this.n = (String) avclVar.e;
        this.o = (String) avclVar.f;
        this.p = (String) avclVar.g;
        String str = (String) avclVar.b;
        this.l = str;
        this.q = (String) avclVar.c;
        this.r = (String) avclVar.d;
        if (!f()) {
            if (str.startsWith("//")) {
                throw new IllegalArgumentException("No authority -- Path cannot start with '//'");
            }
        } else if (!str.isEmpty() && !str.startsWith("/")) {
            throw new IllegalArgumentException("Has authority -- Non-empty path must start with '/'");
        }
    }

    public static String a(String str) {
        if (str == null || str.indexOf(37) == -1) {
            return str;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(str.length());
        e(str, "input", null, byteBufferAllocate);
        byteBufferAllocate.flip();
        try {
            return StandardCharsets.UTF_8.newDecoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE).decode(byteBufferAllocate).toString();
        } catch (CharacterCodingException e2) {
            throw new agfz(e2);
        }
    }

    public static String b(String str, BitSet bitSet) {
        if (str == null) {
            return null;
        }
        try {
            ByteBuffer byteBufferEncode = StandardCharsets.UTF_8.newEncoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT).encode(CharBuffer.wrap(str));
            StringBuilder sb = new StringBuilder();
            while (byteBufferEncode.hasRemaining()) {
                byte b2 = byteBufferEncode.get();
                int i2 = b2 & 255;
                if (bitSet.get(i2)) {
                    sb.append((char) i2);
                } else {
                    sb.append('%');
                    char[] cArr = m;
                    sb.append(cArr[(b2 & 240) >> 4]);
                    sb.append(cArr[b2 & 15]);
                }
            }
            return sb.toString();
        } catch (MalformedInputException e2) {
            throw new IllegalArgumentException("Malformed input", e2);
        } catch (CharacterCodingException e3) {
            throw new agfz(e3);
        }
    }

    public static void d(String str, agjz agjzVar) {
        String strSubstring;
        int length;
        int iStartsWith = str.startsWith("/");
        while (iStartsWith < str.length()) {
            int iIndexOf = str.indexOf(47, iStartsWith);
            if (iIndexOf >= 0) {
                strSubstring = str.substring(iStartsWith, iIndexOf);
                length = iIndexOf + 1;
            } else {
                strSubstring = str.substring(iStartsWith);
                length = str.length();
            }
            if (agjzVar != null) {
                agjzVar.h(a(strSubstring));
            } else {
                e(strSubstring, "path segment", g, null);
            }
            iStartsWith = length;
        }
        if (!str.endsWith("/") || agjzVar == null) {
            return;
        }
        agjzVar.h("");
    }

    public static void e(CharSequence charSequence, String str, BitSet bitSet, ByteBuffer byteBuffer) {
        int i2 = 0;
        while (i2 < charSequence.length()) {
            char cCharAt = charSequence.charAt(i2);
            if (cCharAt == '%') {
                int i3 = i2 + 2;
                if (i3 >= charSequence.length()) {
                    throw new IllegalArgumentException("Invalid percent-encoding at index " + i2 + " of " + str + ": " + String.valueOf(charSequence));
                }
                int iDigit = Character.digit(charSequence.charAt(i2 + 1), 16);
                int iDigit2 = Character.digit(charSequence.charAt(i3), 16);
                if (iDigit == -1 || iDigit2 == -1) {
                    throw new IllegalArgumentException("Invalid hex digit in " + str + " at index " + i2 + " of: " + String.valueOf(charSequence));
                }
                if (byteBuffer != null) {
                    byteBuffer.put((byte) ((iDigit << 4) | iDigit2));
                }
                i2 = i3;
            } else {
                if (bitSet != null && !bitSet.get(cCharAt)) {
                    throw new IllegalArgumentException(a.cg(i2, str, "Invalid character in ", " at index "));
                }
                if (byteBuffer != null) {
                    byteBuffer.put((byte) cCharAt);
                }
            }
            i2++;
        }
    }

    public final void c(StringBuilder sb) {
        String str = this.n;
        if (str != null) {
            sb.append(str);
            sb.append('@');
        }
        String str2 = this.o;
        if (str2 != null) {
            sb.append(str2);
        }
        String str3 = this.p;
        if (str3 != null) {
            sb.append(':');
            sb.append(str3);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof avcm)) {
            return false;
        }
        avcm avcmVar = (avcm) obj;
        return Objects.equals(this.k, avcmVar.k) && Objects.equals(this.n, avcmVar.n) && Objects.equals(this.o, avcmVar.o) && Objects.equals(this.p, avcmVar.p) && Objects.equals(this.l, avcmVar.l) && Objects.equals(this.q, avcmVar.q) && Objects.equals(this.r, avcmVar.r);
    }

    public final boolean f() {
        return this.o != null;
    }

    public final int hashCode() {
        return Objects.hash(this.k, this.n, this.o, this.p, this.l, this.q, this.r);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.k);
        sb.append(':');
        if (f()) {
            sb.append("//");
            c(sb);
        }
        sb.append(this.l);
        String str = this.q;
        if (str != null) {
            sb.append('?');
            sb.append(str);
        }
        String str2 = this.r;
        if (str2 != null) {
            sb.append('#');
            sb.append(str2);
        }
        return sb.toString();
    }
}
