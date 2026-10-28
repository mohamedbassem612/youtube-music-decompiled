package defpackage;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yeu extends AudioDeviceCallback {
    private final Set a;

    public yeu(Set set) {
        this.a = set;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        Set set = this.a;
        synchronized (set) {
            for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                if (audioDeviceInfo != null) {
                    set.add(Integer.valueOf(audioDeviceInfo.getType()));
                }
            }
        }
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        Set set = this.a;
        synchronized (set) {
            for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                if (audioDeviceInfo != null) {
                    set.remove(Integer.valueOf(audioDeviceInfo.getType()));
                }
            }
        }
    }
}
