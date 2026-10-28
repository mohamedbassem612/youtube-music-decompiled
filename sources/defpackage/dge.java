package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.session.MediaController;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.mediarouter.app.MediaRouteExpandCollapseButton;
import androidx.mediarouter.app.MediaRouteVolumeSlider;
import androidx.mediarouter.app.OverlayListView;
import com.google.android.apps.youtube.music.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class dge extends fv {
    public static final /* synthetic */ int W = 0;
    static final int b;
    Map A;
    final dga B;
    public PlaybackStateCompat C;
    MediaDescriptionCompat D;
    dfz E;
    Bitmap F;
    Uri G;
    boolean H;
    Bitmap I;
    int J;
    public boolean K;
    public boolean L;
    public boolean M;
    boolean N;
    boolean O;
    public int P;
    public int Q;
    public int R;
    public Interpolator S;
    public final AccessibilityManager T;
    final Runnable U;
    public fg V;
    private final dgb X;
    private boolean Y;
    private boolean Z;
    private int aa;
    private Button ab;
    private Button ac;
    private ImageButton ad;
    private ImageButton ae;
    private MediaRouteExpandCollapseButton af;
    private TextView ag;
    private TextView ah;
    private TextView ai;
    private final boolean aj;
    private View ak;
    private final Interpolator al;
    private final Interpolator am;
    final dij c;
    public final dii d;
    public final Context e;
    public FrameLayout f;
    public LinearLayout g;
    FrameLayout h;
    public ImageView i;
    final boolean j;
    public LinearLayout k;
    public RelativeLayout l;
    LinearLayout m;
    public OverlayListView n;
    public dgd o;
    public List p;
    public Set q;
    public Set r;
    public Set s;
    SeekBar t;
    dgc u;
    public dii v;
    public int w;
    public int x;
    public int y;
    public final int z;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        b = 30000;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public dge(Context context, int i) {
        Context contextM = ast.m(context, i, true);
        super(contextM, ast.h(contextM));
        this.aj = true;
        this.U = new cqc(this, 10, null);
        Context context2 = getContext();
        this.e = context2;
        this.B = new dga(this);
        this.c = dij.b(context2);
        this.j = dij.d();
        this.X = new dgb(this);
        this.d = dij.j();
        C(dij.g());
        this.z = context2.getResources().getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_padding_top);
        this.T = (AccessibilityManager) context2.getSystemService("accessibility");
        this.al = AnimationUtils.loadInterpolator(contextM, R.interpolator.mr_linear_out_slow_in);
        this.am = AnimationUtils.loadInterpolator(contextM, R.interpolator.mr_fast_out_slow_in);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.List] */
    private final void C(MediaSessionCompat$Token mediaSessionCompat$Token) {
        fg fgVar = this.V;
        if (fgVar != null) {
            fgVar.p(this.B);
            this.V = null;
        }
        if (mediaSessionCompat$Token == null || !this.Z) {
            return;
        }
        fg fgVar2 = new fg(this.e, mediaSessionCompat$Token);
        this.V = fgVar2;
        dga dgaVar = this.B;
        if (dgaVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (fgVar2.b.add(dgaVar)) {
            Handler handler = new Handler();
            dgaVar.e(handler);
            Object obj = fgVar2.a;
            axfd axfdVar = (axfd) obj;
            ((MediaController) axfdVar.d).registerCallback(dgaVar.a, handler);
            synchronized (axfdVar.a) {
                Object obj2 = ((axfd) obj).b;
                if (((MediaSessionCompat$Token) obj2).a() != null) {
                    eu euVar = new eu(dgaVar);
                    ((HashMap) ((axfd) obj).c).put(dgaVar, euVar);
                    dgaVar.c = euVar;
                    try {
                        ((MediaSessionCompat$Token) obj2).a().b(euVar);
                        dgaVar.d(13, null, null);
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                    }
                } else {
                    dgaVar.c = null;
                    ((axfd) obj).e.add(dgaVar);
                }
            }
        } else {
            Log.w("MediaControllerCompat", "the callback has already been registered");
        }
        MediaMetadataCompat mediaMetadataCompatN = this.V.n();
        this.D = mediaMetadataCompatN != null ? mediaMetadataCompatN.b() : null;
        this.C = this.V.o();
        r();
        q(false);
    }

    public static int i(View view) {
        return view.getLayoutParams().height;
    }

    static void p(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }

    static boolean w(Bitmap bitmap) {
        return bitmap != null && bitmap.isRecycled();
    }

    public final boolean A() {
        return (this.C.e & 1) != 0;
    }

    final boolean B(dii diiVar) {
        return this.aj && diiVar.b() == 1;
    }

    final int h(int i, int i2) {
        float f;
        float f2;
        float f3 = this.aa;
        if (i >= i2) {
            f = f3 * i2;
            f2 = i;
        } else {
            f = f3 * 9.0f;
            f2 = 16.0f;
        }
        return (int) ((f / f2) + 0.5f);
    }

    public final int j(boolean z) {
        if (!z && this.m.getVisibility() != 0) {
            return 0;
        }
        int paddingTop = this.k.getPaddingTop() + this.k.getPaddingBottom();
        if (z) {
            paddingTop += this.l.getMeasuredHeight();
        }
        if (this.m.getVisibility() == 0) {
            paddingTop += this.m.getMeasuredHeight();
        }
        return (z && this.m.getVisibility() == 0) ? this.ak.getMeasuredHeight() + paddingTop : paddingTop;
    }

    public final void k(View view, int i) {
        dfx dfxVar = new dfx(i(view), i, view);
        dfxVar.setDuration(this.P);
        dfxVar.setInterpolator(this.S);
        view.startAnimation(dfxVar);
    }

    public final void l(boolean z) {
        OverlayListView overlayListView;
        Set set;
        int firstVisiblePosition = this.n.getFirstVisiblePosition();
        int i = 0;
        while (true) {
            int childCount = this.n.getChildCount();
            overlayListView = this.n;
            if (i >= childCount) {
                break;
            }
            View childAt = overlayListView.getChildAt(i);
            dii diiVar = (dii) this.o.getItem(firstVisiblePosition + i);
            if (!z || (set = this.q) == null || !set.contains(diiVar)) {
                ((LinearLayout) childAt.findViewById(R.id.volume_item_container)).setVisibility(0);
                AnimationSet animationSet = new AnimationSet(true);
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 1.0f);
                alphaAnimation.setDuration(0L);
                animationSet.addAnimation(alphaAnimation);
                new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f).setDuration(0L);
                animationSet.setFillAfter(true);
                animationSet.setFillEnabled(true);
                childAt.clearAnimation();
                childAt.startAnimation(animationSet);
            }
            i++;
        }
        for (dgi dgiVar : overlayListView.a) {
            dgiVar.k = true;
            dgiVar.l = true;
            mqd mqdVar = dgiVar.m;
            if (mqdVar != null) {
                mqdVar.b();
            }
        }
        if (z) {
            return;
        }
        n(false);
    }

    final void m() {
        this.H = false;
        this.I = null;
        this.J = 0;
    }

    public final void n(boolean z) {
        this.q = null;
        this.r = null;
        this.N = false;
        if (this.O) {
            this.O = false;
            t(z);
        }
        this.n.setEnabled(true);
    }

    public final void o() {
        this.S = this.M ? this.al : this.am;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Z = true;
        this.c.p(did.a, this.X, 2);
        C(dij.g());
    }

    @Override // defpackage.fv, defpackage.gr, defpackage.qg, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        setContentView(R.layout.mr_controller_material_dialog_b);
        findViewById(android.R.id.button3).setVisibility(8);
        jn jnVar = new jn(this, 8);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.mr_expandable_area);
        this.f = frameLayout;
        frameLayout.setOnClickListener(new jn(this, 5));
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.mr_dialog_area);
        this.g = linearLayout;
        linearLayout.setOnClickListener(new iks(1));
        Context context = this.e;
        int iK = ast.k(context, 0, R.attr.colorPrimary);
        if (avv.a(iK, ast.k(context, 0, android.R.attr.colorBackground)) < 3.0d) {
            iK = ast.k(context, 0, R.attr.colorAccent);
        }
        Button button = (Button) findViewById(android.R.id.button2);
        this.ab = button;
        button.setText(R.string.mr_controller_disconnect);
        this.ab.setTextColor(iK);
        this.ab.setOnClickListener(jnVar);
        Button button2 = (Button) findViewById(android.R.id.button1);
        this.ac = button2;
        button2.setText(R.string.mr_controller_stop_casting);
        this.ac.setTextColor(iK);
        this.ac.setOnClickListener(jnVar);
        this.ai = (TextView) findViewById(R.id.mr_name);
        ImageButton imageButton = (ImageButton) findViewById(R.id.mr_close);
        this.ae = imageButton;
        imageButton.setOnClickListener(jnVar);
        this.h = (FrameLayout) findViewById(R.id.mr_default_control);
        jn jnVar2 = new jn(this, 6);
        ImageView imageView = (ImageView) findViewById(R.id.mr_art);
        this.i = imageView;
        imageView.setOnClickListener(jnVar2);
        findViewById(R.id.mr_control_title_container).setOnClickListener(jnVar2);
        this.k = (LinearLayout) findViewById(R.id.mr_media_main_control);
        this.ak = findViewById(R.id.mr_control_divider);
        this.l = (RelativeLayout) findViewById(R.id.mr_playback_control);
        this.ag = (TextView) findViewById(R.id.mr_control_title);
        this.ah = (TextView) findViewById(R.id.mr_control_subtitle);
        ImageButton imageButton2 = (ImageButton) findViewById(R.id.mr_control_playback_ctrl);
        this.ad = imageButton2;
        imageButton2.setOnClickListener(jnVar);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.mr_volume_control);
        this.m = linearLayout2;
        linearLayout2.setVisibility(8);
        SeekBar seekBar = (SeekBar) findViewById(R.id.mr_volume_slider);
        this.t = seekBar;
        dii diiVar = this.d;
        seekBar.setTag(diiVar);
        dgc dgcVar = new dgc(this);
        this.u = dgcVar;
        this.t.setOnSeekBarChangeListener(dgcVar);
        this.n = (OverlayListView) findViewById(R.id.mr_volume_group_list);
        this.p = new ArrayList();
        dgd dgdVar = new dgd(this, this.n.getContext(), this.p);
        this.o = dgdVar;
        this.n.setAdapter((ListAdapter) dgdVar);
        this.s = new HashSet();
        LinearLayout linearLayout3 = this.k;
        OverlayListView overlayListView = this.n;
        boolean zX = x();
        int iK2 = ast.k(context, 0, R.attr.colorPrimary);
        int iK3 = ast.k(context, 0, R.attr.colorPrimaryDark);
        if (zX && ast.i(context, 0) == -570425344) {
            iK3 = iK2;
            iK2 = -1;
        }
        linearLayout3.setBackgroundColor(iK2);
        overlayListView.setBackgroundColor(iK3);
        linearLayout3.setTag(Integer.valueOf(iK2));
        overlayListView.setTag(Integer.valueOf(iK3));
        ast.n(context, (MediaRouteVolumeSlider) this.t, this.k);
        HashMap map = new HashMap();
        this.A = map;
        map.put(diiVar, this.t);
        MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = (MediaRouteExpandCollapseButton) findViewById(R.id.mr_group_expand_collapse);
        this.af = mediaRouteExpandCollapseButton;
        mediaRouteExpandCollapseButton.f = new jn(this, 7);
        o();
        this.P = context.getResources().getInteger(R.integer.mr_controller_volume_group_list_animation_duration_ms);
        this.Q = context.getResources().getInteger(R.integer.mr_controller_volume_group_list_fade_in_duration_ms);
        this.R = context.getResources().getInteger(R.integer.mr_controller_volume_group_list_fade_out_duration_ms);
        this.Y = true;
        s();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.c.q(this.X);
        C(null);
        this.Z = false;
        super.onDetachedFromWindow();
    }

    @Override // defpackage.fv, android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 25 && i != 24) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.j || !this.M) {
            this.d.h(i == 25 ? -1 : 1);
        }
        return true;
    }

    @Override // defpackage.fv, android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 25 || i == 24) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0181  */
    /* JADX WARN: Code duplicated, block: B:69:0x0125  */
    /* JADX WARN: Code duplicated, block: B:70:0x0127  */
    /* JADX WARN: Code duplicated, block: B:73:0x012f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0131  */
    /* JADX WARN: Code duplicated, block: B:77:0x0139  */
    /* JADX WARN: Code duplicated, block: B:82:0x0143  */
    /* JADX WARN: Code duplicated, block: B:85:0x014c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0152  */
    /* JADX WARN: Code duplicated, block: B:89:0x015a  */
    /* JADX WARN: Code duplicated, block: B:91:0x0160  */
    /* JADX WARN: Code duplicated, block: B:92:0x0167  */
    /* JADX WARN: Code duplicated, block: B:94:0x016d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0174  */
    /* JADX WARN: Code duplicated, block: B:98:0x017b  */
    public final void q(boolean z) {
        boolean z2;
        boolean z3;
        int i;
        int i2;
        PlaybackStateCompat playbackStateCompat;
        int i3;
        boolean z4;
        Context context;
        int i4;
        int i5;
        boolean z5;
        if (this.v != null) {
            this.K = true;
            this.L |= z;
            return;
        }
        this.K = false;
        this.L = false;
        dii diiVar = this.d;
        if (!diiVar.o() || diiVar.l()) {
            dismiss();
            return;
        }
        if (this.Y) {
            this.ai.setText(diiVar.e);
            this.ab.setVisibility(true != diiVar.k ? 8 : 0);
            if (this.H) {
                if (w(this.I)) {
                    Bitmap bitmap = this.I;
                    Objects.toString(bitmap);
                    Log.w("MediaRouteCtrlDialog", "Can't set artwork image with recycled bitmap: ".concat(String.valueOf(bitmap)));
                } else {
                    this.i.setImageBitmap(this.I);
                    this.i.setBackgroundColor(this.J);
                }
                m();
            }
            boolean z6 = this.j;
            if (!z6 && x()) {
                this.m.setVisibility(8);
                this.M = true;
                this.n.setVisibility(0);
                o();
                t(false);
            } else if ((this.M && !z6) || !B(diiVar)) {
                this.m.setVisibility(8);
            } else if (this.m.getVisibility() == 8) {
                this.m.setVisibility(0);
                this.t.setMax(diiVar.q);
                this.t.setProgress(diiVar.p);
                this.af.setVisibility(true != x() ? 8 : 0);
            }
            if (v()) {
                MediaDescriptionCompat mediaDescriptionCompat = this.D;
                CharSequence charSequence = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.b;
                boolean zIsEmpty = TextUtils.isEmpty(charSequence);
                MediaDescriptionCompat mediaDescriptionCompat2 = this.D;
                CharSequence charSequence2 = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.c : null;
                boolean zIsEmpty2 = TextUtils.isEmpty(charSequence2);
                if (diiVar.r != -1) {
                    this.ag.setText(R.string.mr_controller_casting_screen);
                } else {
                    PlaybackStateCompat playbackStateCompat2 = this.C;
                    if (playbackStateCompat2 == null || playbackStateCompat2.a == 0) {
                        this.ag.setText(R.string.mr_controller_no_media_selected);
                    } else {
                        if (!zIsEmpty) {
                            this.ag.setText(charSequence);
                            z2 = true;
                        } else if (zIsEmpty2) {
                            this.ag.setText(R.string.mr_controller_no_info_available);
                        } else {
                            z2 = false;
                        }
                        if (zIsEmpty2) {
                            z3 = false;
                        } else {
                            this.ah.setText(charSequence2);
                            z3 = true;
                        }
                        TextView textView = this.ag;
                        if (true != z2) {
                            i = 8;
                        } else {
                            i = 0;
                        }
                        textView.setVisibility(i);
                        TextView textView2 = this.ah;
                        if (true != z3) {
                            i2 = 8;
                        } else {
                            i2 = 0;
                        }
                        textView2.setVisibility(i2);
                        playbackStateCompat = this.C;
                        if (playbackStateCompat != null) {
                            i3 = playbackStateCompat.a;
                            if (i3 != 6 || i3 == 3) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            context = this.ad.getContext();
                            if (z4) {
                                if (y()) {
                                    i4 = R.string.mr_controller_pause;
                                    i5 = R.attr.mediaRoutePauseDrawable;
                                } else if (A()) {
                                    i4 = R.string.mr_controller_stop;
                                    i5 = R.attr.mediaRouteStopDrawable;
                                } else {
                                    i4 = 0;
                                    i5 = 0;
                                    z5 = false;
                                }
                                z5 = true;
                            } else if (z()) {
                                i4 = R.string.mr_controller_play;
                                i5 = R.attr.mediaRoutePlayDrawable;
                                z5 = true;
                            } else {
                                i4 = 0;
                                i5 = 0;
                                z5 = false;
                            }
                            this.ad.setVisibility(true != z5 ? 8 : 0);
                            if (z5) {
                                this.ad.setImageResource(ast.l(context, i5));
                                this.ad.setContentDescription(context.getResources().getText(i4));
                            }
                        }
                    }
                }
                z3 = false;
                z2 = true;
                TextView textView3 = this.ag;
                if (true != z2) {
                    i = 8;
                } else {
                    i = 0;
                }
                textView3.setVisibility(i);
                TextView textView4 = this.ah;
                if (true != z3) {
                    i2 = 8;
                } else {
                    i2 = 0;
                }
                textView4.setVisibility(i2);
                playbackStateCompat = this.C;
                if (playbackStateCompat != null) {
                    i3 = playbackStateCompat.a;
                    if (i3 != 6) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    context = this.ad.getContext();
                    if (z4) {
                        if (y()) {
                            i4 = R.string.mr_controller_pause;
                            i5 = R.attr.mediaRoutePauseDrawable;
                        } else if (A()) {
                            i4 = R.string.mr_controller_stop;
                            i5 = R.attr.mediaRouteStopDrawable;
                        } else {
                            i4 = 0;
                            i5 = 0;
                            z5 = false;
                        }
                        z5 = true;
                    } else if (z()) {
                        i4 = R.string.mr_controller_play;
                        i5 = R.attr.mediaRoutePlayDrawable;
                        z5 = true;
                    } else {
                        i4 = 0;
                        i5 = 0;
                        z5 = false;
                    }
                    this.ad.setVisibility(true != z5 ? 8 : 0);
                    if (z5) {
                        this.ad.setImageResource(ast.l(context, i5));
                        this.ad.setContentDescription(context.getResources().getText(i4));
                    }
                }
            }
            t(z);
        }
    }

    final void r() {
        Bitmap bitmap;
        Uri uri;
        Uri uri2;
        Bitmap bitmap2;
        MediaDescriptionCompat mediaDescriptionCompat = this.D;
        if (mediaDescriptionCompat == null) {
            uri = null;
            bitmap = null;
        } else {
            bitmap = mediaDescriptionCompat.d;
            uri = mediaDescriptionCompat.e;
        }
        dfz dfzVar = this.E;
        if (dfzVar == null) {
            bitmap2 = this.F;
            uri2 = this.G;
        } else {
            Bitmap bitmap3 = dfzVar.a;
            uri2 = dfzVar.b;
            bitmap2 = bitmap3;
        }
        if (bitmap2 == bitmap) {
            if (bitmap2 != null) {
                return;
            }
            if (uri2 != null) {
                if (uri2.equals(uri)) {
                    return;
                }
            } else if (uri == null) {
                return;
            }
        }
        if (!x() || this.j) {
            dfz dfzVar2 = this.E;
            if (dfzVar2 != null) {
                dfzVar2.cancel(true);
            }
            dfz dfzVar3 = new dfz(this);
            this.E = dfzVar3;
            dfzVar3.execute(new Void[0]);
        }
    }

    final void s() {
        Context context = this.e;
        int iL = vm.l(context);
        getWindow().setLayout(iL, -2);
        View decorView = getWindow().getDecorView();
        this.aa = (iL - decorView.getPaddingLeft()) - decorView.getPaddingRight();
        Resources resources = context.getResources();
        this.w = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_item_icon_size);
        this.x = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_item_height);
        this.y = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_max_height);
        this.F = null;
        this.G = null;
        r();
        q(false);
    }

    public final void t(boolean z) {
        this.h.requestLayout();
        this.h.getViewTreeObserver().addOnGlobalLayoutListener(new dfw(this, z));
    }

    public final void u(boolean z) {
        int i = 0;
        this.ak.setVisibility((this.m.getVisibility() == 0 && z) ? 0 : 8);
        LinearLayout linearLayout = this.k;
        if (this.m.getVisibility() == 8 && !z) {
            i = 8;
        }
        linearLayout.setVisibility(i);
    }

    public final boolean v() {
        return (this.D == null && this.C == null) ? false : true;
    }

    public final boolean x() {
        dii diiVar = this.d;
        return diiVar.m() && diiVar.f().size() > 1;
    }

    public final boolean y() {
        return (this.C.e & 514) != 0;
    }

    public final boolean z() {
        return (this.C.e & 516) != 0;
    }
}
