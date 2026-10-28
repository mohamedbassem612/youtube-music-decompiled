package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class jsw extends IOException implements zjs {
    private final String a;

    public jsw(String str, Exception exc) {
        super(str, exc);
        this.a = "file";
    }

    @Override // defpackage.zjs
    public final String a(boolean z) {
        return this.a;
    }

    @Override // defpackage.zjs
    public final String b() {
        return getMessage();
    }
}
