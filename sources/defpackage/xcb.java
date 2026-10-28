package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.ColorFilter;
import android.provider.Settings;
import android.support.v7.widget.AppCompatImageView;
import android.text.SpannableStringBuilder;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class xcb extends xbf {
    public xbz V;
    public final View W;
    public final aeda X;
    public final ValueAnimator Y;
    public final ValueAnimator Z;
    public final Context aa;
    public final Context ab;
    public long ac;
    private final adhv ad;
    private EditText ae;
    private ViewGroup af;
    private ImageView ag;
    private TextView ah;
    private ImageView ai;
    private ViewGroup aj;
    private ViewGroup ak;
    private ViewGroup al;
    private ViewGroup am;
    private ViewGroup an;
    private ViewGroup ao;
    private View ap;
    private View aq;
    private View ar;
    private TextView as;
    private TextView at;
    private ViewGroup au;

    public xcb(Context context, Activity activity, wxl wxlVar, adhv adhvVar, aduv aduvVar, vxe vxeVar, wyz wyzVar, wys wysVar, aeiv aeivVar, aeaq aeaqVar, zs zsVar, tza tzaVar, ci ciVar, aefv aefvVar, xsc xscVar, awmd awmdVar, acyx acyxVar, vxz vxzVar, abte abteVar, mbc mbcVar, tun tunVar, wxh wxhVar, aeda aedaVar, Context context2, vxz vxzVar2, vxz vxzVar3, View view, boolean z, xgn xgnVar) {
        super(activity, wxlVar, aduvVar, vxeVar, xgnVar, wyzVar, wysVar, aeivVar, aeaqVar, zsVar, ciVar, aefvVar, xscVar, awmdVar, acyxVar, vxzVar, abteVar, mbcVar, tunVar, wxhVar, vxzVar2, vxzVar3, z);
        this.V = new xbz(R.attr.liveChatActionPanelChipBackground, R.attr.liveChatActionPanelChipBackgroundOverlimit, R.attr.ytOverlayTextPrimary, R.attr.ytOverlayTextPrimary);
        this.ad = adhvVar;
        this.W = view;
        this.Y = ValueAnimator.ofInt(0, 20).setDuration(4000L);
        this.Z = ValueAnimator.ofInt(0, 20).setDuration(4000L);
        this.X = aedaVar;
        this.aa = true != aedaVar.i() ? context : context2;
        this.ab = new ContextThemeWrapper(context, tzaVar.a);
    }

    @Override // defpackage.xbf
    public final ImageView A() {
        ImageView imageView = this.ag;
        if (imageView != null) {
            return imageView;
        }
        ImageView imageView2 = (ImageView) this.W.findViewById(R.id.restricted_participation_icon);
        this.ag = imageView2;
        return imageView2;
    }

    @Override // defpackage.xbf
    public final ImageView B() {
        ImageView imageView = this.ai;
        if (imageView != null) {
            return imageView;
        }
        ImageView imageView2 = (ImageView) this.W.findViewById(R.id.live_chat_send_button);
        this.ai = imageView2;
        return imageView2;
    }

    @Override // defpackage.xbf
    protected final TextView C() {
        TextView textView = this.as;
        if (textView != null) {
            return textView;
        }
        TextView textView2 = (TextView) this.W.findViewById(R.id.character_counter);
        this.as = textView2;
        return textView2;
    }

    @Override // defpackage.xbf
    public final TextView D() {
        TextView textView = this.at;
        if (textView != null) {
            return textView;
        }
        TextView textView2 = (TextView) tuk.e(this.W, R.id.icon_toggle_badge_count_stub, R.id.icon_toggle_badge_count);
        this.at = textView2;
        return textView2;
    }

    @Override // defpackage.xbf
    public final TextView E() {
        TextView textView = this.ah;
        if (textView != null) {
            return textView;
        }
        TextView textView2 = (TextView) this.W.findViewById(R.id.restricted_participation_bar);
        this.ah = textView2;
        return textView2;
    }

    @Override // defpackage.xbf
    public final void F() {
        this.ae.getText().clear();
        tuk.i(this.ae);
    }

    @Override // defpackage.xbf
    protected final void H(int i, boolean z) {
        TextView textViewC = C();
        if (textViewC != null) {
            if (!z) {
                textViewC.setVisibility(8);
                return;
            }
            Context contextF = f();
            xbz xbzVar = this.V;
            int iOrElse = i > 0 ? tzk.n(contextF, xbzVar.a).orElse(0) : tzk.n(contextF, xbzVar.b).orElse(0);
            Context contextF2 = f();
            xbz xbzVar2 = this.V;
            int iOrElse2 = i > 0 ? tzk.n(contextF2, xbzVar2.c).orElse(0) : tzk.n(contextF2, xbzVar2.d).orElse(0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Integer.toString(i));
            spannableStringBuilder.setSpan(new wzd(f(), iOrElse2, iOrElse, null), 0, spannableStringBuilder.length(), 33);
            textViewC.setText(spannableStringBuilder.append((CharSequence) " "));
            textViewC.setVisibility(0);
        }
    }

    @Override // defpackage.xbf
    public final void M(aqmh aqmhVar) {
        this.ad.h(y(), aqmhVar);
    }

    public final void T(View view, ValueAnimator valueAnimator) {
        if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            ColorFilter colorFilter = imageView.getColorFilter();
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            }
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.removeAllListeners();
            valueAnimator.addUpdateListener(new xca(this, imageView, imageView.getColorFilter()));
            valueAnimator.addListener(new aeok(imageView, colorFilter, 1));
            valueAnimator.start();
        }
    }

    public final boolean U() {
        return Settings.Global.getInt(this.aa.getContentResolver(), "transition_animation_scale", 1) != 0;
    }

    @Override // defpackage.xbf
    public final Context f() {
        return this.X.i() ? this.aa : this.ab;
    }

    @Override // defpackage.xbf
    public final View k(alja aljaVar) {
        aliz alizVarA = aliz.a(aljaVar.c);
        if (alizVarA == null) {
            alizVarA = aliz.UNKNOWN;
        }
        aduv aduvVar = this.e;
        Context context = this.aa;
        int iA = aduvVar.a(alizVarA);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        u().setVisibility(0);
        AppCompatImageView appCompatImageView = (AppCompatImageView) layoutInflaterFrom.inflate(R.layout.live_chat_action_button_menu_toggle, t(), false);
        if (iA != 0) {
            appCompatImageView.setImageResource(iA);
            aliz alizVarA2 = aliz.a(aljaVar.c);
            if (alizVarA2 == null) {
                alizVarA2 = aliz.UNKNOWN;
            }
            appCompatImageView.setColorFilter(R(alizVarA2));
            int i = this.M;
            if (i == 0) {
                i = R.drawable.live_chat_classic_picker_button_background;
            }
            appCompatImageView.setBackgroundResource(i);
        }
        return appCompatImageView;
    }

    @Override // defpackage.xbf
    public final View l() {
        View view = this.aq;
        if (view != null) {
            return view;
        }
        View viewFindViewById = this.W.findViewById(R.id.live_chat_action_panel);
        this.aq = viewFindViewById;
        return viewFindViewById;
    }

    @Override // defpackage.xbf
    public final View m() {
        View view = this.ar;
        if (view != null) {
            return view;
        }
        View viewFindViewById = this.W.findViewById(R.id.live_chat_text_field_bar);
        this.ar = viewFindViewById;
        return viewFindViewById;
    }

    @Override // defpackage.xbf
    public final View n() {
        return this.W;
    }

    @Override // defpackage.xbf
    public final View o() {
        View view = this.ap;
        if (view != null) {
            return view;
        }
        View viewFindViewById = this.W.findViewById(R.id.thumbnail_and_emoji_picker_container);
        this.ap = viewFindViewById;
        return viewFindViewById;
    }

    @Override // defpackage.xbf
    public final ViewGroup p() {
        ViewGroup viewGroup = this.au;
        if (viewGroup != null) {
            return viewGroup;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.W.findViewById(R.id.live_chat_button_menu);
        this.au = viewGroup2;
        return viewGroup2;
    }

    @Override // defpackage.xbf
    public final ViewGroup q() {
        ViewGroup viewGroup = this.af;
        if (viewGroup != null) {
            return viewGroup;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.W.findViewById(R.id.edit_text_container);
        this.af = viewGroup2;
        return viewGroup2;
    }

    @Override // defpackage.xbf
    public final ViewGroup r() {
        ViewGroup viewGroup = this.al;
        if (viewGroup != null) {
            return viewGroup;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.W.findViewById(R.id.jewels_button_container);
        this.al = viewGroup2;
        return viewGroup2;
    }

    @Override // defpackage.xbf
    public final ViewGroup s() {
        ViewGroup viewGroup = this.am;
        if (viewGroup != null) {
            return viewGroup;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.W.findViewById(R.id.lwe_heart_button_container);
        this.am = viewGroup2;
        return viewGroup2;
    }

    @Override // defpackage.xbf
    public final ViewGroup t() {
        ViewGroup viewGroup = this.ao;
        if (viewGroup != null) {
            return viewGroup;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.W.findViewById(R.id.inline_extra_buttons);
        this.ao = viewGroup2;
        return viewGroup2;
    }

    @Override // defpackage.xbf
    public final ViewGroup u() {
        ViewGroup viewGroup = this.an;
        if (viewGroup != null) {
            return viewGroup;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.W.findViewById(R.id.inline_extra_buttons_container);
        this.an = viewGroup2;
        return viewGroup2;
    }

    @Override // defpackage.xbf
    public final ViewGroup v() {
        ViewGroup viewGroup = this.aj;
        if (viewGroup != null) {
            return viewGroup;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.W.findViewById(R.id.send_button_container);
        this.aj = viewGroup2;
        return viewGroup2;
    }

    @Override // defpackage.xbf
    public final ViewGroup w() {
        ViewGroup viewGroup = this.ak;
        if (viewGroup != null) {
            return viewGroup;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.W.findViewById(R.id.shopping_button_container);
        this.ak = viewGroup2;
        return viewGroup2;
    }

    @Override // defpackage.xbf
    public final EditText x() {
        if (this.ae == null) {
            EditText editText = (EditText) this.W.findViewById(R.id.edit_text);
            this.ae = editText;
            editText.setFocusable(true);
            this.ae.setFocusableInTouchMode(true);
            this.ae.setLongClickable(true);
        }
        return this.ae;
    }
}
