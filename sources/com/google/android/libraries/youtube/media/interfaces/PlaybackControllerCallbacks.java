package com.google.android.libraries.youtube.media.interfaces;

import com.google.android.apps.youtube.proto.ClientAbrStateOuterClass$ClientAbrState;
import com.google.android.apps.youtube.proto.SabrLiveProtos$SabrLiveMetadata;
import com.google.android.apps.youtube.proto.streaming.PlaybackDebugInfoOuterClass$PlaybackDebugInfo;
import com.google.android.apps.youtube.proto.streaming.ReloadPlayerResponseOuterClass$ReloadPlayerResponse;
import com.google.android.apps.youtube.proto.streaming.RequestIdentifierOuterClass$RequestIdentifier;
import com.google.android.apps.youtube.proto.streaming.SabrSeekOuterClass$SabrSeek;
import com.google.android.apps.youtube.proto.streaming.SelectableFormatsOuterClass$SelectableFormats;
import com.google.android.apps.youtube.proto.streaming.ServerStitchedDaiInfoOuterClass$ServerStitchedDaiInfo;
import com.google.android.apps.youtube.proto.streaming.StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class PlaybackControllerCallbacks {
    public abstract ClientAbrStateOuterClass$ClientAbrState getAbrState();

    public abstract Time getCurrentPlaybackPosition();

    public abstract double getOnesieRequestBandwidthBytesPerSec();

    public abstract ServerStitchedDaiInfoOuterClass$ServerStitchedDaiInfo getSsdaiInfo(Time time);

    public abstract void onFatalError(QoeError qoeError, FallbackConfig fallbackConfig);

    public abstract void onLiveMetadata(SabrLiveProtos$SabrLiveMetadata sabrLiveProtos$SabrLiveMetadata, Double d, boolean z, Long l, Long l2);

    public abstract void onPlaybackDebugInfo(PlaybackDebugInfoOuterClass$PlaybackDebugInfo playbackDebugInfoOuterClass$PlaybackDebugInfo);

    public abstract void onReloadPlayerResponse(ReloadPlayerResponseOuterClass$ReloadPlayerResponse reloadPlayerResponseOuterClass$ReloadPlayerResponse);

    public abstract void onRequestIdentifier(RequestIdentifierOuterClass$RequestIdentifier requestIdentifierOuterClass$RequestIdentifier);

    public abstract void onSabrSeek(SabrSeekOuterClass$SabrSeek sabrSeekOuterClass$SabrSeek);

    public abstract void onSelectableFormats(SelectableFormatsOuterClass$SelectableFormats selectableFormatsOuterClass$SelectableFormats);

    public abstract void onStitchedSegmentsMetadataList(StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList stitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList);

    public abstract boolean shouldBlockSabrRequestForSsdai(Time time);
}
