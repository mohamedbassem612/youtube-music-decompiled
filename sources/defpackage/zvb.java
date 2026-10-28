package defpackage;

import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zvb {
    public static final zup a;
    private static final agke c;
    public final int[] b;
    private final int[] d;
    private final zup[] e;

    static {
        int i = zup.g;
        axng axngVar = new axng(null);
        aihf aihfVarCreateBuilder = akwf.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        akwf akwfVar = (akwf) aihfVarCreateBuilder.instance;
        akwfVar.b |= 2;
        akwfVar.d = true;
        akku akkuVar = akku.DELAYED_EVENT_TIER_DEFAULT;
        aihfVarCreateBuilder.copyOnWrite();
        akwf akwfVar2 = (akwf) aihfVarCreateBuilder.instance;
        akwfVar2.f = akkuVar.f;
        akwfVar2.b |= 8;
        axngVar.b((akwf) aihfVarCreateBuilder.build(), 3, 30000);
        zup zupVarA = axngVar.a();
        a = zupVarA;
        c = agke.t(f(0, 0), f(1, 30000), f(2, 30000), zupVarA);
    }

    public zvb(zrs zrsVar) {
        int i = 0;
        akkn[] akknVarArr = {zrsVar.g(), zrsVar.f(), zrsVar.e(), zrsVar.d()};
        this.d = new int[4];
        this.b = new int[4];
        this.e = new zup[4];
        aihf aihfVarCreateBuilder = akwf.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        akwf akwfVar = (akwf) aihfVarCreateBuilder.instance;
        akwfVar.b |= 2;
        akwfVar.d = true;
        akwf akwfVar2 = (akwf) aihfVarCreateBuilder.build();
        int i2 = 0;
        for (int i3 = 4; i < i3; i3 = 4) {
            akkn akknVar = akknVarArr[i];
            int iAS = a.aS(akknVar.e);
            if (iAS == 0 || iAS != 3) {
                int i4 = akknVar.b;
            }
            int iMax = (int) Math.max(0L, Math.min(Duration.ofSeconds(akknVar.c).toMillis(), 43200000L));
            this.d[i2] = iMax;
            akkn[] akknVarArr2 = akknVarArr;
            this.b[i2] = (int) Math.max(0L, Math.min(Duration.ofSeconds(akknVar.d).toMillis(), 43200000L));
            zup[] zupVarArr = this.e;
            int i5 = zup.g;
            axng axngVar = new axng(null);
            axngVar.b(akwfVar2, i2, iMax);
            zupVarArr[i2] = axngVar.a();
            i2++;
            i++;
            akknVarArr = akknVarArr2;
        }
    }

    public static int a(akku akkuVar) {
        int iOrdinal = akkuVar.ordinal();
        if (iOrdinal == 2) {
            return 2;
        }
        if (iOrdinal != 3) {
            return iOrdinal == 4 ? 0 : 3;
        }
        return 1;
    }

    public static zup d(int i, boolean z) {
        return z ? (zup) c.get(i) : a;
    }

    public static akku e(int i) {
        if (i == 0) {
            return akku.DELAYED_EVENT_TIER_IMMEDIATE;
        }
        if (i != 1) {
            return i != 2 ? akku.DELAYED_EVENT_TIER_DEFAULT : akku.DELAYED_EVENT_TIER_DISPATCH_TO_EMPTY;
        }
        return akku.DELAYED_EVENT_TIER_FAST;
    }

    private static zup f(int i, int i2) {
        int i3 = zup.g;
        axng axngVar = new axng(null);
        aihf aihfVarCreateBuilder = akwf.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        akwf akwfVar = (akwf) aihfVarCreateBuilder.instance;
        akwfVar.b |= 2;
        akwfVar.d = true;
        akku akkuVarE = e(i);
        aihfVarCreateBuilder.copyOnWrite();
        akwf akwfVar2 = (akwf) aihfVarCreateBuilder.instance;
        akwfVar2.f = akkuVarE.f;
        akwfVar2.b |= 8;
        axngVar.b((akwf) aihfVarCreateBuilder.build(), i, i2);
        return axngVar.a();
    }

    public final int b(int i) {
        return this.d[i];
    }

    final zup c(int i) {
        return this.e[i];
    }
}
