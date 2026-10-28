package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.libraries.notifications.platform.internal.room.GnpPerAccountRoomDatabase;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gmc extends awpk implements awqk {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmc(aczl aczlVar, aier aierVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = aczlVar;
        this.c = aierVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r6v33, types: [awqg, java.lang.Object] */
    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        switch (this.$cid) {
            case 0:
                return new gmc((gmj) this.b, (zwa) this.c, awoqVar, 0);
            case 1:
                return new gmc((dlq) this.c, (Uri) this.b, awoqVar, 1);
            case 2:
                return new gmc((gmj) this.b, (zwa) this.c, awoqVar, 2, (byte[]) null);
            case 3:
                return new gmc((gmj) this.b, (zwa) this.c, awoqVar, 3, (char[]) null);
            case 4:
                return new gmc((gmj) this.b, (zwa) this.c, awoqVar, 4, (short[]) null);
            case 5:
                return new gmc((gvc) this.b, (wpw) this.c, awoqVar, 5);
            case 6:
                return new gmc((kwq) this.b, (String) this.c, awoqVar, 6);
            case 7:
                return new gmc((iky) this.b, (String) this.c, awoqVar, 7);
            case 8:
                return new gmc((Bundle) this.b, (ozy) this.c, awoqVar, 8);
            case 9:
                return new gmc((paa) this.c, (Bundle) this.b, awoqVar, 9);
            case 10:
                return new gmc((pao) this.c, (Intent) this.b, awoqVar, 10);
            case 11:
                return new gmc((pbz) this.c, (Bundle) this.b, awoqVar, 11);
            case 12:
                return new gmc((pdc) this.c, (Bundle) this.b, awoqVar, 12);
            case 13:
                return new gmc((pdl) this.c, (Bundle) this.b, awoqVar, 13);
            case 14:
                return new gmc((aczl) this.b, (aier) this.c, awoqVar, 14);
            case 15:
                return new gmc((pep) this.b, (plx) this.c, awoqVar, 15);
            case 16:
                return new gmc((pep) this.b, (plx) this.c, awoqVar, 16, (byte[]) null);
            case 17:
                return new gmc((pff) this.c, (Bundle) this.b, awoqVar, 17);
            case 18:
                return new gmc((pnt) this.c, (pnp) this.b, awoqVar, 18);
            case 19:
                return new gmc((ppv) this.b, (String) this.c, awoqVar, 19);
            default:
                return new gmc((GnpPerAccountRoomDatabase) this.b, (awqg) this.c, awoqVar, 20);
        }
    }

    @Override // defpackage.awqk
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.$cid) {
            case 0:
                return ((gmc) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 1:
                return ((gmc) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 2:
                return ((gmc) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 3:
                return ((gmc) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 4:
                return ((gmc) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 5:
                return ((gmc) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 6:
                return ((gmc) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 7:
                return ((gmc) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 8:
                return ((gmc) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 9:
                return ((gmc) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 10:
                return ((gmc) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 11:
                return ((gmc) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 12:
                return ((gmc) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 13:
                return ((gmc) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 14:
                return ((gmc) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 15:
                return ((gmc) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 16:
                return ((gmc) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 17:
                return ((gmc) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 18:
                return ((gmc) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 19:
                return ((gmc) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            default:
                return ((gmc) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:129:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:132:0x02da  */
    /* JADX WARN: Code duplicated, block: B:134:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:139:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:142:0x0308  */
    /* JADX WARN: Code duplicated, block: B:144:0x030d  */
    /* JADX WARN: Code duplicated, block: B:147:0x0312  */
    /* JADX WARN: Code duplicated, block: B:260:0x02e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:261:0x030b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:262:0x0306 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:0x030e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:265:0x02f1 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r0v44, types: [axaf] */
    /* JADX WARN: Type inference failed for: r0v71, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r15v124, types: [java.lang.Object, pqp] */
    /* JADX WARN: Type inference failed for: r15v16, types: [gmj] */
    /* JADX WARN: Type inference failed for: r15v22, types: [gmj] */
    /* JADX WARN: Type inference failed for: r15v28, types: [gmj] */
    /* JADX WARN: Type inference failed for: r15v5, types: [gmj] */
    /* JADX WARN: Type inference failed for: r1v22, types: [awpl] */
    /* JADX WARN: Type inference failed for: r3v18, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, zwh] */
    /* JADX WARN: Type inference failed for: r4v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r5v7, types: [awut, java.lang.Object] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v32 java.lang.Object, still in use, count: 2, list:
          (r1v32 java.lang.Object) from 0x02b0: PHI (r1 I:??) = (r1v25 java.lang.Object), (r1v32 java.lang.Object) binds: [B:126:0x02af, B:256:0x02b0] A[DONT_GENERATE, DONT_INLINE]
          (r1v32 java.lang.Object) from 0x02a2: CHECK_CAST (phb) (r1v32 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // defpackage.awpe
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 1582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gmc.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmc(Bundle bundle, ozy ozyVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = bundle;
        this.c = ozyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmc(GnpPerAccountRoomDatabase gnpPerAccountRoomDatabase, awqg awqgVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = gnpPerAccountRoomDatabase;
        this.c = awqgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmc(dlq dlqVar, Uri uri, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = dlqVar;
        this.b = uri;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmc(gmj gmjVar, zwa zwaVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = gmjVar;
        this.c = zwaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmc(gmj gmjVar, zwa zwaVar, awoq awoqVar, int i, byte[] bArr) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = gmjVar;
        this.c = zwaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmc(gmj gmjVar, zwa zwaVar, awoq awoqVar, int i, char[] cArr) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = gmjVar;
        this.c = zwaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmc(gmj gmjVar, zwa zwaVar, awoq awoqVar, int i, short[] sArr) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = gmjVar;
        this.c = zwaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmc(gvc gvcVar, wpw wpwVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = gvcVar;
        this.c = wpwVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmc(iky ikyVar, String str, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = ikyVar;
        this.c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmc(kwq kwqVar, String str, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = kwqVar;
        this.c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmc(paa paaVar, Bundle bundle, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = paaVar;
        this.b = bundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmc(pao paoVar, Intent intent, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = paoVar;
        this.b = intent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmc(pbz pbzVar, Bundle bundle, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = pbzVar;
        this.b = bundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmc(pdc pdcVar, Bundle bundle, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = pdcVar;
        this.b = bundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmc(pdl pdlVar, Bundle bundle, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = pdlVar;
        this.b = bundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmc(pep pepVar, plx plxVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = pepVar;
        this.c = plxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmc(pep pepVar, plx plxVar, awoq awoqVar, int i, byte[] bArr) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = pepVar;
        this.c = plxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmc(pff pffVar, Bundle bundle, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = pffVar;
        this.b = bundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmc(pnt pntVar, pnp pnpVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = pntVar;
        this.b = pnpVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmc(ppv ppvVar, String str, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = ppvVar;
        this.c = str;
    }
}
