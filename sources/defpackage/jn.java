package defpackage;

import android.app.PendingIntent;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.media.MediaPlayer;
import android.media.session.MediaController;
import android.net.Uri;
import android.os.Message;
import android.provider.MediaStore;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.CheckedTextView;
import androidx.media3.ui.TrackSelectionView;
import androidx.preference.Preference;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.activities.MusicPickerActivity;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jn implements View.OnClickListener {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public jn(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v39, types: [android.media.MediaPlayer$OnCompletionListener, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        PendingIntent sessionActivity;
        PlaybackStateCompat playbackStateCompat;
        Message messageObtain = null;
        int i = 0;
        switch (this.$cid) {
            case 0:
                ((hv) this.a).f();
                return;
            case 1:
                ft ftVar = (ft) this.a;
                if (view == ftVar.j && (message2 = ftVar.l) != null) {
                    messageObtain = Message.obtain(message2);
                } else if (view != ftVar.m || (message = ftVar.o) == null) {
                    Button button = ftVar.p;
                } else {
                    messageObtain = Message.obtain(message);
                }
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                ftVar.H.obtainMessage(1, ftVar.b).sendToTarget();
                return;
            case 2:
                ((Toolbar) this.a).j();
                return;
            case 3:
                TrackSelectionView trackSelectionView = (TrackSelectionView) this.a;
                CheckedTextView checkedTextView = trackSelectionView.a;
                if (view == checkedTextView) {
                    trackSelectionView.e = true;
                    trackSelectionView.d.clear();
                } else {
                    if (view != trackSelectionView.b) {
                        trackSelectionView.e = false;
                        Object tag = view.getTag();
                        tag.getClass();
                        throw null;
                    }
                    trackSelectionView.e = false;
                    trackSelectionView.d.clear();
                }
                checkedTextView.setChecked(trackSelectionView.e);
                trackSelectionView.b.setChecked(!trackSelectionView.e && trackSelectionView.d.isEmpty());
                throw null;
            case 4:
                ((gr) this.a).dismiss();
                return;
            case 5:
                ((gr) this.a).dismiss();
                return;
            case 6:
                Object obj = this.a;
                fg fgVar = ((dge) obj).V;
                if (fgVar == null || (sessionActivity = ((MediaController) ((axfd) fgVar.a).d).getSessionActivity()) == null) {
                    return;
                }
                try {
                    sessionActivity.send();
                    ((gr) obj).dismiss();
                    return;
                } catch (PendingIntent.CanceledException unused) {
                    Objects.toString(sessionActivity);
                    Log.e("MediaRouteCtrlDialog", sessionActivity.toString().concat(" was not sent, it had been canceled."));
                    return;
                }
            case 7:
                dge dgeVar = (dge) this.a;
                boolean z = dgeVar.M;
                dgeVar.M = !z;
                if (!z) {
                    dgeVar.n.setVisibility(0);
                }
                dgeVar.o();
                dgeVar.t(true);
                return;
            case 8:
                int id = view.getId();
                if (id == 16908313 || id == 16908314) {
                    Object obj2 = this.a;
                    if (((dge) obj2).d.o()) {
                        dij.o(id == 16908313 ? 2 : 1);
                    }
                    ((gr) obj2).dismiss();
                    return;
                }
                if (id != R.id.mr_control_playback_ctrl) {
                    if (id == R.id.mr_close) {
                        ((gr) this.a).dismiss();
                        return;
                    }
                    return;
                }
                dge dgeVar2 = (dge) this.a;
                if (dgeVar2.V == null || (playbackStateCompat = dgeVar2.C) == null) {
                    return;
                }
                if ((playbackStateCompat.a != 3 ? (char) 0 : (char) 1) != 0) {
                    if (dgeVar2.y()) {
                        ((ev) dgeVar2.V.y()).a.pause();
                        i = R.string.mr_controller_pause;
                    } else if (dgeVar2.A()) {
                        ((ev) dgeVar2.V.y()).a.stop();
                        i = R.string.mr_controller_stop;
                    }
                } else if (dgeVar2.z()) {
                    ((ev) dgeVar2.V.y()).a.play();
                    i = R.string.mr_controller_play;
                }
                AccessibilityManager accessibilityManager = dgeVar2.T;
                if (accessibilityManager == null || !accessibilityManager.isEnabled() || i == 0) {
                    return;
                }
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(16384);
                Context context = dgeVar2.e;
                accessibilityEventObtain.setPackageName(context.getPackageName());
                accessibilityEventObtain.setClassName(getClass().getName());
                accessibilityEventObtain.getText().add(context.getString(i));
                accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain);
                return;
            case 9:
                ((Preference) this.a).b(view);
                return;
            case 10:
                Object obj3 = this.a;
                gff gffVar = ((gfe) obj3).x;
                int iA = ((oh) obj3).a();
                Cursor cursor = gffVar.a;
                if (cursor != null) {
                    cursor.moveToPosition(iA);
                    Cursor cursor2 = gffVar.a;
                    long j = cursor2.getLong(cursor2.getColumnIndexOrThrow("_id"));
                    ?? r11 = gffVar.k.a;
                    gfb gfbVar = (gfb) r11;
                    MusicPickerActivity musicPickerActivity = gfbVar.b;
                    if (jku.c(musicPickerActivity)) {
                        if (j == gfbVar.g && gfbVar.l != null) {
                            gfbVar.e();
                            RecyclerView recyclerView = gfbVar.h;
                            if (recyclerView != null) {
                                recyclerView.invalidate();
                                return;
                            }
                            return;
                        }
                        gfbVar.e();
                        gfbVar.l = new MediaPlayer();
                        try {
                            Uri uriWithAppendedId = ContentUris.withAppendedId(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, j);
                            MediaPlayer mediaPlayer = ((gfb) r11).l;
                            if (mediaPlayer != null) {
                                mediaPlayer.setDataSource(musicPickerActivity.getApplicationContext(), uriWithAppendedId);
                                ((gfb) r11).l.setOnCompletionListener(r11);
                                ((gfb) r11).l.setAudioStreamType(3);
                                ((gfb) r11).l.prepare();
                                ((gfb) r11).l.start();
                            }
                            ((gfb) r11).g = j;
                            gff gffVar2 = ((gfb) r11).e;
                            if (gffVar2 != null) {
                                gffVar2.j = j;
                                gffVar2.j(0, gffVar2.a());
                            }
                            ((gfb) r11).f = uriWithAppendedId;
                            return;
                        } catch (IOException | IllegalStateException e) {
                            ((agrc) ((agrc) ((agrc) gfb.a.c().i(agso.a, "MusicPickerActivity")).j(e)).k("com/google/android/apps/youtube/music/activities/MusicPickerActivityPeer", "setSelected", (char) 290, "MusicPickerActivityPeer.java")).t("Unable to play track");
                            tuk.n(gfbVar.b, R.string.track_unplayable_try_different_one, 1);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 11:
                ((cc) this.a).requireActivity().getOnBackPressedDispatcher().d();
                return;
            case 12:
                gpl gplVar = (gpl) this.a;
                gplVar.e.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(269408)), null);
                gplVar.c.a(kro.ai("FEmusic_offline"));
                return;
            case 13:
                ((cc) this.a).requireActivity().getOnBackPressedDispatcher().d();
                return;
            case 14:
                ((cc) this.a).requireActivity().getOnBackPressedDispatcher().d();
                return;
            case 15:
                ((hdd) this.a).j();
                return;
            case 16:
                ((hdd) this.a).i();
                return;
            case 17:
                ((hdd) this.a).i();
                return;
            case 18:
                ((hdj) this.a).p();
                return;
            case 19:
                hdj hdjVar = (hdj) this.a;
                hdjVar.r(hdjVar.k());
                return;
            default:
                aihh aihhVar = (aihh) ajwo.a.createBuilder();
                aihhVar.e(ajfb.a, ajfa.a);
                ((hdj) this.a).D.a((ajwo) aihhVar.build());
                return;
        }
    }

    public /* synthetic */ jn(Object obj, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
    }
}
