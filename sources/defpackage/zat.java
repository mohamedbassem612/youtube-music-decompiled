package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zat extends IOException implements zjs {
    public final long a;
    public final String b;

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    public zat(long j, long j2) {
        zkf.a((j > j2 ? 1 : (j == j2 ? 0 : -1)) >>> 31);
        this.a = j2;
        this.b = "diff." + (j2 - j);
    }

    @Override // defpackage.zjs
    public final String a(boolean z) {
        return "manifestless.head.race";
    }

    @Override // defpackage.zjs
    public final String b() {
        return this.b;
    }
}
