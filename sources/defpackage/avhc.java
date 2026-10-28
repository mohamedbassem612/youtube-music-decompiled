package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avhc extends avbt {
    final /* synthetic */ avhd b;

    public avhc(avhd avhdVar) {
        this.b = avhdVar;
    }

    @Override // defpackage.avbt
    public final String a() {
        return this.b.b;
    }

    @Override // defpackage.avbt
    public final void d(atxy atxyVar) {
        List list = Collections.EMPTY_LIST;
        auyo auyoVar = auyo.a;
        atxyVar.m(new avbr(new avcf(null, Collections.singletonList(new auzm(this.b.a))), auyo.a, null));
    }

    @Override // defpackage.avbt
    public final void c() {
    }
}
