package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.common.ui.FixedAspectRatioFrameLayout;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class swp extends admr {
    final ImageView a;
    final TextView b;
    final TextView c;
    final TextView d;
    final TextView e;
    final TextView f;
    final ImageView g;
    private final adhv h;
    private final vxe i;
    private final aduv j;
    private final ViewGroup k;
    private final CardView l;
    private final FixedAspectRatioFrameLayout m;
    private final aeaa n;
    private final aeaa o;
    private final View p;
    private final zdj q;

    public swp(Context context, adhv adhvVar, vxe vxeVar, aduv aduvVar, afip afipVar, ViewGroup viewGroup) {
        this.h = adhvVar;
        this.i = vxeVar;
        this.j = aduvVar;
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.subscription_product_upsell_offer_card, viewGroup, false);
        this.k = viewGroup2;
        CardView cardView = (CardView) viewGroup2.findViewById(R.id.card_view);
        this.l = cardView;
        FixedAspectRatioFrameLayout fixedAspectRatioFrameLayout = (FixedAspectRatioFrameLayout) cardView.findViewById(R.id.header_container);
        this.m = fixedAspectRatioFrameLayout;
        this.a = (ImageView) fixedAspectRatioFrameLayout.findViewById(R.id.header_image);
        View viewFindViewById = fixedAspectRatioFrameLayout.findViewById(R.id.header_scrim);
        this.p = viewFindViewById;
        this.g = (ImageView) fixedAspectRatioFrameLayout.findViewById(R.id.logo);
        this.b = (TextView) cardView.findViewById(R.id.title);
        this.c = (TextView) cardView.findViewById(R.id.description);
        this.d = (TextView) cardView.findViewById(R.id.additional_info);
        TextView textView = (TextView) cardView.findViewById(R.id.primary_button);
        this.e = textView;
        TextView textView2 = (TextView) cardView.findViewById(R.id.secondary_button);
        this.f = textView2;
        this.n = afipVar.d(textView);
        this.o = afipVar.d(textView2);
        this.q = tsv.j(viewFindViewById);
    }

    @Override // defpackage.adma
    public final View a() {
        return this.k;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00db  */
    /* JADX WARN: Code duplicated, block: B:53:0x00df  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:58:0x0101  */
    /* JADX WARN: Code duplicated, block: B:60:0x0109  */
    /* JADX WARN: Code duplicated, block: B:64:0x0121  */
    /* JADX WARN: Code duplicated, block: B:67:0x0136  */
    /* JADX WARN: Code duplicated, block: B:72:0x010e A[SYNTHETIC] */
    @Override // defpackage.admr
    protected final /* bridge */ /* synthetic */ void d(adly adlyVar, Object obj) {
        aqmh aqmhVar;
        aqmh aqmhVar2;
        int iA;
        boolean z;
        alay alayVar;
        alay alayVar2;
        SpannableStringBuilder spannableStringBuilder;
        apji apjiVar;
        apji apjiVar2;
        aqfb aqfbVar = (aqfb) obj;
        if ((aqfbVar.b & 2) != 0) {
            aqmhVar = aqfbVar.e;
            if (aqmhVar == null) {
                aqmhVar = aqmh.a;
            }
        } else {
            aqmhVar = null;
        }
        this.m.a = aawb.E(aqmhVar);
        adhv adhvVar = this.h;
        ImageView imageView = this.a;
        if ((aqfbVar.b & 2) != 0) {
            aqmhVar2 = aqfbVar.e;
            if (aqmhVar2 == null) {
                aqmhVar2 = aqmh.a;
            }
        } else {
            aqmhVar2 = null;
        }
        adhvVar.h(imageView, aqmhVar2);
        zdj zdjVar = this.q;
        aihv aihvVar = aqfbVar.f;
        int i = 0;
        if (aihvVar == null || aihvVar.isEmpty()) {
            tuk.l((View) zdjVar.a, false);
        } else {
            zdjVar.f(ahng.S(aihvVar));
        }
        int i2 = aqfbVar.c;
        if (i2 != 9) {
            if (i2 == 10) {
                aduv aduvVar = this.j;
                aliz alizVarA = aliz.a(((alja) aqfbVar.d).c);
                if (alizVarA == null) {
                    alizVarA = aliz.UNKNOWN;
                }
                iA = aduvVar.a(alizVarA);
                if (iA != 0) {
                    this.g.setImageResource(iA);
                }
            }
            ImageView imageView2 = this.g;
            z = true;
            if (aqfbVar.c != 9 && iA == 0) {
                z = false;
            }
            tuk.l(imageView2, z);
            TextView textView = this.b;
            if ((aqfbVar.b & 4) != 0) {
                alayVar = aqfbVar.g;
                if (alayVar == null) {
                    alayVar = alay.a;
                }
            } else {
                alayVar = null;
            }
            vxe vxeVar = this.i;
            tuk.u(textView, vxl.a(null, alayVar, vxeVar, false));
            TextView textView2 = this.c;
            if ((aqfbVar.b & 8) != 0) {
                alayVar2 = aqfbVar.h;
                if (alayVar2 == null) {
                    alayVar2 = alay.a;
                }
            } else {
                alayVar2 = null;
            }
            tuk.u(textView2, vxl.a(null, alayVar2, vxeVar, false));
            TextView textView3 = this.d;
            List<Spanned> listB = vxl.b(aqfbVar.i, vxeVar);
            spannableStringBuilder = new SpannableStringBuilder();
            for (Spanned spanned : listB) {
                if (i > 0) {
                    spannableStringBuilder.append(' ');
                }
                spannableStringBuilder.append((CharSequence) spanned);
                i++;
            }
            tuk.u(textView3, SpannableString.valueOf(spannableStringBuilder));
            aeaa aeaaVar = this.n;
            apjiVar = aqfbVar.j;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aeaaVar.a((ajnf) aavv.s(apjiVar, ajnp.a), adlyVar.b, null);
            aeaa aeaaVar2 = this.o;
            apjiVar2 = aqfbVar.k;
            if (apjiVar2 == null) {
                apjiVar2 = apji.a;
            }
            aeaaVar2.a((ajnf) aavv.s(apjiVar2, ajnp.a), adlyVar.b, null);
        }
        aqmh aqmhVar3 = (aqmh) aqfbVar.d;
        aqmg aqmgVarM = aawb.M(aqmhVar3);
        if (aqmgVarM != null) {
            ImageView imageView3 = this.g;
            ViewGroup.LayoutParams layoutParams = imageView3.getLayoutParams();
            int i3 = (int) ((aqmgVarM.d / aqmgVarM.e) * layoutParams.height);
            adhvVar.n(aqmhVar3, i3, layoutParams.height);
            tym.h(imageView3, new tyl(i3, 0), ViewGroup.LayoutParams.class);
        }
        adhvVar.j(this.g, aqfbVar.c == 9 ? (aqmh) aqfbVar.d : aqmh.a, adhr.b);
        iA = 0;
        ImageView imageView4 = this.g;
        z = true;
        if (aqfbVar.c != 9) {
            z = false;
        }
        tuk.l(imageView4, z);
        TextView textView4 = this.b;
        if ((aqfbVar.b & 4) != 0) {
            alayVar = aqfbVar.g;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        vxe vxeVar2 = this.i;
        tuk.u(textView4, vxl.a(null, alayVar, vxeVar2, false));
        TextView textView5 = this.c;
        if ((aqfbVar.b & 8) != 0) {
            alayVar2 = aqfbVar.h;
            if (alayVar2 == null) {
                alayVar2 = alay.a;
            }
        } else {
            alayVar2 = null;
        }
        tuk.u(textView5, vxl.a(null, alayVar2, vxeVar2, false));
        TextView textView6 = this.d;
        List<Spanned> listB2 = vxl.b(aqfbVar.i, vxeVar2);
        spannableStringBuilder = new SpannableStringBuilder();
        while (r2.hasNext()) {
            if (i > 0) {
                spannableStringBuilder.append(' ');
            }
            spannableStringBuilder.append((CharSequence) spanned);
            i++;
        }
        tuk.u(textView6, SpannableString.valueOf(spannableStringBuilder));
        aeaa aeaaVar3 = this.n;
        apjiVar = aqfbVar.j;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        aeaaVar3.a((ajnf) aavv.s(apjiVar, ajnp.a), adlyVar.b, null);
        aeaa aeaaVar4 = this.o;
        apjiVar2 = aqfbVar.k;
        if (apjiVar2 == null) {
            apjiVar2 = apji.a;
        }
        aeaaVar4.a((ajnf) aavv.s(apjiVar2, ajnp.a), adlyVar.b, null);
    }

    @Override // defpackage.admr
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aqfb) obj).l.G();
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
    }
}
