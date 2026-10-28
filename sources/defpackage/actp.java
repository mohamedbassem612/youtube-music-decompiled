package defpackage;

import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class actp implements zza {
    public final long a;
    public final acrz b;
    public final Set c;
    public final acsv d;
    public volatile boolean e;
    public final acqz f;
    private final ajwo g;
    private final String h;
    private final actv i;
    private final Executor j;
    private final hno k;

    public actp(actv actvVar, acrz acrzVar, Executor executor, Set set, hno hnoVar, acsv acsvVar) {
        this.h = "";
        this.f = null;
        this.g = null;
        this.a = Long.MIN_VALUE;
        this.i = actvVar;
        this.b = acrzVar;
        this.j = executor;
        this.c = set;
        this.k = hnoVar;
        this.d = acsvVar;
    }

    @Override // defpackage.tnh
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ajwo ajwoVar = this.g;
        acrx acrxVar = (acrx) obj;
        if (ajwoVar != null) {
            Object obj2 = acrxVar.b;
            boolean zAF = this.k.aF();
            actv actvVar = this.i;
            if (zAF) {
                actvVar.A(ajwoVar, (alqc) obj2, acrxVar.a);
            } else {
                actvVar.B(ajwoVar, (alqc) obj2, acrxVar.a);
            }
        }
    }

    public final void d(ajwo ajwoVar) {
        actv actvVar = this.i;
        hno hnoVar = this.k;
        actq actqVar = new actq(ajwoVar, actvVar, hnoVar);
        this.c.add(actqVar);
        if (!hnoVar.ar()) {
            this.b.k(ajwoVar, actqVar, zzd.a);
        } else {
            taf.g(ahno.aq(new wan(this, ajwoVar, 7, null), this.j), new xwl(this, actqVar, 15, null));
        }
    }

    @Override // defpackage.tng
    public final void jj(toe toeVar) {
        ajwo ajwoVar;
        if (this.e || (ajwoVar = this.g) == null) {
            return;
        }
        this.i.D(this.h, toeVar, ajwoVar);
    }

    @Override // defpackage.zza
    public final /* synthetic */ void jk() {
    }

    public actp(String str, long j, actv actvVar, acqz acqzVar, acrz acrzVar, Executor executor, Set set, hno hnoVar, ajwo ajwoVar, acsv acsvVar) {
        this.h = str;
        this.a = j;
        this.i = actvVar;
        this.f = acqzVar;
        this.b = acrzVar;
        this.j = executor;
        this.c = set;
        this.k = hnoVar;
        this.g = ajwoVar;
        this.d = acsvVar;
    }
}
