package defpackage;

import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class sfv {
    public static final /* synthetic */ int c = 0;
    public final sfu a;
    public final String b;

    static {
        new sfv(sfu.NONE, "");
    }

    public sfv(sfu sfuVar, String str) {
        String strF;
        this.a = sfuVar;
        Pattern pattern = zhf.a;
        if (str == null) {
            strF = "";
        } else {
            String strD = zic.d(str, zhl.ek());
            strF = zhf.f(zhf.a.matcher(strD).matches() ? strD.substring(0, strD.lastIndexOf(64)) : strD, zhl.a);
        }
        this.b = strF;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x0050  */
    public static sfv d(zhz zhzVar) {
        sfu sfuVar;
        switch (zhzVar.f()) {
            case "net.closed":
                sfuVar = sfu.VIDEO_PLAYBACK_ERROR_TIMEOUT;
                break;
            case "net.timeout":
                sfuVar = sfu.VIDEO_PLAYBACK_ERROR_TIMEOUT;
                break;
            case "net.unavailable":
                sfuVar = sfu.VIDEO_PLAYBACK_ERROR_NO_NETWORK;
                break;
            case "net.connect":
                sfuVar = sfu.VIDEO_PLAYBACK_ERROR_CANNOT_CONNECT;
                break;
            case "net.dns":
                sfuVar = sfu.VIDEO_PLAYBACK_ERROR_UNKNOWN_HOST;
                break;
            case "fmt.noneavailable":
                sfuVar = sfu.UNSUPPORTED_VIDEO_FORMAT;
                break;
            default:
                sfuVar = sfu.VIDEO_PLAYBACK_UNKNOWN_ERROR;
                break;
        }
        return new sfv(sfuVar, zhzVar.e);
    }

    public final int a() {
        return this.a.p;
    }

    public final int b() {
        return this.a.q;
    }

    public final int c() {
        return this.a.r;
    }

    public final boolean e() {
        return this.a.p != 0;
    }

    public final String toString() {
        return "AdError: type=" + this.a.toString() + " message=" + this.b;
    }
}
