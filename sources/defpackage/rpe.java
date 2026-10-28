package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rpe implements adma {
    private final /* synthetic */ int $cid;
    public final View a;
    public wnr b;
    private final TextView c;
    private final TextView d;
    private final Resources e;
    private final ttm f;

    public rpe(Context context, ttm ttmVar, rpr rprVar, int i) {
        this.$cid = i;
        this.f = ttmVar;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        View viewInflate = layoutInflaterFrom.inflate(R.layout.account_item, (ViewGroup) null);
        this.a = viewInflate;
        this.e = layoutInflaterFrom.getContext().getResources();
        TextView textView = (TextView) viewInflate.findViewById(R.id.name);
        this.c = textView;
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.byline);
        this.d = textView2;
        Drawable drawable = context.getDrawable(R.drawable.account_switcher_alert);
        drawable.getClass();
        Drawable drawableMutate = drawable.mutate();
        Optional optionalL = tzk.l(context, R.attr.ytTextPrimary);
        textView.getClass();
        int i2 = 9;
        textView.setTextColor((ColorStateList) (true != optionalL.isPresent() ? ((TextView) new hly(textView, i2).a).getTextColors() : optionalL.get()));
        Optional optionalL2 = tzk.l(context, R.attr.ytTextSecondary);
        textView2.getClass();
        textView2.setTextColor((ColorStateList) (true != optionalL2.isPresent() ? ((TextView) new hly(textView2, i2).a).getTextColors() : optionalL2.get()));
        drawableMutate.setTint(tzk.n(context, R.attr.ytIconInactive).orElse(-7829368));
        drawableMutate.setTintMode(PorterDuff.Mode.SRC_IN);
        ((ImageView) viewInflate.findViewById(R.id.thumbnail)).setImageDrawable(drawableMutate);
        viewInflate.setOnClickListener(new jip(this, rprVar, 10, (byte[]) null));
    }

    @Override // defpackage.adma
    public final View a() {
        return this.a;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        if (this.$cid != 0) {
            this.b = null;
        }
    }

    @Override // defpackage.adma
    public final /* synthetic */ void hU(adly adlyVar, Object obj) {
        if (this.$cid != 0) {
            wnr wnrVar = (wnr) obj;
            this.b = wnrVar;
            if (!wnrVar.a()) {
                Throwable th = wnrVar.b;
                this.c.setText(th != null ? this.f.b(th) : this.e.getString(R.string.account_switcher_error_general_title));
                this.d.setText(this.e.getString(R.string.account_switcher_error_general_byline));
                return;
            } else {
                TextView textView = this.c;
                Resources resources = this.e;
                textView.setText(resources.getString(R.string.account_switcher_error_credentials_title));
                this.d.setText(resources.getString(R.string.account_switcher_error_credentials_byline));
                return;
            }
        }
        wnr wnrVar2 = (wnr) obj;
        this.b = wnrVar2;
        if (!wnrVar2.a()) {
            Throwable th2 = wnrVar2.b;
            this.c.setText(th2 != null ? this.f.b(th2) : this.e.getString(R.string.account_switcher_error_general_title));
            this.d.setText(this.e.getString(R.string.account_switcher_error_general_byline));
        } else {
            TextView textView2 = this.c;
            Resources resources2 = this.e;
            textView2.setText(resources2.getString(R.string.account_switcher_error_credentials_title));
            this.d.setText(resources2.getString(R.string.account_switcher_error_credentials_byline));
        }
    }

    public rpe(Context context, ttm ttmVar, int i) {
        this.$cid = i;
        this.f = ttmVar;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.account_list_item, (ViewGroup) null);
        this.a = viewInflate;
        this.e = context.getResources();
        this.c = (TextView) viewInflate.findViewById(R.id.name);
        this.d = (TextView) viewInflate.findViewById(R.id.byline);
        ((ImageView) viewInflate.findViewById(R.id.thumbnail)).setImageResource(R.drawable.account_switcher_alert);
    }
}
