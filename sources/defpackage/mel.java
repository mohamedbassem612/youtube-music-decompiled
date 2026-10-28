package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.litho.ComponentTree;
import com.google.android.libraries.elements.interfaces.BlockRegistryProvider;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mel extends FrameLayout {
    public final fjw a;
    public nth b;
    public avlr c;
    public nug d;
    private final ntx e;
    private byte[] f;
    private mlf g;
    private avmm h;
    private boolean i;
    private boolean j;
    private final AtomicReference k;
    private final AtomicReference l;

    public mel(Context context, ntx ntxVar) {
        super(context);
        this.k = new AtomicReference();
        this.l = new AtomicReference();
        context.getClass();
        this.e = ntxVar;
        nug nugVar = ntxVar.d;
        this.d = nugVar;
        if (nugVar == null) {
            this.d = nug.a;
        }
        fjw fjwVar = new fjw(context);
        this.a = fjwVar;
        super.addView(fjwVar, new FrameLayout.LayoutParams(-1, -1));
    }

    private final void b() {
        avmm avmmVar = this.h;
        if (avmmVar != null) {
            avmmVar.dispose();
            this.h = null;
        }
        fjw fjwVar = this.a;
        fjwVar.O();
        ComponentTree componentTree = fjwVar.w;
        if (componentTree != null) {
            componentTree.t();
            fjwVar.K(null, true);
        }
        fjwVar.E = null;
        fjwVar.D = null;
    }

    private final void c() {
        mlf mlfVar;
        if (this.j || (mlfVar = this.g) == null) {
            return;
        }
        mlfVar.dispose();
        this.g = null;
    }

    private final void d() {
        byte[] bArr = this.f;
        if (!this.i || bArr == null) {
            return;
        }
        fjw fjwVar = this.a;
        fjwVar.E = null;
        avmm avmmVar = new avmm();
        this.h = avmmVar;
        ntx ntxVar = this.e;
        ntu ntuVar = ntxVar.c;
        nwy nwyVar = nwy.a;
        fly flyVar = new fly();
        flyVar.d(ntt.class, new ntt("0"));
        mlf mlfVar = this.g;
        if (mlfVar != null) {
            flyVar.d(mlf.class, mlfVar);
        }
        fhd fhdVar = new fhd(getContext(), ntxVar.b, new omj(nrg.a), flyVar);
        nsk nskVarB = nsl.b();
        nskVarB.m(ntxVar);
        nskVarB.b(fjwVar);
        nskVarB.c = nwyVar;
        nskVarB.l(this.c);
        nskVarB.r = (String) this.k.get();
        BlockRegistryProvider blockRegistryProvider = (BlockRegistryProvider) this.l.get();
        nskVarB.s = blockRegistryProvider == null ? null : new mmx(blockRegistryProvider);
        nsl nslVarA = nskVarB.a();
        mek mekVar = new mek((ntr) ntxVar.a.io(), bArr, this.b, avmmVar);
        nyf nyfVarAE = nyh.aE(fhdVar);
        nyfVarAE.e(nslVarA);
        nyfVarAE.d(mekVar);
        nyfVarAE.c(Boolean.FALSE);
        fhm fhmVarC = ComponentTree.c(fhdVar, nyfVarAE.a(), null);
        fhmVarC.d = ntxVar.e;
        fhmVarC.k = false;
        fjwVar.K(fhmVarC.a(), true);
    }

    public final void a(byte[] bArr, mlf mlfVar) {
        b();
        c();
        this.f = bArr;
        if (mlfVar == null) {
            this.j = false;
            this.g = null;
        } else {
            this.j = true;
            this.g = mlfVar;
        }
        d();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        throw new UnsupportedOperationException("ElementsView does not support addView");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        b();
        super.onAttachedToWindow();
        this.i = true;
        if (!this.j && this.g == null) {
            this.g = new mlf();
        }
        d();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.i = false;
        b();
        super.onDetachedFromWindow();
        c();
    }

    @Override // android.view.View
    public final void setAccessibilityLiveRegion(int i) {
        this.a.setAccessibilityLiveRegion(i);
    }
}
