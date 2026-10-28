package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jcu extends admr {
    private static final agrf b = agrf.h("com/google/android/apps/youtube/music/ui/presenter/MusicCardShelfPresenter");
    public final vxe a;
    private final Context c;
    private final izr d;
    private final jdr e;
    private izd f;
    private final jfr g;
    private final jdx h;
    private final izj i;
    private final LinearLayout j;
    private final agkj k;
    private final ImageView l;
    private jbm m;
    private jbm n;
    private jcs o;
    private final ViewGroup p;
    private final ViewGroup q;
    private final RecyclerView s;
    private final admu t;
    private final admo u;
    private final TextView v;
    private xgn w;
    private final jba x;
    private final jij y;

    public jcu(Context context, adhv adhvVar, vxe vxeVar, izr izrVar, jdr jdrVar, jer jerVar, ahek ahekVar, jij jijVar, jfr jfrVar, jdx jdxVar) {
        this.c = context;
        this.a = vxeVar;
        this.d = izrVar;
        this.e = jdrVar;
        this.y = jijVar;
        jfrVar.getClass();
        this.g = jfrVar;
        jdxVar.getClass();
        this.h = jdxVar;
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.music_card_shelf, (ViewGroup) null);
        this.j = linearLayout;
        this.p = (ViewGroup) linearLayout.findViewById(R.id.header_container);
        this.q = (ViewGroup) linearLayout.findViewById(R.id.shelf_divider);
        this.k = agkj.l(gzk.a, linearLayout.findViewById(R.id.music_card_container), gzk.b, linearLayout.findViewById(R.id.thumbnail_to_the_side_music_card_container), gzk.c, linearLayout.findViewById(R.id.thumbnail_above_music_card_container));
        this.s = (RecyclerView) linearLayout.findViewById(R.id.undercard_contents);
        jba jbaVar = jerVar.a;
        this.x = jbaVar;
        this.t = new admu();
        this.u = ahekVar.d(jbaVar);
        this.v = (TextView) linearLayout.findViewById(R.id.undercard_header);
        ImageView imageView = new ImageView(context);
        this.l = imageView;
        this.i = new izj(adhvVar, imageView);
    }

    @Override // defpackage.adma
    public final View a() {
        return this.j;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        this.o.a.setVisibility(8);
        this.q.setVisibility(8);
        this.p.setVisibility(8);
        TextView textView = this.v;
        textView.setVisibility(8);
        this.o.e.setContentDescription(null);
        this.g.b(admhVar);
        this.i.a();
        textView.setOnClickListener(null);
        izd izdVar = this.f;
        if (izdVar != null) {
            izdVar.c();
            this.f = null;
        }
        izr izrVar = this.d;
        izrVar.h(this.o.a);
        izrVar.g(this.o.h);
        this.o.b.removeAllViews();
        this.o.c.removeAllViews();
        kro.X(this.o.f, admhVar);
        kro.Z(this.j, 0, 0);
        this.o.i.setVisibility(8);
        kro.X(this.o.i, admhVar);
        this.o.j.setVisibility(8);
        this.o.k.setVisibility(8);
        this.o.l.setVisibility(8);
        jbm jbmVar = this.m;
        if (jbmVar != null) {
            jbmVar.b(admhVar);
        }
        jbm jbmVar2 = this.n;
        if (jbmVar2 != null) {
            jbmVar2.b(admhVar);
        }
        RecyclerView recyclerView = this.s;
        recyclerView.setVisibility(8);
        this.t.clear();
        recyclerView.ad(null);
    }

    /* JADX WARN: Code duplicated, block: B:126:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:164:0x0545  */
    /* JADX WARN: Code duplicated, block: B:166:0x0549  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.lang.CharSequence, java.lang.Object] */
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
    @Override // defpackage.admr
    public final /* synthetic */ void d(adly adlyVar, Object obj) {
        adly adlyVarT;
        Optional optionalEmpty;
        apji apjiVar;
        apji apjiVar2;
        int i;
        apji apjiVar3;
        int dimensionPixelSize;
        int dimensionPixelSize2;
        int dimensionPixelSize3;
        int iAS;
        jgf jgfVar;
        anlj anljVar = (anlj) obj;
        this.w = adlyVar.b;
        gzk gzkVar = gzk.a;
        View view = (View) this.k.get(adlyVar.d("musicCardShelfLayout", gzkVar));
        jcs jcsVar = this.o;
        if (jcsVar == null || jcsVar.a.getId() != view.getId()) {
            this.m = null;
            this.n = null;
            if (view == null) {
                throw new NullPointerException("Null musicCardContainer");
            }
            TextView textView = (TextView) view.findViewById(R.id.list_index);
            if (textView == null) {
                throw new NullPointerException("Null index");
            }
            ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.thumbnail_parent);
            if (viewGroup == null) {
                throw new NullPointerException("Null thumbnailParent");
            }
            FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.thumbnail_overlay_parent);
            if (frameLayout == null) {
                throw new NullPointerException("Null thumbnailOverlayParent");
            }
            TextView textView2 = (TextView) view.findViewById(R.id.title);
            if (textView2 == null) {
                throw new NullPointerException("Null title");
            }
            TextView textView3 = (TextView) view.findViewById(R.id.subtitle);
            if (textView3 == null) {
                throw new NullPointerException("Null subtitle");
            }
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.subtitle_badges_container);
            if (linearLayout == null) {
                throw new NullPointerException("Null subtitleBadgesContainer");
            }
            ImageView imageView = (ImageView) view.findViewById(R.id.end_icon);
            if (imageView == null) {
                throw new NullPointerException("Null endIcon");
            }
            ImageView imageView2 = (ImageView) view.findViewById(R.id.contextual_menu_anchor);
            if (imageView2 == null) {
                throw new NullPointerException("Null contextMenuIcon");
            }
            ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.custom_index_column_container);
            if (viewGroup2 == null) {
                throw new NullPointerException("Null customIndexColumnContainer");
            }
            LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.entity_buttons_container);
            if (linearLayout2 == null) {
                throw new NullPointerException("Null entityButtonsContainer");
            }
            FrameLayout frameLayout2 = (FrameLayout) view.findViewById(R.id.first_entity_button_container);
            if (frameLayout2 == null) {
                throw new NullPointerException("Null firstEntityButtonContainer");
            }
            FrameLayout frameLayout3 = (FrameLayout) view.findViewById(R.id.second_entity_button_container);
            if (frameLayout3 == null) {
                throw new NullPointerException("Null secondEntityButtonContainer");
            }
            TextView textView4 = (TextView) view.findViewById(R.id.first_entity_button);
            if (textView4 == null) {
                throw new NullPointerException("Null firstEntityButton");
            }
            TextView textView5 = (TextView) view.findViewById(R.id.second_entity_button);
            if (textView5 == null) {
                throw new NullPointerException("Null secondEntityButton");
            }
            this.o = new jcs(view, viewGroup, frameLayout, textView2, textView, textView3, linearLayout, imageView, imageView2, viewGroup2, linearLayout2, frameLayout2, frameLayout3, textView4, textView5);
        }
        this.o.a.setVisibility(0);
        if (((gzk) adlyVar.d("musicCardShelfLayout", gzkVar)) == gzk.c) {
            Context context = this.c;
            int dimensionPixelSize4 = context.getResources().getDimensionPixelSize(R.dimen.music_card_shelf_thumnbnail_above_thumbnail_max_size);
            this.o.b.getLayoutParams().height = dimensionPixelSize4;
            this.o.b.getLayoutParams().width = dimensionPixelSize4;
            this.j.addOnLayoutChangeListener(new jct(context.getResources().getDimensionPixelSize(R.dimen.music_card_shelf_thumnbnail_above_thumbnail_min_size), this.o.b));
        }
        izd izdVarAc = kro.ac(this.o.a, anljVar.c.G(), this.w);
        this.f = izdVarAc;
        izdVarAc.b(new jft(this, adlyVar, anljVar, this.w, 1));
        LinearLayout linearLayout3 = this.j;
        if (linearLayout3.getLayoutParams() == null) {
            adlyVarT = adlyVar;
        } else {
            linearLayout3.getLayoutParams().width = adlyVar.b("carouselItemWidth", -1);
            adlyVarT = kro.T(linearLayout3, adlyVar);
        }
        TypedValue typedValue = new TypedValue();
        Context context2 = this.c;
        context2.getTheme().resolveAttribute(android.R.attr.selectableItemBackground, typedValue, true);
        this.o.a.setForeground(dl.d(context2, typedValue.resourceId));
        TextView textView6 = this.o.d;
        alay alayVar = anljVar.e;
        if (alayVar == null) {
            alayVar = alay.a;
        }
        tuk.u(textView6, ackj.k(null, alayVar, null, false));
        alay alayVar2 = anljVar.f;
        if (alayVar2 == null) {
            alayVar2 = alay.a;
        }
        Spanned spannedK = ackj.k(null, alayVar2, null, true);
        alay alayVar3 = anljVar.f;
        if (alayVar3 == null) {
            alayVar3 = alay.a;
        }
        CharSequence charSequenceE = ackj.e(alayVar3);
        tuk.u(this.o.e, spannedK);
        if (TextUtils.isEmpty(charSequenceE)) {
            Optional optionalG = ixt.g(spannedK, context2.getResources());
            if (optionalG.isPresent()) {
                tuk.u(this.o.e, ackj.b(ackj.c(spannedK.toString()), (String) optionalG.get()));
                this.o.e.setContentDescription(optionalG.get());
            }
        } else {
            tuk.u(this.o.e, ackj.b(ackj.c(spannedK.toString()), charSequenceE.toString()));
            this.o.e.setContentDescription(charSequenceE);
        }
        if (this.o.f.getChildCount() > 0) {
            kro.X(this.o.f, this.x);
        }
        aiie aiieVar = anljVar.m;
        LinearLayout linearLayout4 = this.o.f;
        jba jbaVar = this.x;
        kro.W(aiieVar, linearLayout4, jbaVar, adlyVarT);
        new adxc(R.dimen.music_thumbnail_default_corner_radius).a(adlyVar, null, -1);
        apji apjiVar4 = anljVar.d;
        if (apjiVar4 == null) {
            apjiVar4 = apji.a;
        }
        Optional optionalH = kro.H(apjiVar4, anpp.a);
        if (optionalH.isPresent()) {
            jdr jdrVar = this.e;
            jdrVar.hU(adlyVarT, (anpo) optionalH.get());
            optionalEmpty = Optional.of(jdrVar.a);
        } else {
            apji apjiVar5 = anljVar.d;
            if (apjiVar5 == null) {
                apjiVar5 = apji.a;
            }
            Optional optionalH2 = kro.H(apjiVar5, anmn.a);
            if (optionalH2.isPresent()) {
                this.i.d((anmm) optionalH2.get());
                optionalEmpty = Optional.of(this.l);
            } else {
                apji apjiVar6 = anljVar.d;
                if (apjiVar6 == null) {
                    apjiVar6 = apji.a;
                }
                Optional optionalH3 = kro.H(apjiVar6, anyj.a);
                if (optionalH3.isPresent()) {
                    jfr jfrVar = this.g;
                    jfrVar.hU(adlyVarT, (anyi) optionalH3.get());
                    optionalEmpty = Optional.of(jfrVar.a);
                } else {
                    optionalEmpty = Optional.empty();
                }
            }
        }
        boolean zIsPresent = optionalEmpty.isPresent();
        jcs jcsVar2 = this.o;
        if (zIsPresent) {
            jcsVar2.b.removeAllViews();
            this.o.b.addView((View) optionalEmpty.get());
            ((FrameLayout.LayoutParams) ((View) optionalEmpty.get()).getLayoutParams()).gravity = 17;
            this.o.b.setVisibility(0);
        } else {
            jcsVar2.b.setVisibility(8);
        }
        if ((anljVar.b & SemanticState.ReadOnly) != 0) {
            apjiVar = anljVar.n;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
        } else {
            apjiVar = null;
        }
        Optional optionalH4 = kro.H(apjiVar, anqa.a);
        if (!optionalH4.isEmpty()) {
            int iOrdinal = ((gzk) adlyVarT.d("musicCardShelfLayout", gzkVar)).ordinal();
            if (iOrdinal == 1 || iOrdinal == 2) {
                dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.music_card_shelf_thumbnail_to_the_side_thumbnail_size);
                dimensionPixelSize2 = context2.getResources().getDimensionPixelSize(R.dimen.music_small_icon_size);
                dimensionPixelSize3 = context2.getResources().getDimensionPixelSize(R.dimen.item_small_spacing);
            } else {
                dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.two_column_item_image_size);
                dimensionPixelSize2 = context2.getResources().getDimensionPixelSize(R.dimen.music_extra_small_icon_size);
                dimensionPixelSize3 = context2.getResources().getDimensionPixelSize(R.dimen.item_extra_small_spacing);
            }
            apji apjiVar7 = anljVar.d;
            if (apjiVar7 == null) {
                apjiVar7 = apji.a;
            }
            Optional optionalH5 = kro.H(apjiVar7, anmn.a);
            if (optionalH5.isPresent()) {
                int iAS2 = a.aS(((anmm) optionalH5.get()).c);
                if (iAS2 == 0 || iAS2 != 2) {
                    jgfVar = new jgf(dimensionPixelSize, dimensionPixelSize);
                } else {
                    jgfVar = jgf.a(dimensionPixelSize);
                }
            } else {
                apji apjiVar8 = anljVar.d;
                if (apjiVar8 == null) {
                    apjiVar8 = apji.a;
                }
                Optional optionalH6 = kro.H(apjiVar8, anyj.a);
                if (optionalH6.isPresent()) {
                    aqmh aqmhVar = ((anyi) optionalH6.get()).c;
                    if (aqmhVar == null) {
                        aqmhVar = aqmh.a;
                    }
                    if (aawb.O(aqmhVar)) {
                        aqmh aqmhVar2 = ((anyi) optionalH6.get()).c;
                        if (aqmhVar2 == null) {
                            aqmhVar2 = aqmh.a;
                        }
                        if (!aawb.P(aqmhVar2) && (iAS = a.aS(((anyi) optionalH6.get()).e)) != 0 && iAS == 3) {
                            jgfVar = jgf.a(dimensionPixelSize);
                        }
                    }
                }
                jgfVar = new jgf(dimensionPixelSize, dimensionPixelSize);
            }
            adlyVarT.f("presenterSizeConstraint", jgfVar);
            adlyVarT.f("nowPlayingIndicatorSize", Integer.valueOf(dimensionPixelSize2));
            adlyVarT.f("nowPlayingIndicatorMargin", Integer.valueOf(dimensionPixelSize3));
            jdx jdxVar = this.h;
            jdxVar.hU(adlyVarT, (anpz) optionalH4.get());
            int iA = jbaVar.a(optionalH4.get());
            ViewGroup viewGroup3 = jdxVar.b;
            adul.j(viewGroup3, jdxVar, iA);
            this.o.c.addView(viewGroup3);
            this.o.c.getLayoutParams().width = dimensionPixelSize;
        }
        this.o.b.setVisibility(0);
        int size = anljVar.g.size();
        jcs jcsVar3 = this.o;
        if (size > 0) {
            jcsVar3.a.setBackgroundResource(R.drawable.search_card_main_entity_with_undercard_background);
            this.s.setBackgroundResource(R.drawable.search_card_undercard_background);
        } else {
            jcsVar3.a.setBackgroundResource(R.drawable.search_card_main_entity_background);
        }
        apji apjiVar9 = anljVar.i;
        if (apjiVar9 == null) {
            apjiVar9 = apji.a;
        }
        anfy anfyVar = (anfy) kro.H(apjiVar9, angi.a).orElse(null);
        izr izrVar = this.d;
        izrVar.d(this.o.a, anfyVar, anljVar, adlyVar.b);
        int size2 = anljVar.h.size();
        jcs jcsVar4 = this.o;
        if (size2 <= 0) {
            jcsVar4.j.setVisibility(8);
        } else {
            jcsVar4.j.setVisibility(0);
            adly adlyVar2 = new adly();
            adlyVar2.a(this.w);
            Optional optionalH7 = kro.H((apji) anljVar.h.get(0), ajnp.a);
            if (optionalH7.isPresent()) {
                this.o.k.setVisibility(0);
                jbm jbmVarA = this.m;
                if (jbmVarA == null) {
                    jij jijVar = this.y;
                    jcs jcsVar5 = this.o;
                    jbmVarA = jijVar.a(jcsVar5.m, jcsVar5.k, null, null, false);
                    this.m = jbmVarA;
                }
                jbmVarA.j(adlyVar2, (ajnf) optionalH7.get(), 27);
            }
            if (anljVar.h.size() >= 2) {
                Optional optionalH8 = kro.H((apji) anljVar.h.get(1), ajnp.a);
                if (optionalH8.isPresent()) {
                    this.o.l.setVisibility(0);
                    jbm jbmVarA2 = this.n;
                    if (jbmVarA2 == null) {
                        jij jijVar2 = this.y;
                        jcs jcsVar6 = this.o;
                        jbmVarA2 = jijVar2.a(jcsVar6.n, jcsVar6.l, null, null, false);
                        this.n = jbmVarA2;
                    }
                    jbmVarA2.j(adlyVar2, (ajnf) optionalH8.get(), 35);
                }
            }
        }
        if ((anljVar.b & SemanticState.Hidden) == 0) {
            apjiVar2 = anljVar.i;
            if (apjiVar2 == null) {
                apjiVar2 = apji.a;
            }
            anfy anfyVar2 = (anfy) kro.H(apjiVar2, angi.a).orElse(null);
            jcs jcsVar7 = this.o;
            i = 8;
            izrVar.m(jcsVar7.a, jcsVar7.h, anfyVar2, anljVar, adlyVar.b);
            anljVar = anljVar;
            this.o.g.setVisibility(8);
            this.o.h.setVisibility(0);
        } else {
            alja aljaVar = anljVar.l;
            if (aljaVar == null) {
                aljaVar = alja.a;
            }
            aliz alizVarA = aliz.a(aljaVar.c);
            if (alizVarA == null) {
                alizVarA = aliz.UNKNOWN;
            }
            if (alizVarA == aliz.CHEVRON_RIGHT) {
                this.o.g.setImageDrawable(new aduk(context2, R.drawable.yt_outline_chevron_right_vd_theme_24).a());
                this.o.g.setVisibility(0);
                this.o.h.setVisibility(8);
                i = 8;
            } else {
                apjiVar2 = anljVar.i;
                if (apjiVar2 == null) {
                    apjiVar2 = apji.a;
                }
                anfy anfyVar3 = (anfy) kro.H(apjiVar2, angi.a).orElse(null);
                jcs jcsVar8 = this.o;
                i = 8;
                izrVar.m(jcsVar8.a, jcsVar8.h, anfyVar3, anljVar, adlyVar.b);
                anljVar = anljVar;
                this.o.g.setVisibility(8);
                this.o.h.setVisibility(0);
            }
        }
        int size3 = anljVar.g.size();
        RecyclerView recyclerView = this.s;
        if (size3 == 0) {
            recyclerView.setVisibility(i);
        } else {
            recyclerView.setVisibility(0);
            int dimensionPixelSize5 = context2.getResources().getDimensionPixelSize(R.dimen.music_card_shelf_undercard_vertical_padding);
            recyclerView.setPadding(recyclerView.getPaddingLeft(), dimensionPixelSize5, recyclerView.getPaddingRight(), dimensionPixelSize5);
            recyclerView.ah(new LinearLayoutManager(context2, 1, false));
            recyclerView.aI(jbaVar.f());
            admo admoVar = this.u;
            recyclerView.ad(admoVar);
            admu admuVar = this.t;
            admuVar.clear();
            for (apji apjiVar10 : anljVar.g) {
                Optional optionalH9 = kro.H(apjiVar10, anzj.a);
                if (optionalH9.isPresent()) {
                    admuVar.add(optionalH9.get());
                } else {
                    Optional optionalH10 = kro.H(apjiVar10, angu.a);
                    if (optionalH10.isPresent()) {
                        admuVar.add(optionalH10.get());
                    }
                }
            }
            admoVar.D(admuVar, adlyVarT);
            adlyVarT.f("backgroundColor", 0);
        }
        if ((anljVar.b & SemanticState.Modal) != 0) {
            TextView textView7 = this.v;
            textView7.setVisibility(0);
            alay alayVar4 = anljVar.o;
            if (alayVar4 == null) {
                alayVar4 = alay.a;
            }
            textView7.setText(ackj.k(null, alayVar4, null, false));
            alay alayVar5 = anljVar.o;
            if (alayVar5 == null) {
                alayVar5 = alay.a;
            }
            if (alayVar5.c.size() > 0) {
                alay alayVar6 = anljVar.o;
                if (alayVar6 == null) {
                    alayVar6 = alay.a;
                }
                if ((((alba) alayVar6.c.get(0)).b & SemanticState.Modal) != 0) {
                    textView7.setOnClickListener(new gdp(this, anljVar, 18));
                }
                alay alayVar7 = anljVar.o;
                if (alayVar7 == null) {
                    alayVar7 = alay.a;
                }
                if (alayVar7.c.size() > 1) {
                    ((agrc) ((agrc) b.c()).k("com/google/android/apps/youtube/music/ui/presenter/MusicCardShelfPresenter", "presentUndercardHeader", 354, "MusicCardShelfPresenter.java")).t("Undercard text has more than one run.");
                }
            }
        }
        if (adlyVar.j("musicCardShelfPresentHeaderAndDivider")) {
            this.q.setVisibility(0);
            if ((anljVar.b & SemanticState.Focused) != 0) {
                apjiVar3 = anljVar.k;
                if (apjiVar3 == null) {
                    apjiVar3 = apji.a;
                }
            } else {
                apjiVar3 = null;
            }
            Optional optionalH11 = kro.H(apjiVar3, anli.a);
            if (optionalH11.isPresent()) {
                ViewGroup viewGroup4 = this.p;
                viewGroup4.setVisibility(0);
                aihf aihfVarCreateBuilder = anwt.a.createBuilder();
                alay alayVar8 = ((anlh) optionalH11.get()).b;
                if (alayVar8 == null) {
                    alayVar8 = alay.a;
                }
                aihfVarCreateBuilder.copyOnWrite();
                anwt anwtVar = (anwt) aihfVarCreateBuilder.instance;
                alayVar8.getClass();
                anwtVar.d = alayVar8;
                anwtVar.c |= 1;
                apji apjiVar11 = ((anlh) optionalH11.get()).d;
                if (apjiVar11 == null) {
                    apjiVar11 = apji.a;
                }
                aihfVarCreateBuilder.copyOnWrite();
                anwt anwtVar2 = (anwt) aihfVarCreateBuilder.instance;
                apjiVar11.getClass();
                anwtVar2.u = apjiVar11;
                anwtVar2.c |= 524288;
                aigj aigjVar = ((anlh) optionalH11.get()).c;
                aihfVarCreateBuilder.copyOnWrite();
                anwt anwtVar3 = (anwt) aihfVarCreateBuilder.instance;
                aigjVar.getClass();
                anwtVar3.c |= 65536;
                anwtVar3.r = aigjVar;
                kro.Q((anwt) aihfVarCreateBuilder.build(), viewGroup4, jbaVar, adlyVar);
            }
        }
    }

    @Override // defpackage.admr
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((anlj) obj).c.G();
    }
}
