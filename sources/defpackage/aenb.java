package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aenb implements adma {
    public ajwo a;
    private final aduv b;
    private final View c;
    private final ImageView d;
    private final TextView e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;

    public aenb(Context context, aekv aekvVar, aduv aduvVar, vxe vxeVar) {
        this.b = aduvVar;
        View viewInflate = View.inflate(context, R.layout.sharing_option_button, null);
        this.c = viewInflate;
        this.d = (ImageView) viewInflate.findViewById(R.id.icon);
        this.e = (TextView) viewInflate.findViewById(R.id.text);
        viewInflate.setOnClickListener(new aena(this, vxeVar, aekvVar, 0));
        this.f = context.getResources().getDimensionPixelSize(R.dimen.share_panel_options_container_top_padding);
        this.g = context.getResources().getDimensionPixelSize(R.dimen.share_panel_options_container_bottom_padding);
        this.h = context.getResources().getDimensionPixelSize(R.dimen.share_panel_options_container_right_padding);
        this.i = context.getResources().getDimensionPixelSize(R.dimen.share_panel_options_container_left_padding);
        this.j = context.getResources().getDimensionPixelSize(R.dimen.share_panel_options_container_first_item_top_padding);
        this.k = context.getResources().getDimensionPixelSize(R.dimen.share_panel_options_container_last_item_bottom_padding);
    }

    @Override // defpackage.adma
    public final View a() {
        return this.c;
    }

    @Override // defpackage.adma
    public final /* bridge */ /* synthetic */ void hU(adly adlyVar, Object obj) {
        aliz alizVarA;
        alay alayVar;
        ajnf ajnfVar = (ajnf) obj;
        boolean zJ = adlyVar.j("isFirstItem");
        boolean zJ2 = adlyVar.j("isLastItem");
        if (zJ) {
            this.c.setPadding(this.h, this.j, this.i, this.f);
        } else {
            View view = this.c;
            if (zJ2) {
                view.setPadding(this.h, this.g, this.i, this.k);
            } else {
                view.setPadding(this.h, this.g, this.i, this.f);
            }
        }
        aduv aduvVar = this.b;
        int i = ajnfVar.e;
        if (i == 8) {
            alizVarA = aliz.a((i == 8 ? (alja) ajnfVar.f : alja.a).c);
            if (alizVarA == null) {
                alizVarA = aliz.UNKNOWN;
            }
        } else {
            alizVarA = aliz.UNKNOWN;
        }
        int iA = aduvVar.a(alizVarA);
        if (iA != 0) {
            this.d.setImageResource(iA);
        }
        TextView textView = this.e;
        if ((ajnfVar.b & 64) != 0) {
            alayVar = ajnfVar.m;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        textView.setText(ackj.k(null, alayVar, null, false));
        ajwo ajwoVar = ajnfVar.s;
        if (ajwoVar == null) {
            ajwoVar = ajwo.a;
        }
        this.a = ajwoVar;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
    }
}
