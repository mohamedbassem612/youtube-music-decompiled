package defpackage;

import j$.time.Duration;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vdo {
    public final String a;
    public final byte[] b;
    public final Duration c;

    public vdo(String str, byte[] bArr, Duration duration) {
        this.a = str;
        this.b = bArr;
        this.c = duration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vdo) {
            vdo vdoVar = (vdo) obj;
            if (awrc.c(this.a, vdoVar.a) && awrc.c(this.b, vdoVar.b) && awrc.c(this.c, vdoVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        byte[] bArr = this.b;
        return ((iHashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "WaveformResult(videoId=" + this.a + ", waveformBytes=" + Arrays.toString(this.b) + ", sourceDuration=" + this.c + ')';
    }
}
