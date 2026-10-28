package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class byf extends IOException {
    public final int a;

    public byf(int i) {
        this.a = i;
    }

    public byf(String str, int i) {
        super(str);
        this.a = i;
    }

    public byf(String str, Throwable th, int i) {
        super(str, th);
        this.a = i;
    }

    public byf(Throwable th, int i) {
        super(th);
        this.a = i;
    }
}
