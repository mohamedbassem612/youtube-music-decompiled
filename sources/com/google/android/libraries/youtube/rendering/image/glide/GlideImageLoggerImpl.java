package com.google.android.libraries.youtube.rendering.image.glide;

import android.util.Size;
import app.rive.semantics.SemanticState;
import com.google.cardboard.sdk.R;
import defpackage.adge;
import defpackage.adio;
import defpackage.adiq;
import defpackage.adiu;
import defpackage.adiv;
import defpackage.adiw;
import defpackage.adix;
import defpackage.afwl;
import defpackage.agfr;
import defpackage.agrf;
import defpackage.aguu;
import defpackage.ahbu;
import defpackage.ahfg;
import defpackage.aihf;
import defpackage.aihn;
import defpackage.aihv;
import defpackage.ajwc;
import defpackage.alos;
import defpackage.alot;
import defpackage.alou;
import defpackage.aqll;
import defpackage.aqlm;
import defpackage.awmd;
import defpackage.axno;
import defpackage.ctx;
import defpackage.laz;
import defpackage.mbc;
import defpackage.nci;
import defpackage.ncl;
import defpackage.qnl;
import defpackage.rir;
import defpackage.vxz;
import defpackage.xeu;
import defpackage.xff;
import defpackage.xks;
import defpackage.ztf;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class GlideImageLoggerImpl implements adio {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/rendering/image/glide/GlideImageLoggerImpl");
    public final agfr b;
    public final Map c = new HashMap();
    public final Map d = new HashMap();
    public final LinkedHashMap e = new adiv(this);
    private final awmd f;
    private final mbc g;
    private final Executor h;
    private final List i;

    public GlideImageLoggerImpl(Executor executor, awmd awmdVar, mbc mbcVar, vxz vxzVar, xks xksVar) {
        this.f = awmdVar;
        this.g = mbcVar;
        this.h = new ahfg(executor);
        this.b = aguu.al(new adge(vxzVar, 8));
        this.i = xksVar.b;
    }

    private String getUrl(ncl nclVar) {
        if (nclVar == null) {
            return null;
        }
        return nclVar.k();
    }

    @Override // defpackage.nuv
    public final void a(int i) {
        this.h.execute(afwl.i(new rir(this, i, 16)));
    }

    @Override // defpackage.nuv
    public final void b(int i) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        this.h.execute(afwl.i(new ctx(this, i, this.g.c() / 1000, 3)));
    }

    @Override // defpackage.nuv
    public final void c(int i) {
        this.h.execute(afwl.i(new ctx(this, i, this.g.c() / 1000, 4)));
    }

    @Override // defpackage.nuv
    public final void d(int i) {
        this.h.execute(afwl.i(new ctx(this, i, this.g.c() / 1000, 2)));
    }

    @Override // defpackage.nuv
    public final void e(final int i, final ncl nclVar, final String str) {
        if (nclVar != null) {
            final String strK = nclVar.k();
            if (strK == null) {
                this.h.execute(afwl.i(new rir(this, i, 15)));
                return;
            }
            mbc mbcVar = this.g;
            final long jC = mbcVar.c() / 1000;
            final long jB = ahbu.b(mbcVar.f()) - jC;
            this.h.execute(afwl.i(new Runnable() { // from class: adip
                @Override // java.lang.Runnable
                public final void run() {
                    Integer numValueOf = Integer.valueOf(i);
                    final String str2 = strK;
                    final long j = jB;
                    final long j2 = jC;
                    final ncl nclVar2 = nclVar;
                    final String str3 = str;
                    j$.util.Map.EL.computeIfAbsent(this.a.c, numValueOf, new Function() { // from class: adir
                        @Override // java.util.function.Function
                        /* JADX INFO: renamed from: andThen */
                        public final /* synthetic */ Function mo840andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            String str4 = str2;
                            long j3 = j;
                            long j4 = j2;
                            ncl nclVar3 = nclVar2;
                            return new adix(str4, j3, j4, nclVar3.h(), nclVar3.g(), str3);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                }
            }));
        }
    }

    @Override // defpackage.nuv
    public final void f(int i, int i2) {
        this.h.execute(afwl.i(new axno(this, i, i2, this.g.c() / 1000, 1)));
    }

    @Override // defpackage.nuv
    public final void g(int i, nci nciVar, Size size, String str) {
        this.h.execute(afwl.i(new adiq(this, i, this.g.c() / 1000, size, str, nciVar, 0)));
    }

    /* JADX WARN: Code duplicated, block: B:131:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:132:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:135:0x0412  */
    public final void h(int i) {
        int i2;
        int i3;
        int i4;
        long j;
        long j2;
        xeu xeuVar;
        String strSubstring;
        Map map = this.c;
        adix adixVar = (adix) map.get(Integer.valueOf(i));
        if (adixVar != null) {
            LinkedHashMap linkedHashMap = this.e;
            String str = adixVar.a;
            adiw adiwVar = (adiw) linkedHashMap.get(str);
            aihf aihfVarCreateBuilder = aqlm.a.createBuilder();
            List list = this.i;
            if (!list.isEmpty()) {
                aihfVarCreateBuilder.copyOnWrite();
                aqlm aqlmVar = (aqlm) aihfVarCreateBuilder.instance;
                aihv aihvVar = aqlmVar.t;
                if (!aihvVar.c()) {
                    aqlmVar.t = aihn.mutableCopy(aihvVar);
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    aqlmVar.t.h(((ajwc) it.next()).f);
                }
            }
            int i5 = adixVar.d;
            if (i5 > 0) {
                aihfVarCreateBuilder.copyOnWrite();
                aqlm aqlmVar2 = (aqlm) aihfVarCreateBuilder.instance;
                aqlmVar2.b |= 16;
                aqlmVar2.d = i5;
            }
            int i6 = adixVar.e;
            if (i6 > 0) {
                aihfVarCreateBuilder.copyOnWrite();
                aqlm aqlmVar3 = (aqlm) aihfVarCreateBuilder.instance;
                aqlmVar3.b |= 32;
                aqlmVar3.e = i6;
            }
            int i7 = adixVar.b;
            if (i7 > 0) {
                aihfVarCreateBuilder.copyOnWrite();
                aqlm aqlmVar4 = (aqlm) aihfVarCreateBuilder.instance;
                aqlmVar4.b |= SemanticState.Obscured;
                aqlmVar4.h = i7;
            }
            int i8 = adixVar.c;
            if (i8 > 0) {
                aihfVarCreateBuilder.copyOnWrite();
                aqlm aqlmVar5 = (aqlm) aihfVarCreateBuilder.instance;
                aqlmVar5.b |= SemanticState.Multiline;
                aqlmVar5.i = i8;
            }
            String str2 = adixVar.f;
            if (str2 != null) {
                StringBuilder sb = new StringBuilder();
                int i9 = 0;
                while (i9 <= str2.length()) {
                    int iIndexOf = str2.indexOf(R.styleable.AppCompatTheme_windowMinWidthMajor, i9);
                    if (iIndexOf != -1) {
                        strSubstring = str2.substring(i9, iIndexOf);
                    } else if (i9 >= str2.length()) {
                        break;
                    } else {
                        strSubstring = str2.substring(i9);
                    }
                    Optional optionalBr = qnl.br(strSubstring, true);
                    if (optionalBr.isPresent()) {
                        if (sb.length() > 0) {
                            sb.append('|');
                        }
                        sb.append((String) optionalBr.get());
                    }
                    if (iIndexOf == -1) {
                        break;
                    } else {
                        i9 = iIndexOf + 1;
                    }
                }
                String string = sb.toString();
                aihfVarCreateBuilder.copyOnWrite();
                aqlm aqlmVar6 = (aqlm) aihfVarCreateBuilder.instance;
                aqlmVar6.c |= 64;
                aqlmVar6.m = string;
            }
            int i10 = adixVar.q;
            if (i10 != 0) {
                aihfVarCreateBuilder.copyOnWrite();
                aqlm aqlmVar7 = (aqlm) aihfVarCreateBuilder.instance;
                aqlmVar7.k = i10 - 1;
                aqlmVar7.c |= 8;
            }
            if (str.contains(".googleusercontent.com/") || str.contains(".ggpht.com/")) {
                i2 = 2;
            } else if (!str.contains("img.youtube.com/") && !str.contains(".ytimg.com/") && !str.contains(".gstatic.com/")) {
                i2 = 1;
            } else if (str.contains("/eb/")) {
                i2 = 4;
            } else {
                i2 = str.contains("/es/") ? 5 : 3;
            }
            if (i2 != 1) {
                aihfVarCreateBuilder.copyOnWrite();
                aqlm aqlmVar8 = (aqlm) aihfVarCreateBuilder.instance;
                aqlmVar8.q = i2 - 1;
                aqlmVar8.c |= SemanticState.ReadOnly;
            }
            if (adixVar.g) {
                aihfVarCreateBuilder.copyOnWrite();
                aqlm aqlmVar9 = (aqlm) aihfVarCreateBuilder.instance;
                aqlmVar9.b |= 4194304;
                aqlmVar9.j = true;
                aihfVarCreateBuilder.copyOnWrite();
                aqlm aqlmVar10 = (aqlm) aihfVarCreateBuilder.instance;
                aqlmVar10.b |= SemanticState.LiveRegion;
                aqlmVar10.g = false;
            } else if (adixVar.h) {
                aihfVarCreateBuilder.copyOnWrite();
                aqlm aqlmVar11 = (aqlm) aihfVarCreateBuilder.instance;
                aqlmVar11.b |= SemanticState.LiveRegion;
                aqlmVar11.g = false;
            } else if (adixVar.i) {
                aihfVarCreateBuilder.copyOnWrite();
                aqlm aqlmVar12 = (aqlm) aihfVarCreateBuilder.instance;
                aqlmVar12.b |= SemanticState.LiveRegion;
                aqlmVar12.g = true;
            }
            String str3 = adixVar.j;
            if (str3 != null) {
                aihfVarCreateBuilder.copyOnWrite();
                aqlm aqlmVar13 = (aqlm) aihfVarCreateBuilder.instance;
                aqlmVar13.c |= SemanticState.Modal;
                aqlmVar13.r = str3;
            }
            Map map2 = this.d;
            Integer numValueOf = Integer.valueOf(i);
            Long l = (Long) map2.get(numValueOf);
            if (l != null) {
                i3 = 2;
                long jLongValue = l.longValue() + adixVar.k;
                aihfVarCreateBuilder.copyOnWrite();
                aqlm aqlmVar14 = (aqlm) aihfVarCreateBuilder.instance;
                i4 = 4;
                aqlmVar14.c |= SemanticState.Obscured;
                aqlmVar14.s = jLongValue;
            } else {
                i3 = 2;
                i4 = 4;
            }
            long j3 = adixVar.m;
            long j4 = adixVar.l;
            long j5 = j3 - j4;
            if (j4 > 0 && j5 > 0) {
                aihf aihfVarCreateBuilder2 = aqll.a.createBuilder();
                aihfVarCreateBuilder2.copyOnWrite();
                aqll aqllVar = (aqll) aihfVarCreateBuilder2.instance;
                aqllVar.b |= 1;
                aqllVar.c = "img_e2e";
                long j6 = adixVar.k;
                aihfVarCreateBuilder2.copyOnWrite();
                aqll aqllVar2 = (aqll) aihfVarCreateBuilder2.instance;
                aqllVar2.b |= 2;
                aqllVar2.d = j4 + j6;
                aihfVarCreateBuilder2.copyOnWrite();
                aqll aqllVar3 = (aqll) aihfVarCreateBuilder2.instance;
                aqllVar3.b |= 4;
                aqllVar3.e = j5;
                aihfVarCreateBuilder.ct((aqll) aihfVarCreateBuilder2.build());
            }
            int i11 = adixVar.p;
            if (i11 == 5) {
                aihfVarCreateBuilder.copyOnWrite();
                aqlm aqlmVar15 = (aqlm) aihfVarCreateBuilder.instance;
                aqlmVar15.n = 3;
                aqlmVar15.c |= SemanticState.Focused;
            } else {
                if (i11 != 1) {
                    if (i11 != i3 || adiwVar == null) {
                        aihfVarCreateBuilder.copyOnWrite();
                        aqlm aqlmVar16 = (aqlm) aihfVarCreateBuilder.instance;
                        aqlmVar16.n = 0;
                        aqlmVar16.c |= SemanticState.Focused;
                    } else {
                        int i12 = true != adiwVar.b ? 2 : 3;
                        aihfVarCreateBuilder.copyOnWrite();
                        aqlm aqlmVar17 = (aqlm) aihfVarCreateBuilder.instance;
                        aqlmVar17.n = i12 - 1;
                        aqlmVar17.c |= SemanticState.Focused;
                        int i13 = adiwVar.c;
                        if (i13 > 0) {
                            aihfVarCreateBuilder.copyOnWrite();
                            aqlm aqlmVar18 = (aqlm) aihfVarCreateBuilder.instance;
                            aqlmVar18.c |= SemanticState.LiveRegion;
                            aqlmVar18.p = i13;
                        }
                        int i14 = adiwVar.a;
                        if (i14 > 0) {
                            aihfVarCreateBuilder.copyOnWrite();
                            aqlm aqlmVar19 = (aqlm) aihfVarCreateBuilder.instance;
                            aqlmVar19.b |= SemanticState.Focused;
                            aqlmVar19.f = i14;
                        }
                        String str4 = adiwVar.d;
                        if (str4 != null) {
                            aihfVarCreateBuilder.copyOnWrite();
                            aqlm aqlmVar20 = (aqlm) aihfVarCreateBuilder.instance;
                            aqlmVar20.c |= SemanticState.Hidden;
                            aqlmVar20.o = str4;
                        }
                        if (adiwVar.g) {
                            aihfVarCreateBuilder.copyOnWrite();
                            aqlm aqlmVar21 = (aqlm) aihfVarCreateBuilder.instance;
                            aqlmVar21.b |= 4194304;
                            aqlmVar21.j = true;
                            aihfVarCreateBuilder.copyOnWrite();
                            aqlm aqlmVar22 = (aqlm) aihfVarCreateBuilder.instance;
                            aqlmVar22.b |= SemanticState.LiveRegion;
                            aqlmVar22.g = false;
                        }
                        long j7 = adiwVar.f;
                        long j8 = adiwVar.e;
                        long j9 = j7 - j8;
                        if (j8 > 0 && j9 > 0) {
                            aihf aihfVarCreateBuilder3 = aqll.a.createBuilder();
                            aihfVarCreateBuilder3.copyOnWrite();
                            aqll aqllVar4 = (aqll) aihfVarCreateBuilder3.instance;
                            aqllVar4.b |= 1;
                            aqllVar4.c = "img_load";
                            long j10 = adixVar.k;
                            aihfVarCreateBuilder3.copyOnWrite();
                            aqll aqllVar5 = (aqll) aihfVarCreateBuilder3.instance;
                            aqllVar5.b |= 2;
                            aqllVar5.d = j8 + j10;
                            aihfVarCreateBuilder3.copyOnWrite();
                            aqll aqllVar6 = (aqll) aihfVarCreateBuilder3.instance;
                            aqllVar6.b |= 4;
                            aqllVar6.e = j9;
                            aihfVarCreateBuilder.ct((aqll) aihfVarCreateBuilder3.build());
                        }
                    }
                    long j11 = adixVar.o;
                    j = adixVar.n;
                    j2 = j11 - j;
                    if (j > 0 && j2 > 0) {
                        aihf aihfVarCreateBuilder4 = aqll.a.createBuilder();
                        aihfVarCreateBuilder4.copyOnWrite();
                        aqll aqllVar7 = (aqll) aihfVarCreateBuilder4.instance;
                        aqllVar7.b |= 1;
                        aqllVar7.c = "img_present";
                        long j12 = adixVar.n + adixVar.k;
                        aihfVarCreateBuilder4.copyOnWrite();
                        aqll aqllVar8 = (aqll) aihfVarCreateBuilder4.instance;
                        aqllVar8.b |= 2;
                        aqllVar8.d = j12;
                        aihfVarCreateBuilder4.copyOnWrite();
                        aqll aqllVar9 = (aqll) aihfVarCreateBuilder4.instance;
                        aqllVar9.b |= 4;
                        aqllVar9.e = j2;
                        aihfVarCreateBuilder.ct((aqll) aihfVarCreateBuilder4.build());
                    }
                    xeuVar = (xeu) this.f.io();
                    if (xeuVar.b) {
                        xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.THUMBNAIL_LOADED);
                        ztf ztfVar = xffVarA.k.e;
                        xffVarA.l = ztfVar.a();
                        ztfVar.k(xffVarA);
                    } else {
                        alos alosVar = (alos) alou.a.createBuilder();
                        alosVar.copyOnWrite();
                        alou alouVar = (alou) alosVar.instance;
                        aqlm aqlmVar23 = (aqlm) aihfVarCreateBuilder.build();
                        aqlmVar23.getClass();
                        alouVar.d = aqlmVar23;
                        alouVar.c = 15;
                        xeuVar.b((alou) alosVar.build());
                    }
                    map.remove(numValueOf);
                    if (adiwVar != null) {
                        linkedHashMap.remove(str);
                    }
                    map2.remove(numValueOf);
                }
                aihfVarCreateBuilder.copyOnWrite();
                aqlm aqlmVar24 = (aqlm) aihfVarCreateBuilder.instance;
                aqlmVar24.n = i4;
                aqlmVar24.c |= SemanticState.Focused;
            }
            long j13 = adixVar.o;
            j = adixVar.n;
            j2 = j13 - j;
            if (j > 0) {
                aihf aihfVarCreateBuilder5 = aqll.a.createBuilder();
                aihfVarCreateBuilder5.copyOnWrite();
                aqll aqllVar10 = (aqll) aihfVarCreateBuilder5.instance;
                aqllVar10.b |= 1;
                aqllVar10.c = "img_present";
                long j14 = adixVar.n + adixVar.k;
                aihfVarCreateBuilder5.copyOnWrite();
                aqll aqllVar11 = (aqll) aihfVarCreateBuilder5.instance;
                aqllVar11.b |= 2;
                aqllVar11.d = j14;
                aihfVarCreateBuilder5.copyOnWrite();
                aqll aqllVar12 = (aqll) aihfVarCreateBuilder5.instance;
                aqllVar12.b |= 4;
                aqllVar12.e = j2;
                aihfVarCreateBuilder.ct((aqll) aihfVarCreateBuilder5.build());
            }
            xeuVar = (xeu) this.f.io();
            if (xeuVar.b) {
                xff xffVarA2 = xeuVar.a(aihfVarCreateBuilder, alot.THUMBNAIL_LOADED);
                ztf ztfVar2 = xffVarA2.k.e;
                xffVarA2.l = ztfVar2.a();
                ztfVar2.k(xffVarA2);
            } else {
                alos alosVar2 = (alos) alou.a.createBuilder();
                alosVar2.copyOnWrite();
                alou alouVar2 = (alou) alosVar2.instance;
                aqlm aqlmVar25 = (aqlm) aihfVarCreateBuilder.build();
                aqlmVar25.getClass();
                alouVar2.d = aqlmVar25;
                alouVar2.c = 15;
                xeuVar.b((alou) alosVar2.build());
            }
            map.remove(numValueOf);
            if (adiwVar != null) {
                linkedHashMap.remove(str);
            }
            map2.remove(numValueOf);
        }
    }

    @Override // defpackage.adji
    public final void i(String str, int i) {
        if (str != null) {
            this.h.execute(afwl.i(new adiu(this, str, this.g.c() / 1000, i, 0)));
        }
    }

    @Override // defpackage.adji
    public final void j(String str) {
        if (str != null) {
            this.h.execute(afwl.i(new laz(this, str, this.g.c() / 1000, 18)));
        }
    }

    @Override // defpackage.adji
    public final void k(final String str, final int i, final boolean z, final String str2) {
        if (str != null) {
            final long jC = this.g.c() / 1000;
            this.h.execute(afwl.i(new Runnable() { // from class: adit
                @Override // java.lang.Runnable
                public final void run() {
                    adiw adiwVar = (adiw) this.a.e.get(str);
                    if (adiwVar == null || adiwVar.f != 0) {
                        return;
                    }
                    String str3 = str2;
                    boolean z2 = z;
                    int i2 = i;
                    adiwVar.f = jC;
                    adiwVar.a = i2;
                    adiwVar.b = z2;
                    adiwVar.d = str3;
                }
            }));
        }
    }
}
