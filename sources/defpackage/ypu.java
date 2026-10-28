package defpackage;

import com.google.android.libraries.youtube.media.interfaces.VideoplaybackUmpParser;
import com.google.android.libraries.youtube.media.player.exo2.platypus.PlatypusNativeLoader;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ypu {
    public final cah a;
    public final ByteBuffer b;
    public final int c;
    public boolean d;
    public final ArrayDeque e = new ArrayDeque();
    public boolean f;
    public final boolean g;
    public final VideoplaybackUmpParser h;
    public final xxj i;

    public ypu(cah cahVar, byi byiVar, ByteBuffer byteBuffer, xeu xeuVar, ywn ywnVar, zjr zjrVar) {
        this.a = cahVar;
        this.b = byteBuffer;
        this.c = zjrVar.R().B;
        Object obj = byiVar.l;
        this.i = obj instanceof ypq ? ((ypq) obj).j : null;
        PlatypusNativeLoader.a();
        this.g = zjrVar.dU();
        VideoplaybackUmpParser videoplaybackUmpParserCreate = VideoplaybackUmpParser.create(new ypt(this, xeuVar, ywnVar));
        videoplaybackUmpParserCreate.getClass();
        this.h = videoplaybackUmpParserCreate;
    }

    public final int a(byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (true) {
            ArrayDeque arrayDeque = this.e;
            if (arrayDeque.isEmpty()) {
                return i3;
            }
            int i4 = i + i3;
            ByteBuffer byteBuffer = (ByteBuffer) arrayDeque.peek();
            int iRemaining = byteBuffer.remaining();
            int i5 = i3 + iRemaining;
            if (i5 > i2) {
                byteBuffer.get(bArr, i4, i2 - i3);
                return i2;
            }
            ((ByteBuffer) arrayDeque.remove()).get(bArr, i4, iRemaining);
            i3 = i5;
        }
    }
}
