package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.common.ui.YouTubeButton;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jfz implements adma {
    private static final agrf g = agrf.h("com/google/android/apps/youtube/music/ui/presenter/MusicTwoRowItemPresenter");
    public final YouTubeTextView a;
    public final YouTubeTextView b;
    public anzn c;
    public final LinearLayout d;
    public final LinearLayout e;
    public boolean f = false;
    private final Context h;
    private final View i;
    private final YouTubeTextView j;
    private final izr k;
    private final vxe l;
    private final aekn m;
    private izd n;
    private final ViewGroup o;
    private final ViewGroup p;
    private final FrameLayout q;
    private final ImageView r;
    private final jfr s;
    private final admh t;
    private final izj u;
    private final ImageView v;
    private final View.OnLayoutChangeListener w;
    private final View.OnLayoutChangeListener x;
    private final jii y;
    private kyr z;

    /* JADX WARN: Type inference failed for: r13v11, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v13, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v5, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v7, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v9, types: [awmd, java.lang.Object] */
    public jfz(Context context, vxe vxeVar, ViewGroup viewGroup, izr izrVar, jfr jfrVar, admh admhVar, aekn aeknVar, adhv adhvVar, ahgb ahgbVar) {
        this.h = context;
        this.l = vxeVar;
        this.m = aeknVar;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.music_two_row_item, viewGroup, false);
        this.i = viewInflate;
        this.a = (YouTubeTextView) viewInflate.findViewById(R.id.title);
        YouTubeTextView youTubeTextView = (YouTubeTextView) viewInflate.findViewById(R.id.subtitle);
        this.b = youTubeTextView;
        YouTubeTextView youTubeTextView2 = (YouTubeTextView) viewInflate.findViewById(R.id.third_title);
        this.j = youTubeTextView2;
        this.k = izrVar;
        this.o = (ViewGroup) viewInflate.findViewById(R.id.thumbnail_outer_container);
        this.p = (ViewGroup) viewInflate.findViewById(R.id.thumbnail_container);
        this.q = (FrameLayout) viewInflate.findViewById(R.id.thumbnail_corner_overlay_container);
        this.r = new ImageView(context);
        this.s = jfrVar;
        this.t = admhVar;
        this.d = (LinearLayout) viewInflate.findViewById(R.id.subtitle_badges_container);
        this.e = (LinearLayout) viewInflate.findViewById(R.id.title_badges_container);
        YouTubeButton youTubeButton = (YouTubeButton) viewInflate.findViewById(R.id.reminder_button);
        Context context2 = (Context) ahgbVar.e.io();
        context2.getClass();
        tfq tfqVar = (tfq) ahgbVar.d.io();
        tfqVar.getClass();
        tts ttsVar = (tts) ahgbVar.c.io();
        ttsVar.getClass();
        vxe vxeVar2 = (vxe) ahgbVar.b.io();
        vxeVar2.getClass();
        ijt ijtVar = (ijt) ahgbVar.a.io();
        ijtVar.getClass();
        youTubeButton.getClass();
        this.y = new jii(context2, tfqVar, ttsVar, vxeVar2, ijtVar, youTubeButton);
        ImageView imageView = new ImageView(context);
        this.v = imageView;
        this.u = new izj(adhvVar, imageView);
        this.w = new jfx(this, 1);
        this.x = new jfx(this, 0);
        youTubeTextView.setTextColor(context.getColor(R.color.yt_white1_opacity70));
        youTubeTextView2.setTextColor(context.getColor(R.color.yt_white1_opacity70));
    }

    private static final void d(TextView textView, CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(charSequence, TextView.BufferType.NORMAL);
        }
    }

    private final jgf e(adly adlyVar, int i) {
        int i2 = i - 1;
        int iB = adlyVar.b("shelfItemWidthOverridePx", -1);
        if (iB <= 0) {
            iB = adlyVar.b("carouselItemWidth", this.h.getResources().getDimensionPixelSize(R.dimen.two_row_item_thumbnail_height));
            if (i2 == 2) {
                return new jgf(Math.round(iB * 1.7777778f), iB);
            }
        } else if (i2 == 2) {
            return jgf.a(iB);
        }
        return new jgf(iB, iB);
    }

    @Override // defpackage.adma
    public final View a() {
        return this.i;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        ViewGroup viewGroup = this.p;
        jfr jfrVar = this.s;
        viewGroup.removeView(jfrVar.a);
        jfrVar.b(admhVar);
        viewGroup.removeView(this.v);
        this.q.removeAllViews();
        this.u.a();
        izr izrVar = this.k;
        View view = this.i;
        izrVar.h(view);
        izd izdVar = this.n;
        if (izdVar != null) {
            izdVar.c();
            this.n = null;
        }
        this.f = false;
        kro.X(viewGroup, admhVar);
        LinearLayout linearLayout = this.d;
        kro.X(linearLayout, admhVar);
        LinearLayout linearLayout2 = this.e;
        kro.X(linearLayout2, admhVar);
        this.c = null;
        linearLayout.removeOnLayoutChangeListener(this.w);
        linearLayout2.removeOnLayoutChangeListener(this.x);
        kyr kyrVar = this.z;
        if (kyrVar != null) {
            kyrVar.t();
            this.z = null;
        }
        this.y.b();
        view.setBackground(null);
        this.b.setContentDescription(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.CharSequence, java.lang.Object] */
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
        ajwo ajwoVar;
        ajwo ajwoVar2;
        alay alayVar;
        alay alayVar2;
        alay alayVar3;
        View view;
        alay alayVar4;
        int i;
        int i2;
        int i3;
        int i4;
        aiqe aiqeVar;
        String strA;
        ajwo ajwoVar3;
        jdx jdxVar;
        int iAU;
        Object objValueOf;
        anzn anznVar = (anzn) obj;
        if (anznVar != null) {
            View view2 = this.i;
            int iAS = a.aS(anznVar.s);
            float f = 1.0f;
            if (iAS != 0 && iAS == 3) {
                f = 0.4f;
            }
            view2.setAlpha(f);
            if (adlyVar.j("twoRowItemShouldHaveMatchParentWidth")) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                layoutParams.getClass();
                layoutParams.width = -1;
                view2.setLayoutParams(layoutParams);
            } else {
                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                layoutParams2.getClass();
                layoutParams2.width = -2;
                view2.setLayoutParams(layoutParams2);
            }
            if (adlyVar.j("logClientVe")) {
                xgn xgnVar = adlyVar.b;
                int i5 = anznVar.b;
                if ((i5 & 4) == 0 || (i5 & 8) == 0) {
                    objValueOf = Integer.valueOf(System.identityHashCode(this));
                } else {
                    alay alayVar5 = anznVar.e;
                    if (alayVar5 == null) {
                        alayVar5 = alay.a;
                    }
                    String str = alayVar5.d;
                    alay alayVar6 = anznVar.f;
                    if (alayVar6 == null) {
                        alayVar6 = alay.a;
                    }
                    objValueOf = String.valueOf(str).concat(String.valueOf(alayVar6.d));
                }
                argn argnVarG = xgnVar.g(objValueOf, xhb.b(39328));
                if (argnVarG == null) {
                    ((agrc) ((agrc) g.c().i(agso.a, "MusicTwoRowItemPresente")).k("com/google/android/apps/youtube/music/ui/presenter/MusicTwoRowItemPresenter", "present", 254, "MusicTwoRowItemPresenter.java")).t("Music Placeholder Downloads Carousel Shelf VE is null");
                    zvp.a(zvn.a, zvm.n, "Music Placeholder Downloads Carousel Shelf VE is null");
                } else {
                    aigj aigjVar = (aigj) adlyVar.d("parentTrackingParams", null);
                    if (aigjVar != null) {
                        adlyVar.b.m(new xgx(argnVarG), new xgj(aigjVar.G()));
                    }
                }
                String strI = adlyVar.b.i();
                ajwo ajwoVar4 = anznVar.h;
                if (ajwoVar4 == null) {
                    ajwoVar4 = ajwo.a;
                }
                aihl aihlVar = aoaq.b;
                aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
                ajwoVar4.c(aihlVarCheckIsLite);
                if (!ajwoVar4.j.n(aihlVarCheckIsLite.d) && strI != null && argnVarG != null) {
                    aihf aihfVarCreateBuilder = aoar.a.createBuilder();
                    aihfVarCreateBuilder.copyOnWrite();
                    aoar aoarVar = (aoar) aihfVarCreateBuilder.instance;
                    aoarVar.b |= 2;
                    aoarVar.d = 39328;
                    aihfVarCreateBuilder.copyOnWrite();
                    aoar aoarVar2 = (aoar) aihfVarCreateBuilder.instance;
                    aoarVar2.b |= 1;
                    aoarVar2.c = strI;
                    int i6 = argnVarG.f;
                    aihfVarCreateBuilder.copyOnWrite();
                    aoar aoarVar3 = (aoar) aihfVarCreateBuilder.instance;
                    aoarVar3.b |= 4;
                    aoarVar3.e = i6;
                    aoar aoarVar4 = (aoar) aihfVarCreateBuilder.build();
                    aihf builder = anznVar.toBuilder();
                    ajwo ajwoVar5 = anznVar.h;
                    if (ajwoVar5 == null) {
                        ajwoVar5 = ajwo.a;
                    }
                    aihh aihhVar = (aihh) ajwoVar5.toBuilder();
                    aihhVar.e(aihlVar, aoarVar4);
                    ajwo ajwoVar6 = (ajwo) aihhVar.build();
                    builder.copyOnWrite();
                    anzn anznVar2 = (anzn) builder.instance;
                    ajwoVar6.getClass();
                    anznVar2.h = ajwoVar6;
                    anznVar2.b |= 32;
                    anznVar = (anzn) builder.build();
                }
            } else if (!anznVar.u.E()) {
                adlyVar.b.w(new xgj(anznVar.u, (amud) null), null);
            }
            if (this.c == null) {
                this.c = anznVar;
            }
            this.n = kro.ac(view2, anznVar.u.G(), adlyVar.b);
            vxe vxeVar = this.l;
            xgn xgnVar2 = adlyVar.b;
            if ((anznVar.b & 32) != 0) {
                ajwoVar = anznVar.h;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
            } else {
                ajwoVar = null;
            }
            izb izbVarB = izb.b(vxeVar, xgnVar2, ajwoVar, adlyVar.e());
            if (izbVarB != null) {
                this.n.b(izbVarB);
            }
            xgn xgnVar3 = adlyVar.b;
            if ((anznVar.b & 64) != 0) {
                ajwoVar2 = anznVar.i;
                if (ajwoVar2 == null) {
                    ajwoVar2 = ajwo.a;
                }
            } else {
                ajwoVar2 = null;
            }
            izb izbVarB2 = izb.b(vxeVar, xgnVar3, ajwoVar2, adlyVar.e());
            if (izbVarB2 != null) {
                this.n.a(izbVarB2);
            }
            apji apjiVar = anznVar.c;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            Optional optionalH = kro.H(apjiVar, anyj.a);
            if (optionalH.isPresent() && (iAU = a.aU(((anyi) optionalH.get()).d)) != 0 && iAU == 2) {
                this.a.setTextAlignment(4);
                this.b.setTextAlignment(4);
                this.j.setTextAlignment(4);
            } else {
                this.a.setTextAlignment(5);
                this.b.setTextAlignment(5);
                this.j.setTextAlignment(5);
            }
            YouTubeTextView youTubeTextView = this.a;
            if ((anznVar.b & 4) != 0) {
                alayVar = anznVar.e;
                if (alayVar == null) {
                    alayVar = alay.a;
                }
            } else {
                alayVar = null;
            }
            d(youTubeTextView, ackj.k(null, alayVar, null, false));
            if ((anznVar.b & 8) != 0) {
                alayVar2 = anznVar.f;
                if (alayVar2 == null) {
                    alayVar2 = alay.a;
                }
            } else {
                alayVar2 = null;
            }
            Spanned spannedK = ackj.k(null, alayVar2, null, true);
            if ((anznVar.b & 8) != 0) {
                alayVar3 = anznVar.f;
                if (alayVar3 == null) {
                    alayVar3 = alay.a;
                }
            } else {
                alayVar3 = null;
            }
            CharSequence charSequenceE = alayVar3 != null ? ackj.e(alayVar3) : null;
            YouTubeTextView youTubeTextView2 = this.b;
            d(youTubeTextView2, spannedK);
            if (TextUtils.isEmpty(charSequenceE)) {
                Optional optionalG = ixt.g(spannedK, this.h.getResources());
                if (optionalG.isPresent()) {
                    d(youTubeTextView2, ackj.b(ackj.c(spannedK.toString()), (String) optionalG.get()));
                    youTubeTextView2.setContentDescription(optionalG.get());
                }
            } else {
                d(youTubeTextView2, ackj.b(ackj.c(spannedK.toString()), charSequenceE.toString()));
                youTubeTextView2.setContentDescription(charSequenceE);
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if ((anznVar.b & SemanticState.Obscured) != 0) {
                apji apjiVar2 = anznVar.p;
                if (apjiVar2 == null) {
                    apjiVar2 = apji.a;
                }
                arrayList.add(apjiVar2);
                this.f = true;
            } else {
                this.f = false;
            }
            ajwd ajwdVar = ajwd.COLLECTION_STYLE_ITEM_SIZE_MEDIUM;
            ajwd ajwdVarB = jen.b(adlyVar, ajwdVar);
            ajwd ajwdVar2 = ajwd.COLLECTION_STYLE_ITEM_SIZE_SMALL;
            if (ajwdVarB == ajwdVar2) {
                arrayList.addAll(anznVar.m);
                LinearLayout linearLayout = this.e;
                view = view2;
                linearLayout.setPadding(linearLayout.getPaddingLeft(), this.h.getResources().getDimensionPixelSize(R.dimen.music_small_inline_title_badge_padding_top), linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
                this.f = true;
            } else {
                view = view2;
                if (jen.b(adlyVar, ajwdVar) != ajwd.COLLECTION_STYLE_ITEM_SIZE_EXTRA_SMALL) {
                    LinearLayout linearLayout2 = this.e;
                    linearLayout2.setPadding(linearLayout2.getPaddingLeft(), this.h.getResources().getDimensionPixelSize(R.dimen.music_medium_inline_title_badge_padding_top), linearLayout2.getPaddingRight(), linearLayout2.getPaddingBottom());
                    arrayList2.addAll(anznVar.m);
                }
            }
            LinearLayout linearLayout3 = this.e;
            linearLayout3.addOnLayoutChangeListener(this.x);
            admh admhVar = this.t;
            kro.W(arrayList, linearLayout3, admhVar, adlyVar);
            LinearLayout linearLayout4 = this.d;
            linearLayout4.addOnLayoutChangeListener(this.w);
            kro.W(arrayList2, linearLayout4, admhVar, adlyVar);
            YouTubeTextView youTubeTextView3 = this.j;
            if ((anznVar.b & 16) != 0) {
                alayVar4 = anznVar.g;
                if (alayVar4 == null) {
                    alayVar4 = alay.a;
                }
            } else {
                alayVar4 = null;
            }
            d(youTubeTextView3, ackj.k(null, alayVar4, null, false));
            adlyVar.f("roundedCornersResId", Integer.valueOf(R.dimen.two_row_item_thumbnail_corner_radius));
            int iAS2 = a.aS(anznVar.d);
            if (iAS2 == 0) {
                iAS2 = 1;
            }
            jgf jgfVarE = e(adlyVar, iAS2);
            ViewGroup viewGroup = this.p;
            jgfVarE.b(viewGroup);
            FrameLayout frameLayout = this.q;
            jgfVarE.b(frameLayout);
            apji apjiVar3 = anznVar.c;
            if (apjiVar3 == null) {
                apjiVar3 = apji.a;
            }
            Optional optionalH2 = kro.H(apjiVar3, anyj.a);
            apji apjiVar4 = anznVar.c;
            if (apjiVar4 == null) {
                apjiVar4 = apji.a;
            }
            Optional optionalH3 = kro.H(apjiVar4, anmn.a);
            if (optionalH2.isPresent()) {
                jfr jfrVar = this.s;
                jfrVar.hU(adlyVar, (anyi) optionalH2.get());
                viewGroup.removeAllViews();
                viewGroup.addView(jfrVar.a);
            } else if (optionalH3.isPresent()) {
                this.u.d((anmm) optionalH3.get());
                viewGroup.removeAllViews();
                viewGroup.addView(this.v);
            }
            if (this.s.a.a) {
                this.o.setForeground(this.h.getDrawable(R.drawable.circle_thumbnail_ripple));
            } else {
                Context context = this.h;
                RippleDrawable rippleDrawable = (RippleDrawable) context.getDrawable(R.drawable.thumbnail_ripple);
                if (rippleDrawable != null && (rippleDrawable.getDrawable(0) instanceof GradientDrawable)) {
                    ((GradientDrawable) rippleDrawable.getDrawable(0)).setCornerRadius(context.getResources().getDimensionPixelSize(R.dimen.two_row_item_thumbnail_corner_radius));
                }
                this.o.setForeground(rippleDrawable);
            }
            if (jen.b(adlyVar, ajwdVar) == ajwdVar2) {
                Context context2 = this.h;
                youTubeTextView.setMaxLines(context2.getResources().getInteger(R.integer.two_row_item_num_text_rows));
                youTubeTextView2.setMaxLines(context2.getResources().getInteger(R.integer.two_row_item_num_text_rows_small_size));
                youTubeTextView3.setMaxLines(context2.getResources().getInteger(R.integer.two_row_item_num_text_rows_small_size));
                youTubeTextView.setTextSize(2, 12.0f);
                youTubeTextView2.setVisibility(8);
                youTubeTextView3.setVisibility(8);
            } else {
                ajwd ajwdVarB2 = jen.b(adlyVar, ajwdVar);
                ajwd ajwdVar3 = ajwd.COLLECTION_STYLE_ITEM_SIZE_EXTRA_SMALL;
                Context context3 = this.h;
                if (ajwdVarB2 == ajwdVar3) {
                    youTubeTextView.setMaxLines(context3.getResources().getInteger(R.integer.two_row_item_num_text_rows_small_size));
                    youTubeTextView2.setMaxLines(context3.getResources().getInteger(R.integer.two_row_item_num_text_rows_small_size));
                    youTubeTextView3.setMaxLines(context3.getResources().getInteger(R.integer.two_row_item_num_text_rows_small_size));
                    youTubeTextView.setTextSize(2, 12.0f);
                    youTubeTextView2.setVisibility(8);
                    youTubeTextView3.setVisibility(8);
                } else {
                    youTubeTextView.setMaxLines(context3.getResources().getInteger(R.integer.two_row_item_num_text_rows));
                    youTubeTextView2.setMaxLines(context3.getResources().getInteger(R.integer.two_row_item_num_text_rows));
                    youTubeTextView3.setMaxLines(context3.getResources().getInteger(R.integer.two_row_item_num_text_rows));
                    youTubeTextView.setTextSize(2, 14.0f);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            int iAS3 = a.aS(anznVar.d);
            if (iAS3 == 0) {
                iAS3 = 1;
            }
            jgf jgfVarE2 = e(adlyVar, iAS3);
            adly adlyVar2 = new adly(adlyVar);
            adlyVar2.f("presenterSizeConstraint", jgfVarE2);
            int iOrdinal = jen.b(adlyVar, ajwdVar).ordinal();
            if (iOrdinal != 1) {
                i4 = R.dimen.music_two_row_overlay_size_small;
                if (iOrdinal != 2) {
                    i2 = R.dimen.music_two_row_play_button_size;
                    if (iOrdinal != 5) {
                        i4 = R.dimen.music_two_row_overlay_now_playing_indicator_size;
                        i = R.dimen.item_small_spacing;
                    } else {
                        i = R.dimen.item_medium_spacing;
                    }
                    i3 = i4;
                    i4 = R.dimen.music_two_row_overlay_size;
                } else {
                    i2 = R.dimen.music_two_row_play_button_size_small;
                    i3 = R.dimen.music_small_icon_size;
                    i = R.dimen.item_small_spacing;
                }
            } else {
                i = R.dimen.item_extra_small_spacing;
                i2 = R.dimen.music_two_row_play_button_size_extra_small;
                i3 = R.dimen.music_extra_small_icon_size;
                i4 = R.dimen.music_two_row_overlay_size_extra_small;
            }
            Context context4 = this.h;
            adlyVar2.f("playButtonSize", Integer.valueOf(context4.getResources().getDimensionPixelSize(i2)));
            adlyVar2.f("animatedEqualizerSize", Integer.valueOf(context4.getResources().getDimensionPixelSize(i4)));
            adlyVar2.f("nowPlayingIndicatorSize", Integer.valueOf(context4.getResources().getDimensionPixelSize(i3)));
            adlyVar2.f("nowPlayingIndicatorMargin", Integer.valueOf(context4.getResources().getDimensionPixelSize(i)));
            adlyVar2.f("thumbnailOverlaySize", Integer.valueOf(context4.getResources().getDimensionPixelSize(R.dimen.music_two_row_overlay_size)));
            Iterator it = anznVar.l.iterator();
            while (it.hasNext()) {
                Optional optionalH4 = kro.H((apji) it.next(), anqa.a);
                if (optionalH4.isPresent() && (jdxVar = (jdx) adul.e(admhVar, (anpz) optionalH4.get(), viewGroup)) != null) {
                    jdxVar.hU(adlyVar2, (anpz) optionalH4.get());
                    int iA = admhVar.a(optionalH4.get());
                    ViewGroup viewGroup2 = jdxVar.b;
                    adul.j(viewGroup2, jdxVar, iA);
                    viewGroup.addView(viewGroup2);
                    arrayList3.add(jdxVar);
                }
            }
            this.z = new kyr((jbb[]) arrayList3.toArray(new jbb[0]));
            apji apjiVar5 = anznVar.r;
            if (apjiVar5 == null) {
                apjiVar5 = apji.a;
            }
            Optional optionalH5 = kro.H(apjiVar5, anyj.a);
            if (optionalH5.isPresent()) {
                anyi anyiVar = (anyi) optionalH5.get();
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(context4.getResources().getDimensionPixelSize(R.dimen.two_row_item_thumbnail_corner_radius));
                int color = context4.getColor(R.color.thumbnail_corner_overlay_background_start);
                int color2 = context4.getColor(R.color.music_full_transparent);
                gradientDrawable.setColors(new int[]{color, color2, color2});
                gradientDrawable.setGradientCenter(0.66f, 0.0f);
                gradientDrawable.setOrientation(GradientDrawable.Orientation.BOTTOM_TOP);
                ImageView imageView = this.r;
                imageView.setBackground(gradientDrawable);
                frameLayout.addView(imageView);
                adlyVar.f("applyThumbnailRipple", Boolean.FALSE);
                jfr jfrVar2 = (jfr) adul.e(admhVar, anyiVar, frameLayout);
                if (jfrVar2 != null) {
                    jfrVar2.hU(adlyVar, anyiVar);
                    int iA2 = admhVar.a(optionalH5.get());
                    View view3 = jfrVar2.a;
                    adul.j(view3, jfrVar2, iA2);
                    int dimensionPixelSize = context4.getResources().getDimensionPixelSize(R.dimen.two_row_item_corner_avatar_width);
                    int dimensionPixelSize2 = context4.getResources().getDimensionPixelSize(R.dimen.two_row_item_corner_avatar_height);
                    int dimensionPixelSize3 = context4.getResources().getDimensionPixelSize(R.dimen.item_small_spacing);
                    FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize2);
                    layoutParams3.setMargins(dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize3);
                    layoutParams3.gravity = 8388691;
                    view3.setLayoutParams(layoutParams3);
                    view3.setForeground(context4.getDrawable(R.drawable.thumbnail_corner_avatar_background));
                    apji apjiVar6 = anznVar.r;
                    if (apjiVar6 == null) {
                        apjiVar6 = apji.a;
                    }
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(anyj.a);
                    apjiVar6.c(aihlVarCheckIsLite2);
                    Object objK = apjiVar6.j.k(aihlVarCheckIsLite2.d);
                    anyi anyiVar2 = (anyi) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                    this.n = kro.ac(view3, anznVar.u.G(), adlyVar.b);
                    xgn xgnVar4 = adlyVar.b;
                    if ((anyiVar2.b & 64) != 0) {
                        ajwoVar3 = anyiVar2.g;
                        if (ajwoVar3 == null) {
                            ajwoVar3 = ajwo.a;
                        }
                    } else {
                        ajwoVar3 = null;
                    }
                    izb izbVarB3 = izb.b(vxeVar, xgnVar4, ajwoVar3, adlyVar.e());
                    if (izbVarB3 != null) {
                        this.n.b(izbVarB3);
                    }
                    bac.p(view3, new jfy());
                    aiqe aiqeVar2 = ((anyi) optionalH5.get()).f;
                    if (aiqeVar2 == null) {
                        aiqeVar2 = aiqe.a;
                    }
                    kro.aa(view3, aiqeVar2);
                    frameLayout.addView(view3);
                }
            }
            apji apjiVar7 = anznVar.j;
            if (apjiVar7 == null) {
                apjiVar7 = apji.a;
            }
            Optional optionalH6 = kro.H(apjiVar7, alht.a);
            if (optionalH6.isPresent()) {
                this.m.b((alhq) optionalH6.get(), viewGroup, anznVar, vxeVar);
            }
            if ((anznVar.b & 65536) != 0) {
                aiqeVar = anznVar.t;
                if (aiqeVar == null) {
                    aiqeVar = aiqe.a;
                }
            } else {
                aiqeVar = null;
            }
            kro.aa(view, aiqeVar);
            apji apjiVar8 = anznVar.k;
            if (apjiVar8 == null) {
                apjiVar8 = apji.a;
            }
            Optional optionalH7 = kro.H(apjiVar8, angi.a);
            if (optionalH7.isPresent()) {
                this.k.d(view, (anfy) optionalH7.get(), anznVar, adlyVar.b);
            }
            apji apjiVar9 = anznVar.n;
            if (apjiVar9 == null) {
                apjiVar9 = apji.a;
            }
            Optional optionalH8 = kro.H(apjiVar9, ajnp.b);
            if (optionalH8.isPresent()) {
                jii jiiVar = this.y;
                ajno ajnoVar = (ajno) optionalH8.get();
                jiiVar.b();
                if (ajnoVar.d) {
                    return;
                }
                jiiVar.b = ajnoVar;
                ajno ajnoVar2 = jiiVar.b;
                if (ajnoVar2 != null && (strA = jiiVar.a()) != null) {
                    ijt ijtVar = jiiVar.c;
                    boolean zBooleanValue = ajnoVar2.c;
                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) ijtVar.a;
                    if (concurrentHashMap.containsKey(strA)) {
                        zBooleanValue = ((Boolean) concurrentHashMap.get(strA)).booleanValue();
                    }
                    jiiVar.e(zBooleanValue);
                }
                YouTubeButton youTubeButton = jiiVar.a;
                youTubeButton.setVisibility(0);
                youTubeButton.setOnClickListener(jiiVar);
                ajno ajnoVar3 = jiiVar.b;
                if (ajnoVar3 != null) {
                    jiiVar.c(ajnoVar3.c);
                }
            }
        }
    }
}
