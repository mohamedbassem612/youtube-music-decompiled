package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agir extends agkg {
    public static final agir a = new agir();
    private static final long serialVersionUID = 0;

    private agir() {
        super(agpn.b, 0);
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.agkp, defpackage.agom
    public final /* synthetic */ Map n() {
        return this.map;
    }
}
