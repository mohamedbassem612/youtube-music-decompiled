package defpackage;

import java.security.spec.ECPoint;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahjx extends ahlo {
    public final ahjv a;
    public final ECPoint b;
    public final ahnf c;
    public final Integer d;

    public ahjx(ahjv ahjvVar, ECPoint eCPoint, ahnf ahnfVar, Integer num) {
        this.a = ahjvVar;
        this.b = eCPoint;
        this.c = ahnfVar;
        this.d = num;
    }

    @Override // defpackage.ahfv
    public final Integer a() {
        return this.d;
    }

    @Override // defpackage.ahlo, defpackage.ahfv
    public final /* synthetic */ afyd b() {
        return this.a;
    }

    @Override // defpackage.ahlo
    public final ahnf c() {
        return this.c;
    }

    @Override // defpackage.ahlo
    public final /* synthetic */ afyd d() {
        return this.a;
    }
}
