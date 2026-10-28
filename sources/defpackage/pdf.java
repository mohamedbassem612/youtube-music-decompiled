package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pdf implements pdd {
    private static final agsn a = agsn.h("GnpSdk");
    private final pfk b;
    private final pve c;
    private final pcy d;
    private final mbc e;

    public pdf(pfk pfkVar, pve pveVar, pcy pcyVar, mbc mbcVar) {
        pfkVar.getClass();
        pveVar.getClass();
        pcyVar.getClass();
        mbcVar.getClass();
        this.b = pfkVar;
        this.c = pveVar;
        this.d = pcyVar;
        this.e = mbcVar;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // defpackage.pdd
    public final Object a(pxk pxkVar, int i, long j, boolean z, boolean z2, boolean z3, awoq awoqVar) throws Throwable {
        pde pdeVar;
        boolean z4;
        boolean z5;
        plx plxVar;
        int i2;
        boolean z6;
        long j2;
        boolean z7;
        ArrayList arrayList;
        Iterator it;
        pax paxVar;
        pcy pcyVar;
        plb plbVarC;
        aiec aiecVar;
        if (awoqVar instanceof pde) {
            pdeVar = (pde) awoqVar;
            int i3 = pdeVar.h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pdeVar.h = i3 - Integer.MIN_VALUE;
            } else {
                pdeVar = new pde(this, awoqVar);
            }
        } else {
            pdeVar = new pde(this, awoqVar);
        }
        pde pdeVar2 = pdeVar;
        Object objB = pdeVar2.f;
        awox awoxVar = awox.a;
        int i4 = pdeVar2.h;
        if (i4 != 0) {
            if (i4 == 1) {
                boolean z8 = pdeVar2.e;
                z7 = pdeVar2.d;
                z6 = pdeVar2.c;
                j2 = pdeVar2.b;
                i2 = pdeVar2.a;
                atqp.j(objB);
                z4 = z8;
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                atqp.j(objB);
            }
            return new pla(awmy.a);
        }
        atqp.j(objB);
        if (pxkVar != null) {
            pve pveVar = this.c;
            pdeVar2.a = i;
            pdeVar2.b = j;
            pdeVar2.c = z;
            pdeVar2.d = z2;
            z4 = z3;
            pdeVar2.e = z4;
            pdeVar2.h = 1;
            objB = pveVar.b(pxkVar, pdeVar2);
            if (objB == awoxVar) {
                return awoxVar;
            }
            i2 = i;
            z6 = z;
            z7 = z2;
            j2 = j;
        } else {
            z4 = z3;
            z5 = z2;
            plxVar = null;
            i2 = i;
            z6 = z;
            j2 = j;
        }
        List listB = this.b.b(plxVar, i2);
        arrayList = new ArrayList();
        it = listB.iterator();
        while (it.hasNext()) {
            try {
                aiecVar = (aiec) aihn.parseFrom(aiec.a, ((pfj) it.next()).c);
            } catch (aiik e) {
                ((agsj) ((agsj) a.b()).j(e)).t("Unable to parse FrontendNotificationThread message");
                aiecVar = null;
            }
            if (aiecVar != null) {
                arrayList.add(aiecVar);
            }
        }
        this.b.d(plxVar, listB);
        paxVar = new pax(new Long(j2), new Long(this.e.b()), 3);
        pcyVar = this.d;
        plbVarC = plb.c();
        pdeVar2.h = 2;
        if (pcy.b(pcyVar, plxVar, arrayList, plbVarC, paxVar, z6, z5, false, z4, pdeVar2) == awoxVar) {
            return awoxVar;
        }
        return new pla(awmy.a);
        pky pkyVar = (pky) objB;
        int iAu = a.au(pkyVar);
        if (iAu != 0) {
            if (iAu == 1) {
                return (pku) pkyVar;
            }
            throw new awmj();
        }
        plx plxVar2 = (plx) ((pla) pkyVar).a;
        if (plxVar2 == null) {
            return new pkv(new plu("Account not in storage"), pkx.X);
        }
        plxVar = plxVar2;
        z5 = z7;
        List listB2 = this.b.b(plxVar, i2);
        arrayList = new ArrayList();
        it = listB2.iterator();
        while (it.hasNext()) {
            aiecVar = (aiec) aihn.parseFrom(aiec.a, ((pfj) it.next()).c);
            if (aiecVar != null) {
                arrayList.add(aiecVar);
            }
        }
        this.b.d(plxVar, listB2);
        paxVar = new pax(new Long(j2), new Long(this.e.b()), 3);
        pcyVar = this.d;
        plbVarC = plb.c();
        pdeVar2.h = 2;
        if (pcy.b(pcyVar, plxVar, arrayList, plbVarC, paxVar, z6, z5, false, z4, pdeVar2) == awoxVar) {
            return awoxVar;
        }
        return new pla(awmy.a);
    }
}
