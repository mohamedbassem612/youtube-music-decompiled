package defpackage;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.activities.MusicPickerActivity;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gfb extends gfc implements View.OnClickListener, MediaPlayer.OnCompletionListener, bpx {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/activities/MusicPickerActivityPeer");
    private static final String[] p = {"_id", "title", "title_key", "album", "artist", "artist_id", "duration", "track"};
    public final MusicPickerActivity b;
    public final affh c;
    public Uri d;
    public gff e;
    public Uri f;
    public long g = -1;
    public RecyclerView h;
    public View i;
    public View j;
    public boolean k;
    public MediaPlayer l;
    public final syn m;
    public final oml n;
    private View q;

    public gfb(MusicPickerActivity musicPickerActivity, affh affhVar, oml omlVar, syn synVar) {
        this.b = musicPickerActivity;
        this.c = affhVar;
        this.n = omlVar;
        this.m = synVar;
        afha afhaVarB = afhb.b(musicPickerActivity);
        afhaVarB.b(rqz.class);
        affhVar.a(afhaVarB.a()).c(new ijz(this, 1));
    }

    @Override // defpackage.bpx
    public final bqg a() {
        Uri uri = this.d;
        MusicPickerActivity musicPickerActivity = this.b;
        return uri == null ? new bqe(musicPickerActivity) : new bqe(musicPickerActivity, uri, p);
    }

    @Override // defpackage.bpx
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        gff gffVar;
        Cursor cursor = (Cursor) obj;
        if (!jku.c(this.b) || (gffVar = this.e) == null) {
            return;
        }
        gffVar.z(cursor);
        if (this.q != null) {
            int iA = this.e.a();
            View view = this.q;
            if (iA == 0) {
                view.setVisibility(0);
            } else {
                view.setVisibility(8);
            }
        }
    }

    @Override // defpackage.bpx
    public final void c() {
        RecyclerView recyclerView;
        if (!jku.c(this.b) || (recyclerView = this.h) == null) {
            return;
        }
        recyclerView.ad(null);
    }

    public final void d() {
        MusicPickerActivity musicPickerActivity = this.b;
        musicPickerActivity.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        musicPickerActivity.setContentView(R.layout.music_picker);
        RecyclerView recyclerView = (RecyclerView) musicPickerActivity.findViewById(android.R.id.list);
        this.h = recyclerView;
        recyclerView.ah(new LinearLayoutManager(musicPickerActivity));
        byte[] bArr = null;
        gff gffVar = new gff(new qcb(this, bArr), new qcb(this, bArr));
        this.e = gffVar;
        this.h.ad(gffVar);
        this.h.aJ(new lv(musicPickerActivity, 1));
        this.h.setSaveEnabled(true);
        this.i = musicPickerActivity.findViewById(R.id.progress_container);
        this.j = musicPickerActivity.findViewById(R.id.list_container);
        this.q = musicPickerActivity.findViewById(android.R.id.empty);
        musicPickerActivity.findViewById(R.id.okay_button).setOnClickListener(this);
        musicPickerActivity.findViewById(R.id.cancel_button).setOnClickListener(this);
        this.k = false;
        bpy.a(musicPickerActivity).d(1, this);
    }

    public final void e() {
        MediaPlayer mediaPlayer = this.l;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.l.release();
            this.l = null;
            this.g = -1L;
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id != R.id.okay_button) {
            if (id == R.id.cancel_button) {
                this.b.finish();
            }
        } else if (this.f != null) {
            MusicPickerActivity musicPickerActivity = this.b;
            musicPickerActivity.setResult(-1, new Intent().setData(this.f));
            musicPickerActivity.finish();
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        if (this.l == mediaPlayer) {
            mediaPlayer.stop();
            mediaPlayer.release();
            this.l = null;
            this.g = -1L;
            RecyclerView recyclerView = this.h;
            if (recyclerView != null) {
                recyclerView.invalidate();
            }
        }
    }
}
