package defpackage;

import com.google.protobuf.MessageLite;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qap implements per {
    private static final agsn a = agsn.h("GnpSdk");
    private final pve b;

    public qap(pve pveVar) {
        pveVar.getClass();
        this.b = pveVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.per
    public final Object a(plx plxVar, MessageLite messageLite, MessageLite messageLite2, awoq awoqVar) throws Throwable {
        qao qaoVar;
        if (awoqVar instanceof qao) {
            qaoVar = (qao) awoqVar;
            int i = qaoVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qaoVar.c = i - Integer.MIN_VALUE;
            } else {
                qaoVar = new qao(this, awoqVar);
            }
        } else {
            qaoVar = new qao(this, awoqVar);
        }
        Object objE = qaoVar.a;
        awox awoxVar = awox.a;
        int i2 = qaoVar.c;
        if (i2 == 0) {
            atqp.j(objE);
            if (plxVar != null) {
                nxp.a(plxVar.b);
                plw plwVar = new plw(plxVar);
                plwVar.i(4);
                plwVar.d(0L);
                plwVar.h(0L);
                plwVar.g(0);
                plx plxVarA = plwVar.a();
                pve pveVar = this.b;
                List listH = atqq.H(plxVarA);
                qaoVar.c = 1;
                objE = pveVar.e(listH, qaoVar);
                if (objE == awoxVar) {
                    return awoxVar;
                }
            }
            return awmy.a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        atqp.j(objE);
        pky pkyVar = (pky) objE;
        if (pkyVar instanceof pku) {
            ((agsj) ((agsj) a.c()).j(((pku) pkyVar).b())).t("Failed updating accounts in storage");
        }
        return awmy.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.per
    public final Object b(plx plxVar, MessageLite messageLite, awoq awoqVar) throws Throwable {
        qan qanVar;
        if (awoqVar instanceof qan) {
            qanVar = (qan) awoqVar;
            int i = qanVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qanVar.c = i - Integer.MIN_VALUE;
            } else {
                qanVar = new qan(this, awoqVar);
            }
        } else {
            qanVar = new qan(this, awoqVar);
        }
        Object objE = qanVar.a;
        awox awoxVar = awox.a;
        int i2 = qanVar.c;
        if (i2 == 0) {
            atqp.j(objE);
            if (plxVar != null) {
                nxp.a(plxVar.b);
                plw plwVar = new plw(plxVar);
                plwVar.i(6);
                plx plxVarA = plwVar.a();
                pve pveVar = this.b;
                List listH = atqq.H(plxVarA);
                qanVar.c = 1;
                objE = pveVar.e(listH, qanVar);
                if (objE == awoxVar) {
                    return awoxVar;
                }
            }
            return awmy.a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        atqp.j(objE);
        pky pkyVar = (pky) objE;
        if (pkyVar instanceof pku) {
            ((agsj) ((agsj) a.c()).j(((pku) pkyVar).b())).t("Failed updating accounts in storage");
        }
        return awmy.a;
    }
}
