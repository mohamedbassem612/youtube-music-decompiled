package defpackage;

import android.view.View;
import android.view.ViewGroup;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.function.Consumer$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iwd {
    public boolean a;
    private final avlh c;
    private final hfn e;
    private final avmm b = new avmm();
    private List d = new ArrayList();

    public iwd(avlh avlhVar, hfn hfnVar) {
        this.c = avlhVar;
        this.e = hfnVar;
    }

    public static final void d(View view, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = i;
            view.requestLayout();
        }
    }

    public final void a(View... viewArr) {
        boolean zIsEmpty = this.d.isEmpty();
        this.d.addAll(agke.p(viewArr));
        if (zIsEmpty) {
            this.b.e(this.c.i(new abwr(1)).al(new iho(this, 6), new ihp(5)), this.e.M().al(new iho(this, 7), new ihp(5)));
        }
    }

    public final void b() {
        View[] viewArr = (View[]) this.d.toArray(new View[0]);
        this.d = (List) Collection.EL.stream(this.d).filter(new ibz(viewArr, 11)).collect(Collectors.toList());
        DesugarArrays.stream(viewArr).forEach(new hgi(3));
        if (this.d.isEmpty()) {
            this.b.b();
        }
    }

    public final void c() {
        final int iK = this.a ? 0 : this.e.K();
        Collection.EL.stream(this.d).forEach(new Consumer() { // from class: iwc
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void r(Object obj) {
                iwd.d((View) obj, iK);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
