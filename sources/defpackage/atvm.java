package defpackage;

import android.util.Log;
import com.google.mediapipe.framework.Packet;
import com.google.research.xeno.effect.Callbacks$StatusCallback;
import com.google.research.xeno.effect.MultiEffectProcessorBase;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class atvm implements atvh {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Packet a;
    public final /* synthetic */ long b;

    public /* synthetic */ atvm(Packet packet, long j, int i) {
        this.$cid = i;
        this.a = packet;
        this.b = j;
    }

    @Override // defpackage.atvh
    public final void a(long j) {
        int i = this.$cid;
        long j2 = this.b;
        if (i != 0) {
            String str = MultiEffectProcessorBase.f;
            long nativeHandle = this.a.getNativeHandle();
            final int i2 = 1;
            MultiEffectProcessorBase.nativeSendAudioPacket(j, nativeHandle, j2, new Callbacks$StatusCallback() { // from class: atvk
                @Override // com.google.research.xeno.effect.NativeCallbacks$StatusCallback
                public final void onCompletion(boolean z, String str2) {
                    if (i2 != 0) {
                        String str3 = MultiEffectProcessorBase.f;
                        if (z) {
                            return;
                        }
                        Log.e(MultiEffectProcessorBase.f, "Error sending video processor audio packet: ".concat(String.valueOf(str2)));
                        return;
                    }
                    String str4 = atvp.b;
                    if (z) {
                        return;
                    }
                    Log.e(atvp.b, "Error sending video processor audio packet: ".concat(String.valueOf(str2)));
                }
            });
            return;
        }
        String str2 = atvp.b;
        long nativeHandle2 = this.a.getNativeHandle();
        final int i3 = 0;
        atvp.nativeSendVideoProcessorAudioPacket(j, nativeHandle2, j2, new Callbacks$StatusCallback() { // from class: atvk
            @Override // com.google.research.xeno.effect.NativeCallbacks$StatusCallback
            public final void onCompletion(boolean z, String str3) {
                if (i3 != 0) {
                    String str4 = MultiEffectProcessorBase.f;
                    if (z) {
                        return;
                    }
                    Log.e(MultiEffectProcessorBase.f, "Error sending video processor audio packet: ".concat(String.valueOf(str3)));
                    return;
                }
                String str5 = atvp.b;
                if (z) {
                    return;
                }
                Log.e(atvp.b, "Error sending video processor audio packet: ".concat(String.valueOf(str3)));
            }
        });
    }
}
