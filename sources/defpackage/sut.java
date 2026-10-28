package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class sut implements DialogInterface.OnShowListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sut(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [acwn, java.lang.Object] */
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
    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        adzm adzmVar;
        int i = this.$cid;
        if (i == 0) {
            ((suu) this.a).c.w(new xgj(((aqgo) this.b).h.G()), null);
            return;
        }
        if (i == 1) {
            ((gyy) this.b).d.setContentView((View) this.a, new ViewGroup.LayoutParams(-1, -1));
            return;
        }
        if (i == 2) {
            ((abfv) this.b).m(((aaue) this.a).l, "");
            return;
        }
        if (i == 3) {
            acwp.h((AlertDialog) this.a, (Context) this.b);
            return;
        }
        if (i == 4) {
            ((addl) this.b).d.m(this.a, "");
            return;
        }
        Activity activity = (Activity) this.a;
        if (activity.isDestroyed() || activity.isFinishing() || (adzmVar = ((adyw) this.b).R) == null) {
            return;
        }
        adzmVar.b(activity);
    }

    public /* synthetic */ sut(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
