package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hrz {
    public final agke a;
    public final agkj b;
    public final agkj c;
    public final agkj d;
    public final long e;
    public final Optional f;

    public hrz(agke agkeVar, agkj agkjVar, agkj agkjVar2, agkj agkjVar3, long j, Optional optional) {
        this.a = agkeVar;
        this.b = agkjVar;
        this.c = agkjVar2;
        this.d = agkjVar3;
        this.e = j;
        this.f = optional;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hrz) {
            hrz hrzVar = (hrz) obj;
            if (aguu.v(this.a, hrzVar.a) && aguu.q(this.b, hrzVar.b) && aguu.q(this.c, hrzVar.c) && aguu.q(this.d, hrzVar.d) && this.e == hrzVar.e && this.f.equals(hrzVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
        long j = this.e;
        return (((iHashCode * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        Optional optional = this.f;
        agkj agkjVar = this.d;
        agkj agkjVar2 = this.c;
        agkj agkjVar3 = this.b;
        return "PlaylistRefreshParameters{outOfSyncPlaylistIds=" + String.valueOf(this.a) + ", playlistIdToMaxSizeMap=" + String.valueOf(agkjVar3) + ", playlistIdToStreamDownloadConditionMap=" + String.valueOf(agkjVar2) + ", playlistIdToActionMetadataMap=" + String.valueOf(agkjVar) + ", nextPlaylistAutoSyncIntervalSecs=" + this.e + ", musicPodcastContentExpiryPolicy=" + String.valueOf(optional) + '}';
    }

    public hrz() {
        throw null;
    }
}
