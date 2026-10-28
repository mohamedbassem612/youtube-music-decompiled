package defpackage;

import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bse {
    public static final /* synthetic */ int T = 0;
    public final float A;
    public final int B;
    public final boolean C;
    public final float D;
    public final byte[] E;
    public final int F;
    public final bru G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public final int P;
    public final int Q;
    public final int R;
    public final int S;
    private int U;
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final int e;
    public final int f;
    public final float g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final String l;
    public final bsx m;
    public final Object n;
    public final String o;
    public final String p;
    public final String q;
    public final int r;
    public final int s;
    public final List t;
    public final bsa u;
    public final long v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    static {
        new bse(new bsd());
        int i = bwp.a;
    }

    public bse(bsd bsdVar) {
        boolean z;
        String str;
        this.a = bsdVar.a;
        String strR = bwp.R(bsdVar.d);
        this.d = strR;
        if (bsdVar.c.isEmpty() && bsdVar.b != null) {
            this.c = agke.q(new bsg(strR, bsdVar.b));
            this.b = bsdVar.b;
        } else if (bsdVar.c.isEmpty() || bsdVar.b != null) {
            if (!bsdVar.c.isEmpty() || bsdVar.b != null) {
                int i = 0;
                while (true) {
                    if (i >= bsdVar.c.size()) {
                        z = false;
                        break;
                    } else {
                        if (((bsg) bsdVar.c.get(i)).b.equals(bsdVar.b)) {
                            z = true;
                            break;
                        }
                        i++;
                    }
                }
            } else {
                z = true;
                break;
            }
            ahno.O(z);
            this.c = bsdVar.c;
            this.b = bsdVar.b;
        } else {
            this.c = bsdVar.c;
            List list = bsdVar.c;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((bsg) list.get(0)).b;
                    break;
                }
                bsg bsgVar = (bsg) it.next();
                if (TextUtils.equals(bsgVar.a, strR)) {
                    str = bsgVar.b;
                    break;
                }
            }
            this.b = str;
        }
        this.e = bsdVar.e;
        ahno.P(bsdVar.h == 0 || (bsdVar.f & 32768) != 0, "Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set");
        this.f = bsdVar.f;
        this.g = bsdVar.g;
        this.h = bsdVar.h;
        int i2 = bsdVar.i;
        this.i = i2;
        int i3 = bsdVar.j;
        this.j = i3;
        this.k = i3 != -1 ? i3 : i2;
        this.l = bsdVar.k;
        this.m = bsdVar.l;
        this.n = null;
        this.o = bsdVar.m;
        this.p = bsdVar.n;
        this.q = bsdVar.o;
        this.r = bsdVar.p;
        this.s = bsdVar.q;
        List list2 = bsdVar.r;
        this.t = list2 == null ? Collections.EMPTY_LIST : list2;
        bsa bsaVar = bsdVar.s;
        this.u = bsaVar;
        this.v = bsdVar.t;
        this.w = bsdVar.u;
        this.x = bsdVar.v;
        this.y = bsdVar.w;
        this.z = bsdVar.x;
        this.A = bsdVar.y;
        int i4 = bsdVar.z;
        this.B = i4 == -1 ? 0 : i4;
        this.C = bsdVar.A;
        float f = bsdVar.B;
        this.D = f == -1.0f ? 1.0f : f;
        this.E = bsdVar.C;
        this.F = bsdVar.D;
        this.G = bsdVar.E;
        this.H = bsdVar.F;
        int i5 = bsdVar.G;
        this.I = i5;
        int i6 = bsdVar.H;
        this.J = i6;
        if (i5 != -1 && i6 != -1) {
            ahno.S(Integer.bitCount(i6) == i5, "channelCount and channelMask are inconsistent. channelCount=%s, channelMask=%s", i5, i6);
        }
        this.K = bsdVar.I;
        this.L = bsdVar.J;
        int i7 = bsdVar.K;
        this.M = i7 == -1 ? 0 : i7;
        int i8 = bsdVar.L;
        this.N = i8 != -1 ? i8 : 0;
        this.O = bsdVar.M;
        this.P = bsdVar.N;
        this.Q = bsdVar.O;
        this.R = bsdVar.P;
        int i9 = bsdVar.Q;
        this.S = (i9 != 0 || bsaVar == null) ? i9 : 1;
    }

    public static String c(bse bseVar) {
        String str;
        String string;
        int i;
        int i2;
        if (bseVar == null) {
            return "null";
        }
        ager agerVarD = ager.d(',');
        StringBuilder sb = new StringBuilder();
        sb.append("id=");
        sb.append(bseVar.a);
        sb.append(", mimeType=");
        sb.append(bseVar.q);
        String str2 = bseVar.p;
        if (str2 != null) {
            sb.append(", container=");
            sb.append(str2);
        }
        String str3 = bseVar.o;
        if (str3 != null) {
            sb.append(", primaryGroupId=");
            sb.append(str3);
        }
        int i3 = bseVar.k;
        if (i3 != -1) {
            sb.append(", bitrate=");
            sb.append(i3);
        }
        float f = bseVar.g;
        if (f != -1.0f) {
            sb.append(", selectionPriority=");
            sb.append(f);
        }
        String str4 = bseVar.l;
        if (str4 != null) {
            sb.append(", codecs=");
            sb.append(str4);
        }
        bsa bsaVar = bseVar.u;
        if (bsaVar != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i4 = 0; i4 < bsaVar.c; i4++) {
                UUID uuid = bsaVar.a(i4).a;
                if (uuid.equals(brt.b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(brt.c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(brt.e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(brt.d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(brt.a)) {
                    linkedHashSet.add("universal");
                } else {
                    linkedHashSet.add(a.cn((byte) 41, uuid, "unknown ("));
                }
            }
            sb.append(", drm=[");
            agerVarD.i(sb, linkedHashSet);
            sb.append(']');
        }
        int i5 = bseVar.w;
        if (i5 != -1 && (i2 = bseVar.x) != -1) {
            sb.append(", res=");
            sb.append(i5);
            sb.append('x');
            sb.append(i2);
        }
        int i6 = bseVar.y;
        if (i6 != -1 && (i = bseVar.z) != -1) {
            sb.append(", decRes=");
            sb.append(i6);
            sb.append('x');
            sb.append(i);
        }
        float f2 = bseVar.D;
        int i7 = 1;
        if (!ahbd.c(f2, 1.0d, 0.001d)) {
            sb.append(", par=");
            sb.append(bwp.K("%.3f", Float.valueOf(f2)));
        }
        bru bruVar = bseVar.G;
        if (bruVar != null && (bruVar.f() || bruVar.g())) {
            sb.append(", color=");
            String strK = bruVar.g() ? bwp.K("%s/%s/%s", bru.d(bruVar.b), bru.c(bruVar.c), bru.e(bruVar.d)) : "NA/NA/NA";
            if (bruVar.f()) {
                int i8 = bruVar.f;
                int i9 = bruVar.g;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i8);
                sb2.append('/');
                sb2.append(i9);
                string = sb2.toString();
            } else {
                string = "NA/NA";
            }
            sb.append(a.cl(string, (byte) 47, strK));
        }
        float f3 = bseVar.A;
        if (f3 != -1.0f) {
            sb.append(", fps=");
            sb.append(f3);
        }
        int i10 = bseVar.B;
        if (i10 != 0) {
            sb.append(", rotation=");
            sb.append(i10);
        }
        if (bseVar.C) {
            sb.append(", mirrorHorizontal");
        }
        int i11 = bseVar.H;
        if (i11 != -1) {
            sb.append(", maxSubLayers=");
            sb.append(i11);
        }
        int i12 = bseVar.I;
        if (i12 != -1) {
            sb.append(", channels=");
            sb.append(i12);
        }
        int i13 = bseVar.J;
        if (i13 != -1) {
            sb.append(", channel_mask=");
            sb.append(i13);
        }
        int i14 = bseVar.K;
        if (i14 != -1) {
            sb.append(", sample_rate=");
            sb.append(i14);
        }
        String str5 = bseVar.d;
        if (str5 != null) {
            sb.append(", language=");
            sb.append(str5);
        }
        List list = bseVar.c;
        if (!list.isEmpty()) {
            sb.append(", labels=[");
            agerVarD.i(sb, aguu.u(list, new cbs(i7)));
            sb.append(']');
        }
        int i15 = bseVar.e;
        if (i15 != 0) {
            sb.append(", selectionFlags=[");
            int i16 = bwp.a;
            ArrayList arrayList = new ArrayList();
            if ((i15 & 4) != 0) {
                arrayList.add("auto");
            }
            if ((i15 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i15 & 2) != 0) {
                arrayList.add("forced");
            }
            agerVarD.i(sb, arrayList);
            sb.append(']');
        }
        int i17 = bseVar.f;
        if (i17 != 0) {
            sb.append(", roleFlags=[");
            int i18 = i17 & 32768;
            int i19 = bwp.a;
            ArrayList arrayList2 = new ArrayList();
            if ((i17 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i17 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i17 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i17 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i17 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i17 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i17 & 64) != 0) {
                arrayList2.add("caption");
            }
            if ((i17 & SemanticState.Focused) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i17 & SemanticState.Hidden) != 0) {
                arrayList2.add("sign");
            }
            if ((i17 & SemanticState.LiveRegion) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i17 & SemanticState.ReadOnly) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i17 & SemanticState.Modal) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i17 & SemanticState.Obscured) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i17 & SemanticState.Multiline) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i17 & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            if (i18 != 0) {
                arrayList2.add("auxiliary");
            }
            agerVarD.i(sb, arrayList2);
            sb.append(']');
        }
        if ((i17 & 32768) != 0) {
            sb.append(", auxiliaryTrackType=");
            int i20 = bseVar.h;
            int i21 = bwp.a;
            if (i20 == 0) {
                str = "undefined";
            } else if (i20 == 1) {
                str = "original";
            } else if (i20 == 2) {
                str = "depth-linear";
            } else if (i20 == 3) {
                str = "depth-inverse";
            } else {
                if (i20 != 4) {
                    throw new IllegalStateException("Unsupported auxiliary track type");
                }
                str = "depth metadata";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public final int a() {
        int i;
        int i2 = this.w;
        if (i2 == -1 || (i = this.x) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public final bse b(int i) {
        bsd bsdVar = new bsd(this);
        bsdVar.Q = i;
        return new bse(bsdVar);
    }

    public final boolean d(bse bseVar) {
        List list = this.t;
        int size = list.size();
        List list2 = bseVar.t;
        if (size != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            bse bseVar = (bse) obj;
            int i2 = this.U;
            if ((i2 == 0 || (i = bseVar.U) == 0 || i2 == i) && this.e == bseVar.e && this.f == bseVar.f && this.h == bseVar.h && this.i == bseVar.i && this.j == bseVar.j && this.r == bseVar.r && this.v == bseVar.v && this.w == bseVar.w && this.x == bseVar.x && this.y == bseVar.y && this.z == bseVar.z && this.B == bseVar.B && this.C == bseVar.C && this.F == bseVar.F && this.H == bseVar.H && this.I == bseVar.I && this.J == bseVar.J && this.K == bseVar.K && this.L == bseVar.L && this.M == bseVar.M && this.N == bseVar.N && this.O == bseVar.O && this.Q == bseVar.Q && this.R == bseVar.R && this.S == bseVar.S && Float.compare(this.A, bseVar.A) == 0 && Float.compare(this.g, bseVar.g) == 0 && Float.compare(this.D, bseVar.D) == 0 && Objects.equals(this.a, bseVar.a) && Objects.equals(this.b, bseVar.b) && this.c.equals(bseVar.c) && Objects.equals(this.l, bseVar.l) && Objects.equals(this.o, bseVar.o) && Objects.equals(this.p, bseVar.p) && Objects.equals(this.q, bseVar.q) && Objects.equals(this.d, bseVar.d) && Arrays.equals(this.E, bseVar.E) && Objects.equals(this.m, bseVar.m) && Objects.equals(this.G, bseVar.G) && Objects.equals(this.u, bseVar.u) && d(bseVar) && Objects.equals(null, null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.U;
        if (i != 0) {
            return i;
        }
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        int iHashCode2 = ((((iHashCode + 527) * 31) + (str2 == null ? 0 : str2.hashCode())) * 31) + this.c.hashCode();
        String str3 = this.d;
        int iHashCode3 = ((((((((((((((iHashCode2 * 31) + (str3 == null ? 0 : str3.hashCode())) * 31) + this.e) * 31) + this.f) * 31) + Float.floatToIntBits(this.g)) * 31) + this.h) * 31) + this.i) * 31) + this.j) * 31;
        String str4 = this.l;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        bsx bsxVar = this.m;
        int iHashCode5 = iHashCode4 + (bsxVar == null ? 0 : bsxVar.hashCode());
        String str5 = this.o;
        int iHashCode6 = ((iHashCode5 * 961) + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.p;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.q;
        int iHashCode8 = ((((((((((((((((((((((((((((((((((((((((((((((iHashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31) + this.r) * 31) + ((int) this.v)) * 31) + this.w) * 31) + this.x) * 31) - 1) * 31) + this.y) * 31) + this.z) * 31) + Float.floatToIntBits(this.A)) * 31) + this.B) * 31) + (this.C ? 1 : 0)) * 31) + Float.floatToIntBits(this.D)) * 31) + this.F) * 31) + this.H) * 31) + this.I) * 31) + this.J) * 31) + this.K) * 31) + this.L) * 31) + this.M) * 31) + this.N) * 31) + this.O) * 31) + this.Q) * 31) + this.R) * 31) + this.S;
        this.U = iHashCode8;
        return iHashCode8;
    }

    public final String toString() {
        return "Format(" + this.a + ", " + this.b + ", " + this.p + ", " + this.q + ", " + this.l + ", " + this.k + ", " + this.d + ", [" + this.w + ", " + this.x + ", " + this.A + ", " + String.valueOf(this.G) + "], [" + this.I + ", " + this.J + ", " + this.K + "])";
    }
}
