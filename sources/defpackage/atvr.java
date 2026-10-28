package defpackage;

import android.media.AudioFormat;
import com.google.mediapipe.framework.Packet;
import com.google.mediapipe.framework.PacketGetter;
import com.google.research.xeno.effect.NativeCallbacks$PacketCallback;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class atvr implements NativeCallbacks$PacketCallback {
    public final /* synthetic */ CopyOnWriteArraySet a;

    @Override // com.google.research.xeno.effect.NativeCallbacks$PacketCallback
    public final void process(Packet packet) {
        int i = atvu.a;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahxj) it.next()).iA(ByteBuffer.wrap(PacketGetter.nativeGetAudioData(packet.getNativeHandle())), packet.a(), new AudioFormat.Builder().setEncoding(2).setChannelMask(PacketGetter.nativeGetMatrixRows(packet.getNativeHandle()) == 2 ? 12 : 16).build());
        }
    }
}
