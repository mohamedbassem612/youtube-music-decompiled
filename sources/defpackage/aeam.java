package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aeam implements adma {
    public final Handler a;
    public final ViewGroup b;
    public final Runnable c = new acqu(this, 14);
    public aeal d;
    public EditText e;
    private final Context f;
    private final xgn g;
    private final LinearLayout h;
    private final ImageView i;
    private final ImageView j;
    private adkv k;
    private final aeiv l;

    public aeam(Context context, xgn xgnVar, Handler handler, aeiv aeivVar, ViewGroup viewGroup) {
        this.f = context;
        this.g = xgnVar;
        this.a = handler;
        this.b = viewGroup;
        this.l = aeivVar;
        this.h = (LinearLayout) viewGroup.findViewById(R.id.emoji_category_container);
        this.i = (ImageView) viewGroup.findViewById(R.id.keyboard_button);
        this.j = (ImageView) viewGroup.findViewById(R.id.backspace_button);
    }

    private final void e(aktk aktkVar, adly adlyVar) {
        adkv adkvVar = this.k;
        adly adlyVarB = adkvVar.b(adlyVar);
        LinearLayout linearLayout = this.h;
        linearLayout.addView(adkvVar.d(adlyVarB, aktkVar, linearLayout), new ViewGroup.LayoutParams(-1, -2));
    }

    @Override // defpackage.adma
    public final View a() {
        return this.b;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        adkv adkvVar = this.k;
        if (adkvVar != null) {
            adkvVar.c(this.b);
        }
        this.h.removeAllViews();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0050  */
    /* JADX WARN: Code duplicated, block: B:15:0x0056  */
    /* JADX WARN: Code duplicated, block: B:16:0x0062  */
    /* JADX WARN: Code duplicated, block: B:18:0x0068  */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.adma
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void hU(adly adlyVar, aktm aktmVar) {
        xgj xgjVar;
        aipe aipeVar;
        LinearLayout linearLayout = this.h;
        linearLayout.removeAllViews();
        this.i.setOnClickListener(new yde(this, 20));
        this.j.setOnTouchListener(new jjx(this, 2));
        this.k = new aeak(this.f, (admh) adlyVar.c("VIEW_POOL_KEY"));
        xgn xgnVar = this.g;
        adlyVar.a(xgnVar);
        if ((aktmVar.b & 16384) != 0 && !aktmVar.e.E()) {
            if ((aktmVar.b & 16384) != 0) {
                xgjVar = new xgj(aktmVar.e.G());
            } else {
                aipeVar = aktmVar.d;
                if (aipeVar == null) {
                    aipeVar = aipe.a;
                }
                xgjVar = new xgj(xhb.b(aipeVar.b));
            }
            xgnVar.l(xgjVar);
        } else if ((aktmVar.b & SemanticState.Multiline) != 0) {
            aipe aipeVar2 = aktmVar.d;
            if (aipeVar2 == null) {
                aipeVar2 = aipe.a;
            }
            if (aipeVar2.b != 0) {
                if ((aktmVar.b & 16384) != 0) {
                    xgjVar = new xgj(aktmVar.e.G());
                } else {
                    aipeVar = aktmVar.d;
                    if (aipeVar == null) {
                        aipeVar = aipe.a;
                    }
                    xgjVar = new xgj(xhb.b(aipeVar.b));
                }
                xgnVar.l(xgjVar);
            }
        }
        for (aktl aktlVar : aktmVar.c) {
            int i = aktlVar.b;
            if (i == 126326585) {
                e(i == 126326585 ? (aktk) aktlVar.c : aktk.a, adlyVar);
            }
            int i2 = aktlVar.b;
            if (i2 == 171549018) {
                akto aktoVar = i2 == 171549018 ? (akto) aktlVar.c : akto.a;
                Iterator it = aktoVar.e.iterator();
                long j = 0;
                while (it.hasNext()) {
                    aktj aktjVar = (aktj) this.l.a.get((String) it.next());
                    if (aktjVar == null || !aktjVar.h) {
                        j++;
                    }
                }
                if (j < aktoVar.e.size()) {
                    adkv adkvVar = this.k;
                    linearLayout.addView(adkvVar.d(adkvVar.b(adlyVar), aktoVar, linearLayout), new ViewGroup.LayoutParams(-1, -2));
                } else {
                    aihf aihfVarCreateBuilder = aktk.a.createBuilder();
                    String str = aktoVar.c;
                    aihfVarCreateBuilder.copyOnWrite();
                    aktk aktkVar = (aktk) aihfVarCreateBuilder.instance;
                    str.getClass();
                    aktkVar.b |= 1;
                    aktkVar.c = str;
                    alay alayVar = aktoVar.d;
                    if (alayVar == null) {
                        alayVar = alay.a;
                    }
                    aihfVarCreateBuilder.copyOnWrite();
                    aktk aktkVar2 = (aktk) aihfVarCreateBuilder.instance;
                    alayVar.getClass();
                    aktkVar2.d = alayVar;
                    aktkVar2.b |= 2;
                    aiie aiieVar = aktoVar.e;
                    aihfVarCreateBuilder.copyOnWrite();
                    aktk aktkVar3 = (aktk) aihfVarCreateBuilder.instance;
                    aiie aiieVar2 = aktkVar3.e;
                    if (!aiieVar2.c()) {
                        aktkVar3.e = aihn.mutableCopy(aiieVar2);
                    }
                    aifs.addAll(aiieVar, aktkVar3.e);
                    aipe aipeVar3 = aktoVar.g;
                    if (aipeVar3 == null) {
                        aipeVar3 = aipe.a;
                    }
                    aihfVarCreateBuilder.copyOnWrite();
                    aktk aktkVar4 = (aktk) aihfVarCreateBuilder.instance;
                    aipeVar3.getClass();
                    aktkVar4.f = aipeVar3;
                    aktkVar4.b |= 32;
                    aigj aigjVar = aktoVar.h;
                    aihfVarCreateBuilder.copyOnWrite();
                    aktk aktkVar5 = (aktk) aihfVarCreateBuilder.instance;
                    aigjVar.getClass();
                    aktkVar5.b |= 64;
                    aktkVar5.g = aigjVar;
                    e((aktk) aihfVarCreateBuilder.build(), adlyVar);
                }
            }
        }
    }
}
