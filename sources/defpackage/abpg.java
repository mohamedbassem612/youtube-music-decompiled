package defpackage;

import com.google.protobuf.MessageLite;
import j$.time.Instant;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abpg extends abqh {
    private final mbc d;
    private final abpd e;
    private final abrg f;
    private final Set g;
    private final Set h;
    private final abnl i;
    private final abnp j;
    private final String k;
    private final int l;
    private final long m;
    private final vxz n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abpg(mbc mbcVar, abpd abpdVar, abrg abrgVar, Set set, Set set2, vxz vxzVar, abnl abnlVar, abnp abnpVar, String str) {
        super(abpe.a, new agqj(aqdr.STREAMING_WATCH_RESPONSE_TYPE_PLAYER_RESPONSE), new wna(2));
        mbcVar.getClass();
        abpdVar.getClass();
        abrgVar.getClass();
        set.getClass();
        set2.getClass();
        vxzVar.getClass();
        abnlVar.getClass();
        abnpVar.getClass();
        this.d = mbcVar;
        this.e = abpdVar;
        this.f = abrgVar;
        this.g = set;
        this.h = set2;
        this.n = vxzVar;
        this.i = abnlVar;
        this.j = abnpVar;
        this.k = str;
        this.l = -1;
        this.m = mbcVar.b();
    }

    @Override // defpackage.abqh
    public final /* synthetic */ wlu a() {
        abri abriVarC = this.f.c(this.i, this.l, null, this.g, this.j.b, this.k);
        abriVarC.S = true;
        return abriVarC;
    }

    @Override // defpackage.abqh
    public final alyi b(tmv tmvVar, MessageLite messageLite) {
        if (!awrc.c(tmvVar.Y(), Y()) || !(messageLite instanceof alvt)) {
            return null;
        }
        aihh aihhVar = (aihh) alyi.a.createBuilder();
        aihhVar.getClass();
        aihhVar.copyOnWrite();
        alyi alyiVar = (alyi) aihhVar.instance;
        alyiVar.d = (alvt) messageLite;
        alyiVar.c = 2;
        afyd.G(aqdr.STREAMING_WATCH_RESPONSE_TYPE_PLAYER_RESPONSE, aihhVar);
        afyd.H(aihhVar);
        return afyd.F(aihhVar);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0046  */
    @Override // defpackage.abqh
    public final /* synthetic */ Object e(tnw tnwVar) {
        wja wjaVarA;
        Instant instantF;
        alvt alvtVar = (alvt) tnwVar.a;
        if (alvtVar == null) {
            alvtVar = alvt.a;
            alvtVar.getClass();
        }
        if ((alvtVar.b & 16) != 0) {
            wiy wiyVar = new wiy(alvtVar);
            wiyVar.b(this.m);
            wiyVar.c(this.n);
            wjaVarA = wiyVar.a();
        } else {
            wjaVarA = null;
        }
        wjg wjgVar = new wjg();
        wjgVar.b = alvtVar;
        tmt tmtVar = tnwVar.b;
        if (tmtVar != null) {
            Instant instantOfEpochMilli = Instant.ofEpochMilli(tmtVar.g);
            alop alopVar = alvtVar.d;
            if (alopVar == null) {
                alopVar = alop.a;
            }
            instantF = instantOfEpochMilli.minusSeconds(alopVar.e);
            if (instantF == null) {
                instantF = this.d.f();
            }
        } else {
            instantF = this.d.f();
        }
        wjgVar.c = instantF;
        wjgVar.b(this.m);
        if (wjaVarA != null) {
            wjgVar.g = wjaVarA;
        }
        wjgVar.e = tnwVar.c;
        wjgVar.a = tnwVar.d;
        wji wjiVarA = wjgVar.a();
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((wjw) it.next()).a(wjiVarA);
        }
        wjf wjfVarA = this.e.a(wjiVarA.G(), wjiVarA);
        wjfVarA.getClass();
        return wjfVarA;
    }

    @Override // defpackage.abqh
    public final /* bridge */ /* synthetic */ Object f(MessageLite messageLite) {
        wja wjaVarA;
        alvt alvtVar = (alvt) messageLite;
        if ((alvtVar.b & 16) != 0) {
            wiy wiyVar = new wiy(alvtVar);
            wiyVar.b(this.m);
            wiyVar.c(this.n);
            wjaVarA = wiyVar.a();
        } else {
            wjaVarA = null;
        }
        wjg wjgVar = new wjg();
        wjgVar.b = alvtVar;
        wjgVar.c = this.d.f();
        wjgVar.b(this.m);
        if (wjaVarA != null) {
            wjgVar.g = wjaVarA;
        }
        wji wjiVarA = wjgVar.a();
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((wjw) it.next()).a(wjiVarA);
        }
        wjf wjfVarA = this.e.a(wjiVarA.G(), wjiVarA);
        wjfVarA.getClass();
        return wjfVarA;
    }

    @Override // defpackage.abqh
    public final void g(aihf aihfVar) {
        aihfVar.getClass();
        ((abri) h()).I(aihfVar);
    }
}
