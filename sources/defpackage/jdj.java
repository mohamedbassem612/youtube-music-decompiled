package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.ui.components.toolbar.TouchPassThroughToolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.google.protobuf.ExtensionRegistryLite;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jdj extends jbe implements ijp {
    private static final agrf x = agrf.h("com/google/android/apps/youtube/music/ui/presenter/MusicElementHeaderPresenter");
    private final acxn A;
    private final ViewGroup y;
    private final jer z;

    public jdj(Context context, izr izrVar, jer jerVar, inn innVar, iwe iweVar, hfn hfnVar, acxn acxnVar, View view) {
        super(context, izrVar, view, innVar, iweVar, hfnVar);
        this.z = jerVar;
        this.y = (ViewGroup) view.findViewById(R.id.elements_container);
        this.A = acxnVar;
    }

    private final float j(int i) {
        int height = (this.y.getHeight() - this.p.getHeight()) - this.w.K();
        int dimensionPixelSize = height - this.a.getResources().getDimensionPixelSize(R.dimen.header_scrim_anim_start_delay);
        int i2 = -i;
        if (i2 < dimensionPixelSize) {
            return 0.0f;
        }
        if (i2 > height) {
            return 1.0f;
        }
        try {
            return afxw.H((i2 - dimensionPixelSize) / (height - dimensionPixelSize), 0.0f, 1.0f);
        } catch (ArithmeticException unused) {
            View view = this.o;
            if (view != null) {
                return view.getAlpha();
            }
            return 0.0f;
        }
    }

    @Override // defpackage.ijp
    public final void V(alvy alvyVar) {
        W(alvyVar, aotd.ACTION_UNKNOWN);
    }

    @Override // defpackage.ijp
    public final void W(alvy alvyVar, aotd aotdVar) {
        if (alvyVar != null) {
            alvz alvzVar = alvyVar.e;
            if (alvzVar == null) {
                alvzVar = alvz.a;
            }
            if (alvzVar.b == 361650780) {
                adly adlyVar = new adly();
                alvz alvzVar2 = alvyVar.e;
                if (alvzVar2 == null) {
                    alvzVar2 = alvz.a;
                }
                hU(adlyVar, alvzVar2.b == 361650780 ? (anob) alvzVar2.c : anob.a);
            }
        }
    }

    @Override // defpackage.jbe, defpackage.adma
    public final View a() {
        return this.e;
    }

    @Override // defpackage.jbe, defpackage.adma
    public final void b(admh admhVar) {
        kro.X(this.y, admhVar);
        super.b(admhVar);
    }

    @Override // defpackage.jbe
    protected final int d() {
        return R.layout.music_element_header;
    }

    @Override // defpackage.jbe
    protected final int e() {
        return R.id.elements_header_scrim;
    }

    @Override // defpackage.jbe, defpackage.gdy
    public final void hS(Configuration configuration) {
        super.hS(configuration);
        View view = this.o;
        if (view != null) {
            tuk.l(view, !hfn.G(this.a));
        }
    }

    @Override // defpackage.jbe, defpackage.adma
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void hU(adly adlyVar, anob anobVar) {
        Optional optionalEmpty;
        View view;
        TextView textView;
        super.hU(adlyVar, anobVar);
        apji apjiVar = anobVar.c;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(akrs.a);
        apjiVar.c(aihlVarCheckIsLite);
        if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
            apji apjiVar2 = anobVar.c;
            if (apjiVar2 == null) {
                apjiVar2 = apji.a;
            }
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(akrs.a);
            apjiVar2.c(aihlVarCheckIsLite2);
            Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
            acxm acxmVarA = this.A.a((akrn) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK)));
            kro.Q(acxmVarA, this.y, this.z.a, adlyVar);
            if ((anobVar.b & 8) != 0 && (textView = this.r) != null) {
                alay alayVar = anobVar.e;
                if (alayVar == null) {
                    alayVar = alay.a;
                }
                textView.setText(ackj.k(null, alayVar, null, false).toString());
            }
            byte[] bArr = acxmVarA.c;
            aguu.ak(bArr);
            try {
                asmv asmvVar = (asmv) aihn.parseFrom(asmv.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
                asow asowVar = asmvVar.c;
                if (asowVar == null) {
                    asowVar = asow.a;
                }
                aihl aihlVar = asma.b;
                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar);
                asowVar.c(aihlVarCheckIsLite3);
                Object objK2 = asowVar.j.k(aihlVarCheckIsLite3.d);
                asnx asnxVar = ((asma) (objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2))).e;
                if (asnxVar == null) {
                    asnxVar = asnx.a;
                }
                aihl aihlVar2 = aspy.b;
                aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aihlVar2);
                asnxVar.c(aihlVarCheckIsLite4);
                if (asnxVar.j.n(aihlVarCheckIsLite4.d)) {
                    asow asowVar2 = asmvVar.c;
                    if (asowVar2 == null) {
                        asowVar2 = asow.a;
                    }
                    aihl aihlVarCheckIsLite5 = aihn.checkIsLite(aihlVar);
                    asowVar2.c(aihlVarCheckIsLite5);
                    Object objK3 = asowVar2.j.k(aihlVarCheckIsLite5.d);
                    asnx asnxVar2 = ((asma) (objK3 == null ? aihlVarCheckIsLite5.b : aihlVarCheckIsLite5.c(objK3))).e;
                    if (asnxVar2 == null) {
                        asnxVar2 = asnx.a;
                    }
                    aihl aihlVarCheckIsLite6 = aihn.checkIsLite(aihlVar2);
                    asnxVar2.c(aihlVarCheckIsLite6);
                    Object objK4 = asnxVar2.j.k(aihlVarCheckIsLite6.d);
                    optionalEmpty = Optional.of((aspy) (objK4 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK4)));
                } else {
                    optionalEmpty = Optional.empty();
                }
            } catch (aiik e) {
                ((agrc) ((agrc) ((agrc) x.b()).j(e)).k("com/google/android/apps/youtube/music/ui/presenter/MusicElementHeaderPresenter", "getMusicBlurredBackgroundHeaderModel", (char) 287, "MusicElementHeaderPresenter.java")).t("Error parsing Element ProtoBytes.");
            }
            if (optionalEmpty.isPresent()) {
                aspx aspxVar = ((aspy) optionalEmpty.get()).c;
                if (aspxVar == null) {
                    aspxVar = aspx.a;
                }
                if (!aspxVar.b || (view = this.o) == null) {
                    return;
                }
                view.setVisibility(8);
            }
        }
    }

    @Override // defpackage.jbe, defpackage.aeum, defpackage.aeui
    public final void m(AppBarLayout appBarLayout, int i) {
        if (i == 0) {
            View view = this.o;
            if (view != null) {
                view.setAlpha(0.0f);
            }
            if (this.t) {
                TouchPassThroughToolbar touchPassThroughToolbar = this.p;
                touchPassThroughToolbar.getBackground().setAlpha(0);
                touchPassThroughToolbar.C = true;
                this.c.a(0);
            }
            TextView textView = this.r;
            if (textView != null) {
                textView.setVisibility(4);
            }
            this.q.setVisibility(8);
            return;
        }
        if (appBarLayout.f() + i <= 0) {
            View view2 = this.o;
            if (view2 != null) {
                view2.setAlpha(1.0f);
            }
            TouchPassThroughToolbar touchPassThroughToolbar2 = this.p;
            touchPassThroughToolbar2.getBackground().setAlpha(255);
            this.u.b();
            touchPassThroughToolbar2.C = false;
            this.c.a(this.a.getColor(R.color.black_header_color));
            return;
        }
        float fJ = j(i);
        View view3 = this.o;
        if (view3 != null) {
            view3.setAlpha(fJ);
        }
        if (fJ == 1.0f && view3 != null && view3.getVisibility() == 0) {
            this.u.b();
            TouchPassThroughToolbar touchPassThroughToolbar3 = this.p;
            touchPassThroughToolbar3.getBackground().setAlpha(255);
            this.c.a(this.a.getColor(R.color.black_header_color));
            touchPassThroughToolbar3.C = false;
            return;
        }
        this.u.a();
        if (this.t) {
            TouchPassThroughToolbar touchPassThroughToolbar4 = this.p;
            touchPassThroughToolbar4.getBackground().setAlpha(0);
            this.c.a(0);
            touchPassThroughToolbar4.C = true;
        }
    }
}
