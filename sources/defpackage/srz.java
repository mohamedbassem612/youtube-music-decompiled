package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class srz implements zza {
    public final xgv a;
    private final adof b;
    private final ttm c;
    private final adnu d;

    public srz(adof adofVar, ttm ttmVar, adnu adnuVar, xgv xgvVar) {
        this.b = adofVar;
        this.c = ttmVar;
        this.d = adnuVar;
        this.a = xgvVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0024  */
    @Override // defpackage.tnh
    public final /* synthetic */ void a(Object obj) {
        apkc apkcVar;
        alww alwwVar = (alww) obj;
        if (alwwVar == null) {
            apkcVar = null;
        } else {
            alwx alwxVar = alwwVar.d;
            if (alwxVar == null) {
                alwxVar = alwx.a;
            }
            if (alwxVar.b == 113762946) {
                alwx alwxVar2 = alwwVar.d;
                if (alwxVar2 == null) {
                    alwxVar2 = alwx.a;
                }
                apkcVar = alwxVar2.b == 113762946 ? (apkc) alwxVar2.c : apkc.a;
            } else {
                apkcVar = null;
            }
        }
        if (apkcVar != null) {
            xgv xgvVar = this.a;
            xgvVar.w(new xgj(apkcVar.i, (amud) null), null);
            aokg aokgVar = apkcVar.c;
            if (aokgVar == null) {
                aokgVar = aokg.a;
            }
            if ((aokgVar.b & 1) != 0) {
                aokg aokgVar2 = apkcVar.c;
                if (aokgVar2 == null) {
                    aokgVar2 = aokg.a;
                }
                aokf aokfVar = aokgVar2.c;
                if (aokfVar == null) {
                    aokfVar = aokf.a;
                }
                for (aoka aokaVar : aokfVar.c) {
                    if ((aokaVar.b & 4) != 0) {
                        aokc aokcVar = aokaVar.c;
                        if (aokcVar == null) {
                            aokcVar = aokc.a;
                        }
                        xgvVar.w(new xgj(aokcVar.i, (amud) null), null);
                    }
                }
            }
            adof adofVar = this.b;
            adnu adnuVar = this.d;
            boolean z = adofVar.f;
            adofVar.b(apkcVar, adnuVar);
        }
    }

    @Override // defpackage.tng
    public final void jj(toe toeVar) {
        this.c.e(toeVar);
    }

    @Override // defpackage.zza
    public final /* synthetic */ void jk() {
    }
}
