package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spanned;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.common.ui.CircularImageView;
import j$.util.Collection;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jka implements View.OnClickListener, adma {
    private final admd a;
    private final Resources b;
    private final TextView c;
    private final ImageView d;
    private final CircularImageView e;
    private final adia f;
    private final aduv g;
    private jjv h;
    private adly i;

    public jka(Context context, aduv aduvVar, adhv adhvVar) {
        context.getClass();
        adhvVar.getClass();
        this.b = context.getResources();
        jdw jdwVar = new jdw(context, null);
        this.a = jdwVar;
        this.g = aduvVar;
        View viewInflate = View.inflate(context, R.layout.tastebuilder_item, null);
        this.c = (TextView) viewInflate.findViewById(R.id.title);
        CircularImageView circularImageView = (CircularImageView) viewInflate.findViewById(R.id.thumbnail);
        this.e = circularImageView;
        this.d = (ImageView) viewInflate.findViewById(R.id.icon);
        this.f = new adia(adhvVar, circularImageView, false);
        jdwVar.c(viewInflate);
        viewInflate.setAccessibilityDelegate(new jjz());
    }

    private final void d(boolean z, CharSequence charSequence) {
        jjv jjvVar;
        ImageView imageView = this.d;
        if (z) {
            imageView.setVisibility(0);
            tsv.i(this.e, this.b.getInteger(R.integer.image_alpha_partially_visible));
        } else {
            imageView.setVisibility(8);
            tsv.i(this.e, this.b.getInteger(R.integer.image_alpha_opaque));
        }
        if (charSequence == null || (jjvVar = this.h) == null) {
            return;
        }
        View viewA = a();
        boolean z2 = jjvVar.b;
        Resources resources = this.b;
        viewA.setContentDescription(z2 ? resources.getString(R.string.accessibility_tastebuilder_item_selected, charSequence) : resources.getString(R.string.accessibility_tastebuilder_item_unselected, charSequence));
    }

    @Override // defpackage.adma
    public final View a() {
        return ((jdw) this.a).a;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        this.f.a();
        this.i = null;
        this.h = null;
    }

    @Override // defpackage.adma
    public final /* synthetic */ void hU(adly adlyVar, Object obj) {
        jjv jjvVar = (jjv) obj;
        if (jjvVar != null) {
            this.h = jjvVar;
            this.i = adlyVar;
            xgn xgnVar = adlyVar.b;
            if (xgnVar != null) {
                xgnVar.w(new xgj(jjvVar.a.h, (amud) null), null);
            }
            aqjv aqjvVar = jjvVar.a;
            alay alayVar = aqjvVar.d;
            if (alayVar == null) {
                alayVar = alay.a;
            }
            Spanned spannedK = ackj.k(null, alayVar, null, false);
            tuk.u(this.c, spannedK);
            if ((aqjvVar.b & 4) != 0) {
                aqjw aqjwVar = aqjvVar.e;
                if (aqjwVar == null) {
                    aqjwVar = aqjw.a;
                }
                if (((aqjwVar.b == 93269998 ? (anky) aqjwVar.c : anky.a).b & 1) != 0) {
                    adia adiaVar = this.f;
                    aqjw aqjwVar2 = aqjvVar.e;
                    if (aqjwVar2 == null) {
                        aqjwVar2 = aqjw.a;
                    }
                    aqmh aqmhVar = (aqjwVar2.b == 93269998 ? (anky) aqjwVar2.c : anky.a).c;
                    if (aqmhVar == null) {
                        aqmhVar = aqmh.a;
                    }
                    adiaVar.f(aqmhVar, null);
                }
            }
            a().setOnClickListener(this);
            ImageView imageView = this.d;
            if (imageView != null) {
                imageView.setImageResource(this.g.a(aliz.CHECK));
            }
            d(jjvVar.b, spannedK);
            this.a.e(adlyVar);
            jjp jjpVar = jjvVar.g;
            if (jjpVar != null) {
                jjpVar.g(jjvVar);
                adbm adbmVar = jjpVar.d;
                Object obj2 = adbmVar.a;
                if (((int) Collection.EL.stream(((jjp) adbmVar.c).c).filter(new iui(13)).count()) <= ((aqjx) adbmVar.b).g) {
                    ((jjm) obj2).n(false);
                }
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        xgn xgnVar;
        jjv jjvVar;
        jjv jjvVar2 = this.h;
        if (jjvVar2 != null) {
            jjvVar2.d.onClick(view);
            jjv jjvVar3 = this.h;
            boolean z = jjvVar3.b;
            alay alayVar = jjvVar3.a.d;
            if (alayVar == null) {
                alayVar = alay.a;
            }
            d(z, ackj.k(null, alayVar, null, false));
            a().sendAccessibilityEvent(32);
            adly adlyVar = this.i;
            if (adlyVar == null || (xgnVar = adlyVar.b) == null || (jjvVar = this.h) == null) {
                return;
            }
            aqjv aqjvVar = jjvVar.a;
            if ((aqjvVar.b & 64) != 0) {
                xgnVar.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(aqjvVar.h, (amud) null), null);
            }
        }
    }
}
