package defpackage;

import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agur extends aguo {
    public static final aguo a = new agur();

    @Override // defpackage.aguo
    public final agsw a(String str) {
        return new agul(Logger.getLogger(str.replace('$', '.')));
    }

    public final String toString() {
        return "Default logger backend factory";
    }
}
