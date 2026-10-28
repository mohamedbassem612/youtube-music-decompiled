package defpackage;

import com.google.protobuf.MessageLite;
import java.util.BitSet;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class adcs implements mlc {
    public final /* synthetic */ nuc a;
    public final /* synthetic */ aunn b;
    public final /* synthetic */ awmd c;
    public final /* synthetic */ nsr d;
    public final /* synthetic */ awmd e;

    public /* synthetic */ adcs(nuc nucVar, aunn aunnVar, awmd awmdVar, nsr nsrVar, awmd awmdVar2) {
        this.a = nucVar;
        this.b = aunnVar;
        this.c = awmdVar;
        this.d = nsrVar;
        this.e = awmdVar2;
    }

    @Override // defpackage.mlc
    public final fgv a(fhd fhdVar, nsl nslVar, MessageLite messageLite, String str, List list) {
        axlj axljVar = (axlj) this.b.io();
        vxz vxzVar = (vxz) this.e.io();
        adcp adcpVar = new adcp(fhdVar, new adcr());
        adcr adcrVar = adcpVar.a;
        adcrVar.q = (assm) messageLite;
        BitSet bitSet = adcpVar.d;
        bitSet.set(8);
        adcrVar.b = nslVar;
        bitSet.set(1);
        adcrVar.g = this.a;
        bitSet.set(6);
        adcrVar.r = axljVar;
        bitSet.set(7);
        adcrVar.a = this.c;
        bitSet.set(0);
        adcrVar.e = vxzVar.l(61, 45784676L, false);
        bitSet.set(4);
        adcrVar.d = vxzVar.l(66, 45791968L, false);
        bitSet.set(3);
        adcrVar.f = vxzVar.l(111, 45845183L, false);
        bitSet.set(5);
        adcrVar.c = this.d;
        bitSet.set(2);
        return adcpVar;
    }
}
