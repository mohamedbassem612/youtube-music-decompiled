package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class urk implements Supplier {
    public final /* synthetic */ Optional a;
    public final /* synthetic */ Optional b;
    public final /* synthetic */ Optional c;
    public final /* synthetic */ url d;

    public /* synthetic */ urk(Optional optional, Optional optional2, Optional optional3, url urlVar) {
        this.a = optional;
        this.b = optional2;
        this.c = optional3;
        this.d = urlVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        url urlVar = this.d;
        return new urm(this.a, this.b, this.c, (agkz) Stream.CC.concat(Collection.EL.stream(urlVar.a).map(new uri()), Collection.EL.stream(urlVar.b).map(new uri())).collect(aghu.b));
    }
}
