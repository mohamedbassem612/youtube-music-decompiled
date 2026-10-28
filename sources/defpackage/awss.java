package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awss implements awsx {
    public final awsx a;
    public final boolean b;
    public final awqg c;

    public awss(awsx awsxVar, boolean z, awqg awqgVar) {
        this.a = awsxVar;
        this.b = z;
        this.c = awqgVar;
    }

    @Override // defpackage.awsx
    public final Iterator a() {
        return new awsr(this);
    }
}
