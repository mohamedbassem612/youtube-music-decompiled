package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;
import j$.util.Objects;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cfj {
    public final Context a;
    public final Handler b;
    final AudioDeviceCallback c;
    public final BroadcastReceiver d;
    public final cfh e;
    public cff f;
    public AudioDeviceInfo g;
    public brq h;
    public boolean i;
    public eqf j;
    private final qcb k;

    public cfj(Context context, qcb qcbVar, brq brqVar, AudioDeviceInfo audioDeviceInfo) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.k = qcbVar;
        this.h = brqVar;
        this.g = audioDeviceInfo;
        Handler handlerAp = bwp.ap();
        this.b = handlerAp;
        this.c = new cfg(this);
        this.d = new cfi(this);
        Uri uriFor = cff.d() ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.e = uriFor != null ? new cfh(this, handlerAp, applicationContext.getContentResolver(), uriFor) : null;
    }

    public final List a() {
        eqf eqfVar;
        if (Build.VERSION.SDK_INT < 32 || (eqfVar = this.j) == null) {
            return agpi.a;
        }
        if (!eqfVar.d()) {
            return agpi.a;
        }
        if (Build.VERSION.SDK_INT < 36) {
            return agke.q(252);
        }
        Object obj = eqfVar.c;
        obj.getClass();
        return bby$$ExternalSyntheticApiModelOutline7.m(obj).getSpatializedChannelMasks();
    }

    public final void b(cff cffVar) {
        if (!this.i || cffVar.equals(this.f)) {
            return;
        }
        this.f = cffVar;
        cgq cgqVar = (cgq) this.k.a;
        cgqVar.i();
        cff cffVar2 = cgqVar.a;
        if (cffVar2 == null || cffVar.equals(cffVar2)) {
            return;
        }
        cgqVar.a = cffVar;
        dje djeVar = cgqVar.c;
        if (djeVar != null) {
            djeVar.h(-1, new cce(17));
        }
    }

    public final void c(AudioDeviceInfo audioDeviceInfo) {
        if (Objects.equals(audioDeviceInfo, this.g)) {
            return;
        }
        this.g = audioDeviceInfo;
        b(cff.b(this.a, this.h, audioDeviceInfo, a()));
    }

    public final void d() {
        b(cff.b(this.a, this.h, this.g, a()));
    }
}
