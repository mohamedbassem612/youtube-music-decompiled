package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public enum hdt {
    MUSIC_SEARCH_CATALOG("music_search_catalog"),
    MUSIC_SEARCH_UPLOAD("music_search_upload"),
    MUSIC_SEARCH_SIDELOADED("music_search_device_files"),
    MUSIC_SEARCH_DOWNLOADS("music_search_downloads"),
    MUSIC_SEARCH_LIBRARY("music_search_library");

    public static final agkj f;
    public final String g;

    static {
        hdt hdtVar = MUSIC_SEARCH_CATALOG;
        hdt hdtVar2 = MUSIC_SEARCH_UPLOAD;
        hdt hdtVar3 = MUSIC_SEARCH_SIDELOADED;
        hdt hdtVar4 = MUSIC_SEARCH_DOWNLOADS;
        hdt hdtVar5 = MUSIC_SEARCH_LIBRARY;
        String str = hdtVar5.g;
        f = agkj.n(hdtVar.g, hdtVar, hdtVar2.g, hdtVar2, hdtVar3.g, hdtVar3, hdtVar4.g, hdtVar4, str, hdtVar5);
    }

    hdt(String str) {
        this.g = str;
    }
}
