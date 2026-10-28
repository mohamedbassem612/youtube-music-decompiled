package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.text.Spanned;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import app.rive.semantics.SemanticState;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.protobuf.ExtensionRegistryLite;
import j$.util.Collection;
import j$.util.Optional;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adys extends adyw implements AdapterView.OnItemClickListener, acwn {
    private static final agrf y = agrf.h("com/google/android/libraries/youtube/rendering/ui/bottomsheet/MenuBottomSheetDialogFragment");
    private admu A;
    private ListView B;
    public aduv k;
    public aunn l;
    public xgn m;
    public boolean n;
    public aebi o;
    public awmd p;
    public adxl q;
    public boolean r;
    public vxz s;
    public vxz t;
    public ahek u;
    public jnj v;
    public abfv w;
    public axlj x;
    private anfy z;

    @Override // defpackage.acwn
    public final void a() {
        z();
    }

    public final Optional i(anfv anfvVar) {
        boolean z;
        boolean z2;
        alja aljaVar;
        alay alayVar;
        alay alayVar2;
        Context contextRequireContext = requireContext();
        aduv aduvVar = this.k;
        if (anfvVar == null) {
            throw new NullPointerException("Null menuItem");
        }
        vxz vxzVar = this.s;
        Spanned spannedK = null;
        adyt adytVar = new adyt(contextRequireContext, aduvVar, vxzVar != null && vxzVar.l(ModuleDescriptor.MODULE_VERSION, 45693261L, false), this.r, this.l, this.m, anfvVar, new avgj(this, null));
        anfv anfvVar2 = adytVar.g;
        if (anfvVar2.b == 153515154) {
            aunn aunnVar = adytVar.e;
            if (aunnVar != null) {
                return Optional.of(((acyx) aunnVar.io()).c(anfvVar2.b == 153515154 ? (akrn) anfvVar2.c : akrn.a));
            }
            zvp.a(zvn.b, zvm.z, "ElementTransformer cannot be null");
            return Optional.empty();
        }
        yno.dZ(anfvVar2);
        alja aljaVarDU = yno.dU(anfvVar2);
        CharSequence charSequenceDV = yno.dV(anfvVar2);
        if (charSequenceDV == null) {
            if (aljaVarDU == null || (aljaVarDU.b & 1) == 0) {
                zvp.a(zvn.b, zvm.z, "Text missing for BottomSheetMenuItem.");
            } else {
                zvn zvnVar = zvn.b;
                zvm zvmVar = zvm.z;
                aliz alizVarA = aliz.a(aljaVarDU.c);
                if (alizVarA == null) {
                    alizVarA = aliz.UNKNOWN;
                }
                zvp.a(zvnVar, zvmVar, "Text missing for BottomSheetMenuItem with iconType: " + alizVarA.yN);
            }
            return Optional.empty();
        }
        aigj aigjVarDR = yno.dR(anfvVar2);
        xgn xgnVar = adytVar.f;
        if (xgnVar != null && !aigjVarDR.E()) {
            xgnVar.w(new xgj(aigjVarDR, (amud) null), null);
        }
        Context context = adytVar.a;
        aduv aduvVar2 = adytVar.b;
        boolean z3 = adytVar.c;
        boolean z4 = adytVar.d;
        adyl adylVar = new adyl(charSequenceDV.toString(), anfvVar2);
        adylVar.l = z3;
        int iDW = yno.dW(anfvVar2);
        boolean z5 = adylVar.a;
        boolean z6 = iDW != 2;
        if (z5 != z6) {
            adylVar.a = z6;
            adylVar.a();
        }
        int i = anfvVar2.b;
        if (i == 66441108) {
            z = (i == 66441108 ? (anfw) anfvVar2.c : anfw.a).k;
        } else {
            z = true;
        }
        Drawable drawableN = aecm.n(context, aduvVar2, yno.dU(anfvVar2));
        if (drawableN != null) {
            adylVar.f = drawableN;
            adylVar.j = z;
        }
        int i2 = anfvVar2.b;
        if (i2 == 77258115) {
            z2 = (i2 == 77258115 ? (anft) anfvVar2.c : anft.a).i;
        } else {
            z2 = true;
        }
        int i3 = anfvVar2.b;
        if (i3 == 66441108) {
            aljaVar = ((anfw) anfvVar2.c).e;
            if (aljaVar == null) {
                aljaVar = alja.a;
            }
        } else if (i3 == 77258115) {
            aljaVar = ((anft) anfvVar2.c).h;
            if (aljaVar == null) {
                aljaVar = alja.a;
            }
        } else {
            aljaVar = null;
        }
        Drawable drawableN2 = aecm.n(context, aduvVar2, aljaVar);
        if (drawableN2 != null) {
            ahno.P(adylVar.h == null, "Cannot set a secondary icon when detail text is present.");
            adylVar.g = drawableN2;
            adylVar.i = z2;
        }
        adylVar.k = z4;
        adylVar.c = new acnp(adytVar, adylVar, 20, null);
        int i4 = anfvVar2.b;
        if (i4 == 78861357) {
            if ((i4 == 78861357 ? (angh) anfvVar2.c : angh.a).m) {
                int i5 = anfvVar2.b;
                if (((i5 == 78861357 ? (angh) anfvVar2.c : angh.a).b & SemanticState.Focused) != 0) {
                    alayVar2 = (i5 == 78861357 ? (angh) anfvVar2.c : angh.a).j;
                    if (alayVar2 == null) {
                        alayVar2 = alay.a;
                    }
                } else {
                    alayVar2 = null;
                }
                spannedK = ackj.k(null, alayVar2, null, false);
            } else {
                int i6 = anfvVar2.b;
                if (((i6 == 78861357 ? (angh) anfvVar2.c : angh.a).b & 4) != 0) {
                    alayVar = (i6 == 78861357 ? (angh) anfvVar2.c : angh.a).e;
                    if (alayVar == null) {
                        alayVar = alay.a;
                    }
                } else {
                    alayVar = null;
                }
                spannedK = ackj.k(null, alayVar, null, false);
            }
        }
        if (spannedK != null) {
            adylVar.e(spannedK.toString());
            int i7 = anfvVar2.b;
            if (i7 == 78861357) {
                if ((i7 == 78861357 ? (angh) anfvVar2.c : angh.a).p && adylVar.p != 2) {
                    adylVar.p = 2;
                    adylVar.a();
                }
            }
        }
        return Optional.of(adylVar);
    }

    @Override // defpackage.adyw, defpackage.aevy, defpackage.gs, defpackage.bp
    public final Dialog iH(Bundle bundle) {
        Dialog dialogIH = super.iH(bundle);
        dialogIH.getWindow();
        return dialogIH;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, xgm] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, vxe] */
    public final void j(qnx qnxVar) {
        ajwo ajwoVarDT;
        if (qnxVar instanceof adyl) {
            anfv anfvVar = ((adyl) qnxVar).q;
            axlj axljVar = this.x;
            if (axljVar != null) {
                Context context = getContext();
                if (anfvVar == null) {
                    ajwoVarDT = null;
                } else {
                    ajwoVarDT = yno.dT(anfvVar);
                    if (ajwoVarDT == null) {
                        ajwoVarDT = yno.dS(anfvVar);
                    }
                    if (ajwoVarDT == null) {
                        if (((anfvVar.b == 66441155 ? (anga) anfvVar.c : anga.a).b & SemanticState.Focused) != 0) {
                            ajwoVarDT = (anfvVar.b == 66441155 ? (anga) anfvVar.c : anga.a).f;
                            if (ajwoVarDT == null) {
                                ajwoVarDT = ajwo.a;
                            }
                        } else {
                            ajwoVarDT = null;
                        }
                    }
                }
                HashMap map = new HashMap();
                Object obj = axljVar.a;
                if (obj != null) {
                    map.putAll(obj);
                }
                if (ajwoVarDT != null) {
                    int i = anfvVar.b;
                    CharSequence charSequenceK = "";
                    if (i == 78861357) {
                        if ((i == 78861357 ? (angh) anfvVar.c : angh.a).m) {
                            int i2 = anfvVar.b;
                            if (((i2 == 78861357 ? (angh) anfvVar.c : angh.a).b & 64) != 0) {
                                alay alayVar = (i2 == 78861357 ? (angh) anfvVar.c : angh.a).i;
                                if (alayVar == null) {
                                    alayVar = alay.a;
                                }
                                charSequenceK = ackj.k(null, alayVar, null, false);
                            }
                        } else {
                            int i3 = anfvVar.b;
                            if (((i3 == 78861357 ? (angh) anfvVar.c : angh.a).b & 2) != 0) {
                                alay alayVar2 = (i3 == 78861357 ? (angh) anfvVar.c : angh.a).d;
                                if (alayVar2 == null) {
                                    alayVar2 = alay.a;
                                }
                                charSequenceK = ackj.k(null, alayVar2, null, false);
                            }
                        }
                    }
                    if (charSequenceK.length() != 0) {
                        tuk.o(context, charSequenceK, 0);
                    }
                    yno.dZ(anfvVar);
                    xgn xgnVarHB = axljVar.b.hB();
                    if (xgnVarHB != null) {
                        xgnVarHB.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(ajwoVarDT.c, (amud) null), xhd.g(ajwoVarDT, map));
                    }
                    axljVar.c.c(ajwoVarDT, map);
                }
            }
        }
        z();
    }

    @Override // defpackage.adyw
    protected final Optional n() {
        boolean z;
        admo admoVarD;
        Object adygVar;
        cf activity = getActivity();
        this.A = new admu();
        anfy anfyVar = this.z;
        if (anfyVar != null) {
            z = false;
            for (anfv anfvVar : anfyVar.c) {
                Optional optionalI = i(anfvVar);
                if (optionalI.isPresent()) {
                    z |= anfvVar.b == 153515154;
                    this.A.add(optionalI.get());
                    if (this.n) {
                        bog viewLifecycleOwner = getViewLifecycleOwner();
                        jnj jnjVar = this.v;
                        final admu admuVar = this.A;
                        final int size = admuVar.size() - 1;
                        final acpb acpbVar = new acpb(this, 12);
                        ajwo ajwoVar = (anfvVar.b == 66441155 ? (anga) anfvVar.c : anga.a).e;
                        if (ajwoVar == null) {
                            ajwoVar = ajwo.a;
                        }
                        aihl aihlVarCheckIsLite = aihn.checkIsLite(aohd.b);
                        ajwoVar.c(aihlVarCheckIsLite);
                        if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                            if ((anfvVar.b == 66441155 ? (anga) anfvVar.c : anga.a).i) {
                                jnjVar.getClass();
                                taf.k(viewLifecycleOwner, ahng.m(new UnsupportedOperationException("Not Implemented")), new adsl(3), new twi() { // from class: advr
                                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
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
                                        agke agkeVar = (agke) obj;
                                        if (agkeVar == null || agkeVar.isEmpty()) {
                                            return;
                                        }
                                        int i = size;
                                        admu admuVar2 = admuVar;
                                        agke agkeVar2 = (agke) Collection.EL.stream(agkeVar).map(new acfa(acpbVar, 7)).filter(new acwb(4)).map(new accu(18)).collect(aghu.a);
                                        if (agkeVar2.size() == 1) {
                                            admuVar2.set(i, agkeVar2.get(0));
                                        } else {
                                            admuVar2.remove(i);
                                            admuVar2.addAll(i, agkeVar2);
                                        }
                                    }
                                });
                            }
                        }
                    }
                }
            }
        } else {
            z = false;
        }
        Bundle arguments = getArguments();
        if (arguments != null && arguments.containsKey("VIDEO_QUALITY_DETAIL_TEXT")) {
            String string = arguments.getString("VIDEO_QUALITY_DETAIL_TEXT");
            for (int i = 0; i < this.A.size(); i++) {
                Object obj = this.A.get(i);
                if (obj instanceof adyl) {
                    adyl adylVar = (adyl) obj;
                    ajwo ajwoVarDS = yno.dS(adylVar.q);
                    if (ajwoVarDS != null) {
                        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(arfa.b);
                        ajwoVarDS.c(aihlVarCheckIsLite2);
                        if (ajwoVarDS.j.n(aihlVarCheckIsLite2.d)) {
                            adylVar.e(string);
                        }
                    }
                }
            }
        }
        if (this.A.isEmpty()) {
            zvp.a(zvn.b, zvm.z, "Bottom Sheet Menu is empty. No menu items were supported.");
        }
        if (!(z || this.r) || this.p == null || this.u == null) {
            adygVar = new adyg(getActivity(), this.A, this.s, this.t);
        } else {
            adlg adlgVar = new adlg();
            awmd awmdVar = this.p;
            awmdVar.getClass();
            adlgVar.d(adyj.class, new admj(awmdVar));
            awmd awmdVar2 = this.p;
            awmdVar2.getClass();
            adlgVar.d(adyl.class, new admj(awmdVar2));
            ahek ahekVar = this.u;
            ahekVar.getClass();
            admoVarD = ahekVar.d(adlgVar);
            admu admuVar2 = this.A;
            admuVar2.getClass();
            admoVarD.D(admuVar2, null);
        }
        if (activity != null) {
            adygVar = admoVarD;
            if (adygVar instanceof adyg) {
                adyg adygVar2 = (adyg) adygVar;
                if (adygVar2.getCount() == 0) {
                    return Optional.empty();
                }
                adzq adzqVar = new adzq(activity);
                this.B = adzqVar;
                adzqVar.setAdapter((ListAdapter) adygVar2);
                this.B.setOnItemClickListener(this);
                this.B.setDivider(null);
                this.B.setDividerHeight(0);
                return Optional.of(this.B);
            }
            if (adygVar instanceof admo) {
                admo admoVar = (admo) adygVar;
                Context context = getContext();
                if (admoVar.a() == 0 || this.o == null || context == null) {
                    return Optional.empty();
                }
                RecyclerView recyclerView = new RecyclerView(context);
                aebi aebiVar = this.o;
                aebiVar.getClass();
                aebiVar.a(recyclerView, admoVar, null).a(recyclerView);
                return Optional.of(recyclerView);
            }
        }
        adygVar = admoVarD;
        return Optional.empty();
    }

    @Override // defpackage.adyw
    protected final Optional o() {
        return Optional.ofNullable(this.q);
    }

    @Override // defpackage.adyw, defpackage.bp, defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public final void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
        abfv abfvVar = this.w;
        if (abfvVar != null) {
            abfvVar.m(this, "");
        }
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.containsKey("MENU_BOTTOM_SHEET_FRAGMENT_KEY")) {
            return;
        }
        try {
            this.z = (anfy) ahng.aA(arguments, "MENU_BOTTOM_SHEET_FRAGMENT_KEY", anfy.a, ExtensionRegistryLite.getGeneratedRegistry());
        } catch (aiik e) {
            ((agrc) ((agrc) ((agrc) y.b()).j(e)).k("com/google/android/libraries/youtube/rendering/ui/bottomsheet/MenuBottomSheetDialogFragment", "onCreate", (char) 202, "MenuBottomSheetDialogFragment.java")).t("Error decoding menu");
            this.z = anfy.a;
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.adyw, defpackage.cc
    public final void onDestroy() {
        super.onDestroy();
        abfv abfvVar = this.w;
        if (abfvVar != null) {
            abfvVar.o(this, "");
        }
        axlj axljVar = this.x;
        if (axljVar != null) {
            Object obj = axljVar.a.get("MENU_BOTTOM_SHEET_LISTENER_KEY");
            if (obj instanceof adyo) {
                ((adyo) obj).a();
            }
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ListView listView = this.B;
        if (listView == null || !(listView.getAdapter().getItem(i) instanceof qnx)) {
            return;
        }
        j((qnx) listView.getAdapter().getItem(i));
    }

    @Override // defpackage.adyw, defpackage.cc
    public final void onPause() {
        super.onPause();
        if (getActivity().isInPictureInPictureMode()) {
            dismiss();
        }
    }

    @Override // defpackage.adyw
    protected final Optional p() {
        return Optional.empty();
    }

    @Override // defpackage.adyw
    protected final Optional q() {
        return Optional.empty();
    }
}
