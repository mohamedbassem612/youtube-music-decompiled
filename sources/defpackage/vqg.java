package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vqg extends vpt {
    public static final agrf p = agrf.h("com/google/android/libraries/youtube/engagementpanel/SyncContentPillController");
    private static final View.AccessibilityDelegate v = new vqf();
    private final vxz A;
    public final awli q;
    public agev r;
    public boolean s;
    private final wbz w;
    private agev x;
    private final avmm y;
    private final avmm z;

    public vqg(Context context, wbz wbzVar, vxz vxzVar, xgn xgnVar) {
        super(context, xgnVar);
        this.w = wbzVar;
        this.A = vxzVar;
        agdf agdfVar = agdf.a;
        this.x = agdfVar;
        this.l = agdfVar;
        this.y = new avmm();
        this.q = new awli(Boolean.TRUE);
        this.r = agdfVar;
        this.z = new avmm();
    }

    private final ColorStateList N(int i) {
        return ColorStateList.valueOf(tzk.i(this.a, i));
    }

    @Override // defpackage.qa
    public final void e(RecyclerView recyclerView, int i, int i2) {
        if (this.b) {
            if (Boolean.FALSE.equals(this.q.au()) || this.r.g() || this.s) {
                return;
            }
            v(false);
            q(this.a.getString(R.string.sync_to_video));
        }
    }

    @Override // defpackage.qa
    public final void fO(RecyclerView recyclerView, int i) {
        if (i == 1) {
            this.b = true;
        } else if (i == 0) {
            this.b = false;
        }
        if (this.s || !this.r.g()) {
            return;
        }
        ((vng) this.r.c()).e.kk(Boolean.valueOf(this.b));
    }

    @Override // defpackage.vpt
    public final void m(FrameLayout frameLayout, RecyclerView recyclerView) {
        super.m(frameLayout, recyclerView);
        this.z.b();
        this.r = agdf.a;
    }

    @Override // defpackage.vpt
    protected final void o() {
        if (this.d == null) {
            this.d = (FrameLayout) LayoutInflater.from(this.a).inflate(R.layout.sync_button, (ViewGroup) this.e, false).findViewById(R.id.sync_button);
            s();
            FrameLayout frameLayout = this.d;
            frameLayout.getClass();
            this.f = (TextView) frameLayout.findViewById(R.id.sync_text);
            TextView textView = this.f;
            textView.setAccessibilityDelegate(v);
            textView.setOnClickListener(new vqd(this, textView, 0));
            if (this.A.l(130, 45685113L, false)) {
                textView.setTextColor(N(R.attr.ytTextPrimaryInverse));
                ((GradientDrawable) ((RippleDrawable) textView.getBackground()).findDrawableByLayerId(R.id.sync_button_background_gradient_drawable)).setColor(N(R.attr.ytTextPrimary));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, xgz] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void t(apoq apoqVar) {
        this.x = (apoqVar == null || (apoqVar.c & 524288) == 0) ? agdf.a : agev.i(wfs.g(amwh.b.a(), apoqVar.p));
        avmm avmmVar = this.y;
        avmmVar.b();
        if (this.x.g()) {
            avmmVar.c(this.w.c().j((String) this.x.c(), true).O(avmh.a()).af(new vpi(this, 4)));
        }
        this.j = agdf.a;
        if (apoqVar == null || (apoqVar.c & 131072) == 0) {
            return;
        }
        apom apomVar = apoqVar.n;
        if (apomVar == null) {
            apomVar = apom.a;
        }
        if ((apomVar.b & 1) != 0) {
            apom apomVar2 = apoqVar.n;
            if (apomVar2 == null) {
                apomVar2 = apom.a;
            }
            apji apjiVar = apomVar2.c;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(ajnp.a);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                apom apomVar3 = apoqVar.n;
                if (apomVar3 == null) {
                    apomVar3 = apom.a;
                }
                apji apjiVar2 = apomVar3.c;
                if (apjiVar2 == null) {
                    apjiVar2 = apji.a;
                }
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajnp.a);
                apjiVar2.c(aihlVarCheckIsLite2);
                Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                ajnf ajnfVar = (ajnf) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                if ((ajnfVar.b & 64) != 0) {
                    this.l = agev.i(new xgj(ajnfVar.y, (amud) null));
                    this.k.d(this.l.c());
                    alay alayVar = ajnfVar.m;
                    if (alayVar == null) {
                        alayVar = alay.a;
                    }
                    this.j = agev.i(ackj.k(null, alayVar, null, false));
                }
            }
        }
    }

    public final void u() {
        RecyclerView recyclerView;
        if (this.i && (recyclerView = this.c) != null) {
            this.i = false;
            recyclerView.aE(this);
            p(false);
        }
        v(true);
        this.z.b();
        this.r = agdf.a;
        this.y.b();
        this.s = false;
    }

    public final void v(boolean z) {
        this.q.kk(Boolean.valueOf(z));
        if (this.x.g()) {
            aihf aihfVarCreateBuilder = akvd.a.createBuilder();
            aikh aikhVar = aikh.a;
            aikg aikgVar = new aikg();
            aikgVar.d(7);
            affc affcVarA = aikgVar.a();
            aihfVarCreateBuilder.copyOnWrite();
            akvd akvdVar = (akvd) aihfVarCreateBuilder.instance;
            affcVarA.getClass();
            akvdVar.d = affcVarA;
            akvdVar.b |= 2;
            aihf aihfVarCreateBuilder2 = akvc.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            akvc akvcVar = (akvc) aihfVarCreateBuilder2.instance;
            akvcVar.c = 1;
            akvcVar.b |= 1;
            akvc akvcVar2 = (akvc) aihfVarCreateBuilder2.build();
            aihfVarCreateBuilder.copyOnWrite();
            akvd akvdVar2 = (akvd) aihfVarCreateBuilder.instance;
            akvcVar2.getClass();
            akvdVar2.c = akvcVar2;
            akvdVar2.b |= 1;
            akvd akvdVar3 = (akvd) aihfVarCreateBuilder.build();
            wer werVarE = this.w.c().e();
            Object objC = this.x.c();
            String str = (String) this.x.c();
            ahno.P(!str.isEmpty(), "key cannot be empty");
            aihf aihfVarCreateBuilder3 = amwh.a.createBuilder();
            aihfVarCreateBuilder3.copyOnWrite();
            amwh amwhVar = (amwh) aihfVarCreateBuilder3.instance;
            amwhVar.c |= 1;
            amwhVar.d = str;
            amwd amwdVar = new amwd(aihfVarCreateBuilder3);
            amwi amwiVar = z ? amwi.SYNC_MODE_SYNCED_WITH_VIDEO : amwi.SYNC_MODE_USER_BROWSING;
            aihf aihfVar = amwdVar.a;
            aihfVar.copyOnWrite();
            amwh amwhVar2 = (amwh) aihfVar.instance;
            amwhVar2.i = amwiVar.d;
            amwhVar2.c |= 64;
            werVarE.k((String) objC, akvdVar3, amwdVar.am().c());
            werVarE.b().F(new hrj(6), new vqe(0));
        }
    }

    public final void w(FrameLayout frameLayout, RecyclerView recyclerView, apoq apoqVar, avju avjuVar) {
        super.m(frameLayout, recyclerView);
        t(apoqVar);
        vng vngVar = new vng(recyclerView, avjuVar, this.A);
        avmm avmmVar = this.z;
        avmmVar.b();
        if (vngVar.h == null) {
            int i = 5;
            avlh avlhVarF = avlh.f(vngVar.d, vngVar.e, new jnx(i));
            vnf vnfVar = vnf.a;
            vngVar.h = avlh.I(avlhVarF.R(new vne(-1, false, vnfVar), new jnx(6)), vngVar.f).H(new uxe(4)).R(new vnd(-1, vnfVar, vqb.a), new vnc(vngVar, 0)).H(new uxe(i)).p();
        }
        avmmVar.c(vngVar.h.ak(new vpi(this, 3)));
        vngVar.c();
        this.r = agev.i(vngVar);
    }
}
