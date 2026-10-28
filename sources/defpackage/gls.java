package defpackage;

import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.audiopreview.AudioPreviewPlayerActivity;
import com.google.android.libraries.youtube.common.ui.TouchImageView;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimeBar;
import com.google.common.util.concurrent.ListenableFuture;
import j$.net.URLDecoder;
import j$.nio.file.Path;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gls extends glt implements MediaPlayer.OnPreparedListener, MediaPlayer.OnErrorListener, AudioManager.OnAudioFocusChangeListener, MediaPlayer.OnCompletionListener, View.OnClickListener, abhp, afgr {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/audiopreview/AudioPreviewPlayerActivityPeer");
    private AudioFocusRequest A;
    private TextView B;
    private TouchImageView C;
    private ListenableFuture D;
    private final vxz E;
    private final syn F;
    private final oml G;
    public final AudioPreviewPlayerActivity b;
    public final aunn c;
    public final jkx d;
    public final ahey e;
    public final Executor f;
    public glq g;
    public boolean h;
    public glr i;
    public Uri j;
    public ImageView k;
    public TextView l;
    public TextView m;
    public View n;
    public TouchImageView o;
    public TimeBar p;
    public abgk q;
    public abhl r;
    public int s;
    public boolean t = false;
    public ahew u;
    private final xgn w;
    private final affh x;
    private final mbc y;
    private AudioManager z;

    public gls(AudioPreviewPlayerActivity audioPreviewPlayerActivity, aunn aunnVar, jkx jkxVar, xgn xgnVar, affh affhVar, oml omlVar, syn synVar, ahey aheyVar, Executor executor, mbc mbcVar, vxz vxzVar) {
        this.b = audioPreviewPlayerActivity;
        this.c = aunnVar;
        this.d = jkxVar;
        this.w = xgnVar;
        this.x = affhVar;
        this.G = omlVar;
        this.F = synVar;
        this.e = aheyVar;
        this.f = executor;
        this.y = mbcVar;
        this.E = vxzVar;
        afha afhaVarB = afhb.b(audioPreviewPlayerActivity);
        afhaVarB.b(rqz.class);
        affhVar.a(afhaVarB.a()).c(this);
    }

    private final void o() {
        TouchImageView touchImageView;
        AudioPreviewPlayerActivity audioPreviewPlayerActivity = this.b;
        View viewFindViewById = audioPreviewPlayerActivity.findViewById(R.id.title_and_buttons_container);
        View viewFindViewById2 = audioPreviewPlayerActivity.findViewById(R.id.loading_container);
        viewFindViewById.setVisibility(0);
        viewFindViewById2.setVisibility(8);
        TimeBar timeBar = this.p;
        if (timeBar != null) {
            timeBar.s(this);
            abhl abhlVar = new abhl();
            this.r = abhlVar;
            abhlVar.a = this.s;
            glr glrVar = this.i;
            if (glrVar != null) {
                abhlVar.c = glrVar.getCurrentPosition();
            }
            this.r.g = audioPreviewPlayerActivity.getColor(R.color.yt_youtube_red_cairo);
            this.r.e = audioPreviewPlayerActivity.getColor(R.color.time_bar_empty_color);
            abhl abhlVar2 = this.r;
            abhlVar2.i = true;
            this.p.v(abhlVar2);
            this.p.setVisibility(0);
        }
        abgk abgkVar = this.q;
        if (abgkVar == null || (touchImageView = this.o) == null) {
            return;
        }
        abgkVar.b(touchImageView);
    }

    private final void p(float f) {
        float fMax = Math.max(0.0f, Math.min(1.0f, f));
        glr glrVar = this.i;
        if (glrVar != null) {
            glrVar.setVolume(fMax, fMax);
        }
    }

    private static final void q(View view) {
        view.getClass();
        view.setOnTouchListener(new vsl(1));
        view.setFocusable(false);
    }

    @Override // defpackage.afgr
    public final void F(ahud ahudVar) {
        agrx agrxVar = agso.a;
        this.F.k(14, 2, 2);
    }

    public final void a() {
        AudioFocusRequest audioFocusRequest;
        AudioManager audioManager = this.z;
        if (audioManager == null || (audioFocusRequest = this.A) == null) {
            return;
        }
        audioManager.abandonAudioFocusRequest(audioFocusRequest);
    }

    /* JADX WARN: Type inference failed for: r2v33, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void b() {
        glr glrVar;
        glr glrVar2;
        AudioPreviewPlayerActivity audioPreviewPlayerActivity = this.b;
        Intent intent = audioPreviewPlayerActivity.getIntent();
        if (intent == null || intent.getData() == null) {
            return;
        }
        this.j = intent.getData();
        audioPreviewPlayerActivity.setVolumeControlStream(3);
        audioPreviewPlayerActivity.setContentView(R.layout.audio_preview_player);
        int i = 0;
        audioPreviewPlayerActivity.setFinishOnTouchOutside(false);
        TextView textView = (TextView) audioPreviewPlayerActivity.findViewById(R.id.loading_text_view);
        int i2 = 1;
        if ("http".equals(this.j.getScheme()) || "https".equals(this.j.getScheme())) {
            textView.setText(audioPreviewPlayerActivity.getString(R.string.audio_preview_stream_loading_text, new Object[]{this.j.getHost()}));
        } else {
            textView.setVisibility(8);
        }
        ImageView imageView = (ImageView) audioPreviewPlayerActivity.findViewById(R.id.album_art);
        this.k = imageView;
        imageView.setImageDrawable(audioPreviewPlayerActivity.getDrawable(R.drawable.empty_state_cover_square));
        this.l = (TextView) audioPreviewPlayerActivity.findViewById(R.id.title_text_view);
        this.m = (TextView) audioPreviewPlayerActivity.findViewById(R.id.artist_text_view);
        this.B = (TextView) audioPreviewPlayerActivity.findViewById(R.id.duration_text_view);
        this.n = audioPreviewPlayerActivity.findViewById(R.id.artist_duration_divider);
        TouchImageView touchImageView = (TouchImageView) audioPreviewPlayerActivity.findViewById(R.id.play_pause_replay_button);
        this.o = touchImageView;
        touchImageView.setOnClickListener(this);
        this.q = new abgk(this.o, audioPreviewPlayerActivity, false, false);
        this.p = (TimeBar) audioPreviewPlayerActivity.findViewById(R.id.time_bar);
        TouchImageView touchImageView2 = (TouchImageView) audioPreviewPlayerActivity.findViewById(R.id.logo_button);
        this.C = touchImageView2;
        touchImageView2.setOnClickListener(this);
        this.C.setImageDrawable(audioPreviewPlayerActivity.getDrawable(R.drawable.action_bar_logo_ringo2));
        glq glqVar = new glq(this);
        this.g = glqVar;
        avg.f(audioPreviewPlayerActivity, glqVar, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"), null, 4);
        this.h = true;
        kyr kyrVar = (kyr) this.c.io();
        taf.k(audioPreviewPlayerActivity, ahno.ar(((afkb) kyrVar.a).a(), new gqa(audioPreviewPlayerActivity.getApplicationContext(), this.j, i2), kyrVar.b), new glm(this, i2), new glm(this, i));
        Uri uri = this.j;
        glr glrVar3 = (glr) audioPreviewPlayerActivity.getLastCustomNonConfigurationInstance();
        if (glrVar3 == null) {
            glrVar2 = new glr();
            this.i = glrVar2;
        } else {
            this.i = glrVar3;
        }
        if (glrVar != null) {
            glrVar = glrVar3;
            glrVar = glrVar2;
            glrVar.a = this;
            glrVar.setOnPreparedListener(glrVar);
            glrVar.setOnErrorListener(glrVar.a);
            glrVar.setOnCompletionListener(glrVar.a);
        }
        glrVar = glrVar3;
        glrVar = glrVar2;
        Object systemService = audioPreviewPlayerActivity.getApplicationContext().getSystemService("audio");
        systemService.getClass();
        this.z = (AudioManager) systemService;
        AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setContentType(2).setUsage(1).build();
        glr glrVar4 = this.i;
        if (glrVar4 != null) {
            glrVar4.setAudioAttributes(audioAttributesBuild);
        }
        this.A = new AudioFocusRequest.Builder(1).setAudioAttributes(audioAttributesBuild).setOnAudioFocusChangeListener(this).build();
        glr glrVar5 = this.i;
        if (glrVar5 != null) {
            if (glrVar5.b) {
                onPrepared(glrVar5);
            } else {
                try {
                    glrVar5.setDataSource(audioPreviewPlayerActivity.getApplicationContext(), uri);
                    this.i.prepareAsync();
                } catch (Exception e) {
                    zvp.a(zvn.b, zvm.n, ahno.Z(e.getMessage()));
                    ((agrc) ((agrc) a.b().i(agso.a, "AudioPreview")).k("com/google/android/apps/youtube/music/audiopreview/AudioPreviewPlayerActivityPeer", "initMediaPlayer", 340, "AudioPreviewPlayerActivityPeer.java")).w("Exception occurred: %s", e.getMessage());
                    h(R.string.audio_preview_file_error, 0);
                }
            }
        }
        xgn xgnVar = this.w;
        xgnVar.b(xhb.a(61699), null, null);
        xgnVar.d(new xgj(xhb.b(61700)));
    }

    @Override // defpackage.abhp
    public final void f(int i, long j) {
        TimeBar timeBar;
        if (i == 1) {
            TimeBar timeBar2 = this.p;
            if (timeBar2 != null) {
                timeBar2.u(true);
                return;
            }
            return;
        }
        if (i == 2) {
            abhl abhlVar = this.r;
            if (abhlVar == null || (timeBar = this.p) == null) {
                return;
            }
            abhlVar.c = j;
            timeBar.v(abhlVar);
            return;
        }
        if (i == 3 || i == 4) {
            TimeBar timeBar3 = this.p;
            if (timeBar3 != null) {
                timeBar3.u(false);
            }
            abhl abhlVar2 = this.r;
            if (abhlVar2 == null || j > abhlVar2.a || j < 0) {
                return;
            }
            abhlVar2.c = j;
            glr glrVar = this.i;
            if (glrVar != null) {
                glrVar.seekTo((int) j);
                i();
            }
        }
    }

    public final void g() {
        glr glrVar = this.i;
        if (glrVar == null || !glrVar.isPlaying()) {
            return;
        }
        this.i.pause();
        j();
        abgk abgkVar = this.q;
        if (abgkVar != null) {
            abgkVar.a(new abgi(abgh.c, false));
        }
    }

    public final void h(int i, int i2) {
        AudioPreviewPlayerActivity audioPreviewPlayerActivity = this.b;
        Toast.makeText(audioPreviewPlayerActivity, i, i2).show();
        audioPreviewPlayerActivity.finish();
    }

    public final void i() {
        AudioFocusRequest audioFocusRequest;
        glr glrVar = this.i;
        if (glrVar == null || glrVar.isPlaying()) {
            return;
        }
        AudioManager audioManager = this.z;
        if (audioManager == null || (audioFocusRequest = this.A) == null || audioManager.requestAudioFocus(audioFocusRequest) != 1) {
            abgk abgkVar = this.q;
            if (abgkVar != null) {
                abgkVar.a(new abgi(abgh.c, false));
            }
            ((agrc) ((agrc) a.b().i(agso.a, "AudioPreview")).k("com/google/android/apps/youtube/music/audiopreview/AudioPreviewPlayerActivityPeer", "startPlayback", 817, "AudioPreviewPlayerActivityPeer.java")).t("startPlayback did not obtain audio focus");
            return;
        }
        this.i.start();
        ListenableFuture listenableFuture = this.D;
        if (listenableFuture == null || listenableFuture.isDone()) {
            this.D = ahno.aj(new dxk(this, 17), 200L, 200L, TimeUnit.MILLISECONDS, this.y, this.e);
        }
        abgk abgkVar2 = this.q;
        if (abgkVar2 != null) {
            abgkVar2.a(new abgi(abgh.b, false));
        }
    }

    public final void j() {
        ListenableFuture listenableFuture = this.D;
        if (listenableFuture != null) {
            listenableFuture.cancel(false);
            this.D = null;
        }
    }

    public final void l() {
        glr glrVar = this.i;
        if (glrVar != null) {
            if (glrVar.isPlaying()) {
                g();
            } else {
                i();
            }
        }
    }

    final void m() {
        TimeBar timeBar;
        abhl abhlVar = this.r;
        if (abhlVar != null && (timeBar = this.p) != null) {
            abhlVar.c = this.s;
            timeBar.v(abhlVar);
        }
        j();
        abgk abgkVar = this.q;
        if (abgkVar != null) {
            abgkVar.a(new abgi(abgh.f, false));
        }
    }

    @Override // defpackage.afgr
    public final void n(affx affxVar) {
        this.G.m("AudioPreviewPlayer", affxVar, this.x, 14);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        glr glrVar = this.i;
        if (glrVar == null) {
            a();
            return;
        }
        if (i == -3) {
            p(0.1f);
            return;
        }
        if (i == -2) {
            if (glrVar.isPlaying()) {
                this.t = true;
                g();
                return;
            }
            return;
        }
        if (i == -1) {
            this.t = false;
            g();
        } else if (i == 1 || i == 2 || i == 3) {
            p(1.0f);
            if (this.t) {
                this.t = false;
                i();
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TimeBar timeBar;
        glr glrVar = this.i;
        if (glrVar != null) {
            if (view != this.o) {
                if (view == this.C) {
                    this.w.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(61700)), null);
                    Intent intent = new Intent();
                    AudioPreviewPlayerActivity audioPreviewPlayerActivity = this.b;
                    intent.setClassName(audioPreviewPlayerActivity, "com.google.android.apps.youtube.music.activities.InternalMusicActivity");
                    afwl.m(audioPreviewPlayerActivity, intent);
                    return;
                }
                return;
            }
            if (this.q != null) {
                if (glrVar.getCurrentPosition() == this.s) {
                    this.i.seekTo(0);
                    abhl abhlVar = this.r;
                    if (abhlVar != null && (timeBar = this.p) != null) {
                        abhlVar.c = 0L;
                        timeBar.v(abhlVar);
                    }
                }
                l();
            }
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        m();
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        if (this.E.l(87, 45749455L, false)) {
            this.s = 1;
            o();
            m();
            Uri uri = this.j;
            if (uri == null || uri.getPath() == null || this.l == null || this.m == null || this.B == null || this.p == null || this.o == null || this.r == null) {
                ((agrc) ((agrc) a.b().i(agso.a, "AudioPreview")).k("com/google/android/apps/youtube/music/audiopreview/AudioPreviewPlayerActivityPeer", "onError", 604, "AudioPreviewPlayerActivityPeer.java")).t("Reached error state before UI was initialized. This should never happen.");
                this.b.finish();
            } else {
                String lastPathSegment = this.j.getLastPathSegment();
                try {
                    Path fileName = Path.CC.of(this.j.getPath(), new String[0]).getFileName();
                    fileName.getClass();
                    lastPathSegment = URLDecoder.decode(fileName.toString(), StandardCharsets.UTF_8);
                } catch (Exception e) {
                    ((agrc) ((agrc) ((agrc) a.c().i(agso.a, "AudioPreview")).j(e)).k("com/google/android/apps/youtube/music/audiopreview/AudioPreviewPlayerActivityPeer", "onError", (char) 621, "AudioPreviewPlayerActivityPeer.java")).t("Failed to decode file name from URI");
                }
                this.l.setText(lastPathSegment);
                this.m.setText(R.string.audio_preview_file_error);
                this.B.setText(aaja.d(0L));
                q(this.p);
                q(this.o);
                AudioPreviewPlayerActivity audioPreviewPlayerActivity = this.b;
                int color = audioPreviewPlayerActivity.getColor(R.color.yt_grey3);
                this.p.setEnabled(false);
                abhl abhlVar = this.r;
                abhlVar.g = color;
                abhlVar.h = color;
                this.o.setAlpha(0.5f);
                audioPreviewPlayerActivity.setFinishOnTouchOutside(true);
            }
        } else {
            h(R.string.audio_preview_file_error, 0);
        }
        return true;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        agrx agrxVar = agso.a;
        glr glrVar = (glr) mediaPlayer;
        this.i = glrVar;
        if (glrVar != null) {
            int duration = glrVar.getDuration();
            this.s = duration;
            TextView textView = this.B;
            if (textView != null) {
                textView.setText(aaja.d(duration));
            }
            o();
            this.w.w(new xgj(xhb.b(61700)), null);
            glr glrVar2 = this.i;
            if (glrVar2 == null || glrVar2.getCurrentPosition() != 0) {
                return;
            }
            i();
        }
    }

    @Override // defpackage.afgr
    public final /* synthetic */ void E() {
    }

    @Override // defpackage.afgr
    public final /* synthetic */ void k() {
    }
}
