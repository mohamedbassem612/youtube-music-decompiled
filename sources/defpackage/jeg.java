package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jeg extends admr {
    private final admd a;
    private final Context b;
    private final vxe c;
    private final LinearLayout d;
    private final TextView e;
    private final LinearLayout f;
    private final LinearLayout g;
    private final ProgressBar h;
    private izd i;
    private final jij j;

    public jeg(Context context, vxe vxeVar, jij jijVar) {
        context.getClass();
        this.b = context;
        vxeVar.getClass();
        this.c = vxeVar;
        jijVar.getClass();
        this.j = jijVar;
        jdw jdwVar = new jdw(context);
        this.a = jdwVar;
        LinearLayout linearLayout = (LinearLayout) View.inflate(context, R.layout.music_notifier_shelf, null);
        this.d = linearLayout;
        this.e = (TextView) linearLayout.findViewById(R.id.title);
        LinearLayout linearLayout2 = (LinearLayout) linearLayout.findViewById(R.id.button_container);
        this.f = linearLayout2;
        this.g = (LinearLayout) linearLayout.findViewById(R.id.title_and_buttons_container);
        this.h = (ProgressBar) linearLayout.findViewById(R.id.notification_progress_bar);
        jdwVar.c(linearLayout);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.item_medium_spacing);
        linearLayout2.setPaddingRelative(dimensionPixelSize, 0, dimensionPixelSize, dimensionPixelSize);
    }

    private static Optional g(adly adlyVar) {
        Object objC = adlyVar.c("overrideBottomMarginPx");
        return objC instanceof Integer ? Optional.of((Integer) objC) : Optional.empty();
    }

    @Override // defpackage.adma
    public final View a() {
        return ((jdw) this.a).a;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        izd izdVar = this.i;
        if (izdVar != null) {
            izdVar.c();
            this.i = null;
        }
    }

    @Override // defpackage.admr
    public final /* synthetic */ void d(adly adlyVar, Object obj) {
        ajwo ajwoVar;
        alay alayVar;
        LinearLayout linearLayout = this.f;
        anss anssVar = (anss) obj;
        linearLayout.removeAllViews();
        int i = 8;
        if (!anssVar.h) {
            this.e.setVisibility(8);
            return;
        }
        LinearLayout linearLayout2 = this.d;
        izd izdVarAc = kro.ac(linearLayout2, anssVar.f.G(), adlyVar.b);
        this.i = izdVarAc;
        vxe vxeVar = this.c;
        xgn xgnVar = adlyVar.b;
        if ((anssVar.b & 32) != 0) {
            ajwoVar = anssVar.i;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
        } else {
            ajwoVar = null;
        }
        izdVarAc.b(izb.b(vxeVar, xgnVar, ajwoVar, adlyVar.e()));
        TextView textView = this.e;
        if ((anssVar.b & 1) != 0) {
            alayVar = anssVar.c;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        tuk.u(textView, ackj.k(null, alayVar, null, false));
        if ((anssVar.b & 64) != 0) {
            anld anldVar = anssVar.j;
            if (anldVar == null) {
                anldVar = anld.a;
            }
            ixt.i(adlyVar, linearLayout2, anldVar, false);
        }
        ProgressBar progressBar = this.h;
        ansq ansqVar = anssVar.k;
        if (ansqVar == null) {
            ansqVar = ansq.a;
        }
        tuk.l(progressBar, ansqVar.b == 1);
        if (adlyVar.j("useLibraryPadding")) {
            int iB = adlyVar.b("pagePadding", 0) + this.b.getResources().getDimensionPixelSize(R.dimen.item_large_spacing);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout2.getLayoutParams();
            layoutParams.leftMargin = iB;
            layoutParams.rightMargin = iB;
            linearLayout2.setLayoutParams(layoutParams);
        }
        if (g(adlyVar).isPresent()) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) linearLayout2.getLayoutParams();
            layoutParams2.bottomMargin = ((Integer) g(adlyVar).get()).intValue();
            linearLayout2.setLayoutParams(layoutParams2);
        }
        for (ansr ansrVar : anssVar.e) {
            if ((ansrVar.b & 1) != 0) {
                int iAS = a.aS(anssVar.d);
                if (iAS == 0) {
                    iAS = 1;
                }
                int i2 = iAS - 1;
                LinearLayout linearLayout3 = this.g;
                if (i2 != 2) {
                    linearLayout3.setOrientation(1);
                } else {
                    linearLayout3.setOrientation(0);
                    adlyVar.f("buttonDrawableGravity", 8388613);
                }
                View viewInflate = View.inflate(this.b, R.layout.notifier_button, null);
                View viewFindViewById = viewInflate.findViewById(R.id.text_button);
                View viewFindViewById2 = viewInflate.findViewById(R.id.image_button);
                ajnf ajnfVar = ansrVar.c;
                if (ajnfVar == null) {
                    ajnfVar = ajnf.a;
                }
                if ((ajnfVar.b & 64) != 0) {
                    viewFindViewById.setVisibility(0);
                    viewFindViewById2.setVisibility(i);
                } else {
                    viewFindViewById.setVisibility(i);
                    viewFindViewById2.setVisibility(0);
                    viewFindViewById = viewFindViewById2;
                }
                jbm jbmVarA = this.j.a(viewFindViewById, null, null, anssVar, false);
                ajnf ajnfVar2 = ansrVar.c;
                if (ajnfVar2 == null) {
                    ajnfVar2 = ajnf.a;
                }
                jbmVarA.j(adlyVar, ajnfVar2, 16);
                linearLayout.addView(viewInflate);
                i = 8;
            }
        }
        if (anssVar.g.size() != 0) {
            Iterator it = anssVar.g.iterator();
            while (it.hasNext()) {
                vxeVar.a((ajwo) it.next());
            }
        }
        this.a.e(adlyVar);
    }

    @Override // defpackage.admr
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((anss) obj).f.G();
    }
}
