package defpackage;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import j$.util.DesugarArrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ugh implements ugf {
    public static final /* synthetic */ int b = 0;
    public final awkx a = new awkx();
    private final AudioManager c;

    static {
        agke.v(aran.UPLOAD_SHORTS_AUDIO_DEVICE_TYPE_BLE, aran.UPLOAD_SHORTS_AUDIO_DEVICE_TYPE_A2DP, aran.UPLOAD_SHORTS_AUDIO_DEVICE_TYPE_HFP, aran.UPLOAD_SHORTS_AUDIO_DEVICE_TYPE_BLUETOOTH, aran.UPLOAD_SHORTS_AUDIO_DEVICE_TYPE_WIRED_HEADSET, aran.UPLOAD_SHORTS_AUDIO_DEVICE_TYPE_BUILT_IN);
    }

    public ugh(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService(AudioManager.class);
        this.c = audioManager;
        audioManager.registerAudioDeviceCallback(new ugg(this), null);
    }

    public static uge c(AudioDeviceInfo[] audioDeviceInfoArr, ugd ugdVar) {
        agke agkeVar = (agke) DesugarArrays.stream(audioDeviceInfoArr).map(new snm(10)).collect(aghu.a);
        if (agkeVar != null) {
            return new ugj(ugdVar, agkeVar, null);
        }
        throw new NullPointerException("Null devices");
    }

    @Override // defpackage.ugf
    public final avlr a() {
        return this.a.ag();
    }

    @Override // defpackage.ugf
    public final void b(Throwable th) {
        zvp.a(zvn.b, zvm.f, "AUDIO_DEVICE_MONITORError: ".concat(String.valueOf(String.valueOf(th))));
    }
}
