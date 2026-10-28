package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class yu {
    public Object a;

    public yu(byte[] bArr, byte[] bArr2) {
        this.a = "";
    }

    public final void a(List list) {
        this.a = DesugarCollections.unmodifiableList(new ArrayList(list));
    }

    public yu(byte[] bArr) {
    }

    public yu() {
        this.a = Collections.EMPTY_LIST;
    }
}
