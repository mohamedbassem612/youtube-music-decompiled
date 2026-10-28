package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.elements.interfaces.ByteStore;
import j$.util.Objects;
import j$.util.Optional;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aefv implements aefj, tur, tuq {
    private static final int h;
    private static final int i;
    public final Set a;
    public final tyx b;
    public View c;
    public tus d;
    public aefs e;
    public aefl f;
    public boolean g;
    private final Rect j = new Rect();
    private final int[] k = new int[2];
    private final ViewTreeObserver.OnGlobalLayoutListener l;
    private boolean m;
    private final aerj n;
    private final abhh o;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        h = 12000;
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        i = 6000;
    }

    public aefv(aerj aerjVar, vxe vxeVar, xgm xgmVar) {
        new ArrayDeque();
        this.m = false;
        this.n = aerjVar;
        this.o = new abhh(vxeVar, xgmVar, (byte[]) null);
        this.a = new CopyOnWriteArraySet();
        this.b = new tyx(Looper.myLooper(), this);
        this.l = new aefu(this, getClass().getSimpleName());
    }

    public static boolean j(aefl aeflVar) {
        View view = aeflVar != null ? aeflVar.c : null;
        return view != null && view.isShown();
    }

    private final Rect n(Rect rect) {
        Rect rect2 = this.j;
        rect2.set(rect);
        View view = this.c;
        if (view != null) {
            view.getLocationInWindow(this.k);
        }
        int[] iArr = this.k;
        rect2.offset(iArr[0], iArr[1]);
        return rect2;
    }

    @Override // defpackage.tur
    public final void a(tup tupVar) {
        aefs aefsVar = this.e;
        if (aefsVar != null) {
            if (!tupVar.c() || !j(this.f)) {
                aefl aeflVar = this.f;
                if (aeflVar == null || !((Boolean) aeflVar.r.orElse(Boolean.FALSE)).booleanValue()) {
                    g();
                    return;
                }
                return;
            }
            if (aefsVar.h()) {
                Rect rectN = n(tupVar.a);
                aefr aefrVar = aefsVar.a;
                aefrVar.d(rectN);
                aefrVar.requestLayout();
                aefrVar.invalidate();
                return;
            }
            aefl aeflVar2 = this.f;
            if (aeflVar2 != null) {
                Rect rectN2 = n(tupVar.a);
                boolean z = aeflVar2.a;
                aeem aeemVar = aeflVar2.s;
                if (z) {
                    if (aeemVar != null) {
                        aeemVar.b(aeflVar2);
                        aeemVar.a(aeflVar2, 3);
                    }
                    for (aeem aeemVar2 : this.a) {
                        aeemVar2.b(aeflVar2);
                        aeemVar2.a(aeflVar2, 3);
                    }
                    i();
                    return;
                }
                aefs aefsVar2 = this.e;
                if (aefsVar2 != null) {
                    aefsVar2.f(rectN2);
                }
                int i2 = aeflVar2.b;
                if (i2 != -2) {
                    if (i2 == -1) {
                        i2 = i;
                    } else if (i2 == 0) {
                        i2 = h;
                    }
                    tyx tyxVar = this.b;
                    tyxVar.sendMessageDelayed(tyxVar.obtainMessage(1, this.e), i2);
                }
                if (aeemVar != null) {
                    aeemVar.b(aeflVar2);
                }
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    ((aeem) it.next()).b(aeflVar2);
                }
                this.m = true;
            }
        }
    }

    @Override // defpackage.aefj
    public final /* synthetic */ aefk b() {
        return aefl.b();
    }

    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, xgm] */
    /* JADX WARN: Type inference failed for: r14v0, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v6, types: [awmd, java.lang.Object] */
    @Override // defpackage.aefj
    public final void c(final aefl aeflVar) {
        TextView textView;
        TextView textView2;
        ajnf ajnfVar;
        ajnf ajnfVar2;
        aefs aefsVar;
        View view = aeflVar != null ? aeflVar.c : null;
        if (view == null || twb.c(view.getContext()) || !k(aeflVar)) {
            return;
        }
        this.f = aeflVar;
        aerj aerjVar = this.n;
        View view2 = aeflVar.c;
        aefk aefkVarB = aefl.b();
        aefkVarB.a = view2;
        aefkVarB.b = aeflVar.d;
        aefkVarB.c = aeflVar.e;
        aefkVarB.o(aeflVar.j);
        aefkVarB.n(aeflVar.k);
        aefkVarB.p(aeflVar.l);
        aefkVarB.l(aeflVar.m);
        aefkVarB.e(aeflVar.n);
        aefkVarB.k(aeflVar.o);
        aefkVarB.d(aeflVar.q);
        aefkVarB.f(aeflVar.p);
        aefkVarB.h(aeflVar.r);
        ajnf ajnfVar3 = aeflVar.f;
        if (ajnfVar3 != null) {
            aefkVarB.a(ajnfVar3);
        } else {
            aefkVarB.d = null;
        }
        ajnf ajnfVar4 = aeflVar.g;
        if (ajnfVar4 != null) {
            aefkVarB.b(ajnfVar4);
        } else {
            aefkVarB.e = null;
        }
        akrn akrnVar = aeflVar.h;
        if (akrnVar != null) {
            aefkVarB.f = akrnVar;
        }
        String str = aeflVar.i;
        if (str != null) {
            aefkVarB.g = str;
        }
        aefkVarB.i = new aefq() { // from class: aeft
            @Override // defpackage.aefq
            public final void a(int i2) {
                aefv aefvVar = this.a;
                tus tusVar = aefvVar.d;
                if (tusVar != null) {
                    tusVar.b(null);
                }
                aefl aeflVar2 = aeflVar;
                aeem aeemVar = aeflVar2.s;
                if (aeemVar != null) {
                    aeemVar.a(aeflVar2, i2);
                }
                aefvVar.b.removeCallbacksAndMessages(null);
                Iterator it = aefvVar.a.iterator();
                while (it.hasNext()) {
                    ((aeem) it.next()).a(aeflVar2, i2);
                }
            }
        };
        aefl aeflVarC = aefkVarB.c();
        View view3 = aeflVarC.c;
        View viewInflate = View.inflate(view3.getContext(), R.layout.tooltip_content_view, null);
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.tooltip_title);
        TextView textView4 = (TextView) viewInflate.findViewById(R.id.tooltip_description);
        tuk.u(textView3, aeflVarC.d);
        tuk.u(textView4, aeflVarC.e);
        if (textView3.getVisibility() == 8) {
            tym.h(textView4, new tyj(0, 2), ViewGroup.MarginLayoutParams.class);
        }
        TextView textView5 = (TextView) viewInflate.findViewById(R.id.action_button);
        TextView textView6 = (TextView) viewInflate.findViewById(R.id.dismiss_button);
        ajnf ajnfVar5 = aeflVarC.f;
        aerj.f(textView5, ajnfVar5);
        ajnf ajnfVar6 = aeflVarC.g;
        aerj.f(textView6, ajnfVar6);
        akrn akrnVar2 = aeflVarC.h;
        if (akrnVar2 != null) {
            Context context = view3.getContext();
            ntw ntwVarA = ntx.a(((mlo) aerjVar.b.io()).a);
            ntwVarA.c(false);
            ntwVarA.i = ((afip) aerjVar.d).e(aerjVar.a.hB());
            mel melVar = new mel(context, ntwVarA.a());
            melVar.a(((acyx) aerjVar.c).c(akrnVar2).c, null);
            int i2 = aeflVarC.m;
            int i3 = aeflVarC.n;
            int i4 = aeflVarC.l;
            Optional.of(aerjVar.f);
            textView2 = textView6;
            ajnfVar = ajnfVar5;
            textView = textView5;
            ajnfVar2 = ajnfVar6;
            aefsVar = new aefs(viewInflate, view3, i2, i3, i4, 0, Optional.of(melVar), Optional.of((ByteStore) aerjVar.g.io()), Optional.of(aeflVarC.i));
        } else {
            textView = textView5;
            textView2 = textView6;
            ajnfVar = ajnfVar5;
            ajnfVar2 = ajnfVar6;
            int i5 = aeflVarC.m;
            int i6 = aeflVarC.n;
            int i7 = aeflVarC.l;
            Optional.of(aerjVar.f);
            aefsVar = new aefs(viewInflate, view3, i5, i6, i7, 0);
        }
        boolean zBooleanValue = ((Boolean) aeflVarC.q.orElse(Boolean.FALSE)).booleanValue();
        aefr aefrVar = aefsVar.a;
        aefrVar.m = zBooleanValue;
        aerjVar.g(textView, aefsVar, ajnfVar, 1);
        aerjVar.g(textView2, aefsVar, ajnfVar2, 2);
        aefrVar.r = aeflVarC.o;
        if (aefrVar.isShown()) {
            aefrVar.requestLayout();
        }
        Optional optional = aeflVarC.p;
        if (optional.isPresent()) {
            aefrVar.e(((Integer) optional.get()).intValue());
        }
        aefsVar.d(1 == aeflVarC.j);
        aefsVar.e(aeflVarC.t);
        aefrVar.setOnClickListener(new aefn(aefsVar, 0));
        aefrVar.l = 1 == (aeflVarC.k ^ 1);
        this.e = aefsVar;
        tus tusVar = this.d;
        View view4 = view;
        if (tusVar != null) {
            tusVar.b(view4);
        }
        view4.getViewTreeObserver().addOnGlobalLayoutListener(this.l);
    }

    public final void d(aeem aeemVar) {
        this.a.add(aeemVar);
        aefl aeflVar = this.f;
        if (aeflVar != null) {
            aeemVar.b(aeflVar);
        }
    }

    public final void e(aefl aeflVar) {
        if (aeflVar == null || !Objects.equals(aeflVar, this.f)) {
            return;
        }
        g();
    }

    public final void f(aefs aefsVar, int i2) {
        if (l()) {
            if (aefsVar != null) {
                aefsVar.b(i2);
            }
            if (Objects.equals(aefsVar, this.e)) {
                i();
            }
        }
        if (this.m) {
            i();
        }
    }

    public final void g() {
        f(this.e, 0);
    }

    public final void h(View view) {
        if (this.g) {
            return;
        }
        this.g = true;
        this.c = view;
        tus tusVar = new tus(view);
        this.d = tusVar;
        tusVar.b = this;
        tusVar.a = this;
    }

    public final void i() {
        View view;
        aefl aeflVar = this.f;
        if (aeflVar != null && (view = aeflVar.c) != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this.l);
        }
        this.e = null;
        this.f = null;
        this.m = false;
    }

    public final boolean k(aefl aeflVar) {
        return (aeflVar == null || this.f != null || l()) ? false : true;
    }

    public final boolean l() {
        aefs aefsVar = this.e;
        return aefsVar != null && aefsVar.h();
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0152  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:141:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:17:0x002d  */
    public final aefk m(aqof aqofVar) {
        boolean z;
        alay alayVar;
        alay alayVar2;
        ajnf ajnfVar;
        ajnf ajnfVar2;
        int iAS;
        int i2;
        int iBh;
        int i3;
        int iBh2;
        aefw aefwVar;
        akrn akrnVar;
        int iAT;
        int iAS2;
        if (aqofVar == null) {
            return aefl.b();
        }
        aefk aefkVarB = aefl.b();
        long j = aqofVar.o;
        aefkVarB.j(j > 0 ? (int) j : 0);
        int i4 = 1;
        if ((aqofVar.b & SemanticState.Hidden) == 0) {
            z = false;
        } else {
            aozn aoznVar = aqofVar.k;
            if (aoznVar == null) {
                aoznVar = aozn.a;
            }
            if (aoznVar.c) {
                z = true;
            } else {
                z = false;
            }
        }
        aefkVarB.g(z);
        if ((aqofVar.b & 1) != 0) {
            alayVar = aqofVar.c;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        aefkVarB.b = ackj.k(null, alayVar, null, false);
        if ((aqofVar.b & 2) != 0) {
            alayVar2 = aqofVar.d;
            if (alayVar2 == null) {
                alayVar2 = alay.a;
            }
        } else {
            alayVar2 = null;
        }
        aefkVarB.c = ackj.k(null, alayVar2, null, false);
        apji apjiVar = aqofVar.i;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(ajnp.a);
        apjiVar.c(aihlVarCheckIsLite);
        if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
            apji apjiVar2 = aqofVar.i;
            if (apjiVar2 == null) {
                apjiVar2 = apji.a;
            }
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajnp.a);
            apjiVar2.c(aihlVarCheckIsLite2);
            Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
            ajnfVar = (ajnf) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        } else {
            ajnfVar = null;
        }
        aefk aefkVarA = aefkVarB.a(ajnfVar);
        apji apjiVar3 = aqofVar.h;
        if (apjiVar3 == null) {
            apjiVar3 = apji.a;
        }
        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(ajnp.a);
        apjiVar3.c(aihlVarCheckIsLite3);
        if (apjiVar3.j.n(aihlVarCheckIsLite3.d)) {
            apji apjiVar4 = aqofVar.h;
            if (apjiVar4 == null) {
                apjiVar4 = apji.a;
            }
            aihl aihlVarCheckIsLite4 = aihn.checkIsLite(ajnp.a);
            apjiVar4.c(aihlVarCheckIsLite4);
            Object objK2 = apjiVar4.j.k(aihlVarCheckIsLite4.d);
            ajnfVar2 = (ajnf) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2));
        } else {
            ajnfVar2 = null;
        }
        aefk aefkVarB2 = aefkVarA.b(ajnfVar2);
        aqob aqobVar = aqofVar.m;
        if (aqobVar == null) {
            aqobVar = aqob.a;
        }
        aefkVarB2.o((aqobVar == null || (iAS2 = a.aS(aqobVar.b)) == 0 || iAS2 != 2) ? 1 : 0);
        aqod aqodVar = aqofVar.s;
        if (aqodVar == null) {
            aqodVar = aqod.a;
        }
        aefkVarB2.n((aqodVar == null || (iAT = a.aT(aqodVar.b)) == 0 || iAT != 4) ? 0 : 1);
        aqoe aqoeVar = aqofVar.g;
        if (aqoeVar == null) {
            aqoeVar = aqoe.a;
        }
        if (aqoeVar == null || (iAS = a.aS(aqoeVar.b)) == 0) {
            iAS = 1;
        }
        int i5 = iAS - 1;
        if (i5 != 1) {
            i2 = i5 != 2 ? 0 : 2;
        } else {
            i2 = 1;
        }
        aefkVarB2.p(i2);
        aqoc aqocVar = aqofVar.f;
        if (aqocVar == null) {
            aqocVar = aqoc.a;
        }
        if (aqocVar == null || (iBh = a.bh(aqocVar.b)) == 0) {
            iBh = 1;
        }
        int i6 = iBh - 1;
        if (i6 == 1) {
            i3 = 1;
        } else if (i6 == 3) {
            i3 = 3;
        } else if (i6 == 4) {
            i3 = 4;
        } else if (i6 == 7 || i6 == 8) {
            i3 = 1;
        } else {
            i3 = 2;
        }
        aefkVarB2.l(i3);
        aqoc aqocVar2 = aqofVar.f;
        if (aqocVar2 == null) {
            aqocVar2 = aqoc.a;
        }
        if (aqocVar2 == null || (iBh2 = a.bh(aqocVar2.b)) == 0) {
            iBh2 = 1;
        }
        switch (iBh2 - 1) {
            case 3:
            case 5:
            case 7:
                break;
            case 4:
            case 6:
            case 8:
                i4 = 3;
                break;
            default:
                i4 = 2;
                break;
        }
        aefkVarB2.e(i4);
        float f = aqofVar.e;
        if (f <= 0.0f) {
            f = 1.0f;
        }
        aefkVarB2.k(f);
        aefkVarB2.d(Optional.of(Boolean.TRUE));
        if ((aqofVar.b & SemanticState.Hidden) != 0) {
            aozn aoznVar2 = aqofVar.k;
            if (aoznVar2 == null) {
                aoznVar2 = aozn.a;
            }
            if (aoznVar2.d.size() <= 0) {
                aozn aoznVar3 = aqofVar.k;
                if (((aoznVar3 == null ? aozn.a : aoznVar3).b & 4) == 0) {
                    if (aoznVar3 == null) {
                        aoznVar3 = aozn.a;
                    }
                    if ((aoznVar3.b & 8) == 0) {
                        if ((aqofVar.b & 65536) == 0) {
                            aefwVar = null;
                        }
                    }
                }
            }
            aefwVar = new aefw(this.o, aqofVar, 0);
        } else if ((aqofVar.b & 65536) == 0) {
            aefwVar = null;
        } else {
            aefwVar = new aefw(this.o, aqofVar, 0);
        }
        aefkVarB2.h = aefwVar;
        apji apjiVar5 = aqofVar.j;
        if (apjiVar5 == null) {
            apjiVar5 = apji.a;
        }
        aihl aihlVarCheckIsLite5 = aihn.checkIsLite(akrs.a);
        apjiVar5.c(aihlVarCheckIsLite5);
        if (apjiVar5.j.n(aihlVarCheckIsLite5.d)) {
            apji apjiVar6 = aqofVar.j;
            if (apjiVar6 == null) {
                apjiVar6 = apji.a;
            }
            aihl aihlVarCheckIsLite6 = aihn.checkIsLite(akrs.a);
            apjiVar6.c(aihlVarCheckIsLite6);
            Object objK3 = apjiVar6.j.k(aihlVarCheckIsLite6.d);
            akrnVar = (akrn) (objK3 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK3));
        } else {
            akrnVar = null;
        }
        aefkVarB2.f = akrnVar;
        aefkVarB2.g = (aqofVar.b & 524288) != 0 ? aqofVar.r : null;
        aefkVarB2.h(Optional.of(Boolean.valueOf(aqofVar.n)));
        return aefkVarB2;
    }
}
