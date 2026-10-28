package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zau extends IOException implements zjs {
    public final long a;
    public final long b;
    public final long c;
    public final String d;

    public zau(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j3;
        this.c = j4;
        this.d = "seekTimeUs." + j + ";errorChunks." + j2 + ";newSequence." + j3;
    }

    @Override // defpackage.zjs
    public final String a(boolean z) {
        return "player.exception";
    }

    @Override // defpackage.zjs
    public final String b() {
        return "info.ManifestlessSeek;".concat(String.valueOf(this.d));
    }
}
