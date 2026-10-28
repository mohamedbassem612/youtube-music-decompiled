package com.google.android.apps.youtube.music.offline.appsearch.schema;

import defpackage.sb;
import defpackage.sj;
import defpackage.sl;
import defpackage.sm;
import defpackage.sr;
import defpackage.ss;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.apps.youtube.music.offline.appsearch.schema.$$__AppSearch__MusicOfflinePlaylistAppSearchDocument, reason: invalid class name */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class C$$__AppSearch__MusicOfflinePlaylistAppSearchDocument implements sm {
    @Override // defpackage.sm
    public final sl a() {
        sb sbVar = new sb("MusicPlaylist");
        sj sjVar = new sj("name");
        sjVar.b(3);
        sjVar.e(1);
        sjVar.c(2);
        sjVar.d(0);
        sbVar.c(sjVar.a());
        sj sjVar2 = new sj("owner");
        sjVar2.b(2);
        sjVar2.e(1);
        sjVar2.c(2);
        sjVar2.d(0);
        sbVar.c(sjVar2.a());
        sj sjVar3 = new sj("playlistTrackNames");
        sjVar3.b(1);
        sjVar3.e(1);
        sjVar3.c(2);
        sjVar3.d(0);
        sbVar.c(sjVar3.a());
        return sbVar.a();
    }

    @Override // defpackage.sm
    public final /* bridge */ /* synthetic */ ss b(Object obj) {
        MusicOfflinePlaylistAppSearchDocument musicOfflinePlaylistAppSearchDocument = (MusicOfflinePlaylistAppSearchDocument) obj;
        sr srVar = new sr(musicOfflinePlaylistAppSearchDocument.b, musicOfflinePlaylistAppSearchDocument.a, "MusicPlaylist");
        String str = musicOfflinePlaylistAppSearchDocument.c;
        if (str != null) {
            srVar.i("name", str);
        }
        String str2 = musicOfflinePlaylistAppSearchDocument.d;
        if (str2 != null) {
            srVar.i("owner", str2);
        }
        List list = musicOfflinePlaylistAppSearchDocument.e;
        if (list != null) {
            srVar.i("playlistTrackNames", (String[]) list.toArray(new String[0]));
        }
        return srVar.d();
    }

    @Override // defpackage.sm
    public final List c() {
        return Collections.EMPTY_LIST;
    }
}
