package defpackage;

import android.text.TextUtils;
import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abqr implements zza {
    final /* synthetic */ axfd a;
    private final String b;
    private final zza c;
    private final xir d;
    private final boolean e;

    public abqr(axfd axfdVar, String str, zza zzaVar, xir xirVar, boolean z) {
        this.a = axfdVar;
        this.b = str;
        this.c = zzaVar;
        this.d = xirVar;
        this.e = z;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, mbc] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, mbc] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, mbc] */
    @Override // defpackage.tnh
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        long j;
        long jB;
        long millis;
        axfd axfdVar = this.a;
        wgi wgiVar = (wgi) obj;
        if (this.e) {
            String str = this.b;
            if (!TextUtils.isEmpty(str)) {
                if (wgiVar != null) {
                    alop alopVar = wgiVar.a.d;
                    if (alopVar == null) {
                        alopVar = alop.a;
                    }
                    ajnv ajnvVar = alopVar.f;
                    if (ajnvVar == null) {
                        ajnvVar = ajnv.a;
                    }
                    if ((ajnvVar.b & 1) != 0) {
                        jB = axfdVar.e.b();
                        ajnv ajnvVar2 = alopVar.f;
                        if (ajnvVar2 == null) {
                            ajnvVar2 = ajnv.a;
                        }
                        millis = Duration.ofSeconds(ajnvVar2.c).toMillis();
                    } else {
                        jB = axfdVar.e.b();
                        millis = Duration.ofSeconds(alopVar.e).toMillis();
                    }
                    j = jB + millis;
                } else {
                    j = 0;
                }
                if (j > axfdVar.e.b()) {
                    ((abqw) axfdVar.c).put(str, new abqv(wgiVar, j));
                }
            }
        }
        axfdVar.o(wgiVar, this.c, this.d);
    }

    @Override // defpackage.tng
    public final void jj(toe toeVar) {
        this.c.jj(toeVar);
    }

    @Override // defpackage.zza
    public final void jk() {
        this.c.jk();
    }
}
