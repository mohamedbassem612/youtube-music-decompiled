package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.apps.youtube.music.R;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jbw extends admr {
    public final Context a;
    public final RecyclerView b;
    public ixi c;
    public ajsy d;
    public final RelativeLayout e;
    public boolean f;
    private final admd g;
    private final View h;
    private final View i;
    private final admu j;
    private final adlk k;
    private final LinearLayoutManager l;
    private ixr m;
    private avmn n;
    private boolean o;
    private final admo p;
    private final int q;
    private final vxz s;
    private final ahud t;

    public jbw(Context context, admh admhVar, ahek ahekVar, ahud ahudVar, adxj adxjVar, vxz vxzVar) {
        this.a = context;
        this.t = ahudVar;
        this.s = vxzVar;
        this.q = context.getResources().getDimensionPixelSize(R.dimen.chip_cloud_start_padding);
        jdw jdwVar = new jdw(context);
        this.g = jdwVar;
        RelativeLayout relativeLayout = (RelativeLayout) View.inflate(context, R.layout.chip_cloud, null);
        this.e = relativeLayout;
        RecyclerView recyclerView = (RecyclerView) relativeLayout.findViewById(R.id.chip_cloud);
        this.b = recyclerView;
        this.h = relativeLayout.findViewById(R.id.search_clear_button);
        this.i = relativeLayout.findViewById(R.id.search_clear_button_background);
        ImageView imageView = (ImageView) relativeLayout.findViewById(R.id.search_clear_button_icon);
        aduk adukVar = new aduk(context, adxjVar.b(arqz.oQ));
        adukVar.d(R.color.ytm_icon_color_active_inverse);
        imageView.setImageDrawable(adukVar.a());
        jbr jbrVar = new jbr(context);
        this.l = jbrVar;
        recyclerView.ah(jbrVar);
        recyclerView.aJ(new jbv(context.getResources()));
        jbs jbsVar = new jbs();
        this.j = jbsVar;
        if (admhVar instanceof admq) {
            recyclerView.aI(((admq) admhVar).c);
        }
        admo admoVarD = ahekVar.d(admhVar);
        this.p = admoVarD;
        adlk adlkVar = new adlk(xgn.l, 0);
        this.k = adlkVar;
        admoVarD.jR(adlkVar);
        admoVarD.D(jbsVar, null);
        admoVarD.t(true);
        recyclerView.ad(admoVarD);
        recyclerView.af(new lu());
        admoVarD.x(new jbu(this));
        jdwVar.c(relativeLayout);
    }

    private static final boolean i(List list, List list2, boolean z) {
        int size = list.size();
        int size2 = list2.size();
        if (z) {
            if (size2 <= 1 || size2 - size != 1 || !list2.subList(1, size2).containsAll(list)) {
                return false;
            }
        } else if (size <= 1 || size - size2 != 1 || !list.subList(1, size).containsAll(list2)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.adma
    public final View a() {
        return ((jdw) this.g).a;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        ixi ixiVar;
        g();
        this.e.setGravity(0);
        RecyclerView recyclerView = this.b;
        kro.Z(recyclerView, this.q, 0);
        View view = this.h;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.setMarginStart(0);
            view.setLayoutParams(layoutParams);
        }
        Object obj = this.n;
        if (obj != null) {
            awka.f((AtomicReference) obj);
            this.n = null;
        }
        vxz vxzVar = this.s;
        if (vxzVar.k(45861099L, false)) {
            view.setOnClickListener(null);
            this.d = null;
            this.k.a = xgn.l;
        }
        admu admuVar = this.j;
        admuVar.clear();
        if (vxzVar.k(45861099L, false)) {
            admo admoVar = this.p;
            admoVar.D(admuVar, new adly());
            recyclerView.suppressLayout(false);
            recyclerView.ax(admoVar, true);
            recyclerView.W(true);
            recyclerView.requestLayout();
        }
        if (this.o && (ixiVar = this.c) != null) {
            ixiVar.e();
            this.o = false;
        }
        this.c = null;
    }

    @Override // defpackage.admr
    protected final /* bridge */ /* synthetic */ void d(adly adlyVar, Object obj) {
        ajta ajtaVar = (ajta) obj;
        this.k.a = adlyVar.b;
        ViewGroup.LayoutParams layoutParams = ((jdw) this.g).a.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -2;
        }
        int iB = adlyVar.b("backgroundColor", this.a.getColor(R.color.black_header_color));
        RelativeLayout relativeLayout = this.e;
        relativeLayout.setBackgroundColor(iB);
        int i = 1;
        if (adlyVar.c("chipCloudController") instanceof ixi) {
            this.c = (ixi) adlyVar.c("chipCloudController");
        } else {
            ixi ixiVar = new ixi();
            this.c = ixiVar;
            ajsx ajsxVarA = ajsx.a(ajtaVar.f);
            if (ajsxVarA == null) {
                ajsxVarA = ajsx.CHIP_CLOUD_SELECTION_BEHAVIOR_UNKNOWN;
            }
            ixiVar.d = ajsxVarA;
            this.o = true;
            adlyVar.f("chipCloudController", ixiVar);
        }
        if (adlyVar.j("chipCloudCentered")) {
            relativeLayout.setGravity(1);
            RecyclerView recyclerView = this.b;
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) recyclerView.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.width = -2;
                recyclerView.setLayoutParams(layoutParams2);
            }
        }
        List list = adlyVar.c("headerItemModels") instanceof List ? (List) Collection.EL.stream((List) adlyVar.c("headerItemModels")).filter(new iui(10)).map(new ixa(4)).collect(Collectors.toList()) : (List) Collection.EL.stream(ajtaVar.c).filter(new gqn(7)).map(new hds(20)).collect(Collectors.toList());
        Object obj2 = this.n;
        if (obj2 != null) {
            awka.f((AtomicReference) obj2);
        }
        ixi ixiVar2 = this.c;
        if (ixiVar2 != null) {
            ixiVar2.h(list);
        }
        h(agpi.a, list, adlyVar);
        ixi ixiVar3 = this.c;
        if (ixiVar3 != null) {
            this.n = ixiVar3.b.P().p().i(new abwr(i)).al(new jbq(this, adlyVar, 0), new ihp(6));
        }
        int iB2 = adlyVar.b("chipCloudPagePadding", -1);
        if (iB2 > 0) {
            adlyVar.f("pagePadding", Integer.valueOf(iB2));
            kro.T(this.b, adlyVar);
        }
        this.p.D(this.j, adlyVar);
    }

    @Override // defpackage.admr
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((ajta) obj).d.G();
    }

    public final void f(int i) {
        RelativeLayout relativeLayout = this.e;
        ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i;
            relativeLayout.setLayoutParams(layoutParams);
        }
    }

    public final void g() {
        if (this.e != null) {
            f(-2);
        }
    }

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
    public final void h(List list, List list2, adly adlyVar) {
        ajsy ajsyVar;
        if (list.equals(list2)) {
            return;
        }
        if (i(list, list2, true)) {
            this.j.add(0, list2.get(0));
            this.f = true;
        } else {
            boolean zI = i(list, list2, false);
            admu admuVar = this.j;
            if (zI) {
                admuVar.remove(0);
            } else {
                admuVar.l(list2);
            }
        }
        Iterator it = list2.iterator();
        do {
            if (!it.hasNext()) {
                ajsyVar = null;
                break;
            }
            ajsyVar = (ajsy) it.next();
        } while (!gzj.I(ajsyVar));
        this.d = ajsyVar;
        if (ajsyVar == null || this.c == null) {
            View view = this.h;
            if (view.getVisibility() == 0) {
                ixr ixrVar = this.m;
                if (ixrVar == null) {
                    view.setVisibility(8);
                    return;
                }
                if (ixrVar.d && ixrVar.b && !ixrVar.c) {
                    ixrVar.b = false;
                    String name = View.SCALE_X.getName();
                    View view2 = ixrVar.a;
                    ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view2, PropertyValuesHolder.ofFloat(name, view2.getScaleX(), 0.0f), PropertyValuesHolder.ofFloat(View.SCALE_Y.getName(), view2.getScaleY(), 0.0f));
                    objectAnimatorOfPropertyValuesHolder.setDuration(ixrVar.e);
                    Animator animator = ixrVar.g;
                    if (animator != null && animator.isRunning()) {
                        ixrVar.g.cancel();
                    }
                    objectAnimatorOfPropertyValuesHolder.addListener(new ixq(ixrVar));
                    ixrVar.c = true;
                    ixrVar.g = objectAnimatorOfPropertyValuesHolder;
                    ixrVar.g.start();
                    return;
                }
                return;
            }
            return;
        }
        View view3 = this.h;
        if (view3.getVisibility() != 0) {
            view3.getClass();
            this.m = new ixr(view3);
            if (adlyVar.j("useAnimatedChipCloudFabAnimationConfig")) {
                ixr ixrVar2 = this.m;
                ixrVar2.e = com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowMinWidthMinor;
                ixrVar2.f = 225;
            }
            ixr ixrVar3 = this.m;
            ixrVar3.d = true;
            if (!ixrVar3.b) {
                ixrVar3.b = true;
                ObjectAnimator objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(ixrVar3.a, PropertyValuesHolder.ofFloat(View.SCALE_X.getName(), 0.0f, 1.0f), PropertyValuesHolder.ofFloat(View.SCALE_Y.getName(), 0.0f, 1.0f));
                objectAnimatorOfPropertyValuesHolder2.setDuration(ixrVar3.e);
                int i = ixrVar3.f;
                if (i != -1) {
                    objectAnimatorOfPropertyValuesHolder2.setStartDelay(i);
                }
                Animator animator2 = ixrVar3.g;
                if (animator2 != null && animator2.isRunning()) {
                    ixrVar3.g.cancel();
                }
                objectAnimatorOfPropertyValuesHolder2.addListener(new ixp(ixrVar3));
                ixrVar3.g = objectAnimatorOfPropertyValuesHolder2;
                ixrVar3.g.start();
            }
        }
        adlw adlwVarAc = this.t.ac(view3, new adlu() { // from class: jbp
            @Override // defpackage.adlu
            public final boolean hV(View view4) {
                jbw jbwVar = this.a;
                ixi ixiVar = jbwVar.c;
                if (ixiVar == null) {
                    return false;
                }
                ixiVar.i(jbwVar.d);
                return false;
            }
        });
        HashMap map = new HashMap();
        map.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.d);
        Object objC = adlyVar.c("sectionListController");
        if (objC != null) {
            map.put("sectionListController", objC);
        }
        xgn xgnVar = adlyVar.b;
        ajwo ajwoVar = this.d.g;
        if (ajwoVar == null) {
            ajwoVar = ajwo.a;
        }
        adlwVarAc.a(xgnVar, ajwoVar, map, null);
        Resources resources = this.a.getResources();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view3.getLayoutParams();
        if (layoutParams != null) {
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.cloud_chip_height);
            View view4 = this.i;
            ViewGroup.LayoutParams layoutParams2 = view4.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = dimensionPixelSize;
                layoutParams2.width = dimensionPixelSize;
                view4.setLayoutParams(layoutParams2);
            }
            layoutParams.height = dimensionPixelSize;
            layoutParams.width = dimensionPixelSize;
            layoutParams.setMarginStart(resources.getDimensionPixelSize(R.dimen.clear_search_icon_container_start_margin));
            int iB = adlyVar.b("chipCloudPagePadding", -1);
            if (iB > 0) {
                layoutParams.setMarginStart(iB);
            }
            view3.setLayoutParams(layoutParams);
        }
        aiqe aiqeVar = this.d.j;
        if (aiqeVar == null) {
            aiqeVar = aiqe.a;
        }
        if ((this.d.b & 64) == 0 || (aiqeVar.b & 1) == 0) {
            return;
        }
        aiqd aiqdVar = aiqeVar.c;
        if (aiqdVar == null) {
            aiqdVar = aiqd.a;
        }
        if ((aiqdVar.b & 2) != 0) {
            aiqd aiqdVar2 = aiqeVar.c;
            if (aiqdVar2 == null) {
                aiqdVar2 = aiqd.a;
            }
            view3.setContentDescription(aiqdVar2.c);
        }
    }
}
