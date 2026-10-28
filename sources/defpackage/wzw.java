package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class wzw implements adma {
    protected final Context a;
    public final vxe b;
    public final xgn c;
    protected final View d;
    private final adry e;
    private final SpannableStringBuilder f;
    private final StringBuilder g;
    private final TextView h;
    private final TextView i;
    private final TextView j;
    private final TextView k;
    private final ImageView l;
    private final View m;
    private final View n;
    private final View o;
    private final Drawable p;
    private final Drawable q;
    private final int r;
    private final int s;
    private final float t;
    private final adia u;
    private Spanned v;
    private boolean w;
    private boolean x;
    private final adsc y;

    public wzw(Context context, xgm xgmVar, adhv adhvVar, adsa adsaVar, vxe vxeVar, aduv aduvVar) {
        this.a = context;
        this.b = vxeVar;
        this.c = xgmVar.hB();
        View viewInflate = LayoutInflater.from(context).inflate(e(), (ViewGroup) null);
        this.d = viewInflate;
        this.h = h();
        this.i = (TextView) viewInflate.findViewById(R.id.header_text);
        this.j = (TextView) viewInflate.findViewById(R.id.header_subtext);
        TextView textViewI = i();
        this.k = textViewI;
        this.m = viewInflate.findViewById(R.id.top_bar);
        this.n = viewInflate.findViewById(R.id.bottom_bar);
        this.o = viewInflate.findViewById(R.id.top_bar_content);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.avatar);
        this.l = imageView;
        this.q = g();
        this.p = f();
        adse adseVar = new adse(viewInflate);
        this.e = new adry(context, aduvVar, adsaVar, true, adseVar, false);
        this.y = new adsc(context, adsaVar, true, adseVar, true);
        this.u = new adia(adhvVar, imageView, false);
        this.r = context.getResources().getColor(R.color.live_chat_membership_item_header_background);
        this.s = context.getResources().getColor(R.color.live_chat_membership_item_body_background);
        this.f = new SpannableStringBuilder();
        this.g = new StringBuilder();
        this.t = context.getResources().getDimensionPixelSize(R.dimen.live_chat_message_spacing) / i().getPaint().measureText(" ");
        Resources resources = context.getResources();
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.live_chat_paid_message_margin);
        tym.i(viewInflate, new oqe(marginLayoutParams, 12), new tye(tym.g(-1, -2), new tyj(dimensionPixelOffset, 0), new tyi(dimensionPixelOffset, 0)), ViewGroup.MarginLayoutParams.class);
        textViewI.setFilters(new InputFilter[]{new adsf(textViewI, context.getResources().getDimension(R.dimen.live_chat_unicode_emoji_text_size), (int) context.getResources().getDimension(R.dimen.live_chat_unicode_emoji_vertical_shift))});
    }

    @Override // defpackage.adma
    public final View a() {
        return this.d;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        this.e.e(null, 0, null);
        this.h.setText((CharSequence) null);
        this.i.setText((CharSequence) null);
        this.j.setText((CharSequence) null);
        this.k.setText((CharSequence) null);
        this.u.a();
        this.d.setOnClickListener(null);
    }

    protected boolean d() {
        return false;
    }

    protected int e() {
        return R.layout.live_chat_membership_item;
    }

    protected Drawable f() {
        return this.a.getResources().getDrawable(R.drawable.live_chat_paid_message_full_background);
    }

    protected Drawable g() {
        return this.a.getResources().getDrawable(R.drawable.live_chat_paid_message_top_background);
    }

    protected final TextView h() {
        return (TextView) this.d.findViewById(R.id.author);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b5  */
    @Override // defpackage.adma
    public final /* synthetic */ void hU(adly adlyVar, Object obj) {
        alay alayVar;
        alay alayVar2;
        ammr ammrVar;
        amms ammsVar;
        alba albaVar;
        aihl aihlVarCheckIsLite;
        SpannableStringBuilder spannableStringBuilder = this.f;
        amoy amoyVar = (amoy) obj;
        spannableStringBuilder.clear();
        StringBuilder sb = this.g;
        sb.setLength(0);
        if ((amoyVar.b & 16) != 0) {
            alayVar = amoyVar.g;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        tuk.u(this.i, ackj.k(null, alayVar, null, false));
        TextView textView = this.j;
        if ((amoyVar.b & 32) != 0) {
            alayVar2 = amoyVar.h;
            if (alayVar2 == null) {
                alayVar2 = alay.a;
            }
        } else {
            alayVar2 = null;
        }
        tuk.u(textView, ackj.k(null, alayVar2, null, false));
        Object objC = adlyVar.c("live_chat_item_action");
        ajwo ajwoVar = objC instanceof ajwo ? (ajwo) objC : null;
        if (ajwoVar != null) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ammr.b);
            ajwoVar.c(aihlVarCheckIsLite2);
            if (ajwoVar.j.n(aihlVarCheckIsLite2.d)) {
                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(ammr.b);
                ajwoVar.c(aihlVarCheckIsLite3);
                Object objK = ajwoVar.j.k(aihlVarCheckIsLite3.d);
                ammrVar = (ammr) (objK == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK));
                ammsVar = null;
            } else {
                aihl aihlVarCheckIsLite4 = aihn.checkIsLite(amms.b);
                ajwoVar.c(aihlVarCheckIsLite4);
                if (ajwoVar.j.n(aihlVarCheckIsLite4.d)) {
                    aihl aihlVarCheckIsLite5 = aihn.checkIsLite(amms.b);
                    ajwoVar.c(aihlVarCheckIsLite5);
                    Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite5.d);
                    ammsVar = (amms) (objK2 == null ? aihlVarCheckIsLite5.b : aihlVarCheckIsLite5.c(objK2));
                    ammrVar = null;
                } else {
                    ammrVar = null;
                    ammsVar = null;
                }
            }
        } else {
            ammrVar = null;
            ammsVar = null;
        }
        int i = amoyVar.c;
        if (i == 8 || (amoyVar.b & SemanticState.Hidden) != 0 || yno.dL(ammrVar, ammsVar)) {
            boolean z = true;
            if (yno.dL(ammrVar, ammsVar)) {
                this.w = false;
                this.x = true;
                this.v = ackj.k(null, yno.dJ(ammrVar, ammsVar), null, false);
            } else if ((amoyVar.b & SemanticState.Hidden) != 0) {
                this.w = false;
                this.x = true;
                alay alayVar3 = amoyVar.l;
                if (alayVar3 == null) {
                    alayVar3 = alay.a;
                }
                this.v = ackj.k(null, alayVar3, null, false);
            } else {
                this.x = false;
                this.v = vxl.a(null, i == 8 ? (alay) amoyVar.d : null, this.b, false);
                alay alayVar4 = amoyVar.c == 8 ? (alay) amoyVar.d : alay.a;
                if (alayVar4 != null && alayVar4.c.size() > 0) {
                    Iterator it = alayVar4.c.iterator();
                    do {
                        if (!it.hasNext()) {
                            z = false;
                            break;
                        } else {
                            albaVar = (alba) it.next();
                            aihlVarCheckIsLite = aihn.checkIsLite(aktj.b);
                            albaVar.c(aihlVarCheckIsLite);
                        }
                    } while (!albaVar.j.n(aihlVarCheckIsLite.d));
                } else {
                    z = false;
                    break;
                }
                this.w = z;
            }
            if (!TextUtils.isEmpty(this.v) || this.w) {
                if (!TextUtils.isEmpty(this.v)) {
                    spannableStringBuilder.append((CharSequence) this.v);
                    sb.append((CharSequence) this.v);
                }
                if (this.x) {
                    yno.dG(spannableStringBuilder, this.v.length(), new ForegroundColorSpan(tzk.i(this.a, R.attr.ytOverlayTextSecondary)));
                    yno.dG(spannableStringBuilder, this.v.length(), new StyleSpan(2));
                } else if (this.w) {
                    this.y.f(amoyVar.c == 8 ? (alay) amoyVar.d : alay.a, this.v, spannableStringBuilder, sb, amoyVar, this.k.getId());
                    amoyVar = amoyVar;
                }
                this.k.setText(spannableStringBuilder);
            }
            View view = this.m;
            Drawable drawable = this.q;
            view.setBackground(drawable);
            ((GradientDrawable) drawable).setColor(this.r);
            View view2 = this.n;
            view2.setVisibility(0);
            ((GradientDrawable) view2.getBackground()).setColor(this.s);
            TextView textView2 = this.h;
            Context context = this.a;
            textView2.setTextSize(0, context.getResources().getDimension(R.dimen.live_chat_loyalty_message_author_name_text_size));
            textView.setTextSize(0, context.getResources().getDimension(R.dimen.live_chat_loyalty_message_tier_name_text_size));
        } else {
            View view3 = this.m;
            view3.setBackground(this.p);
            ((GradientDrawable) view3.getBackground()).setColor(this.s);
            this.n.setVisibility(8);
            TextView textView3 = this.h;
            Context context2 = this.a;
            textView3.setTextSize(0, context2.getResources().getDimension(R.dimen.live_chat_membership_message_author_name_text_size));
            textView.setTextSize(0, context2.getResources().getDimension(R.dimen.live_chat_membership_message_tier_name_text_size));
        }
        if ((amoyVar.b & 64) == 0 || this.x) {
            this.h.setVisibility(8);
        } else {
            alay alayVar5 = amoyVar.i;
            if (alayVar5 == null) {
                alayVar5 = alay.a;
            }
            Spanned spannedK = ackj.k(null, alayVar5, null, false);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannedK);
            this.e.b(spannableStringBuilder2, new StringBuilder(spannedK), adrx.a(amoyVar.k, null), this.t, amoyVar, h().getId(), false);
            TextView textView4 = this.h;
            textView4.setText(spannableStringBuilder2);
            textView4.setVisibility(0);
        }
        if ((amoyVar.b & SemanticState.Focused) == 0 || this.x) {
            this.l.setVisibility(8);
        } else {
            aqmh aqmhVar = amoyVar.j;
            if (aqmhVar == null) {
                aqmhVar = aqmh.a;
            }
            if (aqmhVar != null) {
                this.u.f(aqmhVar, null);
            }
            this.l.setVisibility(0);
        }
        Resources resources = this.a.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.live_chat_paid_message_avatar_size);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.live_chat_overlay_paid_message_bottom_bar_horizontal_padding);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.live_chat_avatar_margin);
        if (this.h.getVisibility() != 0) {
            if (!d()) {
                dimensionPixelSize /= 2;
            }
            int i2 = dimensionPixelSize - dimensionPixelOffset;
            TextView textView5 = this.k;
            textView5.setPaddingRelative(i2, 0, textView5.getPaddingEnd(), 0);
            ((ViewGroup.MarginLayoutParams) this.o.getLayoutParams()).setMarginStart(i2);
        } else if (d()) {
            TextView textView6 = this.k;
            textView6.setPaddingRelative(dimensionPixelSize + dimensionPixelOffset + dimensionPixelOffset2, 0, textView6.getPaddingEnd(), 0);
        }
        xgj xgjVar = (amoyVar.b & 32768) != 0 ? new xgj(amoyVar.n, (amud) null) : null;
        if (xgjVar != null) {
            this.c.l(xgjVar);
        }
        if ((amoyVar.b & SemanticState.Modal) == 0 || this.b == null) {
            return;
        }
        this.d.setOnClickListener(new ivx((Object) this, (Object) xgjVar, (Object) amoyVar, 15, (byte[]) null));
    }

    protected final TextView i() {
        return (TextView) this.d.findViewById(R.id.message);
    }
}
