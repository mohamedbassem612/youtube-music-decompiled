package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum goa {
    SEARCH("search_empty"),
    VOICE_SEARCH("voice_search"),
    SEARCH_PRIMARY_RESULT("search_primary"),
    PLAYLIST("playlist_tag"),
    PLAYLIST_SETTINGS_EDITOR("playlist_settings_editor_tag"),
    ENTITY("entity_tag"),
    LOADING("loading_tag"),
    SEARCH_LANDING_PAGE("TAGsearch_landing_page"),
    PLAYLIST_FILTER_SEARCH_INPUT("playlist_filter_search_input_tag");

    public final String j;

    goa(String str) {
        this.j = str;
    }
}
