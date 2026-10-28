package defpackage;

import app.rive.semantics.SemanticState;
import j$.util.Objects;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xyv {
    public static final xyv a = new xyv(null, null, null, 0, null, null, null, null, null, null, false, null, null, null, null, false, 524287);
    public final String b;
    public final xzv c;
    public final List d;
    public final long e;
    public final acca f;
    public final String g;
    public final Integer h;
    public final String i;
    public final String j;
    public final String k;
    public final boolean l;
    public final boolean m;
    public final aigj n;
    public final aigj o;
    public final String p;
    public final xyn q;
    public final String r;
    public final List s;
    public final boolean t;

    public /* synthetic */ xyv(String str, xzv xzvVar, List list, long j, acca accaVar, String str2, Integer num, String str3, String str4, String str5, boolean z, aigj aigjVar, String str6, String str7, List list2, boolean z2, int i) {
        List list3 = (131072 & i) != 0 ? awno.a : list2;
        int i2 = i & 2;
        int i3 = i & 4;
        int i4 = i & 8;
        int i5 = i & 16;
        int i6 = i & 32;
        int i7 = i & 64;
        int i8 = i & SemanticState.Focused;
        int i9 = i & SemanticState.Hidden;
        int i10 = i & SemanticState.LiveRegion;
        int i11 = i & SemanticState.Modal;
        int i12 = i & SemanticState.Obscured;
        int i13 = i & 16384;
        int i14 = 65536 & i;
        boolean z3 = i11 == 0;
        int i15 = i & 1;
        String str8 = i14 != 0 ? "" : str7;
        String str9 = i13 != 0 ? null : str6;
        aigj aigjVar2 = i12 != 0 ? null : aigjVar;
        boolean z4 = z3 & z;
        String str10 = i10 != 0 ? null : str5;
        String str11 = i9 != 0 ? null : str4;
        String str12 = i8 != 0 ? "" : str3;
        Integer num2 = i7 != 0 ? null : num;
        String str13 = i6 != 0 ? "" : str2;
        acca accaVar2 = i5 != 0 ? null : accaVar;
        long j2 = i4 != 0 ? 0L : j;
        List list4 = i3 != 0 ? null : list;
        xzv xzvVar2 = i2 != 0 ? null : xzvVar;
        String str14 = str8;
        String str15 = 1 == i15 ? "" : str;
        boolean z5 = (i & 262144) == 0;
        str15.getClass();
        str13.getClass();
        str12.getClass();
        str14.getClass();
        list3.getClass();
        this.b = str15;
        this.c = xzvVar2;
        this.d = list4;
        this.e = j2;
        this.f = accaVar2;
        this.g = str13;
        this.h = num2;
        this.i = str12;
        this.j = str11;
        this.k = str10;
        this.l = false;
        this.m = z4;
        this.n = aigjVar2;
        this.o = null;
        this.p = str9;
        this.q = null;
        this.r = str14;
        this.s = list3;
        this.t = z5 & z2;
    }

    public static final int b(int i) {
        Integer numValueOf = Integer.valueOf(i + 1);
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : a.a();
    }

    public final int a() {
        Integer num = this.h;
        if (num != null) {
            return awro.f(num.intValue(), -1);
        }
        return -1;
    }

    public final boolean c() {
        return this.g.length() > 0;
    }

    public final boolean d() {
        return this.b.length() > 0;
    }

    public final boolean e() {
        return d() || c();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xyv) {
            xyv xyvVar = (xyv) obj;
            if (g(xyvVar.b) && f(xyvVar.g) && awrc.c(xyvVar.i, this.i) && a() == xyvVar.a()) {
                boolean z = xyvVar.l;
                if (awrc.c(this.j, xyvVar.j) && awrc.c(this.k, xyvVar.k) && awrc.c(this.n, xyvVar.n)) {
                    aigj aigjVar = xyvVar.o;
                    if (awrc.c(null, null) && awrc.c(this.r, xyvVar.r)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean f(String str) {
        if (str == null) {
            return false;
        }
        String str2 = this.g;
        return awrc.c(str2, str) || (awrc.n(str2, "RQ", false) && awrc.n(str, "RQ", false));
    }

    public final boolean g(String str) {
        return awrc.c(str, this.b);
    }

    public final boolean h(xyv xyvVar) {
        return g(xyvVar.b) && f(xyvVar.g);
    }

    public final int hashCode() {
        String str = this.b;
        String str2 = this.i;
        String str3 = this.g;
        if (true == awrc.n(str3, "RQ", false)) {
            str3 = null;
        }
        return Objects.hash(str, str2, str3 != null ? str3 : "RQ", Integer.valueOf(a()), this.j, this.k, Boolean.FALSE, this.n, null, this.r);
    }

    public final String toString() {
        return "MdxPlaybackDescriptor(videoId=" + this.b + ", videoEntry=" + this.c + ", videoIds=" + this.d + ", currentPositionMillis=" + this.e + ", subtitleTrack=" + this.f + ", playlistId=" + this.g + ", playlistIndexOrNull=" + this.h + ", activeSourceVideoId=" + this.i + ", watchParams=" + this.j + ", playerParams=" + this.k + ", forceReloadPlayback=false, isPlaybackCurrentlyPaused=" + this.m + ", clickTrackingParams=" + this.n + ", queueContextParams=null, csn=" + this.p + ", mdxClientAppInfo=null, remotePlayabilityStatusParams=" + this.r + ", videoEntries=" + this.s + ", prioritizeSenderPlayback=" + this.t + ')';
    }

    public xyv() {
        this(null, null, null, 0L, null, null, null, null, null, null, false, null, null, null, null, false, 524287);
    }
}
