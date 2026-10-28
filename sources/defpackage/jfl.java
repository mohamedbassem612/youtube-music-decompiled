package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jfl extends admr {
    private final admd a;
    private final View b;
    private final TextView c;
    private final TextView d;
    private final adia e;
    private final TextView f;
    private final jbm g;

    public jfl(Context context, adhv adhvVar, jij jijVar) {
        context.getClass();
        jdw jdwVar = new jdw(context);
        this.a = jdwVar;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.music_tastebuilder_shelf, (ViewGroup) null);
        this.b = viewInflate;
        this.e = new adia(adhvVar, (ImageView) viewInflate.findViewById(R.id.thumbnail), false);
        TextView textView = (TextView) viewInflate.findViewById(R.id.action_button);
        this.f = textView;
        this.g = jijVar.a(textView, null, null, null, false);
        this.c = (TextView) viewInflate.findViewById(R.id.primary_text);
        this.d = (TextView) viewInflate.findViewById(R.id.secondary_text);
        jdwVar.c(viewInflate);
    }

    @Override // defpackage.adma
    public final View a() {
        return ((jdw) this.a).a;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        this.e.a();
    }

    @Override // defpackage.admr
    public final /* bridge */ /* synthetic */ void d(adly adlyVar, Object obj) {
        alay alayVar;
        alay alayVar2;
        anyb anybVar = (anyb) obj;
        if (!anybVar.g) {
            this.b.setVisibility(8);
            return;
        }
        TextView textView = this.c;
        if ((anybVar.b & 2) != 0) {
            alayVar = anybVar.d;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        tuk.u(textView, ackj.k(null, alayVar, null, false));
        TextView textView2 = this.d;
        if ((anybVar.b & 4) != 0) {
            alayVar2 = anybVar.e;
            if (alayVar2 == null) {
                alayVar2 = alay.a;
            }
        } else {
            alayVar2 = null;
        }
        tuk.u(textView2, ackj.k(null, alayVar2, null, false));
        anya anyaVar = anybVar.f;
        if (anyaVar == null) {
            anyaVar = anya.a;
        }
        int i = anyaVar.b;
        TextView textView3 = this.f;
        if (i == 65153809) {
            textView3.setVisibility(0);
            jbm jbmVar = this.g;
            anya anyaVar2 = anybVar.f;
            if (anyaVar2 == null) {
                anyaVar2 = anya.a;
            }
            jbmVar.hU(adlyVar, anyaVar2.b == 65153809 ? (ajnf) anyaVar2.c : ajnf.a);
        } else {
            textView3.setVisibility(8);
        }
        anyd anydVar = anybVar.c;
        if (anydVar == null) {
            anydVar = anyd.a;
        }
        if (((anydVar.b == 121292682 ? (anyc) anydVar.c : anyc.a).b & 1) != 0) {
            adia adiaVar = this.e;
            anyd anydVar2 = anybVar.c;
            if (anydVar2 == null) {
                anydVar2 = anyd.a;
            }
            aqmh aqmhVar = (anydVar2.b == 121292682 ? (anyc) anydVar2.c : anyc.a).c;
            if (aqmhVar == null) {
                aqmhVar = aqmh.a;
            }
            adiaVar.f(aqmhVar, null);
        }
        this.a.e(adlyVar);
    }

    @Override // defpackage.admr
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((anyb) obj).h.G();
    }
}
