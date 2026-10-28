package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class mlw implements Consumer {
    volatile fhd a;

    public mlw(fhd fhdVar) {
        this.a = fhdVar;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void r(Object obj) {
        nay nayVar = (nay) obj;
        fhd fhdVar = this.a;
        int i = mlr.d;
        if (fhdVar.c != null) {
            fhdVar.x(new aero(0, new Object[]{nayVar}), "updateState:Reference.updateCurrentElement");
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
