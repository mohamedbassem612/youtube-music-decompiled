package defpackage;

import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import j$.util.Collection;
import j$.util.Objects;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hvn implements tae {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ hvn(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r6v59, types: [java.lang.Object, zza] */
    /* JADX WARN: Type inference failed for: r6v60, types: [java.lang.Object, zza] */
    /* JADX WARN: Type inference failed for: r6v61, types: [java.lang.Object, sxu] */
    /* JADX WARN: Type inference failed for: r6v62, types: [java.lang.Object, sxu] */
    @Override // defpackage.tae, defpackage.twi
    public final void a(Object obj) {
        String str;
        int i = 10;
        switch (this.$cid) {
            case 0:
                ailw ailwVar = (ailw) obj;
                if (!ailwVar.d) {
                    hvo hvoVar = (hvo) this.a;
                    hvoVar.f();
                    aihf aihfVarCreateBuilder = ailg.a.createBuilder();
                    String strO = hvoVar.b.o();
                    aihf builder = ailwVar.toBuilder();
                    builder.copyOnWrite();
                    ailw ailwVar2 = (ailw) builder.instance;
                    ailwVar2.b |= 2;
                    ailwVar2.d = true;
                    aihfVarCreateBuilder.av(strO, (ailw) builder.build());
                    taf.j(hvoVar.c.B((ailg) aihfVarCreateBuilder.build()), new hou(7));
                }
                break;
            case 1:
                Collection.EL.stream((List) obj).filter(new gqk(i)).map(new bwa(20)).forEach(new gmk(this.a, 14));
                break;
            case 2:
                ((abvk) ((hwm) this.a).b.io()).J(((Float) obj).floatValue());
                break;
            case 3:
                ((abvk) ((hwm) this.a).b.io()).J(((Float) obj).floatValue());
                break;
            case 4:
                ((abvk) this.a).an(((Boolean) obj).booleanValue());
                break;
            case 5:
                wgi wgiVar = (wgi) obj;
                if (wgiVar != null) {
                    Object obj2 = this.a;
                    amae amaeVar = wgiVar.a;
                    aouj aoujVarAb = fhz.ab(amaeVar);
                    if (aoujVarAb != null && !aoujVarAb.g.isEmpty()) {
                        aoun aounVar = ((aoui) aoujVarAb.g.get(0)).c;
                        if (aounVar == null) {
                            aounVar = aoun.a;
                        }
                        aounVar.getClass();
                        ico icoVar = (ico) ((hxa) obj2).b.io();
                        hyz hyzVar = (hyz) icoVar.c.k(icoVar.l.q());
                        if (hyzVar != null && Objects.equals(hyzVar.t(), aounVar.n) && (hyzVar instanceof hzf)) {
                            ((hzf) hyzVar).u(aounVar);
                            icoVar.j.kk(new hze(hzd.a, hyzVar));
                            icoVar.f.o(hyzVar);
                        }
                    }
                    if ((amaeVar.b & 262144) != 0) {
                        vxe vxeVar = ((hxa) obj2).c;
                        ajwo ajwoVar = amaeVar.w;
                        if (ajwoVar == null) {
                            ajwoVar = ajwo.a;
                        }
                        vxeVar.a(ajwoVar);
                    }
                    ((vor) ((hxa) obj2).d.io()).q(wgiVar);
                }
                break;
            case 6:
                ((hyc) this.a).r(((Boolean) obj).booleanValue());
                break;
            case 7:
                aost aostVar = (aost) obj;
                Object obj3 = this.a;
                if (aostVar == aost.ALL) {
                    ijg ijgVar = (ijg) obj3;
                    ijgVar.d(ijgVar.e, R.string.already_saved_to_playlist).show();
                } else if (aostVar != aost.SOME) {
                    ijg ijgVar2 = (ijg) obj3;
                    vxe vxeVar2 = ijgVar2.a;
                    ajwo ajwoVar2 = ijgVar2.e.h;
                    if (ajwoVar2 == null) {
                        ajwoVar2 = ajwo.a;
                    }
                    vxeVar2.c(ajwoVar2, null);
                } else {
                    ijg ijgVar3 = (ijg) obj3;
                    ijgVar3.d(ijgVar3.e, R.string.already_saved_some_tracks_to_playlist).show();
                }
                break;
            case 8:
                alvy alvyVar = (alvy) obj;
                ijl ijlVar = (ijl) this.a;
                ijlVar.V(alvyVar);
                if ((alvyVar.b & SemanticState.Modal) != 0 && (str = ijlVar.aC) != null) {
                    ijlVar.d.c(new wsp(str, alvyVar));
                    break;
                }
                break;
            case 9:
                ijt ijtVar = (ijt) obj;
                if (ijtVar != null) {
                    ((ikn) this.a).b.e(new gob(ijtVar, 6));
                }
                break;
            case 10:
                iop iopVar = (iop) this.a;
                wtt wttVar = (wtt) obj;
                wttVar.b = iopVar.o.l(229, 45775088L, false);
                wttVar.getClass();
                iopVar.e.b().e(wttVar);
                if (!wttVar.equals(iopVar.k)) {
                    iopVar.k = wttVar;
                    iopVar.p.y();
                    iopVar.b();
                }
                break;
            case 11:
                wtr wtrVar = (wtr) obj;
                Object obj4 = this.a;
                iop iopVar2 = (iop) obj4;
                taf.i(wtrVar.c(wtrVar.a(iopVar2.m)), iopVar2.g, new ihw(5), new hvn(obj4, i), null);
                break;
            case 12:
                aild aildVar = (aild) obj;
                int i2 = aildVar.c;
                if (i2 >= 10) {
                    agrx agrxVar = agso.a;
                    int i3 = aildVar.c;
                } else {
                    ((iox) this.a).c(i2);
                }
                break;
            case 13:
                ipk ipkVar = (ipk) this.a;
                ipkVar.d.d(false);
                ipkVar.x.c();
                break;
            case 14:
                iqn.e((iqn) this.a, (ailu) obj);
                break;
            case 15:
                iqn.e((iqn) this.a, (ailu) obj);
                break;
            case 16:
                ((itd) this.a).f.ai(8, true != ((Boolean) obj).booleanValue() ? 3 : 2);
                break;
            case 17:
                agrf agrfVar = itj.a;
                this.a.a(new iti((apoq) obj, 0));
                break;
            case 18:
                acjy acjyVar = (acjy) obj;
                agrf agrfVar2 = itq.a;
                if (acjyVar != null) {
                    this.a.a(acjyVar);
                }
                break;
            case 19:
                this.a.b(null, (gnq) obj);
                break;
            default:
                this.a.b(null, (gnq) obj);
                break;
        }
    }
}
