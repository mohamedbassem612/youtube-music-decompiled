package defpackage;

import com.google.android.libraries.blocks.Container;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class gmh extends awpk implements awqk {
    private final /* synthetic */ int $cid;
    /* synthetic */ Object a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmh(awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        int i = this.$cid;
        if (i == 0) {
            gmh gmhVar = new gmh(awoqVar, 0);
            gmhVar.a = obj;
            return gmhVar;
        }
        if (i == 1) {
            gmh gmhVar2 = new gmh(awoqVar, 1, (byte[]) null);
            gmhVar2.a = obj;
            return gmhVar2;
        }
        if (i == 2) {
            gmh gmhVar3 = new gmh(awoqVar, 2, (char[]) null);
            gmhVar3.a = obj;
            return gmhVar3;
        }
        if (i != 3) {
            gmh gmhVar4 = new gmh(awoqVar, 4, (int[]) null);
            gmhVar4.a = obj;
            return gmhVar4;
        }
        gmh gmhVar5 = new gmh(awoqVar, 3, (short[]) null);
        gmhVar5.a = obj;
        return gmhVar5;
    }

    @Override // defpackage.awqk
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return ((gmh) create((Container) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        if (i == 1) {
            return ((gmh) create((Container) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        if (i == 2) {
            return ((gmh) create((pym) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        if (i != 3) {
            return ((gmh) create((axan) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        return ((gmh) create((arjw) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.$cid;
        if (i == 0) {
            atqp.j(obj);
            return ((Container) this.a).a(new afyq(9));
        }
        if (i == 1) {
            atqp.j(obj);
            return ((Container) this.a).a(new afyq(8));
        }
        if (i == 2) {
            atqp.j(obj);
            aihf builder = ((pym) this.a).toBuilder();
            builder.getClass();
            String string = UUID.randomUUID().toString();
            string.getClass();
            qnl.I(string, builder);
            return qnl.H(builder);
        }
        if (i != 3) {
            atqp.j(obj);
            return Boolean.valueOf(((axan) this.a) != axan.a);
        }
        atqp.j(obj);
        aihf builder2 = ((arjw) this.a).toBuilder();
        builder2.copyOnWrite();
        arjw arjwVar = (arjw) builder2.instance;
        arjwVar.b &= -3;
        arjwVar.d = arjw.a.d;
        builder2.copyOnWrite();
        arjw arjwVar2 = (arjw) builder2.instance;
        arjwVar2.c = null;
        arjwVar2.b &= -2;
        aihn aihnVarBuild = builder2.build();
        aihnVarBuild.getClass();
        return aihnVarBuild;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmh(awoq awoqVar, int i, byte[] bArr) {
        super(2, awoqVar);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmh(awoq awoqVar, int i, char[] cArr) {
        super(2, awoqVar);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmh(awoq awoqVar, int i, int[] iArr) {
        super(2, awoqVar);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmh(awoq awoqVar, int i, short[] sArr) {
        super(2, awoqVar);
        this.$cid = i;
    }
}
