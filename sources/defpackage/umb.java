package defpackage;

import android.view.MotionEvent;
import android.view.View;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class umb implements Function {
    public final /* synthetic */ View a;
    public final /* synthetic */ MotionEvent b;
    public final /* synthetic */ View c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ umb(View view, MotionEvent motionEvent, View view2, boolean z) {
        this.a = view;
        this.b = motionEvent;
        this.c = view2;
        this.d = z;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo840andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return Boolean.valueOf(((uql) obj).i(this.a, this.b, this.c, this.d));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
