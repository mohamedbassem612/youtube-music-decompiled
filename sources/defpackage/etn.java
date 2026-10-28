package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class etn implements etr {
    final /* synthetic */ InputStream a;
    final /* synthetic */ ewv b;

    public etn(InputStream inputStream, ewv ewvVar) {
        this.a = inputStream;
        this.b = ewvVar;
    }

    @Override // defpackage.etr
    public final int a(etj etjVar) throws IOException {
        try {
            return etjVar.c(this.a, this.b);
        } finally {
            this.a.reset();
        }
    }
}
