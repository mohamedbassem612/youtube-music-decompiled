package defpackage;

import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.media.AudioAttributesCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class er extends MediaController.Callback {
    private final WeakReference a;

    public er(et etVar) {
        this.a = new WeakReference(etVar);
    }

    @Override // android.media.session.MediaController.Callback
    public final void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
        if (((et) this.a.get()) != null) {
            playbackInfo.getPlaybackType();
            playbackInfo.getAudioAttributes();
            int i = AudioAttributesCompat.b;
            playbackInfo.getVolumeControl();
            playbackInfo.getMaxVolume();
            playbackInfo.getCurrentVolume();
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onExtrasChanged(Bundle bundle) {
        fg.d(bundle);
    }

    @Override // android.media.session.MediaController.Callback
    public final void onMetadataChanged(MediaMetadata mediaMetadata) {
        et etVar = (et) this.a.get();
        if (etVar != null) {
            etVar.a(MediaMetadataCompat.c(mediaMetadata));
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onPlaybackStateChanged(PlaybackState playbackState) {
        et etVar = (et) this.a.get();
        if (etVar == null || etVar.c != null) {
            return;
        }
        etVar.b(PlaybackStateCompat.a(playbackState));
    }

    @Override // android.media.session.MediaController.Callback
    public final void onQueueChanged(List list) {
        MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem;
        if (((et) this.a.get()) == null || list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (Object obj : list) {
            if (obj == null) {
                mediaSessionCompat$QueueItem = null;
            } else {
                MediaSession.QueueItem queueItem = (MediaSession.QueueItem) obj;
                mediaSessionCompat$QueueItem = new MediaSessionCompat$QueueItem(queueItem, MediaDescriptionCompat.a(queueItem.getDescription()), queueItem.getQueueId());
            }
            arrayList.add(mediaSessionCompat$QueueItem);
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onQueueTitleChanged(CharSequence charSequence) {
    }

    @Override // android.media.session.MediaController.Callback
    public final void onSessionDestroyed() {
        et etVar = (et) this.a.get();
        if (etVar != null) {
            etVar.c();
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onSessionEvent(String str, Bundle bundle) {
        fg.d(bundle);
    }
}
