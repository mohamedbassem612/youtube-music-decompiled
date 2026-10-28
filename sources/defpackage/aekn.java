package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.text.Spanned;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aekn {
    public final int[] a;
    public vxe b;
    public final aekm c;
    public final aekm d;
    private final SharedPreferences e;
    private final Set f;
    private final Handler g;
    private final Rect h;
    private addn i;

    public aekn(SharedPreferences sharedPreferences, Handler handler, Context context) {
        sharedPreferences.getClass();
        this.e = sharedPreferences;
        handler.getClass();
        this.g = handler;
        this.f = new HashSet();
        this.h = new Rect();
        this.a = new int[2];
        this.c = new aekm(tzk.n(context, R.attr.ytThemedBlue).orElse(R.color.yt_dark_blue), R.drawable.tooltip_button_background);
        this.d = new aekm(tzk.n(context, R.attr.ytTextPrimaryInverse).orElse(R.color.yt_white1), 0);
    }

    private final void d(alhq alhqVar, Object obj) {
        this.f.add(new Pair(alhqVar, obj));
        SharedPreferences sharedPreferences = this.e;
        String strF = f(alhqVar);
        sharedPreferences.edit().putLong(strF, sharedPreferences.getLong(strF, 0L) + 1).apply();
        if (this.b == null || alhqVar.j.size() == 0) {
            return;
        }
        HashMap map = new HashMap();
        map.put("com.google.android.libraries.youtube.innertube.endpoint.tag", alhqVar);
        Iterator it = alhqVar.j.iterator();
        while (it.hasNext()) {
            this.b.c((ajwo) it.next(), map);
        }
    }

    private final aekm e(alhl alhlVar) {
        if (alhlVar != null) {
            int iBc = a.bc(alhlVar.b);
            if (iBc == 0) {
                iBc = 1;
            }
            int i = iBc - 1;
            if (i == 1) {
                return this.c;
            }
            if (i == 2) {
                return this.d;
            }
        }
        return null;
    }

    private static final String f(alhq alhqVar) {
        return "hint_id_prefix".concat(String.valueOf(alhqVar.c));
    }

    public final boolean a(View view) {
        return view.getGlobalVisibleRect(this.h);
    }

    public final void b(alhq alhqVar, View view, Object obj, vxe vxeVar) {
        this.b = vxeVar;
        if (a(view)) {
            c(alhqVar, view, obj);
        } else {
            view.addOnLayoutChangeListener(new aekk(this, view, alhqVar, obj));
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00b1  */
    public final void c(alhq alhqVar, View view, Object obj) {
        long j;
        alhj alhjVar;
        int i;
        alay alayVar;
        alay alayVar2;
        aekm aekmVarE;
        aems aemsVar;
        Spanned spannedK;
        aems aemsVar2;
        Spanned spannedK2;
        aekm aekmVarE2;
        addn addnVar;
        alay alayVar3;
        alay alayVar4;
        aekn aeknVar;
        int iAV;
        int iAV2;
        alhq alhqVar2 = alhqVar;
        addn addnVar2 = this.i;
        int i2 = 1;
        boolean z = addnVar2 == null || !addnVar2.e();
        if ((alhqVar2.b & 16) != 0) {
            alhp alhpVar = alhqVar2.g;
            if (alhpVar == null) {
                alhpVar = alhp.a;
            }
            j = alhpVar.d;
        } else {
            j = 0;
        }
        if (!z || this.f.contains(new Pair(alhqVar2, obj)) || this.e.getLong(f(alhqVar2), 0L) >= j) {
            return;
        }
        alhn alhnVar = alhqVar2.d;
        if (alhnVar == null) {
            alhnVar = alhn.a;
        }
        if (alhnVar.b == 106514900) {
            alhn alhnVar2 = alhqVar2.d;
            if (alhnVar2 == null) {
                alhnVar2 = alhn.a;
            }
            if ((alhnVar2.b == 106514900 ? (alhj) alhnVar2.c : alhj.a).e) {
                if ((alhqVar2.b & 2) != 0) {
                    alhn alhnVar3 = alhqVar2.d;
                    if (alhnVar3 == null) {
                        alhnVar3 = alhn.a;
                    }
                    alhjVar = alhnVar3.b == 106514900 ? (alhj) alhnVar3.c : alhj.a;
                } else {
                    alhjVar = null;
                }
                if (alhjVar == null) {
                    addnVar = null;
                } else {
                    alhr alhrVar = alhqVar2.h;
                    if (alhrVar == null) {
                        alhrVar = alhr.a;
                    }
                    if (alhrVar == null) {
                        i = 1;
                    } else {
                        int iBh = a.bh(alhrVar.c);
                        if (iBh == 0) {
                            iBh = 1;
                        }
                        int i3 = iBh - 1;
                        if (i3 == 1) {
                            i = 1;
                        } else if (i3 == 3) {
                            i = 3;
                        } else if (i3 == 4) {
                            i = 4;
                        } else if (i3 == 7 || i3 == 8) {
                            i = 1;
                        } else {
                            i = 2;
                        }
                    }
                    if ((alhjVar.b & 2) != 0) {
                        alayVar = alhjVar.f;
                        if (alayVar == null) {
                            alayVar = alay.a;
                        }
                    } else {
                        alayVar = null;
                    }
                    Spanned spannedK3 = ackj.k(null, alayVar, null, false);
                    if ((alhjVar.b & 4) != 0) {
                        alayVar2 = alhjVar.g;
                        if (alayVar2 == null) {
                            alayVar2 = alay.a;
                        }
                    } else {
                        alayVar2 = null;
                    }
                    Spanned spannedK4 = ackj.k(null, alayVar2, null, false);
                    alhi alhiVar = alhjVar.l;
                    if (alhiVar == null) {
                        alhiVar = alhi.a;
                    }
                    if (alhiVar.b == 47244396) {
                        alhi alhiVar2 = alhjVar.l;
                        if (alhiVar2 == null) {
                            alhiVar2 = alhi.a;
                        }
                        alhk alhkVar = alhiVar2.b == 47244396 ? (alhk) alhiVar2.c : alhk.a;
                        if ((alhkVar.b & 8) != 0) {
                            alayVar4 = alhkVar.f;
                            if (alayVar4 == null) {
                                alayVar4 = alay.a;
                            }
                        } else {
                            alayVar4 = null;
                        }
                        spannedK = ackj.k(null, alayVar4, null, false);
                        alhl alhlVar = alhkVar.c;
                        if (alhlVar == null) {
                            alhlVar = alhl.a;
                        }
                        aekmVarE = e(alhlVar);
                        aemsVar = new aems((Object) this, (aihn) alhkVar, i2);
                    } else {
                        aekmVarE = null;
                        aemsVar = null;
                        spannedK = null;
                    }
                    alhi alhiVar3 = alhjVar.k;
                    if ((alhiVar3 == null ? alhi.a : alhiVar3).b == 47244396) {
                        if (alhiVar3 == null) {
                            alhiVar3 = alhi.a;
                        }
                        alhk alhkVar2 = alhiVar3.b == 47244396 ? (alhk) alhiVar3.c : alhk.a;
                        if ((alhkVar2.b & 8) != 0) {
                            alayVar3 = alhkVar2.f;
                            if (alayVar3 == null) {
                                alayVar3 = alay.a;
                            }
                        } else {
                            alayVar3 = null;
                        }
                        spannedK2 = ackj.k(null, alayVar3, null, false);
                        alhl alhlVar2 = alhkVar2.c;
                        if (alhlVar2 == null) {
                            alhlVar2 = alhl.a;
                        }
                        aekmVarE2 = e(alhlVar2);
                        aemsVar2 = new aems((Object) this, (aihn) alhkVar2, 1);
                    } else {
                        aemsVar2 = null;
                        spannedK2 = null;
                        aekmVarE2 = null;
                    }
                    View viewInflate = View.inflate(view.getContext(), R.layout.tooltip_content_view, null);
                    TextView textView = (TextView) viewInflate.findViewById(R.id.tooltip_title);
                    TextView textView2 = (TextView) viewInflate.findViewById(R.id.tooltip_description);
                    TextView textView3 = (TextView) viewInflate.findViewById(R.id.action_button);
                    TextView textView4 = (TextView) viewInflate.findViewById(R.id.dismiss_button);
                    aedi.h(textView3, aekmVarE);
                    aedi.h(textView4, aekmVarE2);
                    tuk.u(textView, spannedK3);
                    tuk.u(textView2, spannedK4);
                    tuk.u(textView3, spannedK);
                    tuk.u(textView4, spannedK2);
                    tuk.k(textView3, textView3.getBackground(), 0);
                    tuk.k(textView4, textView4.getBackground(), 0);
                    if (textView.getVisibility() == 8) {
                        tym.h(textView2, new tyj(0, 2), ViewGroup.MarginLayoutParams.class);
                    }
                    addnVar = new addn(viewInflate, i, view);
                    aedi.j(textView3, aemsVar, addnVar);
                    aedi.j(textView4, aemsVar2, addnVar);
                    float f = alhjVar.j;
                    if (f > 0.0f) {
                        aefh aefhVar = (aefh) addnVar.a;
                        aefhVar.g = f;
                        if (aefhVar.isShown()) {
                            aefhVar.requestLayout();
                        }
                    }
                    alhqVar2 = alhqVar;
                }
                alho alhoVar = alhqVar2.e;
                if (alhoVar == null) {
                    alhoVar = alho.a;
                }
                int i4 = alhqVar2.b & 4;
                boolean z2 = i4 == 0 || (iAV2 = a.aV(alhoVar.b)) == 0 || iAV2 != 3;
                boolean z3 = i4 != 0 && ((iAV = a.aV(alhoVar.b)) == 0 || iAV != 2);
                if (z2) {
                    aefh aefhVar2 = (aefh) addnVar.a;
                    aefhVar2.b = true;
                    aefhVar2.setOnClickListener(new aefn(addnVar, 6, null));
                }
                if (z3) {
                    aeknVar = this;
                    aeknVar.g.postDelayed(new aehz(addnVar, 20), alhqVar2.f);
                } else {
                    aeknVar = this;
                }
                if (addnVar != null) {
                    if (aeknVar.a(view)) {
                        aefh aefhVar3 = (aefh) addnVar.a;
                        aefhVar3.a.setClippingEnabled(false);
                        aefhVar3.a.setAnimationStyle(android.R.style.Animation.Dialog);
                        aefhVar3.a.setBackgroundDrawable(new BitmapDrawable(aefhVar3.e.getResources(), ""));
                        aefhVar3.a.setOutsideTouchable(aefhVar3.b);
                        aefhVar3.a.showAtLocation(aefhVar3.e, 0, 0, 0);
                        view.getLocationOnScreen(aeknVar.a);
                        view.getViewTreeObserver().addOnPreDrawListener(new aekl(aeknVar, addnVar, view));
                    }
                    aeknVar.i = addnVar;
                    aeknVar.d(alhqVar2, obj);
                    return;
                }
                return;
            }
        }
        d(alhqVar2, obj);
    }
}
