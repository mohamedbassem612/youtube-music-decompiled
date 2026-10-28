package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class awoo implements Serializable {
    private static final long serialVersionUID = 0;
    private final awou[] a;

    public awoo(awou[] awouVarArr) {
        this.a = awouVarArr;
    }

    private final Object readResolve() {
        awou awouVarPlus = awov.a;
        int i = 0;
        while (true) {
            awou[] awouVarArr = this.a;
            if (i >= awouVarArr.length) {
                return awouVarPlus;
            }
            awouVarPlus = awouVarPlus.plus(awouVarArr[i]);
            i++;
        }
    }
}
