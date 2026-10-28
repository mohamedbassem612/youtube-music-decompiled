package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rli implements adma {
    private final View a;
    private final TextView b;
    private final ImageView c;
    private final boolean d;

    public rli(Context context, rpt rptVar, boolean z) {
        View viewInflate;
        this.d = z;
        if (z) {
            viewInflate = LayoutInflater.from(context).inflate(R.layout.general_account_footer_layout, (ViewGroup) null);
            this.a = viewInflate;
            this.b = (TextView) viewInflate.findViewById(R.id.footer_text);
            this.c = (ImageView) viewInflate.findViewById(R.id.footer_icon);
            bac.p(viewInflate, new ttb());
        } else {
            viewInflate = LayoutInflater.from(context).inflate(R.layout.fusion_add_account_item, (ViewGroup) null);
            this.a = viewInflate;
            TextView textView = (TextView) viewInflate.findViewById(R.id.name);
            this.b = textView;
            this.c = null;
            bac.p(textView, new ttb());
        }
        viewInflate.setOnClickListener(new jjc(rptVar, 18));
    }

    @Override // defpackage.adma
    public final View a() {
        return this.a;
    }

    @Override // defpackage.adma
    public final /* bridge */ /* synthetic */ void hU(adly adlyVar, Object obj) {
        ImageView imageView;
        this.b.setText(R.string.account_switcher_add_account);
        if (!this.d || (imageView = this.c) == null) {
            return;
        }
        imageView.setImageResource(R.drawable.yt_outline_experimental_person_add_black_24);
        imageView.setVisibility(0);
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
    }
}
