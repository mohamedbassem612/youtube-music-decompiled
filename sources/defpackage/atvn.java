package defpackage;

import com.google.mediapipe.framework.Packet;
import com.google.research.xeno.effect.MultiEffectProcessorBase;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class atvn implements atvh {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Packet a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ atvq d;

    public /* synthetic */ atvn(atvq atvqVar, Packet packet, long j, long j2, int i) {
        this.$cid = i;
        this.d = atvqVar;
        this.a = packet;
        this.b = j;
        this.c = j2;
    }

    @Override // defpackage.atvh
    public final void a(long j) {
        int i = this.$cid;
        Packet packet = this.a;
        if (i != 0) {
            long nativeHandle = packet.getNativeHandle();
            long j2 = this.b;
            MultiEffectProcessorBase.nativeSendFramePacketWithPresentationTimestamp(j, nativeHandle, j2, this.c, new atux(this.d, j2, 0));
            return;
        }
        long nativeHandle2 = packet.getNativeHandle();
        long j3 = this.b;
        atvp.nativeSendPresentationTimedVideoProcessorFramePacket(j, nativeHandle2, j3, this.c, new atux(this.d, j3, 3));
    }
}
