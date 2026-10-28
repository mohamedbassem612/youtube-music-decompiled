package defpackage;

import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class urx implements awqg {
    final /* synthetic */ Function a;

    public urx(Function function) {
        this.a = function;
    }

    @Override // defpackage.awqg
    public final Object invoke(Object obj) {
        return this.a.apply(obj);
    }
}
