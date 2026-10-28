package defpackage;

import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jbq implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jbq(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x009e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v45, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v48, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v58, types: [ablg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r3v21, types: [ablg, java.lang.Object] */
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
    @Override // defpackage.avni
    public final void a(Object obj) {
        int iMax;
        boolean z;
        int i;
        int iBc;
        int iBc2;
        Object obj2;
        int i2 = 8;
        int i3 = 6;
        int i4 = 0;
        switch (this.$cid) {
            case 0:
                ixh ixhVar = (ixh) obj;
                ((jbw) this.a).h(ixhVar.a, ixhVar.b, (adly) this.b);
                break;
            case 1:
                ((hqg) this.a).k(this.b, (aahb) obj);
                break;
            case 2:
                ((aebc) this.b).h((trb) this.a, (Throwable) obj);
                break;
            case 3:
                ?? r2 = this.b;
                Object obj3 = this.a;
                ((vmy) obj3).b.b(r2).g((String) obj).C(new mnt(obj3, r2, i3), new jop(i2));
                break;
            case 4:
                vni vniVar = (vni) obj;
                int i5 = vniVar.f;
                Object obj4 = this.a;
                RelativeLayout relativeLayout = (RelativeLayout) obj4;
                tzk.E(relativeLayout, (int) relativeLayout.getTranslationY(), i5);
                vnj vnjVar = (vnj) this.b;
                boolean z2 = vnjVar.f;
                int i6 = z2 ? vniVar.d.a.a.top : 0;
                tth tthVar = vnjVar.g;
                if (tthVar.i()) {
                    if (!z2) {
                        i6 = vniVar.d.a.a.top;
                    }
                    iMax = Math.max(0, vniVar.d.a.a.bottom - i5);
                } else {
                    iMax = 0;
                }
                agev agevVar = vniVar.a;
                int iR = ((vob) agevVar.c()).R();
                boolean z3 = vniVar.e;
                obj4.getClass();
                int i7 = relativeLayout.getResources().getConfiguration().orientation;
                if (iR != 3) {
                    z = z3;
                } else if (z3 || i7 == 2) {
                    int iWidth = vniVar.b.width();
                    int i8 = vnjVar.c;
                    int i9 = vnjVar.d;
                    int i10 = vnjVar.e;
                    obj4.getClass();
                    asv asvVar = (asv) relativeLayout.getLayoutParams();
                    asvVar.getClass();
                    asvVar.c = 8388613;
                    relativeLayout.setLayoutParams(asvVar);
                    avw avwVarB = vnj.b(relativeLayout);
                    int i11 = avwVarB.c;
                    if (z2) {
                        i11 += i6;
                    }
                    relativeLayout.setPaddingRelative(avwVarB.b, i11, avwVarB.d + (iWidth >= i9 ? i10 : 0), avwVarB.e + iMax);
                    if (iWidth < i9) {
                        i8 = -1;
                    }
                    tym.h((View) obj4, tym.g(i8, -1), ViewGroup.LayoutParams.class);
                } else {
                    z = false;
                }
                int iWidth2 = z ? vnjVar.b : vnjVar.a;
                if (relativeLayout.getResources().getConfiguration().orientation == 2 && agevVar.g()) {
                    vob vobVar = (vob) agevVar.c();
                    if (vobVar.E()) {
                        iWidth2 = vniVar.b.width();
                    }
                    double dN = vobVar.n();
                    if (dN > 0.0d && dN < 1.0d) {
                        iWidth2 = (int) (((double) iWidth2) * dN);
                    }
                }
                int i12 = vniVar.c;
                obj4.getClass();
                asv asvVar2 = (asv) relativeLayout.getLayoutParams();
                asvVar2.c = i12;
                relativeLayout.setLayoutParams(asvVar2);
                int iWidth3 = vniVar.b.width();
                obj4.getClass();
                int i13 = relativeLayout.getResources().getConfiguration().orientation;
                if (iWidth3 <= iWidth2 || (!z && i13 != 2)) {
                    iWidth2 = -1;
                }
                tym.h((View) obj4, tym.g(iWidth2, -1), ViewGroup.LayoutParams.class);
                avw avwVarB2 = vnj.b(relativeLayout);
                int i14 = avwVarB2.c;
                if (z2 || tthVar.i()) {
                    i14 += i6;
                }
                relativeLayout.setPaddingRelative(avwVarB2.b, i14, avwVarB2.d, avwVarB2.e + iMax);
                break;
            case 5:
                agev agevVarG = ((vor) this.a).b.g();
                if (!agevVarG.g()) {
                    zvp.a(zvn.b, zvm.Y, "Hide gesture was intercepted but no Command exists.");
                } else {
                    this.b.a((ajwo) agevVarG.c());
                }
                break;
            case 6:
                Object obj5 = this.a;
                obj5.getClass();
                ((View) obj5).setOnClickListener(new vqo((aktz) obj, ((vqs) this.b).i, i4));
                break;
            case 7:
                Object obj6 = this.a;
                Float f = (Float) obj;
                akuj akujVarU = akuj.b;
                vob vobVarD = ((vor) obj6).d();
                if (vobVarD != null) {
                    akujVarU = vobVarD.u();
                }
                Object obj7 = this.b;
                float fFloatValue = f.floatValue();
                Object obj8 = ((hed) obj7).c;
                if (akujVarU != null) {
                    int i15 = akujVarU.d;
                    if ((i15 & 2) != 0 && (((iBc = a.bc((i = akujVarU.L))) != 0 && iBc == 3) || ((iBc2 = a.bc(i)) != 0 && iBc2 == 4))) {
                        if ((i15 & 1) != 0) {
                            aktz aktzVarA = aktz.a(akujVarU.K);
                            if (aktzVarA == null) {
                                aktzVarA = aktz.ENGAGEMENT_PANEL_OUTSIDE_SCRIM_TAP_BEHAVIOR_UNSPECIFIED;
                            }
                            if (aktzVarA == aktz.ENGAGEMENT_PANEL_OUTSIDE_SCRIM_TAP_BEHAVIOR_NOOP) {
                                ((tss) obj8).h(false, false);
                            }
                        }
                        tss tssVar = (tss) obj8;
                        tssVar.h(true, false);
                        tssVar.a.setAlpha(0.0f);
                    }
                }
                tzk.D((tss) obj8, fFloatValue);
                break;
            case 8:
                this.b.execute(afwl.i(new wdd(this.a, (ajtl) obj, 5)));
                break;
            case 9:
                this.b.execute(afwl.i(new wdd(this.a, (akvx) obj, i3)));
                break;
            case 10:
                this.b.execute(afwl.i(new wdd(this.a, (amuh) obj, i2)));
                break;
            case 11:
                this.b.execute(afwl.i(new wdd(this.a, (akja) obj, 10)));
                break;
            case 12:
                boolean zAA = ((aayp) ((Pair) obj).second).a.f().aA();
                Object obj9 = this.a;
                if (zAA) {
                    obj2 = ((dxu) obj9).c;
                } else {
                    dxu dxuVar = (dxu) obj9;
                    abmt abmtVar = (abmt) dxuVar.b;
                    if (abmtVar.g.l(299, 45734269L, false) || abmtVar.e.m(306, 45736884L)) {
                        obj2 = ((dxu) obj9).c;
                    } else {
                        obj2 = dxuVar.a;
                    }
                }
                dxu dxuVar2 = (dxu) obj9;
                if (!Objects.equals(obj2, dxuVar2.e)) {
                    ?? r3 = dxuVar2.e;
                    if (r3 != 0) {
                        r3.a();
                    }
                    Object obj10 = this.b;
                    dxuVar2.e = obj2;
                    dxuVar2.e.b((avlh) obj10);
                }
                break;
            case 13:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ((acdo) this.a).g = zBooleanValue;
                if (zBooleanValue) {
                    ((acdm) this.b.io()).z();
                }
                break;
            default:
                Throwable th = (Throwable) obj;
                int i16 = adba.a;
                if (((vxz) this.a).l(297, 45696285L, false) && (th instanceof avna)) {
                    Throwable cause = th.getCause();
                    if (cause instanceof nud) {
                        nqy.d((acxz) this.b.io(), aslh.LOG_TYPE_INTERNAL_TEMPLATE_RESOLUTION_ERROR, nsl.a, (nud) cause, null, "Error materializing EML component", new Object[0]);
                    }
                }
                ugi.d(th);
                break;
        }
    }

    public /* synthetic */ jbq(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
