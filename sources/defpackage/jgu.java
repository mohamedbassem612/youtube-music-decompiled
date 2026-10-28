package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jgu implements adma {
    public iwl a;
    private final ViewGroup b;
    private final TextView c;
    private final Context d;
    private final int e;
    private final Drawable f;
    private final avlh g;
    private avmn h;

    public jgu(Context context, avlh avlhVar) {
        ViewGroup viewGroup = (ViewGroup) View.inflate(context, R.layout.text_badge, null);
        this.b = viewGroup;
        TextView textView = (TextView) viewGroup.findViewById(R.id.text);
        this.c = textView;
        this.d = context;
        this.e = textView.getCurrentTextColor();
        this.f = textView.getBackground();
        this.g = avlhVar;
    }

    @Override // defpackage.adma
    public final View a() {
        return this.b;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        TextView textView = this.c;
        textView.setTextColor(this.e);
        textView.setBackground(this.f);
        Object obj = this.h;
        if (obj != null) {
            awka.f((AtomicReference) obj);
            this.h = null;
        }
    }

    @Override // defpackage.adma
    public final /* synthetic */ void hU(adly adlyVar, Object obj) {
        ajkp ajkpVar = (ajkp) obj;
        alay alayVar = ajkpVar.c;
        if (alayVar == null) {
            alayVar = alay.a;
        }
        TextView textView = this.c;
        tuk.u(textView, ackj.k(null, alayVar, null, false));
        int i = ajkpVar.b;
        if ((i & 4) != 0 || (i & 16) != 0) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            Context context = this.d;
            gradientDrawable.setCornerRadius(context.getResources().getDimensionPixelSize(R.dimen.text_badge_corner_radius));
            if ((ajkpVar.b & 16) != 0) {
                gradientDrawable.setStroke(context.getResources().getDimensionPixelSize(R.dimen.text_badge_border_width), ajkpVar.f);
            }
            if ((ajkpVar.b & 4) != 0) {
                gradientDrawable.setColor(ajkpVar.d);
            }
            tym.Z(textView, gradientDrawable);
        }
        avmn avmnVar = this.h;
        if (avmnVar == null || avmnVar.f()) {
            this.h = this.g.x(new hhw(this, 16)).al(new jgq(this, 3), new jeh(7));
        }
        int i2 = this.e;
        if ((ajkpVar.b & 4) != 0 && this.a != null && adlyVar != null && adlyVar.j("isPlayerPage")) {
            i2 = this.a.f.b;
        } else if ((ajkpVar.b & 8) != 0) {
            i2 = ajkpVar.e;
        }
        textView.setTextColor(i2);
    }
}
