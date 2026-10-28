package defpackage;

import j$.util.Objects;
import j$.util.Optional;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ssi implements vxc {
    private final /* synthetic */ int $cid;
    private final Object a;
    private final Object b;

    public ssi(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }

    @Override // defpackage.vxc
    public final void a(ajwo ajwoVar) {
        throw null;
    }

    @Override // defpackage.vxc
    public final /* synthetic */ boolean b() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0227  */
    /* JADX WARN: Code duplicated, block: B:105:0x022d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0233  */
    /* JADX WARN: Code duplicated, block: B:108:0x023a  */
    /* JADX WARN: Code duplicated, block: B:116:0x0224 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0203  */
    /* JADX WARN: Code duplicated, block: B:98:0x0217  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, xgn] */
    @Override // defpackage.vxc
    public final /* synthetic */ void c(ajwo ajwoVar, Map map) {
        Iterator it;
        cc ccVarJ;
        akuj akujVarU;
        int i = this.$cid;
        sst sstVarA = null;
        objPeer = null;
        Object objPeer = null;
        sstVarA = null;
        sstVarA = null;
        if (i == 0) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(apxy.b);
            ajwoVar.c(aihlVarCheckIsLite);
            ahno.G(ajwoVar.j.n(aihlVarCheckIsLite.d), "ShowImageEditorCommandResolver receives an unknown command.");
            Object obj = this.a;
            if (obj != null) {
                cf cfVar = (cf) obj;
                if (!cfVar.isDestroyed() && !cfVar.isFinishing()) {
                    if (obj instanceof sss) {
                        sstVarA = ((sss) obj).a();
                    } else if (obj instanceof afnb) {
                        afnb afnbVar = (afnb) obj;
                        if (afnbVar.peer() instanceof sss) {
                            sstVarA = ((sss) afnbVar.peer()).a();
                        } else {
                            it = cfVar.getSupportFragmentManager().k().iterator();
                            do {
                                if (it.hasNext()) {
                                    ccVarJ = 0;
                                    break;
                                }
                                ccVarJ = nsj.j((cc) it.next(), sst.class);
                            } while (ccVarJ == 0);
                            if (ccVarJ != 0) {
                                if (!sst.class.isInstance(ccVarJ)) {
                                    objPeer = ccVarJ;
                                } else if (nsj.l(ccVarJ, sst.class)) {
                                    objPeer = ((afnb) ccVarJ).peer();
                                }
                            }
                            sstVarA = (sst) objPeer;
                        }
                    } else {
                        it = cfVar.getSupportFragmentManager().k().iterator();
                        do {
                            if (it.hasNext()) {
                                ccVarJ = 0;
                                break;
                            }
                            ccVarJ = nsj.j((cc) it.next(), sst.class);
                        } while (ccVarJ == 0);
                        if (ccVarJ != 0) {
                            if (!sst.class.isInstance(ccVarJ)) {
                                objPeer = ccVarJ;
                            } else if (nsj.l(ccVarJ, sst.class)) {
                                objPeer = ((afnb) ccVarJ).peer();
                            }
                        }
                        sstVarA = (sst) objPeer;
                    }
                }
            }
            ?? r7 = ((roq) this.b).a;
            Optional optionalOfNullable = Optional.ofNullable(sstVarA);
            roq.j(r7, ajwoVar, Optional.empty(), Optional.empty());
            if (true == optionalOfNullable.isPresent()) {
                ((sst) optionalOfNullable.get()).a();
                return;
            }
            return;
        }
        if (i == 1) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apzp.a);
            ajwoVar.c(aihlVarCheckIsLite2);
            if (ajwoVar.j.n(aihlVarCheckIsLite2.d)) {
                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(apzp.a);
                ajwoVar.c(aihlVarCheckIsLite3);
                Object objK = ajwoVar.j.k(aihlVarCheckIsLite3.d);
                apzo apzoVar = (apzo) (objK == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK));
                if ((apzoVar.b & 4) != 0) {
                    ajwo ajwoVar2 = apzoVar.c;
                    if (ajwoVar2 == null) {
                        ajwoVar2 = ajwo.a;
                    }
                    rmp.w(ajwoVar2).getClass();
                    ((rnj) this.a).b();
                }
                ((rql) this.b).b.j(true, false);
                return;
            }
            return;
        }
        if (i != 2) {
            aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aklz.b);
            ajwoVar.c(aihlVarCheckIsLite4);
            Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite4.d);
            aklz aklzVar = (aklz) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2));
            int i2 = aklzVar.c & 1;
            Object obj2 = this.b;
            if (i2 != 0) {
                String str = aklzVar.d;
                taq.d();
                abfv abfvVar = (abfv) obj2;
                if (((vxz) abfvVar.a).l(295, 45774883L, false)) {
                    agke agkeVarN = agke.n(((agge) abfvVar.b).c(str));
                    int size = agkeVarN.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        ((acwn) agkeVarN.get(i3)).a();
                    }
                } else {
                    Iterator it2 = ((agge) abfvVar.b).c(str).iterator();
                    while (it2.hasNext()) {
                        ((acwn) it2.next()).a();
                    }
                }
            } else {
                ((abfv) obj2).n();
            }
            if ((aklzVar.c & 2) != 0) {
                ?? r8 = this.a;
                ajwo ajwoVar3 = aklzVar.e;
                if (ajwoVar3 == null) {
                    ajwoVar3 = ajwo.a;
                }
                r8.a(ajwoVar3);
                return;
            }
            return;
        }
        aihl aihlVarCheckIsLite5 = aihn.checkIsLite(aqzk.b);
        ajwoVar.c(aihlVarCheckIsLite5);
        Object objK3 = ajwoVar.j.k(aihlVarCheckIsLite5.d);
        Object objC = objK3 == null ? aihlVarCheckIsLite5.b : aihlVarCheckIsLite5.c(objK3);
        Object obj3 = this.a;
        aqzk aqzkVar = (aqzk) objC;
        akud akudVar = aqzkVar.d;
        if (akudVar == null) {
            akudVar = akud.a;
        }
        akuc akucVarA = akuc.a(akudVar.c);
        if (akucVarA == null) {
            akucVarA = akuc.ENGAGEMENT_PANEL_SURFACE_UNKNOWN;
        }
        vor vorVarB = ((hed) obj3).b(akucVarA);
        String strAc = tzk.ac(aqzkVar);
        String strY = tzk.Y(aqzkVar);
        if (ahno.aa(strAc) || ahno.aa(strY) || !Objects.equals(strAc, vorVarB.k())) {
            return;
        }
        vob vobVarC = vorVarB.c(strAc);
        boolean z = aqzkVar.g;
        if (vobVarC != null) {
            if (z || !vobVarC.J(strY, ajwoVar)) {
                if ((aqzkVar.c & 4) != 0) {
                    Object obj4 = this.b;
                    aihl aihlVarCheckIsLite6 = aihn.checkIsLite(aqzk.b);
                    ajwoVar.c(aihlVarCheckIsLite6);
                    if (ajwoVar.j.n(aihlVarCheckIsLite6.d)) {
                        xdi xdiVar = (xdi) obj4;
                        ((vwt) xdiVar.e).D(new tsn(obj4, avlr.j(((hed) xdiVar.i).a(), avlr.J(ajwoVar), new jnx(7)).K(new uxe(9)).an(Optional.empty()), 8, null));
                        return;
                    }
                    return;
                }
                vob vobVarC2 = vorVarB.c(strY);
                if (vobVarC2 == null || (akujVarU = vobVarC2.u()) == null) {
                    return;
                }
                if (z) {
                    vobVarC.z(akujVarU, ajwoVar);
                } else {
                    vobVarC.M(akujVarU, ajwoVar);
                }
            }
        }
    }

    public ssi(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }
}
