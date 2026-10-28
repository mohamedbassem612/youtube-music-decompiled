package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wtu {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final agke e;
    private final agke f;
    private final aohx g;

    public wtu(boolean z, boolean z2, boolean z3, boolean z4, agke agkeVar, agke agkeVar2, aohx aohxVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = agkeVar;
        this.f = agkeVar2;
        this.g = aohxVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wtu) {
            wtu wtuVar = (wtu) obj;
            if (this.a == wtuVar.a && this.b == wtuVar.b && this.c == wtuVar.c && this.d == wtuVar.d && aguu.v(this.e, wtuVar.e) && aguu.v(this.f, wtuVar.f) && this.g.equals(wtuVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.a ? 1237 : 1231;
        return ((((((((((((i ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true == this.d ? 1231 : 1237)) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        aohx aohxVar = this.g;
        agke agkeVar = this.f;
        return "OfflineSettingCategory{isFullHdFormatOptionAvailable=" + this.a + ", isRecommendationsEnabled=" + this.b + ", isDownloadQualityEnabled=" + this.c + ", shouldDisplaySmartDownloads=" + this.d + ", downloadQualityFormats=" + String.valueOf(this.e) + ", smartDownloadsQualityFormats=" + String.valueOf(agkeVar) + ", defaultSmartDownloadsQualityFormat=" + String.valueOf(aohxVar) + '}';
    }

    public wtu() {
        throw null;
    }
}
