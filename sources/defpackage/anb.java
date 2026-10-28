package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class anb implements ang, ana {
    private final apj a;

    public anb(apj apjVar) {
        this.a = apjVar;
    }

    @Override // defpackage.ana
    public final apj f() {
        return this.a;
    }

    @Override // defpackage.ang
    public final /* synthetic */ anf r(int i, int i2, Map map, awqg awqgVar) {
        if (i2 < 0) {
            i2 = 0;
        }
        if (i < 0) {
            i = 0;
        }
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            amw.b(a.cj(i2, i, "Size(", " x ", ") is out of range. Each dimension must be between 0 and 16777215."));
        }
        return new ant(i, i2, map, 1);
    }

    @Override // defpackage.ang
    public final anf s(int i, int i2, Map map, awqg awqgVar) {
        throw null;
    }
}
