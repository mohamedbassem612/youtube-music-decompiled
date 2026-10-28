package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum xvu {
    ADD_VIDEO("addVideo"),
    ADD_VIDEOS("addVideos"),
    AD_PLAYING("adPlaying"),
    ON_AD_INFO_CHANGED("onAdInfoChange"),
    ON_AD_STATE_CHANGED("onAdStateChange"),
    CLEAR_PLAYLIST("clearPlaylist"),
    CONFIRM_PLAYLIST_UPDATE("confirmPlaylistUpdate"),
    INSERT_VIDEO("insertVideo"),
    INSERT_VIDEOS("insertVideos"),
    LOUNGE_STATUS("loungeStatus"),
    MOVE_VIDEO("moveVideo"),
    SET_PLAYBACK_SPEED("setPlaybackSpeed"),
    ON_PLAYBACK_SPEED_CHANGED("onPlaybackSpeedChanged"),
    CONNECT_PARAMS("connectParams"),
    NEXT("next"),
    NOOP("noop"),
    NOW_PLAYING("nowPlaying"),
    NOW_PLAYING_PLAYLIST("nowPlayingPlaylist"),
    ON_SUBTITLES_TRACK_CHANGED("onSubtitlesTrackChanged"),
    PAUSE("pause"),
    PLAY("play"),
    PLAYLIST_MODIFIED("playlistModified"),
    PREVIOUS("previous"),
    REMOVE_VIDEO("removeVideo"),
    SCREEN_DISCONNECTED("loungeScreenDisconnected"),
    SEEK_TO("seekTo"),
    SET_AUDIO_TRACK("setAudioTrack"),
    SET_PLAYLIST("setPlaylist"),
    SET_SUBTITLES_TRACK("setSubtitlesTrack"),
    SET_VIDEO("setVideo"),
    SET_VOLUME("setVolume"),
    ON_VOLUME_CHANGED("onVolumeChanged"),
    SHOW_QR_CODE("showQrCode"),
    SKIP_AD("skipAd"),
    ON_STATE_CHANGED("onStateChange"),
    STOP("stopVideo"),
    NOW_AUTONAVING("nowAutoplaying"),
    AUTONAV_DISMISSED("autoplayDismissed"),
    DISMISS_AUTONAV("dismissAutoplay"),
    AUTONAV_UP_NEXT("autoplayUpNext"),
    ON_AUTONAV_MODE_CHANGED("onAutoplayModeChanged"),
    SET_AUTONAV_MODE("setAutoplayMode"),
    ON_AUDIO_TRACK_LIST_CHANGED("onAudioTrackListChanged"),
    ON_AUDIO_TRACK_CHANGED("onAudioTrackChanged"),
    ON_USER_ACTIVITY("onUserActivity"),
    ON_PLAYLIST_MODE_CHANGED("onPlaylistModeChanged"),
    SET_PLAYLIST_MODE("setPlaylistMode"),
    ON_LOOP_MODE_CHANGED("onLoopModeChanged"),
    SET_LOOP_MODE("setLoopMode"),
    GRACEFUL_RECONNECT("gracefulReconnect"),
    SEND_DEBUG_COMMAND("sendDebugCommand"),
    CUSTOM("custom"),
    MDX_SESSION_STATUS("mdxSessionStatus"),
    MDX_REMOTE_STATUS("mdxRemoteStatus"),
    ENCRYPTION("mdxEncrypted"),
    REQUEST_ASSISTED_SIGN_IN("requestAssistedSignIn"),
    VOICE_COMMAND("voiceCommand"),
    DPAD_COMMAND("dpadCommand"),
    SET_IMPACTED_SESSIONS_SERVER_EVENT("setImpactedSessionsServerEvent"),
    ON_HAS_PREVIOUS_NEXT_CHANGED("onHasPreviousNextChanged"),
    HEARTBEAT("heartbeat"),
    ON_HEARTBEAT_RECEIVED("onHeartbeatReceived"),
    START_SIGN_IN("startSignIn"),
    RECEIVER_STATUS("receiverStatus"),
    GET_RECEIVER_STATUS("getReceiverStatus"),
    START_TRANSFER_SESSION("startTransferSession"),
    ON_TRANSFER_SESSION("transferSession"),
    RESUME_SESSION("resumeSession"),
    ON_COMPOSITE_VIDEO_STATE_CHANGED("onCompositeVideoStateChanged"),
    SET_COMPOSITE_VIDEO_STATE("setCompositeVideoState"),
    ON_PARTY_GAMES_MODE_CHANGED("onPartyGamesModeChanged"),
    SET_SHARED_PLAYBACK_VIDEO("setSharedPlaybackVideo"),
    PLAYBACK_STATE_HEARTBEAT("playbackStateHeartbeat"),
    ON_SHARED_PLAYBACK_STATE_CHANGED("onSharedPlaybackStateChanged"),
    ON_LOCAL_PLAYBACK_STATE_CHANGED("onLocalPlaybackStateChanged"),
    ON_CONFERENCE_UPDATED("onConferenceUpdated"),
    RESOLVE_GENERATIVE_PARTY_GAMES_COMMAND("resolveGenerativePartyGamesCommand"),
    ON_GENERATIVE_PARTY_GAMES_STATE_CHANGE("onGenerativePartyGamesStateChange");

    private static final Map aB;
    public final String aA;

    static {
        xvu xvuVar = SET_PLAYBACK_SPEED;
        xvu xvuVar2 = NEXT;
        xvu xvuVar3 = PAUSE;
        xvu xvuVar4 = PLAY;
        xvu xvuVar5 = PREVIOUS;
        xvu xvuVar6 = SEEK_TO;
        xvu xvuVar7 = SET_AUDIO_TRACK;
        xvu xvuVar8 = SET_SUBTITLES_TRACK;
        xvu xvuVar9 = SET_VOLUME;
        xvu xvuVar10 = SKIP_AD;
        xvu xvuVar11 = STOP;
        xvu xvuVar12 = ON_USER_ACTIVITY;
        xvu xvuVar13 = SEND_DEBUG_COMMAND;
        xvu xvuVar14 = MDX_REMOTE_STATUS;
        xvu xvuVar15 = ENCRYPTION;
        xvu xvuVar16 = VOICE_COMMAND;
        xvu xvuVar17 = DPAD_COMMAND;
        xvu xvuVar18 = SET_SHARED_PLAYBACK_VIDEO;
        xvu xvuVar19 = PLAYBACK_STATE_HEARTBEAT;
        xvu xvuVar20 = ON_SHARED_PLAYBACK_STATE_CHANGED;
        xvu xvuVar21 = ON_LOCAL_PLAYBACK_STATE_CHANGED;
        xvu xvuVar22 = ON_CONFERENCE_UPDATED;
        aB = new HashMap();
        agkz.u(xvuVar2, xvuVar12, xvuVar3, xvuVar4, xvuVar5, xvuVar6, xvuVar13, xvuVar9, xvuVar10, xvuVar11, xvuVar14, xvuVar15, xvuVar16, xvuVar17);
        agkz.q(xvuVar7, xvuVar8);
        agkz.q(xvuVar14, xvuVar15);
        agkz.u(xvuVar18, xvuVar6, xvuVar, xvuVar19, xvuVar21, xvuVar20, xvuVar22);
        for (xvu xvuVar23 : values()) {
            aB.put(xvuVar23.aA, xvuVar23);
        }
    }

    xvu(String str) {
        this.aA = str;
    }

    public static xvu a(String str) {
        return (xvu) aB.get(str);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.aA;
    }
}
