package defpackage;

import com.google.research.aimatter.drishti.DrishtiCache;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atvx {
    public Object a;
    public Object b;
    private long c;
    private byte d;
    private Object e;

    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.research.xeno.effect.AssetDownloader, java.lang.Object] */
    public final atvy a() {
        Object obj;
        ?? r5;
        Object obj2;
        if (this.d == 1 && (obj = this.e) != null && (r5 = this.a) != 0 && (obj2 = this.b) != null) {
            return new atvy((String) obj, this.c, r5, (agke) obj2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.e == null) {
            sb.append(" remoteAssetCacheBasePath");
        }
        if (this.d == 0) {
            sb.append(" remoteAssetCacheTtlDurationSeconds");
        }
        if (this.a == null) {
            sb.append(" assetDownloader");
        }
        if (this.b == null) {
            sb.append(" oldRemoteAssetCachePaths");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(agke agkeVar) {
        if (agkeVar == null) {
            throw new NullPointerException("Null oldRemoteAssetCachePaths");
        }
        this.b = agkeVar;
    }

    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null remoteAssetCacheBasePath");
        }
        this.e = str;
    }

    public final void d(long j) {
        this.c = j;
        this.d = (byte) 1;
    }

    public final atth e() {
        Object obj;
        if (this.d == 1 && (obj = this.e) != null) {
            return new atth(this.c, (DrishtiCache) this.b, (agke) obj, (attk) this.a);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == 0) {
            sb.append(" parentGlContextHandle");
        }
        if (this.e == null) {
            sb.append(" servicePacketHandles");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void f(long j) {
        this.c = j;
        this.d = (byte) 1;
    }

    public final void g(agke agkeVar) {
        if (agkeVar == null) {
            throw new NullPointerException("Null servicePacketHandles");
        }
        this.e = agkeVar;
    }

    public final isy h() {
        Object obj;
        Object obj2;
        Object obj3;
        if (this.d == 1 && (obj = this.a) != null && (obj2 = this.b) != null && (obj3 = this.e) != null) {
            return new isy((String) obj, this.c, (String) obj2, (String) obj3);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" title");
        }
        if (this.d == 0) {
            sb.append(" durationSec");
        }
        if (this.b == null) {
            sb.append(" artist");
        }
        if (this.e == null) {
            sb.append(" absoluteFilePath");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void i(String str) {
        if (str == null) {
            throw new NullPointerException("Null absoluteFilePath");
        }
        this.e = str;
    }

    public final void j(String str) {
        if (str == null) {
            throw new NullPointerException("Null artist");
        }
        this.b = str;
    }

    public final void k(long j) {
        this.c = j;
        this.d = (byte) 1;
    }

    public final void l(String str) {
        if (str == null) {
            throw new NullPointerException("Null title");
        }
        this.a = str;
    }
}
