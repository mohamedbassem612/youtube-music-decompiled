package defpackage;

import android.media.AudioFormat;
import android.util.Log;
import android.util.Size;
import com.google.mediapipe.framework.Packet;
import com.google.mediapipe.framework.TextureFrame;
import com.google.research.aimatter.drishti.DrishtiCache;
import com.google.research.xeno.effect.Callbacks$StatusCallback;
import com.google.research.xeno.effect.Effect;
import com.google.research.xeno.effect.FilterProcessorBase;
import com.google.research.xeno.effect.InputFrameSource;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public class atvp extends FilterProcessorBase implements ahxk, ahxj {
    public static final String b = "atvp";
    public static final Size c = new Size(-1, -1);

    public atvp(atth atthVar) {
        super(atthVar);
        DrishtiCache drishtiCache = atthVar.b;
        m(nativeNewVideoProcessor(1, this.h.a(), drishtiCache != null ? drishtiCache.a() : 0L, ahng.J(atthVar.c), atthVar.a, atvu.a(atthVar.d), new atvt(this.k, this.i), new atvr(this.j), new atvs(Effect.d, this.l)));
    }

    public final void e(InputFrameSource inputFrameSource, Size size) {
        iD(new atvl(inputFrameSource, size, 0));
    }

    public final void f() {
        k(null);
    }

    public final void h(TextureFrame textureFrame, long j) {
        CopyOnWriteArraySet copyOnWriteArraySet = this.k;
        long timestamp = textureFrame.getTimestamp();
        Packet packetB = this.g.b(textureFrame);
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((atus) it.next()).n(timestamp);
        }
        iD(new atvn(this, packetB, timestamp, j, 0));
        packetB.release();
    }

    @Override // defpackage.ahxj
    public final void iA(ByteBuffer byteBuffer, long j, AudioFormat audioFormat) {
        if (audioFormat.getChannelCount() == 0) {
            Log.e(b, "Current AudioFormat's channel count is 0");
            return;
        }
        Packet packetA = this.g.a(byteBuffer, audioFormat.getChannelCount(), (byteBuffer.limit() / 2) / audioFormat.getChannelCount());
        iD(new atvm(packetA, j, 0));
        packetA.release();
    }

    @Override // defpackage.ahxk
    public final void iB(TextureFrame textureFrame) {
        CopyOnWriteArraySet copyOnWriteArraySet = this.k;
        long timestamp = textureFrame.getTimestamp();
        Packet packetB = this.g.b(textureFrame);
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((atus) it.next()).n(timestamp);
        }
        iD(new atvo(this, packetB, timestamp, 0));
        packetB.release();
    }

    public final void k(Callbacks$StatusCallback callbacks$StatusCallback) {
        iD(new atvj(callbacks$StatusCallback, 0));
    }
}
