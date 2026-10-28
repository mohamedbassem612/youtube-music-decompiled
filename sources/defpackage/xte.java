package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.creation.common.ui.CreationButtonView;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.concurrent.ThreadLocalRandom;
import j$.util.function.Function$CC;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xte {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    /* JADX WARN: Type inference failed for: r0v5, types: [aeda, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [aeda, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [aeda, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [awmd, java.lang.Object] */
    public xte(Context context, xsc xscVar, aduv aduvVar, vxe vxeVar, adxj adxjVar, aaok aaokVar) {
        if (((vxz) aaokVar.b).l(545, 45800050L, false)) {
            context = (xscVar.a.f() && xscVar.a.g()) ? new ContextThemeWrapper((Context) xscVar.b, R.style.ShortsTheme_AppCompat_FullScreen_Dark_DarkerPalette) : new ContextThemeWrapper((Context) xscVar.b, R.style.ShortsTheme_AppCompat_FullScreen_Dark);
            if (xscVar.a.i()) {
                ((afip) xscVar.c.io()).c(context, ajet.USER_INTERFACE_THEME_DARK);
            }
        }
        this.c = context;
        this.e = context.getResources();
        this.f = aduvVar;
        this.b = vxeVar;
        this.d = adxjVar;
        this.a = aaokVar;
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [awmd, java.lang.Object] */
    private final agke l(wgk wgkVar, String str, wjf wjfVar, acfw acfwVar, skl sklVar) {
        int iBi;
        Optional optionalEmpty;
        if (!m(wgkVar)) {
            return agpi.a;
        }
        alam alamVar = ((aisv) wgkVar.g().get(0)).d;
        if (alamVar == null) {
            alamVar = alam.a;
        }
        alam alamVar2 = alamVar;
        aaok aaokVar = (aaok) this.b.io();
        aisu aisuVarD = wgkVar.d();
        if (aisuVarD == null) {
            rmp.j(null, "Attempted to create a forecasting ad from a null ad break renderer.");
            optionalEmpty = Optional.empty();
        } else {
            int i = aisuVarD.f;
            int iBi2 = a.bi(i);
            if ((iBi2 == 0 || iBi2 != 4) && ((iBi = a.bi(i)) == 0 || iBi != 3)) {
                int iBi3 = a.bi(i);
                if (iBi3 == 0) {
                    iBi3 = 1;
                }
                rmp.j(null, "Attempted to create a forecasting ad from neither a midroll nor a postroll ad break request slot. Ad break type: ".concat(afxw.aD(iBi3)));
                optionalEmpty = Optional.empty();
            } else {
                snh snhVar = new snh(0L, 0L);
                int iBi4 = a.bi(i);
                if (iBi4 != 0 && iBi4 == 3 && (snhVar = (snh) aaok.aj(aisuVarD.c, wjfVar, Duration.ofSeconds(wjfVar.a()).toMillis()).orElse(null)) == null) {
                    optionalEmpty = Optional.empty();
                } else {
                    snh snhVar2 = snhVar;
                    optionalEmpty = taq.ad((vyo) aaokVar.c) ? Optional.of(aaokVar.af(str, acfwVar, sklVar, Optional.of(new wgj(aisuVarD)), snhVar2)) : Optional.of(aaokVar.X(alamVar2, str, acfwVar, wjfVar, sklVar, Optional.of(new wgj(aisuVarD)), snhVar2, null));
                }
            }
        }
        if (true == optionalEmpty.isPresent()) {
            optionalEmpty = Optional.ofNullable(agke.q(optionalEmpty.get()));
        }
        return (agke) optionalEmpty.orElse(agpi.a);
    }

    private static final boolean m(wgk wgkVar) {
        return (wgkVar.g().isEmpty() || (((aisv) wgkVar.g().get(0)).b & 2) == 0) ? false : true;
    }

    private static boolean n(Uri uri) {
        if (uri == null) {
            return false;
        }
        String host = uri.getHost();
        String path = uri.getPath();
        if (host == null || path == null || !host.equals("www.youtube.com")) {
            return false;
        }
        return path.equals("/pagead/adview") || path.equals("/pagead/paralleladview");
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [adhv, java.lang.Object] */
    public final void a() {
        wgg wggVarJ;
        vgi vgiVar = new vgi(this, 3);
        abuz abuzVar = ((xtf) this.a).i;
        if (abuzVar == null || !abuzVar.m() || (wggVarJ = abuzVar.j(kro.af((Resources) this.f))) == null) {
            return;
        }
        this.e.k(wggVarJ.a(), vgiVar);
    }

    public final InputStream b(Uri uri) {
        try {
            InputStream inputStreamB = qol.b((Context) this.f, uri);
            inputStreamB.getClass();
            return inputStreamB;
        } catch (FileNotFoundException unused) {
            InputStream inputStreamC = qol.c((Context) this.f, uri, qok.b);
            inputStreamC.getClass();
            return inputStreamC;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aduv, java.lang.Object] */
    public final CreationButtonView c(xhc xhcVar, String str) {
        int iA = this.f.a(vjl.a);
        Resources resources = (Resources) this.e;
        Drawable drawable = resources.getDrawable(iA);
        f(drawable);
        return d(R.id.shorts_editor_sticker_picker_button, drawable, xhcVar, resources.getString(R.string.shorts_editor_sticker_label), str);
    }

    public final CreationButtonView d(int i, Drawable drawable, xhc xhcVar, String str, String str2) {
        CreationButtonView creationButtonView = new CreationButtonView((Context) this.c, 1);
        creationButtonView.setId(i);
        creationButtonView.b(drawable);
        creationButtonView.a.setText(str);
        creationButtonView.setContentDescription(str);
        if (xhcVar != null) {
            creationButtonView.c = new xgj(xhcVar);
        }
        creationButtonView.d = str2;
        creationButtonView.setVisibility(0);
        creationButtonView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        return creationButtonView;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [adxj, java.lang.Object] */
    public final CreationButtonView e() {
        Drawable drawable;
        if (((aaok) this.a).J()) {
            drawable = this.d.d((Context) this.c, arqz.hB);
        } else {
            drawable = null;
        }
        if (drawable != null) {
            f(drawable);
        } else {
            drawable = ((Resources) this.e).getDrawable(R.drawable.ic_add_text_track);
        }
        return d(R.id.shorts_edit_text_button, drawable, null, ((Resources) this.e).getString(R.string.reel_accessibility_edit_add_text), "add_text_sticker");
    }

    public final void f(Drawable drawable) {
        ttk.a(drawable, tzk.i((Context) this.c, R.attr.ytTextPrimary), PorterDuff.Mode.SRC_IN);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void g(Runnable runnable) {
        this.d.execute(runnable);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void h(String str, Uri uri) {
        this.c.execute(new mrh(this, str, uri, 15));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [awmd, java.lang.Object] */
    public final swz i(ViewStub viewStub) {
        vxe vxeVar = (vxe) this.c.io();
        vxeVar.getClass();
        aduv aduvVar = (aduv) this.f.io();
        aduvVar.getClass();
        wbz wbzVar = (wbz) this.a.io();
        wbzVar.getClass();
        lqa lqaVar = (lqa) this.b.io();
        lqaVar.getClass();
        ?? Io = this.d.io();
        Io.getClass();
        vxz vxzVar = (vxz) this.e.io();
        vxzVar.getClass();
        viewStub.getClass();
        return new swz(vxeVar, aduvVar, wbzVar, lqaVar, Io, vxzVar, viewStub);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0096  */
    /* JADX WARN: Code duplicated, block: B:51:0x01ef  */
    /* JADX WARN: Type inference failed for: r0v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v17, types: [awmd, java.lang.Object] */
    public final agke j(final wgk wgkVar, skl sklVar, final String str, final wjf wjfVar, final acfw acfwVar, smr smrVar) {
        String str2;
        Optional optionalAc;
        int i = 0;
        snh snhVar = null;
        if (!wgkVar.h()) {
            vyo vyoVar = (vyo) this.c;
            if (taq.aM(vyoVar)) {
                rzu rzuVar = (rzu) this.d.io();
                if (smrVar == null || sklVar == null) {
                    str2 = str;
                } else {
                    rzuVar.g = rzuVar.f.f().toEpochMilli();
                    if (sklVar.b() == slm.PAUSE) {
                        agke agkeVar = smrVar.e;
                        if (((agpi) agkeVar).d == 1 && (agkeVar.get(0) instanceof slk)) {
                            str2 = str;
                            rzuVar.h = str2;
                        } else {
                            str2 = str;
                        }
                    } else {
                        str2 = str;
                    }
                }
            } else {
                str2 = str;
            }
            if (wgkVar.d() == null && wgkVar.a().isEmpty()) {
                return agpi.a;
            }
            yvs yvsVar = (smrVar == null || !smrVar.e(sih.class)) ? null : (yvs) smrVar.d(sih.class);
            if (m(wgkVar)) {
                return l(wgkVar, str2, wjfVar, acfwVar, sklVar);
            }
            final Optional optionalOfNullable = Optional.ofNullable(yvsVar);
            agke agkeVarB = wgkVar.b(agke.r(aixo.SLOT_TYPE_PLAYER_BYTES, aixo.SLOT_TYPE_BELOW_PLAYER_IMMERSIVE));
            if (!agkeVarB.isEmpty()) {
                if (!taq.aX(vyoVar) || !Collection.EL.stream(agkeVarB).anyMatch(new rej(18)) || (!optionalOfNullable.isEmpty() && wjfVar.P())) {
                    return (agke) Collection.EL.stream(agkeVarB).map(new Function() { // from class: rzf
                        @Override // java.util.function.Function
                        /* JADX INFO: renamed from: andThen */
                        public final /* synthetic */ Function mo840andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        /* JADX WARN: Code duplicated, block: B:25:0x0064 A[Catch: sav -> 0x0091, TryCatch #2 {sav -> 0x0091, blocks: (B:17:0x0045, B:19:0x004f, B:21:0x0053, B:22:0x0055, B:24:0x005b, B:25:0x0064, B:27:0x006a, B:28:0x006c), top: B:94:0x0045 }] */
                        /* JADX WARN: Code duplicated, block: B:27:0x006a A[Catch: sav -> 0x0091, TryCatch #2 {sav -> 0x0091, blocks: (B:17:0x0045, B:19:0x004f, B:21:0x0053, B:22:0x0055, B:24:0x005b, B:25:0x0064, B:27:0x006a, B:28:0x006c), top: B:94:0x0045 }] */
                        /* JADX WARN: Type inference failed for: r0v9, types: [awmd, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r2v5, types: [awmd, java.lang.Object] */
                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            agke agkeVarC;
                            snk snkVar;
                            aizs aizsVar;
                            snk snkVarB;
                            aivt aivtVar = (aivt) obj;
                            aivs aivsVar = aivtVar.c;
                            if (aivsVar == null) {
                                aivsVar = aivs.a;
                            }
                            aixo aixoVarA = aixo.a(aivsVar.d);
                            if (aixoVarA == null) {
                                aixoVarA = aixo.SLOT_TYPE_UNSPECIFIED;
                            }
                            wgk wgkVar2 = wgkVar;
                            acfw acfwVar2 = acfwVar;
                            wjf wjfVar2 = wjfVar;
                            String str3 = str;
                            xte xteVar = this.f;
                            if (aixoVarA != aixo.SLOT_TYPE_BELOW_PLAYER_IMMERSIVE) {
                                return ((aaok) xteVar.b.io()).Z(aivtVar, str3, wjfVar2, acfwVar2, Optional.empty(), Optional.of(wgkVar2), optionalOfNullable, Optional.empty(), null);
                            }
                            aivu aivuVar = aivtVar.e;
                            if (aivuVar == null) {
                                aivuVar = aivu.a;
                            }
                            apji apjiVar = aivuVar.b;
                            if (apjiVar == null) {
                                apjiVar = apji.a;
                            }
                            ajlj ajljVar = (ajlj) aavv.s(apjiVar, ajlk.a);
                            aaok aaokVar = (aaok) xteVar.b.io();
                            agke agkeVarC2 = agpi.a;
                            try {
                                if (taq.aO((vyo) aaokVar.c)) {
                                    aizs aizsVar2 = aivtVar.f;
                                    if (aizsVar2 == null) {
                                        aizsVar2 = aizs.a;
                                    }
                                    if (aizsVar2.b == 17) {
                                        snkVarB = aaokVar.ab(Optional.of(wgkVar2), str3, wjfVar2, aivtVar);
                                    } else {
                                        Object obj2 = aaokVar.b;
                                        aizsVar = aivtVar.f;
                                        if (aizsVar == null) {
                                            aizsVar = aizs.a;
                                        }
                                        snkVarB = nrj.b(aizsVar, Optional.of(str3));
                                    }
                                } else {
                                    Object obj3 = aaokVar.b;
                                    aizsVar = aivtVar.f;
                                    if (aizsVar == null) {
                                        aizsVar = aizs.a;
                                    }
                                    snkVarB = nrj.b(aizsVar, Optional.of(str3));
                                }
                                snkVar = snkVarB;
                                try {
                                    Object obj4 = aaokVar.b;
                                    agkeVarC = nrj.c(aivtVar.g, Optional.of(str3));
                                    try {
                                        agkeVarC2 = nrj.c(aivtVar.h, Optional.of(str3));
                                    } catch (sav e) {
                                        e = e;
                                        rmp.j(null, "Failed to create a client trigger. ".concat(String.valueOf(e.getMessage())));
                                    }
                                } catch (sav e2) {
                                    e = e2;
                                    agkeVarC = agkeVarC2;
                                }
                            } catch (sav e3) {
                                e = e3;
                                agkeVarC = agkeVarC2;
                                snkVar = null;
                            }
                            agke agkeVar2 = agkeVarC2;
                            agke agkeVar3 = agkeVarC;
                            ArrayList arrayList = new ArrayList();
                            if (ajljVar == null) {
                                ajljVar = ajlj.a;
                            }
                            arrayList.add(new shw(ajljVar));
                            arrayList.add(new shl(wgkVar2));
                            arrayList.add(new sic(str3));
                            aivs aivsVar2 = aivtVar.c;
                            if (aivsVar2 == null) {
                                aivsVar2 = aivs.a;
                            }
                            int iBf = a.bf(aivsVar2.g);
                            arrayList.add(new sit(iBf != 0 && iBf == 7));
                            if (taq.aO((vyo) aaokVar.c)) {
                                aivs aivsVar3 = aivtVar.c;
                                if (aivsVar3 == null) {
                                    aivsVar3 = aivs.a;
                                }
                                int iBf2 = a.bf(aivsVar3.g);
                                arrayList.add(new siu(iBf2 != 0 && iBf2 == 3));
                                arrayList.add(new sjy(acfwVar2));
                            }
                            aivs aivsVar4 = aivtVar.c;
                            String str4 = (aivsVar4 == null ? aivs.a : aivsVar4).c;
                            aixo aixoVarA2 = aixo.a((aivsVar4 == null ? aivs.a : aivsVar4).d);
                            if (aixoVarA2 == null) {
                                aixoVarA2 = aixo.SLOT_TYPE_UNSPECIFIED;
                            }
                            aixo aixoVar = aixoVarA2;
                            if (aivsVar4 == null) {
                                aivsVar4 = aivs.a;
                            }
                            int i2 = aivsVar4.e;
                            agke agkeVarQ = snkVar == null ? agpi.a : agke.q(snkVar);
                            shh shhVarA = shh.a(arrayList);
                            aivs aivsVar5 = aivtVar.c;
                            if (aivsVar5 == null) {
                                aivsVar5 = aivs.a;
                            }
                            aivr aivrVar = aivsVar5.f;
                            if (aivrVar == null) {
                                aivrVar = aivr.a;
                            }
                            return smr.h(str4, aixoVar, i2, agkeVarQ, agkeVar3, agkeVar2, shhVarA, Optional.of(aivrVar), Optional.empty());
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(aghu.a);
                }
                ((ruu) this.e.io()).a("cuepoint_not_present_for_lsbs", String.format(Locale.US, "is_live.%s;is_dai.%s;is_lifa.%s;cpid.%s;", Boolean.valueOf(wjfVar.V()), Boolean.valueOf(wjfVar.P()), Boolean.valueOf(wjfVar.T()), optionalOfNullable.isPresent() ? ((yvs) optionalOfNullable.get()).a : "no_cuepoint"));
                return agpi.a;
            }
            boolean zIsEmpty = optionalOfNullable.isEmpty();
            ?? r0 = this.b;
            if (zIsEmpty) {
                optionalAc = ((aaok) r0.io()).ac(wgkVar, str, wjfVar, acfwVar, sklVar, Optional.empty());
            } else {
                aaok aaokVar = (aaok) r0.io();
                yvs yvsVar2 = (yvs) optionalOfNullable.get();
                if (sklVar == null) {
                    rmp.j(null, "Attempted to create a live stream player bytes slot from a null ad break.");
                    optionalAc = Optional.empty();
                } else {
                    optionalAc = aaokVar.ac(wgkVar, str, wjfVar, acfwVar, sklVar, Optional.of(yvsVar2));
                }
            }
            if (true == optionalAc.isPresent()) {
                optionalAc = Optional.ofNullable(agke.q(optionalAc.get()));
            }
            return (agke) optionalAc.orElse(agpi.a);
        }
        rzu rzuVar2 = (rzu) this.d.io();
        if (sklVar.b().equals(slm.MID_ROLL)) {
            agke agkeVar2 = smrVar.e;
            int i2 = ((agpi) agkeVar2).d;
            while (i < i2) {
                snk snkVar = (snk) agkeVar2.get(i);
                i++;
                if (snkVar instanceof slk) {
                    snhVar = ((slk) snkVar).b;
                    break;
                }
            }
            snh snhVar2 = snhVar;
            if (snhVar2 == null) {
                rmp rmpVar = rzuVar2.j;
                rmp.n(smrVar, "An ad break slot was created without a fulfillment MediaTimeRangeTrigger.");
            } else {
                aixo aixoVarC = smrVar.c();
                aixo aixoVar = aixo.SLOT_TYPE_AD_BREAK_REQUEST;
                if (aixoVarC == aixoVar) {
                    shh shhVar = smrVar.g;
                    if (shhVar.e(sis.class)) {
                        vyo vyoVar2 = rzuVar2.e;
                        if (!taq.aM(vyoVar2) || (afxw.e(vyoVar2).bz && TextUtils.equals(rzuVar2.h, rzuVar2.a))) {
                            List list = rzuVar2.i;
                            aaok aaokVar2 = (aaok) rzuVar2.c.io();
                            String str3 = rzuVar2.a;
                            String strAa = ((xsc) aaokVar2.d).aa();
                            sdq sdqVarW = aaokVar2.W(strAa, str3, snhVar2, true, true, false);
                            list.add(new adz(smr.b(strAa, aixoVar, 1, 1, sdqVarW.a, sdqVarW.b, sdqVarW.c, shhVar, smrVar.h), new snh(sklVar.a(), snhVar2.b)));
                        } else {
                            skl sklVar2 = (skl) shhVar.d(sis.class);
                            long j = snhVar2.a;
                            if (rzuVar2.f.f().toEpochMilli() - rzuVar2.g < taq.Z(vyoVar2)) {
                                rmp.k(smrVar, "Watch While slot dropped due to frequency cap.");
                            } else {
                                long j2 = j + 15000;
                                long j3 = snhVar2.b;
                                if (j2 < j3) {
                                    aaok aaokVar3 = (aaok) rzuVar2.c.io();
                                    String str4 = rzuVar2.a;
                                    snh snhVar3 = new snh(j2, j3);
                                    String strAa2 = ((xsc) aaokVar3.d).aa();
                                    sdq sdqVarW2 = aaokVar3.W(strAa2, str4, snhVar3, aaokVar3.ad(), aaokVar3.ae(), true);
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(new sic((String) smrVar.d(sic.class)));
                                    arrayList.add(new sid((wjf) smrVar.d(sid.class)));
                                    arrayList.add(new sjy((acfw) smrVar.d(sjy.class)));
                                    arrayList.add(new sip(sklVar2));
                                    arrayList.add(new siz());
                                    ((roq) rzuVar2.d.io()).f(7, rzuVar2.b, new rzt(smr.b(strAa2, aixoVar, 1, 1, sdqVarW2.a, sdqVarW2.b, sdqVarW2.c, shh.a(arrayList), smrVar.h), 1));
                                    if (!afxw.e(vyoVar2).bw) {
                                    }
                                }
                                List list2 = rzuVar2.i;
                                aaok aaokVar4 = (aaok) rzuVar2.c.io();
                                String str5 = rzuVar2.a;
                                String strAa3 = ((xsc) aaokVar4.d).aa();
                                sdq sdqVarW3 = aaokVar4.W(strAa3, str5, snhVar2, true, true, false);
                                list2.add(new adz(smr.b(strAa3, aixoVar, 1, 1, sdqVarW3.a, sdqVarW3.b, sdqVarW3.c, shhVar, smrVar.h), new snh(sklVar.a(), snhVar2.b)));
                            }
                            List list3 = rzuVar2.i;
                            aaok aaokVar5 = (aaok) rzuVar2.c.io();
                            String str6 = rzuVar2.a;
                            String strAa4 = ((xsc) aaokVar5.d).aa();
                            sdq sdqVarW4 = aaokVar5.W(strAa4, str6, snhVar2, true, true, false);
                            list3.add(new adz(smr.b(strAa4, aixoVar, 1, 1, sdqVarW4.a, sdqVarW4.b, sdqVarW4.c, shhVar, smrVar.h), new snh(sklVar.a(), snhVar2.b)));
                        }
                    } else {
                        List list4 = rzuVar2.i;
                        aaok aaokVar6 = (aaok) rzuVar2.c.io();
                        String str7 = rzuVar2.a;
                        String strAa5 = ((xsc) aaokVar6.d).aa();
                        sdq sdqVarW5 = aaokVar6.W(strAa5, str7, snhVar2, true, true, false);
                        list4.add(new adz(smr.b(strAa5, aixoVar, 1, 1, sdqVarW5.a, sdqVarW5.b, sdqVarW5.c, shhVar, smrVar.h), new snh(sklVar.a(), snhVar2.b)));
                    }
                }
            }
        }
        return m(wgkVar) ? l(wgkVar, str, wjfVar, acfwVar, sklVar) : agpi.a;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003c  */
    /* JADX WARN: Type inference failed for: r0v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r5v15, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, zwb] */
    public final void k(sny snyVar, Uri uri, zya zyaVar, boolean z, long j, int i, smr smrVar, sko skoVar, int i2) {
        boolean z2;
        int i3;
        String string;
        int i4;
        int i5;
        Uri uriH = uri;
        if (uriH == null || uriH.equals(Uri.EMPTY)) {
            throw new sat("Null or empty uri when trying to log", 81);
        }
        int i6 = 1;
        if (z) {
            z2 = true;
        } else {
            ?? r5 = this.a;
            if (afxw.e((vyo) r5.io()).cf || (afxw.e((vyo) r5.io()).cg && n(uriH))) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        int i7 = i - 1;
        if (i7 == 3 || i7 == 5) {
            uriH = ((ahgb) this.d).H(uriH);
        } else if (i7 == 6) {
            ((ahgb) this.d).H(uriH);
            return;
        }
        zxi zxiVarD = snyVar.d(uriH, this.b.e());
        uriH.toString();
        ?? r13 = this.a;
        if (afxw.e((vyo) r13.io()).ci && smrVar != null && skoVar != null && smrVar.c() == aixo.SLOT_TYPE_PLAYER_BYTES && n(uriH)) {
            Object obj = this.c;
            aihf aihfVarCreateBuilder = aizg.a.createBuilder();
            aixn aixnVar = aixn.RENDERING_EVENT_TYPE_AD_IMPRESSION_PING_SENT;
            aihfVarCreateBuilder.copyOnWrite();
            aizg aizgVar = (aizg) aihfVarCreateBuilder.instance;
            aizgVar.e = aixnVar.C;
            aizgVar.b |= 1;
            aihf aihfVarCreateBuilder2 = aixu.a.createBuilder();
            if (uriH == null) {
                string = "";
                i3 = 1;
            } else {
                String encodedQuery = uriH.getEncodedQuery();
                if (encodedQuery == null || encodedQuery.isEmpty()) {
                    i3 = 1;
                    string = uriH.toString();
                } else {
                    StringBuilder sb = new StringBuilder(encodedQuery);
                    int iIndexOf = sb.indexOf("cid=");
                    for (int i8 = -1; iIndexOf != i8; i8 = -1) {
                        if (iIndexOf != 0) {
                            i4 = i6;
                            if (sb.charAt(iIndexOf - 1) != '&') {
                                i5 = iIndexOf + 4;
                            }
                            iIndexOf = sb.indexOf("cid=", i5);
                            i6 = i4;
                        } else {
                            i4 = i6;
                        }
                        int i9 = iIndexOf + 4;
                        int iIndexOf2 = sb.indexOf("&", i9);
                        if (iIndexOf2 == -1) {
                            iIndexOf2 = sb.length();
                        }
                        while (i9 < iIndexOf2) {
                            sb.setCharAt(i9, '*');
                            i9++;
                        }
                        i5 = iIndexOf2;
                        iIndexOf = sb.indexOf("cid=", i5);
                        i6 = i4;
                    }
                    i3 = i6;
                    string = uriH.buildUpon().encodedQuery(sb.toString()).build().toString();
                }
            }
            aihfVarCreateBuilder2.copyOnWrite();
            aixu aixuVar = (aixu) aihfVarCreateBuilder2.instance;
            string.getClass();
            aixuVar.b |= 1;
            aixuVar.c = string;
            aixu aixuVar2 = (aixu) aihfVarCreateBuilder2.build();
            aihfVarCreateBuilder.copyOnWrite();
            aizg aizgVar2 = (aizg) aihfVarCreateBuilder.instance;
            aixuVar2.getClass();
            aizgVar2.d = aixuVar2;
            aizgVar2.c = 13;
            ((spv) obj).a((aizg) aihfVarCreateBuilder.build(), null, smrVar, skoVar);
        } else {
            i3 = 1;
        }
        this.e.execute(afwl.i(new acri(zxiVarD, zyaVar, z2, j, snyVar, 1)));
        if (afxw.e((vyo) r13.io()).ch && !n(uriH)) {
            ((xkn) this.f.io()).a(22);
        }
        if (i2 == i3 && afxw.e((vyo) r13.io()).cj) {
            float f = afxw.e((vyo) r13.io()).ck;
            if (f > 0.0f) {
                if (f >= 1.0f || ThreadLocalRandom.current().nextFloat() < f) {
                    ((xkn) this.f.io()).a(26);
                }
            }
        }
    }

    public xte(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, vyo vyoVar, awmd awmdVar5) {
        this.b = awmdVar;
        this.a = awmdVar2;
        this.d = awmdVar3;
        this.f = awmdVar4;
        this.c = vyoVar;
        this.e = awmdVar5;
    }

    public xte(zwb zwbVar, Executor executor, ahgb ahgbVar, spv spvVar, awmd awmdVar, awmd awmdVar2) {
        this.b = zwbVar;
        this.e = executor;
        this.d = ahgbVar;
        this.c = spvVar;
        this.f = awmdVar;
        this.a = awmdVar2;
    }

    public xte(cf cfVar, vxe vxeVar, aaqf aaqfVar, xgm xgmVar, Executor executor) {
        this.c = cfVar;
        this.a = aaqfVar;
        this.e = vxeVar;
        this.b = xgmVar;
        this.d = executor;
        this.f = new sud();
    }

    public xte(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        awmdVar.getClass();
        this.a = awmdVar;
        this.e = awmdVar2;
        awmdVar3.getClass();
        this.d = awmdVar3;
        awmdVar4.getClass();
        this.c = awmdVar4;
        awmdVar5.getClass();
        this.b = awmdVar5;
        awmdVar6.getClass();
        this.f = awmdVar6;
    }

    public xte(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, byte[] bArr, byte[] bArr2) {
        awmdVar.getClass();
        this.c = awmdVar;
        this.f = awmdVar2;
        awmdVar3.getClass();
        this.a = awmdVar3;
        this.b = awmdVar4;
        this.d = awmdVar5;
        awmdVar6.getClass();
        this.e = awmdVar6;
    }

    public xte(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, byte[] bArr) {
        awmdVar.getClass();
        this.a = awmdVar;
        this.c = awmdVar2;
        this.d = awmdVar3;
        this.b = awmdVar4;
        awmdVar5.getClass();
        this.e = awmdVar5;
        this.f = awmdVar6;
    }

    public xte(Context context, Executor executor, Executor executor2, ssr ssrVar, zsl zslVar) {
        this.e = context;
        this.c = executor;
        this.d = executor2;
        this.b = ssrVar;
        this.a = zslVar;
        this.f = new HashSet();
    }

    public xte(Context context, rly rlyVar, wjr wjrVar, tgg tggVar, vxz vxzVar, mbc mbcVar) {
        this.d = context;
        this.b = rlyVar;
        this.a = wjrVar;
        this.e = tggVar;
        this.f = vxzVar;
        this.c = mbcVar;
    }

    public xte(Context context, ssr ssrVar, vxz vxzVar, awut awutVar, aaok aaokVar, aunn aunnVar, zvl zvlVar) {
        context.getClass();
        ssrVar.getClass();
        awutVar.getClass();
        aaokVar.getClass();
        aunnVar.getClass();
        zvlVar.getClass();
        this.f = context;
        this.c = ssrVar;
        this.b = vxzVar;
        this.a = aaokVar;
        this.d = aunnVar;
        this.e = zvlVar;
    }

    public xte(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6) {
        this.c = awmdVar;
        awmdVar2.getClass();
        this.f = awmdVar2;
        awmdVar3.getClass();
        this.e = awmdVar3;
        awmdVar4.getClass();
        this.a = awmdVar4;
        awmdVar5.getClass();
        this.d = awmdVar5;
        this.b = awmdVar6;
    }

    public xte(abvn abvnVar, xsh xshVar, avmb avmbVar, adhv adhvVar, Resources resources) {
        this.a = xsj.e;
        this.b = abvnVar;
        this.c = xshVar;
        this.d = avmbVar;
        this.e = adhvVar;
        this.f = resources;
    }
}
