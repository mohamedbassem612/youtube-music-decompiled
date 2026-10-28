package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class jbi extends admr {
    public final TextView a;
    public final View b;
    public Object c;
    public ioc d;
    private final Context e;
    private final aduv f;
    private final ImageView g;
    private final ImageView h;

    public jbi(Context context, aduv aduvVar, adxj adxjVar) {
        this.e = context;
        this.f = aduvVar;
        View viewInflate = View.inflate(context, R.layout.search_suggestion_entry, null);
        this.b = viewInflate;
        viewInflate.setLayoutParams(new nq(-1, context.getResources().getDimensionPixelSize(R.dimen.search_entry_height)));
        viewInflate.setOnClickListener(new ivp(this, 10));
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.edit_suggestion);
        this.h = imageView;
        imageView.setImageResource(adxjVar.b(arqz.eF));
        imageView.setOnClickListener(new ivp(this, 11));
        this.a = (TextView) viewInflate.findViewById(R.id.text);
        this.g = (ImageView) viewInflate.findViewById(R.id.search_type_icon);
    }

    @Override // defpackage.adma
    public final View a() {
        return this.b;
    }

    @Override // defpackage.adma
    public void b(admh admhVar) {
        kro.Z(this.b, 0, 0);
        this.d = null;
    }

    @Override // defpackage.admr
    public void d(adly adlyVar, Object obj) {
        aliz alizVarA;
        this.c = obj;
        this.d = (ioc) adlyVar.c("actionButtonOnClickListener");
        TextView textView = this.a;
        Spanned spannedF = f(obj);
        textView.setText(spannedF);
        this.h.setContentDescription(this.e.getString(R.string.accessibility_search_edit_suggestion, spannedF));
        alja aljaVarG = g(obj);
        if (aljaVarG == null || (alizVarA = aliz.a(aljaVarG.c)) == null) {
            alizVarA = aliz.UNKNOWN;
        }
        this.g.setImageResource(this.f.a(alizVarA));
        kro.T(this.b, adlyVar);
    }

    public abstract Spanned f(Object obj);

    protected abstract alja g(Object obj);
}
