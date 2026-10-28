package j$.sun.nio.cs;

import java.nio.CharBuffer;
import java.nio.charset.CoderResult;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class e {
    public CoderResult a;
    public boolean b;

    public final int a(char c, CharBuffer charBuffer) {
        if (Character.isHighSurrogate(c)) {
            if (charBuffer.hasRemaining()) {
                char c2 = charBuffer.get();
                if (Character.isLowSurrogate(c2)) {
                    int codePoint = Character.toCodePoint(c, c2);
                    this.b = true;
                    this.a = null;
                    return codePoint;
                }
                this.a = CoderResult.malformedForLength(1);
            } else {
                this.a = CoderResult.UNDERFLOW;
            }
        } else {
            if (!Character.isLowSurrogate(c)) {
                this.b = false;
                this.a = null;
                return c;
            }
            this.a = CoderResult.malformedForLength(1);
        }
        return -1;
    }

    public final int b(char c, char[] cArr, int i, int i2) {
        if (Character.isHighSurrogate(c)) {
            if (i2 - i < 2) {
                this.a = CoderResult.UNDERFLOW;
            } else {
                char c2 = cArr[i + 1];
                if (Character.isLowSurrogate(c2)) {
                    int codePoint = Character.toCodePoint(c, c2);
                    this.b = true;
                    this.a = null;
                    return codePoint;
                }
                this.a = CoderResult.malformedForLength(1);
            }
        } else {
            if (!Character.isLowSurrogate(c)) {
                this.b = false;
                this.a = null;
                return c;
            }
            this.a = CoderResult.malformedForLength(1);
        }
        return -1;
    }
}
