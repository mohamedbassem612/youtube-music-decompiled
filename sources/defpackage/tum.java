package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum tum {
    UNKNOWN("unknown"),
    USER_INTERACTION("ui"),
    PLAYER_CONTROL_PLAY("pcp"),
    PLAYER_CONTROL_PAUSE("pcz"),
    PLAYER_CONTROL_SEEK_ABSOLUTE("pcsa"),
    PLAYER_CONTROL_SEEK_RELATIVE("pcsr"),
    PLAYER_CONTROL_SKIP_PREVIOUS("pcsp"),
    PLAYER_CONTROL_SKIP_NEXT("pcsn"),
    PLAYER_CONTROL_RETRY("pcr"),
    PLAYER_CONTROL_REPLAY("pcrl"),
    PLAYER_CONTROL_TOGGLE_FULLSCREEN("pcf"),
    PLAYER_CONTROL_DISMISS("pcd"),
    LIVE_CHAT_ON_USER_INTERACTION("lci"),
    LIVE_CHAT_TEXT_TYPING("lcti"),
    APP_RESUMED("ar"),
    CONFIGURATION_CHANGED("cc"),
    VOICE_SEARCH_ON_RESUME("vs"),
    VOICE_SEARCH_ON_USER_INTERACTION("vsi"),
    VOICE_SEARCH_ON_CONFIGURATION_CHANGED("vscc"),
    SETTINGS_ON_RESUME("st"),
    SETTINGS_ON_USER_INTERACTION("sti");

    public final String v;

    tum(String str) {
        this.v = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.v;
    }
}
