package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.Surface;
import androidx.preference.PreferenceGroup;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cqc implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ cqc(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v26, types: [android.view.Choreographer$VsyncCallback, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [coq, java.lang.Object] */
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
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$cid) {
            case 0:
                ((cqr) this.a).g();
                return;
            case 1:
                ?? r4 = this.a;
                cog cogVar = (cog) r4;
                if (cogVar.p || cogVar.q.g()) {
                    return;
                }
                cogVar.o = true;
                cnj cnjVar = cogVar.i;
                cnjVar.getClass();
                cnjVar.b(r4);
                return;
            case 2:
                ((csf) this.a).b();
                return;
            case 3:
                ((cst) this.a).c.c();
                return;
            case 4:
                ((cst) ((ere) this.a).b).c.b();
                return;
            case 5:
                ((cst) ((ere) this.a).b).c.d();
                return;
            case 6:
                ((cst) ((ere) this.a).b).c.e();
                return;
            case 7:
                ((cti) this.a).n--;
                return;
            case 8:
                ?? r5 = this.a;
                ((ctt) r5).a.postVsyncCallback(r5);
                return;
            case 9:
                cul culVar = (cul) this.a;
                Surface surface = culVar.e;
                if (surface != null) {
                    Iterator it = culVar.a.iterator();
                    while (it.hasNext()) {
                        ((cch) it.next()).a.Z(null);
                    }
                }
                cul.a(culVar.d, surface);
                culVar.d = null;
                culVar.e = null;
                return;
            case 10:
                Object obj = this.a;
                dge dgeVar = (dge) obj;
                dgeVar.l(true);
                dgeVar.n.requestLayout();
                dgeVar.n.getViewTreeObserver().addOnGlobalLayoutListener(new jg(obj, 4));
                return;
            case 11:
                dge dgeVar2 = ((dgc) this.a).a;
                if (dgeVar2.v != null) {
                    dgeVar2.v = null;
                    if (dgeVar2.K) {
                        dgeVar2.q(dgeVar2.L);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                ((dgu) this.a).h = -1;
                return;
            case 13:
                ((dhz) this.a).j();
                return;
            case 14:
                ((dig) this.a).b();
                return;
            case 15:
                SparseArray sparseArray = ((diw) this.a).g;
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    ((vy) sparseArray.valueAt(i)).l(null, null);
                }
                sparseArray.clear();
                return;
            case 16:
                Object obj2 = this.a;
                djc djcVar = ((diw) obj2).h;
                if (djcVar.d == obj2) {
                    djcVar.g();
                    return;
                }
                return;
            case 17:
                ((dkd) this.a).l();
                return;
            case 18:
                RecyclerView recyclerView = ((dky) this.a).mList;
                recyclerView.focusableViewAvailable(recyclerView);
                return;
            case 19:
                synchronized (this) {
                    ((PreferenceGroup) this.a).a.clear();
                    break;
                }
                return;
            default:
                ((dlb) this.a).C();
                return;
        }
    }

    public cqc(Object obj, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
    }
}
