package defpackage;

import android.view.View;
import com.google.android.libraries.elements.converters.layout.FlowLayoutManager;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mos implements frj {
    private final FlowLayoutManager a;
    private mop b;
    private final Map c;

    public mos(FlowLayoutManager flowLayoutManager, Map map) {
        this.b = null;
        this.a = flowLayoutManager;
        this.c = map;
        if (flowLayoutManager.I) {
            mop mopVar = flowLayoutManager.L;
            if (mopVar != null) {
                this.b = mopVar;
                return;
            }
            mov movVar = new mov(flowLayoutManager);
            this.b = movVar;
            if (flowLayoutManager.L != movVar) {
                flowLayoutManager.L = movVar;
                flowLayoutManager.F.j();
                flowLayoutManager.requestLayout();
            }
        }
    }

    private final int n() {
        FlowLayoutManager flowLayoutManager = this.a;
        boolean z = flowLayoutManager.J;
        return flowLayoutManager.H;
    }

    private final int o(int i) {
        if (FlowLayoutManager.g && i == 1) {
            return 0;
        }
        FlowLayoutManager flowLayoutManager = this.a;
        boolean z = flowLayoutManager.J;
        return flowLayoutManager.G;
    }

    private final void p(ftg ftgVar) {
        Map map = this.c;
        if (map == null || !map.containsKey(ftgVar)) {
            return;
        }
        ((Integer) map.get(ftgVar)).intValue();
    }

    @Override // defpackage.frj
    public final int a(int i, int i2, int i3, int i4) {
        int iCeil = (int) (this.a.w != 0 ? Math.ceil(i4 / i2) : Math.ceil(i3 / i));
        int i5 = 2;
        if (iCeil >= 2) {
            i5 = 10;
            if (iCeil <= 10) {
                return iCeil;
            }
        }
        return i5;
    }

    @Override // defpackage.fux
    public final int b() {
        FlowLayoutManager flowLayoutManager = this.a;
        View viewH = flowLayoutManager.h(0, flowLayoutManager.getChildCount(), true, false);
        if (viewH == null) {
            return -1;
        }
        return flowLayoutManager.getPosition(viewH);
    }

    @Override // defpackage.fux
    public final int c() {
        return this.a.c();
    }

    @Override // defpackage.fux
    public final int d() {
        return this.a.d();
    }

    @Override // defpackage.fux
    public final int e() {
        return this.a.e();
    }

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
    @Override // defpackage.frj
    public final int f(int i, ftg ftgVar) {
        FlowLayoutManager flowLayoutManager = this.a;
        boolean z = false;
        if (flowLayoutManager.w == 1) {
            return 0;
        }
        p(ftgVar);
        int iN = n();
        if (ftgVar != null && ftgVar.j()) {
            z = true;
        }
        int iA = flowLayoutManager.a(flowLayoutManager);
        boolean z2 = flowLayoutManager.J;
        if (FlowLayoutManager.g && iN == 1) {
            return View.MeasureSpec.makeMeasureSpec(iA, 1073741824);
        }
        int iO = o(iN);
        boolean z3 = flowLayoutManager.J;
        if (iN == -1 || z) {
            return View.MeasureSpec.makeMeasureSpec(iA, true != z ? Integer.MIN_VALUE : 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec((iA - ((iN - 1) * iO)) / iN, 1073741824);
    }

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
    @Override // defpackage.frj
    public final int g(int i, ftg ftgVar) {
        FlowLayoutManager flowLayoutManager = this.a;
        boolean z = false;
        if (flowLayoutManager.w != 1) {
            return 0;
        }
        p(ftgVar);
        int iN = n();
        if (ftgVar != null && ftgVar.j()) {
            z = true;
        }
        int iA = flowLayoutManager.a(flowLayoutManager);
        boolean z2 = flowLayoutManager.K;
        boolean z3 = flowLayoutManager.J;
        if (FlowLayoutManager.g && iN == 1) {
            return View.MeasureSpec.makeMeasureSpec(iA, 1073741824);
        }
        int iO = o(iN);
        boolean z4 = flowLayoutManager.J;
        if (iN == -1 || z) {
            return View.MeasureSpec.makeMeasureSpec(iA, true != z ? Integer.MIN_VALUE : 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec((iA - ((iN - 1) * iO)) / iN, 1073741824);
    }

    @Override // defpackage.fux
    public final int h() {
        return this.a.getItemCount();
    }

    @Override // defpackage.frj
    public final int i() {
        return this.a.w;
    }

    @Override // defpackage.frj
    public final np j() {
        return this.a;
    }

    @Override // defpackage.frj
    public final /* bridge */ /* synthetic */ fri k(int i, int i2) {
        return new mor(i, i2, i(), 0);
    }

    @Override // defpackage.frj
    public final void l(int i, int i2) {
        this.a.l(i, i2);
    }

    @Override // defpackage.frj
    public final void m(frh frhVar) {
        mop mopVar;
        if (FlowLayoutManager.h) {
            mopVar = this.b;
            if (!(mopVar instanceof moq)) {
                return;
            }
        } else {
            if (frhVar == null) {
                return;
            }
            mopVar = this.b;
            if (!(mopVar instanceof moq)) {
                return;
            }
        }
        ((mov) mopVar).b = frhVar;
    }
}
