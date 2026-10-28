package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.ui.components.chipcloud.ChipCloudChipView;
import com.google.android.apps.youtube.music.watchpage.MusicPlaybackControls;
import com.google.android.apps.youtube.music.watchpage.ui.PlayerBottomSheet;
import com.google.android.apps.youtube.music.watchpage.ui.WatchWhileLayout;
import com.google.android.libraries.blocks.Container;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.Objects;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class joz implements hyy, abjj, acdp, xzf, rtd, job {
    public static final agsn a = agsn.h("WatchPagePresenter");
    public static final float[] b = {0.0f, 0.2f, 1.0f};
    public final View A;
    public final ViewGroup B;
    public final ImageView C;
    public boolean D;
    public final cf E;
    public final adly F;
    public final aunn G;
    public final aunn H;
    public final aunn I;
    public final aunn J;
    public final aunn K;
    public final aunn L;
    public final aunn M;
    public final aunn N;
    public final aunn O;
    public final aunn P;
    public final float Q;
    public final jkn R;
    public final jny S;
    public final aunn T;
    public final Map U;
    public final Map V;
    public final aunn W;
    public final aunn X;
    public final aunn Y;
    public final aunn Z;
    private final aunn aA;
    private final aunn aB;
    private final aunn aC;
    private final aunn aD;
    private final aunn aE;
    private final abgx aF;
    private final dfo aG;
    private final ViewGroup aH;
    private final ImageView aI;
    private final ViewGroup aJ;
    private final ViewGroup aK;
    private final View aL;
    private final Space aM;
    private final ImageView aN;
    private final jbm aO;
    private final jbm aP;
    private final aunn aQ;
    private final avmb aR;
    private final int aS;
    private final Runnable aT;
    private final xrn aU;
    private final xrx aV;
    private final aefv aW;
    private final aunn aX;
    private final aunn aY;
    private final int aZ;
    public final aunn aa;
    public final aunn ab;
    public final aunn ac;
    public final aunn ad;
    public final jqb ae;
    public rsf af;
    public ViewTreeObserver.OnGlobalLayoutListener ag;
    public final awmd ah;
    public final awmd ai;
    public final GradientDrawable aj;
    public final acdq ak;
    public final aunn al;
    public final aunn am;
    public mav an;
    public jqh ao;
    public iwl ap;
    public int aq;
    public abgi ar;
    public aqof as;
    public aqof at;
    public Optional au;
    public avmn av;
    public final vxz aw;
    public final jij ax;
    private final aunn ay;
    private final aunn az;
    private final int ba;
    private final ggb bb;
    private final ggb bc;
    private final ggb bd;
    private final ggf be;
    private ggf bf;
    private ggf bg;
    private int bh;
    private int bi;
    private int bj;
    private boolean bk;
    private boolean bl;
    private wjf bm;
    public final avmm c = new avmm();
    public final aunn d;
    public final aunn e;
    public final aunn f;
    public final aunn g;
    public final aunn h;
    public final aunn i;
    public final abgk j;
    public final jol k;
    public final jnq l;
    public final hxj m;
    public final jqo n;
    public sqq o;
    public final WatchWhileLayout p;
    public final YouTubeTextView q;
    public final YouTubeTextView r;
    public final YouTubeTextView s;
    public final TextView t;
    public final TextView u;
    public final ImageView v;
    public final ImageView w;
    public final MusicPlaybackControls x;
    public final ChipCloudChipView y;
    public final View z;

    /* JADX WARN: Type inference failed for: r19v2, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v19, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v21, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v23, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v25, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r27v0, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r27v1, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r28v0, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r28v1, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r29v0, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r29v1, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r30v0, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r31v0, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r33v0, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r33v1, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r35v2, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r36v2, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r37v0, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r37v1, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r38v0, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r38v1, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r39v2, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r40v2, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r41v0, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r41v1, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r44v0, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r45v0, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v81, types: [awut, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v25, types: [java.lang.Object, zwb] */
    public joz(WatchWhileLayout watchWhileLayout, vxz vxzVar, cf cfVar, aunn aunnVar, avmb avmbVar, aunn aunnVar2, aunn aunnVar3, aunn aunnVar4, aunn aunnVar5, aunn aunnVar6, aunn aunnVar7, aunn aunnVar8, aunn aunnVar9, aunn aunnVar10, aunn aunnVar11, aunn aunnVar12, aunn aunnVar13, aunn aunnVar14, aunn aunnVar15, jqp jqpVar, jom jomVar, xgg xggVar, isi isiVar, xrn xrnVar, aunn aunnVar16, aunn aunnVar17, aunn aunnVar18, aunn aunnVar19, zpw zpwVar, aunn aunnVar20, aunn aunnVar21, aunn aunnVar22, aunn aunnVar23, aunn aunnVar24, xrx xrxVar, jny jnyVar, aunn aunnVar25, int i, jij jijVar, acdq acdqVar, aunn aunnVar26, izt iztVar, awmd awmdVar, awmd awmdVar2, aunn aunnVar27, aunn aunnVar28, aefv aefvVar, aunn aunnVar29, aunn aunnVar30, aunn aunnVar31, jij jijVar2, hhb hhbVar, aunn aunnVar32, aunn aunnVar33, aunn aunnVar34, aunn aunnVar35, aunn aunnVar36, aunn aunnVar37, aunn aunnVar38, aunn aunnVar39, aunn aunnVar40, aunn aunnVar41, aunn aunnVar42, Executor executor, aunn aunnVar43, aunn aunnVar44, aunn aunnVar45, hfn hfnVar, aunn aunnVar46, aunn aunnVar47) throws Throwable {
        this.o = null;
        adly adlyVar = new adly();
        this.F = adlyVar;
        this.af = null;
        this.an = null;
        this.ar = new abgi(abgh.a, false);
        this.au = Optional.empty();
        this.ad = aunnVar45;
        this.aw = vxzVar;
        this.N = aunnVar16;
        this.aE = aunnVar47;
        this.p = watchWhileLayout;
        View viewFindViewById = watchWhileLayout.findViewById(R.id.player_page);
        PlayerBottomSheet playerBottomSheet = (PlayerBottomSheet) viewFindViewById.findViewById(R.id.player_bottom_sheet);
        YouTubeTextView youTubeTextView = (YouTubeTextView) viewFindViewById.findViewById(R.id.container_text);
        this.q = youTubeTextView;
        YouTubeTextView youTubeTextView2 = (YouTubeTextView) viewFindViewById.findViewById(R.id.title);
        this.r = youTubeTextView2;
        YouTubeTextView youTubeTextView3 = (YouTubeTextView) viewFindViewById.findViewById(R.id.artist);
        this.s = youTubeTextView3;
        TextView textView = (TextView) viewFindViewById.findViewById(R.id.mini_player_title);
        this.t = textView;
        this.u = (TextView) viewFindViewById.findViewById(R.id.mini_player_subtitle);
        ImageView imageView = (ImageView) viewFindViewById.findViewById(R.id.mini_player_play_pause_replay_button);
        this.v = imageView;
        MusicPlaybackControls musicPlaybackControls = (MusicPlaybackControls) viewFindViewById.findViewById(R.id.music_playback_controls);
        this.x = musicPlaybackControls;
        ImageView imageView2 = (ImageView) viewFindViewById.findViewById(R.id.contextual_menu);
        this.w = imageView2;
        imageView2.setOnClickListener(new hxg(this, 6));
        this.y = (ChipCloudChipView) viewFindViewById.findViewById(R.id.mdx_chip_cloud_chip);
        this.aH = (ViewGroup) viewFindViewById.findViewById(R.id.cast_button_container);
        this.aM = (Space) viewFindViewById.findViewById(R.id.top_bar_extra_space);
        ImageView imageView3 = (ImageView) viewFindViewById.findViewById(R.id.ask_music_global_entry_button);
        this.aN = imageView3;
        ImageView imageView4 = (ImageView) viewFindViewById.findViewById(R.id.mini_player_ask_music_global_entry_button);
        this.C = imageView4;
        this.aO = jijVar2.a(imageView3, null, null, null, false);
        this.aP = jijVar2.a(imageView4, null, null, null, false);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById.findViewById(R.id.video_action_bar);
        this.aL = viewFindViewById.findViewById(R.id.player_page_background);
        View viewFindViewById2 = viewFindViewById.findViewById(R.id.player_page_scrim_top);
        View viewFindViewById3 = viewFindViewById.findViewById(R.id.player_page_scrim_bottom);
        this.z = viewFindViewById3;
        View viewFindViewById4 = viewFindViewById.findViewById(R.id.watch_fragment_container);
        this.aJ = (ViewGroup) viewFindViewById.findViewById(R.id.subtitle_badges_container);
        this.aK = (ViewGroup) viewFindViewById.findViewById(R.id.mini_player_subtitle_badges_container);
        this.A = watchWhileLayout.findViewById(R.id.mini_player);
        ImageView imageView5 = (ImageView) musicPlaybackControls.findViewById(R.id.player_control_play_pause_replay_button);
        this.aI = imageView5;
        ViewGroup.LayoutParams layoutParams = imageView5.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = (int) cfVar.getResources().getDimension(R.dimen.play_button_length);
            layoutParams.width = (int) cfVar.getResources().getDimension(R.dimen.play_button_length);
        }
        int dimension = (int) cfVar.getResources().getDimension(R.dimen.play_button_padding);
        imageView5.setPadding(dimension, dimension, dimension, dimension);
        imageView5.setForeground(cfVar.getDrawable(R.drawable.circle_thumbnail_ripple));
        imageView5.setBackground(cfVar.getDrawable(R.drawable.circle_background));
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(cfVar.getColor(R.color.ytm_color_white));
        int i2 = bac.a;
        imageView5.setBackgroundTintList(colorStateListValueOf);
        FrameLayout frameLayout = (FrameLayout) viewFindViewById.findViewById(R.id.audio_video_switch_pill_container);
        FrameLayout frameLayout2 = (FrameLayout) viewFindViewById.findViewById(R.id.player_view_pager_container);
        FrameLayout frameLayout3 = (FrameLayout) viewFindViewById.findViewById(R.id.mini_player_view_pager_item);
        frameLayout2.getClass();
        frameLayout3.getClass();
        cf cfVar2 = (cf) jqpVar.a.io();
        cfVar2.getClass();
        ?? Io = jqpVar.b.io();
        Io.getClass();
        ?? Io2 = jqpVar.c.io();
        Io2.getClass();
        ?? Io3 = jqpVar.d.io();
        Io3.getClass();
        ?? Io4 = jqpVar.e.io();
        Io4.getClass();
        ?? Io5 = jqpVar.f.io();
        Io5.getClass();
        hwz hwzVar = (hwz) jqpVar.g.io();
        hwzVar.getClass();
        ?? Io6 = jqpVar.h.io();
        Io6.getClass();
        jqs jqsVar = (jqs) jqpVar.i.io();
        aerj aerjVar = (aerj) jqpVar.j.io();
        jnm jnmVar = (jnm) jqpVar.k.io();
        jnmVar.getClass();
        ?? Io7 = jqpVar.l.io();
        Io7.getClass();
        ?? Io8 = jqpVar.m.io();
        Io8.getClass();
        avmb avmbVar2 = (avmb) jqpVar.n.io();
        avmbVar2.getClass();
        jnj jnjVar = (jnj) jqpVar.o.io();
        jnjVar.getClass();
        ?? Io9 = jqpVar.p.io();
        Io9.getClass();
        this.n = new jqo(frameLayout2, frameLayout3, cfVar2, Io, Io2, Io3, Io4, Io5, hwzVar, Io6, jqsVar, aerjVar, jnmVar, Io7, Io8, avmbVar2, jnjVar, Io9);
        this.m = zpwVar.i(frameLayout);
        adxj adxjVar = (adxj) aunnVar44.io();
        adxjVar.getClass();
        this.j = new abgk(imageView, cfVar, new agfa(adxjVar), true, true, true);
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById.findViewById(R.id.companion_banner);
        this.B = viewGroup2;
        this.af = new rsf(new ArrayList(), new ArrayList());
        this.o = new sqp(cfVar, (heg) aunnVar33.io(), (vwt) aunnVar40.io()).a(viewGroup2);
        playerBottomSheet.getClass();
        cf cfVar3 = (cf) jomVar.a.io();
        cfVar3.getClass();
        ?? Io10 = jomVar.b.io();
        Io10.getClass();
        xgn xgnVar = (xgn) jomVar.c.io();
        xgnVar.getClass();
        xgn xgnVar2 = (xgn) jomVar.d.io();
        xgnVar2.getClass();
        ((jkp) jomVar.e.io()).getClass();
        jax jaxVar = (jax) jomVar.f.io();
        jaxVar.getClass();
        aeod aeodVar = (aeod) jomVar.g.io();
        aeodVar.getClass();
        vwt vwtVar = (vwt) jomVar.h.io();
        vwtVar.getClass();
        wom womVar = (wom) jomVar.i.io();
        womVar.getClass();
        jnm jnmVar2 = (jnm) jomVar.j.io();
        jnmVar2.getClass();
        ?? Io11 = jomVar.k.io();
        Io11.getClass();
        ?? Io12 = jomVar.l.io();
        Io12.getClass();
        ?? Io13 = jomVar.m.io();
        Io13.getClass();
        jaz jazVar = (jaz) jomVar.n.io();
        jazVar.getClass();
        jnz jnzVar = (jnz) jomVar.o.io();
        jer jerVar = (jer) jomVar.p.io();
        jerVar.getClass();
        ?? Io14 = jomVar.q.io();
        Io14.getClass();
        vxz vxzVar2 = (vxz) jomVar.r.io();
        vxzVar2.getClass();
        ?? Io15 = jomVar.s.io();
        Io15.getClass();
        ?? Io16 = jomVar.t.io();
        Io16.getClass();
        ?? Io17 = jomVar.u.io();
        Io17.getClass();
        ?? Io18 = jomVar.v.io();
        Io18.getClass();
        ?? Io19 = jomVar.w.io();
        Io19.getClass();
        ?? Io20 = jomVar.x.io();
        Io20.getClass();
        ?? Io21 = jomVar.y.io();
        Io21.getClass();
        jbo jboVar = (jbo) jomVar.z.io();
        jboVar.getClass();
        joo jooVar = (joo) jomVar.A.io();
        ?? Io22 = jomVar.B.io();
        Io22.getClass();
        ?? Io23 = jomVar.C.io();
        Io23.getClass();
        icj icjVar = (icj) jomVar.D.io();
        icjVar.getClass();
        god godVar = (god) jomVar.E.io();
        godVar.getClass();
        tbt tbtVar = (tbt) jomVar.F.io();
        tbtVar.getClass();
        avlh avlhVar = (avlh) jomVar.G.io();
        avlhVar.getClass();
        Optional optional = (Optional) ((aupo) jomVar.H).b;
        optional.getClass();
        kjc kjcVar = (kjc) jomVar.I.io();
        kjcVar.getClass();
        jol jolVar = new jol(playerBottomSheet, cfVar3, Io10, xgnVar, xgnVar2, jaxVar, aeodVar, vwtVar, womVar, jnmVar2, Io11, Io12, Io13, jazVar, jnzVar, jerVar, Io14, vxzVar2, Io15, Io16, Io17, Io18, Io19, Io20, Io21, jboVar, jooVar, Io22, Io23, icjVar, godVar, tbtVar, avlhVar, optional, kjcVar);
        this.k = jolVar;
        watchWhileLayout.j = jolVar;
        musicPlaybackControls.getClass();
        abvk abvkVar = (abvk) xggVar.j.io();
        abvkVar.getClass();
        abmt abmtVar = (abmt) xggVar.b.io();
        abmtVar.getClass();
        ci ciVar = (ci) xggVar.f.io();
        ciVar.getClass();
        yha yhaVar = (yha) xggVar.i.io();
        yhaVar.getClass();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) xggVar.l.io();
        scheduledExecutorService.getClass();
        Executor executor2 = (Executor) xggVar.g.io();
        executor2.getClass();
        axfd axfdVar = (axfd) xggVar.a.io();
        jnj jnjVar2 = (jnj) xggVar.e.io();
        vxz vxzVar3 = (vxz) xggVar.m.io();
        vxzVar3.getClass();
        abgo abgoVar = (abgo) xggVar.k.io();
        abgoVar.getClass();
        hhb hhbVar2 = (hhb) xggVar.c.io();
        hhbVar2.getClass();
        vxz vxzVar4 = (vxz) xggVar.h.io();
        vxzVar4.getClass();
        this.l = new jnq(musicPlaybackControls, abvkVar, abmtVar, ciVar, yhaVar, scheduledExecutorService, executor2, axfdVar, jnjVar2, vxzVar3, abgoVar, hhbVar2, vxzVar4, (vxz) xggVar.d.io());
        this.aF = new abgx((abvk) aunnVar8.io(), (abvc) aunnVar9.io(), musicPlaybackControls, Integer.valueOf(i), vxzVar.l(116, 45822170L, false));
        this.E = cfVar;
        this.aQ = aunnVar;
        this.aR = avmbVar;
        this.G = aunnVar2;
        this.H = aunnVar6;
        this.e = aunnVar7;
        this.f = aunnVar10;
        this.K = aunnVar11;
        this.I = aunnVar12;
        this.am = aunnVar13;
        this.aB = aunnVar14;
        this.L = aunnVar15;
        this.d = aunnVar19;
        this.az = aunnVar20;
        this.ay = aunnVar25;
        this.J = aunnVar4;
        this.M = aunnVar5;
        this.S = jnyVar;
        this.ax = jijVar;
        this.ak = acdqVar;
        this.aA = aunnVar26;
        this.g = aunnVar21;
        this.h = aunnVar22;
        this.i = aunnVar23;
        this.T = aunnVar24;
        this.aV = xrxVar;
        this.U = new HashMap();
        this.V = new HashMap();
        this.aU = xrnVar;
        this.aD = aunnVar28;
        this.O = aunnVar17;
        this.P = aunnVar18;
        dfo dfoVar = (dfo) viewFindViewById.findViewById(R.id.mini_player_media_route_button);
        dfoVar.b(ok.e().c(cfVar, ((jnj) aunnVar16.io()).e()));
        this.aG = dfoVar;
        this.aC = aunnVar27;
        this.aW = aefvVar;
        this.ah = awmdVar;
        this.ai = awmdVar2;
        this.W = aunnVar29;
        this.X = aunnVar30;
        this.al = aunnVar31;
        this.Y = aunnVar32;
        this.aa = aunnVar35;
        this.aX = aunnVar33;
        this.Z = aunnVar34;
        this.ab = aunnVar39;
        this.ac = aunnVar43;
        this.aY = aunnVar44;
        if (vxzVar.l(65, 45726313L, false)) {
            if (this.an == null) {
                this.an = new mav((Container) aunnVar41.io());
            }
            gmj gmjVar = (gmj) aunnVar42.io();
            ListenableFuture listenableFutureAg = awrc.ag(gmjVar.c, awov.a, new gmc(gmjVar, gmjVar.a.e(), (awoq) null, 4, (short[]) null));
            listenableFutureAg.addListener(new ahei(listenableFutureAg, new hfb(this, 18)), executor);
        }
        mav mavVar = this.an;
        git gitVar = (git) hhbVar.a;
        ghj ghjVar = gitVar.b;
        cf cfVar4 = (cf) ghjVar.d.io();
        vwt vwtVar2 = (vwt) ghjVar.D.io();
        hhb hhbVar3 = (hhb) ghjVar.cg.io();
        ght ghtVar = gitVar.a;
        new jnw(viewGroup, mavVar, cfVar4, vwtVar2, hhbVar3, (avmb) ghtVar.dA.io(), (Executor) ghtVar.z.io(), aupm.b(ghtVar.cH), aupm.b(ghtVar.nj), aupm.b(ghtVar.md), aupm.b(ghjVar.ar), aupm.b(ghjVar.aX), aupm.b(ghjVar.aY));
        ((izr) aunnVar12.io()).b(imageView2, iztVar);
        adlyVar.f("sharedToggleMenuItemMutations", iztVar);
        adlyVar.a((xgn) aunnVar2.io());
        imageView.setOnClickListener(new vqo(this, aunnVar8, 1));
        int i3 = tzk.i(cfVar, R.attr.playerPageDefaultBackgroundColor);
        this.aZ = i3;
        int dimensionPixelSize = cfVar.getResources().getDimensionPixelSize(R.dimen.item_medium_spacing);
        this.ba = dimensionPixelSize;
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.aj = gradientDrawable;
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimensionPixelSize);
        gradientDrawable.setColor(i3);
        this.bb = new jou(aunnVar3);
        this.bc = new jov(playerBottomSheet);
        this.bd = new jow(this);
        viewFindViewById.getClass();
        int i4 = 3;
        this.be = new jox(new jap(viewFindViewById, i4));
        this.ae = ((jqa) aunnVar46.io()).a(viewFindViewById2, viewFindViewById3, viewFindViewById4);
        if (!vxzVar.l(95, 45762151L, false) && vxzVar.l(85, 45746502L, false)) {
            viewFindViewById2.getClass();
            this.bf = new jox(new jap(viewFindViewById2, i4));
            this.bg = new jox(new hsk(this, 20));
            if (Build.VERSION.SDK_INT < 29) {
                jqh jqhVar = new jqh(b);
                this.ao = jqhVar;
                viewFindViewById3.setBackground(jqhVar);
            }
        }
        TypedValue typedValue = new TypedValue();
        cfVar.getResources().getValue(R.dimen.disabled_icon_alpha, typedValue, true);
        this.Q = typedValue.getFloat();
        musicPlaybackControls.s = isiVar.F(musicPlaybackControls, musicPlaybackControls);
        this.aS = cfVar.getResources().getInteger(R.integer.text_marquee_delay_ms);
        youTubeTextView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        youTubeTextView.setHorizontalFadingEdgeEnabled(true);
        youTubeTextView2.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        youTubeTextView2.setHorizontalFadingEdgeEnabled(true);
        textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        textView.setHorizontalFadingEdgeEnabled(true);
        this.aT = new iqc(this, 9);
        youTubeTextView3.setOnTouchListener(new jot(cfVar, 0));
        youTubeTextView.setOnTouchListener(new jot(cfVar, 2));
        if (((jnj) aunnVar16.io()).r()) {
            youTubeTextView2.setFocusableInTouchMode(false);
            youTubeTextView2.setOnClickListener(new jjc(this, 15));
        }
        Handler handler = (Handler) hfnVar.a.io();
        handler.getClass();
        this.R = new jkn(handler, 200L);
    }

    private final CharSequence A(alay alayVar) {
        return ackj.a(new ackh(this.E, alayVar, new jdc(this, 7)));
    }

    private final void B() {
        ViewGroup viewGroup = this.aK;
        if (viewGroup.getChildCount() > 0) {
            kro.X(viewGroup, (admh) this.al.io());
        }
    }

    private final void C(hww hwwVar, aqof aqofVar, View view, Runnable runnable) {
        if (aqofVar == null || view == null || !hwwVar.b(hww.c)) {
            return;
        }
        aefv aefvVar = this.aW;
        aefk aefkVarM = aefvVar.m(aqofVar);
        aefkVarM.a = view;
        aefl aeflVarC = aefkVarM.c();
        if (aefvVar.k(aeflVarC)) {
            aefvVar.c(aeflVarC);
            runnable.run();
        }
    }

    private final void D() {
        int i = this.bh;
        int i2 = this.aZ;
        if (i != i2) {
            this.bh = i2;
            this.bb.a(i2, 200L);
        }
        this.bc.a(0, 200L);
        E(i2, i2, 200L);
        this.ae.c(iwl.a, Duration.ofMillis(200L));
    }

    private final void E(int i, int i2, long j) {
        if (i == this.bi && i2 == this.bj) {
            return;
        }
        Duration durationOfMillis = Duration.ofMillis(j);
        this.be.a(new int[]{i, i2}, durationOfMillis);
        this.aI.setImageTintList(ColorStateList.valueOf(i2));
        if (!H()) {
            this.aL.setBackground(new ColorDrawable(i2));
        }
        vxz vxzVar = this.aw;
        if (!vxzVar.l(95, 45762151L, false) && vxzVar.l(85, 45746502L, false)) {
            ggf ggfVar = this.bf;
            if (ggfVar != null) {
                ggfVar.a(new int[]{i, 0}, durationOfMillis);
            }
            ggf ggfVar2 = this.bg;
            if (ggfVar2 != null) {
                ggfVar2.a(new int[]{0, avv.c(i, i2, 0.5f), i2}, durationOfMillis);
            }
        }
        this.bi = i;
        this.bj = i2;
        this.bh = i;
    }

    private final void F(iwl iwlVar, long j) {
        this.ae.c(iwlVar, Duration.ofMillis(j));
        E(iwlVar == iwl.d ? iwlVar.f.d : iwlVar.f.a, iwlVar.f.d, j);
    }

    private final void G(alay alayVar, String str, alay alayVar2) {
        if (alayVar == null) {
            alayVar = alay.a;
        }
        String strC = typ.c(str);
        if (alayVar2 == null) {
            alayVar2 = alay.a;
        }
        Spanned spannedK = ackj.k(null, alayVar, null, false);
        cf cfVar = this.E;
        yco ycoVar = ((ycp) this.h.io()).e;
        TextView textView = this.t;
        TextView textView2 = this.u;
        joe joeVarA = joe.a(cfVar, ycoVar, textView, textView2, spannedK.toString(), strC);
        CharSequence charSequenceA = A(joeVarA.a);
        CharSequence charSequenceA2 = A(alayVar2);
        String str2 = joeVarA.b;
        YouTubeTextView youTubeTextView = this.r;
        if (TextUtils.equals(youTubeTextView.getText(), spannedK) && TextUtils.equals(textView.getText(), charSequenceA) && !this.bl && TextUtils.equals(this.s.getText(), charSequenceA2) && TextUtils.equals(textView2.getText(), str2)) {
            return;
        }
        aunn aunnVar = this.aQ;
        Handler handler = (Handler) aunnVar.io();
        Runnable runnable = this.aT;
        handler.removeCallbacks(runnable);
        youTubeTextView.setSelected(false);
        textView.setSelected(false);
        youTubeTextView.setText(spannedK);
        this.s.setText(charSequenceA2);
        textView.setText(charSequenceA);
        textView2.setText(str2);
        ((Handler) aunnVar.io()).postDelayed(runnable, this.aS);
    }

    private final boolean H() {
        aunn aunnVar = this.N;
        return !((jnj) aunnVar.io()).t() && ((jnj) aunnVar.io()).s();
    }

    private static final agke I(List list) {
        return (agke) Collection.EL.stream(list).filter(new jor(0)).map(new ixa(10)).collect(aghu.a);
    }

    private static final void J(YouTubeTextView youTubeTextView) {
        youTubeTextView.setVisibility(8);
        youTubeTextView.setText((CharSequence) null);
    }

    private final int y(iwl iwlVar) {
        return H() ? tzk.i(this.E, R.attr.ytBaseBackground) : iwlVar.f.b;
    }

    private final amdd z(dii diiVar) {
        aihf aihfVarCreateBuilder = amdd.a.createBuilder();
        aihf aihfVarCreateBuilder2 = amdg.a.createBuilder();
        int iL = this.aV.l(diiVar);
        aihfVarCreateBuilder2.copyOnWrite();
        amdg amdgVar = (amdg) aihfVarCreateBuilder2.instance;
        amdgVar.c = iL - 1;
        amdgVar.b |= 1;
        amdg amdgVar2 = (amdg) aihfVarCreateBuilder2.build();
        aihfVarCreateBuilder.copyOnWrite();
        amdd amddVar = (amdd) aihfVarCreateBuilder.instance;
        amdgVar2.getClass();
        amddVar.f = amdgVar2;
        amddVar.b |= 4;
        return (amdd) aihfVarCreateBuilder.build();
    }

    @Override // defpackage.hyy
    public final void a(hyw hywVar) {
        r(null);
    }

    @Override // defpackage.job
    public final void c() {
        this.R.b(new ixe(this, 13), true);
    }

    public final Optional e() {
        alay alayVarB;
        Optional optionalAh = ((axfd) this.f.io()).ah();
        return (!optionalAh.isPresent() || (alayVarB = ((hyw) optionalAh.get()).b()) == null) ? Optional.empty() : Collection.EL.stream(alayVarB.c).filter(new iui(19)).map(new ixa(9)).findFirst();
    }

    @Override // defpackage.xzf
    public final void g(xzc xzcVar) {
        r(null);
        q();
    }

    @Override // defpackage.acdp
    public final void gU(int i) {
        if ((262144 & i) != 0) {
            this.x.e();
        }
        if ((i & 32768) != 0) {
            this.x.d();
        }
    }

    @Override // defpackage.xzf
    public final void h(xzc xzcVar) {
        r(null);
        q();
    }

    @Override // defpackage.abjj
    public final void ho(int i, int i2) {
        r(null);
    }

    public final Optional i(wjf wjfVar) {
        if (wjfVar.equals(this.bm)) {
            return Optional.empty();
        }
        this.bm = wjfVar;
        Optional optionalEmpty = Optional.empty();
        try {
            aqof aqofVar = ((alvq) DesugarArrays.stream(wjfVar.ad()).filter(new iui(20)).filter(new jor(1)).findFirst().get()).e;
            if (aqofVar == null) {
                aqofVar = aqof.a;
            }
            return Optional.of(aqofVar);
        } catch (NoSuchElementException unused) {
            return optionalEmpty;
        }
    }

    public final void j(xhc xhcVar) {
        ((xgn) this.G.io()).l(new xgj(xhcVar));
    }

    @Override // defpackage.xzf
    public final void jv(xzc xzcVar) {
        r(null);
        q();
    }

    public final void k() {
        ViewGroup viewGroup = this.aJ;
        if (viewGroup.getChildCount() > 0) {
            kro.X(viewGroup, (admh) this.al.io());
        }
        B();
    }

    public final void l(int i, dii diiVar, Map map) {
        aunn aunnVar = this.G;
        xgt xgtVarA = ((xgn) aunnVar.io()).a();
        if (xgtVarA != null) {
            String str = diiVar.d;
            xgx xgxVar = (xgx) map.get(str);
            if (xgxVar == null) {
                xgxVar = new xgx(xgtVarA, xhb.b(i));
                map.put(str, xgxVar);
            }
            ((xgn) aunnVar.io()).d(xgxVar);
            ((xgn) aunnVar.io()).w(xgxVar, z(diiVar));
        }
    }

    public final void m(dii diiVar, Map map) {
        xgz xgzVar = (xgz) map.get(diiVar.d);
        if (xgzVar != null) {
            ((xgn) this.G.io()).o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, xgzVar, z(diiVar));
        }
    }

    public final void n(hww hwwVar) {
        C(hwwVar, this.as, this.aH, new iqc(this, 8));
    }

    public final void o(hww hwwVar) {
        if (!((jnj) this.N.io()).r() || e().isEmpty()) {
            return;
        }
        C(hwwVar, this.at, this.r, new ixe(this, 14));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r7v36, types: [java.lang.Object, rtb] */
    public final void p() {
        int i;
        int i2;
        aunn aunnVar = this.f;
        ((axfd) aunnVar.io()).ai(this);
        ((abjp) this.K.io()).q(this);
        jnq jnqVar = this.l;
        jnqVar.g();
        jny jnyVar = this.S;
        avmm avmmVar = jnyVar.j;
        jnd jndVar = jnyVar.q;
        abvn abvnVar = (abvn) jnyVar.a.io();
        int i3 = 3;
        int i4 = 4;
        int i5 = 1;
        int i6 = 18;
        int i7 = 0;
        avmmVar.e(((avlh) abvnVar.r().a).H(new igz(i4)).p().i(new abwr(i5)).al(new jnb(jndVar, 19), new ihp(18)), abvnVar.P().i(new abwr(i5)).al(new jnb(jndVar, 20), new ihp(18)), ((avlh) abvnVar.r().k).x(new jna(i4)).i(new abwr(i5)).al(new joc(jndVar, i5), new ihp(18)));
        vxz vxzVar = jnyVar.p;
        int i8 = 17;
        int i9 = 6;
        if (vxzVar.l(129, 45835546L, false)) {
            Optional optionalAh = ((axfd) jnyVar.i.io()).ah();
            if (true == optionalAh.isPresent()) {
                optionalAh = Optional.ofNullable(((hyw) optionalAh.get()).e());
            }
            jfn jfnVar = new jfn(jnyVar, 5);
            i = 5;
            if (true == optionalAh.isPresent()) {
                ((jny) jfnVar.a).e((aqmh) optionalAh.get());
            }
        } else {
            i = 5;
            if (vxzVar.l(131, 45844259L, false)) {
                avmmVar.c(jnyVar.c.i(new abwr(i5)).al(new jnb(jnyVar, i6), new ihp(17)));
            } else {
                int i10 = 2;
                avlh avlhVarI = jnyVar.b.i(new abwr(i10));
                iwm iwmVar = jnyVar.f;
                iwmVar.getClass();
                avmmVar.c(avlhVarI.H(new hby(iwmVar, i9)).x(new ifu(jnyVar, i10)).i(new abwr(i5)).al(new jnb(jnyVar, i6), new ihp(17)));
            }
        }
        if (vxzVar.l(105, 45795183L, false)) {
            avmmVar.c(avlh.f(jnyVar.d, jnyVar.h, new jnx(i7)).p().P().L(jnyVar.g).al(new jgq(jnyVar, 6), new ihp(17)));
        }
        ((hfk) this.J.io()).b();
        aunn aunnVar2 = this.aa;
        ((abuz) aunnVar2.io()).a = this.af;
        gev gevVar = (gev) this.Y.io();
        Iterator it = gevVar.b.iterator();
        while (it.hasNext()) {
            ((rtc) it.next()).a(gevVar.a);
        }
        abuz abuzVar = (abuz) aunnVar2.io();
        Object obj = abuzVar.a;
        if (obj != null) {
            rya ryaVar = (rya) abuzVar.b;
            if (ryaVar.a.g() && !Objects.equals(ryaVar.a.c(), obj)) {
                rmp rmpVar = ryaVar.b;
                rmp.n(null, "Received mismatching registration request for companionApi");
            }
            ryaVar.a = new agfa(obj);
        }
        Iterator it2 = ((omj) this.Z.io()).a.iterator();
        while (it2.hasNext()) {
            ((sbb) it2.next()).a = this;
        }
        if (this.af != null) {
            heg hegVar = (heg) this.aX.io();
            rsf rsfVar = this.af;
            rsfVar.getClass();
            hegVar.a = rsfVar;
            sqr sqrVar = rsfVar.f;
            if (sqrVar != null) {
                sqrVar.c();
            }
        }
        hbq hbqVar = (hbq) this.ac.io();
        hbqVar.e.w.h(hbqVar);
        hbqVar.c = new hbp(hbqVar, 0);
        this.ae.a();
        hxj hxjVar = this.m;
        if (hxjVar != null && !this.aw.l(81, 45739191L, false)) {
            ((tbt) this.d.io()).f(hxjVar.j);
            this.c.e(hxjVar.k.a((abvn) this.e.io()));
        }
        avmm avmmVar2 = this.c;
        aber aberVar = jnqVar.X;
        aunn aunnVar3 = this.e;
        avmmVar2.e(aberVar.b((abvn) aunnVar3.io()));
        avmmVar2.e(this.aF.a((abvn) aunnVar3.io()));
        int i11 = 9;
        avmn[] avmnVarArr = new avmn[9];
        avmnVarArr[0] = ((avlh) ((abvn) aunnVar3.io()).r().n).i(new abwr(i5)).al(new joc(this, i8), new jop(0));
        avmnVarArr[1] = ((abvn) aunnVar3.io()).P().i(new abwr(i5)).al(new avni() { // from class: joq
            /* JADX WARN: Code duplicated, block: B:100:0x02bc  */
            /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.Set] */
            @Override // defpackage.avni
            public final void a(Object obj2) {
                wjf wjfVar;
                wgi wgiVar;
                ajsy ajsyVar;
                yco ycoVar;
                aayw aaywVar = (aayw) obj2;
                abnw abnwVar = aaywVar.b;
                int iOrdinal = abnwVar.ordinal();
                joz jozVar = this.a;
                if (iOrdinal == 0) {
                    jozVar.t();
                    jozVar.r.setText("");
                    jozVar.x();
                    jozVar.s.setText("");
                    jozVar.t.setText("");
                    jozVar.u.setText("");
                    jozVar.k();
                    jozVar.v(null);
                    jozVar.q.setText("");
                } else if (iOrdinal == 3) {
                    jozVar.r(aaywVar.c);
                } else if (iOrdinal == 4) {
                    wgi wgiVar2 = aaywVar.d;
                    if (wgiVar2 == null) {
                        if (jozVar.aw.l(110, 45807806L, false)) {
                            jozVar.k();
                        }
                        ((vor) jozVar.X.io()).A();
                        jozVar.t();
                    } else {
                        amae amaeVar = wgiVar2.a;
                        int iHashCode = amaeVar.hashCode();
                        if (jozVar.aq != iHashCode) {
                            jozVar.aq = iHashCode;
                            jij jijVar = jozVar.ax;
                            ?? r10 = jijVar.b;
                            if (!r10.isEmpty()) {
                                Iterator it3 = r10.iterator();
                                while (it3.hasNext()) {
                                    ((abxv) jijVar.a).L((String) it3.next());
                                }
                                r10.clear();
                            }
                            amab amabVar = amaeVar.m;
                            if (amabVar == null) {
                                amabVar = amab.a;
                            }
                            if (amabVar.b == 152873793) {
                                amab amabVar2 = amaeVar.m;
                                if (amabVar2 == null) {
                                    amabVar2 = amab.a;
                                }
                                aqof aqofVar = amabVar2.b == 152873793 ? (aqof) amabVar2.c : aqof.a;
                                Object obj3 = jijVar.c;
                                String strO = kro.O(aqofVar);
                                if (strO != null) {
                                    r10.add(strO);
                                    ((abxv) jijVar.a).K(aqofVar, new hsb(jijVar, 4), true);
                                }
                            }
                            ((vor) jozVar.X.io()).q(wgiVar2);
                            if ((amaeVar.b & 262144) != 0) {
                                vxe vxeVar = (vxe) jozVar.H.io();
                                ajwo ajwoVar = amaeVar.w;
                                if (ajwoVar == null) {
                                    ajwoVar = ajwo.a;
                                }
                                vxeVar.a(ajwoVar);
                            }
                            aunn aunnVar4 = jozVar.N;
                            if (((jnj) aunnVar4.io()).r()) {
                                Iterator it4 = wgiVar2.e.iterator();
                                while (it4.hasNext()) {
                                    ((vxe) jozVar.H.io()).a((ajwo) it4.next());
                                }
                            }
                            List listAh = fhz.ah(amaeVar);
                            if (listAh.isEmpty()) {
                                zvp.a(zvn.b, zvm.n, "No player page tabs found in the WatchNext response");
                                cf cfVar = jozVar.E;
                                aihf aihfVarCreateBuilder = aqjj.a.createBuilder();
                                String string = cfVar.getString(R.string.default_queue_title);
                                aihfVarCreateBuilder.copyOnWrite();
                                aqjj aqjjVar = (aqjj) aihfVarCreateBuilder.instance;
                                string.getClass();
                                aqjjVar.b |= 4;
                                aqjjVar.e = string;
                                aouj aoujVarAc = fhz.ac(amaeVar);
                                if (aoujVarAc != null) {
                                    aihf aihfVarCreateBuilder2 = aqjg.a.createBuilder();
                                    aihf aihfVarCreateBuilder3 = anvq.a.createBuilder();
                                    aihh aihhVar = (aihh) apji.a.createBuilder();
                                    aihhVar.e(aouq.a, aoujVarAc);
                                    aihfVarCreateBuilder3.copyOnWrite();
                                    anvq anvqVar = (anvq) aihfVarCreateBuilder3.instance;
                                    apji apjiVar = (apji) aihhVar.build();
                                    apjiVar.getClass();
                                    anvqVar.c = apjiVar;
                                    anvqVar.b |= 1;
                                    aihfVarCreateBuilder2.copyOnWrite();
                                    aqjg aqjgVar = (aqjg) aihfVarCreateBuilder2.instance;
                                    anvq anvqVar2 = (anvq) aihfVarCreateBuilder3.build();
                                    anvqVar2.getClass();
                                    aqjgVar.e = anvqVar2;
                                    aqjgVar.b |= 4194304;
                                    aihfVarCreateBuilder.copyOnWrite();
                                    aqjj aqjjVar2 = (aqjj) aihfVarCreateBuilder.instance;
                                    aqjg aqjgVar2 = (aqjg) aihfVarCreateBuilder2.build();
                                    aqjgVar2.getClass();
                                    aqjjVar2.i = aqjgVar2;
                                    aqjjVar2.b |= 16384;
                                } else {
                                    aihf aihfVarCreateBuilder4 = aqjg.a.createBuilder();
                                    anvq anvqVar3 = anvq.a;
                                    aihfVarCreateBuilder4.copyOnWrite();
                                    aqjg aqjgVar3 = (aqjg) aihfVarCreateBuilder4.instance;
                                    anvqVar3.getClass();
                                    aqjgVar3.e = anvqVar3;
                                    aqjgVar3.b |= 4194304;
                                    aihfVarCreateBuilder.copyOnWrite();
                                    aqjj aqjjVar3 = (aqjj) aihfVarCreateBuilder.instance;
                                    aqjg aqjgVar4 = (aqjg) aihfVarCreateBuilder4.build();
                                    aqjgVar4.getClass();
                                    aqjjVar3.i = aqjgVar4;
                                    aqjjVar3.b |= 16384;
                                }
                                listAh = agke.q(new aftj((aqjj) aihfVarCreateBuilder.build()));
                            }
                            jol jolVar = jozVar.k;
                            adly adlyVar = jozVar.F;
                            jolVar.hU(adlyVar, listAh);
                            jozVar.r(null);
                            if (((jnj) aunnVar4.io()).r()) {
                                Optional optionalAd = fhz.ad(wgiVar2, "music-watch-page-song-title");
                                jfn jfnVar2 = new jfn(jozVar, 8);
                                if (true == optionalAd.isPresent()) {
                                    Object obj4 = optionalAd.get();
                                    joz jozVar2 = (joz) jfnVar2.a;
                                    jozVar2.at = (aqof) obj4;
                                    jozVar2.o(((hfn) jozVar2.M.io()).x());
                                }
                            }
                            vxz vxzVar2 = jozVar.aw;
                            if (vxzVar2.l(110, 45807806L, false)) {
                                Optional optionalAh2 = ((axfd) jozVar.f.io()).ah();
                                if (true == optionalAh2.isPresent()) {
                                    optionalAh2 = Optional.ofNullable(((hyw) optionalAh2.get()).i());
                                }
                                List list = (List) optionalAh2.orElse(null);
                                aorw aorwVarZ = fhz.Z(wgiVar2);
                                jozVar.u((aorwVarZ == null || aorwVarZ.m.isEmpty()) ? list : aorwVarZ.m, list);
                            }
                            amaf amafVar = amaeVar.e;
                            if (amafVar == null) {
                                amafVar = amaf.a;
                            }
                            if (((amafVar.b == 125354411 ? (alzq) amafVar.c : alzq.a).b & SemanticState.Focused) == 0) {
                                ajsyVar = null;
                            } else {
                                amaf amafVar2 = amaeVar.e;
                                if (amafVar2 == null) {
                                    amafVar2 = amaf.a;
                                }
                                apji apjiVar2 = (amafVar2.b == 125354411 ? (alzq) amafVar2.c : alzq.a).e;
                                if (apjiVar2 == null) {
                                    apjiVar2 = apji.a;
                                }
                                aihl aihlVarCheckIsLite = aihn.checkIsLite(ajtd.b);
                                apjiVar2.c(aihlVarCheckIsLite);
                                if (apjiVar2.j.n(aihlVarCheckIsLite.d)) {
                                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajtd.b);
                                    apjiVar2.c(aihlVarCheckIsLite2);
                                    Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                                    ajsyVar = (ajsy) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                                } else {
                                    ajsyVar = null;
                                }
                            }
                            if (ajsyVar != null && !vxzVar2.l(41, 45679250L, false) && ((ycoVar = ((ycp) jozVar.h.io()).e) == null || ycoVar.b() == 2)) {
                                amyl amylVar = ajsyVar.o;
                                if (amylVar == null) {
                                    amylVar = amyl.a;
                                }
                                Optional optionalFindFirst = Collection.EL.stream(((abxv) jozVar.g.io()).l(false)).filter(new jmy(amylVar.f, 2)).findFirst();
                                if (!optionalFindFirst.isEmpty()) {
                                    aunn aunnVar5 = jozVar.O;
                                    if (!xrx.m((dii) optionalFindFirst.get()) || ((Boolean) jozVar.ah.io()).booleanValue()) {
                                        dii diiVar = (dii) optionalFindFirst.get();
                                        ChipCloudChipView chipCloudChipView = jozVar.y;
                                        chipCloudChipView.a(ajsyVar);
                                        jozVar.l(157524, diiVar, jozVar.U);
                                        chipCloudChipView.setOnClickListener(new joy(jozVar, diiVar, (xre) jozVar.i.io(), (Boolean) jozVar.ai.io(), (dov) aunnVar5.io(), (xrd) jozVar.P.io(), (tbt) jozVar.d.io(), diiVar));
                                        jozVar.l(157525, diiVar, jozVar.V);
                                        chipCloudChipView.b(new jip(jozVar, diiVar, 5, (char[]) null));
                                        chipCloudChipView.setVisibility(0);
                                        ((ydu) jozVar.T.io()).i();
                                    }
                                }
                            }
                            jozVar.q();
                            sqq sqqVar = jozVar.o;
                            if (sqqVar != null) {
                                sqqVar.d(adlyVar);
                            }
                        }
                    }
                }
                abnw abnwVar2 = abnw.d;
                if (abnwVar.b(abnwVar2) && (wjfVar = aaywVar.c) != null && (wgiVar = aaywVar.d) != null) {
                    Optional optionalOr = jozVar.i(wjfVar).or(new gpa(wgiVar, 19));
                    if (optionalOr.isPresent()) {
                        jozVar.as = (aqof) optionalOr.get();
                        jozVar.n(((hfn) jozVar.M.io()).x());
                    }
                }
                if (abnwVar.b(abnwVar2)) {
                    jozVar.v(fhz.S(aaywVar.d));
                }
                jozVar.j(xhb.b(16499));
            }
        }, new jop(0));
        avmnVarArr[2] = ((avlh) ((abvn) aunnVar3.io()).r().a).H(new igz(i11)).p().i(new abwr(i5)).al(new joc(this, 14), new jop(0));
        aunn aunnVar4 = this.M;
        avmnVarArr[3] = ((hfn) aunnVar4.io()).y().i(new abwr(i5)).al(new joc(this, 15), new jop(0));
        avmnVarArr[4] = ((hwz) this.az.io()).h().i(new abwr(i5)).al(new joc(this, 16), new jop(0));
        avmnVarArr[i] = ((avlh) this.ay.io()).i(new abwr(i5)).al(new joc(this, i11), new jop(0));
        avmnVarArr[6] = ((igk) this.aA.io()).b().i(new abwr(i5)).al(new joc(this, 10), new jop(0));
        int i12 = 7;
        avmnVarArr[7] = ((ied) this.aC.io()).a().x(new jna(8)).i(new abwr(i5)).al(new joc(this, 11), new jop(0));
        avmnVarArr[8] = ((jod) this.aB.io()).a().N().p().L(this.aR).al(new joc(this, 12), new jop(0));
        avmmVar2.e(avmnVarArr);
        this.ak.w(this);
        r(null);
        tqj tqjVar = (tqj) this.ad.io();
        int i13 = tqr.a;
        if (tqjVar.k(1073830358) && ((hfn) aunnVar4.io()).x() == hww.a) {
            this.p.N();
            if (((axfd) aunnVar.io()).ah().isPresent() || ((abvn) aunnVar3.io()).o().U()) {
                q();
            }
        }
        ViewGroup viewGroup = this.aH;
        if (viewGroup.getChildCount() <= 0) {
            cf cfVar = this.E;
            dfo dfoVar = (dfo) LayoutInflater.from(cfVar).inflate(R.layout.player_cast_media_route_button, (ViewGroup) null);
            dfoVar.b(ok.e().c(cfVar, ((jnj) this.N.io()).e()));
            this.aU.b(dfoVar);
            dfoVar.setAccessibilityLiveRegion(1);
            viewGroup.addView(dfoVar);
        }
        xrn xrnVar = this.aU;
        dfo dfoVar2 = this.aG;
        xrnVar.b(dfoVar2);
        dfoVar2.setAccessibilityLiveRegion(1);
        if (hxjVar != null) {
            hxjVar.c();
        }
        jol jolVar = this.k;
        jolVar.j.f(jolVar);
        ((abjp) jolVar.D.io()).q(jolVar);
        ((abea) jolVar.b.io()).e(jolVar);
        jolVar.q.ab(jolVar.e());
        ((jng) jolVar.n.io()).c = new jni(jolVar);
        avmm avmmVar3 = jolVar.f;
        aunn aunnVar5 = jolVar.i;
        avmmVar3.e(((hfn) jolVar.g.io()).y().i(new abwr(i5)).al(new joc(jolVar, i4), new ihp(20)), ((hfn) jolVar.h.io()).M().al(new joc(jolVar, i), new ihp(20)), ((abvn) aunnVar5.io()).G().i(new abwr(i5)).al(new joc(jolVar, i9), new ihp(20)), jolVar.z.i(new abwr(i5)).al(new joc(jolVar, i12), new ihp(20)));
        aunn aunnVar6 = jolVar.m;
        if (((jnj) aunnVar6.io()).r()) {
            avmmVar3.c(((avlh) ((abvn) aunnVar5.io()).r().a).H(new hpr(19)).p().i(new abwr(i5)).al(new jgq(jolVar, 8), new ihp(20)));
        }
        if (jolVar.J.l(69, 45728267L, false)) {
            avmmVar3.e(((avlh) ((aczl) jolVar.s.io()).a).p().i(new abwr(i5)).al(new jgq(jolVar, 9), new ihp(20)));
        } else {
            avmmVar3.e((((jnj) aunnVar6.io()).n() ? ((ied) jolVar.r.io()).b() : ((ied) jolVar.r.io()).a()).x(new jna(i12)).p().i(new abwr(i5)).al(new joc(jolVar, i3), new ihp(20)));
        }
        jqo jqoVar = this.n;
        if (jqoVar != null) {
            aunn aunnVar7 = jqoVar.j;
            if (!((vxz) aunnVar7.io()).l(85, 45746502L, false)) {
                jqoVar.k.g(new dui(jqoVar.n));
            }
            jqoVar.k.l(jqoVar.p);
            jqoVar.l.l(jqoVar.q);
            aunn aunnVar8 = jqoVar.b;
            ((abjp) aunnVar8.io()).q(jqoVar);
            ((abjp) aunnVar8.io()).b.hK(jqoVar);
            avmm avmmVar4 = jqoVar.o;
            avlh avlhVarP = ((hfn) jqoVar.c.io()).y().P();
            avmb avmbVar = jqoVar.i;
            i2 = 1;
            aunn aunnVar9 = jqoVar.e;
            avmmVar4.e(avlhVarP.L(avmbVar).al(new jqi(jqoVar, i5), new jop(2)), jqoVar.x.h().L(avmbVar).al(new jqi(jqoVar, i7), new jop(2)), ((avlh) ((abvn) aunnVar9.io()).r().a).H(new igz(10)).p().L(avmbVar).al(new joc(jqoVar, 19), new jop(2)), ((avlh) ((abvn) aunnVar9.io()).r().k).L(avmbVar).p().al(new joc(jqoVar, 20), new jop(2)));
            if (((vxz) aunnVar7.io()).l(95, 45762151L, false)) {
                avmmVar4.c(((avlh) ((kwq) jqoVar.d.io()).c).H(new hpr(20)).p().L(avmbVar).al(new jgq(jqoVar.f, 11), new jop(2)));
            }
            if (((vxz) aunnVar7.io()).l(85, 45746502L, false)) {
                jqv jqvVar = jqoVar.f;
                jqvVar.l = jqvVar.a.size();
                jqvVar.jW();
                jqr jqrVar = jqoVar.m;
                jqrVar.m = jqrVar.a.size();
                jqrVar.jW();
            }
            if (!((abjp) aunnVar8.io()).b.isEmpty()) {
                jqoVar.b(((abjp) aunnVar8.io()).b(jqoVar.w.q()), false);
            }
        } else {
            i2 = 1;
        }
        ((ycp) this.h.io()).a(this);
        this.p.bK.add(this);
        final YouTubeTextView youTubeTextView = this.q;
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: jos
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                boolean z = !twb.c(this.a.E);
                YouTubeTextView youTubeTextView2 = youTubeTextView;
                youTubeTextView2.setClickable(z);
                if (youTubeTextView2.getLineCount() <= 1) {
                    youTubeTextView2.e(true);
                    return;
                }
                CharSequence text = youTubeTextView2.getText();
                if (text != null) {
                    youTubeTextView2.e(false);
                    youTubeTextView2.setText(text.toString());
                }
            }
        };
        youTubeTextView.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        this.ag = onGlobalLayoutListener;
        ((vqs) this.W.io()).c();
        avmn avmnVar = this.av;
        if (avmnVar == null || avmnVar.f()) {
            this.av = ((avlh) ((abvn) aunnVar3.io()).r().a).x(new jna(9)).i(new abwr(i2)).al(new joc(this, 13), new jop(0));
        }
    }

    public final void q() {
        yco ycoVar = ((ycp) this.h.io()).e;
        if (ycoVar == null) {
            J(this.q);
            return;
        }
        Resources resources = this.E.getResources();
        int iB = ycoVar.b();
        if (iB == 0) {
            YouTubeTextView youTubeTextView = this.q;
            youTubeTextView.setVisibility(0);
            youTubeTextView.setText(resources.getString(R.string.mini_player_mdx_connecting, ycoVar.n().d));
        } else {
            YouTubeTextView youTubeTextView2 = this.q;
            if (iB != 1) {
                J(youTubeTextView2);
            } else {
                youTubeTextView2.setVisibility(0);
                youTubeTextView2.setText(resources.getString(R.string.mini_player_mdx_playing, ycoVar.n().d));
            }
        }
    }

    public final void r(wjf wjfVar) {
        CharSequence charSequenceE;
        aunn aunnVar = this.f;
        if (((axfd) aunnVar.io()).ah().isEmpty() && wjfVar == null) {
            return;
        }
        this.R.a();
        if (this.bk) {
            this.bk = false;
            WatchWhileLayout watchWhileLayout = this.p;
            watchWhileLayout.bC = false;
            watchWhileLayout.aJ.E = true;
            watchWhileLayout.R();
            TextView textView = this.u;
            textView.setVisibility(0);
            this.t.setText("");
            textView.setText("");
            jqo jqoVar = this.n;
            if (jqoVar != null) {
                jqoVar.f(this.bk);
            }
            this.v.setImportantForAccessibility(0);
        }
        if (((axfd) aunnVar.io()).ah().isPresent()) {
            hyw hywVar = (hyw) ((axfd) aunnVar.io()).ah().get();
            String strG = hywVar.g();
            if (this.au.isPresent()) {
                strG = (String) this.au.get();
            }
            G(hywVar.b(), strG, hywVar.a());
            if (!this.aw.l(110, 45807806L, false)) {
                List listI = hywVar.i();
                u(listI, listI);
            }
            this.bl = false;
            charSequenceE = ackj.e(hywVar.b());
        } else {
            if (wjfVar != null) {
                String strF = wjfVar.F();
                int i = ackj.b;
                alay alayVar = alay.a;
                aihh aihhVar = (aihh) alayVar.createBuilder();
                if (strF == null) {
                    strF = "";
                }
                aihhVar.copyOnWrite();
                alay alayVar2 = (alay) aihhVar.instance;
                alayVar2.b |= 1;
                alayVar2.d = strF;
                alay alayVar3 = (alay) aihhVar.build();
                String strB = wjfVar.B();
                String strB2 = wjfVar.B();
                aihh aihhVar2 = (aihh) alayVar.createBuilder();
                String str = strB2 != null ? strB2 : "";
                aihhVar2.copyOnWrite();
                alay alayVar4 = (alay) aihhVar2.instance;
                alayVar4.b |= 1;
                alayVar4.d = str;
                G(alayVar3, strB, (alay) aihhVar2.build());
                if (!this.aw.l(110, 45807806L, false)) {
                    u(null, null);
                }
                this.bl = true;
            }
            charSequenceE = null;
        }
        x();
        YouTubeTextView youTubeTextView = this.r;
        youTubeTextView.setContentDescription(charSequenceE);
        youTubeTextView.setClickable(this.aw.l(40, 45677954L, false) && e().isPresent());
    }

    public final void s() {
        if (this.bk) {
            return;
        }
        this.bk = true;
        WatchWhileLayout watchWhileLayout = this.p;
        watchWhileLayout.bC = true;
        watchWhileLayout.aJ.E = false;
        watchWhileLayout.R();
        this.j.a(new abgi(abgh.c, false));
        vxz vxzVar = this.aw;
        if (vxzVar.l(135, 45851531L, false)) {
            TextView textView = this.t;
            cf cfVar = this.E;
            textView.setText(cfVar.getString(R.string.mini_player_refresh_default_text));
            TextView textView2 = this.u;
            textView2.setVisibility(0);
            textView2.setText(cfVar.getString(R.string.mini_player_refresh_default_subtitle_text));
        } else {
            TextView textView3 = this.u;
            textView3.setVisibility(8);
            this.t.setText(this.E.getString(R.string.mini_player_default_text));
            textView3.setText("");
        }
        if (vxzVar.l(118, 45823962L, false)) {
            this.bd.a(this.aZ, 450L);
        }
        B();
        jqo jqoVar = this.n;
        if (jqoVar != null) {
            jqoVar.f(this.bk);
        }
        aunn aunnVar = this.aD;
        if (aunnVar.io() != null) {
            hwc hwcVar = (hwc) aunnVar.io();
            if (hwcVar.A == null) {
                Drawable colorDrawable = new ColorDrawable(hwcVar.getContext().getColor(R.color.ytm_color_grey_09));
                if (hwcVar.S.l(135, 45851531L, false)) {
                    aduk adukVar = new aduk(hwcVar.getContext(), hwcVar.M.b(arqz.t));
                    adukVar.b(tzk.i(hwcVar.getContext(), R.attr.ytTextDisabled));
                    hwa hwaVar = new hwa(new Drawable[]{colorDrawable, adukVar.a()});
                    hwaVar.setLayerGravity(1, 17);
                    colorDrawable = hwaVar;
                }
                hwcVar.A = colorDrawable;
            }
            hwcVar.b.setImageDrawable(hwcVar.A);
            hwcVar.B();
        }
        this.v.setImportantForAccessibility(2);
    }

    public final void t() {
        this.aq = 0;
    }

    public final void u(List list, List list2) {
        k();
        if (list != null && !list.isEmpty()) {
            kro.W(I(list), this.aJ, (admh) this.al.io(), this.F);
        }
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        kro.W(I(list2), this.aK, (admh) this.al.io(), this.F);
    }

    public final void v(ajnf ajnfVar) {
        this.D = ajnfVar != null;
        jbm jbmVar = this.aO;
        jbmVar.b(null);
        jbm jbmVar2 = this.aP;
        jbmVar2.b(null);
        if (ajnfVar == null) {
            this.aN.setVisibility(8);
            this.C.setVisibility(8);
            this.aM.setVisibility(8);
        } else {
            adly adlyVar = this.F;
            jbmVar.hU(adlyVar, ajnfVar);
            this.aN.setVisibility(0);
            this.aM.setVisibility(0);
            jbmVar2.hU(adlyVar, ajnfVar);
            this.C.setVisibility(true != ((hfn) this.M.io()).x().d() ? 8 : 0);
        }
    }

    public final void w(iwl iwlVar, long j) {
        int i;
        this.ap = iwlVar;
        if (iwlVar == null) {
            D();
            if (this.aw.l(118, 45823962L, false)) {
                this.bd.a(this.aZ, j);
                return;
            }
            return;
        }
        vxz vxzVar = this.aw;
        if (vxzVar.l(118, 45823962L, false) && !this.bk) {
            int iC = (int) vxzVar.c(8, 45824770L, 0L);
            if (iC == 1) {
                i = iwlVar.f.a;
            } else if (iC != 2) {
                i = iC != 3 ? this.aZ : iwlVar.f.c;
            } else {
                i = iwlVar.f.b;
            }
            this.bd.a(i, j);
        }
        switch (((hfn) this.M.io()).x().ordinal()) {
            case 0:
            case 1:
            case 11:
                D();
                break;
            case 2:
            case 3:
            case 7:
            case 8:
                this.bc.a(((kjc) this.aE.io()).n() ? y(iwlVar) : 0, j);
                F(iwlVar, j);
                break;
            case 4:
            case 5:
            case 6:
            case 9:
            case 10:
                this.bc.a(y(iwlVar), j);
                F(iwlVar, j);
                break;
        }
    }

    public final void x() {
        if (this.aw.l(89, 45756183L, false)) {
            boolean zIsPresent = e().isPresent();
            YouTubeTextView youTubeTextView = this.r;
            boolean z = true;
            boolean z2 = youTubeTextView.getCompoundDrawablesRelative()[2] != null;
            if (!zIsPresent) {
                z = z2;
            } else if (!z2) {
                cf cfVar = this.E;
                Integer numE = ((adxj) this.aY.io()).e(cfVar.getResources().getConfiguration().getLayoutDirection() == 1 ? arqz.fS : arqz.fU);
                youTubeTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, numE == null ? 0 : numE.intValue(), 0);
                Drawable drawable = youTubeTextView.getCompoundDrawablesRelative()[2];
                if (drawable != null) {
                    drawable.mutate().setTint(cfVar.getColor(R.color.ytm_color_white_70_percent));
                    youTubeTextView.setCompoundDrawablePadding(cfVar.getResources().getDimensionPixelSize(R.dimen.song_title_navigation_indicator_padding));
                    return;
                }
                return;
            }
            if (zIsPresent || !z) {
                return;
            }
            youTubeTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
            youTubeTextView.setCompoundDrawablePadding(0);
        }
    }
}
