package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xmr {
    public static final /* synthetic */ int m = 0;
    public final int e;
    public final String a = "m";
    public final String b = "2DB7CC49";
    public final String c = "YouTube";
    public final String d = "urn:x-cast:com.google.youtube.mdx";
    private final boolean n = false;
    public final int f = 1;
    public final boolean g = true;
    public final boolean h = true;
    public final boolean i = true;
    public final boolean j = true;
    public final boolean k = true;
    public final boolean l = true;

    static {
        twu.b("MDX.MdxModuleConfig");
    }

    public xmr(int i) {
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xmr) {
            xmr xmrVar = (xmr) obj;
            if (awrc.c(this.a, xmrVar.a) && awrc.c(this.b, xmrVar.b) && awrc.c(this.c, xmrVar.c) && awrc.c(this.d, xmrVar.d) && this.e == xmrVar.e) {
                boolean z = xmrVar.n;
                int i = xmrVar.f;
                boolean z2 = xmrVar.g;
                boolean z3 = xmrVar.h;
                boolean z4 = xmrVar.i;
                boolean z5 = xmrVar.j;
                boolean z6 = xmrVar.k;
                boolean z7 = xmrVar.l;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e) * 31) + a.aj(false)) * 31) + 1) * 31) + a.aj(true)) * 31) + a.aj(true)) * 31) + a.aj(true)) * 31) + a.aj(true)) * 31) + a.aj(true)) * 31) + a.aj(true);
    }

    public final String toString() {
        return "MdxModuleConfig(theme=m, castAppId=" + this.b + ", dialAppName=" + this.c + ", castDataChannelNameSpace=" + this.d + ", remoteNotificationIconResId=" + this.e + ", isLockscreenAdSupported=false, multiUserSession=1, isForceQueueingEnabled=true, isMdxPlaybackQueueEnabled=true, isMdxLoopModeEnabled=true, isSuggestedCastDevicesEnabled=true, restrictCastingForUnder13Accounts=true, fallbackToLocalInitialPlaybackDescriptor=true)";
    }
}
