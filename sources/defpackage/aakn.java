package defpackage;

import android.accounts.Account;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class aakn implements ahcy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ aakn(aalp aalpVar, aaqn aaqnVar, agke agkeVar, int i) {
        this.$cid = i;
        this.b = aalpVar;
        this.a = aaqnVar;
        this.c = agkeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, wcn] */
    /* JADX WARN: Type inference failed for: r0v15, types: [aaqn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [abvz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object, wcn] */
    /* JADX WARN: Type inference failed for: r10v34, types: [abvz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [awut, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.ahcy
    public final ListenableFuture a(Object obj) {
        int i = 1;
        byte[] bArr = null;
        int i2 = 0;
        switch (this.$cid) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Object obj2 = this.c;
                ?? r1 = this.b;
                Object obj3 = this.a;
                return zBooleanValue ? ((aako) obj3).b.b(r1, (aofh) obj2) : ((aako) obj3).a.b(r1, (aofh) obj2);
            case 1:
                Optional optional = (Optional) obj;
                if (!optional.isPresent()) {
                    aagy aagyVar = (aagy) this.a;
                    if (aagyVar.f.l(142, 45632208L, false)) {
                        return aagyVar.g(this.b, (String) this.c);
                    }
                }
                return ahng.n(optional);
            case 2:
                agke agkeVar = (agke) obj;
                vre vreVar = new vre(agke.n(this.c), 12);
                aalp aalpVar = (aalp) this.a;
                Optional optional2 = aalpVar.f;
                optional2.isPresent();
                ListenableFuture listenableFuture = (ListenableFuture) Optional.ofNullable(((ahgb) optional2.get()).ae(vreVar.a)).orElse(ahng.n(agpn.b));
                int i3 = 18;
                aagw aagwVar = new aagw(agkeVar, i3);
                Executor executor = aalpVar.b;
                return ahno.av(ahno.ar(listenableFuture, aagwVar, executor), ahno.ar(aalp.b(this.b, 461, ardd.class), new aagw(agkeVar, 13), executor)).k(new wko(agkeVar, i3), executor);
            case 3:
                final ?? r11 = this.c;
                return r11.isEmpty() ? ahng.n(agpn.b) : ahno.ar(aalp.b(this.b, 120, aqph.class), new agek() { // from class: aalo
                    /* JADX WARN: Code duplicated, block: B:21:0x009f  */
                    @Override // defpackage.agek
                    public final Object apply(Object obj4) {
                        agkj agkjVar = (agkj) obj4;
                        for (aihf aihfVar : r11) {
                            aqph aqphVar = (aqph) agkjVar.get(((aoei) aihfVar.instance).c);
                            if (aqphVar != null) {
                                String cotn = aqphVar.getCotn();
                                aihfVar.copyOnWrite();
                                aoei aoeiVar = (aoei) aihfVar.instance;
                                cotn.getClass();
                                aoeiVar.b |= 524288;
                                aoeiVar.s = cotn;
                                long jLongValue = aqphVar.getLastProgressTimeMs().longValue();
                                aihfVar.copyOnWrite();
                                aoei aoeiVar2 = (aoei) aihfVar.instance;
                                aoeiVar2.b |= 4194304;
                                aoeiVar2.v = jLongValue;
                                int iOrdinal = aqphVar.getTransferState().ordinal();
                                if (iOrdinal == 1) {
                                    aihfVar.copyOnWrite();
                                    aoei aoeiVar3 = (aoei) aihfVar.instance;
                                    aoeiVar3.d = 9;
                                    aoeiVar3.b |= 2;
                                    agkz agkzVarN = agkz.n(aqphVar.getTransferStatusReason());
                                    int i4 = true != agkzVarN.contains(aqpd.TRANSFER_STATUS_REASON_PENDING_WIFI) ? 0 : 2;
                                    if (agkzVarN.contains(aqpd.TRANSFER_STATUS_REASON_PENDING_NETWORK)) {
                                        i4 |= 8;
                                    }
                                    if (agkzVarN.contains(aqpd.TRANSFER_STATUS_REASON_PENDING_MEDIA)) {
                                        i4 |= 16;
                                    }
                                    if (agkzVarN.contains(aqpd.TRANSFER_STATUS_REASON_PENDING_USER_PAUSED)) {
                                        i4 |= 64;
                                    }
                                    if (agkzVarN.contains(aqpd.TRANSFER_STATUS_REASON_PENDING_STORAGE)) {
                                        i4 |= SemanticState.Hidden;
                                    }
                                    aihfVar.copyOnWrite();
                                    aoei aoeiVar4 = (aoei) aihfVar.instance;
                                    aoeiVar4.b |= 4;
                                    aoeiVar4.e = i4;
                                } else if (iOrdinal == 3) {
                                    aihfVar.copyOnWrite();
                                    aoei aoeiVar5 = (aoei) aihfVar.instance;
                                    aoeiVar5.d = 2;
                                    aoeiVar5.b |= 2;
                                } else if (iOrdinal == 4) {
                                    aihfVar.copyOnWrite();
                                    aoei aoeiVar6 = (aoei) aihfVar.instance;
                                    aoeiVar6.d = 3;
                                    aoeiVar6.b |= 2;
                                } else if (iOrdinal == 5) {
                                    aihfVar.copyOnWrite();
                                    aoei aoeiVar7 = (aoei) aihfVar.instance;
                                    aoeiVar7.d = 5;
                                    aoeiVar7.b |= 2;
                                } else if (iOrdinal == 6) {
                                    aihfVar.copyOnWrite();
                                    aoei aoeiVar8 = (aoei) aihfVar.instance;
                                    aoeiVar8.d = 1;
                                    aoeiVar8.b |= 2;
                                } else if (iOrdinal == 7) {
                                    aihfVar.copyOnWrite();
                                    aoei aoeiVar9 = (aoei) aihfVar.instance;
                                    aoeiVar9.d = 2;
                                    aoeiVar9.b |= 2;
                                }
                                int iOrdinal2 = aqphVar.getFailureReason().ordinal();
                                if (iOrdinal2 != 0) {
                                    if (iOrdinal2 == 1 || iOrdinal2 == 2) {
                                        aihfVar.copyOnWrite();
                                        aoei aoeiVar10 = (aoei) aihfVar.instance;
                                        aoeiVar10.d = 13;
                                        aoeiVar10.b |= 2;
                                    } else if (iOrdinal2 == 9 || iOrdinal2 == 11) {
                                        aihfVar.copyOnWrite();
                                        aoei aoeiVar11 = (aoei) aihfVar.instance;
                                        aoeiVar11.d = 14;
                                        aoeiVar11.b |= 2;
                                    } else {
                                        aihfVar.copyOnWrite();
                                        aoei aoeiVar12 = (aoei) aihfVar.instance;
                                        aoeiVar12.d = 5;
                                        aoeiVar12.b |= 2;
                                    }
                                }
                                aoeh aoehVar = ((aoei) aihfVar.instance).u;
                                if (aoehVar == null) {
                                    aoehVar = aoeh.a;
                                }
                                aihf builder = aoehVar.toBuilder();
                                builder.copyOnWrite();
                                aoeh aoehVar2 = (aoeh) builder.instance;
                                aoehVar2.b |= 16;
                                aoehVar2.f = true;
                                int size = aqphVar.h().size();
                                builder.copyOnWrite();
                                aoeh aoehVar3 = (aoeh) builder.instance;
                                aoehVar3.b |= SemanticState.Hidden;
                                aoehVar3.h = size;
                                aihfVar.copyOnWrite();
                                aoei aoeiVar13 = (aoei) aihfVar.instance;
                                aoeh aoehVar4 = (aoeh) builder.build();
                                aoehVar4.getClass();
                                aoeiVar13.u = aoehVar4;
                                aoeiVar13.b |= 2097152;
                            }
                        }
                        return agkjVar;
                    }
                }, ((aalp) this.a).b);
            case 4:
                this.a.b();
                HashSet hashSet = new HashSet();
                Object obj4 = this.b;
                aalp aalpVar2 = (aalp) obj4;
                Optional optional3 = aalpVar2.g;
                optional3.isPresent();
                ListenableFuture listenableFuture2 = (ListenableFuture) optional3.orElse(ahng.n(agpi.a));
                aaat aaatVar = new aaat(this.c, hashSet, 10, bArr);
                Executor executor2 = aalpVar2.b;
                return ahno.ar(ahno.as(ahno.ar(listenableFuture2, aaatVar, executor2), new aaoq(obj4, hashSet, i, bArr), executor2), new aagw((aihf) obj, 17), executor2);
            case 5:
                return !((abwf) this.a).o((abug) this.b) ? ahng.l() : ahng.n(this.c);
            case 6:
                abng abngVar = (abng) obj;
                return abngVar != null ? ((abwf) this.c).h(this.a, (abug) this.b, abngVar) : ahng.l();
            case 7:
                Object obj5 = this.c;
                abng abngVar2 = (abng) obj;
                abug abugVar = (abug) this.b;
                abwf abwfVar = (abwf) obj5;
                return abwfVar.o(abugVar) ? abwfVar.h(this.a, abugVar, abngVar2) : ahng.n(abngVar2.a);
            case 8:
                Account account = (Account) obj;
                Object obj6 = this.c;
                Object obj7 = this.b;
                aegn aegnVar = (aegn) this.a;
                return ahno.ap(afwl.j(new aejk(aegnVar, (aegg) obj7, account, (agkz) obj6, 1)), aegnVar.j.m(7, 45798903L) ? aegnVar.e : aegnVar.d);
            default:
                aegn aegnVar2 = (aegn) this.a;
                axlj axljVar = (axlj) aegnVar2.f.io();
                return ahno.ar(awrc.ag(axljVar.c, awov.a, new adpb(axljVar, (dvo) this.b, (awoq) null, 6)), new aegm(aegnVar2, (Account) obj, (agkz) this.c, i2), aegnVar2.j.m(7, 45798903L) ? aegnVar2.e : aegnVar2.d);
        }
    }

    public /* synthetic */ aakn(abwf abwfVar, abug abugVar, abvz abvzVar, int i) {
        this.$cid = i;
        this.c = abwfVar;
        this.b = abugVar;
        this.a = abvzVar;
    }

    public /* synthetic */ aakn(Object obj, Object obj2, Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }
}
