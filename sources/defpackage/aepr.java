package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aepr implements qjo {
    public final tbt a;
    public final aetb b;
    public final awli c = new awli();

    public aepr(tbt tbtVar, aetb aetbVar) {
        this.a = tbtVar;
        this.b = aetbVar;
    }

    @Override // defpackage.qjo
    public final ListenableFuture a(axhz axhzVar) {
        aqii aqiiVarA;
        String str = axhzVar.d;
        String str2 = null;
        if (str != null) {
            aqiiVarA = null;
            for (String str3 : str.split(",")) {
                if (str3.length() > 0) {
                    String[] strArrSplit = str3.split(":");
                    if (strArrSplit.length != 2) {
                        throw new IllegalArgumentException(a.bU((byte) 39, str3, "Expected a colon-separated key-value pair when parsing '"));
                    }
                    String str4 = strArrSplit[0];
                    if ("pcen".equals(str4)) {
                        str2 = strArrSplit[1];
                    } else if ("tag".equals(str4)) {
                        aqiiVarA = aqii.a(Integer.parseInt(strArrSplit[1]));
                    }
                }
            }
        } else {
            aqiiVarA = null;
        }
        aesz aeszVar = new aesz(str2, aqiiVarA);
        String str5 = aeszVar.a;
        aihf builder = axhzVar.toBuilder();
        if (str5 != null) {
            builder.copyOnWrite();
            axhz axhzVar2 = (axhz) builder.instance;
            axhzVar2.b |= 2;
            axhzVar2.d = str5;
        } else {
            builder.copyOnWrite();
            axhz axhzVar3 = (axhz) builder.instance;
            axhzVar3.b &= -3;
            axhzVar3.d = axhz.a.d;
        }
        return new aepq(this, aeszVar).a((axhz) builder.build());
    }

    @Override // defpackage.qjo
    public final /* synthetic */ void b() {
    }
}
