package defpackage;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.ui.presenter.MusicSnappyGridLayoutManager;
import com.google.android.apps.youtube.music.ui.presenter.MusicSnappyRecyclerView;
import j$.util.Collection;
import j$.util.Optional;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jcw implements adma {
    public final admo a;
    private final admd b;
    private final RecyclerView c;
    private final MusicSnappyRecyclerView d;
    private final Context e;
    private final jak f;
    private final View g;
    private final ViewGroup h;
    private final jba i;
    private final adlk j;
    private final jen k;
    private iwv l;
    private jal m;
    private RecyclerView n;
    private final jeo o;
    private final jnj p;
    private final ahud q;

    public jcw(Context context, jer jerVar, ahek ahekVar, ahud ahudVar, jnj jnjVar) {
        this.e = context;
        this.p = jnjVar;
        jdw jdwVar = new jdw(context);
        this.b = jdwVar;
        jak jakVar = new jak();
        this.f = jakVar;
        jakVar.b(new jdk(this, 1));
        View viewInflate = View.inflate(context, R.layout.music_carousel_shelf, null);
        this.g = viewInflate;
        this.h = (ViewGroup) viewInflate.findViewById(R.id.header_container);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.carousel_content);
        this.c = recyclerView;
        this.d = (MusicSnappyRecyclerView) viewInflate.findViewById(R.id.carousel_content_snappy);
        this.n = recyclerView;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 1, 0);
        this.q = ahudVar;
        this.n.ah(gridLayoutManager);
        this.n.setNestedScrollingEnabled(false);
        jba jbaVar = jerVar.a;
        this.i = jbaVar;
        this.n.aI(jbaVar.f());
        admo admoVarD = ahekVar.d(jbaVar);
        this.a = admoVarD;
        adlk adlkVar = new adlk(xgn.l, 0);
        this.j = adlkVar;
        jen jenVar = new jen(ajwd.COLLECTION_STYLE_ITEM_SIZE_UNKNOWN);
        this.k = jenVar;
        aihf aihfVarCreateBuilder = ailj.a.createBuilder();
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.carousel_two_column_item_extra_start_margin);
        aihfVarCreateBuilder.copyOnWrite();
        ailj ailjVar = (ailj) aihfVarCreateBuilder.instance;
        ailjVar.b |= 8;
        ailjVar.f = dimensionPixelSize;
        this.o = new jeo((ailj) aihfVarCreateBuilder.build(), 3);
        admoVarD.jR(adlkVar);
        admoVarD.jR(jenVar);
        admoVarD.D(jakVar, null);
        jdwVar.c(viewInflate);
        jdwVar.a.setImportantForAccessibility(2);
    }

    static int d(Context context, ajwd ajwdVar, List list) {
        boolean zAllMatch = Collection.EL.stream(list).allMatch(new iui(11));
        int integer = context.getResources().getInteger(R.integer.carousel_num_video_only_items_visible);
        if (zAllMatch && integer > 0) {
            return Math.round(jen.c(context, integer, -1) / 1.7777778f);
        }
        if (ajwdVar == ajwd.COLLECTION_STYLE_ITEM_SIZE_LARGE) {
            return jen.c(context, context.getResources().getInteger(R.integer.carousel_num_large_items_visible), context.getResources().getDimensionPixelSize(R.dimen.carousel_large_item_peek_width));
        }
        if (ajwdVar == ajwd.COLLECTION_STYLE_ITEM_SIZE_SMALL) {
            return jen.c(context, context.getResources().getInteger(R.integer.carousel_num_small_items_visible), context.getResources().getDimensionPixelSize(R.dimen.carousel_small_item_peek_width));
        }
        return ajwdVar == ajwd.COLLECTION_STYLE_ITEM_SIZE_EXTRA_SMALL ? jen.c(context, context.getResources().getInteger(R.integer.carousel_num_extra_small_items_visible), context.getResources().getDimensionPixelSize(R.dimen.carousel_small_item_peek_width)) : jen.c(context, context.getResources().getInteger(R.integer.carousel_num_medium_items_visible), context.getResources().getDimensionPixelSize(R.dimen.carousel_peek_width));
    }

    private static final int e(anlm anlmVar) {
        int i = (int) anlmVar.j;
        if (i <= 0) {
            return 1;
        }
        return i;
    }

    private static final boolean f(anlm anlmVar) {
        if (anlmVar.d.size() <= 0) {
            return false;
        }
        apji apjiVar = (apji) anlmVar.d.get(0);
        aihl aihlVarCheckIsLite = aihn.checkIsLite(anzj.a);
        apjiVar.c(aihlVarCheckIsLite);
        return apjiVar.j.n(aihlVarCheckIsLite.d);
    }

    @Override // defpackage.adma
    public final View a() {
        return ((jdw) this.b).a;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        RecyclerView recyclerView = this.n;
        Context context = this.e;
        kro.Z(recyclerView, context.getResources().getDimensionPixelSize(R.dimen.item_small_spacing), context.getResources().getDimensionPixelSize(R.dimen.item_small_spacing));
        jal jalVar = this.m;
        if (jalVar != null) {
            jalVar.c();
            this.m = null;
        }
        ahud ahudVar = this.q;
        if (ahudVar != null) {
            ahudVar.ae(this.n);
        }
        this.n.aH(this.l);
        this.f.clear();
        this.n.ad(null);
        kro.X(this.h, admhVar);
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
    @Override // defpackage.adma
    public final /* synthetic */ void hU(adly adlyVar, Object obj) {
        anld anldVar;
        int dimensionPixelSize;
        int iC;
        int dimensionPixelSize2;
        int i;
        adly adlyVarT;
        aiqe aiqeVar;
        anlm anlmVar = (anlm) obj;
        boolean zF = f(anlmVar);
        MusicSnappyRecyclerView musicSnappyRecyclerView = this.d;
        if (zF) {
            musicSnappyRecyclerView.setVisibility(0);
            this.c.setVisibility(8);
            this.n = musicSnappyRecyclerView;
        } else {
            musicSnappyRecyclerView.setVisibility(8);
            RecyclerView recyclerView = this.c;
            recyclerView.setVisibility(0);
            this.n = recyclerView;
        }
        boolean zF2 = f(anlmVar);
        Context context = this.e;
        np musicSnappyGridLayoutManager = zF2 ? new MusicSnappyGridLayoutManager(context, e(anlmVar)) : new GridLayoutManager(context, e(anlmVar), 0);
        this.n.ah(musicSnappyGridLayoutManager);
        this.n.setNestedScrollingEnabled(false);
        RecyclerView recyclerView2 = this.n;
        jba jbaVar = this.i;
        recyclerView2.aI(jbaVar.f());
        RecyclerView recyclerView3 = this.n;
        admo admoVar = this.a;
        recyclerView3.ad(admoVar);
        jal jalVarD = jeo.d(adlyVar);
        this.m = jalVarD;
        if (jalVarD != null) {
            jalVarD.b(musicSnappyGridLayoutManager);
        }
        ahud ahudVar = this.q;
        if (ahudVar != null) {
            ahudVar.ad(this.n, adlyVar.b);
        }
        if (!anlmVar.f.E()) {
            adlyVar.b.w(new xgj(anlmVar.f, (amud) null), null);
        }
        apji apjiVar = anlmVar.c;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        Optional optionalH = kro.H(apjiVar, anln.a);
        if (optionalH.isPresent()) {
            kro.P((anll) optionalH.get(), this.h, jbaVar, adlyVar);
        }
        View view = this.g;
        if ((anlmVar.b & 64) != 0) {
            anldVar = anlmVar.h;
            if (anldVar == null) {
                anldVar = anld.a;
            }
        } else {
            anldVar = null;
        }
        ixt.i(adlyVar, view, anldVar, false);
        this.j.a = adlyVar.b;
        jak jakVar = this.f;
        jakVar.clear();
        int iE = e(anlmVar);
        if (anlmVar.d.isEmpty()) {
            i = -1;
        } else {
            apji apjiVar2 = (apji) anlmVar.d.get(0);
            aihl aihlVarCheckIsLite = aihn.checkIsLite(anzj.a);
            apjiVar2.c(aihlVarCheckIsLite);
            boolean zN = apjiVar2.j.n(aihlVarCheckIsLite.d);
            int i2 = R.dimen.carousel_item_margin;
            if (zN) {
                int iB = adlyVar.b("pagePadding", -1);
                Context context2 = this.e;
                iC = jen.c(context2, context2.getResources().getInteger(R.integer.carousel_num_two_column_items_visible), context2.getResources().getDimensionPixelSize(R.dimen.carousel_two_column_item_peek_width));
                admoVar.jR(this.o);
                if (iB <= 0) {
                    i2 = R.dimen.carousel_two_column_item_horizontal_margin;
                }
                dimensionPixelSize2 = context2.getResources().getDimensionPixelSize(i2);
                dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.carousel_two_column_item_vertical_margin);
            } else {
                Context context3 = this.e;
                ajwd ajwdVarA = ajwd.a(anlmVar.e);
                if (ajwdVarA == null) {
                    ajwdVarA = ajwd.COLLECTION_STYLE_ITEM_SIZE_UNKNOWN;
                }
                int iD = d(context3, ajwdVarA, anlmVar.d);
                dimensionPixelSize = context3.getResources().getDimensionPixelSize(R.dimen.carousel_item_margin);
                iC = iD;
                dimensionPixelSize2 = dimensionPixelSize;
            }
            if (iE > 1) {
                RecyclerView recyclerView4 = this.n;
                recyclerView4.setPadding(recyclerView4.getPaddingLeft(), Math.max(0, this.n.getPaddingTop() - dimensionPixelSize2), this.n.getPaddingRight(), this.n.getPaddingBottom());
            }
            jen jenVar = this.k;
            jenVar.a = iC;
            ajwd ajwdVarA2 = ajwd.a(anlmVar.e);
            if (ajwdVarA2 == null) {
                ajwdVarA2 = ajwd.COLLECTION_STYLE_ITEM_SIZE_UNKNOWN;
            }
            jenVar.b = ajwdVarA2;
            iwv iwvVar = new iwv(iE, dimensionPixelSize2, dimensionPixelSize);
            this.l = iwvVar;
            this.n.aJ(iwvVar);
            i = -1;
        }
        int iB2 = adlyVar.b("pagePadding", i);
        if (iB2 > 0) {
            Context context4 = this.e;
            adlyVar.f("pagePadding", Integer.valueOf((iB2 + context4.getResources().getDimensionPixelSize(R.dimen.item_large_spacing)) - context4.getResources().getDimensionPixelSize(R.dimen.item_small_spacing)));
            adlyVarT = kro.T(this.n, adlyVar);
        } else {
            adlyVarT = adlyVar;
        }
        for (apji apjiVar3 : anlmVar.d) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(anzo.a);
            apjiVar3.c(aihlVarCheckIsLite2);
            if (apjiVar3.j.n(aihlVarCheckIsLite2.d)) {
                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(anzo.a);
                apjiVar3.c(aihlVarCheckIsLite3);
                Object objK = apjiVar3.j.k(aihlVarCheckIsLite3.d);
                jakVar.add(objK == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK));
            } else {
                aihl aihlVarCheckIsLite4 = aihn.checkIsLite(anso.a);
                apjiVar3.c(aihlVarCheckIsLite4);
                if (apjiVar3.j.n(aihlVarCheckIsLite4.d)) {
                    aihl aihlVarCheckIsLite5 = aihn.checkIsLite(anso.a);
                    apjiVar3.c(aihlVarCheckIsLite5);
                    Object objK2 = apjiVar3.j.k(aihlVarCheckIsLite5.d);
                    jakVar.add(objK2 == null ? aihlVarCheckIsLite5.b : aihlVarCheckIsLite5.c(objK2));
                } else {
                    aihl aihlVarCheckIsLite6 = aihn.checkIsLite(anzj.a);
                    apjiVar3.c(aihlVarCheckIsLite6);
                    if (apjiVar3.j.n(aihlVarCheckIsLite6.d)) {
                        aihl aihlVarCheckIsLite7 = aihn.checkIsLite(anzj.a);
                        apjiVar3.c(aihlVarCheckIsLite7);
                        Object objK3 = apjiVar3.j.k(aihlVarCheckIsLite7.d);
                        jakVar.add(objK3 == null ? aihlVarCheckIsLite7.b : aihlVarCheckIsLite7.c(objK3));
                    }
                }
            }
        }
        jakVar.i((tbk) jeo.b(adlyVar).orElse(null));
        admoVar.D(jakVar, adlyVarT);
        if ((anlmVar.b & 16) != 0) {
            aiqeVar = anlmVar.g;
            if (aiqeVar == null) {
                aiqeVar = aiqe.a;
            }
        } else {
            aiqeVar = null;
        }
        kro.aa(view, aiqeVar);
        this.b.e(adlyVar);
    }
}
