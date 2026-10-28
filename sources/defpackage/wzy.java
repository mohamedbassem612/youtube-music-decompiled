package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class wzy implements adma {
    public final vxe a;
    public final xgn b;
    protected final Context c;
    protected final View d;
    protected final View e;
    protected final View f;
    protected final ImageView g;
    protected final ImageView h;
    protected final TextView i;
    protected final TextView j;
    protected final TextView k;
    protected final TextView l;
    public final Map m;
    private final adse n;
    private final SpannableStringBuilder o;
    private final StringBuilder p;
    private final aduv q;
    private final adia r;
    private final adia s;
    private final View t;
    private final LinearLayout u;
    private final TextView v;
    private boolean w;
    private CharSequence x;
    private final adsc y;
    private final zs z;

    public wzy(Context context, adhv adhvVar, xgm xgmVar, vxe vxeVar, adsa adsaVar, aduv aduvVar, zs zsVar) {
        this.c = context;
        this.b = xgmVar.hB();
        this.a = vxeVar;
        this.q = aduvVar;
        this.z = zsVar;
        View viewInflate = LayoutInflater.from(context).inflate(d(), (ViewGroup) null);
        this.d = viewInflate;
        View viewFindViewById = viewInflate.findViewById(R.id.top_bar);
        this.e = viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.bottom_bar);
        this.f = viewFindViewById2;
        ImageView imageView = (ImageView) viewFindViewById.findViewById(R.id.avatar);
        this.g = imageView;
        this.i = (TextView) viewFindViewById.findViewById(R.id.author);
        ImageView imageView2 = (ImageView) viewFindViewById.findViewById(R.id.currency_image);
        this.h = imageView2;
        this.j = (TextView) viewFindViewById.findViewById(R.id.amount);
        this.k = (TextView) viewFindViewById.findViewById(R.id.time);
        TextView textView = (TextView) viewFindViewById2.findViewById(R.id.message);
        this.l = textView;
        this.t = viewInflate.findViewById(R.id.underline);
        this.u = (LinearLayout) viewFindViewById2.findViewById(R.id.footer_body);
        this.v = (TextView) viewFindViewById2.findViewById(R.id.footer_text);
        this.m = new HashMap();
        Resources resources = context.getResources();
        ViewGroup.MarginLayoutParams marginLayoutParamsG = g();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.live_chat_paid_message_margin);
        tym.i(viewInflate, new oqe(marginLayoutParamsG, 13), new tye(new tyj(dimensionPixelOffset, 0), new tyi(dimensionPixelOffset, 0)), ViewGroup.MarginLayoutParams.class);
        this.o = new SpannableStringBuilder();
        this.p = new StringBuilder();
        adse adseVar = new adse(viewInflate);
        this.n = adseVar;
        this.y = new adsc(context, adsaVar, true, adseVar, true);
        this.r = new adia(adhvVar, imageView, false);
        this.s = new adia(adhvVar, imageView2, false);
        textView.setFilters(new InputFilter[]{new adsf(textView, context.getResources().getDimension(R.dimen.live_chat_unicode_emoji_text_size), (int) context.getResources().getDimension(R.dimen.live_chat_unicode_emoji_vertical_shift))});
    }

    private final SpannableStringBuilder i(alay alayVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        yno.dE(this.c, spannableStringBuilder, ackj.k(null, alayVar, null, false), R.style.live_chat_paid_message_deleted, false);
        return spannableStringBuilder;
    }

    @Override // defpackage.adma
    public final View a() {
        return this.d;
    }

    @Override // defpackage.adma
    public void b(admh admhVar) {
        this.y.e(null, 0, null);
        this.r.a();
        this.s.a();
        this.w = false;
        LinearLayout linearLayout = this.u;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        this.d.setOnClickListener(null);
    }

    protected int d() {
        return R.layout.live_chat_paid_message;
    }

    protected int e() {
        return R.drawable.live_chat_paid_message_full_background;
    }

    protected int f() {
        return R.drawable.live_chat_paid_message_top_background;
    }

    protected ViewGroup.MarginLayoutParams g() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0055  */
    /* JADX WARN: Code duplicated, block: B:13:0x005a  */
    /* JADX WARN: Code duplicated, block: B:149:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:151:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:15:0x005e  */
    /* JADX WARN: Code duplicated, block: B:16:0x0061  */
    /* JADX WARN: Code duplicated, block: B:171:0x0310  */
    /* JADX WARN: Code duplicated, block: B:49:0x0118  */
    /* JADX WARN: Code duplicated, block: B:51:0x011c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0121  */
    /* JADX WARN: Code duplicated, block: B:62:0x0154 A[EDGE_INSN: B:62:0x0154->B:63:0x0155 BREAK  A[LOOP:0: B:57:0x0133->B:200:?]] */
    /* JADX WARN: Code duplicated, block: B:65:0x015b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x015d  */
    /* JADX WARN: Code duplicated, block: B:67:0x0162  */
    /* JADX WARN: Code duplicated, block: B:68:0x0165  */
    @Override // defpackage.adma
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void hU(adly adlyVar, ampq ampqVar) {
        alay alayVar;
        Spanned spannedK;
        alay alayVar2;
        alay alayVar3;
        boolean z;
        int i;
        alay alayVar4;
        CharSequence charSequenceK;
        aqmh aqmhVar;
        aqmh aqmhVar2;
        LinearLayout linearLayout;
        TextView textView;
        View view;
        alay alayVar5;
        adsc adscVar = this.y;
        adscVar.e(null, 0, null);
        SpannableStringBuilder spannableStringBuilder = this.o;
        spannableStringBuilder.clear();
        StringBuilder sb = this.p;
        sb.setLength(0);
        zs zsVar = this.z;
        if (zsVar.s()) {
            if ((ampqVar.b & 16) != 0) {
                alayVar = ampqVar.h;
                if (alayVar == null) {
                    alayVar = alay.a;
                }
            } else {
                alayVar = null;
            }
            spannedK = ackj.k(null, alayVar, null, false);
        } else {
            Object objC = adlyVar.c("live_chat_item_action");
            if (objC instanceof ajwo) {
                ajwo ajwoVar = (ajwo) objC;
                aihl aihlVarCheckIsLite = aihn.checkIsLite(ammr.b);
                ajwoVar.c(aihlVarCheckIsLite);
                if (!ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(amms.b);
                    ajwoVar.c(aihlVarCheckIsLite2);
                    if (!ajwoVar.j.n(aihlVarCheckIsLite2.d)) {
                        if ((ampqVar.b & 16) != 0) {
                            alayVar = ampqVar.h;
                            if (alayVar == null) {
                                alayVar = alay.a;
                            }
                        } else {
                            alayVar = null;
                        }
                        spannedK = ackj.k(null, alayVar, null, false);
                    }
                }
                spannedK = null;
            } else {
                if ((ampqVar.b & 16) != 0) {
                    alayVar = ampqVar.h;
                    if (alayVar == null) {
                        alayVar = alay.a;
                    }
                } else {
                    alayVar = null;
                }
                spannedK = ackj.k(null, alayVar, null, false);
            }
        }
        TextView textView2 = this.i;
        tuk.u(textView2, spannedK);
        textView2.setTextColor(ampqVar.l);
        TextView textView3 = this.j;
        if ((ampqVar.b & SemanticState.Hidden) != 0) {
            alayVar2 = ampqVar.k;
            if (alayVar2 == null) {
                alayVar2 = alay.a;
            }
        } else {
            alayVar2 = null;
        }
        tuk.u(textView3, ackj.k(null, alayVar2, null, false));
        textView3.setTextColor(ampqVar.n);
        Object objC2 = adlyVar.c("live_chat_item_action");
        if (objC2 instanceof ajwo) {
            ajwo ajwoVar2 = (ajwo) objC2;
            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(ammr.b);
            ajwoVar2.c(aihlVarCheckIsLite3);
            if (ajwoVar2.j.n(aihlVarCheckIsLite3.d)) {
                this.w = false;
                aihl aihlVarCheckIsLite4 = aihn.checkIsLite(ammr.b);
                ajwoVar2.c(aihlVarCheckIsLite4);
                Object objK = ajwoVar2.j.k(aihlVarCheckIsLite4.d);
                alay alayVar6 = ((ammr) (objK == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK))).d;
                if (alayVar6 == null) {
                    alayVar6 = alay.a;
                }
                charSequenceK = i(alayVar6);
            } else {
                aihl aihlVarCheckIsLite5 = aihn.checkIsLite(amms.b);
                ajwoVar2.c(aihlVarCheckIsLite5);
                if (ajwoVar2.j.n(aihlVarCheckIsLite5.d)) {
                    this.w = false;
                    aihl aihlVarCheckIsLite6 = aihn.checkIsLite(amms.b);
                    ajwoVar2.c(aihlVarCheckIsLite6);
                    Object objK2 = ajwoVar2.j.k(aihlVarCheckIsLite6.d);
                    amms ammsVar = (amms) (objK2 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK2));
                    if ((ammsVar.c & 1) != 0) {
                        alay alayVar7 = ammsVar.d;
                        if (alayVar7 == null) {
                            alayVar7 = alay.a;
                        }
                        charSequenceK = i(alayVar7);
                    } else {
                        charSequenceK = null;
                    }
                } else {
                    if (ampqVar.c == 7) {
                        alayVar3 = (alay) ampqVar.d;
                    } else {
                        alayVar3 = alay.a;
                    }
                    if (alayVar3 != null && alayVar3.c.size() > 0) {
                        Iterator it = alayVar3.c.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z = false;
                                break;
                            }
                            alba albaVar = (alba) it.next();
                            aihl aihlVarCheckIsLite7 = aihn.checkIsLite(aktj.b);
                            albaVar.c(aihlVarCheckIsLite7);
                            if (albaVar.j.n(aihlVarCheckIsLite7.d)) {
                                z = true;
                                break;
                            }
                        }
                    } else {
                        z = false;
                        break;
                    }
                    this.w = z;
                    i = ampqVar.c;
                    if (i == 7) {
                        alayVar4 = null;
                    } else if (i == 7) {
                        alayVar4 = (alay) ampqVar.d;
                    } else {
                        alayVar4 = alay.a;
                    }
                    charSequenceK = ackj.k(null, alayVar4, null, false);
                }
            }
        } else {
            if (ampqVar.c == 7) {
                alayVar3 = (alay) ampqVar.d;
            } else {
                alayVar3 = alay.a;
            }
            if (alayVar3 != null) {
                z = false;
                break;
            } else {
                z = false;
                break;
            }
            this.w = z;
            i = ampqVar.c;
            if (i == 7) {
                alayVar4 = null;
            } else if (i == 7) {
                alayVar4 = (alay) ampqVar.d;
            } else {
                alayVar4 = alay.a;
            }
            charSequenceK = ackj.k(null, alayVar4, null, false);
        }
        this.x = charSequenceK;
        if (!TextUtils.isEmpty(charSequenceK) || this.w) {
            if (!TextUtils.isEmpty(this.x)) {
                spannableStringBuilder.append(this.x);
                sb.append(this.x);
            }
            if (this.w) {
                adscVar.f(ampqVar.c == 7 ? (alay) ampqVar.d : alay.a, this.x, spannableStringBuilder, sb, ampqVar, this.l.getId());
            }
            TextView textView4 = this.l;
            textView4.setText(spannableStringBuilder);
            textView4.setTextColor(ampqVar.p);
            textView4.setVisibility(0);
        } else {
            this.l.setVisibility(8);
        }
        TextView textView5 = this.k;
        if (textView5 != null) {
            if (ampqVar.f == 0) {
                textView5.setVisibility(8);
            } else {
                textView5.setVisibility(8);
            }
        }
        if (ampqVar == null || (ampqVar.b & 4194304) == 0) {
            LinearLayout linearLayout2 = this.u;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
        } else {
            apji apjiVar = ampqVar.r;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aihl aihlVar = ampf.b;
            aihl aihlVarCheckIsLite8 = aihn.checkIsLite(aihlVar);
            apjiVar.c(aihlVarCheckIsLite8);
            if (apjiVar.j.n(aihlVarCheckIsLite8.d)) {
                apji apjiVar2 = ampqVar.r;
                if (apjiVar2 == null) {
                    apjiVar2 = apji.a;
                }
                aihl aihlVarCheckIsLite9 = aihn.checkIsLite(aihlVar);
                apjiVar2.c(aihlVarCheckIsLite9);
                Object objK3 = apjiVar2.j.k(aihlVarCheckIsLite9.d);
                Object objC3 = objK3 == null ? aihlVarCheckIsLite9.b : aihlVarCheckIsLite9.c(objK3);
                LinearLayout linearLayout3 = this.u;
                ampb ampbVar = (ampb) objC3;
                if (linearLayout3 != null && (textView = this.v) != null && (view = this.t) != null) {
                    if ((ampbVar.b & 2) != 0) {
                        alayVar5 = ampbVar.d;
                        if (alayVar5 == null) {
                            alayVar5 = alay.a;
                        }
                    } else {
                        alayVar5 = null;
                    }
                    textView.setText(ackj.k(null, alayVar5, null, false));
                    textView.setTextColor(ampqVar.p);
                    if ((ampbVar.b & 1) != 0) {
                        aduv aduvVar = this.q;
                        alja aljaVar = ampbVar.c;
                        if (aljaVar == null) {
                            aljaVar = alja.a;
                        }
                        aliz alizVarA = aliz.a(aljaVar.c);
                        if (alizVarA == null) {
                            alizVarA = aliz.UNKNOWN;
                        }
                        int iA = aduvVar.a(alizVarA);
                        if (iA != 0) {
                            Drawable drawableMutate = this.c.getDrawable(iA).getConstantState().newDrawable().mutate();
                            textView.setTextColor(ampqVar.p);
                            drawableMutate.setColorFilter(ampqVar.p, PorterDuff.Mode.SRC_IN);
                            textView.setCompoundDrawablesWithIntrinsicBounds(drawableMutate, (Drawable) null, (Drawable) null, (Drawable) null);
                        }
                    }
                    view.setBackgroundColor(ampqVar.p | (-536870912));
                    TextView textView6 = this.l;
                    view.setVisibility(textView6.getVisibility() == 0 ? 0 : 8);
                    linearLayout3.setVisibility(0);
                    if (textView6.getVisibility() == 8) {
                        tym.h(linearLayout3, new tyk(0, 0, 0, 0), ViewGroup.MarginLayoutParams.class);
                    }
                }
            }
        }
        if (zsVar.s()) {
            aqmhVar = ampqVar.i;
            if (aqmhVar == null) {
                aqmhVar = aqmh.a;
            }
        } else {
            Object objC4 = adlyVar.c("live_chat_item_action");
            if (objC4 instanceof ajwo) {
                ajwo ajwoVar3 = (ajwo) objC4;
                aihl aihlVarCheckIsLite10 = aihn.checkIsLite(ammr.b);
                ajwoVar3.c(aihlVarCheckIsLite10);
                if (!ajwoVar3.j.n(aihlVarCheckIsLite10.d)) {
                    aihl aihlVarCheckIsLite11 = aihn.checkIsLite(amms.b);
                    ajwoVar3.c(aihlVarCheckIsLite11);
                    if (!ajwoVar3.j.n(aihlVarCheckIsLite11.d)) {
                        aqmhVar = ampqVar.i;
                        if (aqmhVar == null) {
                            aqmhVar = aqmh.a;
                        }
                    }
                }
                aqmhVar = null;
            } else {
                aqmhVar = ampqVar.i;
                if (aqmhVar == null) {
                    aqmhVar = aqmh.a;
                }
            }
        }
        ImageView imageView = this.g;
        if (aqmhVar == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            this.r.f(aqmhVar, null);
        }
        if (ampqVar == null) {
            aqmhVar2 = null;
        } else {
            akji akjiVar = ampqVar.j;
            if (akjiVar == null) {
                akjiVar = akji.a;
            }
            aqmh aqmhVar3 = akjiVar.b;
            if (aqmhVar3 == null) {
                aqmhVar3 = aqmh.a;
            }
            if (aawb.O(aqmhVar3)) {
                akji akjiVar2 = ampqVar.j;
                if (akjiVar2 == null) {
                    akjiVar2 = akji.a;
                }
                aqmhVar2 = akjiVar2.b;
                if (aqmhVar2 == null) {
                    aqmhVar2 = aqmh.a;
                }
            } else {
                aqmhVar2 = null;
            }
        }
        ImageView imageView2 = this.h;
        if (aqmhVar2 == null) {
            imageView2.setVisibility(8);
        } else {
            imageView2.setVisibility(0);
            this.s.f(aqmhVar2, null);
        }
        if (this.l.getVisibility() == 0 || ((linearLayout = this.u) != null && linearLayout.getVisibility() == 0)) {
            View view2 = this.e;
            view2.setBackgroundResource(f());
            GradientDrawable gradientDrawable = (GradientDrawable) view2.getBackground();
            if (gradientDrawable != null) {
                gradientDrawable.setColor(ampqVar.m);
            }
            View view3 = this.f;
            view3.setVisibility(0);
            GradientDrawable gradientDrawable2 = (GradientDrawable) view3.getBackground();
            if (gradientDrawable2 != null) {
                gradientDrawable2.setColor(ampqVar.o);
            }
        } else {
            View view4 = this.e;
            view4.setBackgroundResource(e());
            GradientDrawable gradientDrawable3 = (GradientDrawable) view4.getBackground();
            if (gradientDrawable3 != null) {
                gradientDrawable3.setColor(ampqVar.o);
            }
            this.f.setVisibility(8);
        }
        xgj xgjVar = new xgj(xhb.b(70096));
        this.b.l(xgjVar);
        if ((ampqVar.b & 262144) == 0 || this.a == null) {
            return;
        }
        this.d.setOnClickListener(new ivx((Object) this, (aihn) ampqVar, xgjVar, 16));
    }
}
