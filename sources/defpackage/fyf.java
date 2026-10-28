package defpackage;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fyf extends fys {
    private final Callable a;

    public fyf(Callable callable) {
        super("internal.appMetadata");
        this.a = callable;
    }

    @Override // defpackage.fys
    public final fyy a(kwq kwqVar, List list) {
        try {
            return fhz.at(this.a.call());
        } catch (Exception unused) {
            return fyy.f;
        }
    }
}
