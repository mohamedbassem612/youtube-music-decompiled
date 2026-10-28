package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class acml implements Consumer {
    public final /* synthetic */ apec a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;

    public /* synthetic */ acml(int i, apec apecVar, boolean z) {
        this.c = i;
        this.a = apecVar;
        this.b = z;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Optional optionalEmpty;
        apec apecVar = this.a;
        acnn acnnVar = (acnn) obj;
        if ((apecVar.c & 2) != 0) {
            aped apedVarA = aped.a(apecVar.e);
            if (apedVarA == null) {
                apedVarA = aped.REEL_NAVIGATION_REASON_UNKNOWN;
            }
            optionalEmpty = Optional.of(apedVarA);
        } else {
            optionalEmpty = Optional.empty();
        }
        acnnVar.p(this.c, optionalEmpty, this.b);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
