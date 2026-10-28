package defpackage;

import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.View;
import com.google.android.apps.youtube.music.survey.HatsContainer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mrt implements View.OnLayoutChangeListener {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;
    final /* synthetic */ View b;

    public mrt(ivu ivuVar, HatsContainer hatsContainer, int i) {
        this.$cid = i;
        this.b = hatsContainer;
        this.a = ivuVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.CharSequence, java.lang.Object] */
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
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.$cid;
        if (i9 == 0) {
            view.removeOnLayoutChangeListener(this);
            mry mryVar = (mry) this.b;
            Layout layout = mryVar.getLayout();
            if (layout != null) {
                if (mryVar.f == null) {
                    mryVar.f = new heg();
                }
                mryVar.f.v(layout, this.a);
                return;
            }
            return;
        }
        if (i9 == 1) {
            ((ivu) this.a).b().start();
            ((HatsContainer) this.b).removeOnLayoutChangeListener(this);
            return;
        }
        if (i9 != 2) {
            View view2 = this.b;
            Object obj = this.a;
            ((roe) obj).d.execute(afwl.i(new rhz(obj, view2, 12)));
            return;
        }
        oqu oquVar = (oqu) this.a;
        ovk ovkVar = oquVar.h;
        if (ovkVar != null) {
            RecyclerView recyclerView = (RecyclerView) this.b;
            if (recyclerView.q) {
                int[] iArr = oquVar.e;
                recyclerView.getLocationInWindow(iArr);
                int[] iArr2 = oquVar.d;
                iArr2[0] = iArr[0];
                iArr2[1] = iArr[1];
                ovkVar.s(recyclerView);
            }
        }
    }

    public /* synthetic */ mrt(Object obj, View view, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = view;
    }

    public mrt(mry mryVar, CharSequence charSequence, int i) {
        this.$cid = i;
        this.a = charSequence;
        this.b = mryVar;
    }
}
