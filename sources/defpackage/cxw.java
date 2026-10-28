package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cxw extends cxp {
    private static final Pattern a = Pattern.compile("(.+?)='(.*?)';", 32);
    private final CharsetDecoder b = StandardCharsets.UTF_8.newDecoder();
    private final CharsetDecoder c = StandardCharsets.ISO_8859_1.newDecoder();

    private final String c(ByteBuffer byteBuffer) {
        String string;
        try {
            string = this.b.decode(byteBuffer).toString();
            this.b.reset();
            byteBuffer.rewind();
        } catch (CharacterCodingException unused) {
            this.b.reset();
            byteBuffer.rewind();
            try {
                string = this.c.decode(byteBuffer).toString();
            } catch (CharacterCodingException unused2) {
                string = null;
            } finally {
                this.c.reset();
                byteBuffer.rewind();
            }
        } catch (Throwable th) {
            this.b.reset();
            byteBuffer.rewind();
            throw th;
        }
        return string;
    }

    @Override // defpackage.cxp
    protected final bsx b(cxn cxnVar, ByteBuffer byteBuffer) {
        String strC = c(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (strC == null) {
            return new bsx(-9223372036854775807L, new cxy(bArr, null, null));
        }
        Matcher matcher = a.matcher(strC);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strAe = ahno.ae(strGroup);
                int iHashCode = strAe.hashCode();
                if (iHashCode != -315603473) {
                    if (iHashCode == 1646559960 && strAe.equals("streamtitle")) {
                        str = strGroup2;
                    }
                } else if (strAe.equals("streamurl")) {
                    str2 = strGroup2;
                }
            }
        }
        return new bsx(-9223372036854775807L, new cxy(bArr, str, str2));
    }
}
