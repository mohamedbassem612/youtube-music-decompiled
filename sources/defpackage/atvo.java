package defpackage;

import com.google.mediapipe.framework.Packet;
import com.google.research.xeno.effect.MultiEffectProcessorBase;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class atvo implements atvh {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Packet a;
    public final /* synthetic */ long b;
    public final /* synthetic */ atvq c;

    public /* synthetic */ atvo(atvq atvqVar, Packet packet, long j, int i) {
        this.$cid = i;
        this.c = atvqVar;
        this.a = packet;
        this.b = j;
    }

    @Override // defpackage.atvh
    public final void a(long j) {
        int i = this.$cid;
        Packet packet = this.a;
        if (i != 0) {
            long nativeHandle = packet.getNativeHandle();
            long j2 = this.b;
            MultiEffectProcessorBase.nativeSendFramePacket(j, nativeHandle, j2, new atux(this.c, j2, 1));
        } else {
            long nativeHandle2 = packet.getNativeHandle();
            long j3 = this.b;
            atvp.nativeSendVideoProcessorFramePacket(j, nativeHandle2, j3, new atux(this.c, j3, 2));
        }
    }
}
