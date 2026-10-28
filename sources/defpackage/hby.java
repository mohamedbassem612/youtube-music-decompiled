package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import j$.util.Optional;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hby implements avnn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ hby(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r6v29, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v49, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v50, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v57, types: [java.lang.Object, wbz] */
    @Override // defpackage.avnn
    public final Object a(Object obj) {
        int i = 0;
        switch (this.$cid) {
            case 0:
                return Boolean.valueOf(((vob) obj).G(((Context) this.a).getResources().getConfiguration().orientation));
            case 1:
                Rect rect = (Rect) obj;
                return Integer.valueOf(vpo.d(((hbv) this.a).a) ? -rect.width() : rect.width());
            case 2:
                return ((avnc) obj).d(how.b.toMillis(), TimeUnit.MILLISECONDS, (avmb) ((how) this.a).f.io()).x(new hgu(4));
            case 3:
                return ((iwm) this.a).a((Bitmap) obj);
            case 4:
                return tzk.c(((ibn) this.a).f.b()).x(Boolean.FALSE).u(new ibj((aayw) obj, i));
            case 5:
                obj.getClass();
                return this.a.invoke(obj);
            case 6:
                return ((iwm) this.a).a((Bitmap) obj);
            case 7:
                avmb avmbVar = awlg.a;
                return new awir(((mcm) this.a).a);
            case 8:
                avmb avmbVar2 = awlg.a;
                return new awir(((mcm) this.a).b);
            case 9:
                ahey aheyVar = ((mcm) this.a).a;
                mbr mbrVar = new mbr(new mbz(new ahfg(aheyVar), aheyVar), aheyVar);
                avmb avmbVar3 = awlg.a;
                return new awir(mbrVar);
            case 10:
                avmb avmbVar4 = awlg.a;
                return new awir(((mcm) this.a).b);
            case 11:
                return Boolean.valueOf(((tdw) obj).ordinal() >= ((tdw) this.a).ordinal());
            case 12:
                obj.getClass();
                return this.a.invoke(obj);
            case 13:
                obj.getClass();
                return this.a.invoke(obj);
            case 14:
                return avlm.p(new tsn(this.a, (Long) obj, 2, null));
            case 15:
                if (((Boolean) obj).booleanValue()) {
                    return this.a;
                }
                avlh avlhVar = avtj.b;
                avnn avnnVar = atqp.j;
                return avlhVar;
            case 16:
                if (((vpd) obj) != vpd.a) {
                    return this.a;
                }
                avlh avlhVar2 = avtj.b;
                avnn avnnVar2 = atqp.j;
                return avlhVar2;
            case 17:
                Optional optional = (Optional) obj;
                if (optional.isEmpty() || ((akuj) optional.get()).z.isEmpty()) {
                    return avlr.J(Optional.empty());
                }
                abxv abxvVar = (abxv) this.a;
                return abxvVar.d.b(abxvVar.b.e()).j(((akuj) optional.get()).z, true).K(new uxe(10));
            case 18:
                return Boolean.valueOf(((vxz) this.a).l(25, 45418217L, false) ? ((Boolean) obj).booleanValue() : true);
            case 19:
                agkz agkzVar = (agkz) obj;
                return (!((vxz) this.a).l(25, 45418217L, false) && agkzVar.size() == 1 && agkzVar.contains(akua.ENGAGEMENT_PANEL_SNAP_STATE_BELOW_THE_PLAYER)) ? agpr.a : agkzVar;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Object obj2 = this.a;
                return zBooleanValue ? ((vuk) obj2).o.H(new uxe(11)) : ((vuk) obj2).p.H(new tfk(16));
        }
    }
}
