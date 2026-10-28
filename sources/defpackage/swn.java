package defpackage;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.apps.youtube.music.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class swn extends admr {
    final TextView a;
    final TextView b;
    final TextView c;
    final View d;
    final ImageView e;
    final View f;
    public anfy g;
    private final ViewGroup h;
    private final CardView i;
    private final TextView j;
    private final TextView k;
    private final aeaa l;
    private final aeaa m;
    private final vxe n;
    private final aduv o;
    private final adhv p;
    private final HashMap q;

    public swn(cf cfVar, afip afipVar, vxe vxeVar, aduv aduvVar, adhv adhvVar, adyr adyrVar, ViewGroup viewGroup) {
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(cfVar).inflate(R.layout.subscription_product_card, viewGroup, false);
        this.h = viewGroup2;
        CardView cardView = (CardView) viewGroup2.findViewById(R.id.card_view);
        this.i = cardView;
        View viewFindViewById = cardView.findViewById(R.id.contextual_menu_anchor);
        this.f = viewFindViewById;
        this.e = (ImageView) cardView.findViewById(R.id.logo);
        this.a = (TextView) cardView.findViewById(R.id.metadata);
        this.b = (TextView) cardView.findViewById(R.id.additional_info);
        this.c = (TextView) cardView.findViewById(R.id.description);
        this.d = cardView.findViewById(R.id.red_bar);
        TextView textView = (TextView) cardView.findViewById(R.id.primary_button);
        this.j = textView;
        this.l = afipVar.d(textView);
        TextView textView2 = (TextView) cardView.findViewById(R.id.secondary_button);
        this.k = textView2;
        this.m = afipVar.d(textView2);
        new aduz(cardView, viewFindViewById);
        viewFindViewById.setOnClickListener(new jip(this, adyrVar, 13));
        this.n = vxeVar;
        this.o = aduvVar;
        this.p = adhvVar;
        this.q = new HashMap();
    }

    private final SpannableString g(List list) {
        if (list.isEmpty()) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            alay alayVar = (alay) it.next();
            if (i > 0) {
                spannableStringBuilder.append((CharSequence) System.getProperty("line.separator"));
            }
            spannableStringBuilder.append((CharSequence) vxl.a(null, alayVar, this.n, false));
            i++;
        }
        return SpannableString.valueOf(spannableStringBuilder);
    }

    @Override // defpackage.adma
    public final View a() {
        return this.h;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0071  */
    /* JADX WARN: Code duplicated, block: B:28:0x007b  */
    /* JADX WARN: Code duplicated, block: B:31:0x008b  */
    /* JADX WARN: Code duplicated, block: B:32:0x008d  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:49:0x0106  */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.admr
    protected final /* bridge */ /* synthetic */ void d(adly adlyVar, Object obj) {
        int iA;
        boolean z;
        apji apjiVar;
        anfy anfyVar;
        boolean z2;
        alay alayVar;
        apji apjiVar2;
        apji apjiVar3;
        TextView textView;
        aqfa aqfaVar = (aqfa) obj;
        int i = aqfaVar.c;
        if (i != 1) {
            if (i == 8) {
                aduv aduvVar = this.o;
                aliz alizVarA = aliz.a(((alja) aqfaVar.d).c);
                if (alizVarA == null) {
                    alizVarA = aliz.UNKNOWN;
                }
                iA = aduvVar.a(alizVarA);
                if (iA != 0) {
                    this.e.setImageResource(iA);
                }
            }
            ImageView imageView = this.e;
            if (aqfaVar.c == 1 && iA == 0) {
                z = false;
            } else {
                z = true;
            }
            tuk.l(imageView, z);
            apjiVar = aqfaVar.e;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            anfyVar = (anfy) aavv.s(apjiVar, angi.a);
            this.g = anfyVar;
            View view = this.f;
            if (anfyVar != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            tuk.l(view, z2);
            tuk.u(this.a, g(aqfaVar.f));
            tuk.u(this.b, g(aqfaVar.g));
            TextView textView2 = this.c;
            if ((aqfaVar.b & 4) != 0) {
                alayVar = aqfaVar.h;
                if (alayVar == null) {
                    alayVar = alay.a;
                }
            } else {
                alayVar = null;
            }
            tuk.u(textView2, vxl.a(null, alayVar, this.n, false));
            this.d.setVisibility(textView2.getVisibility());
            aeaa aeaaVar = this.l;
            apjiVar2 = aqfaVar.i;
            if (apjiVar2 == null) {
                apjiVar2 = apji.a;
            }
            ajnf ajnfVar = (ajnf) aavv.s(apjiVar2, ajnp.a);
            xgn xgnVar = adlyVar.b;
            HashMap map = this.q;
            aeaaVar.a(ajnfVar, xgnVar, map);
            aeaa aeaaVar2 = this.m;
            apjiVar3 = aqfaVar.j;
            if (apjiVar3 == null) {
                apjiVar3 = apji.a;
            }
            aeaaVar2.a((ajnf) aavv.s(apjiVar3, ajnp.a), adlyVar.b, map);
            textView = this.k;
            if (textView.getVisibility() == 0) {
                tym.h(textView, new tyg(GridLayout.spec(this.j.getVisibility() == 0 ? 2 : 0, 1)), GridLayout.LayoutParams.class);
            }
        }
        aqmh aqmhVar = (aqmh) aqfaVar.d;
        aqmg aqmgVarM = aawb.M(aqmhVar);
        if (aqmgVarM != null) {
            ImageView imageView2 = this.e;
            ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
            int i2 = (int) ((aqmgVarM.d / aqmgVarM.e) * layoutParams.height);
            this.p.n(aqmhVar, i2, layoutParams.height);
            tym.h(imageView2, new tyl(i2, 0), ViewGroup.LayoutParams.class);
        }
        this.p.j(this.e, aqfaVar.c == 1 ? (aqmh) aqfaVar.d : aqmh.a, adhr.b);
        iA = 0;
        ImageView imageView3 = this.e;
        if (aqfaVar.c == 1) {
            z = true;
        } else {
            z = true;
        }
        tuk.l(imageView3, z);
        apjiVar = aqfaVar.e;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        anfyVar = (anfy) aavv.s(apjiVar, angi.a);
        this.g = anfyVar;
        View view2 = this.f;
        if (anfyVar != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        tuk.l(view2, z2);
        tuk.u(this.a, g(aqfaVar.f));
        tuk.u(this.b, g(aqfaVar.g));
        TextView textView3 = this.c;
        if ((aqfaVar.b & 4) != 0) {
            alayVar = aqfaVar.h;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        tuk.u(textView3, vxl.a(null, alayVar, this.n, false));
        this.d.setVisibility(textView3.getVisibility());
        aeaa aeaaVar3 = this.l;
        apjiVar2 = aqfaVar.i;
        if (apjiVar2 == null) {
            apjiVar2 = apji.a;
        }
        ajnf ajnfVar2 = (ajnf) aavv.s(apjiVar2, ajnp.a);
        xgn xgnVar2 = adlyVar.b;
        HashMap map2 = this.q;
        aeaaVar3.a(ajnfVar2, xgnVar2, map2);
        aeaa aeaaVar4 = this.m;
        apjiVar3 = aqfaVar.j;
        if (apjiVar3 == null) {
            apjiVar3 = apji.a;
        }
        aeaaVar4.a((ajnf) aavv.s(apjiVar3, ajnp.a), adlyVar.b, map2);
        textView = this.k;
        if (textView.getVisibility() == 0) {
            tym.h(textView, new tyg(GridLayout.spec(this.j.getVisibility() == 0 ? 2 : 0, 1)), GridLayout.LayoutParams.class);
        }
    }

    @Override // defpackage.admr
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aqfa) obj).k.G();
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
    }
}
