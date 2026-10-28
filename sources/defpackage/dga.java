package defpackage;

import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dga extends et {
    final /* synthetic */ dge d;

    public dga(dge dgeVar) {
        this.d = dgeVar;
    }

    @Override // defpackage.et
    public final void a(MediaMetadataCompat mediaMetadataCompat) {
        MediaDescriptionCompat mediaDescriptionCompatB = mediaMetadataCompat == null ? null : mediaMetadataCompat.b();
        dge dgeVar = this.d;
        dgeVar.D = mediaDescriptionCompatB;
        dgeVar.r();
        dgeVar.q(false);
    }

    @Override // defpackage.et
    public final void b(PlaybackStateCompat playbackStateCompat) {
        dge dgeVar = this.d;
        dgeVar.C = playbackStateCompat;
        dgeVar.q(false);
    }

    @Override // defpackage.et
    public final void c() {
        dge dgeVar = this.d;
        fg fgVar = dgeVar.V;
        if (fgVar != null) {
            fgVar.p(dgeVar.B);
            dgeVar.V = null;
        }
    }
}
