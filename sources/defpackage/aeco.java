package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class aeco implements awmd {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ aeco(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [awmd, java.lang.Object] */
    @Override // defpackage.awmd, defpackage.awmc
    public final Object io() {
        int i = this.$cid;
        if (i == 0) {
            Object obj = this.b;
            opf opfVarA = oph.a();
            opfVarA.c = aguu.al(new cmw(this.a, obj, 14));
            return opfVarA.a();
        }
        if (i != 1) {
            return afuy.e(afuy.d((Set) this.a.io()), (afuy) ((afvq) this.b).c);
        }
        View view = (View) this.b;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.getContext();
        return tym.k((Class) this.a, layoutParams);
    }
}
