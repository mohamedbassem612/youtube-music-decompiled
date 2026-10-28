package defpackage;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class crs implements crm {
    public final long a = cnd.a();
    public final byi b;
    public final int c;
    public volatile Object d;
    private final bze e;
    private final crr f;

    /* JADX WARN: Type inference failed for: r1v0, types: [bye, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [crr, java.lang.Object] */
    public crs(yvh yvhVar) {
        this.e = new bze(yvhVar.c);
        this.b = (byi) yvhVar.b;
        this.c = yvhVar.a;
        this.f = yvhVar.d;
    }

    @Override // defpackage.crm
    public final void b() {
        bze bzeVar = this.e;
        bzeVar.a = 0L;
        byg bygVar = new byg(bzeVar, this.b);
        try {
            bygVar.a();
            Uri uriC = bzeVar.c();
            uriC.getClass();
            this.d = this.f.a(uriC, bygVar);
        } finally {
            int i = bwp.a;
            afxw.h(bygVar);
        }
    }

    public final long c() {
        return this.e.a;
    }

    public final Uri d() {
        return this.e.b;
    }

    public final Map e() {
        return this.e.c;
    }

    @Override // defpackage.crm
    public final void a() {
    }
}
