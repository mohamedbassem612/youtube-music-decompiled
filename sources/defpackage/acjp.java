package defpackage;

import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class acjp implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ acjp(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v16, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v17, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v18, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v19, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v20, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v21, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v22, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v23, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v24, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v25, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [awqg, java.lang.Object] */
    @Override // defpackage.avni
    public final void a(Object obj) {
        switch (this.$cid) {
            case 0:
                String str = acjr.a;
                this.a.invoke(obj);
                return;
            case 1:
                String str2 = acjr.a;
                this.a.invoke(obj);
                return;
            case 2:
                String str3 = acjr.a;
                this.a.invoke(obj);
                return;
            case 3:
                String str4 = acjr.a;
                this.a.invoke(obj);
                return;
            case 4:
                String str5 = acjr.a;
                this.a.invoke(obj);
                return;
            case 5:
                String str6 = acjr.a;
                this.a.invoke(obj);
                return;
            case 6:
                ((aclz) this.a).l((acsu) obj);
                return;
            case 7:
                acmb acmbVar = (acmb) this.a;
                if (acmbVar.b == null || acmbVar.c == 0) {
                    acmbVar.w();
                    return;
                }
                acmbVar.x();
                acmbVar.d.kk(Duration.ofMillis(acmbVar.a));
                return;
            case 8:
                ((acme) this.a).b = ((Boolean) obj).booleanValue();
                return;
            case 9:
                ((acmg) this.a).b();
                return;
            case 10:
                this.a.invoke(obj);
                return;
            case 11:
                this.a.invoke(obj);
                return;
            case 12:
                this.a.invoke(obj);
                return;
            case 13:
                this.a.invoke(obj);
                return;
            case 14:
                this.a.invoke(obj);
                return;
            case 15:
                this.a.invoke(obj);
                return;
            case 16:
                this.a.invoke(obj);
                return;
            case 17:
                this.a.invoke(obj);
                return;
            case 18:
                this.a.invoke(obj);
                return;
            case 19:
                this.a.invoke(obj);
                return;
            default:
                acvm acvmVar = (acvm) obj;
                acvmVar.getClass();
                int iE = a.E(acvmVar);
                if (iE == 0) {
                    return;
                }
                if (iE == 1) {
                    acmw acmwVar = (acmw) this.a;
                    acmwVar.f = true;
                    acmwVar.a();
                    return;
                }
                if (iE == 2) {
                    return;
                } else if (iE == 3) {
                    return;
                } else {
                    if (iE != 4) {
                        throw new RuntimeException(null, null);
                    }
                    return;
                }
        }
    }
}
