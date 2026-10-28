package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.RecyclerView;
import android.util.Size;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import com.google.android.libraries.multiplatform.elements.FlagServices;
import com.google.android.libraries.multiplatform.elements.NodeTreeProcessor;
import com.google.android.libraries.multiplatform.elements.runtime.NodeTreeProcessorImpl;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicBoolean;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oqu extends oyf {
    public static final /* synthetic */ int t = 0;
    private final ViewTreeObserver.OnScrollChangedListener F;
    private final View.OnLayoutChangeListener G;
    private oq H;
    private int I;
    private nue J;
    private int K;
    private atba L;
    private qa M;
    private syn N;
    public final RecyclerView a;
    public final oqv b;
    public final Handler c;
    public final int[] d;
    public final int[] e;
    public final boolean f;
    public oqj g;
    public ovk h;
    public oqz i;
    public Integer j;
    public boolean k;
    public nyv l;
    public mhe m;
    public orf n;
    public SwipeRefreshLayout o;
    public final AtomicBoolean p;
    public atbv q;
    public int r;
    public int s;

    public oqu(final RecyclerView recyclerView, NodeTreeProcessor nodeTreeProcessor, syn synVar) {
        super(nodeTreeProcessor, recyclerView);
        this.c = new Handler(Looper.getMainLooper());
        this.d = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
        int i = 2;
        this.e = new int[2];
        aga agaVar = ElementsServices.a;
        this.f = Memory.peekByte(FlagServices.b().c + 62) != 0;
        this.N = null;
        this.r = 1;
        this.g = null;
        this.h = null;
        this.i = null;
        this.M = null;
        this.H = null;
        this.I = Integer.MIN_VALUE;
        this.s = 0;
        this.j = null;
        this.k = false;
        this.J = null;
        this.n = null;
        this.L = null;
        this.o = null;
        this.p = new AtomicBoolean(false);
        this.q = null;
        this.K = -1;
        this.a = recyclerView;
        this.b = new oqv(recyclerView);
        this.N = synVar;
        this.F = new ViewTreeObserver.OnScrollChangedListener() { // from class: oql
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                oqu oquVar = this.a;
                ovk ovkVar = oquVar.h;
                if (ovkVar != null) {
                    RecyclerView recyclerView2 = recyclerView;
                    if (recyclerView2.q && recyclerView2.isShown()) {
                        int[] iArr = oquVar.e;
                        recyclerView2.getLocationInWindow(iArr);
                        int[] iArr2 = oquVar.d;
                        int i2 = iArr[0];
                        if (i2 == iArr2[0] && iArr[1] == iArr2[1]) {
                            return;
                        }
                        iArr2[0] = i2;
                        iArr2[1] = iArr[1];
                        ovkVar.s(recyclerView2);
                    }
                }
            }
        };
        mrt mrtVar = new mrt(this, recyclerView, i);
        this.G = mrtVar;
        recyclerView.addOnLayoutChangeListener(mrtVar);
        k(new Closeable() { // from class: oqm
            @Override // java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                this.a.I();
            }
        });
    }

    public static int D(oov oovVar, oph ophVar, oon oonVar, boolean z) {
        if (oonVar.a() == 0) {
            return 0;
        }
        try {
            NodeTreeProcessor nodeTreeProcessorB = ophVar != null ? oovVar.b(ophVar) : oovVar.a();
            try {
                Size sizeAf = af(nodeTreeProcessorB, oonVar.b(0));
                if (sizeAf == null) {
                    nodeTreeProcessorB.close();
                    return 0;
                }
                int height = z ? sizeAf.getHeight() : sizeAf.getWidth();
                nodeTreeProcessorB.close();
                return height;
            } catch (Throwable th) {
                try {
                    nodeTreeProcessorB.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception e) {
            oovVar.c().c(aslh.LOG_TYPE_INTERNAL_ERROR, "Failed to close NodeTreeProcessor", e);
            return 0;
        }
    }

    public static Size af(NodeTreeProcessor nodeTreeProcessor, atgg atggVar) {
        ((NodeTreeProcessorImpl) nodeTreeProcessor).F(atggVar, 0, 0, null);
        return nodeTreeProcessor.g();
    }

    public static ors ah(RecyclerView recyclerView, mew mewVar, Object obj) {
        orr orrVarB = ors.b();
        orrVarB.e(recyclerView);
        orrVarB.g = mewVar;
        if (obj != null) {
            orrVarB.b = obj;
        }
        return orrVarB.a();
    }

    private final void an() {
        SwipeRefreshLayout swipeRefreshLayout = this.o;
        if (swipeRefreshLayout != null) {
            RecyclerView recyclerView = this.a;
            swipeRefreshLayout.removeView(recyclerView);
            ak(recyclerView);
            this.o = null;
        }
    }

    public static int f(int i) {
        if (View.MeasureSpec.getMode(i) == 1073741824 || View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            return View.MeasureSpec.getSize(i);
        }
        return 0;
    }

    @Override // defpackage.oyk, com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final void B(NodeTreeProcessor nodeTreeProcessor) {
        super.B(nodeTreeProcessor);
        this.K = -1;
    }

    public final void I() {
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this.F);
        }
        nue nueVar = this.J;
        if (nueVar != null) {
            nueVar.o((RecyclerView) null);
            this.J = null;
            this.a.setTag(R.id.elements_item_touch_helper, null);
        }
        nyv nyvVar = this.l;
        if (nyvVar != null) {
            this.a.Z(nyvVar);
            this.l = null;
        }
        mhe mheVar = this.m;
        if (mheVar != null) {
            this.a.Z(mheVar);
            this.m = null;
        }
        ovk ovkVar = this.h;
        if (ovkVar != null) {
            if (this.f) {
                ovkVar.p();
                ovkVar.o();
            } else {
                this.a.aE(ovkVar);
            }
        }
        this.h = null;
        int[] iArr = this.d;
        iArr[0] = Integer.MIN_VALUE;
        iArr[1] = Integer.MIN_VALUE;
        qa qaVar = this.M;
        if (qaVar != null) {
            this.a.aE(qaVar);
        }
        this.M = null;
        oq oqVar = this.H;
        if (oqVar != null) {
            oqVar.f(null);
        }
        this.H = null;
        this.I = Integer.MIN_VALUE;
        this.s = 0;
        this.j = null;
        this.k = false;
        RecyclerView recyclerView = this.a;
        if (recyclerView != null) {
            recyclerView.af(null);
            try {
                recyclerView.ad(null);
            } catch (IllegalStateException unused) {
            }
        }
        oqj oqjVar = this.g;
        if (oqjVar != null) {
            oqjVar.z();
        }
        this.g = null;
        oqz oqzVar = this.i;
        if (oqzVar != null) {
            oqzVar.d(this.a);
        }
        this.i = null;
        String strAs = as();
        if (!ahno.aa(strAs)) {
            h().h().g(strAs, this.b);
        }
        this.n = null;
        this.r = 1;
        if (Memory.peekByte(FlagServices.b().c + 95) == 0) {
            this.N = null;
        }
        an();
        this.p.set(false);
        this.q = null;
        this.L = null;
        this.K = -1;
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.Set] */
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
    public final void J(atbv atbvVar) {
        orf orfVar;
        RecyclerView recyclerView;
        ork orkVar;
        atba atbaVar;
        syn synVar = this.N;
        oqj oqjVar = this.g;
        oqz oqzVar = this.i;
        boolean z = false;
        boolean z2 = atbvVar.aR() && (synVar != null && oqjVar != null && oqzVar != null);
        if (z2 && (atbaVar = this.L) != null) {
            z = !atbaVar.equals(atbvVar.aX());
        }
        ork orkVar2 = null;
        if (this.n != null && (!z2 || z)) {
            this.n = null;
            oqj oqjVar2 = this.g;
            if (oqjVar2 != null) {
                oqjVar2.C(null);
            }
            nue nueVar = this.J;
            if (nueVar != null) {
                nueVar.o((RecyclerView) null);
                this.a.setTag(R.id.elements_item_touch_helper, null);
                this.J = null;
            }
            an();
            this.L = null;
        }
        if (this.n == null && z2) {
            Object obj = synVar.d;
            Object obj2 = synVar.b;
            orf orfVarA = new orj((org) obj, synVar.a, (kjc) synVar.c).a(h(), atbvVar.aX(), as(), ap());
            if (orfVarA != null) {
                this.n = orfVarA;
                this.L = atbvVar.aX();
                oqjVar.C(orfVarA);
                agke agkeVarN = agke.n(orfVarA.identifiers());
                oqjVar.E(oqzVar, new oqt(orfVarA, agkeVarN), agkeVarN);
                orfVarA.a.a.add(new oqp(this, orfVarA));
            }
        }
        orf orfVar2 = this.n;
        if (orfVar2 != null) {
            if (orfVar2.d) {
                if (this.o == null) {
                    SwipeRefreshLayout swipeRefreshLayout = new SwipeRefreshLayout(getContext());
                    this.o = swipeRefreshLayout;
                    ak(swipeRefreshLayout);
                    this.o.addView(this.a);
                }
                this.o.setEnabled(true);
                this.o.a = new ixw(this, 2);
            } else {
                an();
            }
            if (!atbvVar.aR()) {
                nue nueVar2 = this.J;
                if (nueVar2 != null) {
                    nueVar2.o((RecyclerView) null);
                    this.a.setTag(R.id.elements_item_touch_helper, null);
                    return;
                }
                return;
            }
            atba atbaVarAX = atbvVar.aX();
            if (!atbaVarAX.aR() || Memory.peekByte(atbaVarAX.aT().c + 9) == 0 || (orfVar = this.n) == null || this.J != null || (recyclerView = this.a) == null) {
                return;
            }
            ElementsServices elementsServicesH = h();
            if (orfVar.c) {
                orkVar = new ork(new orl(orfVar, atbvVar, elementsServicesH.l()));
            }
            if (orkVar2 == null) {
                orkVar2 = orkVar;
                return;
            }
            orkVar2 = orkVar;
            orkVar2.o(recyclerView);
            recyclerView.setTag(R.id.elements_item_touch_helper, orkVar2);
            this.J = orkVar2;
        }
    }

    public final void K(atbv atbvVar) {
        oqu oquVar;
        boolean z = true;
        if (!atbvVar.aT() && !atbvVar.aU() && !atbvVar.aV() && (Memory.peekByte(FlagServices.b().c + 102) == 0 || !this.z)) {
            z = false;
        }
        oqo oqoVar = null;
        if (Memory.peekByte(FlagServices.b().c + 82) == 0) {
            qa qaVar = this.M;
            if (qaVar != null) {
                this.a.aE(qaVar);
            }
            if (z) {
                oquVar = this;
                oqoVar = new oqo(oquVar, atbvVar, atbvVar.bd(), h().l(), ap().c);
            } else {
                oquVar = this;
            }
            oquVar.M = oqoVar;
            if (oqoVar != null) {
                oquVar.a.aC(oqoVar);
                return;
            }
            return;
        }
        qa qaVar2 = this.M;
        if (!z) {
            if (qaVar2 != null) {
                this.a.aE(qaVar2);
                this.M = null;
                return;
            }
            return;
        }
        if (qaVar2 instanceof oqs) {
            oqs oqsVar = (oqs) qaVar2;
            oqsVar.a = atbvVar;
            oqsVar.b = oqsVar.c.h().l();
        } else {
            if (qaVar2 != null) {
                this.a.aE(qaVar2);
            }
            oqs oqsVar2 = new oqs(this, atbvVar);
            this.M = oqsVar2;
            this.a.aC(oqsVar2);
        }
    }

    @Override // defpackage.oyk, com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final void S(int i) {
        this.A = i;
        this.K = -1;
    }

    @Override // defpackage.oyk, com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final atoc V() {
        atbv atbvVar = this.q;
        if (atbvVar == null) {
            return null;
        }
        atbp atbpVarA = num.a(this.a, h(), 0, 0, atbvVar.bd());
        atoc atocVar = new atoc((byte[]) null);
        atocVar.aS(atbp.d, atbpVarA);
        return atocVar;
    }

    public final void ac(atbv atbvVar) {
        oqj oqjVar;
        int iBc = atbvVar.bc();
        if (this.s == iBc || (oqjVar = this.g) == null) {
            return;
        }
        if (iBc == 2) {
            oqjVar.l = this;
        } else {
            oqjVar.l = null;
        }
        this.s = iBc;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:34:0x0077  */
    /* JADX WARN: Type inference failed for: r14v10, types: [java.lang.Object, oov] */
    public final void ad(atbv atbvVar) {
        int iAW = atbvVar.aW();
        int iBd = atbvVar.bd();
        int i = 3;
        int i2 = Integer.MIN_VALUE;
        if (iAW == 2 || iBd == 3 || iBd == 1) {
            h();
            int iBd2 = atbvVar.bd() - 1;
            int iPeekInt = Memory.peekInt(atbvVar.c + (true != atbx.a ? 68L : 40L), false);
            if (iPeekInt == 0) {
                i = 1;
            } else if (iPeekInt == 1) {
                i = 2;
            } else if (iPeekInt != 2) {
                i = 0;
            }
            if (i == 0) {
                i = 1;
            }
            int i3 = i - 1;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (iBd2 == 1) {
                        i2 = Integer.MAX_VALUE;
                    } else if (iBd2 == 2) {
                        i2 = -1;
                    }
                } else if (iBd2 == 1) {
                    i2 = 2147483646;
                } else if (iBd2 == 2) {
                    i2 = 2147483644;
                }
            } else if (iBd2 == 1) {
                i2 = Integer.MAX_VALUE;
            } else if (iBd2 != 2) {
                i2 = 2147483643;
            } else {
                i2 = -1;
            }
        } else {
            h().L().io().c().a(aslh.LOG_TYPE_CONFIGURATION_ERROR, "Only snap to start is implemented for vertical lists");
        }
        if (i2 != this.I) {
            oq oqVar = this.H;
            if (oqVar != null) {
                oqVar.f(null);
            }
            oq oqVarAK = gzj.aK(i2, 0, 1);
            this.H = oqVarAK;
            if (oqVarAK != null) {
                oqVarAK.f(this.a);
            }
            this.b.a = (i2 == -1 || i2 == 2147483644) ? 6 : 1;
            this.I = i2;
        }
    }

    @Override // defpackage.oyk
    protected final void ae() {
        atbv atbvVar;
        if (Memory.peekByte(FlagServices.b().c + 102) == 0 || (atbvVar = this.q) == null) {
            return;
        }
        K(atbvVar);
    }

    public final ors ag(RecyclerView recyclerView, mew mewVar) {
        orr orrVarA = orp.a(h(), ap());
        orrVarA.e(recyclerView);
        orrVarA.g = mewVar;
        orrVarA.d(this.A);
        orrVarA.c(b());
        return orrVarA.a();
    }

    public final mew ai(int i, int i2, int i3) {
        NodeTreeProcessor nodeTreeProcessor = this.w;
        if (nodeTreeProcessor == null) {
            return null;
        }
        atdg atdgVarM = nodeTreeProcessor.m(this.A);
        atbp atbpVarA = num.a(this.a, h(), i, i2, i3);
        atoc atocVar = new atoc((byte[]) null);
        atocVar.aS(atbp.d, atbpVarA);
        if (atdgVarM != null) {
            atocVar.aS(atdg.d, atdgVarM);
        }
        return atocVar.aT();
    }

    @Override // defpackage.oyk, com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final int b() {
        if (Memory.peekByte(FlagServices.b().c + 82) == 0) {
            return nta.a(this);
        }
        int i = this.K;
        if (i != -1) {
            return i;
        }
        int iA = nta.a(this);
        this.K = iA;
        return iA;
    }

    @Override // defpackage.oyk, android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnScrollChangedListener(this.F);
        }
    }

    @Override // defpackage.oyk, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        mqs mqsVarC;
        NodeTreeProcessor nodeTreeProcessor;
        oqz oqzVar = this.i;
        if (oqzVar != null && (mqsVarC = oqzVar.c(getContext())) != null && (nodeTreeProcessor = this.w) != null) {
            aihh aihhVar = (aihh) mqt.a.createBuilder();
            aihhVar.e(mqs.b, mqsVarC);
            nodeTreeProcessor.y(this, (mqt) aihhVar.build());
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this.F);
        }
        int[] iArr = this.d;
        iArr[0] = Integer.MIN_VALUE;
        iArr[1] = Integer.MIN_VALUE;
        super.onDetachedFromWindow();
    }

    @Override // defpackage.oyk, com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final void y() {
        I();
        super.y();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }
}
