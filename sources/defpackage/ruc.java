package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ruc implements Consumer {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ long b;

    public /* synthetic */ ruc(boolean z, long j) {
        this.a = z;
        this.b = j;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        ((sgi) obj).s(this.a, this.b);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
