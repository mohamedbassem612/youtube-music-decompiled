package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BulletSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.common.ui.FixedAspectRatioFrameLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class swf extends admr {
    final int a;
    final int b;
    final int c;
    private final adhv d;
    private final vxe e;
    private final Resources f;
    private final LayoutInflater g;
    private anti h;
    private final ViewGroup i;
    private swe j;
    private swe k;
    private final lqa l;

    public swf(Context context, adhv adhvVar, vxe vxeVar, lqa lqaVar) {
        this.d = adhvVar;
        this.e = vxeVar;
        this.l = lqaVar;
        Resources resources = context.getResources();
        this.f = resources;
        this.a = resources.getColor(R.color.yt_black4);
        this.b = tzk.i(context, R.attr.ytTextSecondary);
        this.c = tzk.i(context, R.attr.ytCallToAction);
        this.g = LayoutInflater.from(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.i = frameLayout;
        frameLayout.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
    }

    private final void g(swe sweVar) {
        alay alayVar;
        alay alayVar2;
        alay alayVar3;
        CharSequence charSequenceConcat;
        ajkx ajkxVar;
        CharSequence[] charSequenceArr;
        ajkx ajkxVar2;
        int length;
        Object obj = sweVar.b;
        anti antiVar = this.h;
        if ((antiVar.b & 32) != 0) {
            alayVar = antiVar.e;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        TextView textView = (TextView) obj;
        textView.setText(ackj.k(null, alayVar, null, false));
        Object obj2 = sweVar.c;
        anti antiVar2 = this.h;
        if ((antiVar2.b & 64) != 0) {
            alayVar2 = antiVar2.f;
            if (alayVar2 == null) {
                alayVar2 = alay.a;
            }
        } else {
            alayVar2 = null;
        }
        tuk.u((TextView) obj2, ackj.k(null, alayVar2, null, false));
        Object obj3 = sweVar.d;
        anti antiVar3 = this.h;
        if ((antiVar3.b & SemanticState.Focused) != 0) {
            alayVar3 = antiVar3.g;
            if (alayVar3 == null) {
                alayVar3 = alay.a;
            }
        } else {
            alayVar3 = null;
        }
        vxe vxeVar = this.e;
        TextView textView2 = (TextView) obj3;
        tuk.u(textView2, vxl.a(null, alayVar3, vxeVar, false));
        Object obj4 = sweVar.e;
        CharSequence[] charSequenceArrJ = ackj.j((alay[]) this.h.h.toArray(new alay[0]));
        if (charSequenceArrJ.length > 0) {
            String property = System.getProperty("line.separator");
            charSequenceConcat = null;
            for (CharSequence charSequence : charSequenceArrJ) {
                if (!TextUtils.isEmpty(charSequence)) {
                    SpannableString spannableString = new SpannableString(charSequence);
                    spannableString.setSpan(new BulletSpan(20), 0, charSequence.length(), 0);
                    charSequenceConcat = charSequenceConcat == null ? spannableString : TextUtils.concat(charSequenceConcat, property, spannableString);
                }
            }
        } else {
            charSequenceConcat = null;
        }
        tuk.u((TextView) obj4, charSequenceConcat);
        Object obj5 = sweVar.f;
        String property2 = System.getProperty("line.separator");
        alay[] alayVarArr = (alay[]) this.h.i.toArray(new alay[0]);
        if (alayVarArr == null || (length = alayVarArr.length) == 0) {
            ajkxVar = null;
            charSequenceArr = vxl.a;
        } else {
            charSequenceArr = new CharSequence[length];
            for (int i = 0; i < alayVarArr.length; i++) {
                charSequenceArr[i] = vxl.a(null, alayVarArr[i], vxeVar, true);
            }
            ajkxVar = null;
        }
        tuk.u((TextView) obj5, ackj.g(property2, charSequenceArr));
        anti antiVar4 = this.h;
        if ((antiVar4.b & 2) != 0) {
            anth anthVar = antiVar4.c;
            if (anthVar == null) {
                anthVar = anth.a;
            }
            ajkxVar2 = anthVar.b == 118483990 ? (ajkx) anthVar.c : ajkx.a;
        } else {
            ajkxVar2 = ajkxVar;
        }
        adsy adsyVar = (adsy) this.l.a;
        adsyVar.b();
        adsyVar.a = textView;
        adsyVar.f(this.a);
        adsyVar.b = textView2;
        adsyVar.e(this.b);
        adsyVar.d(this.c);
        adsyVar.a().a(ajkxVar2);
        aqmh aqmhVar = this.h.d;
        if (aqmhVar == null) {
            aqmhVar = aqmh.a;
        }
        if (aawb.O(aqmhVar)) {
            aqmh aqmhVar2 = this.h.d;
            if (aqmhVar2 == null) {
                aqmhVar2 = aqmh.a;
            }
            float fE = aawb.E(aqmhVar2);
            if (fE > 0.0f) {
                ((FixedAspectRatioFrameLayout) sweVar.h).a = fE;
            }
            adhv adhvVar = this.d;
            Object obj6 = sweVar.g;
            aqmh aqmhVar3 = this.h.d;
            if (aqmhVar3 == null) {
                aqmhVar3 = aqmh.a;
            }
            ImageView imageView = (ImageView) obj6;
            adhvVar.h(imageView, aqmhVar3);
            imageView.setVisibility(0);
        } else {
            adhv adhvVar2 = this.d;
            ImageView imageView2 = (ImageView) sweVar.g;
            adhvVar2.f(imageView2);
            imageView2.setVisibility(8);
        }
        ViewGroup viewGroup = this.i;
        viewGroup.removeAllViews();
        viewGroup.addView((View) sweVar.a);
    }

    @Override // defpackage.adma
    public final View a() {
        return this.i;
    }

    @Override // defpackage.admr
    protected final /* bridge */ /* synthetic */ void d(adly adlyVar, Object obj) {
        this.h = (anti) obj;
        if (this.f.getConfiguration().orientation == 1) {
            swe sweVar = this.j;
            if (sweVar == null) {
                swe sweVar2 = new swe(this.g.inflate(R.layout.music_key_promo_feature_item, this.i, false));
                this.j = sweVar2;
                sweVar = sweVar2;
            }
            g(sweVar);
            return;
        }
        swe sweVar3 = this.k;
        if (sweVar3 == null) {
            swe sweVar4 = new swe(this.g.inflate(R.layout.music_key_promo_feature_item, this.i, false));
            this.k = sweVar4;
            sweVar3 = sweVar4;
        }
        g(sweVar3);
    }

    @Override // defpackage.admr
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((anti) obj).j.G();
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
    }
}
