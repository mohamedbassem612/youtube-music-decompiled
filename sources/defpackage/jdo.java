package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jdo extends admr {
    private final admd a;
    private final admh b;
    private final ViewGroup c;
    private final ViewGroup d;
    private final View e;

    public jdo(Context context, admh admhVar) {
        this.b = admhVar;
        jdw jdwVar = new jdw(context);
        this.a = jdwVar;
        View viewInflate = View.inflate(context, R.layout.music_footer, null);
        this.e = viewInflate;
        this.c = (ViewGroup) viewInflate.findViewById(R.id.cancel_button_container);
        this.d = (ViewGroup) viewInflate.findViewById(R.id.action_button_container);
        jdwVar.c(viewInflate);
    }

    @Override // defpackage.adma
    public final View a() {
        return ((jdw) this.a).a;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        this.e.setVisibility(8);
        ViewGroup viewGroup = this.c;
        viewGroup.setVisibility(8);
        ViewGroup viewGroup2 = this.d;
        viewGroup2.setVisibility(8);
        kro.X(viewGroup, admhVar);
        kro.X(viewGroup2, admhVar);
    }

    @Override // defpackage.admr
    public final /* bridge */ /* synthetic */ void d(adly adlyVar, Object obj) {
        apji apjiVar;
        anol anolVar = (anol) obj;
        apji apjiVar2 = null;
        if ((anolVar.b & 1) != 0) {
            apjiVar = anolVar.c;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
        } else {
            apjiVar = null;
        }
        Optional optionalH = kro.H(apjiVar, ajnp.a);
        if (optionalH.isPresent()) {
            this.e.setVisibility(0);
            ViewGroup viewGroup = this.c;
            viewGroup.setVisibility(0);
            kro.P((ajnf) optionalH.get(), viewGroup, this.b, adlyVar);
        }
        if ((anolVar.b & 2) != 0 && (apjiVar2 = anolVar.d) == null) {
            apjiVar2 = apji.a;
        }
        Optional optionalH2 = kro.H(apjiVar2, ajnp.a);
        if (optionalH2.isPresent()) {
            this.e.setVisibility(0);
            ViewGroup viewGroup2 = this.d;
            viewGroup2.setVisibility(0);
            kro.P((ajnf) optionalH2.get(), viewGroup2, this.b, adlyVar);
        }
        this.a.e(adlyVar);
    }

    @Override // defpackage.admr
    public final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return null;
    }
}
