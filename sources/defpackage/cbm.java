package defpackage;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cbm implements cdx {
    public AudioManager a;
    public AudioDeviceCallback b;
    public bvc c;

    @Override // defpackage.cdx
    public final void a() {
        bvc bvcVar = this.c;
        bvcVar.getClass();
        bvcVar.b(new bkn(this, 7));
    }

    @Override // defpackage.cdx
    public final boolean b() {
        bvc bvcVar = this.c;
        if (bvcVar == null) {
            return true;
        }
        return ((Boolean) bvcVar.a()).booleanValue();
    }

    public final boolean c() {
        AudioManager audioManager = this.a;
        audioManager.getClass();
        for (AudioDeviceInfo audioDeviceInfo : audioManager.getDevices(2)) {
            if (audioDeviceInfo.getType() == 8 || audioDeviceInfo.getType() == 5 || audioDeviceInfo.getType() == 6 || audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3 || audioDeviceInfo.getType() == 22 || ((Build.VERSION.SDK_INT >= 28 && audioDeviceInfo.getType() == 23) || ((Build.VERSION.SDK_INT >= 31 && (audioDeviceInfo.getType() == 26 || audioDeviceInfo.getType() == 27)) || (Build.VERSION.SDK_INT >= 33 && audioDeviceInfo.getType() == 30)))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cdx
    public final void d(qcb qcbVar, Context context, Looper looper, Looper looper2, bvd bvdVar) {
        bvc bvcVar = new bvc(Boolean.TRUE, looper2, looper, bvdVar, new cbk(qcbVar, 0));
        this.c = bvcVar;
        bvcVar.b(new blq((Object) this, (Object) context, 15, (byte[]) null));
    }
}
