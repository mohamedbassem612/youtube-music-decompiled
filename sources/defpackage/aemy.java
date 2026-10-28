package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aemy implements adma {
    public final View a;
    private final TextView b;
    private final TextView c;
    private final TextView d;

    public aemy(Context context) {
        View viewInflate = View.inflate(context, R.layout.share_start_time_with_context, null);
        this.a = viewInflate;
        this.b = (TextView) viewInflate.findViewById(R.id.startAt);
        this.c = (TextView) viewInflate.findViewById(R.id.startTime);
        this.d = (TextView) viewInflate.findViewById(R.id.contextDescription);
    }

    @Override // defpackage.adma
    public final View a() {
        return this.a;
    }

    public final void d(aqsr aqsrVar) {
        int i = aqsrVar.b;
        if ((i & 1) == 0 || (i & 2) == 0 || (i & 4) == 0) {
            return;
        }
        TextView textView = this.b;
        alay alayVar = aqsrVar.c;
        if (alayVar == null) {
            alayVar = alay.a;
        }
        textView.setText(ackj.k(null, alayVar, null, false));
        TextView textView2 = this.c;
        alay alayVar2 = aqsrVar.d;
        if (alayVar2 == null) {
            alayVar2 = alay.a;
        }
        textView2.setText(ackj.k(null, alayVar2, null, false));
        TextView textView3 = this.d;
        alay alayVar3 = aqsrVar.e;
        if (alayVar3 == null) {
            alayVar3 = alay.a;
        }
        textView3.setText(ackj.k(null, alayVar3, null, false));
    }

    @Override // defpackage.adma
    public final /* bridge */ /* synthetic */ void hU(adly adlyVar, Object obj) {
        d((aqsr) obj);
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
    }
}
