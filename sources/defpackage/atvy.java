package defpackage;

import com.google.research.xeno.effect.AssetDownloader;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class atvy {
    public final String a;
    public final long b;
    public final AssetDownloader c;
    public final agke d;

    public atvy(String str, long j, AssetDownloader assetDownloader, agke agkeVar) {
        this.a = str;
        this.b = j;
        this.c = assetDownloader;
        this.d = agkeVar;
    }

    public static atvx a() {
        atvx atvxVar = new atvx();
        atvxVar.d(-1L);
        atvxVar.b(agpi.a);
        return atvxVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof atvy) {
            atvy atvyVar = (atvy) obj;
            if (this.a.equals(atvyVar.a) && this.b == atvyVar.b && this.c.equals(atvyVar.c) && aguu.v(this.d, atvyVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return (((((iHashCode * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        agke agkeVar = this.d;
        return "Config{remoteAssetCacheBasePath=" + this.a + ", remoteAssetCacheTtlDurationSeconds=" + this.b + ", assetDownloader=" + String.valueOf(this.c) + ", oldRemoteAssetCachePaths=" + String.valueOf(agkeVar) + '}';
    }

    public atvy() {
        throw null;
    }
}
