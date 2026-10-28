package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class awso implements awsx {
    public final awsx a;

    public awso(awsx awsxVar) {
        this.a = awsxVar;
    }

    @Override // defpackage.awsx
    public final Iterator a() {
        return new awsn(this, 0);
    }
}
