package defpackage;

import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iyc extends advn {
    private final Function a;

    public iyc(Function function) {
        this.a = function;
    }

    @Override // defpackage.advn, defpackage.advo
    public final void b(advl advlVar) {
        if (advlVar != null) {
            adtt adttVar = advlVar.a;
            if (adttVar instanceof adts) {
                super.b(advlVar.a((adtt) this.a.apply((adts) adttVar)));
                return;
            }
        }
        super.b(advlVar);
    }

    @Override // defpackage.advn, defpackage.admu, defpackage.adkz
    public final /* bridge */ /* synthetic */ void h(adky adkyVar) {
        super.hK(adkyVar);
    }
}
