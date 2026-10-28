package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Point;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.common.ui.RtlAwareViewPager;
import com.google.android.libraries.youtube.creation.geo.LocationSearchView;
import com.google.android.libraries.youtube.rendering.ui.spec.typography.YouTubeAppCompatTextView;
import com.google.android.libraries.youtube.rendering.ui.tabs.DefaultTabsBar;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vhc extends vgq {
    public static final agrf p = agrf.h("com/google/android/libraries/youtube/creation/videoeffects/fragment/MultiPageStickerCatalogFragment");
    public aqdb A;
    public DefaultTabsBar B;
    public vha C;
    public LocationSearchView D;
    public ViewGroup E;
    public boolean F;
    public int G;
    public boolean H = true;
    public int I = 2;
    public vxz J;
    public xsc K;
    public xsc L;
    public aciz M;
    public xpl N;
    private View O;
    private View P;
    public zwb q;
    public vgw r;
    public vho s;
    public Executor t;
    public vhe u;
    public aeda v;
    public awmd w;
    public FrameLayout x;
    public RtlAwareViewPager y;
    public aqcp z;

    @Override // defpackage.vgn
    protected final View i() {
        RtlAwareViewPager rtlAwareViewPager = this.y;
        rtlAwareViewPager.getClass();
        return rtlAwareViewPager;
    }

    @Override // defpackage.bp
    public final Dialog iH(Bundle bundle) {
        gr grVar = new gr(requireContext(), this.b);
        grVar.getOnBackPressedDispatcher().c(this, new vgz(this));
        return grVar;
    }

    @Override // defpackage.vgn
    protected final View j() {
        return this.O;
    }

    @Override // defpackage.vhj
    public final void o(boolean z) {
        this.P.setVisibility(true != z ? 8 : 0);
    }

    /* JADX WARN: Type inference failed for: r10v36, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v49, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v23, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v25, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v33, types: [awmd, java.lang.Object] */
    @Override // defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        WindowManager windowManager;
        this.l.hB().b(xhb.a(37168), null, null);
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(new ContextThemeWrapper(getContext(), true != this.v.f() ? 2132083685 : R.style.ShortsTheme_AppCompat_FullScreen_Dark_DarkerPalette)).inflate(R.layout.multi_page_sticker_catalog_fragment, viewGroup, false);
        this.x = frameLayout;
        this.O = frameLayout.findViewById(R.id.sticker_catalog_container);
        RtlAwareViewPager rtlAwareViewPager = (RtlAwareViewPager) this.x.findViewById(R.id.sticker_catalog_page);
        this.y = rtlAwareViewPager;
        if (rtlAwareViewPager.d != 2) {
            rtlAwareViewPager.d = 2;
            rtlAwareViewPager.h();
        }
        this.C = new vha(this, getChildFragmentManager());
        RtlAwareViewPager rtlAwareViewPager2 = this.y;
        rtlAwareViewPager2.getClass();
        rtlAwareViewPager2.e(new vhb(this, 0));
        DefaultTabsBar defaultTabsBar = (DefaultTabsBar) this.x.findViewById(R.id.sticker_page_tab_bar);
        this.B = defaultTabsBar;
        defaultTabsBar.setVisibility(8);
        ViewGroup viewGroup2 = (ViewGroup) this.x.findViewById(R.id.tabs_bar_view);
        viewGroup2.setVisibility(0);
        DefaultTabsBar defaultTabsBar2 = (DefaultTabsBar) viewGroup2.findViewById(R.id.tabs_bar);
        this.B = defaultTabsBar2;
        defaultTabsBar2.h = true;
        defaultTabsBar2.n();
        DefaultTabsBar defaultTabsBar3 = this.B;
        ttk ttkVar = (ttk) this.w.io();
        if (defaultTabsBar3.q != ttkVar) {
            defaultTabsBar3.q = ttkVar;
            defaultTabsBar3.invalidate();
        }
        if (defaultTabsBar3.h) {
            defaultTabsBar3.k(tzk.i(defaultTabsBar3.f, R.attr.ytTextPrimary), tzk.i(defaultTabsBar3.f, R.attr.ytTextSecondary));
        } else {
            defaultTabsBar3.k(defaultTabsBar3.o, defaultTabsBar3.p);
        }
        this.B.r = Optional.of(this.M);
        RtlAwareViewPager rtlAwareViewPager3 = this.y;
        rtlAwareViewPager3.getClass();
        rtlAwareViewPager3.e(this.B);
        this.P = this.x.findViewById(R.id.spinner);
        if (bundle != null) {
            vha vhaVar = this.C;
            vhaVar.getClass();
            vhaVar.b(bundle.getParcelable("pages"), getClass().getClassLoader());
            this.G = bundle.getInt("position");
        }
        RtlAwareViewPager rtlAwareViewPager4 = this.y;
        rtlAwareViewPager4.getClass();
        vha vhaVar2 = this.C;
        vhaVar2.getClass();
        rtlAwareViewPager4.k(vhaVar2);
        o(true);
        vgm vgmVar = new vgm(this, 2);
        ((vgn) this).o = true;
        Context context = getContext();
        if (context != null && (windowManager = (WindowManager) context.getSystemService("window")) != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            int i = point.y;
            ((vgn) this).n = i;
            this.O.setTranslationY(i);
            i().setTranslationY(((vgn) this).n);
            i().setTranslationY(((vgn) this).n);
            k(true, vgmVar);
        }
        xsc xscVar = this.L;
        FrameLayout frameLayout2 = this.x;
        frameLayout2.getClass();
        Context context2 = (Context) xscVar.a;
        LayoutInflater.from(new ContextThemeWrapper(context2, R.style.ShortsTheme_AppCompat_FullScreen_Dark)).inflate(R.layout.location_search_view_layout, (ViewGroup) frameLayout2, true);
        if (((vxz) xscVar.b).l(16, 45680787L, false)) {
            LayoutInflater.from(new ContextThemeWrapper(context2, R.style.DefaultStickerCatalogTheme)).inflate(R.layout.user_mention_search_view, (ViewGroup) frameLayout2, true);
        } else {
            LayoutInflater.from((Context) xscVar.c).inflate(R.layout.user_mention_search_view, (ViewGroup) frameLayout2, true);
        }
        LocationSearchView locationSearchView = (LocationSearchView) this.x.findViewById(R.id.location_search_view);
        this.D = locationSearchView;
        vgw vgwVar = this.r;
        vhh vhhVar = this.m;
        vgwVar.k = locationSearchView;
        vgwVar.j = vhhVar;
        vgwVar.m = this;
        xsc xscVar2 = vgwVar.r;
        xgn xgnVar = (xgn) xscVar2.c.io();
        xgnVar.getClass();
        aeiv aeivVar = (aeiv) xscVar2.a.io();
        aeivVar.getClass();
        aend aendVar = (aend) xscVar2.b.io();
        aendVar.getClass();
        locationSearchView.getClass();
        vgwVar.l = new vce(xgnVar, aeivVar, aendVar, locationSearchView, vgwVar);
        vgwVar.i = vgwVar.a();
        ViewGroup viewGroup3 = (ViewGroup) this.x.findViewById(R.id.user_mention_search_view);
        this.E = viewGroup3;
        vho vhoVar = this.s;
        xgn xgnVarHB = this.l.hB();
        vhoVar.d = viewGroup3;
        FrameLayout frameLayout3 = (FrameLayout) viewGroup3.findViewById(R.id.results_view);
        vhoVar.g = new ujp();
        vhoVar.g.c(frameLayout3, false);
        arbi arbiVar = arbi.a;
        aihh aihhVar = (aihh) ajwo.a.createBuilder();
        aihhVar.e(arbi.b, arbiVar);
        vhoVar.f = (ajwo) aihhVar.build();
        xpl xplVar = vhoVar.h;
        ajwo ajwoVar = vhoVar.f;
        Context context3 = (Context) xplVar.b.io();
        context3.getClass();
        aehs aehsVar = (aehs) xplVar.a.io();
        viewGroup3.getClass();
        xgnVarHB.getClass();
        ajwoVar.getClass();
        vhoVar.e = new vhx(context3, aehsVar, viewGroup3, vhoVar, xgnVarHB, ajwoVar);
        this.l.hB();
        return this.x;
    }

    @Override // defpackage.cc
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        aebz aebzVar = this.r.i;
        ArrayList arrayList = aebzVar.c;
        if (arrayList.isEmpty()) {
            return;
        }
        if (strArr.length == 0) {
            Runnable runnable = aebzVar.d;
            return;
        }
        aebt aebtVar = (aebt) arrayList.remove(0);
        int i2 = aebtVar.a;
        ahno.S(i2 == i, "Expected %s, got %s", i2, i);
        int i3 = aebx.f;
        if (iArr.length != 0) {
            for (int i4 : iArr) {
                if (i4 == 0) {
                }
            }
            aebzVar.b.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(aebtVar.b), null);
            aebzVar.a();
            return;
        }
        aebzVar.b.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(aebtVar.c), null);
        tuk.n(aebzVar.a.a(), R.string.reel_permissions_missing_location, 1);
        Runnable runnable2 = aebzVar.d;
    }

    @Override // defpackage.bp, defpackage.cc
    /* JADX INFO: renamed from: onSaveInstanceState */
    public final void m668x22bc4f96(Bundle bundle) {
        vxz vxzVar = this.J;
        if (vxzVar == null || !vxzVar.m(79, 45838789L)) {
            vha vhaVar = this.C;
            vhaVar.getClass();
            bundle.putParcelable("pages", vhaVar.a());
            RtlAwareViewPager rtlAwareViewPager = this.y;
            rtlAwareViewPager.getClass();
            bundle.putInt("position", rtlAwareViewPager.a());
        } else {
            vha vhaVar2 = this.C;
            if (vhaVar2 != null) {
                bundle.putParcelable("pages", vhaVar2.a());
            }
            RtlAwareViewPager rtlAwareViewPager2 = this.y;
            if (rtlAwareViewPager2 != null) {
                bundle.putInt("position", rtlAwareViewPager2.a());
            }
        }
        super.m668x22bc4f96(bundle);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, zwh] */
    final void p(int i) {
        aaqf aaqfVarJ = this.N.j(this.q.e());
        wui wuiVar = new wui(aaqfVarJ.b, aaqfVarJ.c.hw(), vys.a((vxu) aaqfVarJ.d));
        wuiVar.a = i;
        wuiVar.b = this.H;
        wuiVar.c = this.I;
        wuiVar.m();
        taf.i(((wnh) this.N.j(this.q.e()).e).a(wuiVar), this.t, new roc(this, 14), new ixb(this, 6), new tpo(7));
    }

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
    public final void q(List list) {
        int i;
        TextView textView;
        Iterator it = list.iterator();
        final int i2 = 0;
        final int i3 = 0;
        while (it.hasNext()) {
            apji apjiVar = (apji) it.next();
            aihl aihlVarCheckIsLite = aihn.checkIsLite(ajnp.a);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajnp.a);
                apjiVar.c(aihlVarCheckIsLite2);
                Object objK = apjiVar.j.k(aihlVarCheckIsLite2.d);
                ajnf ajnfVar = (ajnf) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                final int i4 = 1;
                if ((ajnfVar.b & 131072) != 0) {
                    DefaultTabsBar defaultTabsBar = this.B;
                    aiqd aiqdVar = ajnfVar.u;
                    if (aiqdVar == null) {
                        aiqdVar = aiqd.a;
                    }
                    String str = aiqdVar.c;
                    int iD = defaultTabsBar.d();
                    LayoutInflater layoutInflater = defaultTabsBar.g;
                    if (defaultTabsBar.h) {
                        i = (defaultTabsBar.r.isPresent() && ((aciz) defaultTabsBar.r.get()).D()) ? R.layout.tabs_bar_text_tab_modern_type : defaultTabsBar.i;
                    } else {
                        i = defaultTabsBar.j;
                    }
                    View viewInflate = layoutInflater.inflate(i, (ViewGroup) defaultTabsBar.a, false);
                    if (defaultTabsBar.h) {
                        View viewFindViewById = viewInflate.findViewById(R.id.tabs_bar_text_tab_view);
                        textView = viewFindViewById == null ? null : (TextView) viewFindViewById.findViewById(defaultTabsBar.k);
                    } else {
                        textView = (TextView) viewInflate.findViewById(defaultTabsBar.k);
                    }
                    ImageView imageView = (ImageView) viewInflate.findViewById(R.id.image);
                    if (textView != null) {
                        if (defaultTabsBar.h && defaultTabsBar.r.isPresent() && ((aciz) defaultTabsBar.r.get()).D() && (textView instanceof YouTubeAppCompatTextView)) {
                            Object obj = defaultTabsBar.r.get();
                            aedu aeduVarA = aedv.a();
                            aeduVarA.a = 4;
                            aeduVarA.b = 4;
                            ((aciz) obj).B(aeduVarA.a(), defaultTabsBar.f, (YouTubeAppCompatTextView) textView);
                        }
                        ColorStateList colorStateList = defaultTabsBar.n;
                        if (colorStateList != null) {
                            defaultTabsBar.m(textView, colorStateList);
                        }
                        textView.setText(str);
                    }
                    if (imageView != null) {
                        imageView.setVisibility(8);
                    }
                    viewInflate.setContentDescription(str);
                    aedi.i(viewInflate);
                    defaultTabsBar.c.add(iD, viewInflate);
                    ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
                    if (layoutParams == null) {
                        defaultTabsBar.a.addView(viewInflate, iD);
                    } else {
                        defaultTabsBar.a.addView(viewInflate, iD, layoutParams);
                    }
                    viewInflate.setOnClickListener(defaultTabsBar.d);
                    bac.p(viewInflate, defaultTabsBar.e);
                    int i5 = defaultTabsBar.b;
                    if (i5 != -1 && iD <= i5) {
                        defaultTabsBar.b = i5 + 1;
                    }
                    viewInflate.getClass();
                    if (iD == 0) {
                        iD = 0;
                    }
                    int i6 = defaultTabsBar.l;
                    if (i6 != -1 && iD <= i6) {
                        defaultTabsBar.l = i6 + 1;
                    }
                    if (defaultTabsBar.d() == 1) {
                        defaultTabsBar.h(0);
                        defaultTabsBar.o(defaultTabsBar.b, 0.0f, false);
                    }
                    defaultTabsBar.n();
                    avbi avbiVar = defaultTabsBar.t;
                    int i7 = avbiVar.b;
                    if (i7 != -1 && iD <= i7) {
                        avbiVar.b = i7 + 1;
                        avbiVar.e();
                    }
                    viewInflate.getClass();
                }
                vxz vxzVar = this.J;
                if (vxzVar == null || !vxzVar.m(79, 45838789L)) {
                    View viewE = this.B.e(i3);
                    viewE.getClass();
                    viewE.setOnClickListener(new View.OnClickListener(this) { // from class: vgx
                        public final /* synthetic */ vhc a;

                        {
                            this.a = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            vhk vhkVar;
                            int i8 = i2;
                            vhc vhcVar = this.a;
                            if (i8 == 0) {
                                RtlAwareViewPager rtlAwareViewPager = vhcVar.y;
                                rtlAwareViewPager.getClass();
                                int i9 = i3;
                                rtlAwareViewPager.l(i9);
                                vha vhaVar = vhcVar.C;
                                vhaVar.getClass();
                                ((vhk) vhaVar.p(i9)).e();
                                return;
                            }
                            RtlAwareViewPager rtlAwareViewPager2 = vhcVar.y;
                            int i10 = i3;
                            if (rtlAwareViewPager2 != null) {
                                rtlAwareViewPager2.l(i10);
                            }
                            vha vhaVar2 = vhcVar.C;
                            if (vhaVar2 == null || (vhkVar = (vhk) vhaVar2.p(i10)) == null) {
                                return;
                            }
                            vhkVar.e();
                        }
                    });
                } else {
                    View viewE2 = this.B.e(i3);
                    if (viewE2 != null) {
                        viewE2.setOnClickListener(new View.OnClickListener(this) { // from class: vgx
                            public final /* synthetic */ vhc a;

                            {
                                this.a = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                vhk vhkVar;
                                int i8 = i4;
                                vhc vhcVar = this.a;
                                if (i8 == 0) {
                                    RtlAwareViewPager rtlAwareViewPager = vhcVar.y;
                                    rtlAwareViewPager.getClass();
                                    int i9 = i3;
                                    rtlAwareViewPager.l(i9);
                                    vha vhaVar = vhcVar.C;
                                    vhaVar.getClass();
                                    ((vhk) vhaVar.p(i9)).e();
                                    return;
                                }
                                RtlAwareViewPager rtlAwareViewPager2 = vhcVar.y;
                                int i10 = i3;
                                if (rtlAwareViewPager2 != null) {
                                    rtlAwareViewPager2.l(i10);
                                }
                                vha vhaVar2 = vhcVar.C;
                                if (vhaVar2 == null || (vhkVar = (vhk) vhaVar2.p(i10)) == null) {
                                    return;
                                }
                                vhkVar.e();
                            }
                        });
                    }
                }
            }
            i3++;
        }
    }
}
