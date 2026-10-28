package defpackage;

import android.media.MediaCodecInfo;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zhc {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final int e;

    private zhc(String str, boolean z, boolean z2, int i, String str2) {
        this.a = str;
        this.c = z;
        this.d = z2;
        this.e = i;
        this.b = str2;
    }

    public static zhc a(clo cloVar) {
        String str;
        String str2;
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        if (cloVar == null) {
            str = "video/unknown";
            str2 = "";
        } else {
            str = cloVar.c;
            str2 = cloVar.b;
        }
        String str3 = str2;
        int maxSupportedInstances = -1;
        if (cloVar != null && (codecCapabilities = cloVar.e) != null) {
            maxSupportedInstances = codecCapabilities.getMaxSupportedInstances();
        }
        int i = maxSupportedInstances;
        String strD = d(str);
        boolean z = false;
        if (cloVar != null && cloVar.j) {
            z = true;
        }
        return new zhc(strD, z, str.startsWith("audio"), i, str3);
    }

    public static zhc b(String str, boolean z, String str2) {
        return new zhc(d(str), z, str.startsWith("audio"), -1, str2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:13:0x0022 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0043 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x005c A[ORIG_RETURN, RETURN] */
    private static String d(String str) {
        switch (str) {
            case "video/3gpp":
                return "mpeg4";
            case "video/av01":
                return "av1";
            case "video/webm":
                return "vp9";
            case "audio/mp4a-latm":
                return "aac";
            case "video/avc":
                return "h264";
            case "audio/opus":
            case "audio/webm":
                return "opus";
            case "video/x-vnd.on2.vp9":
                return "vp9";
            default:
                return "";
        }
    }

    public final String c() {
        if (this.a.isEmpty()) {
            return "";
        }
        return true != this.c ? "1" : "2";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zhc)) {
            return false;
        }
        zhc zhcVar = (zhc) obj;
        return zhcVar.a.equals(this.a) && zhcVar.c == this.c && zhcVar.b.equals(this.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, Boolean.valueOf(this.c), this.b);
    }
}
