package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class wzu implements adma {
    protected final View a;
    public final vxe b;
    public final xgn c;
    private final TextView d = g();
    private final TextView e = f();
    private final ImageView f;
    private final adia g;

    public wzu(Context context, adhv adhvVar, vxe vxeVar, xgm xgmVar) {
        this.b = vxeVar;
        this.c = xgmVar.hB();
        this.a = LayoutInflater.from(context).inflate(d(), (ViewGroup) null);
        ImageView imageViewE = e();
        this.f = imageViewE;
        this.g = new adia(adhvVar, imageViewE, false);
    }

    @Override // defpackage.adma
    public final View a() {
        return this.a;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        this.d.setText((CharSequence) null);
        this.e.setText((CharSequence) null);
        this.a.setOnClickListener(null);
        this.g.a();
    }

    protected abstract int d();

    protected abstract ImageView e();

    protected abstract TextView f();

    protected abstract TextView g();

    @Override // defpackage.adma
    public final /* bridge */ /* synthetic */ void hU(adly adlyVar, Object obj) {
        amov amovVar = (amov) obj;
        alay alayVar = amovVar.d;
        if (alayVar == null) {
            alayVar = alay.a;
        }
        tuk.u(this.d, ackj.k(null, alayVar, null, false));
        TextView textView = this.e;
        alay alayVar2 = amovVar.e;
        if (alayVar2 == null) {
            alayVar2 = alay.a;
        }
        tuk.u(textView, ackj.k(null, alayVar2, null, false));
        if ((amovVar.b & SemanticState.Focused) != 0) {
            adia adiaVar = this.g;
            aqmh aqmhVar = amovVar.f;
            if (aqmhVar == null) {
                aqmhVar = aqmh.a;
            }
            adiaVar.f(aqmhVar, null);
        }
        xgj xgjVar = new xgj(xhb.b(75300));
        this.c.l(xgjVar);
        if ((amovVar.b & SemanticState.Modal) == 0 || this.b == null) {
            return;
        }
        this.a.setOnClickListener(new ivx(this, amovVar, xgjVar, 14, (int[]) null));
    }
}
