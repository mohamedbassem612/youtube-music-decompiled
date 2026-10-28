package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class iyr implements View.OnClickListener {
    public boolean a;
    private final Context b;
    private final tts c;
    private final vxe d;
    private final avlh e;
    private avmn f;
    private final TextView g;
    private final TextView h;
    private final View i;
    private final TextView j;
    private aqen k;
    private final tfq l;

    public iyr(Activity activity, tfq tfqVar, tts ttsVar, vxe vxeVar, avlh avlhVar, View view, TextView textView, TextView textView2, TextView textView3) {
        this.i = view;
        this.g = textView;
        this.b = activity;
        this.l = tfqVar;
        this.c = ttsVar;
        this.d = vxeVar;
        this.e = avlhVar;
        this.h = textView2;
        this.j = textView3;
        if (view != null) {
            view.setOnClickListener(this);
        } else {
            textView.setOnClickListener(this);
        }
        textView.setTypeface(ackm.ROBOTO_MEDIUM.c(activity, 0));
        textView.setAllCaps(false);
        if (textView2 != null) {
            textView2.setAllCaps(false);
        }
    }

    private final void d(int i) {
        this.g.setTextColor(i);
        TextView textView = this.h;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public final void a() {
        this.k = null;
        Object obj = this.f;
        if (obj != null) {
            awka.f((AtomicReference) obj);
            this.f = null;
        }
        this.g.setVisibility(8);
    }

    public final void b(aqen aqenVar) {
        a();
        if (aqenVar.h) {
            this.k = aqenVar;
            this.f = this.e.al(new gkr(this, aqenVar, 13), new ido(14));
            c(aqenVar.g);
        }
    }

    public final void c(boolean z) {
        alay alayVar;
        TextView textView;
        RelativeLayout.LayoutParams layoutParams;
        alay alayVar2;
        aqen aqenVar = this.k;
        if (aqenVar != null) {
            aihf builder = aqenVar.toBuilder();
            builder.copyOnWrite();
            aqen aqenVar2 = (aqen) builder.instance;
            aqenVar2.b |= SemanticState.ReadOnly;
            aqenVar2.g = z;
            this.k = (aqen) builder.build();
            Context context = this.b;
            if (z) {
                d(context.getColor(R.color.unsubscribe_font_color));
                TextView textView2 = this.g;
                aqen aqenVar3 = this.k;
                if (aqenVar3 == null || (aqenVar3.b & 4) == 0) {
                    alayVar2 = null;
                } else {
                    alayVar2 = aqenVar3.d;
                    if (alayVar2 == null) {
                        alayVar2 = alay.a;
                    }
                }
                textView2.setText(ackj.k(null, alayVar2, null, false));
            } else {
                d(context.getColor(R.color.subscribe_font_color));
                TextView textView3 = this.g;
                aqen aqenVar4 = this.k;
                if (aqenVar4 == null || (aqenVar4.b & 8) == 0) {
                    alayVar = null;
                } else {
                    alayVar = aqenVar4.e;
                    if (alayVar == null) {
                        alayVar = alay.a;
                    }
                }
                textView3.setText(ackj.k(null, alayVar, null, false));
            }
            this.g.setVisibility(0);
            View view = this.i;
            if (view == null || (textView = this.j) == null || !this.a || z || textView.getVisibility() != 0 || (layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams()) == null) {
                return;
            }
            layoutParams.setMargins(0, 0, 0, layoutParams.bottomMargin + textView.getHeight());
            view.setLayoutParams(layoutParams);
            textView.setVisibility(8);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ajwo ajwoVar;
        aihl aihlVarCheckIsLite;
        aihl aihlVarCheckIsLite2;
        if (this.k != null) {
            if (!this.l.h()) {
                this.c.a();
                return;
            }
            aqen aqenVar = this.k;
            if (!aqenVar.g) {
                Iterator it = aqenVar.i.iterator();
                do {
                    if (!it.hasNext()) {
                        ajwoVar = null;
                        break;
                    } else {
                        ajwoVar = (ajwo) it.next();
                        aihlVarCheckIsLite = aihn.checkIsLite(aqes.b);
                        ajwoVar.c(aihlVarCheckIsLite);
                    }
                } while (!ajwoVar.j.n(aihlVarCheckIsLite.d));
            } else {
                Iterator it2 = aqenVar.i.iterator();
                do {
                    if (!it2.hasNext()) {
                        ajwoVar = null;
                        break;
                    } else {
                        ajwoVar = (ajwo) it2.next();
                        aihlVarCheckIsLite2 = aihn.checkIsLite(aqyw.b);
                        ajwoVar.c(aihlVarCheckIsLite2);
                    }
                } while (!ajwoVar.j.n(aihlVarCheckIsLite2.d));
            }
            if (ajwoVar != null) {
                this.d.c(ajwoVar, null);
                c(!aqenVar.g);
            }
        }
    }
}
