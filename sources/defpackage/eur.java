package defpackage;

import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eur implements eui {
    private final ewv a;

    public eur(ewv ewvVar) {
        this.a = ewvVar;
    }

    @Override // defpackage.eui
    public final /* bridge */ /* synthetic */ euj a(Object obj) {
        return new eus((InputStream) obj, this.a);
    }

    @Override // defpackage.eui
    public final Class b() {
        return InputStream.class;
    }
}
