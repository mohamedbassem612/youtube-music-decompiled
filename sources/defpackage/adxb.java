package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adxb implements View.OnClickListener {
    public final mx a;
    public final xgn b;
    public adxa c;
    boolean d;
    private final Context e;
    private final View f;
    private final advb g;
    private final admu h;
    private final aeeu i;
    private final aeda j;
    private final lqa k;
    private final ci l;

    public adxb(Context context, advb advbVar, ci ciVar, View view, aeeu aeeuVar, xgn xgnVar, lqa lqaVar, tbt tbtVar, admu admuVar, mx mxVar, aeda aedaVar) {
        this.e = context;
        this.g = advbVar;
        this.f = view;
        this.i = aeeuVar;
        this.b = xgnVar;
        this.k = lqaVar;
        this.l = ciVar;
        this.h = admuVar;
        this.a = mxVar;
        this.j = aedaVar;
        view.setVisibility(8);
        if (tbtVar != null) {
            tbtVar.f(this);
        }
    }

    public final void a(aqaw aqawVar) {
        String str;
        mx mxVar = this.a;
        mxVar.k();
        admu admuVar = this.h;
        admuVar.clear();
        View view = this.f;
        view.setTag(R.id.sort_menu_anchor_model, aqawVar);
        if (aqawVar == null || aqawVar.c.size() <= 0) {
            view.setVisibility(8);
            return;
        }
        if (!this.d) {
            this.d = true;
            Context context = this.e;
            mxVar.f = (int) context.getResources().getDimension(R.dimen.sort_menu_width);
            mxVar.z();
            if (this.j.f()) {
                mxVar.f(new ColorDrawable(tzk.i(context, R.attr.ytMenuBackground)));
            }
            view.setOnClickListener(this);
            this.k.Q();
        }
        adln adlnVarAi = this.l.ai((admh) this.g.io());
        adlnVarAi.h(admuVar);
        adlnVarAi.jR(new adwz(this, aqawVar, 0));
        mxVar.e(adlnVarAi);
        view.setVisibility(0);
        if ((aqawVar.b & 8) != 0) {
            aiqe aiqeVar = aqawVar.d;
            if (aiqeVar == null) {
                aiqeVar = aiqe.a;
            }
            aiqd aiqdVar = aiqeVar.c;
            if (aiqdVar == null) {
                aiqdVar = aiqd.a;
            }
            str = aiqdVar.c;
        } else {
            str = null;
        }
        view.setContentDescription(str);
        alhs alhsVar = aqawVar.e;
        if (alhsVar == null) {
            alhsVar = alhs.a;
        }
        if (alhsVar.b == 102716411) {
            aeeu aeeuVar = this.i;
            alhs alhsVar2 = aqawVar.e;
            if (alhsVar2 == null) {
                alhsVar2 = alhs.a;
            }
            aeeuVar.b(alhsVar2.b == 102716411 ? (alhq) alhsVar2.c : alhq.a, view, aqawVar, this.b);
        }
    }

    @tcc
    public void handleCommentsStreamReloadEvent(adtd adtdVar) {
        ajzv ajzvVar = (ajzv) adtdVar.e;
        if ((ajzvVar.c & 16) == 0 || !ajzvVar.h) {
            return;
        }
        adxa adxaVar = this.c;
        ajzw ajzwVar = ajzvVar.d;
        if (ajzwVar == null) {
            ajzwVar = ajzw.a;
        }
        apho aphoVar = ajzwVar.c;
        if (aphoVar == null) {
            aphoVar = apho.a;
        }
        adxaVar.a(aawb.ae(aphoVar));
        aqaw aqawVar = (aqaw) this.f.getTag(R.id.sort_menu_anchor_model);
        if (aqawVar != null) {
            this.a.w(0);
            int i = 0;
            while (i < aqawVar.c.size()) {
                this.k.R((aqav) aqawVar.c.get(i), i == 0);
                i++;
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        admu admuVar = this.h;
        admuVar.clear();
        View view2 = this.f;
        aqaw aqawVar = (aqaw) view2.getTag(R.id.sort_menu_anchor_model);
        if (aqawVar != null) {
            int i = -1;
            for (int i2 = 0; i2 < aqawVar.c.size(); i2++) {
                aqav aqavVar = (aqav) aqawVar.c.get(i2);
                admuVar.add(aqavVar);
                if (true == aqavVar.f) {
                    i = i2;
                }
            }
            mx mxVar = this.a;
            mxVar.j = 8388661;
            mxVar.k = view2;
            mxVar.s();
            if (i > 0) {
                mxVar.w(i);
            }
        }
    }
}
