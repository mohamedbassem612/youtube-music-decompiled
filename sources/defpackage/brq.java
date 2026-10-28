package defpackage;

import android.media.AudioAttributes;
import android.os.Build;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class brq {
    public static final brq a = new brq(0, 1);
    public final int b;
    public final int c;
    private AudioAttributes d;

    static {
        int i = bwp.a;
    }

    public brq(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    public final AudioAttributes a() {
        AudioAttributes audioAttributes = this.d;
        if (audioAttributes != null) {
            return audioAttributes;
        }
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.b).setFlags(0).setUsage(this.c);
        if (Build.VERSION.SDK_INT >= 29) {
            usage.setAllowedCapturePolicy(1);
            usage.setHapticChannelsMuted(true);
        }
        if (Build.VERSION.SDK_INT >= 32) {
            usage.setSpatializationBehavior(0);
            usage.setIsContentSpatialized(false);
        }
        AudioAttributes audioAttributesBuild = usage.build();
        this.d = audioAttributesBuild;
        return audioAttributesBuild;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            brq brqVar = (brq) obj;
            if (this.b == brqVar.b && this.c == brqVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.b + 527) * 961) + this.c) * 31) + 1) * 29791) + 1;
    }
}
