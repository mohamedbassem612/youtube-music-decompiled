package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class swm extends admr {
    public final View a;
    public final TextView b;
    public xgn c;
    private final TextView d;
    private final TextView e;
    private final TextView f;
    private final aeaa g;
    private final vxe h;
    private final LinearLayout i;
    private final LinearLayout j;
    private final tbt k;
    private arpi l;
    private final int m;
    private Drawable n;

    public swm(Context context, afip afipVar, vxe vxeVar, tbt tbtVar) {
        View viewInflate = View.inflate(context, R.layout.single_ypc_offer_item, null);
        this.a = viewInflate;
        this.d = (TextView) viewInflate.findViewById(R.id.metadata);
        this.e = (TextView) viewInflate.findViewById(R.id.name);
        this.f = (TextView) viewInflate.findViewById(R.id.promotion_text);
        this.h = vxeVar;
        this.k = tbtVar;
        this.m = context.getResources().getDimensionPixelSize(R.dimen.offer_container_margin);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.offer_container);
        this.i = linearLayout;
        this.j = (LinearLayout) linearLayout.findViewById(R.id.offer_info);
        TextView textView = (TextView) linearLayout.findViewById(R.id.price);
        this.b = textView;
        textView.addOnLayoutChangeListener(new aeab(textView, context.getResources().getDimensionPixelSize(R.dimen.price_icon_size), 0));
        aeaa aeaaVarD = afipVar.d(textView);
        this.g = aeaaVarD;
        aeaaVarD.c();
        aeaaVarD.d();
        aeaaVarD.c = new sug(this, 4);
    }

    @Override // defpackage.adma
    public final View a() {
        return this.a;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        this.k.l(this);
        this.l = null;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0078  */
    @Override // defpackage.admr
    protected final /* bridge */ /* synthetic */ void d(adly adlyVar, Object obj) {
        alay alayVar;
        CharSequence charSequenceConcat;
        ajnf ajnfVar;
        arpi arpiVar = (arpi) obj;
        this.l = arpiVar;
        this.k.g(this, swm.class);
        if ((arpiVar.b & 1) != 0) {
            alayVar = arpiVar.c;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        tuk.u(this.e, ackj.k(null, alayVar, null, false));
        TextView textView = this.d;
        if (this.l.d.size() != 0) {
            ArrayList arrayList = new ArrayList();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(System.getProperty("line.separator"));
            boolean z = true;
            for (alay alayVar2 : this.l.d) {
                if (!z) {
                    arrayList.add(spannableStringBuilder);
                }
                arrayList.add(vxl.a(null, alayVar2, this.h, false));
                z = false;
            }
            if (arrayList.isEmpty()) {
                charSequenceConcat = null;
            } else {
                charSequenceConcat = TextUtils.concat((CharSequence[]) arrayList.toArray(new CharSequence[0]));
            }
        } else {
            charSequenceConcat = null;
        }
        tuk.u(textView, charSequenceConcat);
        arpo arpoVar = arpiVar.e;
        if (arpoVar == null) {
            arpoVar = arpo.a;
        }
        int i = arpoVar.b & 1;
        TextView textView2 = this.f;
        if (i != 0) {
            arpo arpoVar2 = arpiVar.e;
            if (arpoVar2 == null) {
                arpoVar2 = arpo.a;
            }
            arpn arpnVar = arpoVar2.c;
            if (arpnVar == null) {
                arpnVar = arpn.a;
            }
            alay alayVar3 = arpnVar.b;
            if (alayVar3 == null) {
                alayVar3 = alay.a;
            }
            tuk.u(textView2, ackj.k(null, alayVar3, null, false));
        } else {
            textView2.setVisibility(8);
        }
        this.c = adlyVar.b;
        aeaa aeaaVar = this.g;
        ajng ajngVar = arpiVar.g;
        if (ajngVar == null) {
            ajngVar = ajng.a;
        }
        if ((ajngVar.b & 1) != 0) {
            ajng ajngVar2 = arpiVar.g;
            if (ajngVar2 == null) {
                ajngVar2 = ajng.a;
            }
            ajnfVar = ajngVar2.c;
            if (ajnfVar == null) {
                ajnfVar = ajnf.a;
            }
        } else {
            ajnfVar = null;
        }
        aeaaVar.a(ajnfVar, this.c, null);
        TextView textView3 = this.b;
        if (textView3.getCompoundDrawablesRelative().length > 0 && textView3.getCompoundDrawablesRelative()[0] != null) {
            Drawable drawable = textView3.getCompoundDrawablesRelative()[0];
            this.n = drawable;
            drawable.setAutoMirrored(true);
        }
        this.a.getViewTreeObserver().addOnGlobalLayoutListener(new swl(this, getClass().getSimpleName()));
    }

    @Override // defpackage.admr
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((arpi) obj).f.G();
    }

    public final void g(int i) {
        int i2;
        int i3;
        LinearLayout linearLayout = this.i;
        if (linearLayout.getOrientation() != i) {
            linearLayout.setOrientation(i);
            int i4 = -2;
            if (i == 0) {
                i3 = -2;
                i2 = 0;
                i4 = 0;
            } else {
                i2 = this.m;
                i3 = 0;
            }
            tym.j(this.j, i4, i3);
            tym.h(this.b, new tyk(0, i2, 0, 0), ViewGroup.MarginLayoutParams.class);
        }
    }

    @tcc
    public void handleFeedbackLoadCompleteEvent(wpu wpuVar) {
        throw null;
    }

    @tcc
    public void handleFeedbackLoadingEvent(wpv wpvVar) {
        throw null;
    }
}
