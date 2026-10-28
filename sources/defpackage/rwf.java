package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rwf implements agek {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rwf(Object obj, long j, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = j;
    }

    @Override // defpackage.agek
    public final Object apply(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            smr smrVar = (smr) obj;
            skl sklVar = (skl) smrVar.d(sip.class);
            wjf wjfVar = (wjf) smrVar.d(sid.class);
            String str = (String) smrVar.d(sic.class);
            if (wjfVar.R()) {
                throw new IllegalStateException("Received fulfillment request for offline playback");
            }
            Object obj2 = this.b;
            if (!sklVar.f().isEmpty()) {
                rwh rwhVar = (rwh) obj2;
                return rwhVar.h.c(smrVar.a, sklVar, Optional.empty(), agke.n(rwhVar.b.b(sklVar, sklVar.f(), wjfVar)));
            }
            long j = this.a;
            rwh rwhVar2 = (rwh) obj2;
            axmq axmqVar = new axmq(rwhVar2.d, rwhVar2.e);
            rtl rtlVar = rwhVar2.f;
            byte[] bArr = sklVar.h;
            String strE = sklVar.e();
            long jA = sklVar.a();
            int i2 = sklVar.c;
            rwhVar2.a.a();
            wgk wgkVarA = rtlVar.a(str, bArr, strE, "", -1L, jA, i2, j, axmqVar, false, Optional.empty(), false, null);
            if (wgkVarA == null) {
                return rwhVar2.h.c(smrVar.a, sklVar, Optional.empty(), agpi.a);
            }
            return wgkVarA.h() ? rwhVar2.h.c(smrVar.a, sklVar, Optional.ofNullable(wgkVarA.d()), agke.q(snf.a)) : rwhVar2.h.c(smrVar.a, sklVar, Optional.ofNullable(wgkVarA.d()), agke.n(rwhVar2.b.b(sklVar, wgkVarA.g(), wjfVar)));
        }
        if (i == 1) {
            aihf builder = ((aimg) obj).toBuilder();
            String strO = ((idx) this.b).e.o();
            aihf aihfVarCreateBuilder = aily.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            aily ailyVar = (aily) aihfVarCreateBuilder.instance;
            ailyVar.b |= 1;
            ailyVar.c = this.a;
            builder.ax(strO, (aily) aihfVarCreateBuilder.build());
            return (aimg) builder.build();
        }
        if (i != 2) {
            atpt atptVar = (atpt) obj;
            aihf builder2 = atptVar.toBuilder();
            String str2 = (String) this.b;
            aihf builder3 = abfv.u(atptVar, str2).toBuilder();
            builder3.copyOnWrite();
            atps atpsVar = (atps) builder3.instance;
            atpsVar.b |= 1;
            atpsVar.c = this.a;
            builder2.cP(str2, (atps) builder3.build());
            return (atpt) builder2.build();
        }
        atpt atptVar2 = (atpt) obj;
        aihf builder4 = atptVar2.toBuilder();
        String str3 = (String) this.b;
        aihf builder5 = abfv.u(atptVar2, str3).toBuilder();
        builder5.copyOnWrite();
        atps atpsVar2 = (atps) builder5.instance;
        atpsVar2.b |= 4;
        atpsVar2.e = this.a;
        builder4.cP(str3, (atps) builder5.build());
        return (atpt) builder4.build();
    }
}
