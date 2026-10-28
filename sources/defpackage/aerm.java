package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aerm {
    public final int a;
    public final int b;
    public final Object c;

    public aerm(int i, int i2, Object obj) {
        this.b = i;
        this.a = i2;
        this.c = obj;
    }

    public aerm(int i, int i2, List list) {
        this.a = i;
        this.b = i2;
        this.c = list;
    }

    public aerm(byte[] bArr, int i, int i2) {
        this.c = bArr;
        this.b = i;
        this.a = i2;
    }
}
