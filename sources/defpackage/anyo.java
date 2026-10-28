package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anyo implements weh {
    static final anyn a;
    public static final weq b;
    private final anyp c;

    static {
        anyn anynVar = new anyn();
        a = anynVar;
        b = anynVar;
    }

    public anyo(anyp anypVar) {
        this.c = anypVar;
    }

    @Override // defpackage.weh
    public final agkz a() {
        agkx agkxVar = new agkx();
        anyp anypVar = this.c;
        if ((anypVar.b & 4) != 0) {
            agkxVar.c(anypVar.d);
        }
        if (anypVar.h.size() > 0) {
            agkxVar.j(anypVar.h);
        }
        if ((anypVar.b & 64) != 0) {
            agkxVar.c(anypVar.k);
        }
        return agkxVar.g();
    }

    @Override // defpackage.weh
    public final String b() {
        return this.c.c;
    }

    @Override // defpackage.weh
    public final byte[] c() {
        return this.c.toByteArray();
    }

    @Override // defpackage.weh
    public final /* bridge */ /* synthetic */ tzk d() {
        return new anym((aihh) this.c.toBuilder());
    }

    public final boolean e() {
        return (this.c.b & 32) != 0;
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof anyo) && this.c.equals(((anyo) obj).c);
    }

    public Long getAddedTimestampMillis() {
        return Long.valueOf(this.c.e);
    }

    public Long getLastMetadataRefreshDateMillis() {
        return Long.valueOf(this.c.l);
    }

    public Long getLastPlaybackTimestampMillis() {
        return Long.valueOf(this.c.g);
    }

    public anxf getSmartDownloadMetadata() {
        anxf anxfVar = this.c.i;
        return anxfVar == null ? anxf.a : anxfVar;
    }

    public List getTrackRemovalFeedbacks() {
        return this.c.f;
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "MusicTrackDownloadMetadataEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
