package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agis extends aglc {
    static final agis a = new agis();
    private static final long serialVersionUID = 0;

    private agis() {
        super(agpn.b, 0, null);
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.agkp, defpackage.agom
    public final /* synthetic */ Map n() {
        return this.map;
    }
}
