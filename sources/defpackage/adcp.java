package defpackage;

import java.util.BitSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adcp extends fgv {
    final adcr a;
    public final BitSet d;
    private final String[] e;

    public adcp(fhd fhdVar, adcr adcrVar) {
        super(fhdVar, adcrVar);
        this.e = new String[]{"containerProvider", "conversionContext", "dataStore", "enableMergeSuspenseConfigsWhenLoadingSuspenseSpec", "enableSuspenseControllerToManageActiveConfigKey", "enableSuspenseEntityTriggerFallback", "logger", "suspenseController", "suspenseType"};
        BitSet bitSet = new BitSet(9);
        this.d = bitSet;
        this.a = adcrVar;
        bitSet.clear();
    }

    @Override // defpackage.fgv
    public final /* bridge */ /* synthetic */ fgy a() {
        hmy.c(9, this.d, this.e);
        return this.a;
    }
}
