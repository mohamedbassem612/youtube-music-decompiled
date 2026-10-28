package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Point;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class swb implements adma, adzw {
    public final View a;
    public final int b;
    final /* synthetic */ swc c;
    private final TextView d;
    private final TextView e;
    private final ImageView f;
    private final ImageView g;
    private final TextView h;
    private final TextView i;
    private final ScrollView j;
    private final aeaa k;
    private final aeaa l;
    private final elq m;

    public swb(swc swcVar, int i, elq elqVar) {
        this.c = swcVar;
        this.b = i;
        this.m = elqVar;
        View viewInflate = LayoutInflater.from(swcVar.b).inflate(i, swcVar.e, false);
        this.a = viewInflate;
        this.j = (ScrollView) viewInflate.findViewById(R.id.scroll_view);
        this.d = (TextView) viewInflate.findViewById(R.id.title);
        this.e = (TextView) viewInflate.findViewById(R.id.body);
        this.f = (ImageView) viewInflate.findViewById(R.id.foreground);
        this.g = (ImageView) viewInflate.findViewById(R.id.background);
        TextView textView = (TextView) viewInflate.findViewById(R.id.action);
        this.h = textView;
        aeaa aeaaVarD = swcVar.l.d(textView);
        this.k = aeaaVarD;
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.dismiss);
        this.i = textView2;
        aeaa aeaaVarD2 = swcVar.l.d(textView2);
        this.l = aeaaVarD2;
        aeaaVarD.c = this;
        aeaaVarD2.c = this;
        tuk.l(viewInflate, false);
    }

    private final int e() {
        amfe amfeVar = this.c.j;
        int i = amfeVar.f;
        if (i != 7) {
            return tzk.n(this.c.b, R.attr.ytTextPrimary).orElse(0);
        }
        String str = "";
        if (i == 7) {
            try {
                str = (String) amfeVar.g;
            } catch (Resources.NotFoundException | Exception unused) {
                return 0;
            }
        }
        return Color.parseColor(str);
    }

    @Override // defpackage.adma
    public final View a() {
        return this.a;
    }

    /* JADX WARN: Code duplicated, block: B:139:0x028b  */
    /* JADX WARN: Code duplicated, block: B:142:0x0297  */
    /* JADX WARN: Code duplicated, block: B:144:0x029b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:145:0x029d  */
    /* JADX WARN: Code duplicated, block: B:146:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:149:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:150:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:152:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:153:0x02b5  */
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
    public final void d(amfe amfeVar) {
        ajnf ajnfVar;
        ajnf ajnfVar2;
        ajkx ajkxVar;
        int iAS;
        int dimensionPixelSize;
        aqmi aqmiVar;
        amfe amfeVar2;
        int iAS2;
        int i;
        int iE;
        amfc amfcVar;
        swc swcVar = this.c;
        boolean z = !swcVar.d();
        View view = this.a;
        tuk.l(view, z);
        elq elqVar = this.m;
        if (!elqVar.B(amfeVar)) {
            elqVar.A(amfeVar);
            for (ajwo ajwoVar : swcVar.j.o) {
                if (ajwoVar != null) {
                    HashMap map = new HashMap();
                    map.put("com.google.android.libraries.youtube.innertube.endpoint.tag", swcVar.j);
                    swcVar.c.c(ajwoVar, map);
                }
            }
        }
        xgn xgnVarHB = swcVar.g.hB();
        ajkx ajkxVar2 = null;
        aqmh aqmhVar = null;
        xgnVarHB.w(new xgj(amfeVar.n, (amud) null), null);
        ajng ajngVar = amfeVar.l;
        if (ajngVar == null) {
            ajngVar = ajng.a;
        }
        if ((ajngVar.b & 1) != 0) {
            ajng ajngVar2 = amfeVar.l;
            if (ajngVar2 == null) {
                ajngVar2 = ajng.a;
            }
            ajnfVar = ajngVar2.c;
            if (ajnfVar == null) {
                ajnfVar = ajnf.a;
            }
        } else {
            ajnfVar = null;
        }
        ajng ajngVar3 = amfeVar.m;
        if (((ajngVar3 == null ? ajng.a : ajngVar3).b & 1) != 0) {
            if (ajngVar3 == null) {
                ajngVar3 = ajng.a;
            }
            ajnfVar2 = ajngVar3.c;
            if (ajnfVar2 == null) {
                ajnfVar2 = ajnf.a;
            }
        } else {
            ajnfVar2 = null;
        }
        if (swcVar.d()) {
            if (ajnfVar != null) {
                xgnVarHB.w(new xgj(ajnfVar.y, (amud) null), null);
            }
            if (ajnfVar2 != null) {
                xgnVarHB.w(new xgj(ajnfVar2.y, (amud) null), null);
            }
            swh swhVar = swcVar.f;
            if (swhVar.a.equals(amfeVar)) {
                swhVar.c.post(new rxn(swhVar, 17));
                return;
            }
            return;
        }
        int iAS3 = a.aS(swcVar.j.h);
        if (iAS3 != 0 && iAS3 == 2 && !nsh.i(swcVar.k) && ajnfVar2 != null) {
            ((ViewGroup.MarginLayoutParams) this.i.getLayoutParams()).setMarginStart(ajnfVar == null ? 0 : swcVar.b.getResources().getDimensionPixelSize(R.dimen.onboarding_interstitial_promo_spacing_tween_buttons));
        }
        if (ajnfVar != null && ajnfVar2 == null) {
            TextView textView = this.h;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = swcVar.b.getResources().getDimensionPixelSize(R.dimen.interstitial_promo_single_button_bottom_margin);
                textView.setLayoutParams(marginLayoutParams);
            }
        }
        this.k.a(ajnfVar, xgnVarHB, null);
        this.l.a(ajnfVar2, xgnVarHB, null);
        TextView textView2 = this.d;
        alay alayVar = amfeVar.i;
        if (alayVar == null) {
            alayVar = alay.a;
        }
        adrv adrvVar = swcVar.h;
        tuk.u(textView2, ackj.k(null, alayVar, adrvVar, false));
        TextView textView3 = this.e;
        alay alayVar2 = amfeVar.k;
        if (alayVar2 == null) {
            alayVar2 = alay.a;
        }
        tuk.u(textView3, ackj.k(null, alayVar2, adrvVar, false));
        int iAS4 = a.aS(swcVar.j.h);
        if (iAS4 == 0 || iAS4 != 3) {
            adsy adsyVar = new adsy(swcVar.d);
            adsyVar.a = textView2;
            adsyVar.b = textView3;
            adsz adszVarA = adsyVar.a();
            amfe amfeVar3 = swcVar.j;
            int i2 = amfeVar3.f;
            if (i2 == 20) {
                amfc amfcVar2 = i2 == 20 ? (amfc) amfeVar3.g : amfc.a;
                ajkxVar = amfcVar2.b == 118483990 ? (ajkx) amfcVar2.c : ajkx.a;
            } else {
                ajkxVar = null;
            }
            adszVarA.a(ajkxVar);
        }
        amfe amfeVar4 = swcVar.j;
        int i3 = amfeVar4.b;
        if (i3 == 5 || i3 == 24) {
            int i4 = amfeVar4.h;
            int iAS5 = a.aS(i4);
            if ((iAS5 == 0 || iAS5 != 2) && ((iAS = a.aS(i4)) == 0 || iAS != 3)) {
                if (nsh.i(swcVar.k)) {
                    WindowManager windowManager = (WindowManager) swcVar.b.getSystemService("window");
                    Point point = new Point();
                    windowManager.getDefaultDisplay().getSize(point);
                    dimensionPixelSize = (int) (((double) point.y) * 0.25d);
                } else {
                    Activity activity = swcVar.b;
                    dimensionPixelSize = twm.v(activity) ? activity.getResources().getDimensionPixelSize(R.dimen.interstitial_promo_foreground_image_margin_top) : 0;
                }
                tym.h(this.f, new tyk(0, dimensionPixelSize, 0, 0), ViewGroup.MarginLayoutParams.class);
            }
            ImageView imageView = this.f;
            imageView.setVisibility(0);
            amfe amfeVar5 = swcVar.j;
            int i5 = amfeVar5.b;
            if (i5 == 5) {
                swcVar.a.h(imageView, (aqmh) amfeVar5.c);
            } else {
                Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap((i5 == 24 ? (ajjl) amfeVar5.c : ajjl.a).b);
                if (svy.a(swcVar.b)) {
                    swcVar.a.h(imageView, (aqmh) mapUnmodifiableMap.get("dark"));
                } else {
                    swcVar.a.h(imageView, (aqmh) mapUnmodifiableMap.get("light"));
                }
            }
        } else {
            this.f.setVisibility(8);
        }
        amfe amfeVar6 = swcVar.j;
        int i6 = amfeVar6.d;
        if (i6 == 14) {
            aqmiVar = (i6 == 14 ? (aqmj) amfeVar6.e : aqmj.a).b;
            if (aqmiVar == null) {
                aqmiVar = aqmi.a;
            }
        } else {
            aqmiVar = null;
        }
        adhv adhvVar = swcVar.a;
        ImageView imageView2 = this.g;
        adhvVar.f(imageView2);
        if (aqmiVar != null) {
            int i7 = aqmiVar.b;
            if ((i7 & 1) == 0 || (i7 & 2) == 0) {
                amfeVar2 = swcVar.j;
                iAS2 = a.aS(amfeVar2.h);
                if (iAS2 != 0 || iAS2 != 3) {
                    i = amfeVar2.f;
                    if (i == 20) {
                        if (i == 20) {
                            amfcVar = (amfc) amfeVar2.g;
                        } else {
                            amfcVar = amfc.a;
                        }
                        if (amfcVar.b == 118483990) {
                            ajkxVar2 = (ajkx) amfcVar.c;
                        } else {
                            ajkxVar2 = ajkx.a;
                        }
                    }
                    if (ajkxVar2 != null) {
                        iE = ajkxVar2.c;
                    } else {
                        iE = e();
                    }
                    view.setBackgroundColor(iE);
                }
            } else {
                amfe amfeVar7 = swcVar.j;
                boolean zI = nsh.i(swcVar.k);
                int i8 = amfeVar7.d;
                if (i8 == 14) {
                    aqmi aqmiVar2 = (i8 == 14 ? (aqmj) amfeVar7.e : aqmj.a).b;
                    if (aqmiVar2 == null) {
                        aqmiVar2 = aqmi.a;
                    }
                    if (zI) {
                        aqmhVar = aqmiVar2.d;
                        if (aqmhVar == null) {
                            aqmhVar = aqmh.a;
                        }
                    } else {
                        aqmhVar = aqmiVar2.c;
                        if (aqmhVar == null) {
                            aqmhVar = aqmh.a;
                        }
                    }
                }
                adhvVar.j(imageView2, aqmhVar, adhr.b);
            }
        } else {
            amfeVar2 = swcVar.j;
            iAS2 = a.aS(amfeVar2.h);
            if (iAS2 != 0) {
                i = amfeVar2.f;
                if (i == 20) {
                    if (i == 20) {
                        amfcVar = (amfc) amfeVar2.g;
                    } else {
                        amfcVar = amfc.a;
                    }
                    if (amfcVar.b == 118483990) {
                        ajkxVar2 = (ajkx) amfcVar.c;
                    } else {
                        ajkxVar2 = ajkx.a;
                    }
                }
                if (ajkxVar2 != null) {
                    iE = ajkxVar2.c;
                } else {
                    iE = e();
                }
                view.setBackgroundColor(iE);
            } else {
                i = amfeVar2.f;
                if (i == 20) {
                    if (i == 20) {
                        amfcVar = (amfc) amfeVar2.g;
                    } else {
                        amfcVar = amfc.a;
                    }
                    if (amfcVar.b == 118483990) {
                        ajkxVar2 = (ajkx) amfcVar.c;
                    } else {
                        ajkxVar2 = ajkx.a;
                    }
                }
                if (ajkxVar2 != null) {
                    iE = ajkxVar2.c;
                } else {
                    iE = e();
                }
                view.setBackgroundColor(iE);
            }
        }
        ScrollView scrollView = this.j;
        if (scrollView != null) {
            scrollView.fullScroll(130);
        }
    }

    @Override // defpackage.adma
    public final /* bridge */ /* synthetic */ void hU(adly adlyVar, Object obj) {
        d((amfe) obj);
    }

    @Override // defpackage.adzw
    public final void iP(aihh aihhVar) {
        swc swcVar = this.c;
        adzw adzwVar = swcVar.i;
        if (adzwVar != null) {
            adzwVar.iP(aihhVar);
        }
        swcVar.f.a();
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
    }
}
