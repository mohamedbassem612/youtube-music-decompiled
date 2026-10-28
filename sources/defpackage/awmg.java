package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class awmg implements Serializable, awmi {
    private final Object a;

    public awmg(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.awmi
    public final Object a() {
        return this.a;
    }

    @Override // defpackage.awmi
    public final boolean b() {
        return true;
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
