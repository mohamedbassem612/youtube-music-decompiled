package defpackage;

import j$.util.Optional;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class urf implements Supplier {
    public final /* synthetic */ Optional a;
    public final /* synthetic */ Optional b;
    public final /* synthetic */ Optional c;

    public /* synthetic */ urf(Optional optional, Optional optional2, Optional optional3) {
        this.a = optional;
        this.b = optional2;
        this.c = optional3;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return new urm(this.a, this.b, this.c, agpr.a);
    }
}
