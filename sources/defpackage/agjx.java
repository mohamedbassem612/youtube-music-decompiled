package defpackage;

import java.io.Serializable;
import java.util.EnumSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agjx implements Serializable {
    private static final long serialVersionUID = 0;
    final EnumSet a;

    public agjx(EnumSet enumSet) {
        this.a = enumSet;
    }

    Object readResolve() {
        return new agjy(this.a.clone());
    }
}
