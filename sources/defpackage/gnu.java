package defpackage;

import j$.util.Optional;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class gnu implements adtp {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public /* synthetic */ gnu(hbu hbuVar, int i) {
        this.$cid = i;
        this.a = hbuVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [acjy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8, types: [adtp, java.lang.Object] */
    @Override // defpackage.adtp
    public final void q(acjy acjyVar, acjw acjwVar) {
        almd almdVar;
        int i = this.$cid;
        if (i == 0) {
            if (acjyVar instanceof wfy) {
                List listAo = fhz.ao((wfy) acjyVar);
                Object obj = this.a;
                ((gnf) obj).y(listAo);
                ((gnv) obj).z.addAll(listAo);
                return;
            }
            return;
        }
        if (i == 1) {
            if (acjyVar instanceof wfy) {
                ((gms) this.a).s(fhz.ao((wfy) acjyVar));
                return;
            }
            return;
        }
        int i2 = 2;
        if (i == 2) {
            if (!(acjyVar instanceof wfy) || (almdVar = ((wfy) acjyVar).a) == null) {
                return;
            }
            ((hbu) this.a).h.b(almdVar);
            return;
        }
        if (i == 3) {
            if (acjyVar instanceof wfy) {
                almd almdVar2 = ((wfy) acjyVar).a;
                Object obj2 = this.a;
                agjz agjzVar = new agjz(4);
                agjzVar.j(almdVar2.m);
                agjzVar.j(almdVar2.n);
                ((srp) obj2).a.b(agjzVar.g());
                return;
            }
            return;
        }
        vrx vrxVar = (vrx) this.a;
        Optional optionalOf = Optional.of(new gnu(vrxVar.k, i2));
        sda sdaVar = new sda(acjyVar, acjwVar, 16, null);
        optionalOf.isPresent();
        optionalOf.get().q(sdaVar.b, (acjw) sdaVar.a);
        if (acjyVar instanceof wfy) {
            almd almdVar3 = ((wfy) acjyVar).a;
            vxe vxeVar = vrxVar.g;
            agjz agjzVar2 = new agjz(4);
            agjzVar2.j(almdVar3.m);
            agjzVar2.j(almdVar3.n);
            vxeVar.b(agjzVar2.g());
            return;
        }
        if (acjyVar instanceof wru) {
            wru wruVar = (wru) acjyVar;
            if (((vxz) vrxVar.f.io()).l(29, 45768258L, false)) {
                aoll aollVar = wruVar.a;
                if ((aollVar.b & 8) != 0) {
                    vxe vxeVar2 = vrxVar.g;
                    ajwo ajwoVar = aollVar.f;
                    if (ajwoVar == null) {
                        ajwoVar = ajwo.a;
                    }
                    vxeVar2.a(ajwoVar);
                }
            }
        }
    }

    public gnu(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
