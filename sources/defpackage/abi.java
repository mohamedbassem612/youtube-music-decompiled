package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class abi {
    public Object a;
    public final Object b;
    public Object c;
    public Object d;
    public Object e;

    public abi(wtj wtjVar) {
        wtjVar.getClass();
        this.b = wtjVar;
    }

    private static final List A(List list, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        jvl jvlVar = new jvl();
        jvlVar.g = (i - i2) / 2;
        int size = list.size();
        int i3 = 0;
        while (i3 < size) {
            if (i3 == 0) {
                arrayList.add(jvlVar);
                i3 = 0;
            }
            arrayList.add((jvl) list.get(i3));
            if (i3 == list.size() - 1) {
                arrayList.add(jvlVar);
            }
            i3++;
        }
        return arrayList;
    }

    private static final int B(jvk jvkVar, boolean z) {
        return z ? jvkVar.f() : jvkVar.h();
    }

    private static final int C(jvk jvkVar, boolean z) {
        return z ? jvkVar.h() : jvkVar.f();
    }

    private static final int D(jvk jvkVar, boolean z) {
        return z ? jvkVar.i() : jvkVar.g();
    }

    private static final int E(jvk jvkVar, boolean z) {
        return z ? jvkVar.g() : jvkVar.i();
    }

    private static final int F(jvk jvkVar, boolean z) {
        return z ? jvkVar.e() : jvkVar.o();
    }

    private static final int G(View view, boolean z) {
        return z ? view.getMeasuredWidth() : view.getMeasuredHeight();
    }

    private static final boolean H(int i, int i2, jvl jvlVar) {
        return i == i2 + (-1) && jvlVar.a() != 0;
    }

    static final long n(int i, int i2) {
        return (((long) i2) << 32) | (((long) i) & 4294967295L);
    }

    public static final int o(long j) {
        return (int) (j >> 32);
    }

    public static final int[] p(int i, List list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            jvm jvmVar = (jvm) it.next();
            int i3 = jvmVar.a;
            iArr[i2] = i3;
            sparseIntArray.append(i3, jvmVar.b);
            i2++;
        }
        return iArr;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, jvj] */
    private final int r(int i, jvk jvkVar, int i2) {
        ?? r2 = this.b;
        int iC = r2.c(i, r2.getPaddingTop() + r2.getPaddingBottom() + jvkVar.i() + jvkVar.f() + i2, jvkVar.e());
        int size = View.MeasureSpec.getSize(iC);
        if (size > jvkVar.j()) {
            return View.MeasureSpec.makeMeasureSpec(jvkVar.j(), View.MeasureSpec.getMode(iC));
        }
        return size < jvkVar.l() ? View.MeasureSpec.makeMeasureSpec(jvkVar.l(), View.MeasureSpec.getMode(iC)) : iC;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, jvj] */
    private final int s(int i, jvk jvkVar, int i2) {
        ?? r2 = this.b;
        int iD = r2.d(i, r2.getPaddingLeft() + r2.getPaddingRight() + jvkVar.g() + jvkVar.h() + i2, jvkVar.o());
        int size = View.MeasureSpec.getSize(iD);
        if (size > jvkVar.k()) {
            return View.MeasureSpec.makeMeasureSpec(jvkVar.k(), View.MeasureSpec.getMode(iD));
        }
        return size < jvkVar.m() ? View.MeasureSpec.makeMeasureSpec(jvkVar.m(), View.MeasureSpec.getMode(iD)) : iD;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, jvj] */
    private final void t(List list, jvl jvlVar, int i, int i2) {
        jvlVar.m = i2;
        this.b.q(jvlVar);
        jvlVar.p = i;
        list.add(jvlVar);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, jvj] */
    private final void u(View view, int i) {
        boolean z;
        jvk jvkVar = (jvk) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        boolean z2 = true;
        if (measuredWidth >= jvkVar.m()) {
            if (measuredWidth > jvkVar.k()) {
                measuredWidth = jvkVar.k();
            } else {
                z = false;
            }
            if (measuredHeight < jvkVar.l()) {
                measuredHeight = jvkVar.l();
            } else if (measuredHeight > jvkVar.j()) {
                measuredHeight = jvkVar.j();
            } else {
                z2 = z;
            }
            if (z2) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                z(i, iMakeMeasureSpec, iMakeMeasureSpec2, view);
                this.b.s(i, view);
            }
        }
        measuredWidth = jvkVar.m();
        z = true;
        if (measuredHeight < jvkVar.l()) {
            measuredHeight = jvkVar.l();
        } else if (measuredHeight > jvkVar.j()) {
            measuredHeight = jvkVar.j();
        } else {
            z2 = z;
        }
        if (z2) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
            view.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
            z(i, iMakeMeasureSpec3, iMakeMeasureSpec4, view);
            this.b.s(i, view);
        }
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, jvj] */
    private final void v(int i, int i2, jvl jvlVar, int i3, int i4, boolean z) {
        int i5;
        float f;
        int iMax;
        double d;
        double d2;
        float f2 = jvlVar.j;
        float f3 = 0.0f;
        if (f2 <= 0.0f || i3 < (i5 = jvlVar.e)) {
            return;
        }
        float f4 = (i3 - i5) / f2;
        jvlVar.e = i4 + jvlVar.f;
        int i6 = 0;
        if (!z) {
            jvlVar.g = Integer.MIN_VALUE;
        }
        boolean z2 = false;
        int i7 = 0;
        float f5 = 0.0f;
        while (i6 < jvlVar.h) {
            int i8 = jvlVar.o + i6;
            ?? r11 = this.b;
            View viewN = r11.n(i8);
            if (viewN == null || viewN.getVisibility() == 8) {
                f = f3;
                f4 = f4;
                z2 = z2;
            } else {
                jvk jvkVar = (jvk) viewN.getLayoutParams();
                int iG = r11.g();
                f = f3;
                if (iG == 0 || iG == 1) {
                    f4 = f4;
                    boolean z3 = z2;
                    int measuredWidth = viewN.getMeasuredWidth();
                    Object obj = this.d;
                    if (obj != null) {
                        measuredWidth = (int) ((long[]) obj)[i8];
                    }
                    int measuredHeight = viewN.getMeasuredHeight();
                    Object obj2 = this.d;
                    if (obj2 != null) {
                        measuredHeight = o(((long[]) obj2)[i8]);
                    }
                    if (((boolean[]) this.a)[i8] || jvkVar.b() <= f) {
                        z2 = z3;
                    } else {
                        float fB = measuredWidth + (jvkVar.b() * f4);
                        if (i6 == jvlVar.h - 1) {
                            fB += f5;
                            f5 = f;
                        }
                        int iRound = Math.round(fB);
                        if (iRound > jvkVar.k()) {
                            iRound = jvkVar.k();
                            ((boolean[]) this.a)[i8] = true;
                            jvlVar.j -= jvkVar.b();
                            z2 = true;
                        } else {
                            f5 += fB - iRound;
                            double d3 = f5;
                            if (d3 > 1.0d) {
                                iRound++;
                                d = d3 - 1.0d;
                            } else {
                                if (d3 < -1.0d) {
                                    iRound--;
                                    d = d3 + 1.0d;
                                }
                                z2 = z3;
                            }
                            f5 = (float) d;
                            z2 = z3;
                        }
                        int iR = r(i2, jvkVar, jvlVar.m);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewN.measure(iMakeMeasureSpec, iR);
                        int measuredWidth2 = viewN.getMeasuredWidth();
                        int measuredHeight2 = viewN.getMeasuredHeight();
                        z(i8, iMakeMeasureSpec, iR, viewN);
                        r11.s(i8, viewN);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i7, measuredHeight + jvkVar.i() + jvkVar.f() + r11.e(viewN));
                    jvlVar.e += measuredWidth + jvkVar.g() + jvkVar.h();
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewN.getMeasuredHeight();
                    Object obj3 = this.d;
                    if (obj3 != null) {
                        measuredHeight3 = o(((long[]) obj3)[i8]);
                    }
                    int measuredWidth3 = viewN.getMeasuredWidth();
                    Object obj4 = this.d;
                    if (obj4 != null) {
                        measuredWidth3 = (int) ((long[]) obj4)[i8];
                    }
                    if (((boolean[]) this.a)[i8] || jvkVar.b() <= f) {
                        z2 = z2;
                    } else {
                        float fB2 = measuredHeight3 + (jvkVar.b() * f4);
                        if (i6 == jvlVar.h - 1) {
                            fB2 += f5;
                            f5 = f;
                        }
                        int iRound2 = Math.round(fB2);
                        if (iRound2 > jvkVar.j()) {
                            iRound2 = jvkVar.j();
                            ((boolean[]) this.a)[i8] = true;
                            jvlVar.j -= jvkVar.b();
                            z2 = true;
                        } else {
                            f5 += fB2 - iRound2;
                            double d4 = f5;
                            if (d4 > 1.0d) {
                                iRound2++;
                                d2 = d4 - 1.0d;
                            } else {
                                if (d4 < -1.0d) {
                                    iRound2--;
                                    d2 = d4 + 1.0d;
                                }
                                z2 = z2;
                            }
                            f5 = (float) d2;
                            z2 = z2;
                        }
                        int iS = s(i, jvkVar, jvlVar.m);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewN.measure(iS, iMakeMeasureSpec2);
                        int measuredWidth4 = viewN.getMeasuredWidth();
                        int measuredHeight4 = viewN.getMeasuredHeight();
                        z(i8, iS, iMakeMeasureSpec2, viewN);
                        r11.s(i8, viewN);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i7, measuredWidth3 + jvkVar.g() + jvkVar.h() + r11.e(viewN));
                    jvlVar.e += measuredHeight3 + jvkVar.i() + jvkVar.f();
                }
                jvlVar.g = Math.max(jvlVar.g, iMax);
                i7 = iMax;
            }
            i6++;
            f3 = f;
            f4 = f4;
        }
        if (!z2 || i5 == jvlVar.e) {
            return;
        }
        v(i, i2, jvlVar, i3, i4, true);
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, jvj] */
    private final void w(int i, int i2, jvl jvlVar, int i3, int i4, boolean z) {
        float f;
        int iMax;
        int i5 = jvlVar.e;
        float f2 = jvlVar.k;
        float f3 = 0.0f;
        if (f2 <= 0.0f || i3 > i5) {
            return;
        }
        float f4 = (i5 - i3) / f2;
        jvlVar.e = i4 + jvlVar.f;
        int i6 = 0;
        if (!z) {
            jvlVar.g = Integer.MIN_VALUE;
        }
        boolean z2 = false;
        int i7 = 0;
        float f5 = 0.0f;
        while (i6 < jvlVar.h) {
            int i8 = jvlVar.o + i6;
            ?? r11 = this.b;
            View viewN = r11.n(i8);
            if (viewN == null || viewN.getVisibility() == 8) {
                f = f3;
            } else {
                jvk jvkVar = (jvk) viewN.getLayoutParams();
                int iG = r11.g();
                f = f3;
                if (iG == 0 || iG == 1) {
                    int measuredWidth = viewN.getMeasuredWidth();
                    Object obj = this.d;
                    if (obj != null) {
                        measuredWidth = (int) ((long[]) obj)[i8];
                    }
                    int measuredHeight = viewN.getMeasuredHeight();
                    Object obj2 = this.d;
                    if (obj2 != null) {
                        measuredHeight = o(((long[]) obj2)[i8]);
                    }
                    if (!((boolean[]) this.a)[i8] && jvkVar.c() > f) {
                        float fC = measuredWidth - (jvkVar.c() * f4);
                        if (i6 == jvlVar.h - 1) {
                            fC += f5;
                            f5 = f;
                        }
                        int iRound = Math.round(fC);
                        if (iRound < jvkVar.m()) {
                            iRound = jvkVar.m();
                            ((boolean[]) this.a)[i8] = true;
                            jvlVar.k -= jvkVar.c();
                            z2 = true;
                        } else {
                            f5 += fC - iRound;
                            double d = f5;
                            if (d > 1.0d) {
                                iRound++;
                                f5 -= 1.0f;
                            } else if (d < -1.0d) {
                                iRound--;
                                f5 += 1.0f;
                            }
                        }
                        int iR = r(i2, jvkVar, jvlVar.m);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewN.measure(iMakeMeasureSpec, iR);
                        int measuredWidth2 = viewN.getMeasuredWidth();
                        int measuredHeight2 = viewN.getMeasuredHeight();
                        z(i8, iMakeMeasureSpec, iR, viewN);
                        r11.s(i8, viewN);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i7, measuredHeight + jvkVar.i() + jvkVar.f() + r11.e(viewN));
                    jvlVar.e += measuredWidth + jvkVar.g() + jvkVar.h();
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewN.getMeasuredHeight();
                    Object obj3 = this.d;
                    if (obj3 != null) {
                        measuredHeight3 = o(((long[]) obj3)[i8]);
                    }
                    int measuredWidth3 = viewN.getMeasuredWidth();
                    Object obj4 = this.d;
                    if (obj4 != null) {
                        measuredWidth3 = (int) ((long[]) obj4)[i8];
                    }
                    if (!((boolean[]) this.a)[i8] && jvkVar.c() > f) {
                        float fC2 = measuredHeight3 - (jvkVar.c() * f4);
                        if (i6 == jvlVar.h - 1) {
                            fC2 += f5;
                            f5 = f;
                        }
                        int iRound2 = Math.round(fC2);
                        if (iRound2 < jvkVar.l()) {
                            iRound2 = jvkVar.l();
                            ((boolean[]) this.a)[i8] = true;
                            jvlVar.k -= jvkVar.c();
                            z2 = true;
                        } else {
                            f5 += fC2 - iRound2;
                            double d2 = f5;
                            if (d2 > 1.0d) {
                                iRound2++;
                                f5 -= 1.0f;
                            } else if (d2 < -1.0d) {
                                iRound2--;
                                f5 += 1.0f;
                            }
                        }
                        int iS = s(i, jvkVar, jvlVar.m);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewN.measure(iS, iMakeMeasureSpec2);
                        measuredWidth3 = viewN.getMeasuredWidth();
                        int measuredHeight4 = viewN.getMeasuredHeight();
                        z(i8, iS, iMakeMeasureSpec2, viewN);
                        r11.s(i8, viewN);
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i7, measuredWidth3 + jvkVar.g() + jvkVar.h() + r11.e(viewN));
                    jvlVar.e += measuredHeight3 + jvkVar.i() + jvkVar.f();
                }
                jvlVar.g = Math.max(jvlVar.g, iMax);
                i7 = iMax;
            }
            i6++;
            f3 = f;
        }
        if (!z2 || i5 == jvlVar.e) {
            return;
        }
        w(i, i2, jvlVar, i3, i4, true);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, jvj] */
    private final void x(View view, int i, int i2) {
        jvk jvkVar = (jvk) view.getLayoutParams();
        int iG = (i - jvkVar.g()) - jvkVar.h();
        ?? r1 = this.b;
        int iMin = Math.min(Math.max(iG - r1.e(view), jvkVar.m()), jvkVar.k());
        Object obj = this.d;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(obj != null ? o(((long[]) obj)[i2]) : view.getMeasuredHeight(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        z(i2, iMakeMeasureSpec2, iMakeMeasureSpec, view);
        r1.s(i2, view);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, jvj] */
    private final void y(View view, int i, int i2) {
        jvk jvkVar = (jvk) view.getLayoutParams();
        int i3 = (i - jvkVar.i()) - jvkVar.f();
        ?? r1 = this.b;
        int iMin = Math.min(Math.max(i3 - r1.e(view), jvkVar.l()), jvkVar.j());
        Object obj = this.d;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(obj != null ? (int) ((long[]) obj)[i2] : view.getMeasuredWidth(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        z(i2, iMakeMeasureSpec, iMakeMeasureSpec2, view);
        r1.s(i2, view);
    }

    private final void z(int i, int i2, int i3, View view) {
        Object obj = this.c;
        if (obj != null) {
            ((long[]) obj)[i] = n(i2, i3);
        }
        Object obj2 = this.d;
        if (obj2 != null) {
            ((long[]) obj2)[i] = n(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, zza] */
    public final void a() {
        this.d = null;
        this.e = null;
        this.c = null;
        ?? r1 = this.a;
        if (r1 != 0) {
            r1.jj(new toe(new CancellationException()));
        }
        this.a = null;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00be  */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, zza] */
    public final void b(Uri uri, String str, String str2, zza zzaVar) {
        alsv alsvVarA;
        uri.getClass();
        Object obj = this.d;
        if (obj == null || !uri.equals(obj)) {
            if (this.d != null) {
                a();
            }
            this.d = uri;
            wtj wtjVar = (wtj) this.b;
            wtf wtfVar = new wtf(wtjVar.b, wtjVar.d.e(), uri, str, str2);
            gml gmlVar = new gml((Object) this, uri, 4);
            int i = 0;
            if (wtjVar.i.l(115, 45817044L, false)) {
                Uri uri2 = wtfVar.a;
                wte wteVar = (wte) wtjVar.g.io();
                try {
                    String host = uri2.getHost();
                    if (host != null) {
                        Locale locale = Locale.US;
                        locale.getClass();
                        String lowerCase = host.toLowerCase(locale);
                        lowerCase.getClass();
                        if (!wte.a.contains(lowerCase)) {
                            alsvVarA = null;
                        } else if (awrc.c(lowerCase, "youtu.be")) {
                            String path = uri2.getPath();
                            if (path == null || path.length() < 2 || awrc.u(path, "/addme", false)) {
                                alsvVarA = null;
                            } else {
                                String queryParameter = uri2.getQueryParameter("v");
                                if (queryParameter == null || queryParameter.length() == 0) {
                                    queryParameter = path.substring(1);
                                    queryParameter.getClass();
                                }
                                alsvVarA = wteVar.a(uri2, queryParameter);
                            }
                        } else if (awrc.c(uri2.getPath(), "/watch")) {
                            alsvVarA = wteVar.a(uri2, uri2.getQueryParameter("v"));
                        } else {
                            alsvVarA = null;
                        }
                    } else {
                        alsvVarA = null;
                    }
                } catch (Exception unused) {
                }
                if (alsvVarA != null) {
                    wtjVar.h.execute(new wtg(gmlVar, alsvVarA, i));
                } else {
                    wtjVar.e.i(wtfVar, gmlVar);
                    wtfVar.x = new wth(wtjVar);
                }
            } else {
                wtjVar.e.i(wtfVar, gmlVar);
                wtfVar.x = new wth(wtjVar);
            }
        }
        ?? r9 = this.a;
        if (r9 != 0) {
            r9.jj(new toe(new CancellationException()));
            this.a = null;
        }
        Object obj2 = this.e;
        if (obj2 != null) {
            zzaVar.a(obj2);
            a();
            return;
        }
        Object obj3 = this.c;
        if (obj3 == null) {
            this.a = zzaVar;
        } else {
            zzaVar.jj((toe) obj3);
            a();
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, jvj] */
    public final List d(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            jvk jvkVar = (jvk) this.b.m(i2).getLayoutParams();
            jvm jvmVar = new jvm();
            jvmVar.b = jvkVar.n();
            jvmVar.a = i2;
            arrayList.add(jvmVar);
        }
        return arrayList;
    }

    public final void e(List list, int i) {
        int i2 = ((int[]) this.e)[i];
        if (i2 == -1) {
            i2 = 0;
        }
        if (list.size() > i2) {
            list.subList(i2, list.size()).clear();
        }
        int[] iArr = (int[]) this.e;
        int length = iArr.length - 1;
        if (i > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i, length, -1);
        }
        long[] jArr = (long[]) this.c;
        int length2 = jArr.length - 1;
        if (i > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i, length2, 0L);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, jvj] */
    public final void f(int i, int i2, int i3) {
        int mode;
        int size;
        int iRound;
        ?? r0 = this.b;
        int iG = r0.g();
        if (iG == 0 || iG == 1) {
            mode = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
        } else {
            if (iG != 2 && iG != 3) {
                throw new IllegalArgumentException(a.bR(iG, "Invalid flex direction: "));
            }
            mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
        }
        List<jvl> listO = r0.o();
        if (mode == 1073741824) {
            int iL = r0.l() + i3;
            int i4 = 0;
            if (listO.size() == 1) {
                ((jvl) listO.get(0)).g = size - i3;
                return;
            }
            if (listO.size() >= 2) {
                int iA = r0.a();
                if (iA == 1) {
                    jvl jvlVar = new jvl();
                    jvlVar.g = size - iL;
                    listO.add(0, jvlVar);
                    return;
                }
                if (iA == 2) {
                    r0.r(A(listO, size, iL));
                    return;
                }
                if (iA == 3) {
                    if (iL < size) {
                        int size2 = listO.size() - 1;
                        ArrayList arrayList = new ArrayList();
                        int size3 = listO.size();
                        float f = 0.0f;
                        while (i4 < size3) {
                            arrayList.add((jvl) listO.get(i4));
                            if (i4 != listO.size() - 1) {
                                jvl jvlVar2 = new jvl();
                                float f2 = (size - iL) / size2;
                                if (i4 == listO.size() - 2) {
                                    int iRound2 = Math.round(f + f2);
                                    jvlVar2.g = iRound2;
                                    iRound = iRound2;
                                    f = 0.0f;
                                } else {
                                    iRound = Math.round(f2);
                                    jvlVar2.g = iRound;
                                }
                                f += f2 - iRound;
                                if (f > 1.0f) {
                                    jvlVar2.g = iRound + 1;
                                    f -= 1.0f;
                                } else if (f < -1.0f) {
                                    jvlVar2.g = iRound - 1;
                                    f += 1.0f;
                                }
                                arrayList.add(jvlVar2);
                            }
                            i4++;
                        }
                        r0.r(arrayList);
                        return;
                    }
                    return;
                }
                if (iA == 4) {
                    if (iL >= size) {
                        r0.r(A(listO, size, iL));
                        return;
                    }
                    int size4 = (size - iL) / (listO.size() << 1);
                    ArrayList arrayList2 = new ArrayList();
                    jvl jvlVar3 = new jvl();
                    jvlVar3.g = size4;
                    for (jvl jvlVar4 : listO) {
                        arrayList2.add(jvlVar3);
                        arrayList2.add(jvlVar4);
                        arrayList2.add(jvlVar3);
                    }
                    r0.r(arrayList2);
                    return;
                }
                if (iA != 5 || iL >= size) {
                    return;
                }
                float size5 = listO.size();
                int size6 = listO.size();
                float f3 = 0.0f;
                while (i4 < size6) {
                    jvl jvlVar5 = (jvl) listO.get(i4);
                    float f4 = jvlVar5.g + ((size - iL) / size5);
                    if (i4 == listO.size() - 1) {
                        f4 += f3;
                        f3 = 0.0f;
                    }
                    int iRound3 = Math.round(f4);
                    f3 += f4 - iRound3;
                    if (f3 > 1.0f) {
                        iRound3++;
                        f3 -= 1.0f;
                    } else if (f3 < -1.0f) {
                        iRound3--;
                        f3 += 1.0f;
                    }
                    jvlVar5.g = iRound3;
                    i4++;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, jvj] */
    public final void g(int i, int i2, int i3) {
        int size;
        int paddingLeft;
        int paddingRight;
        abi abiVar;
        int i4;
        int i5;
        ?? r0 = this.b;
        int iH = r0.h();
        Object obj = this.a;
        if (obj == null) {
            this.a = new boolean[Math.max(iH, 10)];
        } else {
            boolean[] zArr = (boolean[]) obj;
            int length = zArr.length;
            if (length < iH) {
                this.a = new boolean[Math.max(length << 1, iH)];
            } else {
                Arrays.fill(zArr, false);
            }
        }
        if (i3 < r0.h()) {
            int iG = r0.g();
            int iG2 = r0.g();
            if (iG2 == 0 || iG2 == 1) {
                int mode = View.MeasureSpec.getMode(i);
                size = View.MeasureSpec.getSize(i);
                int iJ = r0.j();
                if (mode != 1073741824) {
                    size = Math.min(iJ, size);
                }
                paddingLeft = r0.getPaddingLeft();
                paddingRight = r0.getPaddingRight();
            } else {
                if (iG2 != 2 && iG2 != 3) {
                    throw new IllegalArgumentException(a.bR(iG, "Invalid flex direction: "));
                }
                int mode2 = View.MeasureSpec.getMode(i2);
                size = View.MeasureSpec.getSize(i2);
                if (mode2 != 1073741824) {
                    size = r0.j();
                }
                paddingLeft = r0.getPaddingTop();
                paddingRight = r0.getPaddingBottom();
            }
            int i6 = paddingLeft + paddingRight;
            int i7 = size;
            Object obj2 = this.e;
            int i8 = obj2 != null ? ((int[]) obj2)[i3] : 0;
            List listO = r0.o();
            int size2 = listO.size();
            while (i8 < size2) {
                jvl jvlVar = (jvl) listO.get(i8);
                if (jvlVar.e < i7) {
                    abiVar = this;
                    i4 = i;
                    i5 = i2;
                    abiVar.v(i4, i5, jvlVar, i7, i6, false);
                } else {
                    abiVar = this;
                    i4 = i;
                    i5 = i2;
                    abiVar.w(i4, i5, jvlVar, i7, i6, false);
                }
                i8++;
                this = abiVar;
                i = i4;
                i2 = i5;
            }
        }
    }

    public final void h(int i) {
        Object obj = this.e;
        if (obj == null) {
            this.e = new int[Math.max(i, 10)];
            return;
        }
        int length = ((int[]) obj).length;
        if (length < i) {
            this.e = Arrays.copyOf((int[]) this.e, Math.max(length << 1, i));
        }
    }

    public final void i(int i) {
        Object obj = this.c;
        if (obj == null) {
            this.c = new long[Math.max(i, 10)];
            return;
        }
        int length = ((long[]) obj).length;
        if (length < i) {
            this.c = Arrays.copyOf((long[]) this.c, Math.max(length << 1, i));
        }
    }

    public final void j(int i) {
        Object obj = this.d;
        if (obj == null) {
            this.d = new long[Math.max(i, 10)];
            return;
        }
        int length = ((long[]) obj).length;
        if (length < i) {
            this.d = Arrays.copyOf((long[]) this.d, Math.max(length << 1, i));
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, jvj] */
    public final void k(View view, jvl jvlVar, int i, int i2, int i3, int i4) {
        jvk jvkVar = (jvk) view.getLayoutParams();
        ?? r5 = this.b;
        int iB = r5.b();
        if (jvkVar.d() != -1) {
            iB = jvkVar.d();
        }
        int i5 = jvlVar.g;
        if (iB == 0 || iB == 4) {
            if (r5.i() != 2) {
                view.layout(i, i2 + jvkVar.i(), i3, i4 + jvkVar.i());
                return;
            } else {
                view.layout(i, i2 - jvkVar.f(), i3, i4 - jvkVar.f());
                return;
            }
        }
        if (iB == 3) {
            if (r5.i() != 2) {
                int iMax = Math.max(jvlVar.l - view.getBaseline(), jvkVar.i());
                view.layout(i, i2 + iMax, i3, i4 + iMax);
                return;
            } else {
                int iMax2 = Math.max((jvlVar.l - view.getMeasuredHeight()) + view.getBaseline(), jvkVar.f());
                view.layout(i, i2 - iMax2, i3, i4 - iMax2);
                return;
            }
        }
        if (iB == 1) {
            if (r5.i() == 2) {
                view.layout(i, (i2 - i5) + view.getMeasuredHeight() + jvkVar.i(), i3, (i4 - i5) + view.getMeasuredHeight() + jvkVar.i());
                return;
            } else {
                int i6 = i2 + i5;
                view.layout(i, (i6 - view.getMeasuredHeight()) - jvkVar.f(), i3, i6 - jvkVar.f());
                return;
            }
        }
        if (iB == 2) {
            int measuredHeight = (((i5 - view.getMeasuredHeight()) + jvkVar.i()) - jvkVar.f()) / 2;
            if (r5.i() != 2) {
                int i7 = i2 + measuredHeight;
                view.layout(i, i7, i3, view.getMeasuredHeight() + i7);
            } else {
                int i8 = i2 - measuredHeight;
                view.layout(i, i8, i3, view.getMeasuredHeight() + i8);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, jvj] */
    public final void l(View view, jvl jvlVar, boolean z, int i, int i2, int i3, int i4) {
        jvk jvkVar = (jvk) view.getLayoutParams();
        int iB = this.b.b();
        if (jvkVar.d() != -1) {
            iB = jvkVar.d();
        }
        int i5 = jvlVar.g;
        if (iB == 0 || iB == 4 || iB == 3) {
            if (z) {
                view.layout(i - jvkVar.h(), i2, i3 - jvkVar.h(), i4);
                return;
            } else {
                view.layout(i + jvkVar.g(), i2, i3 + jvkVar.g(), i4);
                return;
            }
        }
        if (iB == 1) {
            if (z) {
                view.layout((i - i5) + view.getMeasuredWidth() + jvkVar.g(), i2, (i3 - i5) + view.getMeasuredWidth() + jvkVar.g(), i4);
                return;
            } else {
                view.layout(((i + i5) - view.getMeasuredWidth()) - jvkVar.h(), i2, ((i3 + i5) - view.getMeasuredWidth()) - jvkVar.h(), i4);
                return;
            }
        }
        if (iB == 2) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            int measuredWidth = (((i5 - view.getMeasuredWidth()) + marginLayoutParams.getMarginStart()) - marginLayoutParams.getMarginEnd()) / 2;
            if (z) {
                view.layout(i - measuredWidth, i2, i3 - measuredWidth, i4);
            } else {
                view.layout(i + measuredWidth, i2, i3 + measuredWidth, i4);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, jvj] */
    public final void m(int i) {
        View viewN;
        ?? r2 = this.b;
        if (i < r2.h()) {
            int iG = r2.g();
            if (r2.b() != 4) {
                for (jvl jvlVar : r2.o()) {
                    for (Integer num : jvlVar.n) {
                        View viewN2 = r2.n(num.intValue());
                        if (iG == 0 || iG == 1) {
                            y(viewN2, jvlVar.g, num.intValue());
                        } else {
                            if (iG != 2 && iG != 3) {
                                throw new IllegalArgumentException(a.bR(iG, "Invalid flex direction: "));
                            }
                            x(viewN2, jvlVar.g, num.intValue());
                        }
                    }
                }
                return;
            }
            Object obj = this.e;
            List listO = r2.o();
            int size = listO.size();
            for (int i2 = obj != null ? ((int[]) obj)[i] : 0; i2 < size; i2++) {
                jvl jvlVar2 = (jvl) listO.get(i2);
                int i3 = jvlVar2.h;
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = jvlVar2.o + i4;
                    if (i4 < r2.h() && (viewN = r2.n(i5)) != null && viewN.getVisibility() != 8) {
                        jvk jvkVar = (jvk) viewN.getLayoutParams();
                        if (jvkVar.d() == -1 || jvkVar.d() == 4) {
                            if (iG == 0 || iG == 1) {
                                y(viewN, jvlVar2.g, i5);
                            } else {
                                if (iG != 2 && iG != 3) {
                                    throw new IllegalArgumentException(a.bR(iG, "Invalid flex direction: "));
                                }
                                x(viewN, jvlVar2.g, i5);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x012b  */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, jvj] */
    public final void q(zh zhVar, int i, int i2, int i3, int i4, int i5, List list) {
        int paddingTop;
        int paddingBottom;
        int paddingStart;
        int paddingEnd;
        int i6;
        int i7;
        int iD;
        boolean z;
        int i8;
        List list2;
        int i9;
        int i10;
        boolean z2;
        int iK;
        int minimumWidth;
        int minimumHeight;
        int i11 = i;
        ?? r5 = this.b;
        boolean zT = r5.t();
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        List arrayList = list == null ? new ArrayList() : list;
        zhVar.b = arrayList;
        boolean z3 = i5 == -1;
        if (zT) {
            paddingTop = r5.getPaddingStart();
            paddingBottom = r5.getPaddingEnd();
            paddingStart = r5.getPaddingTop();
            paddingEnd = r5.getPaddingBottom();
        } else {
            paddingTop = r5.getPaddingTop();
            paddingBottom = r5.getPaddingBottom();
            paddingStart = r5.getPaddingStart();
            paddingEnd = r5.getPaddingEnd();
        }
        jvl jvlVar = new jvl();
        int i12 = i4;
        boolean z4 = true;
        jvlVar.o = i12;
        int i13 = paddingTop + paddingBottom;
        jvlVar.e = i13;
        int iH = r5.h();
        boolean z5 = z3;
        int i14 = Integer.MIN_VALUE;
        int iCombineMeasuredStates = 0;
        int i15 = 0;
        int i16 = 0;
        while (i12 < iH) {
            View viewN = r5.n(i12);
            if (viewN == null) {
                if (H(i12, iH, jvlVar)) {
                    t(arrayList, jvlVar, i12, i15);
                }
                i6 = i13;
            } else {
                i6 = i13;
                if (viewN.getVisibility() != 8) {
                    int i17 = paddingStart + paddingEnd;
                    if (viewN instanceof CompoundButton) {
                        CompoundButton compoundButton = (CompoundButton) viewN;
                        jvk jvkVar = (jvk) compoundButton.getLayoutParams();
                        int iM = jvkVar.m();
                        int iL = jvkVar.l();
                        Drawable buttonDrawable = compoundButton.getButtonDrawable();
                        if (buttonDrawable == null) {
                            minimumHeight = 0;
                            minimumWidth = 0;
                        } else {
                            minimumWidth = buttonDrawable.getMinimumWidth();
                            minimumHeight = buttonDrawable.getMinimumHeight();
                        }
                        if (iM == -1) {
                            iM = minimumWidth;
                        }
                        jvkVar.q(iM);
                        if (iL == -1) {
                            iL = minimumHeight;
                        }
                        jvkVar.p(iL);
                    }
                    jvk jvkVar2 = (jvk) viewN.getLayoutParams();
                    if (jvkVar2.d() == 4) {
                        jvlVar.n.add(Integer.valueOf(i12));
                    }
                    int iO = zT ? jvkVar2.o() : jvkVar2.e();
                    if (jvkVar2.a() != -1.0f) {
                        i7 = 1073741824;
                        if (mode == 1073741824) {
                            iO = Math.round(size * jvkVar2.a());
                        } else {
                            i7 = mode;
                        }
                    } else {
                        i7 = mode;
                    }
                    if (zT) {
                        boolean z6 = z4;
                        iD = r5.d(i11, i6 + E(jvkVar2, z6) + C(jvkVar2, z6), iO);
                        int iC = r5.c(i2, i17 + D(jvkVar2, z6) + B(jvkVar2, z6) + i15, F(jvkVar2, z6));
                        viewN.measure(iD, iC);
                        z(i12, iD, iC, viewN);
                        z = true;
                    } else {
                        int iD2 = r5.d(i2, i17 + D(jvkVar2, false) + B(jvkVar2, false) + i15, F(jvkVar2, false));
                        int iC2 = r5.c(i11, i6 + E(jvkVar2, false) + C(jvkVar2, false), iO);
                        viewN.measure(iD2, iC2);
                        z(i12, iD2, iC2, viewN);
                        iD = iC2;
                        z = false;
                    }
                    r5.s(i12, viewN);
                    u(viewN, i12);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewN.getMeasuredState());
                    int i18 = jvlVar.e;
                    int iG = G(viewN, z) + E(jvkVar2, z) + C(jvkVar2, z);
                    int size2 = arrayList.size();
                    if (r5.i() == 0) {
                        i8 = i6;
                        list2 = arrayList;
                        jvlVar.h++;
                        i16++;
                        i9 = i14;
                    } else {
                        if (!jvkVar2.r()) {
                            if (i7 != 0 && ((iK = r5.k()) == -1 || iK > size2 + 1)) {
                                int iF = r5.f(viewN, i12, i16);
                                if (iF > 0) {
                                    iG += iF;
                                }
                                if (size < i18 + iG) {
                                }
                            }
                            i8 = i6;
                            list2 = arrayList;
                            jvlVar.h++;
                            i16++;
                            i9 = i14;
                        }
                        if (jvlVar.a() > 0) {
                            list2 = arrayList;
                            t(list2, jvlVar, i12 > 0 ? i12 - 1 : 0, i15);
                            i15 += jvlVar.g;
                        } else {
                            list2 = arrayList;
                        }
                        if (z) {
                            if (jvkVar2.e() == -1) {
                                viewN.measure(iD, r5.c(i2, r5.getPaddingTop() + r5.getPaddingBottom() + jvkVar2.i() + jvkVar2.f() + i15, jvkVar2.e()));
                                u(viewN, i12);
                            }
                        } else if (jvkVar2.o() == -1) {
                            viewN.measure(r5.d(i2, r5.getPaddingLeft() + r5.getPaddingRight() + jvkVar2.g() + jvkVar2.h() + i15, jvkVar2.o()), iD);
                            u(viewN, i12);
                        }
                        jvlVar = new jvl();
                        jvlVar.h = 1;
                        i8 = i6;
                        jvlVar.e = i8;
                        jvlVar.o = i12;
                        i9 = Integer.MIN_VALUE;
                        i16 = 0;
                    }
                    jvlVar.q |= jvkVar2.b() != 0.0f;
                    jvlVar.r |= jvkVar2.c() != 0.0f;
                    Object obj = this.e;
                    if (obj != null) {
                        ((int[]) obj)[i12] = list2.size();
                    }
                    jvlVar.e += G(viewN, z) + E(jvkVar2, z) + C(jvkVar2, z);
                    jvlVar.j += jvkVar2.b();
                    jvlVar.k += jvkVar2.c();
                    r5.p(viewN, i12, i16, jvlVar);
                    int iMax = Math.max(i9, (z ? viewN.getMeasuredHeight() : viewN.getMeasuredWidth()) + D(jvkVar2, z) + B(jvkVar2, z) + r5.e(viewN));
                    jvlVar.g = Math.max(jvlVar.g, iMax);
                    if (z) {
                        if (r5.i() != 2) {
                            jvlVar.l = Math.max(jvlVar.l, viewN.getBaseline() + jvkVar2.i());
                        } else {
                            jvlVar.l = Math.max(jvlVar.l, (viewN.getMeasuredHeight() - viewN.getBaseline()) + jvkVar2.f());
                        }
                    }
                    i10 = iH;
                    if (H(i12, i10, jvlVar)) {
                        t(list2, jvlVar, i12, i15);
                        i15 += jvlVar.g;
                    }
                    if (i5 == -1 || list2.size() <= 0 || ((jvl) list2.get(list2.size() - 1)).p < i5 || i12 < i5) {
                        z2 = z5;
                    } else {
                        if (!z5) {
                            i15 = -jvlVar.g;
                        }
                        z2 = true;
                    }
                    if (i15 > i3 && z2) {
                        break;
                    } else {
                        i14 = iMax;
                    }
                } else {
                    jvlVar.i++;
                    jvlVar.h++;
                    if (H(i12, iH, jvlVar)) {
                        t(arrayList, jvlVar, i12, i15);
                    }
                }
                i12++;
                arrayList = list2;
                z5 = z2;
                mode = mode;
                z4 = true;
                iH = i10;
                i13 = i8;
                i11 = i;
            }
            mode = mode;
            list2 = arrayList;
            i10 = iH;
            i8 = i6;
            z2 = z5;
            i12++;
            arrayList = list2;
            z5 = z2;
            mode = mode;
            z4 = true;
            iH = i10;
            i13 = i8;
            i11 = i;
        }
        zhVar.a = iCombineMeasuredStates;
    }

    public abi(jvj jvjVar) {
        this.b = jvjVar;
    }
}
