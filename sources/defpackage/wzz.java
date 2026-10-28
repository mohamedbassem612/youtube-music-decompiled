package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class wzz implements adma, adhu {
    public final xgn a;
    public final vxe b;
    protected final View c;
    protected final TextView d;
    protected final Context e;
    private final adia f;
    private final adhv g;
    private final int h;
    private final int i;
    private final ImageView j;
    private final TextView k;
    private final TextView l;
    private final ImageView m;
    private final View n;

    public wzz(Context context, xgm xgmVar, vxe vxeVar, adhv adhvVar, tza tzaVar, aeda aedaVar, Context context2) {
        if (aedaVar.i()) {
            this.e = context2;
        } else if (tzaVar != null) {
            this.e = new ContextThemeWrapper(context, tzaVar.a);
        } else {
            this.e = context;
        }
        this.a = xgmVar.hB();
        this.b = vxeVar;
        View viewInflate = View.inflate(this.e, d(), null);
        this.c = viewInflate;
        this.g = adhvVar;
        adhvVar.e(this);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.avatar);
        this.j = imageView;
        TextView textView = (TextView) viewInflate.findViewById(R.id.live_chat_paid_sticker_author_name);
        this.d = textView;
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.live_chat_paid_sticker_price);
        this.k = textView2;
        this.l = (TextView) viewInflate.findViewById(R.id.live_chat_paid_sticker_subtext);
        this.m = (ImageView) viewInflate.findViewById(R.id.live_chat_paid_sticker_animation);
        this.n = viewInflate.findViewById(R.id.live_chat_sticker_background);
        this.h = textView != null ? textView.getCurrentTextColor() : -16777216;
        this.i = textView2 != null ? textView2.getCurrentTextColor() : -16777216;
        adhvVar.getClass();
        imageView.getClass();
        this.f = new adia(adhvVar, imageView, false);
    }

    @Override // defpackage.adma
    public final View a() {
        return this.c;
    }

    @Override // defpackage.adma
    public void b(admh admhVar) {
        this.c.setOnClickListener(null);
        this.f.a();
        TextView textView = this.d;
        textView.setText((CharSequence) null);
        textView.setTextColor(this.h);
        TextView textView2 = this.l;
        if (textView2 != null) {
            textView2.setText((CharSequence) null);
        }
        TextView textView3 = this.k;
        if (textView3 != null) {
            textView3.setText((CharSequence) null);
            textView3.setTextColor(this.i);
        }
        adhv adhvVar = this.g;
        ImageView imageView = this.m;
        adhvVar.f(imageView);
        imageView.setBackgroundColor(this.e.getColor(R.color.yt_grey1));
        imageView.setContentDescription(null);
    }

    protected abstract int d();

    @Override // defpackage.adhu
    public final /* synthetic */ int h() {
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a6  */
    @Override // defpackage.adma
    public final /* bridge */ /* synthetic */ void hU(adly adlyVar, Object obj) {
        ammr ammrVar;
        amms ammsVar;
        ampr amprVar = (ampr) obj;
        alay alayVar = amprVar.f;
        if (alayVar == null) {
            alayVar = alay.a;
        }
        Spanned spannedK = ackj.k(null, alayVar, null, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (!TextUtils.isEmpty(spannedK)) {
            yno.dE(this.e, spannableStringBuilder, spannedK, R.style.live_chat_author_default, true);
        }
        alay alayVar2 = amprVar.j;
        if (alayVar2 == null) {
            alayVar2 = alay.a;
        }
        Spanned spannedK2 = ackj.k(null, alayVar2, null, false);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        Context context = this.e;
        yno.dE(context, spannableStringBuilder2, spannedK2, R.style.live_chat_paid_sticker_money_chip, false);
        ajwo ajwoVar = (ajwo) adlyVar.c("live_chat_item_action");
        if (ajwoVar != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(ammr.b);
            ajwoVar.c(aihlVarCheckIsLite);
            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ammr.b);
                ajwoVar.c(aihlVarCheckIsLite2);
                Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                ammrVar = (ammr) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                ammsVar = null;
            } else {
                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(amms.b);
                ajwoVar.c(aihlVarCheckIsLite3);
                if (ajwoVar.j.n(aihlVarCheckIsLite3.d)) {
                    aihl aihlVarCheckIsLite4 = aihn.checkIsLite(amms.b);
                    ajwoVar.c(aihlVarCheckIsLite4);
                    Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite4.d);
                    ammsVar = (amms) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2));
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
        Spanned spannedK3 = ackj.k(null, yno.dJ(ammrVar, ammsVar), null, false);
        if (TextUtils.isEmpty(spannedK3)) {
            alay alayVar3 = amprVar.l;
            if (alayVar3 == null) {
                alayVar3 = alay.a;
            }
            Spanned spannedK4 = ackj.k(null, alayVar3, null, false);
            if (!TextUtils.isEmpty(spannedK4)) {
                yno.dE(context, spannableStringBuilder2, spannedK4, R.style.live_chat_subtext, false);
            }
            aqmh aqmhVar = amprVar.m;
            if (aqmhVar == null) {
                aqmhVar = aqmh.a;
            }
            if (aawb.O(aqmhVar)) {
                if (amprVar.n != 0 && amprVar.o != 0) {
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    tym.j(this.m, twm.c(displayMetrics, amprVar.n), twm.c(displayMetrics, amprVar.o));
                }
                ImageView imageView = this.m;
                imageView.setVisibility(0);
                adhv adhvVar = this.g;
                aqmh aqmhVar2 = amprVar.m;
                if (aqmhVar2 == null) {
                    aqmhVar2 = aqmh.a;
                }
                adhvVar.h(imageView, aqmhVar2);
                aiqe aiqeVar = aqmhVar.e;
                if (aiqeVar == null) {
                    aiqeVar = aiqe.a;
                }
                if ((aiqeVar.b & 1) != 0) {
                    aiqe aiqeVar2 = aqmhVar.e;
                    if (aiqeVar2 == null) {
                        aiqeVar2 = aiqe.a;
                    }
                    aiqd aiqdVar = aiqeVar2.c;
                    if (aiqdVar == null) {
                        aiqdVar = aiqd.a;
                    }
                    imageView.setContentDescription(aiqdVar.c);
                }
            }
        } else {
            yno.dF(spannableStringBuilder2, context.getResources().getDimensionPixelSize(R.dimen.live_chat_message_spacing) / this.d.getPaint().measureText(" "));
            yno.dE(context, spannableStringBuilder2, spannedK3, R.style.live_chat_paid_sticker_deleted, false);
            this.m.setVisibility(8);
        }
        TextView textView = this.k;
        if (textView != null && !TextUtils.isEmpty(spannableStringBuilder2)) {
            textView.setText(spannableStringBuilder2);
            if ((amprVar.b & SemanticState.ReadOnly) != 0) {
                textView.setTextColor(amprVar.i);
            }
        }
        ((GradientDrawable) this.n.getBackground()).setColor(amprVar.h);
        TextView textView2 = this.d;
        alay alayVar4 = amprVar.f;
        if (alayVar4 == null) {
            alayVar4 = alay.a;
        }
        textView2.setText(ackj.k(null, alayVar4, null, false));
        if ((amprVar.b & 64) != 0) {
            textView2.setTextColor(amprVar.g);
        }
        if ((amprVar.b & SemanticState.ReadOnly) != 0) {
            textView.setTextColor(amprVar.i);
        }
        if ((amprVar.b & 16) != 0) {
            adia adiaVar = this.f;
            aqmh aqmhVar3 = amprVar.e;
            if (aqmhVar3 == null) {
                aqmhVar3 = aqmh.a;
            }
            adiaVar.f(aqmhVar3, null);
        }
        xgj xgjVar = new xgj(xhb.b(70097));
        this.a.l(xgjVar);
        if ((amprVar.b & 2) != 0) {
            this.c.setOnClickListener(new ivx((Object) this, (aihn) amprVar, xgjVar, 17));
        }
    }

    @Override // defpackage.adhu
    public final /* synthetic */ void i(adjc adjcVar) {
        j(adjcVar.i());
    }

    @Override // defpackage.adhu
    public final void j(ImageView imageView) {
        imageView.setBackgroundColor(0);
    }

    @Override // defpackage.adhu
    public final void e(ImageView imageView, adhr adhrVar, aqmh aqmhVar) {
    }

    @Override // defpackage.adhu
    public final void f(ImageView imageView, adhr adhrVar, aqmh aqmhVar) {
    }

    @Override // defpackage.adhu
    public final void g(ImageView imageView, adhr adhrVar, aqmh aqmhVar) {
    }
}
