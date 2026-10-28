package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.media.interfaces.AutocropCalculator;
import com.google.android.libraries.youtube.media.interfaces.AutocropFormat;
import com.google.android.libraries.youtube.media.interfaces.Time;
import j$.time.Duration;
import j$.util.Objects;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zkt extends zln implements zlm, ctm {
    public static final zlo a = zlo.SURFACE;
    public final zjr b;
    public final List c;
    public zlm d;
    public final Executor e;
    public aazu f;
    private final boolean g;
    private boolean h;
    private boolean i;
    private zll j;
    private zlo k;
    private boolean l;
    private yib m;
    private boolean n;
    private float o;
    private boolean p;
    private final ci q;

    public zkt(Context context, ci ciVar, zjr zjrVar, Executor executor) {
        super(context);
        this.c = new ArrayList();
        this.m = yib.c;
        this.f = null;
        zkf.d(ciVar);
        this.q = ciVar;
        this.b = zjrVar;
        this.e = executor;
        this.k = zjrVar.bf() ? zlo.DUAL_SURFACE : a;
        this.g = zjrVar.ak();
    }

    @Override // defpackage.zlm
    public final boolean A(int i) {
        zlm zlmVar = this.d;
        return zlmVar != null && zlmVar.A(i);
    }

    @Override // defpackage.zlm
    public final zlo B() {
        zlm zlmVar = this.d;
        return zlmVar != null ? zlmVar.B() : zlo.UNKNOWN;
    }

    @Override // defpackage.zlm
    public final void H() {
        zlm zlmVar = this.d;
        if (zlmVar != null) {
            zlmVar.H();
        }
    }

    @Override // defpackage.zki
    public final int a() {
        zlm zlmVar = this.d;
        zkf.d(zlmVar);
        int iA = zlmVar.a();
        return iA == 0 ? getMeasuredHeight() : iA;
    }

    @Override // defpackage.zki
    public final int b() {
        zlm zlmVar = this.d;
        zkf.d(zlmVar);
        int iB = zlmVar.b();
        return iB == 0 ? getMeasuredWidth() : iB;
    }

    @Override // defpackage.ctm
    public final void c(long j, long j2, bse bseVar, MediaFormat mediaFormat) {
        aazu aazuVar = this.f;
        if (aazuVar != null) {
            zdj zdjVar = aazuVar.c;
            Duration durationOfNanos = Duration.ofNanos(j * 1000);
            Optional optionalOf = Optional.of(zdjVar.b);
            optionalOf.isPresent();
            AutocropFormat autocropFormat = (AutocropFormat) optionalOf.get();
            if (autocropFormat.getWidth() <= 0 || autocropFormat.getHeight() <= 0) {
                optionalOf = Optional.empty();
            }
            wap wapVar = new wap(zdjVar, durationOfNanos, 2);
            if (true == optionalOf.isPresent()) {
                Object obj = optionalOf.get();
                Object obj2 = wapVar.a;
                AutocropFormat autocropFormat2 = (AutocropFormat) obj;
                optionalOf = Optional.ofNullable(new zdk(((AutocropCalculator) ((zdj) obj2).a).calculateFrame(new Time(((Duration) wapVar.b).toNanos(), 1000000000L), autocropFormat2), autocropFormat2));
            }
            zdk zdkVar = (zdk) optionalOf.orElse(null);
            if (Objects.equals(aazuVar.f, zdkVar)) {
                return;
            }
            aazuVar.f = zdkVar;
            aazuVar.d.execute(afwl.i(new aadm(aazuVar, 18)));
        }
    }

    @Override // defpackage.zki
    public final int d() {
        zlm zlmVar = this.d;
        zkf.d(zlmVar);
        return zlmVar.d();
    }

    @Override // defpackage.zki
    public final int e() {
        zlm zlmVar = this.d;
        zkf.d(zlmVar);
        return zlmVar.e();
    }

    @Override // defpackage.zki
    public final Surface f() {
        zlm zlmVar = this.d;
        if (zlmVar != null) {
            return zlmVar.f();
        }
        return null;
    }

    @Override // defpackage.zki
    public final void h(Bitmap bitmap, sxu sxuVar) {
        zlm zlmVar = this.d;
        if (zlmVar != null) {
            zlmVar.h(bitmap, sxuVar);
        } else {
            sxuVar.iT(bitmap, null);
        }
    }

    @Override // defpackage.zki
    public final void i() {
        zlm zlmVar = this.d;
        this.d = null;
        this.n = false;
        if (zlmVar != null) {
            zlmVar.i();
        }
    }

    @Override // defpackage.zki
    public final void j(float f) {
        this.n = true;
        this.o = f;
        zlm zlmVar = this.d;
        if (zlmVar != null) {
            zlmVar.j(f);
        }
    }

    @Override // defpackage.zki
    public final void k(int i, int i2) {
        zlm zlmVar = this.d;
        if (zlmVar != null) {
            zlmVar.k(i, i2);
        }
    }

    @Override // defpackage.zki
    @Deprecated
    public final boolean l() {
        zlm zlmVar = this.d;
        return zlmVar != null && zlmVar.l();
    }

    @Override // defpackage.zki
    public final boolean m() {
        zlm zlmVar;
        return (!this.g || this.p) && (zlmVar = this.d) != null && zlmVar.m();
    }

    @Override // defpackage.zlm
    public final SurfaceHolder n() {
        zlm zlmVar = this.d;
        if (zlmVar != null) {
            return zlmVar.n();
        }
        return null;
    }

    @Override // defpackage.zlm
    public final ctl o() {
        zlm zlmVar = this.d;
        if (zlmVar != null) {
            return zlmVar.o();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        zll zllVar;
        super.onAttachedToWindow();
        this.p = true;
        zlm zlmVar = this.d;
        if (zlmVar != null) {
            if (this.g) {
                zll zllVar2 = this.j;
                if (zllVar2 != null) {
                    zllVar2.a("rsmv", "a;t.".concat(String.valueOf(String.valueOf(this.k))));
                    return;
                }
                return;
            }
            ViewGroup viewGroupG = zlmVar.g();
            if (Build.VERSION.SDK_INT == 28) {
                viewGroupG.setVisibility(8);
                this.e.execute(new zgc(this, viewGroupG, 4, null));
            } else {
                removeView(viewGroupG);
            }
        }
        zlm zlmVarR = r(this.k);
        this.d = zlmVarR;
        if (this.n) {
            zlmVarR.j(this.o);
        }
        zlo zloVar = this.k;
        zlo zloVar2 = zlo.DUAL_SURFACE;
        if (zloVar == zloVar2 && (zllVar = this.j) != null) {
            zlmVarR.v(zllVar);
        }
        addView((View) zlmVarR);
        if (this.h) {
            this.h = false;
            if (this.k != zloVar2) {
                zlmVarR.v(this.j);
            }
            if (this.i) {
                s(0);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        zll zllVar;
        this.p = false;
        if (this.g && (zllVar = this.j) != null) {
            zllVar.a("rsmv", "d;t.".concat(String.valueOf(String.valueOf(this.k))));
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount() - 1;
        if (childCount >= 0) {
            getChildAt(childCount).layout(0, 0, i3 - i, i4 - i2);
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int childCount = getChildCount() - 1;
        if (childCount < 0) {
            setMeasuredDimension(0, 0);
            return;
        }
        View childAt = getChildAt(childCount);
        childAt.measure(i, i2);
        setMeasuredDimension(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
    }

    public final View p() {
        zlm zlmVar = this.d;
        if (zlmVar != null) {
            return zlmVar.g();
        }
        return null;
    }

    @Override // defpackage.zlm
    public final void q() {
        zlm zlmVar = this.d;
        if (zlmVar != null) {
            zlmVar.q();
        }
        this.i = false;
    }

    final zlm r(zlo zloVar) {
        int iOrdinal = zloVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 3) {
            return new zks(getContext(), this.b, this.e);
        }
        if (iOrdinal == 4) {
            return new zkr(getContext(), this.b, this.e);
        }
        if (iOrdinal == 5) {
            ci ciVar = this.q;
            return new abaj(getContext(), (abbd) ciVar.a, this.l, this.b);
        }
        if (iOrdinal == 7) {
            return new zku(getContext(), this.b);
        }
        if (iOrdinal == 8) {
            return new zkp(getContext(), this.b);
        }
        if (iOrdinal == 9) {
            return new zkn(getContext(), this.b);
        }
        throw new UnsupportedOperationException("Requested view is not supported.");
    }

    @Override // defpackage.zlm
    public final void s(int i) {
        zlm zlmVar = this.d;
        if (zlmVar == null) {
            this.i = true;
        } else {
            this.i = false;
            zlmVar.s(i);
        }
    }

    @Override // android.view.View
    public final String toString() {
        int iHashCode = hashCode();
        int left = getLeft();
        int top = getTop();
        int right = getRight();
        int bottom = getBottom();
        StringBuilder sb = new StringBuilder();
        sb.append(iHashCode);
        sb.append('(');
        sb.append(left);
        sb.append(',');
        sb.append(top);
        sb.append(',');
        sb.append(right);
        sb.append(',');
        sb.append(bottom);
        sb.append(')');
        return sb.toString();
    }

    @Override // defpackage.zlm
    public final void u(boolean z, byte[] bArr, long j, long j2) {
        zlm zlmVar = this.d;
        if (zlmVar != null) {
            zlmVar.u(z, bArr, j, j2);
        }
    }

    @Override // defpackage.zlm
    public final void v(zll zllVar) {
        this.j = zllVar;
        zlm zlmVar = this.d;
        if (zlmVar == null) {
            this.h = true;
        } else {
            this.h = false;
            zlmVar.v(zllVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zlm
    public final void w(zlo zloVar) {
        zlm zlmVar;
        zlm zlmVar2;
        zlm zlmVar3 = this.d;
        if (zloVar == this.k && zlmVar3 != null) {
            zlmVar3.y(this.l, this.m);
            return;
        }
        zkf.d(this.j);
        this.k = zloVar;
        zhq zhqVar = zhq.ABR;
        if (zloVar != zlo.GL_CARDBOARD && (!this.b.ap() || zloVar != zlo.VIDEO_DECODER_GL_SURFACE_VIEW)) {
            zlm zlmVarR = r(zloVar);
            this.d = zlmVarR;
            addView((View) zlmVarR);
            zlmVar2 = zlmVarR;
            break;
        }
        Iterator it = this.c.iterator();
        while (true) {
            if (it.hasNext()) {
                zlmVar = (zlm) it.next();
                if (zlmVar.B() == zloVar) {
                    this.d = zlmVar;
                    if (zlmVar3 != null) {
                        if (zlmVar != null) {
                            bringChildToFront(zlmVar.g());
                            zll zllVar = this.j;
                            if (zllVar == null) {
                                break;
                            }
                            zlmVar2 = zlmVar;
                            zllVar.c();
                            zlmVar2 = zlmVar;
                            break;
                        }
                        return;
                    }
                }
            }
            zlm zlmVarR2 = r(zloVar);
            this.d = zlmVarR2;
            addView((View) zlmVarR2);
            zlmVar2 = zlmVarR2;
            break;
        }
        zlmVar2 = zlmVar;
        zlmVar2.v(this.j);
        zlmVar2.y(this.l, this.m);
        if (this.n) {
            zlmVar2.j(this.o);
        }
        if (zlmVar3 != null) {
            zlmVar3.v(null);
            zjr zjrVar = this.b;
            if (!zjrVar.ap() || (zjrVar.ap() && !this.c.contains(zlmVar3))) {
                this.c.add(zlmVar3);
            }
        }
    }

    @Override // defpackage.zlm
    public final void x(zlp zlpVar) {
        zlm zlmVar = this.d;
        if (zlmVar != null) {
            zlmVar.x(zlpVar);
        }
    }

    @Override // defpackage.zlm
    public final void y(boolean z, yib yibVar) {
        this.l = z;
        this.m = yibVar;
    }

    @Override // defpackage.zki
    public final ViewGroup g() {
        return this;
    }
}
