package defpackage;

import j$.time.Instant;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vyx extends awpk implements awqk {
    private final /* synthetic */ int $cid;
    /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vyx(aiqj aiqjVar, String str, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = aiqjVar;
        this.c = str;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        int i = this.$cid;
        if (i == 0) {
            vyx vyxVar = new vyx((aiqx) this.b, (String) this.c, awoqVar, 0);
            vyxVar.a = obj;
            return vyxVar;
        }
        if (i != 1) {
            vyx vyxVar2 = new vyx((Map) this.c, (ahgb) this.b, awoqVar, 2);
            vyxVar2.a = obj;
            return vyxVar2;
        }
        vyx vyxVar3 = new vyx((aiqj) this.b, (String) this.c, awoqVar, 1);
        vyxVar3.a = obj;
        return vyxVar3;
    }

    @Override // defpackage.awqk
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return ((vyx) create((vzg) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        if (i != 1) {
            return ((vyx) create((arjw) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        return ((vyx) create((vzf) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v3, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Object, mbc] */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.$cid;
        if (i == 0) {
            atqp.j(obj);
            aihf builder = ((vzg) this.a).toBuilder();
            builder.getClass();
            Object obj2 = this.b;
            obj2.getClass();
            builder.copyOnWrite();
            vzg vzgVar = (vzg) builder.instance;
            vzgVar.c = (aiqx) obj2;
            vzgVar.b |= 1;
            Object obj3 = this.c;
            obj3.getClass();
            builder.copyOnWrite();
            vzg vzgVar2 = (vzg) builder.instance;
            vzgVar2.b |= 2;
            vzgVar2.d = (String) obj3;
            aihn aihnVarBuild = builder.build();
            aihnVarBuild.getClass();
            return (vzg) aihnVarBuild;
        }
        if (i == 1) {
            atqp.j(obj);
            aihf builder2 = ((vzf) this.a).toBuilder();
            builder2.getClass();
            Object obj4 = this.b;
            obj4.getClass();
            builder2.copyOnWrite();
            vzf vzfVar = (vzf) builder2.instance;
            vzfVar.c = (aiqj) obj4;
            vzfVar.b |= 1;
            Object obj5 = this.c;
            obj5.getClass();
            builder2.copyOnWrite();
            vzf vzfVar2 = (vzf) builder2.instance;
            vzfVar2.b |= 2;
            vzfVar2.d = (String) obj5;
            aihn aihnVarBuild2 = builder2.build();
            aihnVarBuild2.getClass();
            return (vzf) aihnVarBuild2;
        }
        atqp.j(obj);
        arjw arjwVar = (arjw) this.a;
        aihf aihfVarCreateBuilder = arjv.a.createBuilder();
        aihfVarCreateBuilder.getClass();
        for (Map.Entry entry : this.c.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            aihf aihfVarCreateBuilder2 = arju.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            arju arjuVar = (arju) aihfVarCreateBuilder2.instance;
            aiie aiieVar = arjuVar.b;
            if (!aiieVar.c()) {
                arjuVar.b = aihn.mutableCopy(aiieVar);
            }
            aifs.addAll(list, arjuVar.b);
            arju arjuVar2 = (arju) aihfVarCreateBuilder2.build();
            str.getClass();
            arjuVar2.getClass();
            aihfVarCreateBuilder.copyOnWrite();
            arjv arjvVar = (arjv) aihfVarCreateBuilder.instance;
            aiip aiipVar = arjvVar.b;
            if (!aiipVar.b) {
                arjvVar.b = aiipVar.a();
            }
            arjvVar.b.put(str, arjuVar2);
        }
        byte[] byteArray = ((arjv) aihfVarCreateBuilder.build()).toByteArray();
        try {
            Object obj6 = this.b;
            auym auymVar = (auym) ((ahgb) obj6).a.io();
            byte[] bytes = a.bR(((affd) ((ahgb) obj6).e).a, "tiktok_account:").getBytes(awtd.a);
            bytes.getClass();
            byte[] bArrD = auymVar.d(byteArray, bytes);
            aihf builder3 = arjwVar.toBuilder();
            Instant instantF = ((ahgb) this.b).d.f();
            instantF.getClass();
            aijp aijpVarAv = ahng.av(instantF);
            aijpVarAv.getClass();
            builder3.copyOnWrite();
            arjw arjwVar2 = (arjw) builder3.instance;
            arjwVar2.c = aijpVarAv;
            arjwVar2.b |= 1;
            aigj aigjVarV = aigj.v(bArrD);
            builder3.copyOnWrite();
            arjw arjwVar3 = (arjw) builder3.instance;
            aigjVarV.getClass();
            arjwVar3.b |= 2;
            arjwVar3.d = aigjVarV;
            aihn aihnVarBuild3 = builder3.build();
            aihnVarBuild3.getClass();
            return aihnVarBuild3;
        } catch (GeneralSecurityException e) {
            throw new IOException("Failed to encrypt preauthentication cookies", e);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vyx(aiqx aiqxVar, String str, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = aiqxVar;
        this.c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vyx(Map map, ahgb ahgbVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = map;
        this.b = ahgbVar;
    }
}
