package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rpg implements adma {
    private final /* synthetic */ int $cid;
    public final View a;
    public wnq b;
    public boolean c;
    private final TextView d;
    private final TextView e;
    private final ImageView f;
    private final adia g;

    public rpg(Context context, adhv adhvVar, rpq rpqVar, int i) {
        this.$cid = i;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.account_item, (ViewGroup) null);
        this.a = viewInflate;
        TextView textView = (TextView) viewInflate.findViewById(R.id.name);
        this.d = textView;
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.byline);
        this.e = textView2;
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.thumbnail);
        this.f = imageView;
        this.g = new adia(adhvVar, imageView, false);
        viewInflate.setOnClickListener(new jip(this, rpqVar, 11, (byte[]) null));
        viewInflate.getViewTreeObserver().addOnGlobalLayoutListener(new rpf(this, getClass().getSimpleName()));
        tzk.p(context, R.attr.ytTextAppearanceBody2a).ifPresent(new abfu(textView, textView2, 1));
        Optional optionalL = tzk.l(context, R.attr.accountSwitcherNameTextColor);
        textView.getClass();
        int i2 = 15;
        rbj rbjVar = new rbj(textView, i2);
        if (true == optionalL.isPresent()) {
            Object obj = optionalL.get();
            ((TextView) rbjVar.a).setTextColor((ColorStateList) obj);
        }
        Optional optionalL2 = tzk.l(context, R.attr.accountSwitcherBylineTextColor);
        textView2.getClass();
        rbj rbjVar2 = new rbj(textView2, i2);
        if (true == optionalL2.isPresent()) {
            Object obj2 = optionalL2.get();
            ((TextView) rbjVar2.a).setTextColor((ColorStateList) obj2);
        }
    }

    @Override // defpackage.adma
    public final View a() {
        return this.a;
    }

    @Override // defpackage.adma
    public final /* synthetic */ void hU(adly adlyVar, Object obj) {
        if (this.$cid != 0) {
            wnq wnqVar = (wnq) obj;
            this.c = false;
            xgn xgnVar = adlyVar.b;
            xgt xgtVarA = xgnVar.a();
            if (xgtVarA != null) {
                xgnVar.l(new xgx(xgtVarA, 7116));
            }
            this.d.setText(wnqVar.a());
            this.e.setText(TextUtils.isEmpty(wnqVar.b()) ? wnqVar.g() : TextUtils.concat(wnqVar.g(), "\n", wnqVar.b()));
            this.g.e(wnqVar.q());
            tuk.l(this.f, wnqVar.n());
            if (wnqVar.n()) {
                this.a.requestFocus();
            }
            this.b = wnqVar;
            return;
        }
        wnq wnqVar2 = (wnq) obj;
        this.c = false;
        Spanned spannedA = wnqVar2.a();
        TextView textView = this.d;
        textView.setText(spannedA);
        Spanned spannedB = wnqVar2.b();
        boolean zIsEmpty = TextUtils.isEmpty(spannedB);
        TextView textView2 = this.e;
        if (zIsEmpty) {
            textView2.setVisibility(8);
        } else {
            textView2.setText(spannedB);
            textView2.setVisibility(0);
        }
        this.g.e(wnqVar2.q());
        textView.setSelected(wnqVar2.n());
        if (wnqVar2.n()) {
            this.a.requestFocus();
        }
        boolean z = wnqVar2.a.j;
        boolean z2 = !z;
        this.a.setEnabled(z2);
        textView.setEnabled(z2);
        this.e.setEnabled(z2);
        this.f.setAlpha(true != z ? 1.0f : 0.6f);
        this.b = wnqVar2;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
    }

    public rpg(Context context, adhv adhvVar, int i) {
        this.$cid = i;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.account_list_item, (ViewGroup) null);
        this.a = viewInflate;
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.thumbnail);
        this.d = (TextView) viewInflate.findViewById(R.id.name);
        this.e = (TextView) viewInflate.findViewById(R.id.byline);
        this.f = (ImageView) viewInflate.findViewById(R.id.account_selected_indicator);
        this.g = new adia(adhvVar, imageView, false);
        viewInflate.getViewTreeObserver().addOnGlobalLayoutListener(new jg(this, 5));
    }
}
