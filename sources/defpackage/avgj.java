package defpackage;

import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.widget.EditText;
import com.google.android.libraries.youtube.share.ui.AnchorableTopPeekingScrollView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class avgj {
    public final /* synthetic */ Object a;

    public avgj(Object obj) {
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [avkd, java.lang.Object] */
    public final avdk a() {
        return new avdk(this.a);
    }

    public final void b(Object obj) {
        ((aqh) this.a).e(obj);
    }

    public final void c(Throwable th) {
        ((aqh) this.a).f(th);
    }

    public final void d(TextInputLayout textInputLayout) {
        afef afefVar = (afef) this.a;
        EditText editText = afefVar.j;
        if (editText != textInputLayout.c) {
            if (editText != null) {
                editText.removeTextChangedListener(afefVar.k);
                if (afefVar.j.getOnFocusChangeListener() == afefVar.c().d()) {
                    afefVar.j.setOnFocusChangeListener(null);
                }
            }
            afefVar.j = textInputLayout.c;
            EditText editText2 = afefVar.j;
            if (editText2 != null) {
                editText2.addTextChangedListener(afefVar.k);
            }
            afefVar.c().g(afefVar.j);
            afefVar.q(afefVar.c());
        }
    }

    public final void e(Drawable drawable) {
        if (drawable != null) {
            super/*aeyr*/.setBackgroundDrawable(drawable);
        }
    }

    public final boolean f() {
        return ((FloatingActionButton) this.a).b;
    }

    public final void g() {
        aemn aemnVar = (aemn) this.a;
        int height = aemnVar.r.getHeight();
        for (int i = 0; i < aemnVar.s.getChildCount(); i++) {
            height += aemnVar.s.getChildAt(i).getHeight();
        }
        AnchorableTopPeekingScrollView anchorableTopPeekingScrollView = aemnVar.p;
        if (anchorableTopPeekingScrollView.n) {
            anchorableTopPeekingScrollView.p = height;
            int i2 = anchorableTopPeekingScrollView.k;
            int iMin = Math.min((height + (i2 << 1)) - anchorableTopPeekingScrollView.o, i2);
            anchorableTopPeekingScrollView.b(iMin, iMin);
            anchorableTopPeekingScrollView.e(iMin);
        }
    }

    public final void h() {
        Object obj = this.a;
        aeei aeeiVar = (aeei) obj;
        aeea aeeaVar = aeeiVar.d;
        Iterator it = aeeaVar.a.iterator();
        while (it.hasNext()) {
            if ((((aedz) it.next()).a & (-2)) != 0) {
                aeeaVar.u();
                RecyclerView recyclerView = aeeiVar.a;
                recyclerView.post(new acqu(obj, 18));
                qa qaVar = aeeiVar.t;
                recyclerView.aE(qaVar);
                recyclerView.aC(qaVar);
                return;
            }
        }
        aeeiVar.g();
    }

    public final abob i() {
        return ((acfg) this.a).s;
    }

    public final acip j() {
        return ((acfg) this.a).m();
    }

    public final void k() {
        ((acfg) this.a).W();
    }

    public final void l(boolean z) {
        qcb qcbVar;
        qcb qcbVar2;
        acfg acfgVar = (acfg) this.a;
        acfs acfsVar = acfgVar.q;
        if (acfsVar != null) {
            abmt abmtVar = acfgVar.k;
            if (abmtVar.ar() && abmtVar.e.l(339, 45773985L, false)) {
                acjd acjdVarC = acfgVar.g.c(acfsVar.E());
                if (acjdVarC instanceof aciw) {
                    aciw aciwVar = (aciw) acjdVarC;
                    if (aciwVar.n) {
                        aciwVar.a();
                        long j = aciwVar.a().b;
                        long j2 = acfgVar.t;
                        if (j2 == -1 || j < j2) {
                            acfgVar.t = j;
                        }
                    }
                }
            }
            acip acipVar = acfsVar.a;
            aawr.k(acipVar, abmtVar.j());
            if (!aawr.n(acfgVar.m())) {
                acipVar.p().j(aawr.g(acipVar));
            }
            acfg.aY(abnv.h, acipVar);
        }
        if (acfgVar.p == null && !abmt.ai(acfgVar.f, aawr.o(acfgVar.m()), aawr.n(acfgVar.m()))) {
            if (aawr.n(acfgVar.m())) {
                return;
            }
            acfd acfdVar = acfg.a;
            if (acfdVar.a) {
                return;
            }
            acfdVar.a = true;
            zvp.a(zvn.b, zvm.k, "got onInterstitialVideoEnded without a savedContentVideoState. This should not happen");
            return;
        }
        if (acfsVar == null || !acfsVar.M()) {
            acfgVar.W();
        } else {
            acfgVar.ah();
        }
        if (z) {
            acig acigVarU = acfgVar.o.a.u();
            acie acieVar = acigVarU.e;
            if (acieVar != null && (qcbVar2 = acieVar.c) != null) {
                acigVarU.a(new abyz(qcbVar2, 9));
            }
        } else {
            acig acigVarU2 = acfgVar.o.a.u();
            acie acieVar2 = acigVarU2.e;
            if (acieVar2 != null && (qcbVar = acieVar2.c) != null) {
                acigVarU2.a(new abyz(qcbVar, 7));
            }
        }
        if (!abmt.ai(acfgVar.f, aawr.o(acfgVar.m()), aawr.n(acfgVar.m())) || acfgVar.at().e() || acfgVar.v) {
            return;
        }
        acfgVar.aE(abob.g);
    }

    public final void m(String str) {
        ((acfg) this.a).aw(str);
    }

    public final void n(abob abobVar) {
        ((acfg) this.a).aE(abobVar);
    }

    public final void o(acfs acfsVar) {
        ((acfg) this.a).aH(acfsVar);
    }

    public final void p(acip acipVar, int i, long j, long j2, long j3, long j4) {
        ((acfg) this.a).aR(acipVar, i, j, j2, j3, j4);
    }

    public final void q(int i) {
        ((acfg) this.a).x = i;
    }

    public final void r(acip acipVar, int i) {
        ((acfg) this.a).aP(acipVar, i, 0);
    }

    public final void s(aboe aboeVar) {
        ((acfg) this.a).aQ(aboeVar, 4);
    }

    public /* synthetic */ avgj(Object obj, byte[] bArr) {
        this.a = obj;
    }
}
