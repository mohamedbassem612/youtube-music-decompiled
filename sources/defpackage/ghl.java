package defpackage;

import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ghl implements wfc {
    private final /* synthetic */ int $cid;
    final /* synthetic */ ghs a;

    public ghl(ghs ghsVar, int i) {
        this.$cid = i;
        this.a = ghsVar;
    }

    @Override // defpackage.wfc
    public final wfd a(Function function) {
        int i = this.$cid;
        ghs ghsVar = this.a;
        return i != 0 ? new wfd((zwb) ghsVar.a.bd.io(), function) : new wfd((zwb) ghsVar.a.bd.io(), function);
    }
}
