package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.engagementpanel.util.InterceptTouchListenerLinearLayout;
import j$.util.function.Consumer$CC;
import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class mnt implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mnt(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, wby] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r8v76, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v8, types: [abvn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v89, types: [aasp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v91, types: [aasp, java.lang.Object] */
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
        Drawable drawableD;
        alvt alvtVarU;
        int i = 8;
        int i2 = 2;
        int iComplexToDimensionPixelSize = 0;
        switch (this.$cid) {
            case 0:
                mnv mnvVar = (mnv) this.a;
                omj omjVar = mnvVar.b;
                if (omjVar != null) {
                    mnvVar.a.a(omjVar.x(), (nrv) this.b).D();
                }
                mnvVar.c();
                break;
            case 1:
                mnj mnjVar = (mnj) this.a;
                omj omjVar2 = mnjVar.c;
                if (omjVar2 != null) {
                    mnjVar.a.a(omjVar2.x(), (nrv) this.b).D();
                    mnjVar.b = true;
                }
                break;
            case 2:
                abik abikVar = (abik) obj;
                final String str = abikVar.a;
                final long j = abikVar.b;
                final int i3 = this.b.am().b;
                Consumer consumer = new Consumer() { // from class: rtr
                    @Override // java.util.function.Consumer
                    /* JADX INFO: renamed from: accept */
                    public final void r(Object obj2) {
                        ((rsq) obj2).p(str, j, i3);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                        return Consumer$CC.$default$andThen(this, consumer2);
                    }
                };
                rts rtsVar = (rts) this.a;
                rtsVar.i(consumer, rtsVar.N);
                break;
            case 3:
                swz swzVar = (swz) this.a;
                alis alisVar = (alis) obj;
                Iterator it = swzVar.e.a.iterator();
                while (it.hasNext()) {
                    ((swy) it.next()).a();
                }
                if (alisVar.e()) {
                    swzVar.h(alisVar.getBadgeText());
                } else {
                    swzVar.c.setVisibility(8);
                }
                aliu aliuVar = (aliu) this.b;
                if ((aliuVar.b & SemanticState.Focused) != 0) {
                    if (!alisVar.e() || TextUtils.getTrimmedLength(alisVar.getBadgeText()) <= 0) {
                        View view = swzVar.b;
                        aiqd aiqdVar = aliuVar.j;
                        if (aiqdVar == null) {
                            aiqdVar = aiqd.a;
                        }
                        view.setContentDescription(aiqdVar.c);
                    } else {
                        View view2 = swzVar.b;
                        aiqd aiqdVar2 = aliuVar.j;
                        if (aiqdVar2 == null) {
                            aiqdVar2 = aiqd.a;
                        }
                        view2.setContentDescription(aiqdVar2.c + ", " + alisVar.getBadgeText());
                    }
                }
                if (!alisVar.getIsVisible().booleanValue()) {
                    swzVar.b.setVisibility(8);
                    if ((aliuVar.b & SemanticState.Hidden) != 0) {
                        ((abxv) swzVar.a.io()).L(aliuVar.k);
                    }
                } else {
                    View view3 = swzVar.b;
                    if (view3.getVisibility() == 8 && (aliuVar.b & 2) != 0) {
                        vxe vxeVar = swzVar.d;
                        ajwo ajwoVar = aliuVar.d;
                        if (ajwoVar == null) {
                            ajwoVar = ajwo.a;
                        }
                        vxeVar.a(ajwoVar);
                    }
                    view3.setVisibility(0);
                    if ((aliuVar.b & SemanticState.Hidden) != 0) {
                        ((abxv) swzVar.a.io()).J(aliuVar.k, view3);
                    }
                }
                break;
            case 4:
                ajfu ajfuVar = (ajfu) obj;
                xsc.H(this.a, (String) this.b, ajfuVar, ajfuVar.getAssetId(), "", agpi.a, ajwo.a, ajga.ASSET_ITEM_SELECTED_STATE_UNSELECTED);
                break;
            case 5:
                apxf apxfVar = (apxf) obj;
                if ((apxfVar.b & 2) != 0) {
                    apji apjiVar = apxfVar.d;
                    if (apjiVar == null) {
                        apjiVar = apji.a;
                    }
                    aihl aihlVarCheckIsLite = aihn.checkIsLite(ajnp.a);
                    apjiVar.c(aihlVarCheckIsLite);
                    if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                        String strC = (apxfVar.b & 4) != 0 ? apxfVar.e : xsc.C("asset_item_selected_entity");
                        Object obj2 = this.b;
                        vbp vbpVar = (vbp) obj2;
                        vbpVar.q = strC;
                        apji apjiVar2 = apxfVar.d;
                        if (apjiVar2 == null) {
                            apjiVar2 = apji.a;
                        }
                        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajnp.a);
                        apjiVar2.c(aihlVarCheckIsLite2);
                        Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                        Object objC = objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK);
                        vxe vxeVar2 = vbpVar.d;
                        vbn vbnVar = vbpVar.e;
                        vbnVar.e(vxeVar2, (View) this.a, (ajnf) objC, vbpVar.s);
                        if (vbpVar.i.s()) {
                            drawableD = vbpVar.h.getDrawable(vbpVar.g.a(arqz.aw));
                            if (drawableD != null) {
                                drawableD.setColorFilter(-1, PorterDuff.Mode.SRC_IN);
                            }
                        } else {
                            drawableD = dl.d(vbpVar.h, R.drawable.ic_presets_enabled);
                        }
                        vbnVar.c(drawableD);
                        vbnVar.d(true == vbpVar.l ? 0 : 8);
                        vbpVar.f.c(vbpVar.u.G(vbpVar.q).O(vbpVar.c).af(new var(obj2, 5)));
                    }
                }
                break;
            case 6:
                wer werVarE = ((vmy) this.a).a.e(this.b).e();
                werVarE.e((weh) obj);
                werVarE.b();
                break;
            case 7:
                Rect rect = ((tuy) obj).a.a;
                Object obj3 = this.a;
                int i4 = rect.bottom;
                View view4 = (View) obj3;
                int paddingBottom = view4.getPaddingBottom();
                vnr vnrVar = ((vnp) this.b).b;
                if (vnrVar.q) {
                    vnrVar.Z(i4);
                    i4 = paddingBottom;
                } else if (vnrVar.s.i() || (vnrVar.v.l(203, 45682990L, false) && ((ViewGroup) obj3).getChildAt(0) == null)) {
                    i4 = 0;
                }
                if (i4 != paddingBottom) {
                    view4.setPadding(0, 0, 0, i4);
                }
                break;
            case 8:
                vob vobVar = ((vot) this.b).b;
                Configuration configuration = (Configuration) obj;
                Object obj4 = this.a;
                if (vobVar.P() == 7 && configuration.orientation == 2) {
                    vor vorVar = (vor) obj4;
                    GradientDrawable gradientDrawableB = vorVar.b(vobVar);
                    if (gradientDrawableB != null) {
                        vorVar.C(gradientDrawableB, vorVar.a(vobVar));
                    }
                } else if (vobVar.P() == 7) {
                    ((vor) obj4).F(vobVar);
                }
                break;
            case 9:
                int iIntValue = ((Integer) obj).intValue();
                vqx vqxVar = (vqx) this.b;
                if (vqxVar.c) {
                    int i5 = vqxVar.f.L().b;
                    int i6 = vqxVar.e;
                    if (i6 != 0) {
                        i2 = i5;
                    } else if (i5 == 2) {
                        vqxVar.e = iIntValue;
                        i6 = iIntValue;
                    } else {
                        i2 = i5;
                        i6 = 0;
                    }
                    boolean z = i6 != 0 && iIntValue < i6;
                    if (i2 != 0) {
                        iIntValue -= vqxVar.d;
                    }
                    Boolean.TRUE.booleanValue();
                    if (!z) {
                        vqxVar.d(iIntValue, (View) this.a);
                    }
                }
                break;
            case 10:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                View view5 = ((vtt) this.b).f;
                if (view5 != null) {
                    ViewGroup.LayoutParams layoutParams = view5.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        if (zBooleanValue) {
                            Object obj5 = this.a;
                            TypedValue typedValue = new TypedValue();
                            Context context = (Context) obj5;
                            if (context.getTheme().resolveAttribute(R.attr.engagementPanelSeamlessDragHandleBottomMargin, typedValue, true)) {
                                iComplexToDimensionPixelSize = TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
                            }
                        }
                        if (marginLayoutParams.bottomMargin != iComplexToDimensionPixelSize) {
                            marginLayoutParams.bottomMargin = iComplexToDimensionPixelSize;
                            view5.setLayoutParams(marginLayoutParams);
                        }
                    }
                }
                break;
            case 11:
                ((InterceptTouchListenerLinearLayout) this.b).a(((Boolean) obj).booleanValue() ? ((vuk) this.a).d : null);
                break;
            case 12:
                Pair pair = (Pair) obj;
                Boolean bool = (Boolean) pair.first;
                alzm alzmVar = (alzm) ((agev) pair.second).f();
                if (!bool.booleanValue() && alzmVar != null) {
                    ((wvn) this.a).b(alzmVar, this.b);
                    break;
                }
                break;
            case 13:
                weh wehVar = ((weo) obj).c;
                if (wehVar != null) {
                    Object obj6 = this.a;
                    wwk wwkVar = (wwk) obj6;
                    if (!wwkVar.e.m(9, 45741715L) || (wehVar instanceof amnj)) {
                        wtg wtgVar = new wtg(obj6, this.b, i);
                        if (!((amnj) wehVar).getIsLiveBannerCollapsed().booleanValue()) {
                            wwkVar.b();
                        } else {
                            long j2 = wwkVar.c;
                            CountDownTimer countDownTimer = wwkVar.d;
                            if (countDownTimer != null) {
                                countDownTimer.cancel();
                            }
                            wwkVar.d = new wwj(wwkVar, j2, wtgVar).start();
                        }
                    }
                }
                break;
            case 14:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                Object obj7 = this.a;
                Object obj8 = this.b;
                if (!zBooleanValue2) {
                    algq algqVar = (algq) obj8;
                    if ((algqVar.c & 2) != 0) {
                        vxe vxeVar3 = ((xot) obj7).b;
                        ajwo ajwoVar2 = algqVar.e;
                        if (ajwoVar2 == null) {
                            ajwoVar2 = ajwo.a;
                        }
                        vxeVar3.a(ajwoVar2);
                    }
                } else {
                    agrx agrxVar = agso.a;
                    algq algqVar2 = (algq) obj8;
                    if ((algqVar2.c & 1) != 0) {
                        vxe vxeVar4 = ((xot) obj7).b;
                        ajwo ajwoVar3 = algqVar2.d;
                        if (ajwoVar3 == null) {
                            ajwoVar3 = ajwo.a;
                        }
                        vxeVar4.a(ajwoVar3);
                    }
                }
                break;
            case 15:
                ((agrc) ((agrc) ((agrc) xpc.a.c().i(agso.a, "MdxConnectCommandResolver")).j((Throwable) obj)).k("com/google/android/libraries/youtube/mdx/handoff/MdxConnectCommandResolver", "monitorConnectionAttempt", (char) 334, "MdxConnectCommandResolver.java")).t("MDx connection failed.");
                ((xpc) this.a).e((amyb) this.b);
                break;
            case 16:
                ((AccountManager) this.b).invalidateAuthToken(((Account) this.a).type, (String) obj);
                break;
            case 17:
                ((aasr) this.b).a(this.a);
                break;
            case 18:
                ((aasr) this.b).a(this.a);
                break;
            case 19:
                wjf wjfVar = ((aayp) obj).a;
                if (wjfVar != null && (alvtVarU = wjfVar.u()) != null) {
                    Object obj9 = this.b;
                    Object obj10 = this.a;
                    aihf aihfVar = (aihf) obj9;
                    aazy.b(aihfVar, alvtVarU);
                    ((aazy) obj10).b = (ashq) aihfVar.build();
                    break;
                }
                break;
            default:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                Object obj11 = this.a;
                if (!zBooleanValue3) {
                    abhe abheVar = (abhe) obj11;
                    if (abheVar.g) {
                        abheVar.g = false;
                        abheVar.b.b();
                        if (!abheVar.e) {
                            abheVar.j();
                        }
                    }
                } else {
                    ?? r8 = this.b;
                    abhe abheVar2 = (abhe) obj11;
                    abheVar2.g = true;
                    abheVar2.b.e(abheVar2.m((abvn) r8.io()));
                }
                break;
        }
    }

    public /* synthetic */ mnt(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
