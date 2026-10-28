package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hsh implements agek {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ String a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ hsh(acqf acqfVar, ListenableFuture listenableFuture, abnl abnlVar, abnp abnpVar, String str, agek agekVar, int i) {
        this.$cid = i;
        this.c = acqfVar;
        this.e = listenableFuture;
        this.b = abnlVar;
        this.d = abnpVar;
        this.a = str;
        this.f = agekVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [aaqn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r11v47, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11, types: [agek, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [aaqn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [aaqn, java.lang.Object] */
    @Override // defpackage.agek
    public final Object apply(Object obj) {
        aofe aofeVar;
        aams aamsVar;
        int i = this.$cid;
        if (i != 0) {
            if (i != 1) {
                ?? r5 = this.f;
                String str = this.a;
                Object obj2 = this.d;
                Object obj3 = this.b;
                acqf acqfVar = (acqf) this.c;
                return ahcs.f(this.e, afwl.d(new okm(acqfVar, (abnl) obj3, (abnp) obj2, str, (agek) r5, 6)), acqfVar.d);
            }
            Object obj4 = this.b;
            Optional optionalOfNullable = (Optional) obj;
            hsj hsjVar = (hsj) obj4;
            urj urjVar = new urj(hsjVar, this.a, (anyr) this.f, (aofh) this.e, (aaqn) this.c, (aaew) this.d, 1);
            if (true == optionalOfNullable.isPresent()) {
                Object obj5 = optionalOfNullable.get();
                Object obj6 = urjVar.c;
                Object obj7 = urjVar.f;
                aihn aihnVar = urjVar.d;
                Object obj8 = urjVar.e;
                ?? r9 = urjVar.a;
                Object obj9 = urjVar.b;
                aamo aamoVar = (aamo) obj5;
                aofg aofgVar = ((aofh) obj8).e;
                if (aofgVar == null) {
                    aofgVar = aofg.b;
                }
                aofa aofaVar = aofgVar.g;
                if (aofaVar == null) {
                    aofaVar = aofa.a;
                }
                optionalOfNullable = Optional.ofNullable(((hsj) obj6).d((String) obj7, aamoVar, (anyr) aihnVar, aofaVar, r9, (aaew) obj9));
            }
            aano aanoVar = new aano(aanp.c);
            aanoVar.d = 4;
            return (aanp) optionalOfNullable.orElse(aanoVar.a());
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ?? r0 = this.f;
        Object obj10 = this.e;
        Object obj11 = this.d;
        Object obj12 = this.c;
        if (zBooleanValue) {
            aamt aamtVar = (aamt) obj12;
            if (!aamtVar.h() || aamtVar.o() || (((aamsVar = aamtVar.m) != null && !aamsVar.f()) || aamtVar.n == aamg.CANNOT_OFFLINE || aamtVar.i())) {
                String str2 = (String) obj10;
                if (((aaex) obj11).aj(str2) == null) {
                    return Optional.empty();
                }
                r0.k().c(str2);
                aaew aaewVar = (aaew) obj11;
                aaewVar.S(str2, aamg.ACTIVE);
                aaewVar.q(str2);
                r0.l().p(str2, true);
                return Optional.of(aamtVar.a);
            }
        }
        String str3 = this.a;
        Object obj13 = this.b;
        aamt aamtVar2 = (aamt) obj12;
        aamo aamoVar2 = aamtVar2.a;
        if ((!Objects.equals(str3, "PPSV") && !Objects.equals(str3, "PPSE")) || ((hsj) obj13).k.i(aamoVar2) != aogf.OFFLINE_REQUEST_SOURCE_AUTO_OFFLINE) {
            if (aamtVar2.e) {
                return Optional.of(aamoVar2);
            }
            String str4 = (String) obj10;
            if (((aaew) obj11).L(str4)) {
                r0.l().p(str4, false);
                return Optional.of(aamoVar2);
            }
            ((hsj) obj13).e.e(new aahx(str4, 2));
            return Optional.empty();
        }
        aofe aofeVarH = hfn.h(aamoVar2);
        if (aofeVarH == null) {
            aofeVar = aofe.a;
        } else {
            aihf builder = aofeVarH.toBuilder();
            builder.copyOnWrite();
            aofe aofeVar2 = (aofe) builder.instance;
            aofeVar2.b &= -1025;
            aofeVar2.k = 0;
            aofeVar = (aofe) builder.build();
        }
        aihf builder2 = ((aihn) aamoVar2.e).toBuilder();
        builder2.copyOnWrite();
        ((aohb) builder2.instance).p = aohb.emptyProtobufList();
        aihf aihfVarCreateBuilder = aoha.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aoha aohaVar = (aoha) aihfVarCreateBuilder.instance;
        aofeVar.getClass();
        aohaVar.c = aofeVar;
        aohaVar.b |= 1;
        builder2.bY((aoha) aihfVarCreateBuilder.build());
        ((aaew) obj11).G(aamo.b((aohb) builder2.build()));
        r0.l().p((String) obj10, false);
        return Optional.of(aamoVar2);
    }

    public /* synthetic */ hsh(hsj hsjVar, aamt aamtVar, aaew aaewVar, String str, aaqn aaqnVar, String str2, int i) {
        this.$cid = i;
        this.b = hsjVar;
        this.c = aamtVar;
        this.d = aaewVar;
        this.e = str;
        this.f = aaqnVar;
        this.a = str2;
    }

    public /* synthetic */ hsh(hsj hsjVar, String str, anyr anyrVar, aofh aofhVar, aaqn aaqnVar, aaew aaewVar, int i) {
        this.$cid = i;
        this.b = hsjVar;
        this.a = str;
        this.f = anyrVar;
        this.e = aofhVar;
        this.c = aaqnVar;
        this.d = aaewVar;
    }
}
