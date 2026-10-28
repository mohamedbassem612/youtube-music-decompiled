package defpackage;

import android.os.Build;
import j$.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class cfe {
    public static final cfe a;
    public final int b;
    public final int c;
    public final agkz d;

    static {
        cfe cfeVar;
        if (Build.VERSION.SDK_INT >= 33) {
            agkx agkxVar = new agkx();
            for (int i = 1; i <= 10; i++) {
                agkxVar.c(Integer.valueOf(bwp.g(i)));
            }
            cfeVar = new cfe(2, agkxVar.g());
        } else {
            cfeVar = new cfe(2, 10);
        }
        a = cfeVar;
    }

    public cfe(int i, Set set) {
        this.b = i;
        agkz agkzVarN = agkz.n(set);
        this.d = agkzVarN;
        agqr it = agkzVarN.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.c = iMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cfe) {
            cfe cfeVar = (cfe) obj;
            if (this.b == cfeVar.b && this.c == cfeVar.c && Objects.equals(this.d, cfeVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        agkz agkzVar = this.d;
        return (((this.b * 31) + this.c) * 31) + (agkzVar == null ? 0 : agkzVar.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.b + ", maxChannelCount=" + this.c + ", channelMasks=" + String.valueOf(this.d) + ']';
    }

    public cfe(int i, int i2) {
        this.b = i;
        this.c = i2;
        this.d = null;
    }
}
