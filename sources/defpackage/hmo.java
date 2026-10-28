package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.util.Pair;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.ui.components.loading.LoadingFrameLayout;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hmo implements twi {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hmo(hmt hmtVar, String str, Object obj, xgn xgnVar, int i) {
        this.$cid = i;
        this.b = hmtVar;
        this.c = str;
        this.a = obj;
        this.d = xgnVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, wek] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, wek] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, wek] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, wek] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, wek] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, viz] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, xir] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, uxi] */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, stb] */
    /* JADX WARN: Type inference failed for: r1v69, types: [java.lang.Object, wek] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v16, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, wpl] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, xgn] */
    /* JADX WARN: Type inference failed for: r2v38, types: [java.lang.Object, srw] */
    /* JADX WARN: Type inference failed for: r2v41, types: [java.lang.Object, ttm] */
    /* JADX WARN: Type inference failed for: r2v46, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v51, types: [java.lang.Object, ssd] */
    /* JADX WARN: Type inference failed for: r2v54, types: [java.lang.Object, ttm] */
    /* JADX WARN: Type inference failed for: r2v59, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v62, types: [java.lang.Object, ssc] */
    /* JADX WARN: Type inference failed for: r2v65, types: [java.lang.Object, ttm] */
    /* JADX WARN: Type inference failed for: r2v70, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v79, types: [java.lang.Object, ttm] */
    /* JADX WARN: Type inference failed for: r2v80, types: [aeja, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v41, types: [java.lang.Object, vob] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object, srw] */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object, ssd] */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.lang.Object, wek] */
    /* JADX WARN: Type inference failed for: r5v21, types: [java.lang.Object, ssc] */
    /* JADX WARN: Type inference failed for: r5v26, types: [java.lang.Object, wek] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, wpl] */
    /* JADX WARN: Type inference failed for: r8v17, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6, types: [awmd, java.lang.Object] */
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
    @Override // defpackage.twi
    public final void a(Object obj) {
        alna alnaVar;
        alna alnaVar2;
        alna alnaVar3;
        alna alnaVar4;
        int i = 2;
        boolean z = false;
        switch (this.$cid) {
            case 0:
                Optional optionalOfNullable = (Optional) obj;
                if (optionalOfNullable != null) {
                    Object obj2 = this.c;
                    hlx hlxVar = new hlx(obj2, i);
                    if (true == optionalOfNullable.isPresent()) {
                        Object obj3 = optionalOfNullable.get();
                        String strAH = kro.aH((String) hlxVar.a);
                        agjz agjzVar = new agjz(4);
                        annv annvVar = (annv) ((weh) obj3);
                        if (annvVar.h().contains(strAH)) {
                            agjzVar.h("PPSV");
                        }
                        if (annvVar.f().contains(strAH)) {
                            agjzVar.h("PPSE");
                        }
                        if (annvVar.k().contains(strAH)) {
                            agjzVar.h("PPSDST");
                        }
                        optionalOfNullable = Optional.ofNullable(agjzVar.g());
                    }
                    Object obj4 = this.b;
                    agke agkeVar = (agke) optionalOfNullable.orElse(agpi.a);
                    ((hmt) obj4).f.b(this.a, this.d, agkeVar.isEmpty() ? null : new Pair(((hmt) obj4).b.getString(R.string.remove_offline_confirmed_button), new gwb(obj4, (Object) agkeVar, obj2, 5, (byte[]) null)));
                }
                break;
            case 1:
                if (Boolean.TRUE.equals((Boolean) obj)) {
                    Optional optional = (Optional) this.a;
                    if (optional.isPresent()) {
                        ((gvy) this.b).g((aofx) this.d, this.c, (aoia) optional.get());
                    }
                }
                break;
            case 2:
                alxg alxgVar = (alxg) obj;
                if (alxgVar != null) {
                    Object obj5 = this.a;
                    ioc iocVar = (ioc) this.b;
                    if (((String) obj5).equals(iocVar.x)) {
                        if (jku.c(iocVar.getActivity())) {
                            iocVar.j(alxgVar);
                        }
                        ?? r2 = this.d;
                        if (r2 != 0 && !r2.isDone()) {
                            r2.cancel(false);
                        }
                    } else {
                        LoadingFrameLayout loadingFrameLayout = iocVar.v;
                        if (loadingFrameLayout != null) {
                            loadingFrameLayout.h(3);
                        }
                    }
                    if (((String) this.c).isEmpty() && !iocVar.m()) {
                        inu inuVar = iocVar.e;
                        inuVar.b.execute(afwl.i(new hqa(inuVar, alxgVar, 14)));
                        break;
                    }
                }
                break;
            case 3:
                ((srd) this.b).m(this.a, (Throwable) obj, (sre) this.d, this.c, null);
                break;
            case 4:
                Throwable th = (Throwable) obj;
                ?? r3 = this.a;
                if (r3 != 0) {
                    r3.d((toe) th);
                } else {
                    sse sseVar = (sse) this.b;
                    if (sseVar.e.l(3, 45630248L, false)) {
                        cf cfVar = sseVar.c;
                        new AlertDialog.Builder(cfVar).setMessage(th != null ? th.getMessage() : cfVar.getText(R.string.error_comment_failed)).setPositiveButton(R.string.error_button, (DialogInterface.OnClickListener) null).show();
                    } else if (th != null) {
                        sseVar.d.e(th);
                    } else {
                        tuk.n(sseVar.c, R.string.error_comment_failed, 1);
                    }
                }
                akgg akggVar = (akgg) this.c;
                if ((akggVar.c & 16) != 0) {
                    stl.c(this.d, akggVar.h, false);
                }
                break;
            case 5:
                alnu alnuVar = (alnu) obj;
                sse sseVar2 = (sse) this.b;
                awmd awmdVar = sseVar2.b;
                ((vxe) awmdVar.io()).b(alnuVar.e);
                Object obj6 = this.c;
                ?? r6 = this.a;
                if (r6 != 0) {
                    r6.e(alnuVar);
                } else {
                    alnv alnvVar = alnuVar.d;
                    if (alnvVar == null) {
                        alnvVar = alnv.a;
                    }
                    if (alnvVar.b == 153515154 || (sseVar2.e.l(16, 45766495L, false) && (alnuVar.b & SemanticState.Focused) != 0)) {
                        akgg akggVar2 = (akgg) obj6;
                        if ((akggVar2.c & SemanticState.Hidden) != 0) {
                            sry sryVar = sseVar2.a;
                            String str = akggVar2.m;
                            agqr it = ((agkz) sryVar.b).iterator();
                            while (it.hasNext()) {
                                srp srpVar = (srp) it.next();
                                if (srpVar.c.equals(str)) {
                                    srpVar.B(alnuVar);
                                    z = true;
                                }
                            }
                            if (!z) {
                                sryVar.c(alnuVar);
                            }
                        } else {
                            sseVar2.a.c(alnuVar);
                        }
                    } else {
                        xsc xscVar = sseVar2.f;
                        if ((alnuVar.b & 4) != 0) {
                            alnaVar = alnuVar.f;
                            if (alnaVar == null) {
                                alnaVar = alna.a;
                            }
                        } else {
                            alnaVar = null;
                        }
                        xscVar.V(alnaVar, null);
                    }
                }
                ?? r0 = this.d;
                akgg akggVar3 = (akgg) obj6;
                if ((akggVar3.c & 8) != 0 && !alnuVar.g) {
                    if (!alnuVar.h) {
                        stl.b(r0, akggVar3.g);
                    }
                    ajwo ajwoVarA = stl.a(r0, akggVar3.g);
                    if (ajwoVarA != null) {
                        ((vxe) awmdVar.io()).a(ajwoVarA);
                    }
                }
                if ((akggVar3.c & 16) != 0) {
                    stl.c(r0, akggVar3.h, true);
                }
                break;
            case 6:
                Throwable th2 = (Throwable) obj;
                ?? r4 = this.b;
                if (r4 != 0) {
                    r4.f((toe) th2);
                } else {
                    ssk sskVar = (ssk) this.d;
                    if (((vxz) sskVar.d).l(3, 45630248L, false)) {
                        Context context = sskVar.b;
                        new AlertDialog.Builder(context).setMessage(th2 != null ? th2.getMessage() : ((cf) context).getText(R.string.error_comment_failed)).setPositiveButton(R.string.error_button, (DialogInterface.OnClickListener) null).show();
                    } else if (th2 != null) {
                        sskVar.f.e(th2);
                    } else {
                        tuk.n(sskVar.b, R.string.error_comment_failed, 1);
                    }
                }
                akgj akgjVar = (akgj) this.c;
                if ((akgjVar.c & 64) != 0) {
                    stl.c(this.a, akgjVar.h, false);
                }
                break;
            case 7:
                ssk sskVar2 = (ssk) this.d;
                ?? r5 = sskVar2.c;
                alnr alnrVar = (alnr) obj;
                ((vxe) r5.io()).b(alnrVar.e);
                ?? r7 = this.b;
                if (r7 != 0) {
                    r7.g(alnrVar);
                } else {
                    alns alnsVar = alnrVar.d;
                    if (alnsVar == null) {
                        alnsVar = alns.a;
                    }
                    if (alnsVar.b == 153515154) {
                        ((sry) sskVar2.e).b(alnrVar);
                    } else {
                        Object obj7 = sskVar2.a;
                        if ((alnrVar.b & 16) != 0) {
                            alnaVar2 = alnrVar.f;
                            if (alnaVar2 == null) {
                                alnaVar2 = alna.a;
                            }
                        } else {
                            alnaVar2 = null;
                        }
                        ((xsc) obj7).V(alnaVar2, null);
                    }
                }
                ?? r1 = this.a;
                akgj akgjVar2 = (akgj) this.c;
                if ((akgjVar2.c & 32) != 0) {
                    if (!alnrVar.h) {
                        stl.b(r1, akgjVar2.g);
                    }
                    ajwo ajwoVarA2 = stl.a(r1, akgjVar2.g);
                    if (ajwoVarA2 != null) {
                        ((vxe) r5.io()).a(ajwoVarA2);
                    }
                }
                if ((akgjVar2.c & 64) != 0) {
                    stl.c(r1, akgjVar2.h, true);
                }
                break;
            case 8:
                Throwable th3 = (Throwable) obj;
                ?? r8 = this.b;
                if (r8 != 0) {
                    r8.b((toe) th3);
                } else {
                    ssk sskVar3 = (ssk) this.d;
                    if (((vxz) sskVar3.f).l(3, 45630248L, false)) {
                        Context context2 = sskVar3.b;
                        new AlertDialog.Builder(context2).setMessage(th3 != null ? th3.getMessage() : ((cf) context2).getText(R.string.error_comment_failed)).setPositiveButton(R.string.error_button, (DialogInterface.OnClickListener) null).show();
                    } else if (th3 != null) {
                        sskVar3.e.e(th3);
                    } else {
                        tuk.n(sskVar3.b, R.string.error_comment_failed, 1);
                    }
                }
                aqzf aqzfVar = (aqzf) this.c;
                if ((aqzfVar.c & 16) != 0) {
                    stl.c(this.a, aqzfVar.h, false);
                }
                break;
            case 9:
                aloc alocVar = (aloc) obj;
                ?? r9 = this.b;
                Object obj8 = this.d;
                if (r9 != 0) {
                    r9.c(alocVar);
                } else {
                    ssk sskVar4 = (ssk) obj8;
                    ((vxe) sskVar4.c.io()).b(alocVar.e);
                    Object obj9 = sskVar4.a;
                    if ((alocVar.b & 4) != 0) {
                        alnaVar3 = alocVar.f;
                        if (alnaVar3 == null) {
                            alnaVar3 = alna.a;
                        }
                    } else {
                        alnaVar3 = null;
                    }
                    ((xsc) obj9).V(alnaVar3, null);
                }
                ?? r10 = this.a;
                aqzf aqzfVar2 = (aqzf) this.c;
                if ((aqzfVar2.c & 8) != 0) {
                    if (!alocVar.g && !((vxz) ((ssk) obj8).f).l(12, 45721764L, false)) {
                        stl.b(r10, aqzfVar2.g);
                    }
                    ajwo ajwoVarA3 = stl.a(r10, aqzfVar2.g);
                    if (ajwoVarA3 != null) {
                        ((vxe) ((ssk) obj8).c.io()).a(ajwoVarA3);
                    }
                }
                if ((aqzfVar2.c & 16) != 0) {
                    stl.c(r10, aqzfVar2.h, true);
                }
                break;
            case 10:
                Throwable th4 = (Throwable) obj;
                ?? r11 = this.b;
                if (r11 != 0) {
                    r11.d((toe) th4);
                } else {
                    ssk sskVar5 = (ssk) this.d;
                    if (((vxz) sskVar5.f).l(3, 45630248L, false)) {
                        Context context3 = sskVar5.b;
                        new AlertDialog.Builder(context3).setMessage(th4 != null ? th4.getMessage() : ((cf) context3).getText(R.string.error_comment_failed)).setPositiveButton(R.string.error_button, (DialogInterface.OnClickListener) null).show();
                    } else if (th4 != null) {
                        sskVar5.e.e(th4);
                    } else {
                        tuk.n(sskVar5.b, R.string.error_comment_failed, 1);
                    }
                }
                aqzi aqziVar = (aqzi) this.c;
                if ((aqziVar.c & 32) != 0) {
                    stl.c(this.a, aqziVar.h, false);
                }
                break;
            case 11:
                alnz alnzVar = (alnz) obj;
                ?? r12 = this.b;
                Object obj10 = this.d;
                if (r12 != 0) {
                    r12.e(alnzVar);
                } else {
                    ssk sskVar6 = (ssk) obj10;
                    ((vxe) sskVar6.c.io()).b(alnzVar.e);
                    Object obj11 = sskVar6.a;
                    if ((alnzVar.b & 8) != 0) {
                        alnaVar4 = alnzVar.f;
                        if (alnaVar4 == null) {
                            alnaVar4 = alna.a;
                        }
                    } else {
                        alnaVar4 = null;
                    }
                    ((xsc) obj11).V(alnaVar4, null);
                }
                ?? r13 = this.a;
                aqzi aqziVar2 = (aqzi) this.c;
                if ((aqziVar2.c & 16) != 0) {
                    if (!alnzVar.g && !((vxz) ((ssk) obj10).f).l(12, 45721764L, false)) {
                        stl.b(r13, aqziVar2.g);
                    }
                    ajwo ajwoVarA4 = stl.a(r13, aqziVar2.g);
                    if (ajwoVarA4 != null) {
                        ((vxe) ((ssk) obj10).c.io()).a(ajwoVarA4);
                    }
                }
                if ((aqziVar2.c & 32) != 0) {
                    stl.c(r13, aqziVar2.h, true);
                }
                break;
            case 12:
                Uri uri = (Uri) obj;
                if (uri != null) {
                    Object obj12 = this.c;
                    augy augyVar = (augy) obj12;
                    auhi auhiVar = (augyVar.c == 105 ? (augs) augyVar.d : augs.a).d;
                    if (auhiVar == null) {
                        auhiVar = auhi.a;
                    }
                    aihf builder = auhiVar.toBuilder();
                    String string = uri.toString();
                    builder.copyOnWrite();
                    auhi auhiVar2 = (auhi) builder.instance;
                    string.getClass();
                    auhiVar2.b |= 1;
                    auhiVar2.c = string;
                    auhi auhiVar3 = (auhi) builder.build();
                    String str2 = (String) yno.fi(uri).get();
                    jrr jrrVar = (jrr) ((aihn) obj12).toBuilder();
                    augs augsVar = augyVar.c == 105 ? (augs) augyVar.d : augs.a;
                    Object obj13 = this.d;
                    ?? r14 = this.b;
                    Object obj14 = this.a;
                    aihf builder2 = augsVar.toBuilder();
                    builder2.copyOnWrite();
                    augs augsVar2 = (augs) builder2.instance;
                    auhiVar3.getClass();
                    augsVar2.d = auhiVar3;
                    augsVar2.b |= 2;
                    builder2.copyOnWrite();
                    augs augsVar3 = (augs) builder2.instance;
                    augsVar3.b |= 1;
                    augsVar3.c = str2;
                    jrrVar.copyOnWrite();
                    augy augyVar2 = (augy) jrrVar.instance;
                    augs augsVar4 = (augs) builder2.build();
                    augsVar4.getClass();
                    augyVar2.d = augsVar4;
                    augyVar2.c = 105;
                    aihf builder3 = ((aihn) obj13).toBuilder();
                    String str3 = (String) yno.fi(uri).get();
                    builder3.copyOnWrite();
                    vbu vbuVar = (vbu) builder3.instance;
                    vbuVar.b |= 1;
                    vbuVar.c = str3;
                    ((via) obj14).b.f(r14, jrrVar, (vbu) builder3.build());
                }
                break;
            default:
                xdi.e(this.b, ((xdi) this.d).m.b((Throwable) obj), this.c);
                this.a.f(tau.GLOBAL_ENGAGEMENT_PANEL_RESPONSE_ERROR);
                break;
        }
    }

    public /* synthetic */ hmo(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
        this.d = obj3;
        this.c = obj4;
    }

    public /* synthetic */ hmo(Object obj, Object obj2, Object obj3, Object obj4, int i, byte[] bArr) {
        this.$cid = i;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
        this.a = obj4;
    }

    public /* synthetic */ hmo(sse sseVar, wpl wplVar, akgg akggVar, wek wekVar, int i) {
        this.$cid = i;
        this.b = sseVar;
        this.a = wplVar;
        this.c = akggVar;
        this.d = wekVar;
    }

    public /* synthetic */ hmo(via viaVar, uxi uxiVar, augy augyVar, vbu vbuVar, int i) {
        this.$cid = i;
        this.a = viaVar;
        this.b = uxiVar;
        this.c = augyVar;
        this.d = vbuVar;
    }
}
