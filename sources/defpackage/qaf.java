package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qaf {
    public agkj a;
    public byte b;
    private agke c;

    public final qaj a() {
        int i = ~this.b;
        if ((i & 1) != 0) {
            throw new IllegalStateException("Missing required properties: gaiaAccountNames");
        }
        agke agkeVar = this.c;
        agkj agkjVar = this.a;
        if ((i & 2) != 0) {
            agkjVar = null;
        }
        return new qaj(agkeVar, agkjVar);
    }

    public final void b(List list) {
        this.c = agke.n(list);
        this.b = (byte) (this.b | 1);
    }
}
