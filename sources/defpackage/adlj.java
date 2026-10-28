package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.Space;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adlj implements adma {
    private final Context a;
    private final vxe b;
    private View c;
    private final elq d;

    public adlj(Context context, vxe vxeVar, elq elqVar) {
        context.getClass();
        this.a = context;
        this.b = vxeVar;
        this.d = elqVar;
    }

    @Override // defpackage.adma
    public final View a() {
        if (this.c == null) {
            this.c = new Space(this.a);
        }
        return this.c;
    }

    @Override // defpackage.adma
    public final /* synthetic */ void hU(adly adlyVar, Object obj) {
        akfy akfyVar = (akfy) obj;
        adlyVar.b.w(new xgj(akfyVar.b, (amud) null), null);
        elq elqVar = this.d;
        if (elqVar.B(akfyVar)) {
            return;
        }
        elqVar.A(akfyVar);
        yno.ez(this.b, akfyVar.c, akfyVar);
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
    }
}
