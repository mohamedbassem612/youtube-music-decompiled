package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aop implements awqg {
    public static final aop a = new aop(7);
    private final /* synthetic */ int $cid;

    public aop(int i) {
        this.$cid = i;
    }

    @Override // defpackage.awqg
    public final /* synthetic */ Object invoke(Object obj) {
        switch (this.$cid) {
            case 0:
                throw null;
            case 1:
                throw null;
            case 2:
                throw null;
            case 3:
                throw null;
            case 4:
                throw null;
            case 5:
                throw null;
            case 6:
                throw null;
            default:
                View view = (View) obj;
                view.getClass();
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                if (viewGroup != null) {
                    return new bag(viewGroup, 1).a();
                }
                return null;
        }
    }
}
