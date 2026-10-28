package defpackage;

import com.google.mediapipe.framework.GraphTextureFrame;
import com.google.mediapipe.framework.Packet;
import com.google.mediapipe.framework.PacketGetter;
import com.google.research.xeno.effect.NativeCallbacks$PacketCallback;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class atvt implements NativeCallbacks$PacketCallback {
    public final /* synthetic */ CopyOnWriteArraySet a;
    public final /* synthetic */ CopyOnWriteArraySet b;

    public /* synthetic */ atvt(CopyOnWriteArraySet copyOnWriteArraySet, CopyOnWriteArraySet copyOnWriteArraySet2) {
        this.a = copyOnWriteArraySet;
        this.b = copyOnWriteArraySet2;
    }

    @Override // com.google.research.xeno.effect.NativeCallbacks$PacketCallback
    public final void process(Packet packet) {
        int i = atvu.a;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((atus) it.next()).o(packet.a());
        }
        CopyOnWriteArraySet copyOnWriteArraySet = this.b;
        GraphTextureFrame graphTextureFrameA = PacketGetter.a(packet);
        Iterator it2 = copyOnWriteArraySet.iterator();
        while (it2.hasNext()) {
            ((ahxk) it2.next()).iB(PacketGetter.a(packet));
        }
        graphTextureFrameA.release();
    }
}
