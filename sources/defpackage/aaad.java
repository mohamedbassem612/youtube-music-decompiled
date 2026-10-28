package defpackage;

import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aaad {
    public Intent a;
    public Intent b;
    public int c;
    public int d;
    public int e;
    public String f;
    public byte g;

    public final void a(int i) {
        this.e = i;
        this.g = (byte) (this.g | 4);
    }

    public final void b(int i) {
        this.d = i;
        this.g = (byte) (this.g | 2);
    }

    public final void c(int i) {
        this.c = i;
        this.g = (byte) (this.g | 1);
    }
}
