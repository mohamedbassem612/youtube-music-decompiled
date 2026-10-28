package defpackage;

import android.content.Context;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class roy implements agek {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ roy(Optional optional, String str, boolean z, String str2, int i) {
        this.$cid = i;
        this.c = optional;
        this.d = str;
        this.a = z;
        this.b = str2;
    }

    @Override // defpackage.agek
    public final Object apply(Object obj) {
        int i = this.$cid;
        int i2 = 2;
        if (i != 0) {
            if (i != 1) {
                final String str = this.b;
                final boolean z = this.a;
                Optional optionalK = xsa.k((List) obj, z, str);
                final xsa xsaVar = (xsa) this.d;
                return optionalK.or(new Supplier() { // from class: xry
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return xsa.k(xsaVar.l(false, false), z, str);
                    }
                });
            }
            ohp ohpVar = (ohp) obj;
            Object obj2 = this.c;
            if (this.a) {
                try {
                    ((xxj) ((oih) obj2).e.c()).f(ohpVar);
                } catch (Exception e) {
                    onb.j(e, "%s: Listener onComplete failed for group %s", "MobileDataDownload", ohpVar.c);
                }
                ((ooe) ((agfa) ((zpw) this.d).l).a).h(this.b);
            }
            return ohpVar;
        }
        Stream stream = Collection.EL.stream((List) ((Optional) this.c).get());
        String str2 = this.b;
        boolean z2 = this.a;
        agke agkeVar = (agke) stream.map(new nyw(z2, str2, (Set) obj, i2)).collect(aghu.a);
        aihf aihfVarCreateBuilder = airg.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        airg airgVar = (airg) aihfVarCreateBuilder.instance;
        aiie aiieVar = airgVar.c;
        if (!aiieVar.c()) {
            airgVar.c = aihn.mutableCopy(aiieVar);
        }
        Object obj3 = this.d;
        aifs.addAll(agkeVar, airgVar.c);
        if (!z2) {
            aihf aihfVarCreateBuilder2 = aird.a.createBuilder();
            aihf aihfVarCreateBuilder3 = airc.a.createBuilder();
            alay alayVarD = ackj.d((String) obj3);
            aihfVarCreateBuilder3.copyOnWrite();
            airc aircVar = (airc) aihfVarCreateBuilder3.instance;
            alayVarD.getClass();
            aircVar.c = alayVarD;
            aircVar.b |= 1;
            airc aircVar2 = (airc) aihfVarCreateBuilder3.build();
            aihfVarCreateBuilder2.copyOnWrite();
            aird airdVar = (aird) aihfVarCreateBuilder2.instance;
            aircVar2.getClass();
            airdVar.c = aircVar2;
            airdVar.b |= 1;
            aird airdVar2 = (aird) aihfVarCreateBuilder2.build();
            aihfVarCreateBuilder.copyOnWrite();
            airg airgVar2 = (airg) aihfVarCreateBuilder.instance;
            airdVar2.getClass();
            airgVar2.e = airdVar2;
            airgVar2.b |= 4;
        }
        aihf aihfVarCreateBuilder4 = airj.a.createBuilder();
        aihf aihfVarCreateBuilder5 = airi.a.createBuilder();
        airg airgVar3 = (airg) aihfVarCreateBuilder.build();
        aihfVarCreateBuilder5.copyOnWrite();
        airi airiVar = (airi) aihfVarCreateBuilder5.instance;
        airgVar3.getClass();
        airiVar.c = airgVar3;
        airiVar.b = 63434476;
        airi airiVar2 = (airi) aihfVarCreateBuilder5.build();
        aihfVarCreateBuilder4.copyOnWrite();
        airj airjVar = (airj) aihfVarCreateBuilder4.instance;
        airiVar2.getClass();
        aiie aiieVar2 = airjVar.c;
        if (!aiieVar2.c()) {
            airjVar.c = aihn.mutableCopy(aiieVar2);
        }
        airjVar.c.add(airiVar2);
        if (z2) {
            aihh aihhVar = (aihh) apji.a.createBuilder();
            aihl aihlVar = airp.c;
            aihf aihfVarCreateBuilder6 = airo.a.createBuilder();
            alay alayVarD2 = ackj.d((String) obj3);
            aihfVarCreateBuilder6.copyOnWrite();
            airo airoVar = (airo) aihfVarCreateBuilder6.instance;
            alayVarD2.getClass();
            airoVar.d = alayVarD2;
            airoVar.b |= 4;
            aihhVar.e(aihlVar, (airo) aihfVarCreateBuilder6.build());
            aihfVarCreateBuilder4.copyOnWrite();
            airj airjVar2 = (airj) aihfVarCreateBuilder4.instance;
            apji apjiVar = (apji) aihhVar.build();
            apjiVar.getClass();
            airjVar2.e = apjiVar;
            airjVar2.b |= 1;
        }
        aihf aihfVarCreateBuilder7 = alkz.a.createBuilder();
        aihf aihfVarCreateBuilder8 = alla.a.createBuilder();
        airj airjVar3 = (airj) aihfVarCreateBuilder4.build();
        aihfVarCreateBuilder8.copyOnWrite();
        alla allaVar = (alla) aihfVarCreateBuilder8.instance;
        airjVar3.getClass();
        allaVar.c = airjVar3;
        allaVar.b = 77108254;
        alla allaVar2 = (alla) aihfVarCreateBuilder8.build();
        aihfVarCreateBuilder7.copyOnWrite();
        alkz alkzVar = (alkz) aihfVarCreateBuilder7.instance;
        allaVar2.getClass();
        aiie aiieVar3 = alkzVar.d;
        if (!aiieVar3.c()) {
            alkzVar.d = aihn.mutableCopy(aiieVar3);
        }
        alkzVar.d.add(allaVar2);
        return Optional.of(new ovo((alkz) aihfVarCreateBuilder7.build()));
    }

    public /* synthetic */ roy(xsa xsaVar, boolean z, String str, Context context, int i) {
        this.$cid = i;
        this.d = xsaVar;
        this.a = z;
        this.b = str;
        this.c = context;
    }

    public /* synthetic */ roy(zpw zpwVar, boolean z, oih oihVar, String str, int i) {
        this.$cid = i;
        this.d = zpwVar;
        this.a = z;
        this.c = oihVar;
        this.b = str;
    }
}
