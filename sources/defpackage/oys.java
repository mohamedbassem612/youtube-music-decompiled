package defpackage;

import app.rive.semantics.SemanticState;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class oys {
    public final int a;
    public final String b;
    public final int c;
    public final Object d;
    public final Object e;

    public oys(int i, String str, int i2, List list, byte[] bArr) {
        this.c = i;
        this.b = str;
        this.a = i2;
        this.d = list == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(list);
        this.e = bArr;
    }

    public static oys a(int i, Throwable th) {
        return new oys(i, -1, th.getMessage(), (String) null, th);
    }

    public final int b() {
        int i = this.a;
        if (i == 2) {
            return SemanticState.Modal;
        }
        if (i != 3) {
            return 0;
        }
        return SemanticState.LiveRegion;
    }

    public oys(int i, int i2, String str, String str2, Throwable th) {
        this.c = i;
        this.a = i2;
        this.d = str;
        this.b = null;
        this.e = th;
    }
}
