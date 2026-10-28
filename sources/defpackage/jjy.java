package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import com.google.android.material.appbar.AppBarLayout;
import j$.time.Duration;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jjy extends admr {
    public static final Duration a = Duration.ofMillis(250);
    public final AppBarLayout b;
    public final List c = new ArrayList();
    public final View d;
    public final LinearLayout e;
    public final ImageView f;
    public final View g;
    public final View h;
    public final ImageView i;
    public final TextView j;
    public final TextView k;
    public final EditText l;
    public final ImageView m;
    public aqjq n;
    public adly o;
    public int p;
    public int q;
    private final Context s;
    private final adhv t;
    private final View u;
    private final ImageView v;

    public jjy(Context context, AppBarLayout appBarLayout, adhv adhvVar, adxj adxjVar) {
        this.s = context;
        this.b = appBarLayout;
        this.t = adhvVar;
        this.d = appBarLayout.findViewById(R.id.tastebuilder_header_collapsing);
        LinearLayout linearLayout = (LinearLayout) appBarLayout.findViewById(R.id.tastebuilder_header_contents);
        this.e = linearLayout;
        this.f = (ImageView) appBarLayout.findViewById(R.id.tastebuilder_header_background_image);
        this.g = appBarLayout.findViewById(R.id.tastebuilder_header_background_gradient);
        this.h = appBarLayout.findViewById(R.id.tastebuilder_header_background_scrim);
        this.i = (ImageView) appBarLayout.findViewById(R.id.tastebuilder_header_logo);
        this.j = (TextView) appBarLayout.findViewById(R.id.tastebuilder_header_title);
        this.k = (TextView) appBarLayout.findViewById(R.id.tastebuilder_header_subtitle);
        this.u = appBarLayout.findViewById(R.id.tastebuilder_header_search_bar);
        this.l = (EditText) appBarLayout.findViewById(R.id.search_edit_text);
        ImageView imageView = (ImageView) appBarLayout.findViewById(R.id.search_clear);
        this.v = imageView;
        ImageView imageView2 = (ImageView) appBarLayout.findViewById(R.id.toolbar_back_navigation);
        this.m = imageView2;
        imageView2.setImageAlpha(0);
        int i = 1;
        this.q = 1;
        imageView.setImageResource(adxjVar.b(arqz.oQ));
        imageView2.setImageResource(adxjVar.b(arqz.er));
        asv asvVar = (asv) appBarLayout.getLayoutParams();
        if (asvVar != null) {
            if (asvVar.a == null) {
                asvVar.b(new AppBarLayout.Behavior());
            }
            AppBarLayout.Behavior behavior = (AppBarLayout.Behavior) asvVar.a;
            if (behavior != null) {
                ((AppBarLayout.BaseBehavior) behavior).c = new avgj(this);
            }
        }
        linearLayout.addOnLayoutChangeListener(new jfx(this, 3));
        appBarLayout.h(new aeup(this, i));
    }

    public static final aqjz l(aqjq aqjqVar) {
        apji apjiVar = aqjqVar.e;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aqka.a);
        apjiVar.c(aihlVarCheckIsLite);
        Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
        return (aqjz) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
    }

    @Override // defpackage.adma
    public final View a() {
        return this.b;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        this.f.setVisibility(8);
        this.g.setVisibility(8);
        this.h.setVisibility(8);
        this.u.setVisibility(8);
        this.d.setMinimumHeight(0);
    }

    @Override // defpackage.admr
    public final /* bridge */ /* synthetic */ void d(adly adlyVar, Object obj) {
        alay alayVar;
        alay alayVar2;
        aqjq aqjqVar = (aqjq) obj;
        this.n = aqjqVar;
        this.o = adlyVar;
        int i = 0;
        this.b.setVisibility(0);
        this.d.setMinimumHeight(h());
        if ((aqjqVar.b & 1) != 0) {
            alayVar = aqjqVar.c;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        TextView textView = this.j;
        tuk.u(textView, ackj.k(null, alayVar, null, false));
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setAccessibilityHeading(true);
        }
        TextView textView2 = this.k;
        int i2 = 2;
        if ((aqjqVar.b & 2) != 0) {
            alayVar2 = aqjqVar.d;
            if (alayVar2 == null) {
                alayVar2 = alay.a;
            }
        } else {
            alayVar2 = null;
        }
        tuk.u(textView2, ackj.k(null, alayVar2, null, false));
        if ((aqjqVar.b & 4) != 0) {
            aqjz aqjzVarL = l(aqjqVar);
            EditText editText = this.l;
            alay alayVar3 = aqjzVarL.c;
            if (alayVar3 == null) {
                alayVar3 = alay.a;
            }
            editText.setHint(ackj.k(null, alayVar3, null, false));
            this.u.setVisibility(0);
            k();
            this.v.setOnClickListener(new jjc(this, i2));
            this.m.setOnClickListener(new jjc(this, 3));
            editText.setOnTouchListener(new jjx(this, i));
            editText.addTextChangedListener(new gxv(this, 6));
        }
        if ((aqjqVar.b & 8) != 0) {
            apji apjiVar = aqjqVar.f;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(anyj.a);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                ImageView imageView = this.f;
                imageView.setVisibility(0);
                this.g.setVisibility(0);
                this.h.setVisibility(0);
                apji apjiVar2 = aqjqVar.f;
                if (apjiVar2 == null) {
                    apjiVar2 = apji.a;
                }
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(anyj.a);
                apjiVar2.c(aihlVarCheckIsLite2);
                Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                Object objC = objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK);
                adhv adhvVar = this.t;
                aqmh aqmhVar = ((anyi) objC).c;
                if (aqmhVar == null) {
                    aqmhVar = aqmh.a;
                }
                adhvVar.h(imageView, aqmhVar);
            }
        }
    }

    @Override // defpackage.admr
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        aqjq aqjqVar = (aqjq) obj;
        if ((aqjqVar.b & 4) == 0) {
            return null;
        }
        aqjz aqjzVarL = l(aqjqVar);
        if ((aqjzVarL.b & 16) != 0) {
            return aqjzVarL.f.G();
        }
        return null;
    }

    public final int g() {
        return this.s.getResources().getDimensionPixelSize(R.dimen.tastebuilder_header_padding_bottom);
    }

    public final int h() {
        int paddingTop = this.e.getPaddingTop();
        aqjq aqjqVar = this.n;
        if (aqjqVar == null || (aqjqVar.b & 4) == 0) {
            return paddingTop;
        }
        Context context = this.s;
        return paddingTop + context.getResources().getDimensionPixelSize(R.dimen.tastebuilder_subtitle_text_padding) + context.getResources().getDimensionPixelSize(R.dimen.action_bar_height) + g();
    }

    public final void i(jjs jjsVar) {
        this.c.add(jjsVar);
    }

    public final void j() {
        this.q = 1;
        EditText editText = this.l;
        tuk.i(editText);
        ImageView imageView = this.m;
        imageView.setVisibility(8);
        imageView.setImageAlpha(0);
        editText.setText("");
        editText.clearFocus();
        k();
    }

    public final void k() {
        this.v.setVisibility(this.l.getText().length() != 0 ? 0 : 8);
    }
}
