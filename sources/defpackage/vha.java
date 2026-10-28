package defpackage;

import android.util.SparseArray;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.common.ui.RtlAwareViewPager;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class vha extends dk {
    public int f;
    final SparseArray g;
    final /* synthetic */ vhc h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vha(vhc vhcVar, dd ddVar) {
        super(ddVar);
        this.h = vhcVar;
        this.f = 0;
        this.g = new SparseArray();
    }

    @Override // defpackage.dts
    public final int g() {
        return this.f;
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
    @Override // defpackage.dts
    public final Object j(ViewGroup viewGroup, int i) {
        cb cbVar;
        cc ccVar;
        cc ccVar2;
        vhc vhcVar = this.h;
        RtlAwareViewPager rtlAwareViewPager = vhcVar.y;
        rtlAwareViewPager.getClass();
        int iV = rtlAwareViewPager.v(i);
        ArrayList arrayList = this.d;
        if (arrayList.size() <= iV || (ccVar2 = (cc) arrayList.get(iV)) == null) {
            ccVar = ccVar2;
            if (((dk) this).b == null) {
                ((dk) this).b = new av(((dk) this).a);
            }
            vhk vhkVar = new vhk();
            vhkVar.d = vhcVar.I;
            ArrayList arrayList2 = this.c;
            if (arrayList2.size() > iV && (cbVar = (cb) arrayList2.get(iV)) != null) {
                vhkVar.setInitialSavedState(cbVar);
            }
            while (arrayList.size() <= iV) {
                arrayList.add(null);
            }
            vhkVar.setMenuVisibility(false);
            vhkVar.setUserVisibleHint(false);
            arrayList.set(iV, vhkVar);
            ((dk) this).b.g(viewGroup.getId(), vhkVar, null, 1);
            ccVar = vhkVar;
        }
        ccVar = ccVar2;
        this.g.put(i, ccVar);
        return ccVar;
    }

    @Override // defpackage.dts
    public final void k(ViewGroup viewGroup, int i, Object obj) {
        ArrayList arrayList;
        this.g.remove(i);
        cc ccVar = (cc) obj;
        if (((dk) this).b == null) {
            ((dk) this).b = new av(((dk) this).a);
        }
        while (true) {
            arrayList = this.c;
            if (arrayList.size() > i) {
                break;
            } else {
                arrayList.add(null);
            }
        }
        arrayList.set(i, ccVar.isAdded() ? ((dk) this).a.d(ccVar) : null);
        this.d.set(i, null);
        ((dk) this).b.l(ccVar);
        if (ccVar.equals(this.e)) {
            this.e = null;
        }
    }

    public final cc p(int i) {
        RtlAwareViewPager rtlAwareViewPager = this.h.y;
        rtlAwareViewPager.getClass();
        return (cc) this.g.get(rtlAwareViewPager.v(i));
    }
}
