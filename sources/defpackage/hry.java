package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hry {
    public agkj a;
    public agkj b;
    private agke c;
    private agkj d;
    private long e;
    private Optional f = Optional.empty();
    private byte g;

    public final hrz a() {
        agke agkeVar;
        agkj agkjVar;
        agkj agkjVar2;
        agkj agkjVar3;
        if (this.g == 1 && (agkeVar = this.c) != null && (agkjVar = this.a) != null && (agkjVar2 = this.d) != null && (agkjVar3 = this.b) != null) {
            return new hrz(agkeVar, agkjVar, agkjVar2, agkjVar3, this.e, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" outOfSyncPlaylistIds");
        }
        if (this.a == null) {
            sb.append(" playlistIdToMaxSizeMap");
        }
        if (this.d == null) {
            sb.append(" playlistIdToStreamDownloadConditionMap");
        }
        if (this.b == null) {
            sb.append(" playlistIdToActionMetadataMap");
        }
        if (this.g == 0) {
            sb.append(" nextPlaylistAutoSyncIntervalSecs");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(anvi anviVar) {
        this.f = Optional.of(anviVar);
    }

    public final void c(long j) {
        this.e = j;
        this.g = (byte) 1;
    }

    public final void d(agke agkeVar) {
        if (agkeVar == null) {
            throw new NullPointerException("Null outOfSyncPlaylistIds");
        }
        this.c = agkeVar;
    }

    public final void e(agkj agkjVar) {
        if (agkjVar == null) {
            throw new NullPointerException("Null playlistIdToStreamDownloadConditionMap");
        }
        this.d = agkjVar;
    }
}
