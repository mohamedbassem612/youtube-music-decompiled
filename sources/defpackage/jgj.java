package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class jgj implements adma {
    private final /* synthetic */ int $cid;
    private final Object a;
    private final Object b;
    private final View c;

    public jgj(Context context, rpt rptVar, int i) {
        this.$cid = i;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.manage_account_item, (ViewGroup) null);
        this.b = viewInflate;
        viewInflate.findViewById(R.id.byline).setVisibility(8);
        TextView textView = (TextView) viewInflate.findViewById(R.id.name);
        this.a = textView;
        this.c = (ImageView) viewInflate.findViewById(R.id.thumbnail);
        viewInflate.setOnClickListener(new rnx(rptVar, 7));
        tzk.p(context, R.attr.ytTextAppearanceBody2a).ifPresent(new jmj(textView, 3));
        Optional optionalL = tzk.l(context, R.attr.accountSwitcherNameTextColor);
        textView.getClass();
        rbj rbjVar = new rbj(textView, 17);
        if (true == optionalL.isPresent()) {
            Object obj = optionalL.get();
            ((TextView) rbjVar.a).setTextColor((ColorStateList) obj);
        }
    }

    @Override // defpackage.adma
    public final View a() {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? (View) this.b : this.c;
        }
        return ((jdw) this.a).a;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        if (this.$cid == 0) {
            kro.Z((View) this.b, 0, 0);
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, xgn] */
    /* JADX WARN: Type inference failed for: r5v1, types: [admd, java.lang.Object] */
    @Override // defpackage.adma
    public final /* synthetic */ void hU(adly adlyVar, Object obj) {
        int i = this.$cid;
        if (i == 0) {
            Object obj2 = this.b;
            apny apnyVar = (apny) obj;
            kro.T((View) obj2, adlyVar);
            if ((apnyVar.b & 1) != 0) {
                View view = this.c;
                alay alayVar = apnyVar.d;
                if (alayVar == null) {
                    alayVar = alay.a;
                }
                ((TextView) view).setText(ackj.k(null, alayVar, null, false));
                ((LinearLayout) obj2).setVisibility(0);
            } else {
                ((LinearLayout) obj2).setVisibility(8);
            }
            this.a.e(adlyVar);
            return;
        }
        if (i == 1) {
            anwj anwjVar = (anwj) obj;
            if ((anwjVar.b & 2) != 0) {
                Object obj3 = this.b;
                anwk anwkVar = anwjVar.d;
                if (anwkVar == null) {
                    anwkVar = anwk.a;
                }
                DisplayMetrics displayMetrics = (DisplayMetrics) obj3;
                int iC = twm.c(displayMetrics, anwkVar.b);
                anwk anwkVar2 = anwjVar.d;
                if (anwkVar2 == null) {
                    anwkVar2 = anwk.a;
                }
                this.c.setPadding(0, iC, 0, twm.c(displayMetrics, anwkVar2.c));
            }
            tuk.l((View) this.a, !anwjVar.c);
            return;
        }
        if (i == 2) {
            airc aircVar = (airc) obj;
            this.a.w(new xgj(aircVar.d, (amud) null), null);
            alay alayVar2 = aircVar.c;
            if (alayVar2 == null) {
                alayVar2 = alay.a;
            }
            Spanned spannedK = ackj.k(null, alayVar2, null, false);
            ((TextView) this.c).setText(spannedK);
            ((View) this.b).setContentDescription(spannedK);
            return;
        }
        ((TextView) this.a).setText(R.string.account_switcher_add_account);
        Context context = ((View) this.b).getContext();
        Drawable drawable = context.getResources().getDrawable(R.drawable.quantum_ic_add_grey600_18, null);
        Optional optionalL = tzk.l(context, R.attr.ytTextSecondary);
        hqb hqbVar = new hqb(context, drawable, 7);
        if (true == optionalL.isPresent()) {
            Object obj4 = optionalL.get();
            Object obj5 = hqbVar.a;
            Object obj6 = hqbVar.b;
            new ttk((Context) obj5);
            optionalL = Optional.ofNullable(ttk.c((Drawable) obj6, (ColorStateList) obj4));
        }
        ((ImageView) this.c).setImageDrawable((Drawable) optionalL.orElse(drawable));
    }

    public jgj(Context context, int i) {
        this.$cid = i;
        context.getClass();
        jdw jdwVar = new jdw(context);
        this.a = jdwVar;
        LinearLayout linearLayout = (LinearLayout) View.inflate(context, R.layout.search_suggestions_section_header, null);
        this.b = linearLayout;
        this.c = (TextView) linearLayout.findViewById(R.id.title);
        jdwVar.c(linearLayout);
    }

    public jgj(Context context, int i, xgn xgnVar, int i2) {
        this.$cid = i2;
        this.a = xgnVar;
        View viewInflate = LayoutInflater.from(context).inflate(i, (ViewGroup) null);
        this.b = viewInflate;
        TextView textView = (TextView) viewInflate.findViewById(R.id.title);
        this.c = textView;
        tzk.p(context, R.attr.ytTextAppearanceBody2b).ifPresent(new jmj(textView, 2));
        Optional optionalL = tzk.l(context, R.attr.ytTextSecondary);
        textView.getClass();
        rbj rbjVar = new rbj(textView, 16);
        if (true == optionalL.isPresent()) {
            Object obj = optionalL.get();
            ((TextView) rbjVar.a).setTextColor((ColorStateList) obj);
        }
    }

    public jgj(Context context, int i, byte[] bArr) {
        this.$cid = i;
        this.b = context.getResources().getDisplayMetrics();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.music_shelf_divider, (ViewGroup) null);
        this.c = viewInflate;
        this.a = viewInflate.findViewById(R.id.line);
    }
}
