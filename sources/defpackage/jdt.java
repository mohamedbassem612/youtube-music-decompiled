package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jdt extends admr {
    private static final agrf d = agrf.h("com/google/android/apps/youtube/music/ui/presenter/MusicImmersiveCarouselShelfPresenter");
    public final Context a;
    public final admo b;
    public final ImageView c;
    private final admd e;
    private final RecyclerView f;
    private final jak g;
    private final View h;
    private final ViewGroup i;
    private final ViewGroup j;
    private final View k;
    private final adia l;
    private final jds m;
    private final adlk n;
    private final jen o;
    private iwv p;
    private jal q;
    private final jnj s;
    private final ahud t;

    public jdt(Context context, adhv adhvVar, admh admhVar, ahud ahudVar, ahek ahekVar, jnj jnjVar) {
        this.a = context;
        jdw jdwVar = new jdw(context);
        this.e = jdwVar;
        jak jakVar = new jak();
        this.g = jakVar;
        jakVar.b(new jdk(this, 2));
        this.m = new jds(context, admhVar);
        View viewInflate = View.inflate(context, R.layout.music_immersive_carousel_shelf, null);
        this.h = viewInflate;
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.carousel_content);
        this.f = recyclerView;
        this.i = (ViewGroup) viewInflate.findViewById(R.id.header_container);
        this.j = (ViewGroup) viewInflate.findViewById(R.id.foreground_container);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.background_image);
        this.c = imageView;
        this.t = ahudVar;
        this.s = jnjVar;
        this.k = viewInflate.findViewById(R.id.background_uniform_overlay);
        this.l = new adia(adhvVar, imageView, false);
        recyclerView.ah(new LinearLayoutManager(context, 0, false));
        recyclerView.setNestedScrollingEnabled(false);
        if (admhVar instanceof admq) {
            recyclerView.aI(((admq) admhVar).c);
        } else {
            ((agrc) ((agrc) d.b().i(agso.a, "MusicImmCarouselPresent")).k("com/google/android/apps/youtube/music/ui/presenter/MusicImmersiveCarouselShelfPresenter", "<init>", 139, "MusicImmersiveCarouselShelfPresenter.java")).w("Unexpected view pool in immersive shelf: %s", admhVar);
        }
        admo admoVarD = ahekVar.d(admhVar);
        this.b = admoVarD;
        adlk adlkVar = new adlk(xgn.l, 0);
        this.n = adlkVar;
        jen jenVar = new jen(null);
        this.o = jenVar;
        admoVarD.jR(adlkVar);
        admoVarD.jR(jenVar);
        admoVarD.D(jakVar, null);
        jdwVar.c(viewInflate);
    }

    @Override // defpackage.adma
    public final View a() {
        return ((jdw) this.e).a;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        jal jalVar = this.q;
        if (jalVar != null) {
            jalVar.c();
        }
        ahud ahudVar = this.t;
        if (ahudVar != null) {
            ahudVar.ae(this.f);
        }
        RecyclerView recyclerView = this.f;
        recyclerView.aH(this.p);
        this.g.clear();
        recyclerView.ad(null);
        this.l.a();
        this.c.setImageMatrix(null);
        this.m.c(this.i);
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
    @Override // defpackage.admr
    protected final /* bridge */ /* synthetic */ void d(adly adlyVar, Object obj) {
        aiqe aiqeVar;
        RecyclerView recyclerView = this.f;
        anpq anpqVar = (anpq) obj;
        admo admoVar = this.b;
        recyclerView.ad(admoVar);
        jal jalVarD = jeo.d(adlyVar);
        this.q = jalVarD;
        if (jalVarD != null) {
            jalVarD.b(recyclerView.n);
        }
        jak jakVar = this.g;
        admoVar.D(jakVar, adlyVar);
        ahud ahudVar = this.t;
        if (ahudVar != null) {
            ahudVar.ad(recyclerView, adlyVar.b);
        }
        this.n.a = adlyVar.b;
        View view = this.h;
        if ((anpqVar.b & 64) != 0) {
            aiqeVar = anpqVar.i;
            if (aiqeVar == null) {
                aiqeVar = aiqe.a;
            }
        } else {
            aiqeVar = null;
        }
        kro.aa(view, aiqeVar);
        Context context = this.a;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.carousel_item_margin);
        iwv iwvVar = new iwv(1, dimensionPixelSize, dimensionPixelSize);
        this.p = iwvVar;
        recyclerView.aJ(iwvVar);
        jen jenVar = this.o;
        ajwd ajwdVarA = ajwd.a(anpqVar.e);
        if (ajwdVarA == null) {
            ajwdVarA = ajwd.COLLECTION_STYLE_ITEM_SIZE_UNKNOWN;
        }
        jenVar.a = jcw.d(context, ajwdVarA, anpqVar.d);
        ajwd ajwdVarA2 = ajwd.a(anpqVar.e);
        if (ajwdVarA2 == null) {
            ajwdVarA2 = ajwd.COLLECTION_STYLE_ITEM_SIZE_UNKNOWN;
        }
        jenVar.b = ajwdVarA2;
        for (apji apjiVar : anpqVar.d) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(anzo.a);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(anzo.a);
                apjiVar.c(aihlVarCheckIsLite2);
                Object objK = apjiVar.j.k(aihlVarCheckIsLite2.d);
                jakVar.add(objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            }
        }
        jakVar.i((tbk) jeo.b(adlyVar).orElse(null));
        apji apjiVar2 = anpqVar.f;
        if (apjiVar2 == null) {
            apjiVar2 = apji.a;
        }
        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(arfw.a);
        apjiVar2.c(aihlVarCheckIsLite3);
        Object objK2 = apjiVar2.j.k(aihlVarCheckIsLite3.d);
        if ((((arfv) (objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2))).b & 1) != 0) {
            boolean z = anpqVar.g;
            View view2 = this.k;
            if (z) {
                view2.setVisibility(8);
            } else {
                view2.setVisibility(0);
            }
            this.c.getLayoutParams().height = (int) (context.getResources().getConfiguration().orientation == 2 ? Math.min(context.getResources().getDisplayMetrics().heightPixels * 0.4f, context.getResources().getDimensionPixelSize(R.dimen.immersive_shelf_max_height)) : context.getResources().getDisplayMetrics().widthPixels / 1.769f);
            apji apjiVar3 = anpqVar.f;
            if (apjiVar3 == null) {
                apjiVar3 = apji.a;
            }
            aihl aihlVarCheckIsLite4 = aihn.checkIsLite(arfw.a);
            apjiVar3.c(aihlVarCheckIsLite4);
            Object objK3 = apjiVar3.j.k(aihlVarCheckIsLite4.d);
            aqmh aqmhVar = ((arfv) (objK3 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK3))).c;
            if (aqmhVar == null) {
                aqmhVar = aqmh.a;
            }
            this.l.f(aqmhVar, new qcb(this));
        } else {
            g();
        }
        if (anpqVar != null) {
            apji apjiVar4 = anpqVar.c;
            if (apjiVar4 == null) {
                apjiVar4 = apji.a;
            }
            aihl aihlVarCheckIsLite5 = aihn.checkIsLite(anln.a);
            apjiVar4.c(aihlVarCheckIsLite5);
            if (apjiVar4.j.n(aihlVarCheckIsLite5.d)) {
                apji apjiVar5 = anpqVar.c;
                if (apjiVar5 == null) {
                    apjiVar5 = apji.a;
                }
                aihl aihlVarCheckIsLite6 = aihn.checkIsLite(anln.a);
                apjiVar5.c(aihlVarCheckIsLite6);
                Object objK4 = apjiVar5.j.k(aihlVarCheckIsLite6.d);
                Object objC = objK4 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK4);
                ViewGroup viewGroup = this.i;
                jds jdsVar = this.m;
                anll anllVar = (anll) objC;
                viewGroup.addView(jdsVar.d(jdsVar.b(adlyVar), anllVar, null));
                int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.immersive_shelf_strapline_margin_top);
                apji apjiVar6 = anllVar.l;
                if (apjiVar6 == null) {
                    apjiVar6 = apji.a;
                }
                if (kro.H(apjiVar6, ajtd.a).isPresent()) {
                    dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.immersive_shelf_chip_cloud_margin_top);
                }
                aihf aihfVarCreateBuilder = ailj.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                ailj ailjVar = (ailj) aihfVarCreateBuilder.instance;
                ailjVar.b |= 1;
                ailjVar.c = dimensionPixelSize2;
                jle.b((ailj) aihfVarCreateBuilder.build(), this.j);
            }
        }
        this.e.e(adlyVar);
    }

    @Override // defpackage.admr
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((anpq) obj).h.G();
    }

    public final void g() {
        this.k.setVisibility(8);
    }

    @Override // defpackage.admr
    protected final boolean hT() {
        return true;
    }
}
